package FirstServlet.手写验证码;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/flash")
public class 设置响应头 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Refresh", "1"); // 每隔一秒帅新一次
//        5 秒后转到另一个页面
        resp.setHeader("Refresh", "5;URL=index.html");
//        自动刷新

        resp.getWriter().write("登陆成功, 5秒后直接跳转到首页");

    }
}
