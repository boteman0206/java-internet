package FirstServlet.手写验证码;

import cn.dsna.util.images.ValidateCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/verify-code")
public class Demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        工具类实现验证码
        /**
         *  web导入的jar报需要放在lib文件下面
         *  配置idea的时候需要将lib文件加到artifaict中
         */
        ValidateCode validateCode = new ValidateCode(100, 30, 4, 6);
        System.out.println("生成验证码");
        validateCode.write(resp.getOutputStream());


    }
}
