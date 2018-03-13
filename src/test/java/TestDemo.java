import com.yh.demo.activemq.producer.queue.QueueSender;
import com.yh.demo.activemq.producer.toptic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-amq.xml")
public class TestDemo {
    protected Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Autowired
    private QueueSender queueSender;
    @Autowired
    private TopicSender topicSender;

    private List<Integer> list = Arrays.asList( 1, 2, 3 );

    @Test
    public void test() {

        queueSender.send("test.queue","queue111");
        topicSender.send("test.topic","topic111");
    }

    /**
     * lambda表达式
     */
    @Test
    public void test1() {
       // list.forEach(System.out::println);
      //  list.forEach(a-> System.out.println(a));
        //.Stream函数式操作流元素集合
    /*    list.stream().filter(term -> term!=null)
                .distinct()
                .mapToInt(num -> num*2)
               // .peek(System.out::println)
                .forEach(System.out::println);*/

    }
}
