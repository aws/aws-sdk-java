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
package com.amazonaws.services.lexmodelbuilding.model;

import javax.annotation.Generated;

/**
 * <p>
 * The resource that you are attempting to delete is referred to by another resource. Use this information to remove
 * references to the resource that you are trying to delete.
 * </p>
 * <p>
 * The body of the exception contains a JSON object that describes the resource.
 * </p>
 * <p>
 * <code>{ "resourceType": BOT | BOTALIAS | BOTCHANNEL | INTENT,</code>
 * </p>
 * <p>
 * <code>"resourceReference": {</code>
 * </p>
 * <p>
 * <code>"name": <i>string</i>, "version": <i>string</i> } }</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInUseException extends com.amazonaws.services.lexmodelbuilding.model.AmazonLexModelBuildingException {
    private static final long serialVersionUID = 1L;

    private String referenceType;

    private ResourceReference exampleReference;

    /**
     * Constructs a new ResourceInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceInUseException(String message) {
        super(message);
    }

    /**
     * @param referenceType
     * @see ReferenceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    /**
     * @return
     * @see ReferenceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
    public String getReferenceType() {
        return this.referenceType;
    }

    /**
     * @param referenceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public ResourceInUseException withReferenceType(String referenceType) {
        setReferenceType(referenceType);
        return this;
    }

    /**
     * @param referenceType
     * @see ReferenceType
     */

    public void setReferenceType(ReferenceType referenceType) {
        withReferenceType(referenceType);
    }

    /**
     * @param referenceType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceType
     */

    public ResourceInUseException withReferenceType(ReferenceType referenceType) {
        this.referenceType = referenceType.toString();
        return this;
    }

    /**
     * @param exampleReference
     */

    @com.fasterxml.jackson.annotation.JsonProperty("exampleReference")
    public void setExampleReference(ResourceReference exampleReference) {
        this.exampleReference = exampleReference;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("exampleReference")
    public ResourceReference getExampleReference() {
        return this.exampleReference;
    }

    /**
     * @param exampleReference
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInUseException withExampleReference(ResourceReference exampleReference) {
        setExampleReference(exampleReference);
        return this;
    }

}
