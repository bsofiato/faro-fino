package br.com.farofino.domain.produto.hibernate;

import br.com.farofino.domain.produto.Produto;
import br.com.farofino.domain.produto.ProdutoRepository;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public class ProdutoUserType implements UserType {
  
  private final ProdutoRepository repository;

  private ProdutoRepository getRepository() {
    return repository;
  }

  public ProdutoUserType(ProdutoRepository repository) {
    this.repository = repository;
  }
  
  @Override
  public int[] sqlTypes() {
    return new int [] { Types.VARCHAR };
  }

  @Override
  public Class returnedClass() {
    return Produto.class;
  }

  @Override
  public boolean equals(Object o, Object o1) throws HibernateException {
    if (o == o1) {
      return true;
    } else if (o == null) {
      return false;
    } else {
      return o.equals(o1);
    }
  }

  @Override
  public int hashCode(Object o) throws HibernateException {
    return (o == null) ? 0 : o.hashCode();
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public Object nullSafeGet(ResultSet rs, String[] columns, SessionImplementor si, Object o) throws HibernateException, SQLException {
    String id = rs.getString(columns[0]);
    if (id == null) {
      return null;
    } else {
      return getRepository().findOne(id);
    }
  }

  @Override
  public void nullSafeSet(PreparedStatement ps, Object o, int i, SessionImplementor si) throws HibernateException, SQLException {
    if (o == null) {
      ps.setNull(i, Types.VARCHAR);
    } else {
      ps.setString(i, ((Produto)(o)).getID());
    }
  }

  @Override
  public Object deepCopy(Object o) throws HibernateException {
    return o;
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
