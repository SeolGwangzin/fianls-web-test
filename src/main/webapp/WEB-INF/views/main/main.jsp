<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>
    <h3>CHARACTER 테이블에서 CHARACTER_CODE를 이용하여 캐릭터 정보 조회</h3>
    <form action="/character/select">
        <label>조회할 코드 : </label>
        <input type="text" name="characterCode" id="characterCode">
        <button type="submit">조회하기</button>
    </form>
    <br>

    <h3>CHARACTER 테이블에서 캐릭터 전체 정보 조회 </h3>
    <button onclick="location.href='${pageContext.servletContext.contextPath}/character/list'">캐릭터정보 전체 조회하기</button>
    <br><br>

    <h3>CHARACTER 테이블에서 신규 캐릭터 정보 추가 </h3>
    <form action="${ pageContext.servletContext.contextPath }/character/insert" method="post">
        캐릭터명 : <input type="text" name="characterName"><br>
        나이 : <input type="text" name="ageInfo"><br>
        키(cm) : <input type="text" name="statureInfo"><br>
        직업 : <input type="text" name="jobInfo"><br>
        포지션 :
        <select name="positionCode">
            <option value="1">주인공</option>
            <option value="2">히로인</option>
            <option value="3">일반동료</option>
            <option value="4">배신자</option>
            <option value="5">라이벌</option>
            <option value="6">적</option>

        </select>
        <br>
        성별 :
        <select name="genderStatus">
            <option value="W">W</option>
            <option value="M">M</option>
        </select>
        <br>
        <button type="submit">등록하기</button>
    </form>
    <br><br>

    <h3>CHARACTER 테이블에서 캐릭터 정보 수정 </h3>
    <form action="${ pageContext.servletContext.contextPath }/character/update" method="post">
        사번 : <input type="text" name="characterCode"><br>
        나이 : <input type="text" name="ageInfo"><br>
        키(cm) : <input type="text" name="statureInfo"><br>
        직업 : <input type="text" name="jobInfo"><br>
        포지션 :
        <select name="positionCode">
            <option value="1">주인공</option>
            <option value="2">히로인</option>
            <option value="3">일반동료</option>
            <option value="4">배신자</option>
            <option value="5">라이벌</option>
            <option value="6">적</option>

        </select>
        <br>
        성별 :
        <select name="genderStatus">
            <option value="W">W</option>
            <option value="M">M</option>
        </select>
        <br>
        <button type="submit">정보변경</button>
    </form>
    <br>

    <h3>CHARACTER 테이블에서 캐릭터 정보 삭제 (캐릭터 코드를 입력 받아 코드와 일치하는 행 삭제) </h3>
    <form action="${ pageContext.servletContext.contextPath }/character/delete" method="post">
        사번 : <input type="text" name="characterCode"><br>
        <button type="submit">캐릭터 정보 삭제</button>
    </form>
</body>
</html>
