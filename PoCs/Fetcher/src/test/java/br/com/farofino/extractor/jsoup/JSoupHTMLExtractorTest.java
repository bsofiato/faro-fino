package br.com.farofino.extractor.jsoup;

import br.com.farofino.extractor.HTMLExtractorDelegator;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author x
 */
public class JSoupHTMLExtractorTest {
  private static class MockExtractorDelegator implements HTMLExtractorDelegator {
    private final Iterator <String> expressions;

    public MockExtractorDelegator(Iterable<String> expressions) {
      this.expressions = expressions.iterator();
    }
    
    private Iterator<String> getExpressions() {
      return expressions;
    }
    
    @Override
    public boolean hasNext() {
      return getExpressions().hasNext();
    }

    @Override
    public String next() {
      return getExpressions().next();
    }

    @Override
    public void processResult(String xpath, String result) {
      System.out.println(xpath + ":" + result);
    }
    
  }
  public JSoupHTMLExtractorTest() {
  }

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
  public void testExtract() throws Exception {
    String string = IOUtils.toString(getClass().getResourceAsStream("categoria.html"));
    JSoupHTMLExtractor extractor = new JSoupHTMLExtractor();
    extractor.extract(string, new MockExtractorDelegator(Arrays.asList("//a/@href")));
  }
  
  @Test
  public void testProductInfo() throws Exception {
    String string = IOUtils.toString(getClass().getResourceAsStream("product.html"));
    JSoupHTMLExtractor extractor = new JSoupHTMLExtractor();
    extractor.extract(string, new MockExtractorDelegator(Arrays.asList("(//*[@itemprop='name'])[1]", 
                                                                       "(//*[@itemprop='price'])[1]", 
                                                                       "(//div[@class='details_block']/b[3]/following-sibling::a[1])", 
                                                                       "(//div[@class='details_block']/b[4]/following-sibling::a[1])")));
    
    
  }
}
