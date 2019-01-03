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
package com.amazonaws.services.macie.model;

import javax.annotation.Generated;

/**
 * <p>
 * Internal server error.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalException extends com.amazonaws.services.macie.model.AmazonMacieException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    /**
     * Constructs a new InternalException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InternalException(String message) {
        super(message);
    }

    /**
     * @param errorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternalException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
