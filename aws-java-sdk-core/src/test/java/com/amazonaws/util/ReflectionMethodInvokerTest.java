/*
 * Copyright (c) 2019. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.amazonaws.SdkClientException;

@RunWith(MockitoJUnitRunner.class)
public class ReflectionMethodInvokerTest {
    private final InvokeTestClass invokeTestInstance = new InvokeTestClass();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void invokeCanInvokeMethodAndReturnsCorrectResult() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "indexOf",
                                                         String.class,
                                                         int.class);

        assertThat(invoker.invoke("ababab", "ab", 1), is(2));
    }

    @Test
    public void invokeCanReturnVoid() throws Exception {
        ReflectionMethodInvoker<InvokeTestClass, Void> invoker =
            new ReflectionMethodInvoker<InvokeTestClass, Void>(InvokeTestClass.class,
                                                               Void.class,
                                                               "happyVoid");

        invoker.invoke(invokeTestInstance);
    }

    @Test
    public void invokeThrowsNoSuchMethodExceptionWhenMethodSignatureNotFound() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "foo",
                                                         String.class,
                                                         int.class);

        exception.expect(NoSuchMethodException.class);
        invoker.invoke("ababab", "ab", 1);
    }

    @Test
    public void invoke_callThrowsNullPointerException_throwsAsSdkException() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         null,
                                                         String.class,
                                                         int.class);

        exception.expect(SdkClientException.class);
        exception.expectCause(Matchers.<NullPointerException>instanceOf(NullPointerException.class));
        invoker.invoke("ababab", "ab", 1);
    }

    @Test
    public void invoke_invokedMethodThrowsException_throwsAsSdkException() throws Exception {
        ReflectionMethodInvoker<InvokeTestClass, Void> invoker =
            new ReflectionMethodInvoker<InvokeTestClass, Void>(InvokeTestClass.class,
                                                               Void.class,
                                                               "throwsException");
        exception.expect(SdkClientException.class);
        exception.expectCause(Matchers.<InvocationTargetException>instanceOf(InvocationTargetException.class));
        invoker.invoke(invokeTestInstance);
    }

    @Test
    public void invoke_invokePrivateMethod_throwsNoSuchMethodException() throws Exception {
        ReflectionMethodInvoker<InvokeTestClass, Void> invoker =
            new ReflectionMethodInvoker<InvokeTestClass, Void>(InvokeTestClass.class,
                                                               Void.class,
                                                               "illegalAccessException");
        exception.expect(NoSuchMethodException.class);
        invoker.invoke(invokeTestInstance);
    }

    // This test assumes that the result of getMethod() may have been cached, and therefore asserts the correctness of
    // a simple cache put and get.
    @Test
    public void invoke_canBeCalledMultipleTimes() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "indexOf",
                                                         String.class,
                                                         int.class);

        assertThat(invoker.invoke("ababab", "ab", 1), is(2));
        assertThat(invoker.invoke("ababab", "ab", 1), is(2));
    }

    @Test
    public void initialize_methodNotFound_throwsMethodNotFoundException() throws NoSuchMethodException {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "foo",
                                                         String.class,
                                                         int.class);
        exception.expect(NoSuchMethodException.class);
        invoker.initialize();
    }

    @Test
    public void isInitialized_methodFoundAndInitialized_returnsTrue() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "indexOf",
                                                         String.class,
                                                         int.class);

        invoker.initialize();

        assertThat(invoker.isInitialized(), is(true));
    }

    @Test
    public void isInitialized_methodFoundAndNotInitialized_returnsFalse() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "indexOf",
                                                         String.class,
                                                         int.class);

        assertThat(invoker.isInitialized(), is(false));
    }

    @Test
    public void isInitialized_methodNotFoundAndInitialized_returnsFalse() throws Exception {
        ReflectionMethodInvoker<String, Integer> invoker =
            new ReflectionMethodInvoker<String, Integer>(String.class,
                                                         Integer.class,
                                                         "foo",
                                                         String.class,
                                                         int.class);

        try {
            invoker.initialize();
            fail("Excepted NoSuchMethodException to be thrown");
        } catch (NoSuchMethodException ignored) {

        }

        assertThat(invoker.isInitialized(), is(false));
    }

    public static class InvokeTestClass {
        public void throwsException() {
            throw new RuntimeException();
        }

        private void illegalAccessException() {
            // should never get here
        }

        public void happyVoid() {
        }
    }
}