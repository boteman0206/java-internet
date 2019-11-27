package FirstServlet.response对象;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet("/buff")
public class demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // TODO: 2019/11/27 返回字符串的
//        resp.getWriter().write("hello");
        // TODO: 2019/11/27 返回字节  可以传递图片等
//        ServletOutputStream outputStream = resp.getOutputStream();
//        byte[] buff = {97, 99, 100};
//        outputStream.write(buff);

//        响应编码问题 如果不设置编码默认响应的是iso-8859 所以乱码
//        方式一
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("utf-8");

//        方拾二
        resp.setHeader("Content-Type", "text/html;charset=utf-8");
        resp.getWriter().write("我是特朗普！");



    }
}
