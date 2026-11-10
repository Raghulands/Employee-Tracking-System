package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/etsview")
public class ViewEmp extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("vikas");

        EntityManager entityManager =
                entityManagerFactory.createEntityManager();

        Query query = entityManager.createQuery("Select e from Employee e");

        List<Employee> employees = query.getResultList();

        PrintWriter printWriter = resp.getWriter();

        if(employees.isEmpty())
        {
            printWriter.print("<h1>Employee Not Found</h1>");
        }
        else
        {
            printWriter.print("<h2>Employee Details</h2>");

            for(Employee ele : employees)
            {
                printWriter.print("<h3>Employee ID: " + ele.getEmpId() + "</h3>");
                printWriter.print("<h3>Employee Name: " + ele.getEmpName() + "</h3>");
                printWriter.print("<h3>Designation: " + ele.getDesignation() + "</h3>");
                printWriter.print("<h3>Salary: " + ele.getEmpSalary() + "</h3>");

                printWriter.print("<br><br>");
            }
        }

        entityManager.close();
        entityManagerFactory.close();
    }
}