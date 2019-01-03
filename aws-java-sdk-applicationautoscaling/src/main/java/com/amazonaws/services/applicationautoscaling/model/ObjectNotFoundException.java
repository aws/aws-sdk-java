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
package com.amazonaws.services.applicationautoscaling.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified object could not be found. For any operation that depends on the existence of a scalable target, this
 * exception is thrown if the scalable target with the specified service namespace, resource ID, and scalable dimension
 * does not exist. For any operation that deletes or deregisters a resource, this exception is thrown if the resource
 * cannot be found.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectNotFoundException extends com.amazonaws.services.applicationautoscaling.model.AWSApplicationAutoScalingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ObjectNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ObjectNotFoundException(String message) {
        super(message);
    }

}
