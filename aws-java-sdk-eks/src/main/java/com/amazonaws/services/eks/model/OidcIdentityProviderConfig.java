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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the configuration for an OpenID Connect (OIDC) identity provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/OidcIdentityProviderConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcIdentityProviderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the configuration.
     * </p>
     */
    private String identityProviderConfigName;
    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     */
    private String identityProviderConfigArn;
    /**
     * <p>
     * The cluster that the configuration is associated to.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The URL of the OIDC identity provider that allows the API server to discover public signing keys for verifying
     * tokens.
     * </p>
     */
    private String issuerUrl;
    /**
     * <p>
     * This is also known as <i>audience</i>. The ID of the client application that makes authentication requests to the
     * OIDC identity provider.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The JSON Web token (JWT) claim that is used as the username.
     * </p>
     */
    private String usernameClaim;
    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't contain
     * <code>system:</code>
     * </p>
     */
    private String usernamePrefix;
    /**
     * <p>
     * The JSON web token (JWT) claim that the provider uses to return your groups.
     * </p>
     */
    private String groupsClaim;
    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> creates group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     * </p>
     */
    private String groupsPrefix;
    /**
     * <p>
     * The key-value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value.
     * </p>
     */
    private java.util.Map<String, String> requiredClaims;
    /**
     * <p>
     * The metadata to apply to the provider configuration to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you defined.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The status of the OIDC identity provider.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param identityProviderConfigName
     *        The name of the configuration.
     */

    public void setIdentityProviderConfigName(String identityProviderConfigName) {
        this.identityProviderConfigName = identityProviderConfigName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @return The name of the configuration.
     */

    public String getIdentityProviderConfigName() {
        return this.identityProviderConfigName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param identityProviderConfigName
     *        The name of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withIdentityProviderConfigName(String identityProviderConfigName) {
        setIdentityProviderConfigName(identityProviderConfigName);
        return this;
    }

    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     * 
     * @param identityProviderConfigArn
     *        The ARN of the configuration.
     */

    public void setIdentityProviderConfigArn(String identityProviderConfigArn) {
        this.identityProviderConfigArn = identityProviderConfigArn;
    }

    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     * 
     * @return The ARN of the configuration.
     */

    public String getIdentityProviderConfigArn() {
        return this.identityProviderConfigArn;
    }

    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     * 
     * @param identityProviderConfigArn
     *        The ARN of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withIdentityProviderConfigArn(String identityProviderConfigArn) {
        setIdentityProviderConfigArn(identityProviderConfigArn);
        return this;
    }

    /**
     * <p>
     * The cluster that the configuration is associated to.
     * </p>
     * 
     * @param clusterName
     *        The cluster that the configuration is associated to.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The cluster that the configuration is associated to.
     * </p>
     * 
     * @return The cluster that the configuration is associated to.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The cluster that the configuration is associated to.
     * </p>
     * 
     * @param clusterName
     *        The cluster that the configuration is associated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The URL of the OIDC identity provider that allows the API server to discover public signing keys for verifying
     * tokens.
     * </p>
     * 
     * @param issuerUrl
     *        The URL of the OIDC identity provider that allows the API server to discover public signing keys for
     *        verifying tokens.
     */

    public void setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
    }

    /**
     * <p>
     * The URL of the OIDC identity provider that allows the API server to discover public signing keys for verifying
     * tokens.
     * </p>
     * 
     * @return The URL of the OIDC identity provider that allows the API server to discover public signing keys for
     *         verifying tokens.
     */

    public String getIssuerUrl() {
        return this.issuerUrl;
    }

    /**
     * <p>
     * The URL of the OIDC identity provider that allows the API server to discover public signing keys for verifying
     * tokens.
     * </p>
     * 
     * @param issuerUrl
     *        The URL of the OIDC identity provider that allows the API server to discover public signing keys for
     *        verifying tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withIssuerUrl(String issuerUrl) {
        setIssuerUrl(issuerUrl);
        return this;
    }

    /**
     * <p>
     * This is also known as <i>audience</i>. The ID of the client application that makes authentication requests to the
     * OIDC identity provider.
     * </p>
     * 
     * @param clientId
     *        This is also known as <i>audience</i>. The ID of the client application that makes authentication requests
     *        to the OIDC identity provider.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * This is also known as <i>audience</i>. The ID of the client application that makes authentication requests to the
     * OIDC identity provider.
     * </p>
     * 
     * @return This is also known as <i>audience</i>. The ID of the client application that makes authentication
     *         requests to the OIDC identity provider.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * This is also known as <i>audience</i>. The ID of the client application that makes authentication requests to the
     * OIDC identity provider.
     * </p>
     * 
     * @param clientId
     *        This is also known as <i>audience</i>. The ID of the client application that makes authentication requests
     *        to the OIDC identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The JSON Web token (JWT) claim that is used as the username.
     * </p>
     * 
     * @param usernameClaim
     *        The JSON Web token (JWT) claim that is used as the username.
     */

    public void setUsernameClaim(String usernameClaim) {
        this.usernameClaim = usernameClaim;
    }

    /**
     * <p>
     * The JSON Web token (JWT) claim that is used as the username.
     * </p>
     * 
     * @return The JSON Web token (JWT) claim that is used as the username.
     */

    public String getUsernameClaim() {
        return this.usernameClaim;
    }

    /**
     * <p>
     * The JSON Web token (JWT) claim that is used as the username.
     * </p>
     * 
     * @param usernameClaim
     *        The JSON Web token (JWT) claim that is used as the username.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withUsernameClaim(String usernameClaim) {
        setUsernameClaim(usernameClaim);
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't contain
     * <code>system:</code>
     * </p>
     * 
     * @param usernamePrefix
     *        The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't
     *        contain <code>system:</code>
     */

    public void setUsernamePrefix(String usernamePrefix) {
        this.usernamePrefix = usernamePrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't contain
     * <code>system:</code>
     * </p>
     * 
     * @return The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't
     *         contain <code>system:</code>
     */

    public String getUsernamePrefix() {
        return this.usernamePrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't contain
     * <code>system:</code>
     * </p>
     * 
     * @param usernamePrefix
     *        The prefix that is prepended to username claims to prevent clashes with existing names. The prefix can't
     *        contain <code>system:</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withUsernamePrefix(String usernamePrefix) {
        setUsernamePrefix(usernamePrefix);
        return this;
    }

    /**
     * <p>
     * The JSON web token (JWT) claim that the provider uses to return your groups.
     * </p>
     * 
     * @param groupsClaim
     *        The JSON web token (JWT) claim that the provider uses to return your groups.
     */

    public void setGroupsClaim(String groupsClaim) {
        this.groupsClaim = groupsClaim;
    }

    /**
     * <p>
     * The JSON web token (JWT) claim that the provider uses to return your groups.
     * </p>
     * 
     * @return The JSON web token (JWT) claim that the provider uses to return your groups.
     */

    public String getGroupsClaim() {
        return this.groupsClaim;
    }

    /**
     * <p>
     * The JSON web token (JWT) claim that the provider uses to return your groups.
     * </p>
     * 
     * @param groupsClaim
     *        The JSON web token (JWT) claim that the provider uses to return your groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withGroupsClaim(String groupsClaim) {
        setGroupsClaim(groupsClaim);
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> creates group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     * </p>
     * 
     * @param groupsPrefix
     *        The prefix that is prepended to group claims to prevent clashes with existing names (such as
     *        <code>system:</code> groups). For example, the value<code> oidc:</code> creates group names like
     *        <code>oidc:engineering</code> and <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     */

    public void setGroupsPrefix(String groupsPrefix) {
        this.groupsPrefix = groupsPrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> creates group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     * </p>
     * 
     * @return The prefix that is prepended to group claims to prevent clashes with existing names (such as
     *         <code>system:</code> groups). For example, the value<code> oidc:</code> creates group names like
     *         <code>oidc:engineering</code> and <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     */

    public String getGroupsPrefix() {
        return this.groupsPrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> creates group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     * </p>
     * 
     * @param groupsPrefix
     *        The prefix that is prepended to group claims to prevent clashes with existing names (such as
     *        <code>system:</code> groups). For example, the value<code> oidc:</code> creates group names like
     *        <code>oidc:engineering</code> and <code>oidc:infra</code>. The prefix can't contain <code>system:</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withGroupsPrefix(String groupsPrefix) {
        setGroupsPrefix(groupsPrefix);
        return this;
    }

    /**
     * <p>
     * The key-value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value.
     * </p>
     * 
     * @return The key-value pairs that describe required claims in the identity token. If set, each claim is verified
     *         to be present in the token with a matching value.
     */

    public java.util.Map<String, String> getRequiredClaims() {
        return requiredClaims;
    }

    /**
     * <p>
     * The key-value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value.
     * </p>
     * 
     * @param requiredClaims
     *        The key-value pairs that describe required claims in the identity token. If set, each claim is verified to
     *        be present in the token with a matching value.
     */

    public void setRequiredClaims(java.util.Map<String, String> requiredClaims) {
        this.requiredClaims = requiredClaims;
    }

    /**
     * <p>
     * The key-value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value.
     * </p>
     * 
     * @param requiredClaims
     *        The key-value pairs that describe required claims in the identity token. If set, each claim is verified to
     *        be present in the token with a matching value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withRequiredClaims(java.util.Map<String, String> requiredClaims) {
        setRequiredClaims(requiredClaims);
        return this;
    }

    /**
     * Add a single RequiredClaims entry
     *
     * @see OidcIdentityProviderConfig#withRequiredClaims
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig addRequiredClaimsEntry(String key, String value) {
        if (null == this.requiredClaims) {
            this.requiredClaims = new java.util.HashMap<String, String>();
        }
        if (this.requiredClaims.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requiredClaims.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequiredClaims.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig clearRequiredClaimsEntries() {
        this.requiredClaims = null;
        return this;
    }

    /**
     * <p>
     * The metadata to apply to the provider configuration to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you defined.
     * </p>
     * 
     * @return The metadata to apply to the provider configuration to assist with categorization and organization. Each
     *         tag consists of a key and an optional value, both of which you defined.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata to apply to the provider configuration to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you defined.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the provider configuration to assist with categorization and organization. Each
     *        tag consists of a key and an optional value, both of which you defined.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The metadata to apply to the provider configuration to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you defined.
     * </p>
     * 
     * @param tags
     *        The metadata to apply to the provider configuration to assist with categorization and organization. Each
     *        tag consists of a key and an optional value, both of which you defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see OidcIdentityProviderConfig#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfig addTagsEntry(String key, String value) {
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

    public OidcIdentityProviderConfig clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The status of the OIDC identity provider.
     * </p>
     * 
     * @param status
     *        The status of the OIDC identity provider.
     * @see ConfigStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the OIDC identity provider.
     * </p>
     * 
     * @return The status of the OIDC identity provider.
     * @see ConfigStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the OIDC identity provider.
     * </p>
     * 
     * @param status
     *        The status of the OIDC identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigStatus
     */

    public OidcIdentityProviderConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the OIDC identity provider.
     * </p>
     * 
     * @param status
     *        The status of the OIDC identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigStatus
     */

    public OidcIdentityProviderConfig withStatus(ConfigStatus status) {
        this.status = status.toString();
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
        if (getIdentityProviderConfigName() != null)
            sb.append("IdentityProviderConfigName: ").append(getIdentityProviderConfigName()).append(",");
        if (getIdentityProviderConfigArn() != null)
            sb.append("IdentityProviderConfigArn: ").append(getIdentityProviderConfigArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getIssuerUrl() != null)
            sb.append("IssuerUrl: ").append(getIssuerUrl()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getUsernameClaim() != null)
            sb.append("UsernameClaim: ").append(getUsernameClaim()).append(",");
        if (getUsernamePrefix() != null)
            sb.append("UsernamePrefix: ").append(getUsernamePrefix()).append(",");
        if (getGroupsClaim() != null)
            sb.append("GroupsClaim: ").append(getGroupsClaim()).append(",");
        if (getGroupsPrefix() != null)
            sb.append("GroupsPrefix: ").append(getGroupsPrefix()).append(",");
        if (getRequiredClaims() != null)
            sb.append("RequiredClaims: ").append(getRequiredClaims()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OidcIdentityProviderConfig == false)
            return false;
        OidcIdentityProviderConfig other = (OidcIdentityProviderConfig) obj;
        if (other.getIdentityProviderConfigName() == null ^ this.getIdentityProviderConfigName() == null)
            return false;
        if (other.getIdentityProviderConfigName() != null && other.getIdentityProviderConfigName().equals(this.getIdentityProviderConfigName()) == false)
            return false;
        if (other.getIdentityProviderConfigArn() == null ^ this.getIdentityProviderConfigArn() == null)
            return false;
        if (other.getIdentityProviderConfigArn() != null && other.getIdentityProviderConfigArn().equals(this.getIdentityProviderConfigArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getIssuerUrl() == null ^ this.getIssuerUrl() == null)
            return false;
        if (other.getIssuerUrl() != null && other.getIssuerUrl().equals(this.getIssuerUrl()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getUsernameClaim() == null ^ this.getUsernameClaim() == null)
            return false;
        if (other.getUsernameClaim() != null && other.getUsernameClaim().equals(this.getUsernameClaim()) == false)
            return false;
        if (other.getUsernamePrefix() == null ^ this.getUsernamePrefix() == null)
            return false;
        if (other.getUsernamePrefix() != null && other.getUsernamePrefix().equals(this.getUsernamePrefix()) == false)
            return false;
        if (other.getGroupsClaim() == null ^ this.getGroupsClaim() == null)
            return false;
        if (other.getGroupsClaim() != null && other.getGroupsClaim().equals(this.getGroupsClaim()) == false)
            return false;
        if (other.getGroupsPrefix() == null ^ this.getGroupsPrefix() == null)
            return false;
        if (other.getGroupsPrefix() != null && other.getGroupsPrefix().equals(this.getGroupsPrefix()) == false)
            return false;
        if (other.getRequiredClaims() == null ^ this.getRequiredClaims() == null)
            return false;
        if (other.getRequiredClaims() != null && other.getRequiredClaims().equals(this.getRequiredClaims()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProviderConfigName() == null) ? 0 : getIdentityProviderConfigName().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderConfigArn() == null) ? 0 : getIdentityProviderConfigArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getIssuerUrl() == null) ? 0 : getIssuerUrl().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getUsernameClaim() == null) ? 0 : getUsernameClaim().hashCode());
        hashCode = prime * hashCode + ((getUsernamePrefix() == null) ? 0 : getUsernamePrefix().hashCode());
        hashCode = prime * hashCode + ((getGroupsClaim() == null) ? 0 : getGroupsClaim().hashCode());
        hashCode = prime * hashCode + ((getGroupsPrefix() == null) ? 0 : getGroupsPrefix().hashCode());
        hashCode = prime * hashCode + ((getRequiredClaims() == null) ? 0 : getRequiredClaims().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public OidcIdentityProviderConfig clone() {
        try {
            return (OidcIdentityProviderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.OidcIdentityProviderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
