package soundsystem.model;

import org.springframework.stereotype.Component;

/**
 * Created by zhaojiaojiao on 5/11/18.
 */
@Component
public class SgtPeppers implements CompactDisc {
    public void play() {
        System.out.println("playing sgtpeppers");
    }
}
