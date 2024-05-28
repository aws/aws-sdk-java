/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because it conflicts with the resource's availability. For example, you tried to update a
 * security control that's currently in the <code>UPDATING</code> state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInUseException extends com.amazonaws.services.securityhub.model.AWSSecurityHubException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInUseException withCode(String code) {
        setCode(code);
        return this;
    }

}
