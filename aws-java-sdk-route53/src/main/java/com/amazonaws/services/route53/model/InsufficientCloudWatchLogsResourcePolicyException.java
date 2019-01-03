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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * Amazon Route 53 doesn't have the permissions required to create log streams and send query logs to log streams.
 * Possible causes include the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * There is no resource policy that specifies the log group ARN in the value for <code>Resource</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The resource policy that includes the log group ARN in the value for <code>Resource</code> doesn't have the necessary
 * permissions.
 * </p>
 * </li>
 * <li>
 * <p>
 * The resource policy hasn't finished propagating yet.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsufficientCloudWatchLogsResourcePolicyException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InsufficientCloudWatchLogsResourcePolicyException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InsufficientCloudWatchLogsResourcePolicyException(String message) {
        super(message);
    }

}
