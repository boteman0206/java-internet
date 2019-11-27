package FirstServlet.获取全局的上下配置信息;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/lesson03")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 在xml里面配置的信息不是通过getAttribute方法获取的
         */
        Object jack = this.getServletContext().getAttribute("jack");
        System.out.println(jack);

        // TODO: 2019/11/27 是通过初始化的getInitParameter获取的
        String jack1 = this.getServletContext().getInitParameter("jack");
        System.out.println(jack1);

//        todo 获取全局xml里面配置的所有name
        Enumeration<String> initParameterNames = this.getServletContext().getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            System.out.println(initParameterNames.nextElement());
        }

    }
}
