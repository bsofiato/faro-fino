package br.com.farofino.domain.categoria.hibernate;

import br.com.farofino.domain.categoria.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bruno
 */
@ContextConfiguration("categoria-hibernate-repository-test.xml")
public class CategoriaHibernateRepositoryTest extends AbstractTransactionalTestNGSpringContextTests {
  
  @Autowired
  private CategoriaRepository repository;
  
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
    System.out.println(repository.findOne("ABC"));
    
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
