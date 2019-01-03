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
package com.amazonaws.services.lambda.model;

import javax.annotation.Generated;

/**
 * <p>
 * AWS Lambda received an unexpected EC2 client exception while setting up for the Lambda function.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2UnexpectedException extends com.amazonaws.services.lambda.model.AWSLambdaException {
    private static final long serialVersionUID = 1L;

    private String type;

    private String eC2ErrorCode;

    /**
     * Constructs a new EC2UnexpectedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public EC2UnexpectedException(String message) {
        super(message);
    }

    /**
     * @param type
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2UnexpectedException withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param eC2ErrorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("EC2ErrorCode")
    public void setEC2ErrorCode(String eC2ErrorCode) {
        this.eC2ErrorCode = eC2ErrorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("EC2ErrorCode")
    public String getEC2ErrorCode() {
        return this.eC2ErrorCode;
    }

    /**
     * @param eC2ErrorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2UnexpectedException withEC2ErrorCode(String eC2ErrorCode) {
        setEC2ErrorCode(eC2ErrorCode);
        return this;
    }

}
