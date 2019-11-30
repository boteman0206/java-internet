package FirstServlet.request对象;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/request")
public class Demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //        完整的路径名称
        System.out.println(req.getRequestURL());

//        获取请求的资源路径
        System.out.println(req.getRequestURI());

//        获取请求参数
        System.out.println(req.getQueryString());

//        客户端的信息
        System.out.println("addr = " + req.getRemoteAddr());
        System.out.println("user = " + req.getRemoteUser());
        System.out.println("host = " + req.getRemoteHost());
        System.out.println("port = " + req.getRemotePort());

        System.out.println(req.getLocalAddr());  // 服务器地址
        System.out.println(req.getLocalPort()); // 服务器端口
        System.out.println(req.getLocalName()); // 服务器的名称
        // TODO: 2019/11/30  获取请求的方法
        System.out.println(req.getMethod());


        // TODO: 2019/11/30 获取请求头的数据
        System.out.println(req.getHeader("User-Agent"));

        // TODO: 2019/11/30 获取所有的请求头的name 配合上面可以取值
        Enumeration<String> headers = req.getHeaderNames();
        while (headers.hasMoreElements()){
            System.out.println(headers.nextElement());
        }



    }
}
