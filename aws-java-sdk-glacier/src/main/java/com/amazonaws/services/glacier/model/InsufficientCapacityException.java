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
package com.amazonaws.services.glacier.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returned if there is insufficient capacity to process this expedited request. This error only applies to expedited
 * retrievals and not to standard or bulk retrievals.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsufficientCapacityException extends com.amazonaws.services.glacier.model.AmazonGlacierException {
    private static final long serialVersionUID = 1L;

    private String type;

    private String code;

    /**
     * Constructs a new InsufficientCapacityException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InsufficientCapacityException(String message) {
        super(message);
    }

    /**
     * @param type
     */

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsufficientCapacityException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsufficientCapacityException withCode(String code) {
        setCode(code);
        return this;
    }

}
