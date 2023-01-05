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
package com.amazonaws.services.connectcampaign.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request could not be processed because of conflict in the current state of the resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.connectcampaign.model.AmazonConnectCampaignException {
    private static final long serialVersionUID = 1L;

    private String xAmzErrorType;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * @param xAmzErrorType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("x-amzn-ErrorType")
    public void setXAmzErrorType(String xAmzErrorType) {
        this.xAmzErrorType = xAmzErrorType;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("x-amzn-ErrorType")
    public String getXAmzErrorType() {
        return this.xAmzErrorType;
    }

    /**
     * @param xAmzErrorType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withXAmzErrorType(String xAmzErrorType) {
        setXAmzErrorType(xAmzErrorType);
        return this;
    }

}
