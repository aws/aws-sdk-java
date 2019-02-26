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
package com.amazonaws.services.ecr.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified repository could not be found. Check the spelling of the specified repository and ensure that you are
 * performing operations on the correct registry.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryNotFoundException extends com.amazonaws.services.ecr.model.AmazonECRException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new RepositoryNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public RepositoryNotFoundException(String message) {
        super(message);
    }

}
