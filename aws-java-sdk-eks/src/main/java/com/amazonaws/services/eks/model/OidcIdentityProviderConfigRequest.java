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
 * An object representing an OpenID Connect (OIDC) configuration. Before associating an OIDC identity provider to your
 * cluster, review the considerations in <a
 * href="https://docs.aws.amazon.com/eks/latest/userguide/authenticate-oidc-identity-provider.html">Authenticating users
 * for your cluster from an OpenID Connect identity provider</a> in the <i>Amazon EKS User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/OidcIdentityProviderConfigRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcIdentityProviderConfigRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the OIDC provider configuration.
     * </p>
     */
    private String identityProviderConfigName;
    /**
     * <p>
     * The URL of the OpenID identity provider that allows the API server to discover public signing keys for verifying
     * tokens. The URL must begin with <code>https://</code> and should correspond to the <code>iss</code> claim in the
     * provider's OIDC ID tokens. Per the OIDC standard, path components are allowed but query parameters are not.
     * Typically the URL consists of only a hostname, like <code>https://server.example.org</code> or
     * <code>https://example.com</code>. This URL should point to the level below
     * <code>.well-known/openid-configuration</code> and must be publicly accessible over the internet.
     * </p>
     */
    private String issuerUrl;
    /**
     * <p>
     * This is also known as <i>audience</i>. The ID for the client application that makes authentication requests to
     * the OpenID identity provider.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected to be a
     * unique identifier of the end user. You can choose other claims, such as <code>email</code> or <code>name</code>,
     * depending on the OpenID identity provider. Claims other than <code>email</code> are prefixed with the issuer URL
     * to prevent naming clashes with other plug-ins.
     * </p>
     */
    private String usernameClaim;
    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. If you do not provide
     * this field, and <code>username</code> is a value other than <code>email</code>, the prefix defaults to
     * <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     * </p>
     */
    private String usernamePrefix;
    /**
     * <p>
     * The JWT claim that the provider uses to return your groups.
     * </p>
     */
    private String groupsClaim;
    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> will create group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>.
     * </p>
     */
    private String groupsPrefix;
    /**
     * <p>
     * The key value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value. For the maximum number of claims that you can require, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> requiredClaims;

    /**
     * <p>
     * The name of the OIDC provider configuration.
     * </p>
     * 
     * @param identityProviderConfigName
     *        The name of the OIDC provider configuration.
     */

    public void setIdentityProviderConfigName(String identityProviderConfigName) {
        this.identityProviderConfigName = identityProviderConfigName;
    }

    /**
     * <p>
     * The name of the OIDC provider configuration.
     * </p>
     * 
     * @return The name of the OIDC provider configuration.
     */

    public String getIdentityProviderConfigName() {
        return this.identityProviderConfigName;
    }

    /**
     * <p>
     * The name of the OIDC provider configuration.
     * </p>
     * 
     * @param identityProviderConfigName
     *        The name of the OIDC provider configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withIdentityProviderConfigName(String identityProviderConfigName) {
        setIdentityProviderConfigName(identityProviderConfigName);
        return this;
    }

    /**
     * <p>
     * The URL of the OpenID identity provider that allows the API server to discover public signing keys for verifying
     * tokens. The URL must begin with <code>https://</code> and should correspond to the <code>iss</code> claim in the
     * provider's OIDC ID tokens. Per the OIDC standard, path components are allowed but query parameters are not.
     * Typically the URL consists of only a hostname, like <code>https://server.example.org</code> or
     * <code>https://example.com</code>. This URL should point to the level below
     * <code>.well-known/openid-configuration</code> and must be publicly accessible over the internet.
     * </p>
     * 
     * @param issuerUrl
     *        The URL of the OpenID identity provider that allows the API server to discover public signing keys for
     *        verifying tokens. The URL must begin with <code>https://</code> and should correspond to the
     *        <code>iss</code> claim in the provider's OIDC ID tokens. Per the OIDC standard, path components are
     *        allowed but query parameters are not. Typically the URL consists of only a hostname, like
     *        <code>https://server.example.org</code> or <code>https://example.com</code>. This URL should point to the
     *        level below <code>.well-known/openid-configuration</code> and must be publicly accessible over the
     *        internet.
     */

    public void setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
    }

    /**
     * <p>
     * The URL of the OpenID identity provider that allows the API server to discover public signing keys for verifying
     * tokens. The URL must begin with <code>https://</code> and should correspond to the <code>iss</code> claim in the
     * provider's OIDC ID tokens. Per the OIDC standard, path components are allowed but query parameters are not.
     * Typically the URL consists of only a hostname, like <code>https://server.example.org</code> or
     * <code>https://example.com</code>. This URL should point to the level below
     * <code>.well-known/openid-configuration</code> and must be publicly accessible over the internet.
     * </p>
     * 
     * @return The URL of the OpenID identity provider that allows the API server to discover public signing keys for
     *         verifying tokens. The URL must begin with <code>https://</code> and should correspond to the
     *         <code>iss</code> claim in the provider's OIDC ID tokens. Per the OIDC standard, path components are
     *         allowed but query parameters are not. Typically the URL consists of only a hostname, like
     *         <code>https://server.example.org</code> or <code>https://example.com</code>. This URL should point to the
     *         level below <code>.well-known/openid-configuration</code> and must be publicly accessible over the
     *         internet.
     */

    public String getIssuerUrl() {
        return this.issuerUrl;
    }

    /**
     * <p>
     * The URL of the OpenID identity provider that allows the API server to discover public signing keys for verifying
     * tokens. The URL must begin with <code>https://</code> and should correspond to the <code>iss</code> claim in the
     * provider's OIDC ID tokens. Per the OIDC standard, path components are allowed but query parameters are not.
     * Typically the URL consists of only a hostname, like <code>https://server.example.org</code> or
     * <code>https://example.com</code>. This URL should point to the level below
     * <code>.well-known/openid-configuration</code> and must be publicly accessible over the internet.
     * </p>
     * 
     * @param issuerUrl
     *        The URL of the OpenID identity provider that allows the API server to discover public signing keys for
     *        verifying tokens. The URL must begin with <code>https://</code> and should correspond to the
     *        <code>iss</code> claim in the provider's OIDC ID tokens. Per the OIDC standard, path components are
     *        allowed but query parameters are not. Typically the URL consists of only a hostname, like
     *        <code>https://server.example.org</code> or <code>https://example.com</code>. This URL should point to the
     *        level below <code>.well-known/openid-configuration</code> and must be publicly accessible over the
     *        internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withIssuerUrl(String issuerUrl) {
        setIssuerUrl(issuerUrl);
        return this;
    }

    /**
     * <p>
     * This is also known as <i>audience</i>. The ID for the client application that makes authentication requests to
     * the OpenID identity provider.
     * </p>
     * 
     * @param clientId
     *        This is also known as <i>audience</i>. The ID for the client application that makes authentication
     *        requests to the OpenID identity provider.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * This is also known as <i>audience</i>. The ID for the client application that makes authentication requests to
     * the OpenID identity provider.
     * </p>
     * 
     * @return This is also known as <i>audience</i>. The ID for the client application that makes authentication
     *         requests to the OpenID identity provider.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * This is also known as <i>audience</i>. The ID for the client application that makes authentication requests to
     * the OpenID identity provider.
     * </p>
     * 
     * @param clientId
     *        This is also known as <i>audience</i>. The ID for the client application that makes authentication
     *        requests to the OpenID identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected to be a
     * unique identifier of the end user. You can choose other claims, such as <code>email</code> or <code>name</code>,
     * depending on the OpenID identity provider. Claims other than <code>email</code> are prefixed with the issuer URL
     * to prevent naming clashes with other plug-ins.
     * </p>
     * 
     * @param usernameClaim
     *        The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected
     *        to be a unique identifier of the end user. You can choose other claims, such as <code>email</code> or
     *        <code>name</code>, depending on the OpenID identity provider. Claims other than <code>email</code> are
     *        prefixed with the issuer URL to prevent naming clashes with other plug-ins.
     */

    public void setUsernameClaim(String usernameClaim) {
        this.usernameClaim = usernameClaim;
    }

    /**
     * <p>
     * The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected to be a
     * unique identifier of the end user. You can choose other claims, such as <code>email</code> or <code>name</code>,
     * depending on the OpenID identity provider. Claims other than <code>email</code> are prefixed with the issuer URL
     * to prevent naming clashes with other plug-ins.
     * </p>
     * 
     * @return The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected
     *         to be a unique identifier of the end user. You can choose other claims, such as <code>email</code> or
     *         <code>name</code>, depending on the OpenID identity provider. Claims other than <code>email</code> are
     *         prefixed with the issuer URL to prevent naming clashes with other plug-ins.
     */

    public String getUsernameClaim() {
        return this.usernameClaim;
    }

    /**
     * <p>
     * The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected to be a
     * unique identifier of the end user. You can choose other claims, such as <code>email</code> or <code>name</code>,
     * depending on the OpenID identity provider. Claims other than <code>email</code> are prefixed with the issuer URL
     * to prevent naming clashes with other plug-ins.
     * </p>
     * 
     * @param usernameClaim
     *        The JSON Web Token (JWT) claim to use as the username. The default is <code>sub</code>, which is expected
     *        to be a unique identifier of the end user. You can choose other claims, such as <code>email</code> or
     *        <code>name</code>, depending on the OpenID identity provider. Claims other than <code>email</code> are
     *        prefixed with the issuer URL to prevent naming clashes with other plug-ins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withUsernameClaim(String usernameClaim) {
        setUsernameClaim(usernameClaim);
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. If you do not provide
     * this field, and <code>username</code> is a value other than <code>email</code>, the prefix defaults to
     * <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     * </p>
     * 
     * @param usernamePrefix
     *        The prefix that is prepended to username claims to prevent clashes with existing names. If you do not
     *        provide this field, and <code>username</code> is a value other than <code>email</code>, the prefix
     *        defaults to <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     */

    public void setUsernamePrefix(String usernamePrefix) {
        this.usernamePrefix = usernamePrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. If you do not provide
     * this field, and <code>username</code> is a value other than <code>email</code>, the prefix defaults to
     * <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     * </p>
     * 
     * @return The prefix that is prepended to username claims to prevent clashes with existing names. If you do not
     *         provide this field, and <code>username</code> is a value other than <code>email</code>, the prefix
     *         defaults to <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     */

    public String getUsernamePrefix() {
        return this.usernamePrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to username claims to prevent clashes with existing names. If you do not provide
     * this field, and <code>username</code> is a value other than <code>email</code>, the prefix defaults to
     * <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     * </p>
     * 
     * @param usernamePrefix
     *        The prefix that is prepended to username claims to prevent clashes with existing names. If you do not
     *        provide this field, and <code>username</code> is a value other than <code>email</code>, the prefix
     *        defaults to <code>issuerurl#</code>. You can use the value <code>-</code> to disable all prefixing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withUsernamePrefix(String usernamePrefix) {
        setUsernamePrefix(usernamePrefix);
        return this;
    }

    /**
     * <p>
     * The JWT claim that the provider uses to return your groups.
     * </p>
     * 
     * @param groupsClaim
     *        The JWT claim that the provider uses to return your groups.
     */

    public void setGroupsClaim(String groupsClaim) {
        this.groupsClaim = groupsClaim;
    }

    /**
     * <p>
     * The JWT claim that the provider uses to return your groups.
     * </p>
     * 
     * @return The JWT claim that the provider uses to return your groups.
     */

    public String getGroupsClaim() {
        return this.groupsClaim;
    }

    /**
     * <p>
     * The JWT claim that the provider uses to return your groups.
     * </p>
     * 
     * @param groupsClaim
     *        The JWT claim that the provider uses to return your groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withGroupsClaim(String groupsClaim) {
        setGroupsClaim(groupsClaim);
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> will create group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>.
     * </p>
     * 
     * @param groupsPrefix
     *        The prefix that is prepended to group claims to prevent clashes with existing names (such as
     *        <code>system:</code> groups). For example, the value<code> oidc:</code> will create group names like
     *        <code>oidc:engineering</code> and <code>oidc:infra</code>.
     */

    public void setGroupsPrefix(String groupsPrefix) {
        this.groupsPrefix = groupsPrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> will create group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>.
     * </p>
     * 
     * @return The prefix that is prepended to group claims to prevent clashes with existing names (such as
     *         <code>system:</code> groups). For example, the value<code> oidc:</code> will create group names like
     *         <code>oidc:engineering</code> and <code>oidc:infra</code>.
     */

    public String getGroupsPrefix() {
        return this.groupsPrefix;
    }

    /**
     * <p>
     * The prefix that is prepended to group claims to prevent clashes with existing names (such as <code>system:</code>
     * groups). For example, the value<code> oidc:</code> will create group names like <code>oidc:engineering</code> and
     * <code>oidc:infra</code>.
     * </p>
     * 
     * @param groupsPrefix
     *        The prefix that is prepended to group claims to prevent clashes with existing names (such as
     *        <code>system:</code> groups). For example, the value<code> oidc:</code> will create group names like
     *        <code>oidc:engineering</code> and <code>oidc:infra</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withGroupsPrefix(String groupsPrefix) {
        setGroupsPrefix(groupsPrefix);
        return this;
    }

    /**
     * <p>
     * The key value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value. For the maximum number of claims that you can require, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @return The key value pairs that describe required claims in the identity token. If set, each claim is verified
     *         to be present in the token with a matching value. For the maximum number of claims that you can require,
     *         see <a href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service
     *         quotas</a> in the <i>Amazon EKS User Guide</i>.
     */

    public java.util.Map<String, String> getRequiredClaims() {
        return requiredClaims;
    }

    /**
     * <p>
     * The key value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value. For the maximum number of claims that you can require, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param requiredClaims
     *        The key value pairs that describe required claims in the identity token. If set, each claim is verified to
     *        be present in the token with a matching value. For the maximum number of claims that you can require, see
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service
     *        quotas</a> in the <i>Amazon EKS User Guide</i>.
     */

    public void setRequiredClaims(java.util.Map<String, String> requiredClaims) {
        this.requiredClaims = requiredClaims;
    }

    /**
     * <p>
     * The key value pairs that describe required claims in the identity token. If set, each claim is verified to be
     * present in the token with a matching value. For the maximum number of claims that you can require, see <a
     * href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service quotas</a> in the
     * <i>Amazon EKS User Guide</i>.
     * </p>
     * 
     * @param requiredClaims
     *        The key value pairs that describe required claims in the identity token. If set, each claim is verified to
     *        be present in the token with a matching value. For the maximum number of claims that you can require, see
     *        <a href="https://docs.aws.amazon.com/eks/latest/userguide/service-quotas.html">Amazon EKS service
     *        quotas</a> in the <i>Amazon EKS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest withRequiredClaims(java.util.Map<String, String> requiredClaims) {
        setRequiredClaims(requiredClaims);
        return this;
    }

    /**
     * Add a single RequiredClaims entry
     *
     * @see OidcIdentityProviderConfigRequest#withRequiredClaims
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OidcIdentityProviderConfigRequest addRequiredClaimsEntry(String key, String value) {
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

    public OidcIdentityProviderConfigRequest clearRequiredClaimsEntries() {
        this.requiredClaims = null;
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
            sb.append("RequiredClaims: ").append(getRequiredClaims());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OidcIdentityProviderConfigRequest == false)
            return false;
        OidcIdentityProviderConfigRequest other = (OidcIdentityProviderConfigRequest) obj;
        if (other.getIdentityProviderConfigName() == null ^ this.getIdentityProviderConfigName() == null)
            return false;
        if (other.getIdentityProviderConfigName() != null && other.getIdentityProviderConfigName().equals(this.getIdentityProviderConfigName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProviderConfigName() == null) ? 0 : getIdentityProviderConfigName().hashCode());
        hashCode = prime * hashCode + ((getIssuerUrl() == null) ? 0 : getIssuerUrl().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getUsernameClaim() == null) ? 0 : getUsernameClaim().hashCode());
        hashCode = prime * hashCode + ((getUsernamePrefix() == null) ? 0 : getUsernamePrefix().hashCode());
        hashCode = prime * hashCode + ((getGroupsClaim() == null) ? 0 : getGroupsClaim().hashCode());
        hashCode = prime * hashCode + ((getGroupsPrefix() == null) ? 0 : getGroupsPrefix().hashCode());
        hashCode = prime * hashCode + ((getRequiredClaims() == null) ? 0 : getRequiredClaims().hashCode());
        return hashCode;
    }

    @Override
    public OidcIdentityProviderConfigRequest clone() {
        try {
            return (OidcIdentityProviderConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.OidcIdentityProviderConfigRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
