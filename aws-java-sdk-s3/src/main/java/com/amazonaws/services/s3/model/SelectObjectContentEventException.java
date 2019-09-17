/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import com.amazonaws.SdkClientException;

/**
 * An exception generated when S3 has received and started request processing, but something goes wrong after it has started
 * returning {@link SelectObjectContentEvent}s.
 *
 * The {@link #getErrorMessage()} and {@link #getErrorMessage()} will be specified if the service has returned them.
 */
public final class SelectObjectContentEventException extends SdkClientException {
    private String errorCode;
    private String errorMessage;

    public SelectObjectContentEventException(String exceptionMessage) {
        super(exceptionMessage);
    }

    public SelectObjectContentEventException(String exceptionMessage, Exception cause) {
        super(exceptionMessage, cause);
    }

    /**
     * Retrieve a summary of the reason for the exception, including the {@link #getErrorCode()} and {@link #getErrorMessage()},
     * if the error was raised by the service.
     */
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    /**
     * A unique error code for the failure scenario encountered by the service. May be null if a code was not returned by the
     * service.
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * A human-readable error message for the failure scenario encountered by the service. May be null if a message was not
     * returned by the service.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
