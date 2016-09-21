/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import static com.amazonaws.services.dynamodbv2.datamodeling.StandardAnnotationMaps.actualOf;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to mark a property as using a custom type-converter.
 *
 * May be annotated on a user-defined annotation to pass additional information
 * to the {@link DynamoDBTypeConverter}.
 *
 * A minimal example using getter annotations,
 * <pre class="brush: java">
 * &#064;DynamoDBTable(tableName=&quot;TestTable&quot;)
 * public class TestClass {
 *     private String key;
 *     private Currency currency;
 *
 *     &#064;DynamoDBHashKey
 *     public String getKey() { return key; }
 *     public void setKey(String key) { this.key = key; }
 *
 *     &#064;CurrencyFormat(separator=&quot; &quot;) //&lt;- user-defined annotation
 *     public Currency getCurrency() { return currency; }
 *     public void setCurrency(Currency currency) { this.currency = currency; }
 * }
 * </pre>
 *
 * With the complex type to convert:,
 * <pre class="brush: java">
 * public class Currency {
 *     private Double amount;
 *     private String unit;
 *
 *     public Double getAmount() { return amount; }
 *     public void setAmount(Double amount) { this.amount = amount; }
 *
 *     public String getUnit() { return unit; }
 *     public void setUnit(String unit) { this.unit = unit; }
 * }
 * </pre>
 *
 * And user-defined annotation,
 * <pre class="brush: java">
 * &#064;Target({ElementType.METHOD})
 * &#064;Retention(RetentionPolicy.RUNTIME)
 * &#064;DynamoDBTypeConverted(converter=CurrencyFormat.Converter.class)
 * public &#064;interface CurrencyFormat {
 *
 *     String separator() default &quot; &quot;;
 *
 *     public static final class Converter implements DynamoDBTypeConverter&lt;String,Currency&gt; {
 *         private final String separator;
 *         public Converter(final Class&lt;Currency&gt; targetType, final CurrencyFormat annotation) {
 *             this.separator = annotation.separator();
 *         }
 *         public Converter() {
 *             this.separator = &quot;|&quot;;
 *         }
 *         &#064;Override
 *         public String convert(final Currency o) {
 *             return String.valueOf(o.getAmount()) + separator + o.getUnit();
 *         }
 *         &#064;Override
 *         public Currency unconvert(final String o) {
 *             final String[] strings = o.split(separator);
 *             final Currency currency = new Currency();
 *             currency.setAmount(Double.valueOf(strings[0]));
 *             currency.setUnit(strings[1]);
 *             return currency;
 *         }
 *     }
 *
 * }
 * </pre>
 *
 * <p>Alternatively, the property/field may be annotated directly (which
 * requires the converter to provide a default constructor or a constructor
 * with only the {@code targetType}),</p>
 * <pre class="brush: java">
 * &#064;DynamoDBTypeConverted(converter=CurrencyFormat.Converter.class)
 * public Currency getCurrency() { return currency; }
 * </pre>
 *
 * <p>All converters are null-safe, a {@code null} value will never be passed
 * to {@link DynamoDBTypeConverter#convert}
 * or {@link DynamoDBTypeConverter#unconvert}.</p>
 *
 * <p>Precedence for selecting a type-converter first goes to getter annotations,
 * then field, then finally type.</p>
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBTypeConverted {

    /**
     * The class of the converter for this property.
     */
    @SuppressWarnings("rawtypes")
    Class<? extends DynamoDBTypeConverter> converter();

    /**
     * Annotation type-converter factory.
     */
    @SuppressWarnings("unchecked")
    static final class Converters {
        static <S,T> DynamoDBTypeConverter<S,T> of(Class<T> targetType, Annotation annotation) {
            DynamoDBTypeConverted converted = actualOf(DynamoDBTypeConverted.class, annotation);
            Class<DynamoDBTypeConverter<S,T>> clazz = (Class<DynamoDBTypeConverter<S,T>>)converted.converter();

            DynamoDBTypeConverter<S,T> converter = null;

            try {
                if (annotation != converted) {
                    try {
                        converter = clazz.getConstructor(Class.class, annotation.annotationType())
                            .newInstance(targetType, annotation);
                    } catch (final NoSuchMethodException no) {}
                }
                if (converter == null) {
                    try {
                        converter = clazz.getConstructor(Class.class).newInstance(targetType);
                    } catch (final NoSuchMethodException no) {
                        converter = clazz.newInstance();
                    }
                }
            } catch (final Exception e) {
                throw new DynamoDBMappingException("could not create type-converter: " + annotation, e);
            }

            return converter;
        }
    }

}
