/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.dynamodbv2.datamodeling.ConversionSchemas.CachingUnmarshallerSet;
import com.amazonaws.services.dynamodbv2.datamodeling.ConversionSchemas.UnmarshallerSet;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.pojos.TestClass;

public class CachingUnmarshallerSetTest {

    private static class TestUnmarshallerSet implements UnmarshallerSet {

        private final Deque<ArgumentUnmarshaller> queue =
            new ArrayDeque<ArgumentUnmarshaller>();

        private final Deque<ArgumentUnmarshaller> memberQueue =
            new ArrayDeque<ArgumentUnmarshaller>();

        @Override
        public ArgumentUnmarshaller getUnmarshaller(Method getter, Method setter) {
            return queue.remove();
        }

        @Override
        public ArgumentUnmarshaller getMemberUnmarshaller(Type type) {
            return memberQueue.remove();
        }
    }

    private static final TestUnmarshallerSet mock = new TestUnmarshallerSet();
    private static final UnmarshallerSet sut = new CachingUnmarshallerSet(mock);

    @Test
    public void testIt() throws Exception {
        ArgumentUnmarshaller unmarshaller = new ArgumentUnmarshaller() {
            @Override
            public void typeCheck(AttributeValue value, Method setter) {
            }

            @Override
            public Object unmarshall(AttributeValue value) {
                return null;
            }
        };

        mock.queue.add(unmarshaller);

        ArgumentUnmarshaller result = sut.getUnmarshaller(
                TestClass.class.getMethod("getString"),
                TestClass.class.getMethod("setString", String.class));

        Assert.assertSame(unmarshaller, result);

        result = sut.getUnmarshaller(
                TestClass.class.getMethod("getString"),
                TestClass.class.getMethod("setString", String.class));

        Assert.assertSame(unmarshaller, result);

        ArgumentUnmarshaller unmarshaller2 = new ArgumentUnmarshaller() {
            @Override
            public void typeCheck(AttributeValue value, Method setter) {
            }

            @Override
            public Object unmarshall(AttributeValue value) {
                return null;
            }
        };

        mock.queue.add(unmarshaller2);

        result = sut.getUnmarshaller(
                TestClass.class.getMethod("getInt"),
                TestClass.class.getMethod("setInt", int.class));

        Assert.assertSame(unmarshaller2, result);
    }
}
