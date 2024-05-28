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
package com.amazonaws.services.bedrockagentruntime.model;

import javax.annotation.Generated;

/**
 * <p>
 * There was an issue with a dependency due to a server issue. Retry your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadGatewayException extends com.amazonaws.services.bedrockagentruntime.model.AWSBedrockAgentRuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     * </p>
     */
    private String resourceName;

    /**
     * Constructs a new BadGatewayException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadGatewayException(String message) {
        super(message);
    }

    /**
     * <p>
     * The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     * </p>
     * 
     * @param resourceName
     *        The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     * </p>
     * 
     * @return The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     * </p>
     * 
     * @param resourceName
     *        The name of the dependency that caused the issue, such as Amazon Bedrock, Lambda, or STS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadGatewayException withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

}
