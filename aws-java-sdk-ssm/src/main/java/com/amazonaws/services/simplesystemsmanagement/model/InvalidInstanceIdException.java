/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The following problems can cause this exception:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You don't have permission to access the instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
 * </p>
 * </li>
 * <li>
 * <p>
 * SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
 * </p>
 * </li>
 * <li>
 * <p>
 * The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>, <code>Stopped</code>
 * , and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and <code>Terminated</code>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidInstanceIdException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidInstanceIdException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidInstanceIdException(String message) {
        super(message);
    }

}
