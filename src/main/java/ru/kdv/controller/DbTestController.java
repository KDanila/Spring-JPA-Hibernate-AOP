package ru.kdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
import java.sql.DriverManager;

@Controller
public class DbTestController {
    @GetMapping("/testDb")
    public String testDb(Model model) {
        // setup connection variables
        String user = "springstudent";
        String pass = "springstudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        StringBuilder stringBuilder = new StringBuilder();
        // get connection to database
        try {


            stringBuilder.append("Connecting to database: ").append(jdbcUrl).append("/n");

            Class.forName(driver);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            stringBuilder.append(" SUCCESS!!!");

            model.addAttribute("log", stringBuilder.toString());

            myConn.close();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return "test-db";
    }

}
