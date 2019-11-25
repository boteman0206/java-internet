package FirstServlet.上下文练习;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lesson01")
public class servletContext对象  extends HttpServlet {
    /**
     * 应用上下文对象  代表的是整个应用
     * 在一定的范围内(当前应用) 使多个servlet 共享一份数据
     *  一个应用只有一个context对象 单例的
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // TODO: 2019/11/25 获取servlet对象
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("name", "jack");  // 设置值 在另一个context获取值
        System.out.println(servletContext);
    }

}
