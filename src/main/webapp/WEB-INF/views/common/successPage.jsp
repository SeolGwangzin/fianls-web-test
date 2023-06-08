<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <script>
    (function() {
      const successCode = '${ requestScope.successCode }';

      let successMessage = '';
      let movePath = '';

      switch(successCode) {
        case 'insertCha' :
          successMessage = '신규 캐릭터 등록 성공!';
          movePath = '${pageContext.servletContext.contextPath}/character/list';
          break;
        case 'updateCha' :
          successMessage = '캐릭터 정보 수정 성공!';
          movePath = '${pageContext.servletContext.contextPath}/character/list';
          break;
        case 'deleteCha' :
          successMessage = '캐릭터 정보 삭제 성공!';
          movePath = '${pageContext.servletContext.contextPath}/character/list';
          break;
      }

      alert(successMessage);
      location.href = movePath;

    })();
  </script>
</body>
</html>
