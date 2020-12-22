package com.groovycoder.dvsba.comments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/comments")
public class CommentController {

    private List<String> comments = new ArrayList<>(Arrays.asList(
            "Nullam id convallis purus. Etiam egestas, mi sed accumsan lobortis, est risus rutrum elit, at consectetur arcu erat sed ipsum. Donec luctus, mauris a gravida finibus, mauris metus egestas nunc, ut semper orci nisl in tellus. Morbi hendrerit scelerisque mi, ac consectetur nibh venenatis ac. Etiam ac efficitur tortor, in suscipit massa. Nam ac libero ac ligula fringilla lacinia sed in ipsum. Proin in tempus justo, sit amet scelerisque sapien. Integer iaculis, nisl vitae rhoncus fermentum, ipsum purus sollicitudin nisl, ut porta quam turpis eu augue. In sit amet lectus at enim hendrerit congue. Aliquam nisi eros, tincidunt nec eros et, vulputate egestas massa. Proin sodales feugiat nisi, nec vulputate sem tincidunt id. In sollicitudin enim consectetur sodales aliquam.",
            "Vivamus sagittis, felis in dignissim pellentesque, enim nunc hendrerit est, in tincidunt leo metus et lectus. Donec sagittis ultricies risus at maximus. Proin ipsum odio, malesuada quis velit at, aliquet posuere ante. Nam malesuada bibendum urna sed efficitur. Quisque quis sapien ut sapien tincidunt finibus. Cras ultrices dapibus molestie. Nam dignissim massa massa, eget hendrerit dolor porttitor sagittis.",
            "Nunc accumsan, ante et tristique varius, diam metus eleifend nulla, sit amet convallis lorem justo ut ligula. Maecenas aliquet faucibus commodo."));

    @GetMapping(path = "/")
    public ModelAndView listComments() {
        Map<String, Object> model = new HashMap<>();
        model.put("comments", comments);

        return new ModelAndView(
                "views/comment/comment",
                model);
    }

    @PostMapping("/")
    public ModelAndView postComment(@RequestParam String input) {
        comments.add(input);

        Map<String, Object> model = new HashMap<>();
        model.put("comments", comments);

        return new ModelAndView(
                "views/comment/comment",
                model);
    }

}
