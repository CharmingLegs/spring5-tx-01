package cn.fall.thee.charming.legs.mapper;

import cn.fall.thee.charming.legs.entity.Person;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-02-13
 */
public interface PersonMapper extends BaseMapper<Person> {

    Long selectMaxId();
}
