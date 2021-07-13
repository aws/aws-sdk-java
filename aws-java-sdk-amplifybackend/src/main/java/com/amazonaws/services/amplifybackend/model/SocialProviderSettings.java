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
 * The settings for using the social identity providers for access to your Amplify app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/SocialProviderSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SocialProviderSettings implements Serializable, Cloneable, StructuredPojo {

    private BackendAuthSocialProviderConfig facebook;

    private BackendAuthSocialProviderConfig google;

    private BackendAuthSocialProviderConfig loginWithAmazon;

    private BackendAuthAppleProviderConfig signInWithApple;

    /**
     * @param facebook
     */

    public void setFacebook(BackendAuthSocialProviderConfig facebook) {
        this.facebook = facebook;
    }

    /**
     * @return
     */

    public BackendAuthSocialProviderConfig getFacebook() {
        return this.facebook;
    }

    /**
     * @param facebook
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SocialProviderSettings withFacebook(BackendAuthSocialProviderConfig facebook) {
        setFacebook(facebook);
        return this;
    }

    /**
     * @param google
     */

    public void setGoogle(BackendAuthSocialProviderConfig google) {
        this.google = google;
    }

    /**
     * @return
     */

    public BackendAuthSocialProviderConfig getGoogle() {
        return this.google;
    }

    /**
     * @param google
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SocialProviderSettings withGoogle(BackendAuthSocialProviderConfig google) {
        setGoogle(google);
        return this;
    }

    /**
     * @param loginWithAmazon
     */

    public void setLoginWithAmazon(BackendAuthSocialProviderConfig loginWithAmazon) {
        this.loginWithAmazon = loginWithAmazon;
    }

    /**
     * @return
     */

    public BackendAuthSocialProviderConfig getLoginWithAmazon() {
        return this.loginWithAmazon;
    }

    /**
     * @param loginWithAmazon
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SocialProviderSettings withLoginWithAmazon(BackendAuthSocialProviderConfig loginWithAmazon) {
        setLoginWithAmazon(loginWithAmazon);
        return this;
    }

    /**
     * @param signInWithApple
     */

    public void setSignInWithApple(BackendAuthAppleProviderConfig signInWithApple) {
        this.signInWithApple = signInWithApple;
    }

    /**
     * @return
     */

    public BackendAuthAppleProviderConfig getSignInWithApple() {
        return this.signInWithApple;
    }

    /**
     * @param signInWithApple
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SocialProviderSettings withSignInWithApple(BackendAuthAppleProviderConfig signInWithApple) {
        setSignInWithApple(signInWithApple);
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
        if (getFacebook() != null)
            sb.append("Facebook: ").append(getFacebook()).append(",");
        if (getGoogle() != null)
            sb.append("Google: ").append(getGoogle()).append(",");
        if (getLoginWithAmazon() != null)
            sb.append("LoginWithAmazon: ").append(getLoginWithAmazon()).append(",");
        if (getSignInWithApple() != null)
            sb.append("SignInWithApple: ").append(getSignInWithApple());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SocialProviderSettings == false)
            return false;
        SocialProviderSettings other = (SocialProviderSettings) obj;
        if (other.getFacebook() == null ^ this.getFacebook() == null)
            return false;
        if (other.getFacebook() != null && other.getFacebook().equals(this.getFacebook()) == false)
            return false;
        if (other.getGoogle() == null ^ this.getGoogle() == null)
            return false;
        if (other.getGoogle() != null && other.getGoogle().equals(this.getGoogle()) == false)
            return false;
        if (other.getLoginWithAmazon() == null ^ this.getLoginWithAmazon() == null)
            return false;
        if (other.getLoginWithAmazon() != null && other.getLoginWithAmazon().equals(this.getLoginWithAmazon()) == false)
            return false;
        if (other.getSignInWithApple() == null ^ this.getSignInWithApple() == null)
            return false;
        if (other.getSignInWithApple() != null && other.getSignInWithApple().equals(this.getSignInWithApple()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFacebook() == null) ? 0 : getFacebook().hashCode());
        hashCode = prime * hashCode + ((getGoogle() == null) ? 0 : getGoogle().hashCode());
        hashCode = prime * hashCode + ((getLoginWithAmazon() == null) ? 0 : getLoginWithAmazon().hashCode());
        hashCode = prime * hashCode + ((getSignInWithApple() == null) ? 0 : getSignInWithApple().hashCode());
        return hashCode;
    }

    @Override
    public SocialProviderSettings clone() {
        try {
            return (SocialProviderSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.SocialProviderSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
