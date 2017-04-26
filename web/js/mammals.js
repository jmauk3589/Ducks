/**
 * Created by johnn on 4/25/2017.
 */

// skip this for now, start at comment block.
 var duckList;



/*

   Time for some javascript! It's really not that bad.

   variables are defined as vars. pretty easy.

   var dog = "wolf";
   var ticker = 9;

   If you want to get a specific element do

   document.getElementById("idTagOfElement");

   A typical function looks like this.

   function thisIsAFunction(parameters){
        // code goes here.
   }

   and lastly, for debugging purposes... System.out.println() is the same as console.log()
   This you can view IN THE BROWSER. just right click -> inspect elements then console tab.

   Lets apply these principles by making a new function now.
 */

/**
 * Simple function that gets the current date/time and outputs it to the document element. yay
 */
function putTimeBelow(){
    var textBox = document.getElementById("javascriptOutput");
    var now = new Date(); // gets the current date and time.

    textBox.innerText += "Info submitted at: "+ now + "\n\n";
}

/*
    Pretty cool right? Sadly, nothing in our index.jsp file calls this just yet. Try rerunning the project. you'll
    notice it doesn't do anything =(

    Lets get into some basics of JQUERY.

   $("#element") = = =  document.getElementId("element");

   is the call to get a specific element instead of the above normal javascript syntax. Jquery comes with its own set
   of method calls so its important to know when and where some calls will and wont work. Lets jump into some Jquery
   with a splash of javascript. I'll make sure to note what parts are what for your sake.
 */

// JQUERY call that does the following - WHEN THE DOCUMENT IS FINISHED LOADING. as in the webpage. in our case, index.jsp

$(document).ready( function(){} );

// You can also write this as the following instead.

$(function(){} );


// Ok great. we've got some empty "do this when page is loaded" tasks. lets make a new one and fill them up with stuff

$(function(){

    // uncomment below to start using our function we made earlier.
    // putTimeBelow();

}); // you'll notice that the curly brace and parenthesis are next to each other. i noticed this a lot. its just easier.
// recall it closes the functions internals though.


/*
    Alright this is all fun... but lets get back to the forms and connecting JQuery/javascript back to the servlets.

 */

function friedDuck(){

    // This is the typical function call. post can be "get" instead. The fields go as follows:
    // 1. path to file
    // 2. data to send, which must be in the serialized format. ( value=456&name=billy )
    // 3. function to do upon success. this is where we can start getting a response from the servlet!
    // $.post( "Animals.GetDuckList",  data,   function(msg){}   )

    var data = $("#jqueryForm").serialize(); // this is an easy way to format the input of a form. It only works with forms.

    // uncomment the following so we can call the previous function we made when the form is submitted!
     putTimeBelow();

    $.post("Animals.GetDuckList", data, function(msg){

        // before uncommenting this, lets check to see if the servlet is even getting our request to send info....



        // my double check to make sure the msg has substance before parsing - but it will still give error if not JSON.
        // its ok. cuz luckily it doesnt lock up the browser or shut server down.
        if(msg.length>0){

            // notice how i did not declare "var duckList". i am making this a global variable for all functions.
            // Go to the top of the page and uncomment "var duckList;" as its good practice to declare all
            //  globals at the top anyways.

            duckList = JSON.parse(msg); // this will parse the msg from the json format into usable information.

            document.getElementById("javascriptOutput").innerText += msg + "\n\n";

            makeDuckTable();

        }



    });


    return false; // have to return false for form to finish the onsubmit process. Since we are doing it ourselves..

    // Okay so we have the info stored into the duckList global variable?... no what?.... lets keep going! last part!

}


function makeDuckTable(){
    var parent = document.getElementById("duckTable");

    // we dont need the first entry of ducklist. so lets just focus in on the array of people we set up.
    var people = duckList.people;

    // now lets make the table!

    for(var count=0; count<people.length; count++){
        var row = document.createElement("tr");   // creates the table row for our person
        var name = document.createElement("td"); // creates table data column for name
        var age = document.createElement("td"); // creates the table data column for age

        name.innerText = people[count].name; // its highlighted because name is a special key word. i usually do NM. for name.
        age.innerText = people[count].age;

        row.appendChild(name);
        row.appendChild(age);

        parent.appendChild(row);

    }
}




