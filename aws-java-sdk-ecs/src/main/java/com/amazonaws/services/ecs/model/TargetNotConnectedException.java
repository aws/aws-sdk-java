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
package com.amazonaws.services.ecs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The execute command cannot run. This error can be caused by any of the following configuration issues:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Incorrect IAM permissions
 * </p>
 * </li>
 * <li>
 * <p>
 * The SSM agent is not installed or is not running
 * </p>
 * </li>
 * <li>
 * <p>
 * There is an interface Amazon VPC endpoint for Amazon ECS, but there is not one for for Systems Manager Session
 * Manager
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to troubleshoot the issues, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-exec.html">Troubleshooting issues with ECS
 * Exec</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetNotConnectedException extends com.amazonaws.services.ecs.model.AmazonECSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TargetNotConnectedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TargetNotConnectedException(String message) {
        super(message);
    }

}
