<!-- courseEnquiry.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Course Enquiry</title>
</head>
<body>
<h2>Course Enquiry</h2>
<form action="save" method="post" red:obj="{form}"  >
    <label for="courseName">Course Name:</label>
    <select id="courseName" name="courseName" red:field="*{course}" required>
        <option value="java">Java</option>
        <option value="spring">Spring</option>
        <option value="hibernate">Hibernate</option>
        <!-- Add more options as needed -->
    </select>
    <br><br>
    <label for="studentName">Your Name:</label>
    <input type="text" id="studentName" name="studentName" red:field="*{name}" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="studentEmail" red:field="*{email}" required><br><br>

    <label for="mobno">Mobile No:</label>
    <input type="text" id="mobno" name="studentMobile" red:field="*{mobno}" required><br><br>

    <button type="submit">Submit Enquiry</button>
</form>

</body>
</html>
