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
package com.amazonaws.services.s3.transfer;

/**
 * The status of a pause operation initiated on a {@link Upload}/
 * {@link Download}.
 */
public enum PauseStatus {

    /**
     * transfer successfully paused (and therefore the return information can be
     * used to resume the transfer later on)
     */
    SUCCESS,

    /**
     * pause is not yet applicable since transfer has not started; so no action
     * taken
     */
    NOT_STARTED,

    /**
     * pause is not yet applicable since transfer has not started AND cancel was
     * requested; so we cancel it
     */
    CANCELLED_BEFORE_START,

    /**
     * pause is not possible while transfer is already in progress; so no action
     * taken
     */
    NO_EFFECT,

    /**
     * pause is not possible while transfer is already in progress AND cancel
     * was requested; so we cancel it
     */
    CANCELLED, ;

    /**
     * Returns true if the transfer is paused else false.
     */
    public boolean isPaused() {
        return this == SUCCESS;
    }

    /**
     * Returns true if the transfer is cancelled else false.
     */
    public boolean isCancelled() {
        return this == CANCELLED || this == CANCELLED_BEFORE_START;
    }

    /**
     * Returns true if the transfer is not started or the pause operation has no
     * effect on the transfer.
     */
    public boolean unchanged() {
        return this == NOT_STARTED || this == NO_EFFECT;
    }
}
