/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.clouddirectory.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates a problem that must be resolved by Amazon Web Services. This might be a transient error in which case you
 * can retry your request until it succeeds. Otherwise, go to the <a href="http://status.aws.amazon.com/">AWS Service
 * Health Dashboard</a> site to see if there are any operational issues with the service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServiceException extends com.amazonaws.services.clouddirectory.model.AmazonCloudDirectoryException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InternalServiceException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServiceException(String message) {
        super(message);
    }

}
