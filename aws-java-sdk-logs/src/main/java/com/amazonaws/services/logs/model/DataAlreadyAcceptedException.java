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
package com.amazonaws.services.logs.model;

import javax.annotation.Generated;

/**
 * <p>
 * The event was already logged.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataAlreadyAcceptedException extends com.amazonaws.services.logs.model.AWSLogsException {
    private static final long serialVersionUID = 1L;

    private String expectedSequenceToken;

    /**
     * Constructs a new DataAlreadyAcceptedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DataAlreadyAcceptedException(String message) {
        super(message);
    }

    /**
     * @param expectedSequenceToken
     */

    @com.fasterxml.jackson.annotation.JsonProperty("expectedSequenceToken")
    public void setExpectedSequenceToken(String expectedSequenceToken) {
        this.expectedSequenceToken = expectedSequenceToken;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("expectedSequenceToken")
    public String getExpectedSequenceToken() {
        return this.expectedSequenceToken;
    }

    /**
     * @param expectedSequenceToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataAlreadyAcceptedException withExpectedSequenceToken(String expectedSequenceToken) {
        setExpectedSequenceToken(expectedSequenceToken);
        return this;
    }

}
