package test;


import com.bdqn.ww.mybatis.mapper.StudentsMapper;
import com.bdqn.ww.mybatis.pojo.Students;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {

    @org.junit.Test
    public void testAdd() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //SqlSession: java和数据库会话对象
        //1.创建   （包工头） 的实例
        //2.包工头建厂
        //3.生产SqlSession
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
       //生产SqlSession的工厂
        SqlSessionFactory factory = builder.build(is);
        SqlSession session = factory.openSession();
        StudentsMapper mapper = session.getMapper(StudentsMapper.class);

//        int i = mapper.addStu();
//        session.commit();${jdbc.driver}
//        System.out.println("影响了"+i+"行");
        Students students = mapper.getStudentById();
        System.out.println(students);


    }

}
