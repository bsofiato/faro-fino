package br.com.farofino.domain.produto.mongodb;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.categoria.TipoCaracteristica;
import br.com.farofino.domain.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("produto-mongodb-repository-test.xml")
public class ProdutoMongoDBRepositoryTest extends AbstractTestNGSpringContextTests {

  @Autowired
  private MongoOperations mongoTemplate;
  
  @Test
  public void testX() {
    TipoCaracteristica <String> c1 = new TipoCaracteristica<String>();
    c1.setNome("isbn");
    
    Produto produto = new Produto();
    //produto.setID("123456789");
    produto.setNome("Teste");
    produto.setDescricao("HAHAHA");
    produto.getCaracteristicas().put(c1, "124724654742");
    produto.setCategoria(new Categoria());
    produto.getCategoria().setID("123474326534");
    
    mongoTemplate.save(produto);
  }
}
