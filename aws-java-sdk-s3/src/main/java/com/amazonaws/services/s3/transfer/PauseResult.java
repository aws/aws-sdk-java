/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http//aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.transfer;

/**
 * The result of a pause operation.
 *
 * @param <T> information that can be used to resume the paused operation;
 * can be null if the pause failed.
 */
public final class PauseResult<T> {
    private final PauseStatus pauseStatus;
    private final T infoToResume;   // non-null only if pauseStatus == SUCCESS

    public PauseResult(PauseStatus pauseStatus, T infoToResume) {
        if (pauseStatus == null)
            throw new IllegalArgumentException();
        this.pauseStatus = pauseStatus;
        this.infoToResume = infoToResume;
    }

    public PauseResult(PauseStatus pauseStatus) {
        this(pauseStatus, null);
    }

    /**
     * Returns information about whether the pause was successful or not; and
     * if not why.
     */
    public PauseStatus getPauseStatus() {
        return pauseStatus;
    }

    /**
     * Returns the information that can be used to resume a successfully paused
     * operation.
     */
    public T getInfoToResume() {
        return infoToResume;
    }
}
