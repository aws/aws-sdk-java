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
package com.amazonaws.services.machinelearning.model;

import javax.annotation.Generated;

/**
 * <p>
 * A second request to use or change an object was not allowed. This can result from retrying a request using a
 * parameter that was not present in the original request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdempotentParameterMismatchException extends com.amazonaws.services.machinelearning.model.AmazonMachineLearningException {
    private static final long serialVersionUID = 1L;

    private Integer code;

    /**
     * Constructs a new IdempotentParameterMismatchException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public IdempotentParameterMismatchException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public Integer getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdempotentParameterMismatchException withCode(Integer code) {
        setCode(code);
        return this;
    }

}
