package FirstServlet.获取前端参数;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/getbean")
public class beanUtil包设置参数 extends HttpServlet {

    /**
     * 使用beanutils需要导入 commons-BeanUtils和common-logging 的 jar包
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("========================");
        System.out.println(req.getParameter("name"));
        User user = new User();
        try {
            BeanUtils.populate(user, req.getParameterMap());
            System.out.println("fengzhuan");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(user);
    }
}
