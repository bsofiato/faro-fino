package br.com.farofino.fetcher.httpclient;

import java.net.URI;
import java.net.URISyntaxException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author x
 */
public class HTTPClientHTMLFetcherTest {
  
  public HTTPClientHTMLFetcherTest() {
  }

    // TODO add test methods here.
  // The methods must be annotated with annotation @Test. For example:
  //
  // @Test
  // public void hello() {}

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
  public void testFetch() throws URISyntaxException, Exception {
    HTTPClientHTMLFetcher fetcher = new HTTPClientHTMLFetcher();
    //System.out.println(fetcher.fetch(new URI("http://store.steampowered.com/")));
    System.out.println(fetcher.fetch(new URI("http://store.steampowered.com/app/291270/?snr=1_200_200_250_tab-NewReleasesFilteredDLC")));
  }
}
