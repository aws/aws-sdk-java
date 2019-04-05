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
package com.amazonaws.services.iotjobsdataplane.model;

import javax.annotation.Generated;

/**
 * <p>
 * The contents of the request were invalid. For example, this code is returned when an UpdateJobExecution request
 * contains invalid status details. The message contains details about the error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.iotjobsdataplane.model.AWSIoTJobsDataPlaneException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

}
