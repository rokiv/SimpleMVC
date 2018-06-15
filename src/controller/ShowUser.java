package controller;

import model.User;
import model.UserLookupService;
import model.UserLookupServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show-user")
public class ShowUser extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String userId = request.getParameter("userId");
        UserLookupService service = new UserLookupServiceImpl();
        User user = service.findUsers(userId);
        request.setAttribute("user", user);
        String address = "/WEB-INF/show-user.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}
