package com.jk.mapper.test;

import com.jk.pojo.test.boos;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface testMapper {

    @Select(" select id as id, book_name as bookName, book_number as bookNumber,book_price as bookPrice from boos ")
    List<boos>  getListboos();

}