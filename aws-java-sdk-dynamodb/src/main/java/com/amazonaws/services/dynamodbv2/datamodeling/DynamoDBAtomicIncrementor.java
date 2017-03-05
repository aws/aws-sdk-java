package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a pattern for annotating fields that are numeric to apply an incremental value to the database via
 * either calling save, or by calling the mapper method incr which only applies those attributes which intend
 * to atomically increment for the specified key value.
 *
 * The default is to increment by 1 such that each time the item is saved, or each time the increment method is
 * invoked we'll update the increment.
 *
 * Created by matt@mjgreenwood.net on 3/3/17.
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DynamoDBAtomicIncrementor {
    String attributeName() default "";

    /**
     * The value to increment the attribute by upon update calls being invoked
     *
     * @return
     */
    double incr() default 1d;
}
