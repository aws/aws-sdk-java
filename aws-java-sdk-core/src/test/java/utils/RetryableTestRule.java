/*
 * Copyright 2016-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package utils;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * If at first you don't succeed, try, try... try again.
 *
 * @see Retryable
 */
public class RetryableTestRule implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return statement(base, description);
    }

    private Statement statement(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Retryable annotation = description.getAnnotation(Retryable.class);
                if (annotation != null) {
                    runWithRetries(annotation.value());
                } else {
                    base.evaluate();
                }
            }

            private void runWithRetries(int maxAttempts) throws Throwable {
                Throwable error = null;
                for (int i = 0; i < maxAttempts; i++) {
                    try {
                        base.evaluate();
                        if (error != null) {
                            log("%s: Run #%s succeeded", description.getDisplayName(), i + 1);
                        }
                        return;
                    } catch (Throwable t) {
                        error = t;
                        log("%s: Run #%s failed due to: %s", description.getDisplayName(), i + 1, error);
                    }
                }
                log("%s: Retries exhausted after %s consecutive failures", description.getDisplayName(), maxAttempts);
                throw error;
            }
        };
    }

    private static void log(String format, Object... args) {
        System.err.println(String.format(format, args));
    }
}
