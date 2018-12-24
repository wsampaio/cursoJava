
import static org.junit.Assert.*;
import org.junit.Test;




public class TesteRegistroPontos {
	
	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "WELL";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}
}
