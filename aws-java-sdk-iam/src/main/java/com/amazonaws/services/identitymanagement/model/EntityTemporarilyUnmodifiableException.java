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
package com.amazonaws.services.identitymanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user name that
 * was deleted and then recreated. The error indicates that the request is likely to succeed if you try again after
 * waiting several minutes. The error message describes the entity.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityTemporarilyUnmodifiableException extends com.amazonaws.services.identitymanagement.model.AmazonIdentityManagementException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new EntityTemporarilyUnmodifiableException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public EntityTemporarilyUnmodifiableException(String message) {
        super(message);
    }

}
