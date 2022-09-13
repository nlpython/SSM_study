import com.yruns.config.SpringConfig;
import com.yruns.pojo.User;
import com.yruns.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = ctx.getBean(UserService.class);

//        List<User> users = userService.selectByUsername("zhangsan");
        List<User> users = userService.selectAll();
        System.out.println(users);

    }
}
