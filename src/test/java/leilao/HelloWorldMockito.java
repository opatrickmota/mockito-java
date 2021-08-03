package leilao;

import br.com.alura.leilao.dao.LeilaoDao;
import br.com.alura.leilao.model.Leilao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class HelloWorldMockito {

    @Test
    void hello(){
        LeilaoDao mock = Mockito.mock(LeilaoDao.class);
        List<Leilao> todos = mock.buscarTodos(); // finge que executou o método, mas na verdade ele so retorna uma lista do tipo leilao vazia, que é o que o método retorna
        Assert.assertTrue(todos.isEmpty());
    }
}
