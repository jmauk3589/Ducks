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


/*

Notes about servlets: When adding a new servlet - always "right click" src and add new servlet. Copy/pasting from another
problem will just give you errors most likely. Its just an overall safer approach. Anyways.

Notice how the @Webservlet has name="AddDuck". This is the name that pops up in the web contents on the left side of the screen.
If you are unsure where i am talking - go to View -> Tool windows -> Web which is at the bottom. The names are used here and
that's it.

Now lets fix this so the form can get to this path. Add ", value="/Animals.AddDuck" " below. I've commented it out below
so just uncomment it and you should be fine. Here the value represents the pathname to the servlet that the form needs to
look for. If you're unsure how I got the path name check the src folder and notice how the directories work. If there was
another package inside of Animals it would go Animals.NewPackage.AddDuck . I had issues going past 2 package levels deep, so
just don't do it.
 */
@WebServlet(name = "AddDuck"    /*   , value="/Animals.AddDuck"      */     )
public class AddDuck extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Notice how we are NOT putting code here. the form is sending the information using the "get" method.
        // This also means though that you can set up multiple forms one to use post one to use get. however, keeping
        // your servlets to a one-use-case basis makes it easier to find what you're looking for in my opinion.
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Uncomment the lines below and rerun the index.jsp file. You should be able to get an output shown
        // with the name you entered =)

        //String duckName = request.getParameter("addDuckName");

        //System.out.println("duckName");

        /*  What should happen, is that a white screen should be on the browser. This is because you submitted the
             form but didn't tell it to redirect anywhere. Remember when I said forms always "reload" the page.
             if you dont remember...surprise? ... tada...
            take a look at the URL. Notice how it goes localhost/Animals.AddDuck?addDuckName= "whatever you put"
            everything after the "?" symbolizes parameters returned by the form. That's also why the names on the forms
            are important. without them there would be no parameter name to call.
            When multiple parameters are sent they are separated by a "&". This information isn't quite necessary
            but it helps when understanding whats going on =)

            Here's a typical youtube video- notice the format?....
            https://www.youtube.com/watch?v=WTWdP5DMdsM
        */


        // Don't uncomment these lines until you do the above information. It will simply change it so that after
        // submitting the form you are returned to the index.jsp file.

        //response.sendRedirect("index.jsp");

        // Lets head back to index.jsp and look at the next form for SensitiveDuck
    }
}
