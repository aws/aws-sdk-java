/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the specified Amazon DataZone domain.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the Amazon DataZone domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The domain execution role with which the Amazon DataZone domain is created.
     * </p>
     */
    private String domainExecutionRole;
    /**
     * <p>
     * The identifier of the specified Amazon DataZone domain.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     * </p>
     */
    private String kmsKeyIdentifier;
    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the Amazon DataZone domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL of the data portal for this Amazon DataZone domain.
     * </p>
     */
    private String portalUrl;
    /**
     * <p>
     * The single sing-on option of the specified Amazon DataZone domain.
     * </p>
     */
    private SingleSignOn singleSignOn;
    /**
     * <p>
     * The status of the specified Amazon DataZone domain.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags specified for the Amazon DataZone domain.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the specified Amazon DataZone domain.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the specified Amazon DataZone domain.
     * </p>
     * 
     * @return The ARN of the specified Amazon DataZone domain.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the specified Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the Amazon DataZone domain was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was created.
     * </p>
     * 
     * @return The timestamp of when the Amazon DataZone domain was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the Amazon DataZone domain was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the Amazon DataZone domain.
     * </p>
     * 
     * @param description
     *        The description of the Amazon DataZone domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Amazon DataZone domain.
     * </p>
     * 
     * @return The description of the Amazon DataZone domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Amazon DataZone domain.
     * </p>
     * 
     * @param description
     *        The description of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The domain execution role with which the Amazon DataZone domain is created.
     * </p>
     * 
     * @param domainExecutionRole
     *        The domain execution role with which the Amazon DataZone domain is created.
     */

    public void setDomainExecutionRole(String domainExecutionRole) {
        this.domainExecutionRole = domainExecutionRole;
    }

    /**
     * <p>
     * The domain execution role with which the Amazon DataZone domain is created.
     * </p>
     * 
     * @return The domain execution role with which the Amazon DataZone domain is created.
     */

    public String getDomainExecutionRole() {
        return this.domainExecutionRole;
    }

    /**
     * <p>
     * The domain execution role with which the Amazon DataZone domain is created.
     * </p>
     * 
     * @param domainExecutionRole
     *        The domain execution role with which the Amazon DataZone domain is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withDomainExecutionRole(String domainExecutionRole) {
        setDomainExecutionRole(domainExecutionRole);
        return this;
    }

    /**
     * <p>
     * The identifier of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param id
     *        The identifier of the specified Amazon DataZone domain.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the specified Amazon DataZone domain.
     * </p>
     * 
     * @return The identifier of the specified Amazon DataZone domain.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param id
     *        The identifier of the specified Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     * </p>
     * 
     * @param kmsKeyIdentifier
     *        The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the
     *        Amazon DataZone domain, metadata, and reporting data.
     */

    public void setKmsKeyIdentifier(String kmsKeyIdentifier) {
        this.kmsKeyIdentifier = kmsKeyIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the
     *         Amazon DataZone domain, metadata, and reporting data.
     */

    public String getKmsKeyIdentifier() {
        return this.kmsKeyIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     * </p>
     * 
     * @param kmsKeyIdentifier
     *        The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the
     *        Amazon DataZone domain, metadata, and reporting data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withKmsKeyIdentifier(String kmsKeyIdentifier) {
        setKmsKeyIdentifier(kmsKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the Amazon DataZone domain was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was last updated.
     * </p>
     * 
     * @return The timestamp of when the Amazon DataZone domain was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the Amazon DataZone domain was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the Amazon DataZone domain was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon DataZone domain.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone domain.
     * </p>
     * 
     * @return The name of the Amazon DataZone domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon DataZone domain.
     * </p>
     * 
     * @param name
     *        The name of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL of the data portal for this Amazon DataZone domain.
     * </p>
     * 
     * @param portalUrl
     *        The URL of the data portal for this Amazon DataZone domain.
     */

    public void setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
    }

    /**
     * <p>
     * The URL of the data portal for this Amazon DataZone domain.
     * </p>
     * 
     * @return The URL of the data portal for this Amazon DataZone domain.
     */

    public String getPortalUrl() {
        return this.portalUrl;
    }

    /**
     * <p>
     * The URL of the data portal for this Amazon DataZone domain.
     * </p>
     * 
     * @param portalUrl
     *        The URL of the data portal for this Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withPortalUrl(String portalUrl) {
        setPortalUrl(portalUrl);
        return this;
    }

    /**
     * <p>
     * The single sing-on option of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param singleSignOn
     *        The single sing-on option of the specified Amazon DataZone domain.
     */

    public void setSingleSignOn(SingleSignOn singleSignOn) {
        this.singleSignOn = singleSignOn;
    }

    /**
     * <p>
     * The single sing-on option of the specified Amazon DataZone domain.
     * </p>
     * 
     * @return The single sing-on option of the specified Amazon DataZone domain.
     */

    public SingleSignOn getSingleSignOn() {
        return this.singleSignOn;
    }

    /**
     * <p>
     * The single sing-on option of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param singleSignOn
     *        The single sing-on option of the specified Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withSingleSignOn(SingleSignOn singleSignOn) {
        setSingleSignOn(singleSignOn);
        return this;
    }

    /**
     * <p>
     * The status of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param status
     *        The status of the specified Amazon DataZone domain.
     * @see DomainStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the specified Amazon DataZone domain.
     * </p>
     * 
     * @return The status of the specified Amazon DataZone domain.
     * @see DomainStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param status
     *        The status of the specified Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public GetDomainResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the specified Amazon DataZone domain.
     * </p>
     * 
     * @param status
     *        The status of the specified Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatus
     */

    public GetDomainResult withStatus(DomainStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags specified for the Amazon DataZone domain.
     * </p>
     * 
     * @return The tags specified for the Amazon DataZone domain.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags specified for the Amazon DataZone domain.
     * </p>
     * 
     * @param tags
     *        The tags specified for the Amazon DataZone domain.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags specified for the Amazon DataZone domain.
     * </p>
     * 
     * @param tags
     *        The tags specified for the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetDomainResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDomainResult addTagsEntry(String key, String value) {
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

    public GetDomainResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainExecutionRole() != null)
            sb.append("DomainExecutionRole: ").append(getDomainExecutionRole()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPortalUrl() != null)
            sb.append("PortalUrl: ").append(getPortalUrl()).append(",");
        if (getSingleSignOn() != null)
            sb.append("SingleSignOn: ").append(getSingleSignOn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetDomainResult == false)
            return false;
        GetDomainResult other = (GetDomainResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainExecutionRole() == null ^ this.getDomainExecutionRole() == null)
            return false;
        if (other.getDomainExecutionRole() != null && other.getDomainExecutionRole().equals(this.getDomainExecutionRole()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getKmsKeyIdentifier() == null ^ this.getKmsKeyIdentifier() == null)
            return false;
        if (other.getKmsKeyIdentifier() != null && other.getKmsKeyIdentifier().equals(this.getKmsKeyIdentifier()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPortalUrl() == null ^ this.getPortalUrl() == null)
            return false;
        if (other.getPortalUrl() != null && other.getPortalUrl().equals(this.getPortalUrl()) == false)
            return false;
        if (other.getSingleSignOn() == null ^ this.getSingleSignOn() == null)
            return false;
        if (other.getSingleSignOn() != null && other.getSingleSignOn().equals(this.getSingleSignOn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainExecutionRole() == null) ? 0 : getDomainExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortalUrl() == null) ? 0 : getPortalUrl().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOn() == null) ? 0 : getSingleSignOn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetDomainResult clone() {
        try {
            return (GetDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
