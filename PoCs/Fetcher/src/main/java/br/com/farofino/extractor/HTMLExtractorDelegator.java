package br.com.farofino.extractor;

public interface HTMLExtractorDelegator {
  boolean hasNext();
  String next();
  void processResult(String xpath, String result);
}
