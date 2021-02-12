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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateIdentityProviderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIdentityProviderConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to associate the configuration to.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     */
    private OidcIdentityProviderConfigRequest oidc;
    /**
     * <p>
     * The metadata to apply to the configuration to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the cluster to associate the configuration to.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to associate the configuration to.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to associate the configuration to.
     * </p>
     * 
     * @return The name of the cluster to associate the configuration to.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to associate the configuration to.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to associate the configuration to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @param oidc
     *        An object that represents an OpenID Connect (OIDC) identity provider configuration.
     */

    public void setOidc(OidcIdentityProviderConfigRequest oidc) {
        this.oidc = oidc;
    }

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @return An object that represents an OpenID Connect (OIDC) identity provider configuration.
     */

    public OidcIdentityProviderConfigRequest getOidc() {
        return this.oidc;
    }

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @param oidc
     *        An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigRequest withOidc(OidcIdentityProviderConfigRequest oidc) {
        setOidc(oidc);
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the configuration to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define.
     * </p>
     * 
     * @return The metadata to apply to the configuration to assist with categorization and organization. Each tag
     *         consists of a key and an optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata to apply to the configuration to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the configuration to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata to apply to the configuration to assist with categorization and organization. Each tag consists of a
     * key and an optional value, both of which you define.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the configuration to assist with categorization and organization. Each tag
     *        consists of a key and an optional value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AssociateIdentityProviderConfigRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigRequest addTagsEntry(String key, String value) {
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

    public AssociateIdentityProviderConfigRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getOidc() != null)
            sb.append("Oidc: ").append(getOidc()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateIdentityProviderConfigRequest == false)
            return false;
        AssociateIdentityProviderConfigRequest other = (AssociateIdentityProviderConfigRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getOidc() == null ^ this.getOidc() == null)
            return false;
        if (other.getOidc() != null && other.getOidc().equals(this.getOidc()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getOidc() == null) ? 0 : getOidc().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIdentityProviderConfigRequest clone() {
        return (AssociateIdentityProviderConfigRequest) super.clone();
    }

}
