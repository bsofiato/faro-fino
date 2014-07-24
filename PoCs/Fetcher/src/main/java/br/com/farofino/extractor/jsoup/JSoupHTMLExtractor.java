package br.com.farofino.extractor.jsoup;

import br.com.farofino.extractor.HTMLExtractor;
import br.com.farofino.extractor.HTMLExtractorDelegator;
import java.io.Reader;
import java.io.StringReader;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;


public class JSoupHTMLExtractor implements HTMLExtractor {
  private String getXHTML(String html) {
    Document document = Jsoup.parse(html);
    document = new Cleaner(Whitelist.relaxed().addTags("span", "div").addAttributes(":all", "itemprop", "id", "class")).clean(document);
    document.outputSettings().escapeMode(EscapeMode.xhtml);
    return document.toString();
  }

  private org.dom4j.Document parseXHTML(String xhtml) throws Exception {
    SAXReader saxReader = new SAXReader();
    try (Reader reader = new StringReader(xhtml)) {
      return saxReader.read(reader);
    }
  }
  private String trim(String value) {
    if (value != null) {
      return value.trim();
    }
    return value;
  }

  private String extract(Node node) {
    if (node instanceof Element) {
      return trim(((Element)(node)).getStringValue());
    } else if (node instanceof Attribute) {
      return trim(((Attribute)(node)).getStringValue());
    } else {
      throw new IllegalArgumentException("Dont know how to process node " + node);
    }
  }
  
  
  @Override
  public void extract(String html, HTMLExtractorDelegator delegator) throws Exception {
    org.dom4j.Document document = parseXHTML(getXHTML(html));
    while (delegator.hasNext()) {
      String xpath = delegator.next();
      document.selectNodes(xpath).forEach((node) -> delegator.processResult(xpath, extract((Node)(node))));
    }
  }
}
