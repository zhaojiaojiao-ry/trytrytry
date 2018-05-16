package soundsystem.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zhaojiaojiao on 5/11/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=HomeControllerConfig.class)
public class HomeControllerTest {
    @Autowired
    private HomeController controller;

    @Test
    public void testArrive() throws Exception {
        assertNotNull(controller);
        Assert.assertEquals("arrive home", controller.arrive());
    }

    @Test
    public void testInput() throws Exception {
        assertNotNull(controller);
        Assert.assertEquals("it's me", controller.input("jiaojiao"));
        Assert.assertEquals("it's you", controller.input("tom"));
    }
}