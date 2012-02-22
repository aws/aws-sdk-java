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
package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class RetryDecorator implements Decorator {
    
    private final RetryPolicy retryPolicy;
    
    public RetryDecorator(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public final <V> V decorate(Class<V> interfaces, V object) {

        Class<?>[] interfazes = {interfaces};

        return (V)Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                interfazes,
                new DecoratorInvocationHandler(object, retryPolicy));

    }

    @SuppressWarnings("unchecked")
    @Override
    public final <V> V decorate(Class<?>[] interfaces, V object) {

        return (V)Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                interfaces,
                new DecoratorInvocationHandler(object, retryPolicy));
    }
    
    private final class DecoratorInvocationHandler implements InvocationHandler {
        
        private final Object object;
        private final RetryPolicy retryPolicy;


        public DecoratorInvocationHandler(Object object, RetryPolicy retryPolicy) {
            this.object = object;
            this.retryPolicy = retryPolicy;
        }

        @Override
        public Object invoke(Object proxy, final Method method, final Object[] args) throws Throwable {
            try {
                if (!isDecorated(method, args)) {
                    return method.invoke(object, args);
                }
            } catch (InvocationTargetException ite) {
                throw ite.getTargetException();
            }
            
            @SuppressWarnings("rawtypes")
            RetryCallable retryCallable = new RetryCallable() {
                
                @Override
                public Promise call() throws Throwable {
                    return (Promise) method.invoke(object, args);
                }
            };
            
            boolean isVoidReturnType = Void.TYPE.equals(method.getReturnType());
            RetryInterceptor interceptor = null;
            if (isVoidReturnType) {
                interceptor = new RetryInterceptorVoid(retryCallable, retryPolicy);
            } else {
                interceptor = new RetryInterceptorWithResult(retryCallable, retryPolicy);
            }
            
            return interceptor.execute();
        }
    }
    
    protected boolean isDecorated(Method method, Object[] args) {
        return !method.getDeclaringClass().equals(Object.class);
    }
}
