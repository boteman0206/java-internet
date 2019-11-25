package FirstServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class templateServlet extends HttpServlet {

    // TODO: 2019/11/25 模板方式实现servlet
    /**      继承关系
     *  HttpServlet ——》 GenericServlet --> Servlet
     *  get 请求
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);  todo 这一行代码需要注释掉 不然会报错

        resp.getWriter().write("模板方式实现servlet");

    }


    /**
     * post请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
