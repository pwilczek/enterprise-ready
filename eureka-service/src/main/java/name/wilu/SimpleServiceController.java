package name.wilu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleServiceController {

    @RequestMapping(value = "/run/{v}")
    public String serve(@PathVariable("v") String v) {
        System.out.println("Serving incoming request!");
        return v + v;
    }

}
