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
package com.amazonaws.services.simpleworkflow.flow.aspectj;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClock;
import com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.interceptors.AsyncExecutor;
import com.amazonaws.services.simpleworkflow.flow.interceptors.AsyncRetryingExecutor;
import com.amazonaws.services.simpleworkflow.flow.interceptors.AsyncRunnable;
import com.amazonaws.services.simpleworkflow.flow.interceptors.ExponentialRetryPolicy;

@Aspect
public class ExponentialRetryAspect {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private final class DecoratorInvocationHandler implements AsyncRunnable {

        private final ProceedingJoinPoint pjp;

        private final Settable result;

        public DecoratorInvocationHandler(ProceedingJoinPoint pjp, Settable result) {
            this.pjp = pjp;
            this.result = result;
        }

        @Override
        public void run() throws Throwable {
            if (result != null) {
                result.unchain();
                result.chain((Promise) pjp.proceed());
            } else {
                pjp.proceed();
            }
        }
    }

    @Around("execution(@com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry * *(..)) && @annotation(retryAnnotation)")
    public Object retry(final ProceedingJoinPoint pjp, ExponentialRetry retryAnnotation) throws Throwable {
        ExponentialRetryPolicy retryPolicy = createExponentialRetryPolicy(retryAnnotation);

        WorkflowClock clock = new DecisionContextProviderImpl().getDecisionContext().getWorkflowClock();
        AsyncExecutor executor = new AsyncRetryingExecutor(retryPolicy, clock);

        Settable<?> result;
        if (isVoidReturnType(pjp)) {
            result = null;
        }
        else {
            result = new Settable<Object>();
        }
        DecoratorInvocationHandler handler = new DecoratorInvocationHandler(pjp, result);
        executor.execute(handler);
        return result;
    }

    private boolean isVoidReturnType(final ProceedingJoinPoint pjp) {
        boolean isVoidReturnType = false;
        final Signature signature = pjp.getStaticPart().getSignature();
        if (signature instanceof MethodSignature) {
            final MethodSignature methodSignature = (MethodSignature) signature;
            isVoidReturnType = (methodSignature != null) ? Void.TYPE.equals(methodSignature.getReturnType()) : false;
        }
        return isVoidReturnType;
    }

    private ExponentialRetryPolicy createExponentialRetryPolicy(ExponentialRetry retryAnnotation) {

        ExponentialRetryPolicy retryPolicy = new ExponentialRetryPolicy(retryAnnotation.initialRetryIntervalSeconds()).withExceptionsToRetry(
                Arrays.asList(retryAnnotation.exceptionsToRetry())).withExceptionsToExclude(
                Arrays.asList(retryAnnotation.excludeExceptions())).withBackoffCoefficient(retryAnnotation.backoffCoefficient()).withMaximumRetryIntervalSeconds(
                retryAnnotation.maximumRetryIntervalSeconds()).withRetryExpirationIntervalSeconds(
                retryAnnotation.retryExpirationSeconds()).withMaximumAttempts(retryAnnotation.maximumAttempts());

        retryPolicy.validate();
        return retryPolicy;
    }
}
