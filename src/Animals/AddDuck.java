package Animals;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by johnn on 4/25/2017.
 */
@WebServlet(name = "AddDuck", value="/Animals.AddDuck")
public class AddDuck extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Notice how we are NOT putting code here. the form is sending the information using the "get" method.
        // This also means though that you can set up multiple forms one to use post one to use get. however, keeping
        // your servlets to a one-use-case basis makes it easier to find what you're looking for in my opionion.
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Uncomment the lines below and rerun the index.jsp file. You should be able to get an output shown in the
        // terminal with the name you entered =)

        //String duckName = request.getParameter("addDuckName");

        //System.out.println("duckName");

        /*  What should happen, is that a white screen should be on the browser. This is because you submitted the
             form but didn't tell it to redirect anywhere. Remember when I said forms always "reload" the page.
            ... tada...
            take a look at the URL. Notice how it goes localhost/Animals.AddDuck?addDuckName= "whatever you put"
            everything after the "?" symbolizes parameters returned by the form. Thats also why the names on the forms
            are important. without them there would be no parameter name to call.
            When multiple parameters are sent they are separated by a "&". This information isn't quite necessary
            but it helps when understanding whats going on =)
        */


        // Don't uncomment these lines until you do the above information. It will simply change it so that after
        // submitting the form you are returned to the index.jsp file.

        //response.sendRedirect("index.jsp");


    }
}
