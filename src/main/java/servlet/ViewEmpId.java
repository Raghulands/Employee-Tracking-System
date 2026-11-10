package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/etsviewid")
public class ViewEmpId extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        int id = Integer.parseInt(req.getParameter("id"));

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("vikas");

        EntityManager entityManager =
                entityManagerFactory.createEntityManager();

        Employee employee = entityManager.find(Employee.class, id);

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        if(employee != null)
        {
            printWriter.print("<h2>Employee Details</h2>");
            printWriter.print("Employee ID: " + employee.getEmpId() + "<br>");
            printWriter.print("Employee Name: " + employee.getEmpName() + "<br>");
            printWriter.print("Designation: " + employee.getDesignation() + "<br>");
            printWriter.print("Salary: " + employee.getEmpSalary());
        }
        else
        {
            printWriter.print("<h1>Employee Not Found</h1>");
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}