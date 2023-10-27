package br.com.fiap.controle;

import java.io.IOException;
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
 * Servlet implementation class ParaCompra
 */
@WebServlet("/ParaCompra")
public class ParaCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParaCompra() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int soma = 0;
		HttpSession sessao = request.getSession();
		List<Carta> maoCpu = (List<Carta>)sessao.getAttribute("mao_cpu");
		for(Carta c : maoCpu) {
			if(c.getValor() > 10)
				soma = soma + 10;
			else
				soma = soma + c.getValor();
		}
		
		Baralho bar = (Baralho)sessao.getAttribute("baralho");
		while (soma < 16) {
			Carta c = bar.compra();
			if(c.getValor() > 10)
				soma = soma + 10;
			else
				soma = soma + c.getValor();
			maoCpu.add(c);
		}
		
		sessao.setAttribute("mostra", true);
		
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
