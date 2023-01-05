/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import javax.annotation.Generated;

/**
 * <p>
 * Provides an extension of the AmazonServiceException for errors reported by Amazon S3 while processing a request. In
 * particular, this class provides access to the Amazon S3 extended request ID. If Amazon S3 is incorrectly handling a
 * request and you need to contact Amazon, this extended request ID may provide useful debugging information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Exception extends com.amazonaws.services.securitylake.model.AmazonSecurityLakeException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new S3Exception with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public S3Exception(String message) {
        super(message);
    }

}
