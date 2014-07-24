package br.com.farofino.fetcher.httpclient;

import br.com.farofino.fetcher.HTMLFetcher;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HTTPClientHTMLFetcher implements HTMLFetcher, AutoCloseable {
  private final CloseableHttpClient client;

  private CloseableHttpClient getClient() {
    return client;
  }

  public HTTPClientHTMLFetcher() {
    this.client = HttpClients.createDefault();
  }
  
  @Override
  public String fetch(URI uri) throws Exception {
    HttpGet get = new HttpGet(uri);
    try (CloseableHttpResponse result = getClient().execute(get)) {
      HttpEntity entity = result.getEntity();
      try (InputStream stream = entity.getContent()) {
        if (entity.getContentEncoding() == null) {
          return IOUtils.toString(stream, "UTF-8");
        } else {
          return IOUtils.toString(stream, entity.getContentEncoding().getValue());
        }
      }
    }
  }

  @Override
  public void close() throws Exception {
    getClient().close();
  }
}
