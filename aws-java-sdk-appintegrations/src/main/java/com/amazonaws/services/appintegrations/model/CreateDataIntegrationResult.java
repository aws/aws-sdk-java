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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/CreateDataIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataIntegrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN)
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A unique identifier.
     * </p>
     */
    private String id;
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
    private ScheduleConfiguration scheduleConfiguration;
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
     * The Amazon Resource Name (ARN)
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN)
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)
     * </p>
     * 
     * @return The Amazon Resource Name (ARN)
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN)
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A unique identifier.
     * </p>
     * 
     * @param id
     *        A unique identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier.
     * </p>
     * 
     * @return A unique identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier.
     * </p>
     * 
     * @param id
     *        A unique identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationResult withId(String id) {
        setId(id);
        return this;
    }

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

    public CreateDataIntegrationResult withName(String name) {
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

    public CreateDataIntegrationResult withDescription(String description) {
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

    public CreateDataIntegrationResult withKmsKey(String kmsKey) {
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

    public CreateDataIntegrationResult withSourceURI(String sourceURI) {
        setSourceURI(sourceURI);
        return this;
    }

    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The name of the data and how often it should be pulled from the source.
     */

    public void setScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        this.scheduleConfiguration = scheduleConfiguration;
    }

    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     * 
     * @return The name of the data and how often it should be pulled from the source.
     */

    public ScheduleConfiguration getScheduleConfiguration() {
        return this.scheduleConfiguration;
    }

    /**
     * <p>
     * The name of the data and how often it should be pulled from the source.
     * </p>
     * 
     * @param scheduleConfiguration
     *        The name of the data and how often it should be pulled from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationResult withScheduleConfiguration(ScheduleConfiguration scheduleConfiguration) {
        setScheduleConfiguration(scheduleConfiguration);
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

    public CreateDataIntegrationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDataIntegrationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataIntegrationResult addTagsEntry(String key, String value) {
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

    public CreateDataIntegrationResult clearTagsEntries() {
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

    public CreateDataIntegrationResult withClientToken(String clientToken) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getSourceURI() != null)
            sb.append("SourceURI: ").append(getSourceURI()).append(",");
        if (getScheduleConfiguration() != null)
            sb.append("ScheduleConfiguration: ").append(getScheduleConfiguration()).append(",");
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

        if (obj instanceof CreateDataIntegrationResult == false)
            return false;
        CreateDataIntegrationResult other = (CreateDataIntegrationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
        if (other.getScheduleConfiguration() == null ^ this.getScheduleConfiguration() == null)
            return false;
        if (other.getScheduleConfiguration() != null && other.getScheduleConfiguration().equals(this.getScheduleConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getSourceURI() == null) ? 0 : getSourceURI().hashCode());
        hashCode = prime * hashCode + ((getScheduleConfiguration() == null) ? 0 : getScheduleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataIntegrationResult clone() {
        try {
            return (CreateDataIntegrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
