

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateempServlet
 */
@WebServlet("/updatetempServlet")
public class UpdateempServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateempServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int eno = Integer.parseInt(request.getParameter("t1"));
            String ename = request.getParameter("t2");
            int salary = Integer.parseInt(request.getParameter("t3"));

            ServletContext context=getServletContext();
            Connection con = MySQLConnectionITP.getConnection(context);
            
            String query = "UPDATE emp SET ename = ?, salary = ? WHERE eno = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, ename);
            ps.setInt(2, salary);
            ps.setInt(3, eno);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                RequestDispatcher rd = request.getRequestDispatcher("showAllEmployees");
                rd.forward(request, response);
            } else {
                out.print("Record Not Updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.print("Error updating employee.");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Optional: redirect to form
        response.sendRedirect("updateemp.html");
    }
}

