package com.mvc.character.model.service;

import com.mvc.character.model.dao.CharacterDAO;
import com.mvc.character.model.dto.CharacterDTO;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;
import java.util.List;

import static com.mvc.common.Template.getSqlSession;
import static com.mvc.common.jdbc.JDBCTemplate.*;

public class CharacterService {

    private CharacterDAO chaDAO;

    public CharacterDTO selectOneChaById(String chaId) {

        SqlSession sqlSession = getSqlSession();
        chaDAO = sqlSession.getMapper(CharacterDAO.class);
        CharacterDTO characterDTO = chaDAO.selectCharacterById(chaId);

        sqlSession.close();

        return characterDTO;
    }

    /* 직원 정보 전체 조회용 메소드 */
    public List<CharacterDTO> selectAllCharacter() {

        SqlSession sqlSession = getSqlSession();
        chaDAO = sqlSession.getMapper(CharacterDAO.class);

        List<CharacterDTO> allProductList = chaDAO.selectAllCharacterList();

        sqlSession.close();

        return allProductList;
    }

    public String selectNewChaCode() {

        SqlSession sqlSession = getSqlSession();
        chaDAO = sqlSession.getMapper(CharacterDAO.class);

        /* 비지니스 로직 */
        /* 1. dao 호출하여 조회 */
        String character  = chaDAO.selectNewChaCode();

        /* Connection 닫기 */
        sqlSession.close();

        /* 수행 결과 반환 */
        return character;
    }

    /* 신규 사원 등록용 메소드 */
    public int insertCharacter(CharacterDTO cha) {

        SqlSession sqlSession = getSqlSession();
        chaDAO = sqlSession.getMapper(CharacterDAO.class);

        int result = chaDAO.insertCharacter(cha);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int updateCharacter(CharacterDTO cha) {

        SqlSession sqlSession = getSqlSession();
        chaDAO = sqlSession.getMapper(CharacterDAO.class);

        int result = chaDAO.updateCharacter(cha);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int deleteCharacter(String chacode) {

        SqlSession sqlSession = getSqlSession();
        chaDAO = sqlSession.getMapper(CharacterDAO.class);

        int result = chaDAO.deleteCharacter(chacode);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

}



