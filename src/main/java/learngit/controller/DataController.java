package learngit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sml
 * 2020/08/15 23:49
 */
@Controller
@RequestMapping("model-data")
public class DataController {
    @GetMapping("data-page")
    @ResponseBody
    public ModelAndView dataPage() {
        ModelAndView mv = new ModelAndView("data/demo");
        return mv;
    }
}
