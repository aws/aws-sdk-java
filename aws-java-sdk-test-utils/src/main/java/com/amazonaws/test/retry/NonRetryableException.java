/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Normally all exceptions are retried by {@link RetryableAction}. This is a special exception to
 * communicate the intent that a certain exception should not be retried.
 */
public class NonRetryableException extends Exception {

    public NonRetryableException(Exception e) {
        super(e);
    }

    @Override
    public Exception getCause() {
        return (Exception) super.getCause();
    }
}
