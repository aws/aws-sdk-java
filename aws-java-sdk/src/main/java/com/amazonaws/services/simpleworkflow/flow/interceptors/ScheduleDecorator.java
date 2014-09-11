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
package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.TryFinally;

/**
 * Repeats every call to a wrapped object method according to provided schedule.
 * If {@link RetryPolicy} is provided calls that fail are retried according to
 * it. Retry count is reset at each scheduled invocation.
 * 
 * @author fateev
 */
public class ScheduleDecorator implements Decorator {


    private final class DecoratorInvocationHandler implements InvocationHandler {

        private final Object object;

        public DecoratorInvocationHandler(Object object) {
            this.object = object;
        }

        @Override
        public Object invoke(Object proxy, final Method method, final Object[] args) throws Throwable {
            try {
                if (!isDecorated(method, args)) {
                    return method.invoke(object, args);
                }
            }
            catch (InvocationTargetException ite) {
                throw ite.getTargetException();
            }
            Class<?> returnType = method.getReturnType();
            boolean isVoidReturnType = Void.TYPE.equals(returnType);
            final Settable<Object> result = isVoidReturnType ? null : new Settable<Object>();
            new TryFinally() {

                Object r;

                @Override
                protected void doTry() throws Throwable {
                    scheduledExecutor.execute(new AsyncRunnable() {

                        @Override
                        public void run() throws Throwable {
                            try {
                                r = method.invoke(object, args);
                            }
                            catch (InvocationTargetException ite) {
                                throw ite.getTargetException();
                            }
                        }
                    });
                }

                @Override
                protected void doFinally() throws Throwable {
                    if (result != null) {
                        result.set(r);
                    }
                }

            };
            return result;
        }
    }
    
    private final AsyncScheduledExecutor scheduledExecutor;

    public ScheduleDecorator(InvocationSchedule schedule, WorkflowClock clock) {
        scheduledExecutor = new AsyncScheduledExecutor(schedule, clock);
    }

    public ScheduleDecorator(InvocationSchedule schedule) {
        this(schedule, new DecisionContextProviderImpl().getDecisionContext().getWorkflowClock());
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public final <V> V decorate(Class<V> interfaces, V object) {
        Class<?>[] interfazes = { interfaces };
        return (V) Proxy.newProxyInstance(object.getClass().getClassLoader(), interfazes, new DecoratorInvocationHandler(object));
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <V> V decorate(Class<?>[] interfaces, V object) {

        return (V) Proxy.newProxyInstance(object.getClass().getClassLoader(), interfaces, new DecoratorInvocationHandler(object));
    }

    private boolean isDecorated(Method method, Object[] args) {
        return !method.getDeclaringClass().equals(Object.class);
    }
}
