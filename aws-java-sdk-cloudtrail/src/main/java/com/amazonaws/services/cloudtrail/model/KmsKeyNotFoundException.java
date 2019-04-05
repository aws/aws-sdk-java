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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * This exception is thrown when the KMS key does not exist, or when the S3 bucket and the KMS key are not in the same
 * region.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsKeyNotFoundException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new KmsKeyNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KmsKeyNotFoundException(String message) {
        super(message);
    }

}
