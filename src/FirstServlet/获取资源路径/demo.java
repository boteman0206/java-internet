package FirstServlet.获取资源路径;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/lesson04")
public class demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String realPath = this.getServletContext().getRealPath("info.properties");
        System.out.println(realPath);
        String realPath1 = this.getServletContext().getRealPath("web.xml");
        System.out.println(realPath1);

        // TODO: 2019/11/27 解决乱码
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("我是特朗普， 我比谁都懂政治");
    }
}
