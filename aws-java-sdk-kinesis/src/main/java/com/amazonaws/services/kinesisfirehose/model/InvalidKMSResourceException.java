/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Kinesis Data Firehose throws this exception when an attempt to put records or to start or stop delivery stream
 * encryption fails. This happens when the KMS service throws one of the following exception types:
 * <code>AccessDeniedException</code>, <code>InvalidStateException</code>, <code>DisabledException</code>, or
 * <code>NotFoundException</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidKMSResourceException extends com.amazonaws.services.kinesisfirehose.model.AmazonKinesisFirehoseException {
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * Constructs a new InvalidKMSResourceException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidKMSResourceException(String message) {
        super(message);
    }

    /**
     * @param code
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidKMSResourceException withCode(String code) {
        setCode(code);
        return this;
    }

}
