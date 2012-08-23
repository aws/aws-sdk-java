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
package com.amazonaws.services.simpleworkflow.flow.aspectj;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.annotations.NoWait;
import com.amazonaws.services.simpleworkflow.flow.annotations.Wait;
import com.amazonaws.services.simpleworkflow.flow.core.AndPromise;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

@Aspect
public class AsynchronousAspect {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Around("call(@com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous * *(..)) && @annotation(asynchronousAnnotation)")
    public Object makeAsynchronous(ProceedingJoinPoint pjp, Asynchronous asynchronousAnnotation) throws Throwable {
        final Signature signature = pjp.getStaticPart().getSignature();
        if (signature instanceof MethodSignature) {
            final MethodSignature methodSignature = (MethodSignature) signature;
            int i = 0;
            Object[] methodArguments = pjp.getArgs();
            Annotation[][] parameterAnnotations = methodSignature.getMethod().getParameterAnnotations();
            List<Promise> valueParams = new ArrayList<Promise>();
            for (final Class<?> parameterType : methodSignature.getParameterTypes()) {
                if ((isPromise(parameterType) || isPromiseArray(parameterType) || (isCollection(parameterType) && hasWaitAnnotation(parameterAnnotations[i])))
                        && !hasNoWaitAnnotation(parameterAnnotations[i])) {
                    Object param = methodArguments[i];
                    if (isPromise(parameterType)) {
                        valueParams.add((Promise) param);
                    }
                    else if (isCollection(parameterType)) {
                        valueParams.add(new AndPromise((Collection) param));
                    }
                    else {
                        valueParams.add(new AndPromise((Promise[]) param));
                    }
                } else {
                    valueParams.add(null);
                }
                i++;
            }

            Promise[] values = valueParams.toArray(new Promise[0]);
            Boolean daemon = asynchronousAnnotation.daemon() ? true : null;
            AsynchronousAspectTask task = new AsynchronousAspectTask(daemon, pjp, values);
            return task.getReturnValue();
        }

        return pjp.proceed();
    }

    private static boolean isPromise(Class<?> clazz) {
        return Promise.class.isAssignableFrom(clazz);
    }

    private static boolean isCollection(Class<?> clazz) {
        return Collection.class.isAssignableFrom(clazz);
    }

    private static boolean isPromiseArray(Class<?> clazz) {
        if (!clazz.isArray()) {
            return false;
        }
        Class<?> elementType = clazz.getComponentType();
        return isPromise(elementType);
    }

    private static boolean hasWaitAnnotation(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().equals(Wait.class)) {
                return true;
            }
        }

        return false;
    }

    private static boolean hasNoWaitAnnotation(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            if (annotation.annotationType().equals(NoWait.class)) {
                return true;
            }
        }

        return false;
    }
}
