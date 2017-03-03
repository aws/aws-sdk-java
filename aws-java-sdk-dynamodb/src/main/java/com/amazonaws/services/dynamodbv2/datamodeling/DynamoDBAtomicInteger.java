package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by magrnw on 3/3/17.
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBAtomicInteger {
    String attributeName() default "";

    /**
     * The value to increment the attribute by upon update calls being invoked
     *
     * @return
     */
    int incr() default 1;
}
