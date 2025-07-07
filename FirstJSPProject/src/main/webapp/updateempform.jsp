<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page import="java.sql.*, db.MySQLConnectionITP" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Employee</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css">
</head>
<body>
<%
    int eno = Integer.parseInt(request.getParameter("t1"));
    String ename = "";
    int salary = 0;

    try {
        Connection con = MySQLConnectionITP.getConnection(application);
        String query = "SELECT * FROM emp WHERE eno = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, eno);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            ename = rs.getString("ename");
            salary = rs.getInt("salary");
        }
    } catch (Exception e) {
        out.print(e.getMessage());
    }
%>

<div class="container mt-5">
    <h2>Update Employee</h2>
    <form action="updateemp.jsp" method="post">
        <input type="hidden" name="t1" value="<%=eno%>">
        <div class="mb-3">
            <label class="form-label">Employee Name</label>
            <input type="text" class="form-control" name="t2" value="<%=ename%>" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Employee Salary</label>
            <input type="text" class="form-control" name="t3" value="<%=salary%>" required>
        </div>
        <button type="submit" class="btn btn-primary" name="s1" value="UPDATE">Update</button>
    </form>
</div>

</body>
</html>
