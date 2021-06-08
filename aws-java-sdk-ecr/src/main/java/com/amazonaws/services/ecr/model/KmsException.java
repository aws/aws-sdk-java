/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation failed due to a KMS exception.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsException extends com.amazonaws.services.ecr.model.AmazonECRException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The error code returned by AWS KMS.
     * </p>
     */
    private String kmsError;

    /**
     * Constructs a new KmsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KmsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The error code returned by AWS KMS.
     * </p>
     * 
     * @param kmsError
     *        The error code returned by AWS KMS.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("kmsError")
    public void setKmsError(String kmsError) {
        this.kmsError = kmsError;
    }

    /**
     * <p>
     * The error code returned by AWS KMS.
     * </p>
     * 
     * @return The error code returned by AWS KMS.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("kmsError")
    public String getKmsError() {
        return this.kmsError;
    }

    /**
     * <p>
     * The error code returned by AWS KMS.
     * </p>
     * 
     * @param kmsError
     *        The error code returned by AWS KMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsException withKmsError(String kmsError) {
        setKmsError(kmsError);
        return this;
    }

}
