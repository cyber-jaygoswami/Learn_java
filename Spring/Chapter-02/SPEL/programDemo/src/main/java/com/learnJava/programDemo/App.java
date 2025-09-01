package com.learnJava.programDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Demo d1 = (Demo)context.getBean("demoClass");
        
        System.out.println(d1.toString());
        
        // To test expressions 
        ExpressionParser parser = new SpelExpressionParser();
        
        
        // Arithmetic Operator
        System.out.println(parser.parseExpression("1+2").getValue());
        System.out.println(parser.parseExpression("1*2").getValue());
        System.out.println(parser.parseExpression("1-2").getValue());
        System.out.println(parser.parseExpression("5/2").getValue());
        
        // Boolean operators
        System.out.println(parser.parseExpression("2==2").getValue());
        System.out.println(parser.parseExpression("2==1").getValue());
        System.out.println(parser.parseExpression("2!=1").getValue());

        //Relation operators with ternary operator
        System.out.println(parser.parseExpression("22 > 18 ? 'You can vote ;)'  : 'You can not vote :('").getValue());
        System.out.println(parser.parseExpression("22 < 18 ? 'You can not vote ;)'  : 'You can vote :('").getValue());
        
        //Regular expression
        System.out.println(parser.parseExpression("'test.test@gmail.com' matches '[a-zA-Z0-9_]+@gmail.com'").getValue());
        
        
        //Variables in SPEL
        StandardEvaluationContext Econtext = new StandardEvaluationContext();
        
        
        Econtext.setVariable("username", "jay goswami");
        
        System.out.println(parser.parseExpression("#username.toUpperCase()").getValue(Econtext, String.class));
        
    }
}
