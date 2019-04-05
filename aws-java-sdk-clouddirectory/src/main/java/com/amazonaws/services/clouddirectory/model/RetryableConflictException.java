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
 * Occurs when a conflict with a previous successful write is detected. For example, if a write operation occurs on an
 * object and then an attempt is made to read the object using “SERIALIZABLE” consistency, this exception may result.
 * This generally occurs when the previous write did not have time to propagate to the host serving the current request.
 * A retry (with appropriate backoff logic) is the recommended response to this exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryableConflictException extends com.amazonaws.services.clouddirectory.model.AmazonCloudDirectoryException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new RetryableConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RetryableConflictException(String message) {
        super(message);
    }

}
