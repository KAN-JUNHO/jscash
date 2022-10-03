package com.example.jcash.repository;

import com.example.jcash.DTO.MemberMapperDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapperRepository {
    void save1(MemberMapperDTO memberMapperDTO);

    @Insert("insert into user(name, email) values(#{name}, #{email})")
    void save2(MemberMapperDTO memberMapperDTO);

    List<MemberMapperDTO> memberList1();

    @Select("select * from user")
    List<MemberMapperDTO> memberList2();
}
