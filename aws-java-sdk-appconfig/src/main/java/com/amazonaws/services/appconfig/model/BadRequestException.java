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
package com.amazonaws.services.appconfig.model;

import javax.annotation.Generated;

/**
 * <p>
 * The input fails to satisfy the constraints specified by an Amazon Web Services service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BadRequestException extends com.amazonaws.services.appconfig.model.AmazonAppConfigException {
    private static final long serialVersionUID = 1L;

    private String reason;

    private BadRequestDetails details;

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

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return
     * @see BadRequestReason
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Reason")
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
     * @param details
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Details")
    public void setDetails(BadRequestDetails details) {
        this.details = details;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Details")
    public BadRequestDetails getDetails() {
        return this.details;
    }

    /**
     * @param details
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BadRequestException withDetails(BadRequestDetails details) {
        setDetails(details);
        return this;
    }

}
