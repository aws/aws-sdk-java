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
package com.amazonaws.services.resourcegroupstaggingapi.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was denied as performing this operation violates a constraint.
 * </p>
 * <p>
 * Some of the reasons in the following list might not apply to this specific API or operation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Your account must be part of an organization, and you must enable all features in AWS Organizations. <a
 * href="http://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-prereqs.html#rg-permissions">Set Up
 * Permissions</a> in the <i>AWS Resource Groups User Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * The previous report expired.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConstraintViolationException extends com.amazonaws.services.resourcegroupstaggingapi.model.AWSResourceGroupsTaggingAPIException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConstraintViolationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConstraintViolationException(String message) {
        super(message);
    }

}
