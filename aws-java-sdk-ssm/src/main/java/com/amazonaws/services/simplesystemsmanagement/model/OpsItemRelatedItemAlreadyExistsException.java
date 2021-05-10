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
package com.amazonaws.services.simplesystemsmanagement.model;

import javax.annotation.Generated;

/**
 * <p>
 * The Amazon Resource Name (ARN) is already associated with the OpsItem.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemRelatedItemAlreadyExistsException extends com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException {
    private static final long serialVersionUID = 1L;

    private String resourceUri;

    private String opsItemId;

    /**
     * Constructs a new OpsItemRelatedItemAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public OpsItemRelatedItemAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * @param resourceUri
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceUri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceUri")
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * @param resourceUri
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemAlreadyExistsException withResourceUri(String resourceUri) {
        setResourceUri(resourceUri);
        return this;
    }

    /**
     * @param opsItemId
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OpsItemId")
    public void setOpsItemId(String opsItemId) {
        this.opsItemId = opsItemId;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("OpsItemId")
    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * @param opsItemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemAlreadyExistsException withOpsItemId(String opsItemId) {
        setOpsItemId(opsItemId);
        return this;
    }

}
