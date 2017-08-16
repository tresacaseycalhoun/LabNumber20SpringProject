package com.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","greeting","Welcome to GC Coffee ");
    }

    @RequestMapping("/userform")
    public ModelAndView userform() {
        return new
            ModelAndView("form","inst","Please enter info:  ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler (
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName") String lastName,
            @RequestParam("email") String email,
            @RequestParam("phoneNumber") long phoneNumber,
            @RequestParam("password") String password)
    {

        //FAIRY DUST
        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("firstName", firstName);
            return mv;
    }

    @RequestMapping(value = "getAllItems")
    public ModelAndView getAllItems() {
        String dbAddress = "jdbc:mysql://localhost:3306/coffeeshopdb";
        String username = "root";
        String password = "LetMeIn";
        //load the driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver()); -serves as a second option

            //create the db connection object
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(dbAddress, username, password);

            //create the db statement

            String readitemsCommand = "select name, description, quantity, price from items";

            Statement readitems = mysqlConnection.createStatement();

            ResultSet results = readitems.executeQuery(readitemsCommand); //executes the statement

            //arrayList of customers
            ArrayList<items> itemsList=new ArrayList<items>();

            //map from the ResultSet to the ArrayList
            while (results.next()) {
                items temp = new items(
                        results.getString(1),
                        results.getString(2),
                        results.getInt(3),
                        results.getFloat(4));
                itemsList.add(temp);
            }

            return  new ModelAndView("items", "cList", itemsList);
        }
        catch (Exception ex) {

        }

        return null; //todo: create an error page with custom error messages !!!
    }


}

