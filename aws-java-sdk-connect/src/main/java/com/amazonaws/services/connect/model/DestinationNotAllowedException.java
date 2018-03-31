/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import javax.annotation.Generated;

/**
 * <p>
 * Outbound calls to the destination number are not allowed for your instance. You can request that the country be
 * included in the allowed countries for your instance by submitting a <a
 * href="https://console.aws.amazon.com/support/v1#/case/create?issueType=service-limit-increase">Service Limit
 * Increase</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationNotAllowedException extends com.amazonaws.services.connect.model.AmazonConnectException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DestinationNotAllowedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DestinationNotAllowedException(String message) {
        super(message);
    }

}
