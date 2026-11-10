package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/etssave")

public class SaveEmp extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String designation = req.getParameter("designation");
        double salary = Double.parseDouble(req.getParameter("salary"));

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("vikas");

        EntityManager entityManager =
                entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction =
                entityManager.getTransaction();

        Employee employee = new Employee();

        employee.setEmpId(id);
        employee.setEmpName(name);
        employee.setDesignation(designation);
        employee.setEmpSalary(salary);

        entityTransaction.begin();

        entityManager.persist(employee);

        entityTransaction.commit();

        PrintWriter printWriter = resp.getWriter();

        printWriter.print("<h1>Employee Saved Successfully</h1>");

        entityManager.close();
        entityManagerFactory.close();
    }
}