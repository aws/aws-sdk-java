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
package com.amazonaws.services.workmail.model;

import javax.annotation.Generated;

/**
 * <p>
 * You SES configuration has customizations that WorkMail cannot save. The error message lists the invalid setting. For
 * examples of invalid settings, refer to <a
 * href="https://docs.aws.amazon.com/ses/latest/APIReference/API_CreateReceiptRule.html">CreateReceiptRule</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidCustomSesConfigurationException extends com.amazonaws.services.workmail.model.AmazonWorkMailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidCustomSesConfigurationException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidCustomSesConfigurationException(String message) {
        super(message);
    }

}
