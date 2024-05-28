/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import java.lang.reflect.Field;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

/**
 * Utility class for setting the Jackson property naming strategy across different versions of jackson-databind. <br>
 *
 * @see PropertyNamingStrategy
 * @see PropertyNamingStrategies
 *
 */
public class PropertyNamingStrategyUtils {

    /**
     * Configure the provided ObjectMapper to use {@link PropertyNamingStrategies#UPPER_CAMEL_CASE}
     * or with an equivalent strategy if using older versions of Jackson.
     *
     * @param mapper The {@link ObjectMapper} to configure.
     */
    public static void configureUpperCamelCase(final ObjectMapper mapper) {
        try {
            mapper.setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE);
        } catch (LinkageError e) {
            // If a customer is using an older Jackson version than 2.12.x, fall back to the old (deprecated)
            // name for the same property that might cause deadlocks.
            final PropertyNamingStrategy opStrategy = getLegacyStrategy(e, "UPPER_CAMEL_CASE", "PASCAL_CASE_TO_CAMEL_CASE");
            if (null != opStrategy) {
                mapper.setPropertyNamingStrategy(opStrategy);
                return;
            }
            throw e;
        }
    }

    /*
     * Iterate through legacy constants and return the first one found.
     */
    static PropertyNamingStrategy getLegacyStrategy(final Throwable e, final String ... strategyConstants) {
        for(String fieldName:  strategyConstants) {
            try {
                final Field field = PropertyNamingStrategy.class.getField(fieldName);
                return (PropertyNamingStrategy)field.get(null);
            } catch(Exception e2) {
                e.addSuppressed(e2);
            }
        }
        return null;
    }

}
