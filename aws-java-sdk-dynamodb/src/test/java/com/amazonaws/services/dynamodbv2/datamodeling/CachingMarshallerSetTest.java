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

import com.amazonaws.services.dynamodbv2.datamodeling.ConversionSchemas.CachingMarshallerSet;
import com.amazonaws.services.dynamodbv2.datamodeling.ConversionSchemas.MarshallerSet;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.pojos.TestClass;

public class CachingMarshallerSetTest {

    private static class TestMarshallerSet implements MarshallerSet {

        private final Deque<ArgumentMarshaller> queue =
            new ArrayDeque<ArgumentMarshaller>();

        private final Deque<ArgumentMarshaller> memberQueue =
            new ArrayDeque<ArgumentMarshaller>();

        @Override
        public ArgumentMarshaller getMarshaller(Method getter) {
            return queue.remove();
        }

        @Override
        public ArgumentMarshaller getMemberMarshaller(Type memberType) {
            return memberQueue.remove();
        }
    }

    private static final TestMarshallerSet mock = new TestMarshallerSet();
    private static final MarshallerSet sut = new CachingMarshallerSet(mock);

    @Test
    public void testIt() throws Exception {
        ArgumentMarshaller marshaller = new ArgumentMarshaller() {
            @Override
            public AttributeValue marshall(Object value) {
                return null;
            }
        };

        mock.queue.add(marshaller);

        ArgumentMarshaller result = sut.getMarshaller(
                TestClass.class.getMethod("getString"));

        Assert.assertSame(marshaller, result);

        result = sut.getMarshaller(TestClass.class.getMethod("getString"));

        Assert.assertSame(marshaller, result);

        ArgumentMarshaller marshaller2 = new ArgumentMarshaller() {
            @Override
            public AttributeValue marshall(Object value) {
                return null;
            }
        };

        mock.queue.add(marshaller2);

        result = sut.getMarshaller(TestClass.class.getMethod("getInt"));

        Assert.assertSame(marshaller2, result);
    }
}
