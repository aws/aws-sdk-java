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
package com.amazonaws.services.acmpca.model;

import javax.annotation.Generated;

/**
 * <p>
 * The current action was prevented because it would lock the caller out from performing subsequent actions. Verify that
 * the specified parameters would not result in the caller being denied access to the resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LockoutPreventedException extends com.amazonaws.services.acmpca.model.AWSACMPCAException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new LockoutPreventedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public LockoutPreventedException(String message) {
        super(message);
    }

}
