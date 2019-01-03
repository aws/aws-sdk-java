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
package com.amazonaws.services.ecs.model;

import javax.annotation.Generated;

/**
 * <p>
 * Amazon ECS is unable to determine the current version of the Amazon ECS container agent on the container instance and
 * does not have enough information to proceed with an update. This could be because the agent running on the container
 * instance is an older or custom version that does not use our version information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MissingVersionException extends com.amazonaws.services.ecs.model.AmazonECSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MissingVersionException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public MissingVersionException(String message) {
        super(message);
    }

}
