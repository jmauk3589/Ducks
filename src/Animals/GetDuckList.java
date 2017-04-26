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
@WebServlet(name = "GetDuckList") // Is this finished...?? If not, fix it.
public class GetDuckList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // alright. you've made it this far. just a bit more!
        //String jqueryDuck = request.getParameter(); // What value do i need to put in the getParameter call?
        String backToPage = "hello clarice";


        // This is set up so that when you enter values into the form you'll get different results.
        // If you leave it blank youll get the error message back, which will cause a parsing error in the console.
        // if its anything else that isnt JSON, the same will happen.
        // IF you put JSON then you'll get the json output of the list I put together down below.

        // uncomment block the following to get access to it!

        /*
        if(jqueryDuck==null){

            backToPage = "error";

        }else if(jqueryDuck.equals("JSON")){

            backToPage = getJSONDucks();

        }else{
            backToPage = getDucks();
        }

        */

        // Run the program and test various inputs. Try out the JSON input and copy/paste the information in the
        // validator i mentioned down at the bottom of this page. Do not go any further until the check is valid.
        System.out.println(backToPage);

        // Now the fun part. Time to return the information to the javascript page! If you're expecting to send back
        // json format please look below and make don't send anything back UNTIL after you have validated its in the
        // correct form. Fix the errors as they go. Don't build the whole thing and play "find the error"

        // response.setContentType("text/plain"); // do this even if you don't need it. it just smooths things out.

        // response.getWriter().print(backToPage);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    /**
     * Returns the names and ages in a simple string format. nothing fancy here!
     * @return string
     */
    private static String getDucks(){
        return "Billy age 23, Naomi age 21, Muggu age 22";
    }


    // check below function for more info.

    /**
     * This is to return the JSON format of the text I'm putting in the array. Below the function is also some comments
     * on how to return larger json files.
     * @return string
     */
    private static String getJSONDucks(){
        String[][] tempArray = new String[3][2];

        tempArray[0][0] = "Billy";
        tempArray[0][1] = "23";

        tempArray[1][0] = "Naomi";
        tempArray[1][1] = "21";

        tempArray[2][0] = "Muggu";
        tempArray[2][1] = "22";

        String[] types = {"name","age"};


        // The next bunch just sets up the JSON format to output what is down below this method. It's not too bad after
        // you've looked at it a little bit.

        String jsonArray = "{\"college\":\"UIOWA\",";
        jsonArray += "\"people\":[";
        for(int i=0; i<tempArray.length; i++){
            jsonArray += "{\"" + types[0] + "\":\"" + tempArray[i][0] + "\",";
            jsonArray += "\"" + types[1] + "\":" + tempArray[i][1] + "}  ";
        }
        jsonArray = jsonArray.substring(0,jsonArray.length()-1) + "]}";

        return jsonArray;

    }

    /*
        Yikes. that json function looks kinda odd right?. here let me explain:

        Json format is Java Script Object Notation. Its an easy way to send objects back to be parsed and used.
        the typical format looks like the following using the above example. Strings must be encapsulated in quotations.
        To accomplish this without breaking out of the string notation use backslash ". aka \" but numbers don't need
        the quotes - hence why i left them off for ages. The substring was simply to remove the extra comma, which is
         a hint at what i removed for you to fix. Run the validator before fixing though.


        start
        {
            college:UIOWA,
            people:[
                        {
                            name:Billy,
                            age:23
                        },
                        {
                            name:Naomi,
                            age:21
                        },
                        {
                            name:Muggu,
                            age:22
                        }
                    ]

        }
        end


        Making up your own JSON formatter can be painful and lead to some easily obtained errors. Prior to returning
        the information i recommend printing the output to the command line or terminal and copy/paste into a good
        JSON formatter/validator to check for errors.

        Here is a good one I used a lot:

        https://jsonformatter.curiousconcept.com/

     */

}
