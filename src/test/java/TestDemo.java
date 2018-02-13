import com.yh.demo.activemq.producer.queue.QueueSender;
import com.yh.demo.activemq.producer.toptic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-amq.xml")
public class TestDemo {
    protected Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Autowired
    private QueueSender queueSender;
    @Autowired
    private TopicSender topicSender;

    @Test
    public void test() {
        queueSender.send("test.queue","queue111");
        topicSender.send("test.topic","topic111");
    }

    @Test
    public void test1() {
    }
}
