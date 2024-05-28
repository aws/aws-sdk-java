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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the Amazon DataZone domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The domain execution role that is created when an Amazon DataZone domain is created. The domain execution role is
     * created in the Amazon Web Services account that houses the Amazon DataZone domain.
     * </p>
     */
    private String domainExecutionRole;
    /**
     * <p>
     * The identifier of the Amazon Web Services Key Management Service (KMS) key that is used to encrypt the Amazon
     * DataZone domain, metadata, and reporting data.
     * </p>
     */
    private String kmsKeyIdentifier;
    /**
     * <p>
     * The name of the Amazon DataZone domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The single-sign on configuration of the Amazon DataZone domain.
     * </p>
     */
    private SingleSignOn singleSignOn;
    /**
     * <p>
     * The tags specified for the Amazon DataZone domain.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateDomainRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The domain execution role that is created when an Amazon DataZone domain is created. The domain execution role is
     * created in the Amazon Web Services account that houses the Amazon DataZone domain.
     * </p>
     * 
     * @param domainExecutionRole
     *        The domain execution role that is created when an Amazon DataZone domain is created. The domain execution
     *        role is created in the Amazon Web Services account that houses the Amazon DataZone domain.
     */

    public void setDomainExecutionRole(String domainExecutionRole) {
        this.domainExecutionRole = domainExecutionRole;
    }

    /**
     * <p>
     * The domain execution role that is created when an Amazon DataZone domain is created. The domain execution role is
     * created in the Amazon Web Services account that houses the Amazon DataZone domain.
     * </p>
     * 
     * @return The domain execution role that is created when an Amazon DataZone domain is created. The domain execution
     *         role is created in the Amazon Web Services account that houses the Amazon DataZone domain.
     */

    public String getDomainExecutionRole() {
        return this.domainExecutionRole;
    }

    /**
     * <p>
     * The domain execution role that is created when an Amazon DataZone domain is created. The domain execution role is
     * created in the Amazon Web Services account that houses the Amazon DataZone domain.
     * </p>
     * 
     * @param domainExecutionRole
     *        The domain execution role that is created when an Amazon DataZone domain is created. The domain execution
     *        role is created in the Amazon Web Services account that houses the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainExecutionRole(String domainExecutionRole) {
        setDomainExecutionRole(domainExecutionRole);
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

    public CreateDomainRequest withKmsKeyIdentifier(String kmsKeyIdentifier) {
        setKmsKeyIdentifier(kmsKeyIdentifier);
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

    public CreateDomainRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The single-sign on configuration of the Amazon DataZone domain.
     * </p>
     * 
     * @param singleSignOn
     *        The single-sign on configuration of the Amazon DataZone domain.
     */

    public void setSingleSignOn(SingleSignOn singleSignOn) {
        this.singleSignOn = singleSignOn;
    }

    /**
     * <p>
     * The single-sign on configuration of the Amazon DataZone domain.
     * </p>
     * 
     * @return The single-sign on configuration of the Amazon DataZone domain.
     */

    public SingleSignOn getSingleSignOn() {
        return this.singleSignOn;
    }

    /**
     * <p>
     * The single-sign on configuration of the Amazon DataZone domain.
     * </p>
     * 
     * @param singleSignOn
     *        The single-sign on configuration of the Amazon DataZone domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withSingleSignOn(SingleSignOn singleSignOn) {
        setSingleSignOn(singleSignOn);
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

    public CreateDomainRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDomainRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest addTagsEntry(String key, String value) {
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

    public CreateDomainRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomainExecutionRole() != null)
            sb.append("DomainExecutionRole: ").append(getDomainExecutionRole()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSingleSignOn() != null)
            sb.append("SingleSignOn: ").append(getSingleSignOn()).append(",");
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

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainExecutionRole() == null ^ this.getDomainExecutionRole() == null)
            return false;
        if (other.getDomainExecutionRole() != null && other.getDomainExecutionRole().equals(this.getDomainExecutionRole()) == false)
            return false;
        if (other.getKmsKeyIdentifier() == null ^ this.getKmsKeyIdentifier() == null)
            return false;
        if (other.getKmsKeyIdentifier() != null && other.getKmsKeyIdentifier().equals(this.getKmsKeyIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSingleSignOn() == null ^ this.getSingleSignOn() == null)
            return false;
        if (other.getSingleSignOn() != null && other.getSingleSignOn().equals(this.getSingleSignOn()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainExecutionRole() == null) ? 0 : getDomainExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSingleSignOn() == null) ? 0 : getSingleSignOn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
