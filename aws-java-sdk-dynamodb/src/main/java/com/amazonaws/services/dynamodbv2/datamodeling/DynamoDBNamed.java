/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for overriding a property's DynamoDB attribute name.
 *
 * <pre class="brush: java">
 * &#064;DynamoDBNamed(&quot;InternalStatus&quot;)
 * public String getStatus()
 * </pre>
 *
 * <p>This annotation has the lowest precedence among other property/field
 * annotations where {@code attributeName} may be specified.</p>
 *
 * <p>May be used as a meta-annotation.</p>
 */
@DynamoDB
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface DynamoDBNamed {

    /**
     * Use when the name of the attribute as stored in DynamoDB should differ
     * from the name used by the getter / setter.
     */
    String value();

}
