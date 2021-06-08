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
package com.amazonaws.services.ssoadmin.model;

import javax.annotation.Generated;

/**
 * <p>
 * Occurs when a conflict with a previous successful write is detected. This generally occurs when the previous write
 * did not have time to propagate to the host serving the current request. A retry (with appropriate backoff logic) is
 * the recommended response to this exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.ssoadmin.model.AWSSSOAdminException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

}
