package test.com.legend.springmvc.quickstart;

import com.legend.springmvc.quickstart.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by allen on 22/12/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class DemoServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    DemoService demoService;

    @Test
    public void demoTest() {
        assertEquals("Demo: " + "allen", demoService.demo("allen"));
    }
}
