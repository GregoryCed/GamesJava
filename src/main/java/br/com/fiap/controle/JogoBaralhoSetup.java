package br.com.fiap.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.jogo.model.Baralho;
import br.com.fiap.jogo.model.Carta;

/**
 * Servlet implementation class JogoBaralhoSetup
 */
@WebServlet("/JogoBaralhoSetup")
public class JogoBaralhoSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JogoBaralhoSetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Baralho bar = new Baralho();
		bar.embaralha();
		List<Carta> maoUsu = new ArrayList<>();
		List<Carta> maoCpu = new ArrayList<>();
		
		maoUsu.add(bar.compra());
		maoCpu.add(bar.compra());
		maoUsu.add(bar.compra());
		maoCpu.add(bar.compra());
		
		HttpSession sessao = request.getSession();
		sessao.setAttribute("baralho", bar);
		sessao.setAttribute("mao_usuario", maoUsu);
		sessao.setAttribute("mao_cpu", maoCpu);
		
		sessao.setAttribute("mostra", false);
		
		request.getRequestDispatcher("mesa.jsp").forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
