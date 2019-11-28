package FirstServlet.请求的重定向;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/redict")
public class Demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      1：  地址栏会变 2： 会发送两次请求给服务器
        // TODO: 2019/11/28  重定向
//        resp.sendRedirect(req.getContextPath() + "/flash");

        // TODO: 2019/11/28
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(req.getContextPath() + "/flash");
        requestDispatcher.forward(req, resp);

        

    }
}
