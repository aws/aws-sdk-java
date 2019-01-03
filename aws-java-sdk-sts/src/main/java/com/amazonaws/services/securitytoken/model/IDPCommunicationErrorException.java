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
package com.amazonaws.services.securitytoken.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request could not be fulfilled because the non-AWS identity provider (IDP) that was asked to verify the incoming
 * identity token could not be reached. This is often a transient error caused by network conditions. Retry the request
 * a limited number of times so that you don't exceed the request rate. If the error persists, the non-AWS identity
 * provider might be down or not responding.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IDPCommunicationErrorException extends com.amazonaws.services.securitytoken.model.AWSSecurityTokenServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new IDPCommunicationErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public IDPCommunicationErrorException(String message) {
        super(message);
    }

}
