package br.com.farofino.domain.produto.hibernate;

import br.com.farofino.domain.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bruno
 */
@ContextConfiguration("produto-hibernate-repository-test.xml")
public class ProdutoHibernateRepositoryTest extends AbstractTransactionalTestNGSpringContextTests {
  
  @Autowired
  private ProdutoRepository repository;
  
  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @BeforeMethod
  public void setUpMethod() throws Exception {
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {
  }
  
  @Test
  public void testOK() throws Exception {
    /*TransactionTemplate txTemplate = new TransactionTemplate(manager, new DefaultTransactionDefinition());
    txTemplate.execute(new TransactionCallback<Object> () {
      @Override
      public Object doInTransaction(TransactionStatus ts) {
        //Categoria c = new Categoria();
        //c.setNome("livros");
        //c.setParent(template.findOne(0, Categoria.class));
        //template.save(c);
        //Categoria c = template.findOne(1, Categoria.class);
        return null;
      }
    });*/
  }
}
