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
package com.amazonaws.services.cloudtrail.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified query cannot be canceled because it is in the <code>FINISHED</code>, <code>FAILED</code>,
 * <code>TIMED_OUT</code>, or <code>CANCELLED</code> state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InactiveQueryException extends com.amazonaws.services.cloudtrail.model.AWSCloudTrailException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InactiveQueryException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InactiveQueryException(String message) {
        super(message);
    }

}
