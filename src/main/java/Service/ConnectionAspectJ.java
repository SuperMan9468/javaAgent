package Service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConnectionAspectJ {
     /*这里aop不起作用的原因:调用connect方法时使用的对象不是aop生成的代理对象,所以此处aop不起作用,想了很久哎*/
    //@Pointcut("execution(public * com.mysql.cj.jdbc.NonRegisteringDriver.connect(..))")//
    @Pointcut("execution(public * org.apache.commons.dbcp2.BasicDataSource.getConnection(..))")
    private void connectCutPoint(){}

    @Before("connectCutPoint()")
    private void beforeMethod(){
        System.out.println("before============");
    }

}
