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

import java.util.ArrayList;
import java.util.List;

/**
 * It is an implementation of Promise, which exposes an additional
 * {@link #set(Object)} and {@link #chain(Promise)} methods. Calling
 * {@link #set(Object)} puts it in ready state, with value retrievable through
 * {@link #get()} method. {@link #chain(Promise)} links state of this Settable
 * to another Promise. When another promise changes its state to ready the
 * chained one is also becomes ready.
 * 
 * <p>
 * Use <code>settable.set(null)</code> to set <code>Settable&lt;Void&gt;</code>
 * to the ready state.
 * 
 * <p>
 * Settable is frequently used to return data from code contained in anonymous
 * classes. For example:
 * 
 * <pre>
 * <code>
 * Promise&lt;Integer&gt; foo() {
 *     final Settable&lt;Integer&gt; result = new Settable&lt;Integer&gt;();
 *     new TryCatch() {
 *                            
 *         protected void doTry() throws Throwable {
 *             Promise&lt;Integer&gt; activity1Result = activities.callActivity1();
 *             result.chain(activity1Result);
 *         }
 *                            
 *         protected void doCatch(Throwable e) throws Throwable {
 *             Promise&lt;Void&gt; handled = handleFailure(e);
 *             rethrow(e, handled);
 *         }
 *      };
 *      return result;
 * }
 * </code>
 * </pre>
 * 
 * @param <V>
 *            The type of value accepted and returned by this Settable.Use
 *            {@link Void} to represent Promise that indicates completion of
 *            operation that doesn't return a value.
 */
public class Settable<V> extends Promise<V> {

    private final List<Runnable> callbacks = new ArrayList<Runnable>();

    private Runnable chainCallback;

    private Promise<V> chainedTo;

    private V value;

    private boolean ready;

    private String description;

    public Settable(V value) {
        set(value);
    }

    public Settable() {
    }

    /**
     * @return The value passed in when set() is called
     * @throws IllegalStateException
     *             If set() is never called for this instance of Settable
     */
    @Override
    public V get() {
        if (!ready) {
            throw new IllegalStateException("not ready");
        }
        return value;
    }

    /**
     * @return <code>true</code> if set() is called for this Settable
     */
    @Override
    public boolean isReady() {
        return ready;
    }

    /**
     * 
     * @param value
     *            Object to return when get() is called for this Settable. Use
     *            <code>null</code> to set <code>Settable&lt;Void&gt;</code> to
     *            the ready state.
     * @throws IllegalStateException
     *             if the Promise is already in ready state
     */
    public void set(V value) {
        if (ready) {
            throw new IllegalStateException("already set to " + this.value);
        }
        this.value = value;
        this.ready = true;
        for (Runnable callback : callbacks) {
            callback.run();
        }
    }

    /**
     * Used to chain this Settable with the passed in Promise. This allows the
     * Settable to be ready whenever the passed in Promise is ready and the
     * value for the chained Promise can be retrieved by calling get() method on
     * this Settable.
     * 
     * @see #unchain()
     * @param chainTo
     *            Promise object to chain this Settable to. Chaining to
     *            <code>null</code> equates calling {@link #set(Object)} with
     *            <code>null</code> argument.
     * @throws IllegalStateException
     *             if Settable is already in ready state or it is already
     *             chained to some other Promise
     */
    public void chain(final Promise<V> chainTo) {
        if (ready) {
            throw new IllegalStateException("already ready");
        }
        if (chainCallback != null) {
            throw new IllegalStateException("Already chained. Call unchain() to get rid of the previous chaining.");
        }
        if (chainTo == null) {
            set(null);
            return;
        }
        chainCallback = new Runnable() {

            @Override
            public void run() {
                set(chainTo.get());
            }
        };

        chainTo.addCallback(chainCallback);
        chainedTo = chainTo;
    }

    /**
     * Used to unchain this Settable from the Promise object passed in last
     * invocation of chain. There is no requirement to unchain unless there is a
     * need to chain the Settable to another Promise. Such need usually appears
     * when implementing recursive functions or in
     * {@link TryCatchFinally#doCatch(Throwable)} blocks. It is safe to call
     * unchain if chain is never called for this Settable.
     * 
     * @throws IllegalStateException
     *             If the Promise it is chained to is already in the ready state
     */
    public void unchain() {
        if (chainedTo == null) {
            return;
        }
        if (chainedTo.isReady()) {
            throw new IllegalStateException("Cannot unchain from a value which is ready");
        }
        if (chainCallback != null) {
            chainedTo.removeCallback(chainCallback);
            chainCallback = null;
            chainedTo = null;
        }
    }

    protected void addCallback(Runnable callback) {
        if (ready) {
            callback.run();
        }
        else {
            callbacks.add(callback);
        }
    }

    @Override
    protected void removeCallback(Runnable callback) {
        callbacks.remove(callback);
    }

    @Override
    public String getDescription() {
        if (description == null && chainedTo != null) {
            return chainedTo.getDescription();
        }
        return description;
    }

    /**
     * @param description
     *            human readable description of what this Promise represents.
     * @see Promise#getDescription()
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Settable [value=" + value + ", ready=" + ready + "]";
    }

}
