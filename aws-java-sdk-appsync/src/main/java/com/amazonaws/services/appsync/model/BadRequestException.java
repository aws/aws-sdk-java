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
package com.amazonaws.services.appsync.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request is not well formed. For example, a value is invalid or a required field is missing. Check the field
 * values, and then try again.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.amazonaws.services.appsync.model.AWSAppSyncException {
    private static final long serialVersionUID = 1L;

    private String reason;

    private BadRequestDetail detail;

    /**
     * Constructs a new BadRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * @param reason
     * @see BadRequestReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see BadRequestReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    public String getReason() {
        return this.reason;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BadRequestReason
     */

    public BadRequestException withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * @param reason
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BadRequestReason
     */

    public BadRequestException withReason(BadRequestReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * @param detail
     */

    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(BadRequestDetail detail) {
        this.detail = detail;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public BadRequestDetail getDetail() {
        return this.detail;
    }

    /**
     * @param detail
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException withDetail(BadRequestDetail detail) {
        setDetail(detail);
        return this;
    }

}
