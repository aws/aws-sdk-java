/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Failed access to resources caused an exception. This exception currently only applies to
 * <a>DescribeScalingPolicies</a>. It is thrown when Application Auto Scaling is unable to retrieve the alarms
 * associated with a scaling policy due to a client error, for example, if the role ARN specified for a scalable target
 * does not have the proper permissions to call the CloudWatch <a
 * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html">DescribeAlarms</a> API
 * operation on behalf of your account.
 * </p>
 */
public class FailedResourceAccessException extends com.amazonaws.services.applicationautoscaling.model.AWSApplicationAutoScalingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new FailedResourceAccessException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FailedResourceAccessException(String message) {
        super(message);
    }

}
