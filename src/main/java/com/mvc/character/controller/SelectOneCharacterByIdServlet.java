package com.mvc.character.controller;

import com.mvc.character.model.dto.CharacterDTO;
import com.mvc.character.model.service.CharacterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/character/select")
public class SelectOneCharacterByIdServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String chaId = request.getParameter("characterCode");

        System.out.println("chaId : " + chaId);

        CharacterService chaService = new CharacterService();
        CharacterDTO chaDTO = chaService.selectOneChaById(chaId);

        System.out.println("selectedEmp : " + chaDTO);

        String path = "";
        if(chaDTO != null) {
            path = "/WEB-INF/views/character/showCharacterInfo.jsp";
            request.setAttribute("selectedCha", chaDTO);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "캐릭터 정보 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }

}
