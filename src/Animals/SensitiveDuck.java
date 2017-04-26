package Animals;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by johnn on 4/24/2017.
 */
@WebServlet(name = "SensitiveDuck",value="/Animals.SensitiveDuck") // i already filled this in. but remember its here!!
public class SensitiveDuck extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sensitiveDuck = request.getParameter("sensitiveDuckName");

        System.out.println("Sensitive Duck's name is "+sensitiveDuck);

        // Before uncommenting the following run the form and try the second sensitive duck form. Notice the URL.
        // There should be no "?" with the variables for the above information listed. This is one of the benefits of
        // post calls. User can't see info. That and the ability to send more than 4kb of data!

        // response.sendRedirect("index.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Since we are using the "post" method the get method is empty. Recall that you CAN have multiple forms
        // going to same servlet each using one or the other. Typically - keep it to one-use-case basis though. Its
        // just better design as its more compartmentalized and allows more flexibility in design since things aren't
        // "bundled"... que comcast bundle commercial.

    }
}
