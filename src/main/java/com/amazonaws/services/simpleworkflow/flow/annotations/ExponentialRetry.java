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
package com.amazonaws.services.simpleworkflow.flow.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.amazonaws.services.simpleworkflow.flow.common.FlowDefaults;
import com.amazonaws.services.simpleworkflow.flow.interceptors.RetryDecorator;

/**
 * This annotation can be used for retrying failures on any asynchronous executions.
 * For retrying based on dynamic retry policy use {@link RetryDecorator}.
 * Both @ExponentialRetry annotation and {@link RetryDecorator} should not be
 * used simultaneously on the same asynchronous method call.
 * 
 * @author fateev, samar
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExponentialRetry {

    /**
     * Retry period to use for the first retry by ExponentialRetryPolicy. This
     * value should not be greater than values specified for maximumRetryPeriod
     * or retryExpirationPeriod.
     */
    long initialRetryIntervalSeconds();

    /**
     * Maximum retry period between attempts used by ExponentialRetryPolicy.
     * This value should not be less than value specified for
     * initialRetryPeriod. Default value is unlimited.
     */
    long maximumRetryIntervalSeconds() default FlowDefaults.EXPONENTIAL_RETRY_MAXIMUM_RETRY_INTERVAL_SECONDS;

    /**
     * Expiration period of retries used by ExponentialRetryPolicy. This value
     * should not be less than value specified for initialRetryPeriod. Default
     * value is unlimited.
     */
    long retryExpirationSeconds() default FlowDefaults.EXPONENTIAL_RETRY_RETRY_EXPIRATION_SECONDS;

    /**
     * Coefficient to use for exponential retry policy. Default is 2.0.
     */
    double backoffCoefficient() default FlowDefaults.EXPONENTIAL_RETRY_BACKOFF_COEFFICIENT;

    /**
     * Number of maximum retry attempts used by ExponentialRetryPolicy. Default
     * value is no limit.
     */
    int maximumAttempts() default FlowDefaults.EXPONENTIAL_RETRY_MAXIMUM_ATTEMPTS;

    /**
     * Default is {@link Throwable} which means that all exceptions are retried.
     */
    Class<? extends Throwable>[] exceptionsToRetry() default { Throwable.class };

    /**
     * What exceptions that match exceptionsToRetry list should be not retried.
     * Default is empty list.
     */
    Class<? extends Throwable>[] excludeExceptions() default {};

}
