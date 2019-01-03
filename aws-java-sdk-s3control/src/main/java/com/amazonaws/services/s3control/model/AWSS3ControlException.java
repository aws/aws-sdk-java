/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import com.amazonaws.http.HttpResponseHandler;

/**
 * Base exception for all service exceptions thrown by AWS S3 Control
 */
public class AWSS3ControlException extends com.amazonaws.AmazonServiceException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AWSS3ControlException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AWSS3ControlException(String message) {
        super(message);
    }

    /**
     * @return The extended request ID if available. This is needed in addition to {@link #getRequestId()} to
     * troubleshoot requests with the S3 service team.
     */
    public String getExtendedRequestId() {
        return getHttpHeaders().get(HttpResponseHandler.X_AMZN_EXTENDED_REQUEST_ID_HEADER);
    }
}
