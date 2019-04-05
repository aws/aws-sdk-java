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
package com.amazonaws.services.cloudsearchdomain.model;

import javax.annotation.Generated;

/**
 * <p>
 * Information about any problems encountered while processing an upload request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentServiceException extends com.amazonaws.services.cloudsearchdomain.model.AmazonCloudSearchDomainException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The return status of a document upload request, <code>error</code> or <code>success</code>.
     * </p>
     */
    private String status;

    /**
     * Constructs a new DocumentServiceException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DocumentServiceException(String message) {
        super(message);
    }

    /**
     * <p>
     * The return status of a document upload request, <code>error</code> or <code>success</code>.
     * </p>
     * 
     * @param status
     *        The return status of a document upload request, <code>error</code> or <code>success</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The return status of a document upload request, <code>error</code> or <code>success</code>.
     * </p>
     * 
     * @return The return status of a document upload request, <code>error</code> or <code>success</code>.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The return status of a document upload request, <code>error</code> or <code>success</code>.
     * </p>
     * 
     * @param status
     *        The return status of a document upload request, <code>error</code> or <code>success</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentServiceException withStatus(String status) {
        setStatus(status);
        return this;
    }

}
