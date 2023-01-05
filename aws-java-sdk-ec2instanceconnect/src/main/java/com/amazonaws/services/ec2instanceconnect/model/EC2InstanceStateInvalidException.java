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
package com.amazonaws.services.ec2instanceconnect.model;

import javax.annotation.Generated;

/**
 * <p>
 * Unable to connect because the instance is not in a valid state. Connecting to a stopped or terminated instance is not
 * supported. If the instance is stopped, start your instance, and try to connect again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2InstanceStateInvalidException extends com.amazonaws.services.ec2instanceconnect.model.AWSEC2InstanceConnectException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new EC2InstanceStateInvalidException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public EC2InstanceStateInvalidException(String message) {
        super(message);
    }

}
