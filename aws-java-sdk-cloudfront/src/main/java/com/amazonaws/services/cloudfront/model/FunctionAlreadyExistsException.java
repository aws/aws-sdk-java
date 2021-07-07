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
package com.amazonaws.services.cloudfront.model;

import javax.annotation.Generated;

/**
 * <p>
 * A function with the same name already exists in this account. To create a function, you must provide a unique name.
 * To update an existing function, use <code>UpdateFunction</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionAlreadyExistsException extends com.amazonaws.services.cloudfront.model.AmazonCloudFrontException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new FunctionAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public FunctionAlreadyExistsException(String message) {
        super(message);
    }

}
