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
package com.amazonaws.services.voiceid.model;

import javax.annotation.Generated;

/**
 * <p>
 * The specified resource cannot be found. Check the <code>ResourceType</code> and error message for more details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceNotFoundException extends com.amazonaws.services.voiceid.model.AmazonVoiceIDException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     * <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     * <code>SPEAKER</code>.
     * </p>
     */
    private String resourceType;

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

    /**
     * <p>
     * The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     * <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     * <code>SPEAKER</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     *        <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     *        <code>SPEAKER</code>.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     * <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     * <code>SPEAKER</code>.
     * </p>
     * 
     * @return The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     *         <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     *         <code>SPEAKER</code>.
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("ResourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     * <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     * <code>SPEAKER</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     *        <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     *        <code>SPEAKER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceNotFoundException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     * <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     * <code>SPEAKER</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource which cannot not be found. Possible types are <code>BATCH_JOB</code>,
     *        <code>COMPLIANCE_CONSENT</code>, <code>DOMAIN</code>, <code>FRAUDSTER</code>, <code>SESSION</code> and
     *        <code>SPEAKER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ResourceNotFoundException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

}
