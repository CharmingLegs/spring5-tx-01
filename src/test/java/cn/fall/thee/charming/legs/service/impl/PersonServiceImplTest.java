package cn.fall.thee.charming.legs.service.impl;

import cn.fall.thee.charming.legs.config.PersonConfiguration;
import cn.fall.thee.charming.legs.service.IPersonService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-02-13
 */
public class PersonServiceImplTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfiguration.class);
        IPersonService personService = (IPersonService) applicationContext.getBean("personServiceImpl");
        personService.addPerson();
    }
}