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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the FinSpace environment to be created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the FinSpace environment to be created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The KMS key id to encrypt your data in the FinSpace environment.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Add tags to your FinSpace environment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     */
    private String federationMode;
    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     */
    private FederationParameters federationParameters;

    /**
     * <p>
     * The name of the FinSpace environment to be created.
     * </p>
     * 
     * @param name
     *        The name of the FinSpace environment to be created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the FinSpace environment to be created.
     * </p>
     * 
     * @return The name of the FinSpace environment to be created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the FinSpace environment to be created.
     * </p>
     * 
     * @param name
     *        The name of the FinSpace environment to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the FinSpace environment to be created.
     * </p>
     * 
     * @param description
     *        The description of the FinSpace environment to be created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the FinSpace environment to be created.
     * </p>
     * 
     * @return The description of the FinSpace environment to be created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the FinSpace environment to be created.
     * </p>
     * 
     * @param description
     *        The description of the FinSpace environment to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The KMS key id to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key id to encrypt your data in the FinSpace environment.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key id to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @return The KMS key id to encrypt your data in the FinSpace environment.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key id to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key id to encrypt your data in the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Add tags to your FinSpace environment.
     * </p>
     * 
     * @return Add tags to your FinSpace environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Add tags to your FinSpace environment.
     * </p>
     * 
     * @param tags
     *        Add tags to your FinSpace environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Add tags to your FinSpace environment.
     * </p>
     * 
     * @param tags
     *        Add tags to your FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
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

    public CreateEnvironmentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param federationMode
     *        Authentication mode for the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     *        </p>
     *        </li>
     * @see FederationMode
     */

    public void setFederationMode(String federationMode) {
        this.federationMode = federationMode;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Authentication mode for the environment.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace
     *         environment.
     *         </p>
     *         </li>
     * @see FederationMode
     */

    public String getFederationMode() {
        return this.federationMode;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param federationMode
     *        Authentication mode for the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationMode
     */

    public CreateEnvironmentRequest withFederationMode(String federationMode) {
        setFederationMode(federationMode);
        return this;
    }

    /**
     * <p>
     * Authentication mode for the environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param federationMode
     *        Authentication mode for the environment.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FEDERATED</code> - Users access FinSpace through Single Sign On (SSO) via your Identity provider.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCAL</code> - Users access FinSpace via email and password managed within the FinSpace environment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationMode
     */

    public CreateEnvironmentRequest withFederationMode(FederationMode federationMode) {
        this.federationMode = federationMode.toString();
        return this;
    }

    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     * 
     * @param federationParameters
     *        Configuration information when authentication mode is FEDERATED.
     */

    public void setFederationParameters(FederationParameters federationParameters) {
        this.federationParameters = federationParameters;
    }

    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     * 
     * @return Configuration information when authentication mode is FEDERATED.
     */

    public FederationParameters getFederationParameters() {
        return this.federationParameters;
    }

    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     * 
     * @param federationParameters
     *        Configuration information when authentication mode is FEDERATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withFederationParameters(FederationParameters federationParameters) {
        setFederationParameters(federationParameters);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFederationMode() != null)
            sb.append("FederationMode: ").append(getFederationMode()).append(",");
        if (getFederationParameters() != null)
            sb.append("FederationParameters: ").append(getFederationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFederationMode() == null ^ this.getFederationMode() == null)
            return false;
        if (other.getFederationMode() != null && other.getFederationMode().equals(this.getFederationMode()) == false)
            return false;
        if (other.getFederationParameters() == null ^ this.getFederationParameters() == null)
            return false;
        if (other.getFederationParameters() != null && other.getFederationParameters().equals(this.getFederationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFederationMode() == null) ? 0 : getFederationMode().hashCode());
        hashCode = prime * hashCode + ((getFederationParameters() == null) ? 0 : getFederationParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
