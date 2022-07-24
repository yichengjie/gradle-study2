#### FilterChainProxy的理解
1. 实现了web容器的Filter接口，是容器过滤器链的一个环节
2. 在doFilter方法中放入request.setAttribute(FILTER_APPLIED, Boolean.TRUE)标记
3. 其中doFilter方法finally中执行SecurityContextHolder.clearContext()，request.removeAttribute(FILTER_APPLIED)清理全局数据
4. 其中doFilterInternal为真正的业务逻辑方法
    ```text
    a. 根据request匹配到SecurityFilterChain，并返回其中的Filter集合
    b. 如果返回的Filter集合为空则直接执行chain.doFilter(fwRequest, fwResponse)，访问真正的api
    c. 否则根据Filter集合构建 VirtualFilterChain对象
    d. 执行 VirtualFilterChain#doFilter(fwRequest, fwResponse)方法进行过滤处理
    ```
#### FilterChainProxy与SecurityFilterChain的关系
1. FilterChainProxy是真正的Filter，是web过滤器链条中的一个过滤器，需要加入到web容器的过滤器链中
2. FilterChainProxy中包含多个SecurityFilterChain
3. SecurityFilterChain是一个过滤器链，实现类为DefaultSecurityFilterChain
#### VirtualFilterChain与SecurityFilterChain的关系
1. 一个请求匹配到的SecurityFilterChain后，获取过滤器链中的所有过滤器构建VirtualFilterChain对象
2. 调用VirtualFilterChain的doFilter执行spring的过滤器链
