package com.baomidou.mybatisplus.toolkit;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * @Date 2018/11/29 15:57
 */
@Slf4j
public class EntityUtils {

    public static <T> T mockBean(Class<T> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        if (null == fields || fields.length == 0) return null;
        T instance = null;
        Class<?> fieldType;
        Method method;
        try {
            instance = clazz.newInstance();
            for (Field field : fields) {
                fieldType = field.getType();
                if ((method = getMethod(field.getName(), clazz)) != null)
                    method.invoke(instance, randomValue(fieldType));
                else
                    log.error("can not find setter for property {} within class {}", field.getName(), clazz);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("mockBean of type {} failed!", clazz);
        }
        return instance;
    }

    private static <T> Method getMethod(String fieldName, Class<T> clazz) {
        return Arrays.asList(clazz.getMethods()).stream()
                .filter(method -> method.getName().equalsIgnoreCase("set" + fieldName))
                .findFirst().orElse(null);
    }

    public static <T> T randomValue(T type) {
        if (Objects.equals(type, String.class))
            return (T) RandomStringUtils.random(10, Boolean.TRUE, Boolean.FALSE);
        else if (Objects.equals(type, Date.class))
            return (T) new Date();
        else if (Objects.equals(type, Short.class))
            return (T) (Short.valueOf(RandomUtils.nextInt(0, Short.MAX_VALUE) + ""));
        else if (Objects.equals(type, Byte.class))
            return (T) (Byte.valueOf("" + RandomUtils.nextInt((byte)0, Byte.MAX_VALUE)));
        else if (Objects.equals(type, Long.class))
            return (T) (Long.valueOf(RandomUtils.nextLong(0, Long.MAX_VALUE)));
        else if (Objects.equals(type, Double.class))
            return (T) (Double.valueOf(RandomUtils.nextDouble(Double.MIN_VALUE, Double.MAX_VALUE)));
        else if (Objects.equals(type, Float.class))
            return (T) (Float.valueOf(RandomUtils.nextFloat(Float.MIN_VALUE, Float.MAX_VALUE)));
        else if (Objects.equals(type, Integer.class))
            return (T) (Integer.valueOf(RandomUtils.nextInt(0, Integer.MAX_VALUE)));
        else if (Objects.equals(type, BigDecimal.class))
            return (T) (BigDecimal.valueOf(RandomUtils.nextLong(0, Long.MAX_VALUE)));
        else if (Objects.equals(type, Boolean.class))
            return (T) Boolean.FALSE;
        else
            return null;
    }
}
