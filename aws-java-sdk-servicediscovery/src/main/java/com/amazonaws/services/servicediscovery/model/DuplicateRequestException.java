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
package com.amazonaws.services.servicediscovery.model;

import javax.annotation.Generated;

/**
 * <p>
 * The operation is already in progress.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DuplicateRequestException extends com.amazonaws.services.servicediscovery.model.AWSServiceDiscoveryException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     */
    private String duplicateOperationId;

    /**
     * Constructs a new DuplicateRequestException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DuplicateRequestException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     * 
     * @param duplicateOperationId
     *        The ID of the operation that is already in progress.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("DuplicateOperationId")
    public void setDuplicateOperationId(String duplicateOperationId) {
        this.duplicateOperationId = duplicateOperationId;
    }

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     * 
     * @return The ID of the operation that is already in progress.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("DuplicateOperationId")
    public String getDuplicateOperationId() {
        return this.duplicateOperationId;
    }

    /**
     * <p>
     * The ID of the operation that is already in progress.
     * </p>
     * 
     * @param duplicateOperationId
     *        The ID of the operation that is already in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DuplicateRequestException withDuplicateOperationId(String duplicateOperationId) {
        setDuplicateOperationId(duplicateOperationId);
        return this;
    }

}
