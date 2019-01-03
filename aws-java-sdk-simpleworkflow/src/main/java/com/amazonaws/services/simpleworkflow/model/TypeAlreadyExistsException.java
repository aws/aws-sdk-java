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
package com.amazonaws.services.simpleworkflow.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returned if the type already exists in the specified domain. You get this fault even if the existing type is in
 * deprecated status. You can specify another version if the intent is to create a new distinct version of the type.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeAlreadyExistsException extends com.amazonaws.services.simpleworkflow.model.AmazonSimpleWorkflowException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new TypeAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public TypeAlreadyExistsException(String message) {
        super(message);
    }

}
