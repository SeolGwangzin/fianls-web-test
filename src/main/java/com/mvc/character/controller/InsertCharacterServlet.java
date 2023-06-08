package com.mvc.character.controller;

import com.mvc.character.model.dto.CharacterDTO;
import com.mvc.character.model.service.CharacterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/character/insert")
public class InsertCharacterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String characterName = request.getParameter("characterName");
        String ageInfo = request.getParameter("ageInfo");
        String statureInfo = request.getParameter("statureInfo");
        String jobInfo = request.getParameter("jobInfo");
        String positionInfo = request.getParameter("positionInfo");
        String genderStatus = request.getParameter("genderStatus");

        CharacterService chaService = new CharacterService();
        String newChaCode = chaService.selectNewChaCode();


        CharacterDTO character = new CharacterDTO();
        if(newChaCode != null) character.setCharacterCode(newChaCode);
        character.setCharacterName(characterName);
        character.setAgeInfo(ageInfo);
        character.setStatureInfo(statureInfo);
        character.setJobInfo(jobInfo);
        character.setPositionInfo(positionInfo);
        character.setGenderStatus(genderStatus);

        System.out.println("insert request character : " + newChaCode );

        int result = chaService.insertCharacter(character);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
			request.setAttribute("message", "신규 직원 등록에 성공하셨습니다.");
            request.setAttribute("successCode", "insertCha");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "신규 직원 등록에 실패하셨습니다.");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}