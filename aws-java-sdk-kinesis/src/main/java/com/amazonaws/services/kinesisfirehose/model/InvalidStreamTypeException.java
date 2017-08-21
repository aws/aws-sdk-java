/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidStreamTypeException extends com.amazonaws.services.kinesisfirehose.model.AmazonKinesisFirehoseException {
    private static final long serialVersionUID = 1L;

    private String source;

    /**
     * Constructs a new InvalidStreamTypeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidStreamTypeException(String message) {
        super(message);
    }

    /**
     * @param source
     */

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidStreamTypeException withSource(String source) {
        setSource(source);
        return this;
    }

}
