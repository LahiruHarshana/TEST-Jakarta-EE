package lk.ijse.gdse66.hellojavaee3;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Incoming request"+req.getRemoteAddr());
        resp.getWriter().println("Hello I am from the server 2 ");

    }
}