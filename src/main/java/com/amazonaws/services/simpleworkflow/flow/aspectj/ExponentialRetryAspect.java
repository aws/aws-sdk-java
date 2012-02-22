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

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.interceptors.ExponentialRetryPolicy;
import com.amazonaws.services.simpleworkflow.flow.interceptors.RetryCallable;
import com.amazonaws.services.simpleworkflow.flow.interceptors.RetryInterceptor;
import com.amazonaws.services.simpleworkflow.flow.interceptors.RetryInterceptorWithResult;
import com.amazonaws.services.simpleworkflow.flow.interceptors.RetryInterceptorVoid;

@Aspect
public class ExponentialRetryAspect {
    
    @Around("execution(@com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry * *(..)) && @annotation(retryAnnotation)")
    public Object retry(final ProceedingJoinPoint pjp, ExponentialRetry retryAnnotation) throws Throwable {
        ExponentialRetryPolicy retryPolicy = createExponentialRetryPolicy(retryAnnotation);
        
        @SuppressWarnings("rawtypes")
        RetryCallable retryCallable = new RetryCallable() {
            
            @Override
            public Promise call() throws Throwable {
                return (Promise) pjp.proceed();
            }
        };
        
        boolean isVoidReturnType = false;
        final Signature signature = pjp.getStaticPart().getSignature();
        if (signature instanceof MethodSignature) {
            final MethodSignature methodSignature = (MethodSignature) signature;
            isVoidReturnType = (methodSignature != null) ? Void.TYPE.equals(methodSignature.getReturnType()) : false;
        }
        
        RetryInterceptor interceptor = null;
        if (isVoidReturnType) {
            interceptor = new RetryInterceptorVoid(retryCallable, retryPolicy);
        } else {
            interceptor = new RetryInterceptorWithResult(retryCallable, retryPolicy);
        }
        
        return interceptor.execute();
    }
    
    private ExponentialRetryPolicy createExponentialRetryPolicy(ExponentialRetry retryAnnotation) {
        
        ExponentialRetryPolicy retryPolicy = new ExponentialRetryPolicy(retryAnnotation.initialRetryIntervalSeconds())
            .withExceptionsToRetry(Arrays.asList(retryAnnotation.exceptionsToRetry()))
            .withExceptionsToExclude(Arrays.asList(retryAnnotation.excludeExceptions()))
            .withBackoffCoefficient(retryAnnotation.backoffCoefficient())
            .withMaximumRetryIntervalSeconds(retryAnnotation.maximumRetryIntervalSeconds())
            .withRetryExpirationIntervalSeconds(retryAnnotation.retryExpirationSeconds())
            .withMaximumAttempts(retryAnnotation.maximumAttempts());

        retryPolicy.validate();
        return retryPolicy;
    }
}
