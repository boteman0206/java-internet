package FirstServlet.获取前端参数;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


@WebServlet("/parameter")
public class Demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取get请求的参数
//        String name = req.getParameter("name");
//        String pass = req.getParameter("password");
//        System.out.println(name);
//        System.out.println(pass);
//
////        一个参数有多个值的情况
////        http://localhost:8080/parameter?name=jack&name=lucy&password=123
//        String[] names = req.getParameterValues("name");
//        System.out.println(Arrays.toString(names));
//
////     todo   获取所有参数的名字 相同的参数无法重复获取
//        Enumeration<String> parameterNames = req.getParameterNames();
//        while (parameterNames.hasMoreElements()){
//            System.out.println(parameterNames.nextElement());
//        }
//
////      todo  参数的会放到map中 可以获取到相同的参数 参数会放到数组里面
//        Map<String, String[]> parameterMap = req.getParameterMap();
//        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
//        for (Map.Entry<String, String[]> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(Arrays.toString(entry.getValue()));
//        }

        // TODO: 2019/11/30 使用流读取文件的时候参数必须是 x-www-form-urlencoded
        ServletInputStream inputStream = req.getInputStream();
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(buff)) != -1){
            String s = new String(buff, 0, len);
            System.out.println(s);
        }
    }
}
