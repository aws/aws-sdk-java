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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetIntegration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntegrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
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
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @return The URI of the S3 bucket or any other type of data source.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResult withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResult withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
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

    public GetIntegrationResult withCreatedAt(java.util.Date createdAt) {
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

    public GetIntegrationResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
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

    public GetIntegrationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetIntegrationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetIntegrationResult addTagsEntry(String key, String value) {
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

    public GetIntegrationResult clearTagsEntries() {
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
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

        if (obj instanceof GetIntegrationResult == false)
            return false;
        GetIntegrationResult other = (GetIntegrationResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
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
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetIntegrationResult clone() {
        try {
            return (GetIntegrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
