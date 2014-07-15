package br.com.farofino.domain.produto;

import java.text.SimpleDateFormat;
import org.codehaus.jackson.map.ObjectMapper;

public class TipoCaracteristicaMarshallerServiceLocator {
  private static TipoCaracteristicaMarshallerServiceLocator INSTANCE = new TipoCaracteristicaMarshallerServiceLocator();
  public static TipoCaracteristicaMarshallerServiceLocator getInstance() {
    return INSTANCE;
  }

  private final ObjectMapper mapper = new ObjectMapper();

  private TipoCaracteristicaMarshallerServiceLocator() {
  }

  public ObjectMapper getMapper() {
    return mapper;
  }
}
