package omikujiServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class omikujiServlet
 */
@WebServlet("/OmikujiServlet")
public class OmikujiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OmikujiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int unse = (int)(Math.random()*10);
        String unse1;
        String kome;
        if(unse >= 7){
            unse1 = "大吉！";
            kome = "ついてるねー。";
        }else if(unse >=4){
            unse1 = "中吉！";
            kome = "まあまあやねー。";
        }else{
            unse1 = "小吉！";
            kome = "ぷっ。どんまい（笑）";
        }
        request.setAttribute("unse1", unse1);
        request.setAttribute("kome", kome);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/omikuji-servlet.jsp");
        dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int unse = (int)(Math.random()*10);
        String unse1;
        String kome;
        if(unse >= 7){
            unse1 = "大吉！";
            kome = "ついてるねー。";
        }else if(unse >=4){
            unse1 = "中吉！";
            kome = "まあまあやねー。";
        }else{
            unse1 = "小吉！";
            kome = "ぷっ。どんまい（笑）";
        }
        request.setAttribute(unse1, "unse1");
        request.setAttribute(kome, "kome");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/omikuji-servlet.jsp");
        dispatcher.forward(request,response);
	}


}
