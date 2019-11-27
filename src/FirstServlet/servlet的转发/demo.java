package FirstServlet.servlet的转发;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/demo1")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.getWriter().write("i am servlet 1");
        // TODO: 2019/11/27 获取请求的转发对象
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/demo2");
        // TODO: 2019/11/27 执行转发
        requestDispatcher.forward(req, resp);

    }
}
