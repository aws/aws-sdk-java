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
package com.amazonaws.services.simpleworkflow.flow.core;

/**
 * Promise is a future like object that is used as a placeholder for a result of
 * an asynchronous API. Java Future is a synchronization construct that is used
 * to block a thread that called get() method if result is not available yet.
 * Promise differs from it as it cannot be used for blocking. A call to its
 * get() method throws IllegalStateException if result is not available yet. The
 * correct way to ensure that Promise is ready is to access it from a method
 * that is annotated as @Asynchronous and have the given Promise as one its
 * arguments or from {@link Task#doExecute()} method assuming that promise was
 * passed to the Task as a constructor parameter.
 * 
 * <p>
 * Promise is not linked to error handling like Future is. In case of exceptions
 * they are propagated to the {@link TryCatchFinally#doCatch(Throwable)} method
 * of the {@link TryCatchFinally} that owns the asynchronous task that failed.
 * See {@link TryCatchFinally} for more info on the error handling.
 * 
 * <p>
 * For promises that don't need a value and just used to ensure correct ordering
 * of asynchronous operations the common pattern to use {@link Void} as a
 * generic type.
 * <p>
 * 
 * @param <V>
 *            The result type returned by this Promise's get method. Use
 *            {@link Void} to represent Promise that indicates completion of
 *            operation that doesn't return a value.
 */
public abstract class Promise<V> {

    /**
     * @return result of your asynchronous computation
     * @throws IllegalStateException
     *             if result of your asynchronous computation is not available
     *             yet
     */
    public abstract V get();

    /**
     * @return <code>true</code> if the result of your asynchronous computation
     *         is available
     */
    public abstract boolean isReady();

    /**
     * @return human friendly description on what this promise represents.
     *         Emitted for example as part of
     *         {@link AsyncScope#getAsynchronousThreadDumpAsString()}
     */
    public String getDescription() {
        return null;
    }

    /**
     * Compliant implementation should notify callbacks after promise is set to
     * ready state.
     * 
     * @param callback
     *            callback to notify
     */
    protected abstract void addCallback(Runnable callback);

    protected abstract void removeCallback(Runnable callback);

    /**
     * Convenience method for creating a Promise object which is in ready state
     * and returns the passed in value when get() is called.
     * <p>
     * The same as <code>new {@link Settable}<T>(value)</code>
     * 
     * @param <T>
     *            Type of value
     * @param value
     *            Object to return when get() is called
     * @return An instance of Promise wrapper object
     */
    public static <T> Promise<T> asPromise(T value) {
        return new Settable<T>(value);
    }

    /**
     * This is a factory method to create a Promise<Void> object in ready state.
     * 
     * @return An instance of Promise object with no value.
     */
    public static Promise<Void> Void() {
        return new Settable<Void>(null);
    }

}
