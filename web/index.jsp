<%--
  Created by IntelliJ IDEA.
  User: johnn
  Date: 4/25/2017
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <meta charset="UTF-8">
  <title>EVERYONE LOVES DUCKS!! =)</title>

    <%--This is just for the responsive.css file youll add in later. --%>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <%-- Reset and normalize are typically good to have. It ensures that no preset conditions set by the browser
       are messing with your personal css file. Reset... resets it all. Normalize applies basic stuff to fields.
  --%>
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="css/normalize.css">

  <%-- Put css file below --%>


  <%-- Put jquery script below --%>


  <%-- Put js file script below --%>



</head>
<body>

<%--

 Check out the CSS page too. There I go into some basics and some things you will notice on the forms, inputs, etc.
 Try loading the page first and then adding the code below above to see the difference.

    <link rel="stylesheet" href="css/main.css">

 Now run the page again after adding the following code. Change the screen size and notice how things alter.
 This can be applied to more than just colors. Changing how div's/sections/ etc interact with eachother is also
 a key component. You may need to refresh the page a few times to replace the cached css file the browser is using.

    <link rel="stylesheet" href="css/responsive.css">

 The following form sends the information to doGet in Animals.AddDuck servlet.

 Reminder: "get" method can only pass/recieve 4kb of information. Typically these are good
 for sending login information or small values - that require no feedback. Although depending on how you set it up...
 your login can even have a feed back making this not optimal - though if your login uses more than 4kb, change it. lol
--%>
<h1>
  Submitting form to get - pure html
</h1>

<%--
The action sets the file path for when the form is submitted. Any button inside of the form will auto do submit,
 but specifying on the button type helps readability. The form currently is broke. Go on over to Animals.AddDuck.
 --%>
<form id="addDuckForm" action="Animals.AddDuck" method="get">
  <p>
    Duck Name: <input type="text" id="addDuckID" name="addDuckName" required>
  </p>
  <button type="submit" class="buttonModel">Add the duck!</button>
</form>
<br><br><br>



<%--
 The following form sends the information to doPost in Animals.SensitiveDuck servlet.

 Reminder: "post" method is typically used when sending/recieving senstive information such as passwords,
 creditcard info etc as well as larger file types. There is no limit but realize the larger the file size the
 more time it will take the user to download and thus the user experience will be dulled
--%>
<h1>
  submitting form to post - pure html
</h1>
<form id="sensitiveDuckForm" action="Animals.SensitiveDuck" method="post">
  <p>
    Sensitive Duck: <input type="text" id="sensitiveDuckID" name="sensitiveDuckName" required>
  </p>
  <button type="submit" class="buttonModel">Add the duck...carefully</button>
</form>
<br><br><br>


<%--
 The following form sends the information to doPost in Animals.GetDuckList servlet through using
 JQUERY in addition to standard javascript notation.

 Reminder: This method utilizes JQUERY and as such you must include the following at the top of the page.
 If you'd like to see it work just copy this code and paste it above where "put here" is mentioned.

     <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.0.min.js"></script>

 You'll also need to include the following script to include the file path for the javascript file.
 Without this it just wont work. Make sure to put this AFTER the above code. The JQUERY library needs
 to be called prior to utilizing any JQUERY functions in the script below.

     <script src="js/Animals/mammals.js"></script>

  Notice how there is no action listed. Instead it features an "onsubmit" call to a function in the javascript file.
  This allows the form to be preproccessed before submitting it. If i am correct, I believe if fried() returns true it
  will try and submit, if false then it wont. So if you did have an action, the action would not be attempted UNTIL after
  the onsubmit returns "true" or "false". Make sense? Here we are just going to do the function call and include no action
  to keep it simpler.

  I know I talked about having the button on the outside. That was before I remembered this tidbit. Having the button
  on the outside allows the button to be "submitted"~ even when info is not filled in. That required an additional check.
  Putting the button in inside and doing the onsubmit function call makes it so the user will be prompted to fill in everything
  or fix things prior to attempting to submit. Of course you can do our own validation checking too. so meh.

  When you're ready head on over to the js/Animals/mammals.js file!
--%>
<h1>
  submitting form with jquery. see javascript file in js/mammals.js
</h1>
<form id="jqueryForm" onsubmit="return friedDuck()">
  <p>
    JQUERY Duck: <input type="text" id="jqueryInputID" name="jqueryDuckName" required>
  </p>
  <button>Click here for duck List</button>
</form>

<br><br><br>
<%--

The stuff below is just for the textbox output view for your convenience. Don't even bother till the end. You'll get there.

--%>
<p id="javascriptOutput">


</p>
<table>
  <tr>
    <th>Name</th>
    <th>Age</th>
  </tr>
</table>
<table id="duckTable">
  <%-- populated with javascript! --%>
</table>

</body>
</html>
