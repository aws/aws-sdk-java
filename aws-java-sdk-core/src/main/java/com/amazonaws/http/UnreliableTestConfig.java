/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

/**
 * Used to configure the conditions for injecting content input stream failures
 * for testing purposes.
 */
class UnreliableTestConfig {
    private int maxNumErrors = 1;
    private int bytesReadBeforeException = 100;
    private boolean isFakeIOException;
    private int resetIntervalBeforeException = 2;

    int getMaxNumErrors() {
        return maxNumErrors;
    }

    int getBytesReadBeforeException() {
        return bytesReadBeforeException;
    }

    boolean isFakeIOException() {
        return isFakeIOException;
    }

    int getResetIntervalBeforeException() {
        return resetIntervalBeforeException;
    }

    UnreliableTestConfig withMaxNumErrors(int maxNumErrors) {
        this.maxNumErrors = maxNumErrors;
        return this;
    }

    UnreliableTestConfig withBytesReadBeforeException(
            int bytesReadBeforeException) {
        this.bytesReadBeforeException = bytesReadBeforeException;
        return this;
    }

    UnreliableTestConfig withFakeIOException(boolean isFakeIOException) {
        this.isFakeIOException = isFakeIOException;
        return this;
    }

    /**
     * Used to control whether an exception would be thrown based on the reset
     * recurrence; not applicable if set to zero. For example, if
     * resetIntervalBeforeException == n, the exception can only be thrown
     * before the n_th reset (or after the n_th minus 1 reset), 2n_th reset (or
     * after the 2n_th minus 1) reset), etc.
     */
    UnreliableTestConfig withResetIntervalBeforeException(
            int resetIntervalBeforeException) {
        this.resetIntervalBeforeException = resetIntervalBeforeException;
        return this;
    }
}