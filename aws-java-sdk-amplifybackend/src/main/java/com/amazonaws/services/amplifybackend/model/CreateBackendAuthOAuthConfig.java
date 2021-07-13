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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Creates the OAuth configuration for your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuthOAuthConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendAuthOAuthConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain prefix for your Amplify app.
     * </p>
     */
    private String domainPrefix;
    /**
     * <p>
     * The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * </p>
     */
    private String oAuthGrantType;
    /**
     * <p>
     * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * </p>
     */
    private java.util.List<String> oAuthScopes;
    /**
     * <p>
     * The redirected URI for signing in to your Amplify app.
     * </p>
     */
    private java.util.List<String> redirectSignInURIs;
    /**
     * <p>
     * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * </p>
     */
    private java.util.List<String> redirectSignOutURIs;
    /**
     * <p>
     * The settings for using social providers to access your Amplify app.
     * </p>
     */
    private SocialProviderSettings socialProviderSettings;

    /**
     * <p>
     * The domain prefix for your Amplify app.
     * </p>
     * 
     * @param domainPrefix
     *        The domain prefix for your Amplify app.
     */

    public void setDomainPrefix(String domainPrefix) {
        this.domainPrefix = domainPrefix;
    }

    /**
     * <p>
     * The domain prefix for your Amplify app.
     * </p>
     * 
     * @return The domain prefix for your Amplify app.
     */

    public String getDomainPrefix() {
        return this.domainPrefix;
    }

    /**
     * <p>
     * The domain prefix for your Amplify app.
     * </p>
     * 
     * @param domainPrefix
     *        The domain prefix for your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthOAuthConfig withDomainPrefix(String domainPrefix) {
        setDomainPrefix(domainPrefix);
        return this;
    }

    /**
     * <p>
     * The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * </p>
     * 
     * @param oAuthGrantType
     *        The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * @see OAuthGrantType
     */

    public void setOAuthGrantType(String oAuthGrantType) {
        this.oAuthGrantType = oAuthGrantType;
    }

    /**
     * <p>
     * The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * </p>
     * 
     * @return The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * @see OAuthGrantType
     */

    public String getOAuthGrantType() {
        return this.oAuthGrantType;
    }

    /**
     * <p>
     * The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * </p>
     * 
     * @param oAuthGrantType
     *        The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthGrantType
     */

    public CreateBackendAuthOAuthConfig withOAuthGrantType(String oAuthGrantType) {
        setOAuthGrantType(oAuthGrantType);
        return this;
    }

    /**
     * <p>
     * The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * </p>
     * 
     * @param oAuthGrantType
     *        The OAuth grant type that you use to allow app users to authenticate from your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthGrantType
     */

    public CreateBackendAuthOAuthConfig withOAuthGrantType(OAuthGrantType oAuthGrantType) {
        this.oAuthGrantType = oAuthGrantType.toString();
        return this;
    }

    /**
     * <p>
     * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * </p>
     * 
     * @return List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * @see OAuthScopesElement
     */

    public java.util.List<String> getOAuthScopes() {
        return oAuthScopes;
    }

    /**
     * <p>
     * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * </p>
     * 
     * @param oAuthScopes
     *        List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * @see OAuthScopesElement
     */

    public void setOAuthScopes(java.util.Collection<String> oAuthScopes) {
        if (oAuthScopes == null) {
            this.oAuthScopes = null;
            return;
        }

        this.oAuthScopes = new java.util.ArrayList<String>(oAuthScopes);
    }

    /**
     * <p>
     * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOAuthScopes(java.util.Collection)} or {@link #withOAuthScopes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oAuthScopes
     *        List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthScopesElement
     */

    public CreateBackendAuthOAuthConfig withOAuthScopes(String... oAuthScopes) {
        if (this.oAuthScopes == null) {
            setOAuthScopes(new java.util.ArrayList<String>(oAuthScopes.length));
        }
        for (String ele : oAuthScopes) {
            this.oAuthScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * </p>
     * 
     * @param oAuthScopes
     *        List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthScopesElement
     */

    public CreateBackendAuthOAuthConfig withOAuthScopes(java.util.Collection<String> oAuthScopes) {
        setOAuthScopes(oAuthScopes);
        return this;
    }

    /**
     * <p>
     * List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * </p>
     * 
     * @param oAuthScopes
     *        List of OAuth-related flows used to allow your app users to authenticate from your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthScopesElement
     */

    public CreateBackendAuthOAuthConfig withOAuthScopes(OAuthScopesElement... oAuthScopes) {
        java.util.ArrayList<String> oAuthScopesCopy = new java.util.ArrayList<String>(oAuthScopes.length);
        for (OAuthScopesElement value : oAuthScopes) {
            oAuthScopesCopy.add(value.toString());
        }
        if (getOAuthScopes() == null) {
            setOAuthScopes(oAuthScopesCopy);
        } else {
            getOAuthScopes().addAll(oAuthScopesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The redirected URI for signing in to your Amplify app.
     * </p>
     * 
     * @return The redirected URI for signing in to your Amplify app.
     */

    public java.util.List<String> getRedirectSignInURIs() {
        return redirectSignInURIs;
    }

    /**
     * <p>
     * The redirected URI for signing in to your Amplify app.
     * </p>
     * 
     * @param redirectSignInURIs
     *        The redirected URI for signing in to your Amplify app.
     */

    public void setRedirectSignInURIs(java.util.Collection<String> redirectSignInURIs) {
        if (redirectSignInURIs == null) {
            this.redirectSignInURIs = null;
            return;
        }

        this.redirectSignInURIs = new java.util.ArrayList<String>(redirectSignInURIs);
    }

    /**
     * <p>
     * The redirected URI for signing in to your Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedirectSignInURIs(java.util.Collection)} or {@link #withRedirectSignInURIs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param redirectSignInURIs
     *        The redirected URI for signing in to your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthOAuthConfig withRedirectSignInURIs(String... redirectSignInURIs) {
        if (this.redirectSignInURIs == null) {
            setRedirectSignInURIs(new java.util.ArrayList<String>(redirectSignInURIs.length));
        }
        for (String ele : redirectSignInURIs) {
            this.redirectSignInURIs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The redirected URI for signing in to your Amplify app.
     * </p>
     * 
     * @param redirectSignInURIs
     *        The redirected URI for signing in to your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthOAuthConfig withRedirectSignInURIs(java.util.Collection<String> redirectSignInURIs) {
        setRedirectSignInURIs(redirectSignInURIs);
        return this;
    }

    /**
     * <p>
     * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * </p>
     * 
     * @return Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     */

    public java.util.List<String> getRedirectSignOutURIs() {
        return redirectSignOutURIs;
    }

    /**
     * <p>
     * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * </p>
     * 
     * @param redirectSignOutURIs
     *        Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     */

    public void setRedirectSignOutURIs(java.util.Collection<String> redirectSignOutURIs) {
        if (redirectSignOutURIs == null) {
            this.redirectSignOutURIs = null;
            return;
        }

        this.redirectSignOutURIs = new java.util.ArrayList<String>(redirectSignOutURIs);
    }

    /**
     * <p>
     * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRedirectSignOutURIs(java.util.Collection)} or {@link #withRedirectSignOutURIs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param redirectSignOutURIs
     *        Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthOAuthConfig withRedirectSignOutURIs(String... redirectSignOutURIs) {
        if (this.redirectSignOutURIs == null) {
            setRedirectSignOutURIs(new java.util.ArrayList<String>(redirectSignOutURIs.length));
        }
        for (String ele : redirectSignOutURIs) {
            this.redirectSignOutURIs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * </p>
     * 
     * @param redirectSignOutURIs
     *        Redirect URLs that OAuth uses when a user signs out of an Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthOAuthConfig withRedirectSignOutURIs(java.util.Collection<String> redirectSignOutURIs) {
        setRedirectSignOutURIs(redirectSignOutURIs);
        return this;
    }

    /**
     * <p>
     * The settings for using social providers to access your Amplify app.
     * </p>
     * 
     * @param socialProviderSettings
     *        The settings for using social providers to access your Amplify app.
     */

    public void setSocialProviderSettings(SocialProviderSettings socialProviderSettings) {
        this.socialProviderSettings = socialProviderSettings;
    }

    /**
     * <p>
     * The settings for using social providers to access your Amplify app.
     * </p>
     * 
     * @return The settings for using social providers to access your Amplify app.
     */

    public SocialProviderSettings getSocialProviderSettings() {
        return this.socialProviderSettings;
    }

    /**
     * <p>
     * The settings for using social providers to access your Amplify app.
     * </p>
     * 
     * @param socialProviderSettings
     *        The settings for using social providers to access your Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthOAuthConfig withSocialProviderSettings(SocialProviderSettings socialProviderSettings) {
        setSocialProviderSettings(socialProviderSettings);
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
        if (getDomainPrefix() != null)
            sb.append("DomainPrefix: ").append(getDomainPrefix()).append(",");
        if (getOAuthGrantType() != null)
            sb.append("OAuthGrantType: ").append(getOAuthGrantType()).append(",");
        if (getOAuthScopes() != null)
            sb.append("OAuthScopes: ").append(getOAuthScopes()).append(",");
        if (getRedirectSignInURIs() != null)
            sb.append("RedirectSignInURIs: ").append(getRedirectSignInURIs()).append(",");
        if (getRedirectSignOutURIs() != null)
            sb.append("RedirectSignOutURIs: ").append(getRedirectSignOutURIs()).append(",");
        if (getSocialProviderSettings() != null)
            sb.append("SocialProviderSettings: ").append(getSocialProviderSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendAuthOAuthConfig == false)
            return false;
        CreateBackendAuthOAuthConfig other = (CreateBackendAuthOAuthConfig) obj;
        if (other.getDomainPrefix() == null ^ this.getDomainPrefix() == null)
            return false;
        if (other.getDomainPrefix() != null && other.getDomainPrefix().equals(this.getDomainPrefix()) == false)
            return false;
        if (other.getOAuthGrantType() == null ^ this.getOAuthGrantType() == null)
            return false;
        if (other.getOAuthGrantType() != null && other.getOAuthGrantType().equals(this.getOAuthGrantType()) == false)
            return false;
        if (other.getOAuthScopes() == null ^ this.getOAuthScopes() == null)
            return false;
        if (other.getOAuthScopes() != null && other.getOAuthScopes().equals(this.getOAuthScopes()) == false)
            return false;
        if (other.getRedirectSignInURIs() == null ^ this.getRedirectSignInURIs() == null)
            return false;
        if (other.getRedirectSignInURIs() != null && other.getRedirectSignInURIs().equals(this.getRedirectSignInURIs()) == false)
            return false;
        if (other.getRedirectSignOutURIs() == null ^ this.getRedirectSignOutURIs() == null)
            return false;
        if (other.getRedirectSignOutURIs() != null && other.getRedirectSignOutURIs().equals(this.getRedirectSignOutURIs()) == false)
            return false;
        if (other.getSocialProviderSettings() == null ^ this.getSocialProviderSettings() == null)
            return false;
        if (other.getSocialProviderSettings() != null && other.getSocialProviderSettings().equals(this.getSocialProviderSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainPrefix() == null) ? 0 : getDomainPrefix().hashCode());
        hashCode = prime * hashCode + ((getOAuthGrantType() == null) ? 0 : getOAuthGrantType().hashCode());
        hashCode = prime * hashCode + ((getOAuthScopes() == null) ? 0 : getOAuthScopes().hashCode());
        hashCode = prime * hashCode + ((getRedirectSignInURIs() == null) ? 0 : getRedirectSignInURIs().hashCode());
        hashCode = prime * hashCode + ((getRedirectSignOutURIs() == null) ? 0 : getRedirectSignOutURIs().hashCode());
        hashCode = prime * hashCode + ((getSocialProviderSettings() == null) ? 0 : getSocialProviderSettings().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendAuthOAuthConfig clone() {
        try {
            return (CreateBackendAuthOAuthConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendAuthOAuthConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
