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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/UpdateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name for the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The default number of days until the data within the domain expires.
     * </p>
     */
    private Integer defaultExpirationDays;
    /**
     * <p>
     * The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is
     * specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     * </p>
     */
    private String defaultEncryptionKey;
    /**
     * <p>
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from
     * third party applications.
     * </p>
     */
    private String deadLetterQueueUrl;
    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name for the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name for the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name for the domain.
     * </p>
     * 
     * @return The unique name for the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name for the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The default number of days until the data within the domain expires.
     * </p>
     * 
     * @param defaultExpirationDays
     *        The default number of days until the data within the domain expires.
     */

    public void setDefaultExpirationDays(Integer defaultExpirationDays) {
        this.defaultExpirationDays = defaultExpirationDays;
    }

    /**
     * <p>
     * The default number of days until the data within the domain expires.
     * </p>
     * 
     * @return The default number of days until the data within the domain expires.
     */

    public Integer getDefaultExpirationDays() {
        return this.defaultExpirationDays;
    }

    /**
     * <p>
     * The default number of days until the data within the domain expires.
     * </p>
     * 
     * @param defaultExpirationDays
     *        The default number of days until the data within the domain expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withDefaultExpirationDays(Integer defaultExpirationDays) {
        setDefaultExpirationDays(defaultExpirationDays);
        return this;
    }

    /**
     * <p>
     * The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is
     * specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     * </p>
     * 
     * @param defaultEncryptionKey
     *        The default encryption key, which is an AWS managed key, is used when no specific type of encryption key
     *        is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     */

    public void setDefaultEncryptionKey(String defaultEncryptionKey) {
        this.defaultEncryptionKey = defaultEncryptionKey;
    }

    /**
     * <p>
     * The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is
     * specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     * </p>
     * 
     * @return The default encryption key, which is an AWS managed key, is used when no specific type of encryption key
     *         is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     */

    public String getDefaultEncryptionKey() {
        return this.defaultEncryptionKey;
    }

    /**
     * <p>
     * The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is
     * specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     * </p>
     * 
     * @param defaultEncryptionKey
     *        The default encryption key, which is an AWS managed key, is used when no specific type of encryption key
     *        is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withDefaultEncryptionKey(String defaultEncryptionKey) {
        setDefaultEncryptionKey(defaultEncryptionKey);
        return this;
    }

    /**
     * <p>
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from
     * third party applications.
     * </p>
     * 
     * @param deadLetterQueueUrl
     *        The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data
     *        from third party applications.
     */

    public void setDeadLetterQueueUrl(String deadLetterQueueUrl) {
        this.deadLetterQueueUrl = deadLetterQueueUrl;
    }

    /**
     * <p>
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from
     * third party applications.
     * </p>
     * 
     * @return The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data
     *         from third party applications.
     */

    public String getDeadLetterQueueUrl() {
        return this.deadLetterQueueUrl;
    }

    /**
     * <p>
     * The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from
     * third party applications.
     * </p>
     * 
     * @param deadLetterQueueUrl
     *        The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data
     *        from third party applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withDeadLetterQueueUrl(String deadLetterQueueUrl) {
        setDeadLetterQueueUrl(deadLetterQueueUrl);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the domain was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @return The timestamp of when the domain was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the domain was most recently edited.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @return The timestamp of when the domain was most recently edited.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the domain was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the domain was most recently edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateDomainResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainResult addTagsEntry(String key, String value) {
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

    public UpdateDomainResult clearTagsEntries() {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDefaultExpirationDays() != null)
            sb.append("DefaultExpirationDays: ").append(getDefaultExpirationDays()).append(",");
        if (getDefaultEncryptionKey() != null)
            sb.append("DefaultEncryptionKey: ").append(getDefaultEncryptionKey()).append(",");
        if (getDeadLetterQueueUrl() != null)
            sb.append("DeadLetterQueueUrl: ").append(getDeadLetterQueueUrl()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
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

        if (obj instanceof UpdateDomainResult == false)
            return false;
        UpdateDomainResult other = (UpdateDomainResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDefaultExpirationDays() == null ^ this.getDefaultExpirationDays() == null)
            return false;
        if (other.getDefaultExpirationDays() != null && other.getDefaultExpirationDays().equals(this.getDefaultExpirationDays()) == false)
            return false;
        if (other.getDefaultEncryptionKey() == null ^ this.getDefaultEncryptionKey() == null)
            return false;
        if (other.getDefaultEncryptionKey() != null && other.getDefaultEncryptionKey().equals(this.getDefaultEncryptionKey()) == false)
            return false;
        if (other.getDeadLetterQueueUrl() == null ^ this.getDeadLetterQueueUrl() == null)
            return false;
        if (other.getDeadLetterQueueUrl() != null && other.getDeadLetterQueueUrl().equals(this.getDeadLetterQueueUrl()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDefaultExpirationDays() == null) ? 0 : getDefaultExpirationDays().hashCode());
        hashCode = prime * hashCode + ((getDefaultEncryptionKey() == null) ? 0 : getDefaultEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterQueueUrl() == null) ? 0 : getDeadLetterQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainResult clone() {
        try {
            return (UpdateDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
