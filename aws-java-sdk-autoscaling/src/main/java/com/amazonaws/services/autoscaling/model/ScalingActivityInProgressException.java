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
package com.amazonaws.services.autoscaling.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation can't be performed because there are scaling activities in progress.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingActivityInProgressException extends com.amazonaws.services.autoscaling.model.AmazonAutoScalingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ScalingActivityInProgressException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ScalingActivityInProgressException(String message) {
        super(message);
    }

}
