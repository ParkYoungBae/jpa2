package net.codejava.customer;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CustomerDAO {

    private SqlSession sqlSession;
    private static final String namespace = "mybatis.CUSTOMER";

    @Autowired
    public CustomerDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public ArrayList selectAll() {
        ArrayList list = (ArrayList)sqlSession.selectList(namespace + ".SEARCH");
        return list;
    }

}
