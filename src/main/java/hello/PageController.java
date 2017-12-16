package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping
public class PageController {

    @RequestMapping("/home")
    public Object home(Map<String,Object> model){
        model.put("message","加班");
        model.put("fromUserName","袁婷婷");
        model.put("toUserName","chenmh");
        return "home";
    }

}
