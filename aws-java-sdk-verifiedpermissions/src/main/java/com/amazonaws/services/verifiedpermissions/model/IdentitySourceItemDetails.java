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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains configuration of the identity source.
 * </p>
 * <p>
 * This data type was a response parameter for the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListIdentitySources.html"
 * >ListIdentitySources</a> operation. Replaced by <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ConfigurationItem.html"
 * >ConfigurationItem</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IdentitySourceItemDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentitySourceItemDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application client IDs associated with the specified Amazon Cognito user pool that are enabled for this
     * identity source.
     * </p>
     */
    @Deprecated
    private java.util.List<String> clientIds;
    /**
     * <p>
     * The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     * </p>
     */
    @Deprecated
    private String userPoolArn;
    /**
     * <p>
     * The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the following
     * format. This URL replaces the placeholders for both the Amazon Web Services Region and the user pool identifier
     * with those appropriate for this user pool.
     * </p>
     * <p>
     * <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     * </p>
     */
    @Deprecated
    private String discoveryUrl;
    /**
     * <p>
     * A string that identifies the type of OIDC service represented by this identity source.
     * </p>
     * <p>
     * At this time, the only valid value is <code>cognito</code>.
     * </p>
     */
    @Deprecated
    private String openIdIssuer;

    /**
     * <p>
     * The application client IDs associated with the specified Amazon Cognito user pool that are enabled for this
     * identity source.
     * </p>
     * 
     * @return The application client IDs associated with the specified Amazon Cognito user pool that are enabled for
     *         this identity source.
     */
    @Deprecated
    public java.util.List<String> getClientIds() {
        return clientIds;
    }

    /**
     * <p>
     * The application client IDs associated with the specified Amazon Cognito user pool that are enabled for this
     * identity source.
     * </p>
     * 
     * @param clientIds
     *        The application client IDs associated with the specified Amazon Cognito user pool that are enabled for
     *        this identity source.
     */
    @Deprecated
    public void setClientIds(java.util.Collection<String> clientIds) {
        if (clientIds == null) {
            this.clientIds = null;
            return;
        }

        this.clientIds = new java.util.ArrayList<String>(clientIds);
    }

    /**
     * <p>
     * The application client IDs associated with the specified Amazon Cognito user pool that are enabled for this
     * identity source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientIds(java.util.Collection)} or {@link #withClientIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clientIds
     *        The application client IDs associated with the specified Amazon Cognito user pool that are enabled for
     *        this identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public IdentitySourceItemDetails withClientIds(String... clientIds) {
        if (this.clientIds == null) {
            setClientIds(new java.util.ArrayList<String>(clientIds.length));
        }
        for (String ele : clientIds) {
            this.clientIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The application client IDs associated with the specified Amazon Cognito user pool that are enabled for this
     * identity source.
     * </p>
     * 
     * @param clientIds
     *        The application client IDs associated with the specified Amazon Cognito user pool that are enabled for
     *        this identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public IdentitySourceItemDetails withClientIds(java.util.Collection<String> clientIds) {
        setClientIds(clientIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     * </p>
     * 
     * @param userPoolArn
     *        The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     */
    @Deprecated
    public void setUserPoolArn(String userPoolArn) {
        this.userPoolArn = userPoolArn;
    }

    /**
     * <p>
     * The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     * </p>
     * 
     * @return The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     */
    @Deprecated
    public String getUserPoolArn() {
        return this.userPoolArn;
    }

    /**
     * <p>
     * The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     * </p>
     * 
     * @param userPoolArn
     *        The Amazon Cognito user pool whose identities are accessible to this Verified Permissions policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public IdentitySourceItemDetails withUserPoolArn(String userPoolArn) {
        setUserPoolArn(userPoolArn);
        return this;
    }

    /**
     * <p>
     * The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the following
     * format. This URL replaces the placeholders for both the Amazon Web Services Region and the user pool identifier
     * with those appropriate for this user pool.
     * </p>
     * <p>
     * <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     * </p>
     * 
     * @param discoveryUrl
     *        The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the
     *        following format. This URL replaces the placeholders for both the Amazon Web Services Region and the user
     *        pool identifier with those appropriate for this user pool.</p>
     *        <p>
     *        <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     */
    @Deprecated
    public void setDiscoveryUrl(String discoveryUrl) {
        this.discoveryUrl = discoveryUrl;
    }

    /**
     * <p>
     * The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the following
     * format. This URL replaces the placeholders for both the Amazon Web Services Region and the user pool identifier
     * with those appropriate for this user pool.
     * </p>
     * <p>
     * <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     * </p>
     * 
     * @return The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the
     *         following format. This URL replaces the placeholders for both the Amazon Web Services Region and the user
     *         pool identifier with those appropriate for this user pool.</p>
     *         <p>
     *         <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     */
    @Deprecated
    public String getDiscoveryUrl() {
        return this.discoveryUrl;
    }

    /**
     * <p>
     * The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the following
     * format. This URL replaces the placeholders for both the Amazon Web Services Region and the user pool identifier
     * with those appropriate for this user pool.
     * </p>
     * <p>
     * <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     * </p>
     * 
     * @param discoveryUrl
     *        The well-known URL that points to this user pool's OIDC discovery endpoint. This is a URL string in the
     *        following format. This URL replaces the placeholders for both the Amazon Web Services Region and the user
     *        pool identifier with those appropriate for this user pool.</p>
     *        <p>
     *        <code>https://cognito-idp.<i>&lt;region&gt;</i>.amazonaws.com/<i>&lt;user-pool-id&gt;</i>/.well-known/openid-configuration</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public IdentitySourceItemDetails withDiscoveryUrl(String discoveryUrl) {
        setDiscoveryUrl(discoveryUrl);
        return this;
    }

    /**
     * <p>
     * A string that identifies the type of OIDC service represented by this identity source.
     * </p>
     * <p>
     * At this time, the only valid value is <code>cognito</code>.
     * </p>
     * 
     * @param openIdIssuer
     *        A string that identifies the type of OIDC service represented by this identity source. </p>
     *        <p>
     *        At this time, the only valid value is <code>cognito</code>.
     * @see OpenIdIssuer
     */
    @Deprecated
    public void setOpenIdIssuer(String openIdIssuer) {
        this.openIdIssuer = openIdIssuer;
    }

    /**
     * <p>
     * A string that identifies the type of OIDC service represented by this identity source.
     * </p>
     * <p>
     * At this time, the only valid value is <code>cognito</code>.
     * </p>
     * 
     * @return A string that identifies the type of OIDC service represented by this identity source. </p>
     *         <p>
     *         At this time, the only valid value is <code>cognito</code>.
     * @see OpenIdIssuer
     */
    @Deprecated
    public String getOpenIdIssuer() {
        return this.openIdIssuer;
    }

    /**
     * <p>
     * A string that identifies the type of OIDC service represented by this identity source.
     * </p>
     * <p>
     * At this time, the only valid value is <code>cognito</code>.
     * </p>
     * 
     * @param openIdIssuer
     *        A string that identifies the type of OIDC service represented by this identity source. </p>
     *        <p>
     *        At this time, the only valid value is <code>cognito</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenIdIssuer
     */
    @Deprecated
    public IdentitySourceItemDetails withOpenIdIssuer(String openIdIssuer) {
        setOpenIdIssuer(openIdIssuer);
        return this;
    }

    /**
     * <p>
     * A string that identifies the type of OIDC service represented by this identity source.
     * </p>
     * <p>
     * At this time, the only valid value is <code>cognito</code>.
     * </p>
     * 
     * @param openIdIssuer
     *        A string that identifies the type of OIDC service represented by this identity source. </p>
     *        <p>
     *        At this time, the only valid value is <code>cognito</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenIdIssuer
     */
    @Deprecated
    public IdentitySourceItemDetails withOpenIdIssuer(OpenIdIssuer openIdIssuer) {
        this.openIdIssuer = openIdIssuer.toString();
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
        if (getClientIds() != null)
            sb.append("ClientIds: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserPoolArn() != null)
            sb.append("UserPoolArn: ").append(getUserPoolArn()).append(",");
        if (getDiscoveryUrl() != null)
            sb.append("DiscoveryUrl: ").append(getDiscoveryUrl()).append(",");
        if (getOpenIdIssuer() != null)
            sb.append("OpenIdIssuer: ").append(getOpenIdIssuer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentitySourceItemDetails == false)
            return false;
        IdentitySourceItemDetails other = (IdentitySourceItemDetails) obj;
        if (other.getClientIds() == null ^ this.getClientIds() == null)
            return false;
        if (other.getClientIds() != null && other.getClientIds().equals(this.getClientIds()) == false)
            return false;
        if (other.getUserPoolArn() == null ^ this.getUserPoolArn() == null)
            return false;
        if (other.getUserPoolArn() != null && other.getUserPoolArn().equals(this.getUserPoolArn()) == false)
            return false;
        if (other.getDiscoveryUrl() == null ^ this.getDiscoveryUrl() == null)
            return false;
        if (other.getDiscoveryUrl() != null && other.getDiscoveryUrl().equals(this.getDiscoveryUrl()) == false)
            return false;
        if (other.getOpenIdIssuer() == null ^ this.getOpenIdIssuer() == null)
            return false;
        if (other.getOpenIdIssuer() != null && other.getOpenIdIssuer().equals(this.getOpenIdIssuer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientIds() == null) ? 0 : getClientIds().hashCode());
        hashCode = prime * hashCode + ((getUserPoolArn() == null) ? 0 : getUserPoolArn().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryUrl() == null) ? 0 : getDiscoveryUrl().hashCode());
        hashCode = prime * hashCode + ((getOpenIdIssuer() == null) ? 0 : getOpenIdIssuer().hashCode());
        return hashCode;
    }

    @Override
    public IdentitySourceItemDetails clone() {
        try {
            return (IdentitySourceItemDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.IdentitySourceItemDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
