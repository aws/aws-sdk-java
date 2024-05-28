/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chatbot.model;

import javax.annotation.Generated;

/**
 * Customer/consumer-facing internal service exception.
 * https://w.amazon.com/index.php/AWS/API_Standards/Exceptions#InternalServiceError
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServiceErrorException extends com.amazonaws.services.chatbot.model.AWSChatbotException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InternalServiceErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalServiceErrorException(String message) {
        super(message);
    }

}
