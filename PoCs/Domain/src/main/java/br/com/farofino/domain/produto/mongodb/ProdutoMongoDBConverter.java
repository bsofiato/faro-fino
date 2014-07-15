package br.com.farofino.domain.produto.mongodb;

import br.com.farofino.domain.produto.Produto;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.HashMap;
import java.util.Map;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;

public class ProdutoMongoDBConverter implements Converter <Produto, DBObject>{

  @Override
  public DBObject convert(Produto s) {
    DBObject object = new BasicDBObject();
    Map <String, Object> caracteristicas = new HashMap <String, Object> ();
    object.put("nome", s.getNome());
    object.put("descricao", s.getDescricao());
    object.put("caracteristicas", caracteristicas);
    object.put("categoria", (s.getCategoria() == null) ? null : s.getCategoria().getID());
    
    s.getCaracteristicas().forEach((k, v) -> caracteristicas.put(k.getNome(), v));
    return object;
  }
  
}
