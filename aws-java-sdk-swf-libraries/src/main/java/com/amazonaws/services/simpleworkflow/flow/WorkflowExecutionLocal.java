/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains value that is bound to a currently executing workflow. Has the same
 * purpose as {@link ThreadLocal} which bounds value to a particular thread. It
 * is subject to the same replay rules as the rest of the workflow definition.
 */
public class WorkflowExecutionLocal<T> {

    private static class Wrapper<T> {

        public T wrapped;
    }

    /**
     * It is not good idea to rely on the fact that implementation relies on
     * ThreadLocal as it is subject to change.
     */
    private final ThreadLocal<Wrapper<T>> value = new ThreadLocal<Wrapper<T>>();

    private final static List<WorkflowExecutionLocal<?>> locals = new ArrayList<WorkflowExecutionLocal<?>>();

    /**
     * Must be called before each decision. It is not a good idea to call this
     * method from non framework code for non testing scenarios.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void before() {
        List<WorkflowExecutionLocal<?>> currentLocals;
        synchronized (locals) {
            currentLocals = new ArrayList<WorkflowExecutionLocal<?>>(locals);
        }
        for (WorkflowExecutionLocal local : currentLocals) {
            Wrapper w = new Wrapper();
            w.wrapped = local.initialValue();
            local.set(w);
        }
    }

    /**
     * Must be called at the end of each decision. It is not a good idea to call
     * this method from non framework code for non testing scenarios.
     */
    public static void after() {
        List<WorkflowExecutionLocal<?>> currentLocals;
        synchronized (locals) {
            currentLocals = new ArrayList<WorkflowExecutionLocal<?>>(locals);
        }
        for (WorkflowExecutionLocal<?> local : currentLocals) {
            local.removeAfter();
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public WorkflowExecutionLocal() {
        Wrapper w = new Wrapper();
        w.wrapped = initialValue();
        set(w);
        synchronized (locals) {
            locals.add(this);
        }
    }

    public T get() {
        Wrapper<T> w = getWrapped();
        return w.wrapped;
    }

    private Wrapper<T> getWrapped() {
        Wrapper<T> w = value.get();
        if (w == null) {
            throw new IllegalStateException("Called outside of the workflow definition code.");
        }
        return w;
    }

    public int hashCode() {
        Wrapper<T> w = getWrapped();
        return w.wrapped.hashCode();
    }

    public void remove() {
        Wrapper<T> w = getWrapped();
        w.wrapped = null;
    }

    public void set(T v) {
        Wrapper<T> w = getWrapped();
        w.wrapped = v;
    }

    private void set(Wrapper<T> w) {
        value.set(w);
    }
    
    private void removeAfter() {
        value.remove();
    }
    
    protected T initialValue() {
        return null;
    }

}
