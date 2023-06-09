<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="../common/header.jsp"/>

    캐릭터번호 : ${ requestScope.selectedCha.characterCode }<br>
    캐릭터명 : ${ requestScope.selectedCha.characterName }<br>
    나이 : ${ requestScope.selectedCha.ageInfo }<br>
    키(cm) : ${ requestScope.selectedCha.statureInfo }<br>
    직업 : ${ requestScope.selectedCha.jobInfo }<br>
    포지션 : ${ requestScope.selectedCha.positionCode }<br>
    성별 : ${ requestScope.selectedCha.genderStatus }<br>
</body>
</html>
