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
package com.amazonaws.services.detective.model;

import javax.annotation.Generated;

/**
 * <p>
 * This request cannot be completed for one of the following reasons.
 * </p>
 * <ul>
 * <li>
 * <p>
 * The request would cause the number of member accounts in the behavior graph to exceed the maximum allowed. A behavior
 * graph cannot have more than 1000 member accounts.
 * </p>
 * </li>
 * <li>
 * <p>
 * The request would cause the data rate for the behavior graph to exceed the maximum allowed.
 * </p>
 * </li>
 * <li>
 * <p>
 * Detective is unable to verify the data rate for the member account. This is usually because the member account is not
 * enrolled in Amazon GuardDuty.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceQuotaExceededException extends com.amazonaws.services.detective.model.AmazonDetectiveException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ServiceQuotaExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ServiceQuotaExceededException(String message) {
        super(message);
    }

}
