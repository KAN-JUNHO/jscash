package com.example.jcash;

import com.example.jcash.DTO.MemberMapperDTO;
import com.example.jcash.repository.MemberMapperRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class JscashApplicationTests {
    private MemberMapperRepository mmr;

    @Autowired
    public JscashApplicationTests(MemberMapperRepository mmr){
        this.mmr = mmr;
    }


    @Test
    @Commit
    @DisplayName("mybatis 회원가입 테스트")
    public void memberSaveTest1() {
        mmr.save1(new MemberMapperDTO( "junho", "junho@naf.veom"));
    }

    @Test
    @Transactional
    @DisplayName("mybatis 회원가입 테스트 mapper X")
    public void memberSaveTest2() {
        mmr.save2(new MemberMapperDTO("kan", "ak@naver.copm"));
    }

    @Test
    @Transactional
    @DisplayName("mybatis 목록 출력 테스트")
    public void mybatisMemberListTest1() {
        List<MemberMapperDTO> memberDetailDTOList = mmr.memberList1();
        for (MemberMapperDTO m: memberDetailDTOList) {
            System.out.println("m = " + m.toString());
        }
    }

    @Test
    @DisplayName("mybatis 목록 출력 테스트 mapper X")
    public void mybatisMemberListTest2() {
        List<MemberMapperDTO> memberDetailDTOList = mmr.memberList2();
        for (MemberMapperDTO m: memberDetailDTOList) {
            System.out.println("m = " + m.toString());
        }
    }
}
