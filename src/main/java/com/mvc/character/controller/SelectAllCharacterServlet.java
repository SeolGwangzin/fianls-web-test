package com.mvc.character.controller;

import com.mvc.character.model.dto.CharacterDTO;
import com.mvc.character.model.service.CharacterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/character/list")
public class SelectAllCharacterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CharacterService chaService = new CharacterService();
        List<CharacterDTO> chaList = chaService.selectAllCharacter();

        for(CharacterDTO cha : chaList) {
            System.out.println("asdkjasfkjahfasfj" + cha +"hgfhggfhgfgh");
        }

        String path = "";
        if(chaList != null) {
            path = "/WEB-INF/views/character/characterList.jsp";
            request.setAttribute("chaList", chaList);
        } else {
            path = "/WEB-INF/common/errorPage.jsp";
            request.setAttribute("message", "직원 목록 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }

}