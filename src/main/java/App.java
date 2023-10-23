import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanWorld1 =
                (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(beanWorld1.getMessage());

        HelloWorld beanWorld2 = (HelloWorld) applicationContext.getBean("helloWorld");

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        boolean comparison1 = beanWorld1 == beanWorld2;
        System.out.println(comparison1);
        boolean comparison2 = beanCat1 == beanCat2;
        System.out.println(comparison2);

    }
}