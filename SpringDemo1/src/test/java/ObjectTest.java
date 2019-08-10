import com.gxg.Person;
import com.gxg.UserIofo;
import com.gxg.bean.bean2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectTest {
    private ApplicationContext applicationContext = null;
    @Before
    public void testObject(){
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-bean.xml"});
    }
    @Test
    public void testMethod(){
        UserIofo userIofo = (UserIofo)applicationContext.getBean("useriofo");
        System.out.println("pName" + userIofo.getPerson().getpName());
        System.out.println("list" + userIofo.getList());
        System.out.println("data" + userIofo.getData());
    }
    @Test
    public void test1(){
        bean2 bean2 = (com.gxg.bean.bean2) applicationContext.getBean("bean2");
        System.out.println("==============bean3===========");
        System.out.println(bean2.getBean3().getId());
        System.out.println(bean2.getBean3().getUserName());
        System.out.println(bean2.getBean3().getPassword());
        System.out.println("==============bean4============");
        System.out.println(bean2.getBean4().getId());
        System.out.println(bean2.getBean4().getUserName());
        System.out.println("==============bean5==============");
        System.out.println(bean2.getBean5().getAge());

    }
}
