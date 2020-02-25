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
package com.amazonaws.services.elasticfilesystem.model;

import javax.annotation.Generated;

/**
 * <p>
 * Returned if the access point you are trying to create already exists, with the creation token you provided in the
 * request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPointAlreadyExistsException extends com.amazonaws.services.elasticfilesystem.model.AmazonElasticFileSystemException {
    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String accessPointId;

    /**
     * Constructs a new AccessPointAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessPointAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param errorCode
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ErrorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @param errorCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointAlreadyExistsException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * @param accessPointId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("AccessPointId")
    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("AccessPointId")
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @param accessPointId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPointAlreadyExistsException withAccessPointId(String accessPointId) {
        setAccessPointId(accessPointId);
        return this;
    }

}
