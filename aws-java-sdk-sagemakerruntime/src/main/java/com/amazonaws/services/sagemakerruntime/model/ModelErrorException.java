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
package com.amazonaws.services.sagemakerruntime.model;

import javax.annotation.Generated;

/**
 * <p>
 * Model (owned by the customer in the container) returned an error 500.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelErrorException extends com.amazonaws.services.sagemakerruntime.model.AmazonSageMakerRuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Original status code.
     * </p>
     */
    private Integer originalStatusCode;
    /**
     * <p>
     * Original message.
     * </p>
     */
    private String originalMessage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     */
    private String logStreamArn;

    /**
     * Constructs a new ModelErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ModelErrorException(String message) {
        super(message);
    }

    /**
     * <p>
     * Original status code.
     * </p>
     * 
     * @param originalStatusCode
     *        Original status code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OriginalStatusCode")
    public void setOriginalStatusCode(Integer originalStatusCode) {
        this.originalStatusCode = originalStatusCode;
    }

    /**
     * <p>
     * Original status code.
     * </p>
     * 
     * @return Original status code.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OriginalStatusCode")
    public Integer getOriginalStatusCode() {
        return this.originalStatusCode;
    }

    /**
     * <p>
     * Original status code.
     * </p>
     * 
     * @param originalStatusCode
     *        Original status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelErrorException withOriginalStatusCode(Integer originalStatusCode) {
        setOriginalStatusCode(originalStatusCode);
        return this;
    }

    /**
     * <p>
     * Original message.
     * </p>
     * 
     * @param originalMessage
     *        Original message.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OriginalMessage")
    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    /**
     * <p>
     * Original message.
     * </p>
     * 
     * @return Original message.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OriginalMessage")
    public String getOriginalMessage() {
        return this.originalMessage;
    }

    /**
     * <p>
     * Original message.
     * </p>
     * 
     * @param originalMessage
     *        Original message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelErrorException withOriginalMessage(String originalMessage) {
        setOriginalMessage(originalMessage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * 
     * @param logStreamArn
     *        The Amazon Resource Name (ARN) of the log stream.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LogStreamArn")
    public void setLogStreamArn(String logStreamArn) {
        this.logStreamArn = logStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the log stream.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("LogStreamArn")
    public String getLogStreamArn() {
        return this.logStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log stream.
     * </p>
     * 
     * @param logStreamArn
     *        The Amazon Resource Name (ARN) of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelErrorException withLogStreamArn(String logStreamArn) {
        setLogStreamArn(logStreamArn);
        return this;
    }

}
