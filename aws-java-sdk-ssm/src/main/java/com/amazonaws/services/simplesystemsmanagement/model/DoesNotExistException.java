/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Error returned when the ID specified for a resource, such as a maintenance window or Patch baseline, doesn't exist.
 * </p>
 * <p>
 * For information about resource quotas in Systems Manager, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager Service Quotas</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DoesNotExistException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DoesNotExistException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DoesNotExistException(String message) {
        super(message);
    }

}
