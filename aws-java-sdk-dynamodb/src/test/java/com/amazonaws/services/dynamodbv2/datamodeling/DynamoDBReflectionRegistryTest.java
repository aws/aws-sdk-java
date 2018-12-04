/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Collection;

import org.junit.Test;

/**
 * Unit tests for {@code DynamoDBReflectionRegistry}.
 */
public class DynamoDBReflectionRegistryTest {

    /**
     * The reflection reflection for testing.
     */
    private final DynamoDBReflectionRegistry reflection = new DynamoDBReflectionRegistry();


    /**
     * Test the test class.
     */
    @Test
    public void testTestClass() {
        final Collection<DynamoDBReflectionRegistry.BeanProperty> beanProperties = reflection.beanPropertiesOf(TestClass.class);
        assertEquals(48, beanProperties.size());
        for (final DynamoDBReflectionRegistry.BeanProperty beanProperty : beanProperties) {
            assertNotNull(beanProperty.getGetter());
            assertNotNull(beanProperty.getSetter());
            assertNull(beanProperty.getField());
            assertNotNull(beanProperty.getGetterType());
            assertNotNull(beanProperty.getSetterType());
            assertNotNull(beanProperty.getFieldName());
        }
    }

}
