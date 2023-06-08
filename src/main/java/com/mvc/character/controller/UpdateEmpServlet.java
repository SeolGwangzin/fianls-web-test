package com.mvc.character.controller;

import com.mvc.character.model.dto.CharacterDTO;
import com.mvc.character.model.service.CharacterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/character/update")
public class UpdateEmpServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String characterCode = request.getParameter("characterCode");
        String ageInfo = request.getParameter("ageInfo");
        String statureInfo = request.getParameter("statureInfo");
        String jobInfo = request.getParameter("jobInfo");
        String positionInfo = request.getParameter("positionInfo");
        String genderStatus = request.getParameter("genderStatus");

        CharacterDTO character = new CharacterDTO();
        character.setCharacterCode(characterCode);
        character.setAgeInfo(ageInfo);
        character.setStatureInfo(statureInfo);
        character.setJobInfo(jobInfo);
        character.setPositionInfo(positionInfo);
        character.setGenderStatus(genderStatus);

        int result = new CharacterService().updateCharacter(character);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "updateCha");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "캐릭터 정보 수정 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
