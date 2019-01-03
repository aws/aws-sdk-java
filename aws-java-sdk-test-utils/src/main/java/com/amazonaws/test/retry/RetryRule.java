/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.test.retry;

import com.amazonaws.util.ValidationUtils;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.concurrent.TimeUnit;

public class RetryRule implements TestRule {

    private int maxRetryAttempts;
    private long delay;
    private TimeUnit timeUnit;

    public RetryRule(int maxRetryAttempts) {
        this(maxRetryAttempts, 0, TimeUnit.SECONDS);
    }

    public RetryRule(int maxRetryAttempts, long delay, TimeUnit timeUnit) {
        this.maxRetryAttempts = maxRetryAttempts;
        this.delay = delay;
        this.timeUnit = ValidationUtils.assertNotNull(timeUnit, "timeUnit");
    }

    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                retry(base, 1);
            }

            public void retry(final Statement base, int attempts) throws Throwable {
                    try {
                        base.evaluate();
                    } catch (Exception e) {
                        if(attempts > maxRetryAttempts) {
                            throw e;
                        }
                        System.out.println("Test failed. Retrying with delay of: " + delay + " " + timeUnit);
                        timeUnit.sleep(delay);
                        retry(base, ++attempts);
                    }
                }
        };
    }
}
