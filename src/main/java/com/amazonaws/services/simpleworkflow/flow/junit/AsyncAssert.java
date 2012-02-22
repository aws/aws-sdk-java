/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.junit;

import org.junit.Assert;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Task;

/**
 * Similar to {@link Assert} which waits on {@link Promise} argument before
 * calling correspondent Assert... function.
 * <p>
 * To avoid overload conflicts "WaitFor" postfix is used for methods that define
 * varargs "waitFor" argument.
 * <p>
 * For example when </code>AsyncAssert.assertEquals("expected", "expected",
 * waitForMe)</code> is called Java resolves it to
 * <code>void assertEquals(final String message, final Object expected, final Promise<?> actual)</code>
 * when
 * <code>void assertEquals(final Object expected, final Object actual, Promise<?>... waitFor)</code>
 * was assumed.
 * 
 * 
 * @see Assert
 */
public class AsyncAssert {

    protected AsyncAssert() {
    }

    static public void assertReady(String message, Promise<?> condition) {
        Assert.assertTrue(message, condition.isReady());
    }

    static public void assertReady(Promise<?> condition) {
        Assert.assertTrue(condition.isReady());
    }

    static public void assertNotReady(String message, Promise<?> condition) {
        Assert.assertFalse(message, condition.isReady());
    }

    static public void assertNotReady(Promise<?> condition) {
        Assert.assertFalse(condition.isReady());
    }

    static public void assertTrueWaitFor(final String message, final boolean condition, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertTrue(message, condition);
            }
        };
    }

    static public void assertTrue(final String message, final Promise<Boolean> condition) {
        new Task(condition) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertTrue(message, condition.get());
            }
        };
    }

    static public void assertTrueWaitFor(final boolean condition, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertTrue(condition);
            }
        };
    }

    static public void assertTrue(final Promise<Boolean> condition) {
        new Task(condition) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertTrue(condition.get());
            }
        };
    }

    static public void assertFalseWaitFor(final String message, final boolean condition, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertFalse(message, condition);
            }
        };
    }

    static public void assertFalse(final String message, final Promise<Boolean> condition) {
        new Task(condition) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertFalse(message, condition.get());
            }
        };
    }

    static public void assertFalseWaitFor(final boolean condition, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertFalse(condition);
            }
        };
    }

    static public void assertFalse(final Promise<Boolean> condition) {
        new Task(condition) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertFalse(condition.get());
            }
        };
    }

    static public void assertEquals(final String message, final Object expected, final Promise<?> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(message, expected, actual.get());
            }
        };
    }

    static public void assertEqualsWaitFor(final String message, final Object expected, final Object actual,
            Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(message, expected, actual);
            }
        };
    }

    static public void assertEquals(final Object expected, final Promise<?> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(expected, actual.get());
            }
        };
    }

    static public void assertEqualsWaitFor(final Object expected, final Object actual, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(expected, actual);
            }
        };
    }

    public static void assertArrayEquals(final String message, final Object[] expected, final Object[] actual,
            Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertArrayEquals(message, expected, actual);
            }
        };
    }

    public static void assertArrayEquals(final String message, final Object[] expected, final Promise<Object[]> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertArrayEquals(message, expected, actual.get());
            }
        };
    }

    public static void assertArrayEqualsWaitFor(final Object[] expected, final Object[] actual, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertArrayEquals(expected, actual);
            }
        };
    }

    public static void assertArrayEquals(final Object[] expected, final Promise<Object[]> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertArrayEquals(expected, actual.get());
            }
        };
    }

    static public void assertEqualsWaitFor(final String message, final double expected, final double actual, final double delta,
            Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(message, expected, actual, delta);
            }
        };
    }

    static public void assertEquals(final String message, final double expected, final Promise<Double> actual, final double delta) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(message, expected, actual.get(), delta);
            }
        };
    }

    static public void assertEqualsWaitFor(final double expected, final double actual, final double delta, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(expected, actual, delta);
            }
        };
    }

    static public void assertEquals(final double expected, final Promise<Double> actual, final double delta) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertEquals(expected, actual.get(), delta);
            }
        };
    }

    static public void assertNotNullWaitFor(final String message, final Object object, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotNull(message, object);
            }
        };
    }

    /**
     * Asserts that an object Promise and its content isn't null. If it is an
     * {@link AssertionError} is thrown with the given message.
     * 
     * @param message
     *            the identifying message for the {@link AssertionError} (
     *            <code>null</code> okay)
     * @param object
     *            Object to check or <code>null</code>
     */
    static public void assertNotNull(final String message, final Promise<Object> object) {
        Assert.assertNotNull(message, object);
        new Task(object) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotNull(message, object.get());
            }
        };
    }

    static public void assertNotNullWaitFor(final Object object, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotNull(object);
            }
        };
    }

    /**
     * Asserts that an object its content isn't null.
     */
    static public void assertNotNull(final Promise<Object> object) {
        Assert.assertNotNull(object);
        new Task(object) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotNull(object.get());
            }
        };
    }

    static public void assertNullWaitFor(final String message, final Object object, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNull(message, object);
            }
        };
    }

    /**
     * Asserts that an object is not <code>null</code> while
     * <code>object.get()</code> is <code>null</code>.
     */
    static public void assertNull(final String message, final Promise<Object> object) {
        Assert.assertNotNull(object);
        new Task(object) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNull(message, object.get());
            }
        };
    }

    static public void assertNullWaitFor(final Object object, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNull(object);
            }
        };
    }

    /**
     * Asserts that an object is not <code>null</code> while
     * <code>object.get()</code> is <code>null</code>.
     */
    static public void assertNull(final Promise<Object> object) {
        Assert.assertNotNull(object);
        new Task(object) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNull(object.get());
            }
        };
    }

    static public void assertSameWaitFor(final String message, final Object expected, final Object actual, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertSame(message, expected, actual);
            }
        };
    }

    /**
     * Asserts that two Promises content refer to the same object. If they are
     * not, an {@link AssertionError} is thrown with the given message.
     */
    static public void assertSame(final String message, final Object expected, final Promise<Object> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertSame(message, expected, actual.get());
            }
        };
    }

    static public void assertSameWaitFor(final Object expected, final Object actual, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertSame(expected, actual);
            }
        };
    }

    /**
     * Asserts that two Promises content refer to the same object. If they are
     * not, an {@link AssertionError} is thrown with the given message.
     */
    static public void assertSame(final Object expected, final Promise<Object> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertSame(expected, actual.get());
            }
        };
    }

    static public void assertNotSameWaitFor(final String message, final Object expected, final Object actual,
            Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotSame(message, expected, actual);
            }
        };
    }

    /**
     * Asserts that two Promises content do not refer to the same object. If
     * they are an {@link AssertionError} is thrown with the given message.
     */
    static public void assertNotSame(final String message, final Object expected, final Promise<Object> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotSame(message, expected, actual.get());
            }
        };
    }

    static public void assertNotSameWaitFor(final Object expected, final Object actual, Promise<?>... waitFor) {
        new Task(waitFor) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotSame(expected, actual);
            }
        };
    }

    /**
     * Asserts that two Promises content do not refer to the same object. If
     * they are an {@link AssertionError} is thrown with the given message.
     */
    static public void assertNotSame(final Object expected, final Promise<Object> actual) {
        new Task(actual) {

            @Override
            protected void doExecute() throws Throwable {
                Assert.assertNotSame(expected, actual.get());
            }
        };
    }

}
