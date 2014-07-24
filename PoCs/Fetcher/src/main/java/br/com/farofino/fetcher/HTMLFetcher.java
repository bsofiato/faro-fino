package br.com.farofino.fetcher;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import org.dom4j.Document;

public interface HTMLFetcher {
  String fetch(URI uri) throws Exception;
}
