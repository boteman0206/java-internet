package FirstServlet.cookies使用;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delcookies")
public class cookies的缓存 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());

            // TODO: 负数表示数据缓存在浏览器中 0表示删除cookies 正数表示缓存在磁盘
//            删除cookies
            cookie.setMaxAge(0);
//            并且要告诉服务器 不写不会删除
            resp.addCookie(cookie);
        }

    }
}
