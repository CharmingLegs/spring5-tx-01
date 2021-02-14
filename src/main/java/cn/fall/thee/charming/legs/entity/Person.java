package cn.fall.thee.charming.legs.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-02-13
 */

@Data
@ToString
public class Person implements Serializable {

    private static final long serialVersionUID = -9091969677145255368L;

    private Long id;

    private String name;

    private Long birthday;

    private Double height;
}
