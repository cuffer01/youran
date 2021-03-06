package com.youran.generate.pojo.mapper;

import com.youran.common.util.ConvertUtil;
import org.mapstruct.Named;

import java.util.List;

/**
 * 通用类型转换
 *
 * @author: cbb
 * @date: 10/13/2019 20:51
 */
@Named("CommonMapper")
public class CommonMapper {

    @Named("StringToIntegerList")
    public List<Integer> stringToIntegerList(String value) {
        return ConvertUtil.convertIntegerList(value);
    }

}
