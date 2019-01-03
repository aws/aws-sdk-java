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
 * There is no update available for this Amazon ECS container agent. This could be because the agent is already running
 * the latest version, or it is so old that there is no update path to the current version.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoUpdateAvailableException extends com.amazonaws.services.ecs.model.AmazonECSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new NoUpdateAvailableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public NoUpdateAvailableException(String message) {
        super(message);
    }

}
