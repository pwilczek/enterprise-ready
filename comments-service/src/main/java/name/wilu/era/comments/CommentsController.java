package name.wilu.era.comments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentsController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam("comment") String comment) {
        //TODO introduce some enterprise logging
        System.out.println("Incoming new comment to handle! -> " + comment);
        return "cool!";
    }

}
