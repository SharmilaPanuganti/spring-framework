package cgg.springdemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    // BeanFactory factory = new XmlBeanFactory(
    //   new FileSystemResource("spring.xml")
    // );
    ApplicationContext context = new ClassPathXmlApplicationContext(
      "spring-config.xml"
    );

    // Triangle t = context.getBean("triange1", Triangle.class);
    // Shape t = context.getBean("triange1", Shape.class);
    Shape c = context.getBean("circle", Shape.class);
    // String[] aliases = context.getAliases("parenttriangle");
    // for (String string : aliases) {
    //   System.out.println(string);
    // }
    // System.out.println(context.getType("parenttriangle"));
    // t.setType("Right angled");
    // t.draw();
    c.draw();
    //   OrgInfo org = context.getBean("orginfo", OrgInfo.class);
    //   // org.display();
    //   Map<Integer, Point> pointMap = org.getPointMap();
    //   Set<Entry<Integer, Point>> entrySet = pointMap.entrySet();
    //   for (Entry<Integer, Point> entry : entrySet) {
    //     Point p = entry.getValue();
    //     System.out.println(p.getX() + ", " + p.getY());
    //   }
    //   Properties info = org.getInfo();
    //   Set<Entry<Object, Object>> entrySet2 = info.entrySet();
    //   for (Entry<Object, Object> entry : entrySet2) {
    //     System.out.println(entry.getValue());
    //   }
    //   ((AbstractApplicationContext) context).close();
    //   // Message bean = context.getBean("msg", Message.class);
    //   // System.out.println(context.getType("msg"));
  }
}
