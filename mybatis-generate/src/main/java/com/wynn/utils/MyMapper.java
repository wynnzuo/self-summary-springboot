package com.wynn.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: wynnzuo
 * @date: 2019/11/20 12:37
 * @description:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
