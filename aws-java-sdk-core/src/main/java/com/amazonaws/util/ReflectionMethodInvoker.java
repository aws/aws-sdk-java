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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * This class acts as a proxy to invoke a specific method on objects of a specific class. It will use the JDK's
 * reflection library to find and invoke the method.
 * <p>
 * The relatively expensive call to find the correct method on the class is lazy and will not be performed until the
 * first invocation or until the invoker is explicitly initialized. Once found, the method is cached so repeated
 * calls to initialize() or invoke() will not incur the reflection cost of searching for the method on the class.
 * <p>
 * Example:
 * {@code
 * ReflectionMethodInvoker<String, Integer> invoker =
 *       new ReflectionMethodInvoker<String, Integer>(String.class, Integer.class, "indexOf", String.class, int.class);
 * invoker.invoke("ababab", "ab", 1);     // This is equivalent to calling "ababab".indexOf("ab", 1);
 * }
 * @param <T> The class type that has the method to be invoked.
 * @param <R> The expected return type of the method invocation.
 */
@SdkInternalApi
public class ReflectionMethodInvoker<T, R> {
    private final Class<T> clazz;
    private final String methodName;
    private final Class<R> returnType;
    private final Class<?>[] parameterTypes;

    private Method targetMethod;

    /**
     * Construct an instance of {@code ReflectionMethodInvoker}.
     * <p>
     * This constructor will not make any reflection calls as part of initialization; i.e. no validation of the
     * existence of the given method signature will occur.
     * @param clazz The class that has the method to be invoked.
     * @param returnType The expected return class of the method invocation. The object returned by the invocation
     *                   will be cast to this class.
     * @param methodName The name of the method to invoke.
     * @param parameterTypes The classes of the parameters of the method to invoke.
     */
    public ReflectionMethodInvoker(Class<T> clazz,
                                   Class<R> returnType,
                                   String methodName,
                                   Class<?>... parameterTypes) {
        this.clazz = clazz;
        this.methodName = methodName;
        this.returnType = returnType;
        this.parameterTypes = parameterTypes;
    }

    /**
     * Attempt to invoke the method this proxy targets for on the given object with the given arguments. If the
     * invoker has not yet been initialized, an attempt to initialize the invoker will be made first. If the call
     * succeeds the invoker will be in an initialized state after this call and future calls to the same method will
     * not incur an initialization cost. If the call fails because the target method could not be found, the invoker
     * will remain in an uninitialized state after the exception is thrown.
     * @param obj The object to invoke the method on.
     * @param args The arguments to pass to the method. These arguments must match the signature of the method.
     * @return The returned value of the method cast to the 'returnType' class that this proxy was initialized with.
     * @throws NoSuchMethodException if the JVM could not find a method matching the signature specified in the
     * initialization of this proxy.
     * @throws SdkClientException if any other exception is thrown when attempting to invoke the method or by the
     * method itself. The cause of this exception will be the exception that was actually thrown.
     */
    public R invoke(T obj, Object... args) throws NoSuchMethodException {
        Method targetMethod = getTargetMethod();

        try {
            Object rawResult = targetMethod.invoke(obj, args);
            return returnType.cast(rawResult);
        } catch (IllegalAccessException e) {
            throw new SdkClientException(e);
        } catch (InvocationTargetException e) {
            throw new SdkClientException(e);
        }
    }

    /**
     * Initializes the method invoker by finding and caching the target method from the target class that will be used
     * for subsequent invoke operations. If the invoker is already initialized this call will do nothing.
     * @throws NoSuchMethodException if the JVM could not find a method matching the signature specified in the
     * initialization of this proxy.
     */
    public void initialize() throws NoSuchMethodException {
        getTargetMethod();
    }

    /**
     * Gets the initialization state of the invoker.
     * @return true if the invoker has been initialized and the method has been cached for invocation; otherwise false.
     */
    public boolean isInitialized() {
        return targetMethod != null;
    }

    private Method getTargetMethod() throws NoSuchMethodException {
        if (targetMethod != null) {
            return targetMethod;
        }

        try {
            targetMethod = clazz.getMethod(methodName, parameterTypes);
            return targetMethod;
        } catch (NullPointerException e) {
            throw new SdkClientException(e);
        }
    }
}
