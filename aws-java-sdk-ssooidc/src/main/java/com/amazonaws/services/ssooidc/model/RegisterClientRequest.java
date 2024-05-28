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
package com.amazonaws.services.ssooidc.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/RegisterClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     */
    private String clientType;
    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     */
    private java.util.List<String> scopes;
    /**
     * <p>
     * The list of redirect URI that are defined by the client. At completion of authorization, this list is used to
     * restrict what locations the user agent can be redirected back to.
     * </p>
     */
    private java.util.List<String> redirectUris;
    /**
     * <p>
     * The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     * granting flows available to the client.
     * </p>
     */
    private java.util.List<String> grantTypes;
    /**
     * <p>
     * The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is needed for
     * user access to resources through the client.
     * </p>
     */
    private String issuerUrl;
    /**
     * <p>
     * This IAM Identity Center application ARN is used to define administrator-managed configuration for public client
     * access to resources. At authorization, the scopes, grants, and redirect URI available to this client will be
     * restricted by this application resource.
     * </p>
     */
    private String entitledApplicationArn;

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     * 
     * @param clientName
     *        The friendly name of the client.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     * 
     * @return The friendly name of the client.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The friendly name of the client.
     * </p>
     * 
     * @param clientName
     *        The friendly name of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     * 
     * @param clientType
     *        The type of client. The service supports only <code>public</code> as a client type. Anything other than
     *        public will be rejected by the service.
     */

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     * 
     * @return The type of client. The service supports only <code>public</code> as a client type. Anything other than
     *         public will be rejected by the service.
     */

    public String getClientType() {
        return this.clientType;
    }

    /**
     * <p>
     * The type of client. The service supports only <code>public</code> as a client type. Anything other than public
     * will be rejected by the service.
     * </p>
     * 
     * @param clientType
     *        The type of client. The service supports only <code>public</code> as a client type. Anything other than
     *        public will be rejected by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withClientType(String clientType) {
        setClientType(clientType);
        return this;
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @return The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *         permissions when granting an access token.
     */

    public java.util.List<String> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @param scopes
     *        The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     */

    public void setScopes(java.util.Collection<String> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<String>(scopes);
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withScopes(String... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<String>(scopes.length));
        }
        for (String ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scopes that are defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @param scopes
     *        The list of scopes that are defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withScopes(java.util.Collection<String> scopes) {
        setScopes(scopes);
        return this;
    }

    /**
     * <p>
     * The list of redirect URI that are defined by the client. At completion of authorization, this list is used to
     * restrict what locations the user agent can be redirected back to.
     * </p>
     * 
     * @return The list of redirect URI that are defined by the client. At completion of authorization, this list is
     *         used to restrict what locations the user agent can be redirected back to.
     */

    public java.util.List<String> getRedirectUris() {
        return redirectUris;
    }

    /**
     * <p>
     * The list of redirect URI that are defined by the client. At completion of authorization, this list is used to
     * restrict what locations the user agent can be redirected back to.
     * </p>
     * 
     * @param redirectUris
     *        The list of redirect URI that are defined by the client. At completion of authorization, this list is used
     *        to restrict what locations the user agent can be redirected back to.
     */

    public void setRedirectUris(java.util.Collection<String> redirectUris) {
        if (redirectUris == null) {
            this.redirectUris = null;
            return;
        }

        this.redirectUris = new java.util.ArrayList<String>(redirectUris);
    }

    /**
     * <p>
     * The list of redirect URI that are defined by the client. At completion of authorization, this list is used to
     * restrict what locations the user agent can be redirected back to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedirectUris(java.util.Collection)} or {@link #withRedirectUris(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param redirectUris
     *        The list of redirect URI that are defined by the client. At completion of authorization, this list is used
     *        to restrict what locations the user agent can be redirected back to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withRedirectUris(String... redirectUris) {
        if (this.redirectUris == null) {
            setRedirectUris(new java.util.ArrayList<String>(redirectUris.length));
        }
        for (String ele : redirectUris) {
            this.redirectUris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of redirect URI that are defined by the client. At completion of authorization, this list is used to
     * restrict what locations the user agent can be redirected back to.
     * </p>
     * 
     * @param redirectUris
     *        The list of redirect URI that are defined by the client. At completion of authorization, this list is used
     *        to restrict what locations the user agent can be redirected back to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withRedirectUris(java.util.Collection<String> redirectUris) {
        setRedirectUris(redirectUris);
        return this;
    }

    /**
     * <p>
     * The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     * granting flows available to the client.
     * </p>
     * 
     * @return The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     *         granting flows available to the client.
     */

    public java.util.List<String> getGrantTypes() {
        return grantTypes;
    }

    /**
     * <p>
     * The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     * granting flows available to the client.
     * </p>
     * 
     * @param grantTypes
     *        The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     *        granting flows available to the client.
     */

    public void setGrantTypes(java.util.Collection<String> grantTypes) {
        if (grantTypes == null) {
            this.grantTypes = null;
            return;
        }

        this.grantTypes = new java.util.ArrayList<String>(grantTypes);
    }

    /**
     * <p>
     * The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     * granting flows available to the client.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantTypes(java.util.Collection)} or {@link #withGrantTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param grantTypes
     *        The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     *        granting flows available to the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withGrantTypes(String... grantTypes) {
        if (this.grantTypes == null) {
            setGrantTypes(new java.util.ArrayList<String>(grantTypes.length));
        }
        for (String ele : grantTypes) {
            this.grantTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     * granting flows available to the client.
     * </p>
     * 
     * @param grantTypes
     *        The list of OAuth 2.0 grant types that are defined by the client. This list is used to restrict the token
     *        granting flows available to the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withGrantTypes(java.util.Collection<String> grantTypes) {
        setGrantTypes(grantTypes);
        return this;
    }

    /**
     * <p>
     * The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is needed for
     * user access to resources through the client.
     * </p>
     * 
     * @param issuerUrl
     *        The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is
     *        needed for user access to resources through the client.
     */

    public void setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
    }

    /**
     * <p>
     * The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is needed for
     * user access to resources through the client.
     * </p>
     * 
     * @return The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is
     *         needed for user access to resources through the client.
     */

    public String getIssuerUrl() {
        return this.issuerUrl;
    }

    /**
     * <p>
     * The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is needed for
     * user access to resources through the client.
     * </p>
     * 
     * @param issuerUrl
     *        The IAM Identity Center Issuer URL associated with an instance of IAM Identity Center. This value is
     *        needed for user access to resources through the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withIssuerUrl(String issuerUrl) {
        setIssuerUrl(issuerUrl);
        return this;
    }

    /**
     * <p>
     * This IAM Identity Center application ARN is used to define administrator-managed configuration for public client
     * access to resources. At authorization, the scopes, grants, and redirect URI available to this client will be
     * restricted by this application resource.
     * </p>
     * 
     * @param entitledApplicationArn
     *        This IAM Identity Center application ARN is used to define administrator-managed configuration for public
     *        client access to resources. At authorization, the scopes, grants, and redirect URI available to this
     *        client will be restricted by this application resource.
     */

    public void setEntitledApplicationArn(String entitledApplicationArn) {
        this.entitledApplicationArn = entitledApplicationArn;
    }

    /**
     * <p>
     * This IAM Identity Center application ARN is used to define administrator-managed configuration for public client
     * access to resources. At authorization, the scopes, grants, and redirect URI available to this client will be
     * restricted by this application resource.
     * </p>
     * 
     * @return This IAM Identity Center application ARN is used to define administrator-managed configuration for public
     *         client access to resources. At authorization, the scopes, grants, and redirect URI available to this
     *         client will be restricted by this application resource.
     */

    public String getEntitledApplicationArn() {
        return this.entitledApplicationArn;
    }

    /**
     * <p>
     * This IAM Identity Center application ARN is used to define administrator-managed configuration for public client
     * access to resources. At authorization, the scopes, grants, and redirect URI available to this client will be
     * restricted by this application resource.
     * </p>
     * 
     * @param entitledApplicationArn
     *        This IAM Identity Center application ARN is used to define administrator-managed configuration for public
     *        client access to resources. At authorization, the scopes, grants, and redirect URI available to this
     *        client will be restricted by this application resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientRequest withEntitledApplicationArn(String entitledApplicationArn) {
        setEntitledApplicationArn(entitledApplicationArn);
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
        if (getClientName() != null)
            sb.append("ClientName: ").append(getClientName()).append(",");
        if (getClientType() != null)
            sb.append("ClientType: ").append(getClientType()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes()).append(",");
        if (getRedirectUris() != null)
            sb.append("RedirectUris: ").append(getRedirectUris()).append(",");
        if (getGrantTypes() != null)
            sb.append("GrantTypes: ").append(getGrantTypes()).append(",");
        if (getIssuerUrl() != null)
            sb.append("IssuerUrl: ").append(getIssuerUrl()).append(",");
        if (getEntitledApplicationArn() != null)
            sb.append("EntitledApplicationArn: ").append(getEntitledApplicationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterClientRequest == false)
            return false;
        RegisterClientRequest other = (RegisterClientRequest) obj;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getClientType() == null ^ this.getClientType() == null)
            return false;
        if (other.getClientType() != null && other.getClientType().equals(this.getClientType()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        if (other.getRedirectUris() == null ^ this.getRedirectUris() == null)
            return false;
        if (other.getRedirectUris() != null && other.getRedirectUris().equals(this.getRedirectUris()) == false)
            return false;
        if (other.getGrantTypes() == null ^ this.getGrantTypes() == null)
            return false;
        if (other.getGrantTypes() != null && other.getGrantTypes().equals(this.getGrantTypes()) == false)
            return false;
        if (other.getIssuerUrl() == null ^ this.getIssuerUrl() == null)
            return false;
        if (other.getIssuerUrl() != null && other.getIssuerUrl().equals(this.getIssuerUrl()) == false)
            return false;
        if (other.getEntitledApplicationArn() == null ^ this.getEntitledApplicationArn() == null)
            return false;
        if (other.getEntitledApplicationArn() != null && other.getEntitledApplicationArn().equals(this.getEntitledApplicationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getClientType() == null) ? 0 : getClientType().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        hashCode = prime * hashCode + ((getRedirectUris() == null) ? 0 : getRedirectUris().hashCode());
        hashCode = prime * hashCode + ((getGrantTypes() == null) ? 0 : getGrantTypes().hashCode());
        hashCode = prime * hashCode + ((getIssuerUrl() == null) ? 0 : getIssuerUrl().hashCode());
        hashCode = prime * hashCode + ((getEntitledApplicationArn() == null) ? 0 : getEntitledApplicationArn().hashCode());
        return hashCode;
    }

    @Override
    public RegisterClientRequest clone() {
        return (RegisterClientRequest) super.clone();
    }

}
