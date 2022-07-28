package com.yicj.mybatis.repo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Collection;

public interface EasyBaseMapper<T> extends BaseMapper<T> {

    /**
     * 批量插入 仅使用于mysql
     * @param list 实体列表
     * @return 影响记录条数
     */
    Integer insertBatchSomeColumn(Collection<T> list) ;
}
