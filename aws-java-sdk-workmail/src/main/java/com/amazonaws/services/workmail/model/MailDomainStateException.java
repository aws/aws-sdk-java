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
package com.amazonaws.services.workmail.model;

import javax.annotation.Generated;

/**
 * <p>
 * After a domain has been added to the organization, it must be verified. The domain is not yet verified.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MailDomainStateException extends com.amazonaws.services.workmail.model.AmazonWorkMailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MailDomainStateException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public MailDomainStateException(String message) {
        super(message);
    }

}
