package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 687159
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String age = "";
        age = (request.getParameter("ageBox"));
        request.setAttribute("ageBox", age);
        int ageInt;

        if (age == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }

        if (age.matches("[0-9]+")) { //is a string
            ageInt = Integer.parseInt(age);
        } else {
            request.setAttribute("errorMessage", "Please enter only a number between 1 and 150");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        if (age.isEmpty()) {
            request.setAttribute("errorMessage", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }

        if (ageInt < 1 || ageInt > 150) {
            request.setAttribute("errorMessage", "Age must be between 1 and 150");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        } else {
            ageInt = ageInt + 1;
            request.setAttribute("ageMessage", "Your age next birthday will be " + ageInt);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
