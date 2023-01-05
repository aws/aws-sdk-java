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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateDataIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The KMS key for the DataIntegration.
     * </p>
     */
    private String kmsKey;
    /**
     * <p>
     * The URI of the data source.
     * </p>
     */
    private String sourceURI;
    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     */
    private ScheduleConfiguration scheduleConfig;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @param name
     *        The name of the DataIntegration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @return The name of the DataIntegration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @param name
     *        The name of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     * 
     * @param description
     *        A description of the DataIntegration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     * 
     * @return A description of the DataIntegration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     * 
     * @param description
     *        A description of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The KMS key for the DataIntegration.
     * </p>
     * 
     * @param kmsKey
     *        The KMS key for the DataIntegration.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The KMS key for the DataIntegration.
     * </p>
     * 
     * @return The KMS key for the DataIntegration.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The KMS key for the DataIntegration.
     * </p>
     * 
     * @param kmsKey
     *        The KMS key for the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * <p>
     * The URI of the data source.
     * </p>
     * 
     * @param sourceURI
     *        The URI of the data source.
     */

    public void setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
    }

    /**
     * <p>
     * The URI of the data source.
     * </p>
     * 
     * @return The URI of the data source.
     */

    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * <p>
     * The URI of the data source.
     * </p>
     * 
     * @param sourceURI
     *        The URI of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withSourceURI(String sourceURI) {
        setSourceURI(sourceURI);
        return this;
    }

    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     * 
     * @param scheduleConfig
     *        The name of the data and how often it should be pulled from the source.
     */

    public void setScheduleConfig(ScheduleConfiguration scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
    }

    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     * 
     * @return The name of the data and how often it should be pulled from the source.
     */

    public ScheduleConfiguration getScheduleConfig() {
        return this.scheduleConfig;
    }

    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     * 
     * @param scheduleConfig
     *        The name of the data and how often it should be pulled from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withScheduleConfig(ScheduleConfiguration scheduleConfig) {
        setScheduleConfig(scheduleConfig);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDataIntegrationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest addTagsEntry(String key, String value) {
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

    public CreateDataIntegrationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getSourceURI() != null)
            sb.append("SourceURI: ").append(getSourceURI()).append(",");
        if (getScheduleConfig() != null)
            sb.append("ScheduleConfig: ").append(getScheduleConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataIntegrationRequest == false)
            return false;
        CreateDataIntegrationRequest other = (CreateDataIntegrationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getSourceURI() == null ^ this.getSourceURI() == null)
            return false;
        if (other.getSourceURI() != null && other.getSourceURI().equals(this.getSourceURI()) == false)
            return false;
        if (other.getScheduleConfig() == null ^ this.getScheduleConfig() == null)
            return false;
        if (other.getScheduleConfig() != null && other.getScheduleConfig().equals(this.getScheduleConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getSourceURI() == null) ? 0 : getSourceURI().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfig() == null) ? 0 : getScheduleConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataIntegrationRequest clone() {
        return (CreateDataIntegrationRequest) super.clone();
    }

}
