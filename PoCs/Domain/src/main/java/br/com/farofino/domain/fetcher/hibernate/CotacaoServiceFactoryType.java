package br.com.farofino.domain.fetcher.hibernate;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.fetcher.CotacaoService;
import br.com.farofino.domain.fetcher.CotacaoServiceFactory;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

public class CotacaoServiceFactoryType implements UserType {
  private static final class CotacaoServiceFactoryProxy implements CotacaoServiceFactory {
    private final ApplicationContext context;

    private ApplicationContext getContext() {
      return context;
    }
    
    public CotacaoServiceFactoryProxy(Resource resource) {
      this.context = new GenericXmlApplicationContext(resource);
    }
    
    @Override
    public CotacaoService create(Categoria categoria) {
      return getContext().getBean(CotacaoServiceFactory.class).create(categoria);
    }
  }
  
  @Override
  public int[] sqlTypes() {
    return new int [] { Types.VARCHAR };
  }

  @Override
  public Class returnedClass() {
    return CotacaoServiceFactory.class;
  }

  @Override
  public boolean equals(Object o, Object o1) throws HibernateException {
    return o == o1;
  }

  @Override
  public int hashCode(Object o) throws HibernateException {
    return (o == null) ? null : o.hashCode();
  }

  @Override
  public Object nullSafeGet(ResultSet rs, String[] strings, SessionImplementor si, Object o) throws HibernateException, SQLException {
    try {
      String resource = rs.getString(strings[0]);
      if (resource == null) {
        return null;
      } else {
        return new CotacaoServiceFactoryProxy(new UrlResource(resource));
      }
    } catch (MalformedURLException ex) {
      throw new HibernateException(ex);
    }
  }

  @Override
  public void nullSafeSet(PreparedStatement ps, Object o, int i, SessionImplementor si) throws HibernateException, SQLException {
    throw new UnsupportedOperationException();
  }

  @Override
  public Object deepCopy(Object o) throws HibernateException {
    return o;
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public Serializable disassemble(Object o) throws HibernateException {
    return (Serializable)(o);
  }

  @Override
  public Object assemble(Serializable srlzbl, Object o) throws HibernateException {
    return srlzbl;
  }

  @Override
  public Object replace(Object o, Object o1, Object o2) throws HibernateException {
    return o;
  }
}
