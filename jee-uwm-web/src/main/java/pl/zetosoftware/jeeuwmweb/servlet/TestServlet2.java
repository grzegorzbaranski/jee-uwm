package pl.zetosoftware.jeeuwmweb.servlet;

/**
 * Created by user on 03.04.17.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

@WebServlet( urlPatterns = "/TestServlet2")
public class TestServlet2 extends  HttpServlet{

    public static final String NAZWA = "nowaWartosc";
    private static String PAGE_HEADER = "<html><head><title>test2-servlet</title></head><body>";

    private static String PAGE_FOOTER = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        addCookie(req,resp);
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);
        writer.println("<h1>" + "TEST2 SERVLET UWM 2017" + "</h1>");
        writer.println("<p>"+ "Cookie : "+ getCookie(NAZWA, req)+"</p>");
        writer.println("<p>"+ "Parametr p1: "+req.getParameter("p1")!= null?req.getParameter("p1"):"Brak wartości"+"</p>");
        writer.println(PAGE_FOOTER);
        writer.close();

    }

    private String getCookie(String nazwa, HttpServletRequest req) {
        Cookie[] tab = req.getCookies();
        for (Cookie cookie: tab ) {
            if (nazwa.equalsIgnoreCase(cookie.getName())){
               return cookie.getValue();
            }
        }
        return "Brak";
    }

    private void addCookie(HttpServletRequest req, HttpServletResponse resp) {
            resp.addCookie(new Cookie(NAZWA, UUID.randomUUID().toString()));
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }
}
