<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, db.MySQLConnectionITP" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Process Update</title>
</head>
<body>
<%
    int eno = Integer.parseInt(request.getParameter("t1"));
    String ename = request.getParameter("t2");
    int salary = Integer.parseInt(request.getParameter("t3"));

    try {
        Connection con = MySQLConnectionITP.getConnection(application);
        String query = "UPDATE emp SET ename = ?, salary = ? WHERE eno = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, ename);
        ps.setInt(2, salary);
        ps.setInt(3, eno);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            RequestDispatcher rd = request.getRequestDispatcher("/allemp.jsp");
            rd.forward(request, response);
        } else {
            out.print("Record Not Updated");
        }
    } catch (Exception e) {
        out.print(e.getMessage());
    }
%>
</body>
</html>
    