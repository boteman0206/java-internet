package FirstServlet.response对象;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;


@WebServlet("/download")
public class 文件下载 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 处理文件下载 处理二进制
         */
        String filename = "E:/坚果云/ps坚果云词库/医药类-开瑞坦/去水词库/过敏去水词库/领域去水.txt";
//        获取文件输入流
        FileInputStream fis = new FileInputStream(filename);
        //      todo  文件下载需要设置响应头 如果有中文文件名需要urlEncode
        //        filename = URLEncoder.encode(filename, "utf-8"); //编码中文文件名字
        resp.setHeader("Content-disposition", "attachment;filename=" + "text1.txt");


//        获取输出流
        ServletOutputStream outputStream = resp.getOutputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1){
            outputStream.write(buf, 0, len);
        }

        fis.close();

    }
}
