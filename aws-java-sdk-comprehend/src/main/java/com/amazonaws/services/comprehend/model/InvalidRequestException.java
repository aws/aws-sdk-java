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
package com.amazonaws.services.comprehend.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request is invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidRequestException extends com.amazonaws.services.comprehend.model.AmazonComprehendException {
    private static final long serialVersionUID = 1L;

    private String reason;

    private InvalidRequestDetail detail;

    /**
     * Constructs a new InvalidRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidRequestException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see InvalidRequestReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see InvalidRequestReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidRequestReason
     */

    public InvalidRequestException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvalidRequestReason
     */

    public InvalidRequestException withReason(InvalidRequestReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * @param detail
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Detail")
    public void setDetail(InvalidRequestDetail detail) {
        this.detail = detail;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Detail")
    public InvalidRequestDetail getDetail() {
        return this.detail;
    }

    /**
     * @param detail
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidRequestException withDetail(InvalidRequestDetail detail) {
        setDetail(detail);
        return this;
    }

}
