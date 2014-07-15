/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.farofino.domain.produto;

import org.joda.time.DateTime;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bruno
 */
public class TipoCaracteristicaTest {
  
  public TipoCaracteristicaTest() {
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
  public void testMarshallString() throws Exception {
    TipoCaracteristica c = new TipoCaracteristica();
    c.setType(String.class);
    assertEquals(c.marshall("abc"), "\"abc\"");
  }
  
  @Test
  public void testMarshallTimestamp() throws Exception {
    TipoCaracteristica c = new TipoCaracteristica();
    c.setType(DateTime.class);
    DateTime time = new DateTime(1473756566L);
    assertEquals(c.marshall(time), "1473756566");
  }
  
  @Test
  public void testUnmarshallTimestamp() throws Exception {
    TipoCaracteristica <DateTime> c = new TipoCaracteristica <DateTime> ();
    c.setType(DateTime.class);
    DateTime value = c.unmarshall("1473756566");
    assertEquals(1473756566L, value.getMillis());
  }
}
