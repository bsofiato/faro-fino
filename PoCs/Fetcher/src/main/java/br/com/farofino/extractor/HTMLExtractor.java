package br.com.farofino.extractor;

public interface HTMLExtractor {
  void extract(String html, HTMLExtractorDelegator delegator) throws Exception;
}
