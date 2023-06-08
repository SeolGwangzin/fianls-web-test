package com.mvc.character.model.dao;

import com.mvc.character.model.dto.CharacterDTO;

import java.util.List;

public interface CharacterDAO {

    List<CharacterDTO> selectAllCharacterList();
    CharacterDTO selectCharacterById(String character);
    String selectNewChaCode();
    int insertCharacter(CharacterDTO character);

    int updateCharacter(CharacterDTO character);

    int deleteCharacter(String character);
}

