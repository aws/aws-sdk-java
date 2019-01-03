/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

/**
 * SDK operation aborted exception.
 */
public class AbortedException extends SdkClientException {
    private static final long serialVersionUID = 1L;

    public AbortedException(String message, Throwable t) {
        super(message, t);
    }

    public AbortedException(Throwable t) {
        super("", t);
    }

    public AbortedException(String message) {
        super(message);
    }

    public AbortedException() {
        super("");
    }

    /**
     * {@inheritDoc}
     * An aborted exception is not intended to be retried.
     */
    @Override
    public boolean isRetryable() {
        return false;
    }
}
