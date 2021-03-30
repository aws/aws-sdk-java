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
package com.amazonaws.services.ec2instanceconnect.model;

import javax.annotation.Generated;

/**
 * <p>
 * The instance currently has 1 active serial console session. Only 1 session is supported at a time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SerialConsoleSessionLimitExceededException extends com.amazonaws.services.ec2instanceconnect.model.AWSEC2InstanceConnectException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new SerialConsoleSessionLimitExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public SerialConsoleSessionLimitExceededException(String message) {
        super(message);
    }

}
