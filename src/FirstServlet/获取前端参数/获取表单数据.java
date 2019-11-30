package FirstServlet.获取前端参数;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;


@WebServlet("/stream")
public class 获取表单数据 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 2019/11/30 使用属性描述器获取属性
        User user = new User();

        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            String key = entry.getKey();
//           todo 创建属性描述器
            try {
                PropertyDescriptor po = new PropertyDescriptor(key, User.class);
                // TODO: 2019/11/30 获取类的set设置的方法
                Method writeMethod = po.getWriteMethod();
//                Method readMethod = po.getReadMethod(); 获取get方法
                String[] value = entry.getValue();
                Object invoke = writeMethod.invoke(user, value[0]);


            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }


        }
        System.out.println(user);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8"); // todo 解决乱码 只是针对post有效果
//        System.out.println(req.getParameter("name"));

//     todo  注意 上面的如果读取完了后面就会拿不到参数
//       使用getInputStream获取采纳数只能用post请求
        ServletInputStream inputStream = req.getInputStream();
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(buff)) != -1){
            String s = new String(buff, 0, len);
            // TODO: 2019/11/30   解码方拾二
//            String s = new String(buff, 0, len, "utf-8");
            System.out.println(s); // 读取中文的时候回变成url编码的格式
            // TODO: 2019/11/30 解码
            String decode = URLDecoder.decode(s,"utf-8");
            System.out.println("解码之后的参数 = " + decode);
        }

        System.out.println("之后在获取数据 = " + req.getParameter("name"));


    }
}
