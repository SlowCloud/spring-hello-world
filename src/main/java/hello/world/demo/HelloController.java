package hello.world.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/world")
    public World helloworld() {
        World w = new World();
        w.name = "Mr A";
        w.phone = "010-xxxx-xxxx";
        w.address = "secret";
        return w;
    }

}
