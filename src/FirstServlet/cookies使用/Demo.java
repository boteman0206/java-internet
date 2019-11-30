package FirstServlet.cookies使用;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/cookies")
public class Demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        创建cookies对象
        Cookie last = new Cookie("last", "123445678");
        //设置存活时间 300 秒
        last.setMaxAge(300);

//        传给客户端的cookies
        resp.addCookie(last);

//        获取cookies

    }

}
