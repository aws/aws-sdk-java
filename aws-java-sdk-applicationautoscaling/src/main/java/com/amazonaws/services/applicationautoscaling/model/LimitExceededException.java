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
 * Your account exceeded a limit. This exception is thrown when a per-account resource limit is exceeded. For more
 * information, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_as-app">Application Auto Scaling
 * Limits</a>.
 * </p>
 */
public class LimitExceededException extends com.amazonaws.services.applicationautoscaling.model.AWSApplicationAutoScalingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LimitExceededException(String message) {
        super(message);
    }

}
