import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сравнение bean helloworld по ссылке - " + (bean == bean1));

        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatOne.getMessage());
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение bean cat по ссылке - " + (beanCatOne == beanCatTwo));

    }
}