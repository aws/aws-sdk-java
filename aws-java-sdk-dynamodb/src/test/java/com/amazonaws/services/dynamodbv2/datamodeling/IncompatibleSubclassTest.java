/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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

import java.util.Map;

import org.junit.Test;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * Verify that we fail fast in case of incompatible subclasses that try to
 * override the (now-removed) transformAttributes method.
 */
public class IncompatibleSubclassTest {

    @Test
    public void testCompatibleSubclass() {
        // Doesn't try to override one of the deprecated/removed
        // transformAttributes methods; should be fine.
        new CompatibleDynamoDBMapper();
    }

    @Test(expected = IllegalStateException.class)
    public void testIncompatibleSubclass1() {
        // "Overrides" transformAttributes(Class, Map); should fail fast.
        new IncompatibleDynamoDBMapper1();
    }

    @Test(expected = IllegalStateException.class)
    public void testIncompatibleSubclass2() {
        // "Overrides" transformAttributes(String, String, Map); should fail
        // fast.
        new IncompatibleDynamoDBMapper2();
    }

    private static class CompatibleDynamoDBMapper extends DynamoDBMapper {

        public CompatibleDynamoDBMapper() {
            super(null);
        }

        protected void transformAttributes(boolean innocuous) {
        }
    }

    private static class IncompatibleDynamoDBMapper1 extends DynamoDBMapper {

        public IncompatibleDynamoDBMapper1() {
            super(null);
        }

        protected Map<String, AttributeValue> transformAttributes(
                Class<?> clazz,
                Map<String, AttributeValue> attributeValues) {

            return null;
        }
    }

    private static class IncompatibleDynamoDBMapper2 extends DynamoDBMapper {

        public IncompatibleDynamoDBMapper2() {
            super(null);
        }

        protected Map<String, AttributeValue> transformAttributes(
                String hashKey,
                String rangeKey,
                Map<String, AttributeValue> attributeValues) {

            return null;
        }
    }
}
