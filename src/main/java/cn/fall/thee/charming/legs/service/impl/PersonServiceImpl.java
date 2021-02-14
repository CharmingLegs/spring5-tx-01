package cn.fall.thee.charming.legs.service.impl;

import cn.fall.thee.charming.legs.entity.Person;
import cn.fall.thee.charming.legs.mapper.PersonMapper;
import cn.fall.thee.charming.legs.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-02-13
 */

@Slf4j
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Transactional
    public Boolean addPerson() {
        Boolean flag = true;
        try {
            Person person = new Person();
            Long primaryKey = checkPrimaryKey();
            person.setId(++primaryKey);
            person.setName(UUID.randomUUID().toString().substring(0, 5));
            person.setBirthday(new Date().getTime());
            person.setHeight(1.78);
            personMapper.insert(person);
            log.error("添加成功");
        } catch (Exception e) {
            log.error("error: {}", e.getMessage());
            flag = false;
        }
        return flag;
    }

    public Long checkPrimaryKey() {
        Long maxPrimaryKey = null;
        try {
            maxPrimaryKey = personMapper.selectMaxId();

        } catch (Exception e) {
            log.error("error: {}", e.getMessage());
        }
        return maxPrimaryKey;
    }
}
