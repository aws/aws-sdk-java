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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create an
     * application. The service generates the clientToken when the API call is triggered. The token expires after one
     * hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response.
     * The service also handles deleting the clientToken after it expires.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     */
    private Definition definition;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     */
    private String engineType;
    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of tags to apply to the application.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create an
     * application. The service generates the clientToken when the API call is triggered. The token expires after one
     * hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response.
     * The service also handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create
     *        an application. The service generates the clientToken when the API call is triggered. The token expires
     *        after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the
     *        same response. The service also handles deleting the clientToken after it expires.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create an
     * application. The service generates the clientToken when the API call is triggered. The token expires after one
     * hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response.
     * The service also handles deleting the clientToken after it expires.
     * </p>
     * 
     * @return Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to
     *         create an application. The service generates the clientToken when the API call is triggered. The token
     *         expires after one hour, so if you retry the API within this timeframe with the same clientToken, you will
     *         get the same response. The service also handles deleting the clientToken after it expires.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create an
     * application. The service generates the clientToken when the API call is triggered. The token expires after one
     * hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response.
     * The service also handles deleting the clientToken after it expires.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create
     *        an application. The service generates the clientToken when the API call is triggered. The token expires
     *        after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the
     *        same response. The service also handles deleting the clientToken after it expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     * 
     * @param definition
     *        The application definition for this application. You can specify either inline JSON or an S3 bucket
     *        location.
     */

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     * 
     * @return The application definition for this application. You can specify either inline JSON or an S3 bucket
     *         location.
     */

    public Definition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * </p>
     * 
     * @param definition
     *        The application definition for this application. You can specify either inline JSON or an S3 bucket
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDefinition(Definition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for this application.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @return The type of the target platform for this application.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateApplicationRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * The type of the target platform for this application.
     * </p>
     * 
     * @param engineType
     *        The type of the target platform for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public CreateApplicationRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of a customer managed key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @return The identifier of a customer managed key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of a customer managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of a customer managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param name
     *        The unique identifier of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @return The unique identifier of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param name
     *        The unique identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the application.
     * </p>
     * 
     * @return A list of tags to apply to the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to the application.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to apply to the application.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
