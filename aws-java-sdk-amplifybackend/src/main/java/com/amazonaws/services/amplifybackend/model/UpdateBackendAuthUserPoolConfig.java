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
 * Describes the Amazon Cognito user pool configuration for the authorization resource to be configured for your Amplify
 * project on an update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendAuthUserPoolConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendAuthUserPoolConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     */
    private UpdateBackendAuthForgotPasswordConfig forgotPassword;
    /**
     * <p>
     * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a
     * part of your Amplify project.
     * </p>
     */
    private UpdateBackendAuthMFAConfig mfa;
    /**
     * <p>
     * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     */
    private UpdateBackendAuthOAuthConfig oAuth;
    /**
     * <p>
     * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
     * </p>
     */
    private UpdateBackendAuthPasswordPolicyConfig passwordPolicy;

    /**
     * <p>
     * Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @param forgotPassword
     *        Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your
     *        Amplify project.
     */

    public void setForgotPassword(UpdateBackendAuthForgotPasswordConfig forgotPassword) {
        this.forgotPassword = forgotPassword;
    }

    /**
     * <p>
     * Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @return Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your
     *         Amplify project.
     */

    public UpdateBackendAuthForgotPasswordConfig getForgotPassword() {
        return this.forgotPassword;
    }

    /**
     * <p>
     * Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @param forgotPassword
     *        Describes the forgot password policy for your Amazon Cognito user pool, configured as a part of your
     *        Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthUserPoolConfig withForgotPassword(UpdateBackendAuthForgotPasswordConfig forgotPassword) {
        setForgotPassword(forgotPassword);
        return this;
    }

    /**
     * <p>
     * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a
     * part of your Amplify project.
     * </p>
     * 
     * @param mfa
     *        Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool
     *        configured as a part of your Amplify project.
     */

    public void setMfa(UpdateBackendAuthMFAConfig mfa) {
        this.mfa = mfa;
    }

    /**
     * <p>
     * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a
     * part of your Amplify project.
     * </p>
     * 
     * @return Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool
     *         configured as a part of your Amplify project.
     */

    public UpdateBackendAuthMFAConfig getMfa() {
        return this.mfa;
    }

    /**
     * <p>
     * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a
     * part of your Amplify project.
     * </p>
     * 
     * @param mfa
     *        Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool
     *        configured as a part of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthUserPoolConfig withMfa(UpdateBackendAuthMFAConfig mfa) {
        setMfa(mfa);
        return this;
    }

    /**
     * <p>
     * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @param oAuth
     *        Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your
     *        Amplify project.
     */

    public void setOAuth(UpdateBackendAuthOAuthConfig oAuth) {
        this.oAuth = oAuth;
    }

    /**
     * <p>
     * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @return Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your
     *         Amplify project.
     */

    public UpdateBackendAuthOAuthConfig getOAuth() {
        return this.oAuth;
    }

    /**
     * <p>
     * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @param oAuth
     *        Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your
     *        Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthUserPoolConfig withOAuth(UpdateBackendAuthOAuthConfig oAuth) {
        setOAuth(oAuth);
        return this;
    }

    /**
     * <p>
     * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
     * </p>
     * 
     * @param passwordPolicy
     *        Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     *        project.
     */

    public void setPasswordPolicy(UpdateBackendAuthPasswordPolicyConfig passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    /**
     * <p>
     * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
     * </p>
     * 
     * @return Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     *         project.
     */

    public UpdateBackendAuthPasswordPolicyConfig getPasswordPolicy() {
        return this.passwordPolicy;
    }

    /**
     * <p>
     * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
     * </p>
     * 
     * @param passwordPolicy
     *        Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     *        project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendAuthUserPoolConfig withPasswordPolicy(UpdateBackendAuthPasswordPolicyConfig passwordPolicy) {
        setPasswordPolicy(passwordPolicy);
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
        if (getForgotPassword() != null)
            sb.append("ForgotPassword: ").append(getForgotPassword()).append(",");
        if (getMfa() != null)
            sb.append("Mfa: ").append(getMfa()).append(",");
        if (getOAuth() != null)
            sb.append("OAuth: ").append(getOAuth()).append(",");
        if (getPasswordPolicy() != null)
            sb.append("PasswordPolicy: ").append(getPasswordPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackendAuthUserPoolConfig == false)
            return false;
        UpdateBackendAuthUserPoolConfig other = (UpdateBackendAuthUserPoolConfig) obj;
        if (other.getForgotPassword() == null ^ this.getForgotPassword() == null)
            return false;
        if (other.getForgotPassword() != null && other.getForgotPassword().equals(this.getForgotPassword()) == false)
            return false;
        if (other.getMfa() == null ^ this.getMfa() == null)
            return false;
        if (other.getMfa() != null && other.getMfa().equals(this.getMfa()) == false)
            return false;
        if (other.getOAuth() == null ^ this.getOAuth() == null)
            return false;
        if (other.getOAuth() != null && other.getOAuth().equals(this.getOAuth()) == false)
            return false;
        if (other.getPasswordPolicy() == null ^ this.getPasswordPolicy() == null)
            return false;
        if (other.getPasswordPolicy() != null && other.getPasswordPolicy().equals(this.getPasswordPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForgotPassword() == null) ? 0 : getForgotPassword().hashCode());
        hashCode = prime * hashCode + ((getMfa() == null) ? 0 : getMfa().hashCode());
        hashCode = prime * hashCode + ((getOAuth() == null) ? 0 : getOAuth().hashCode());
        hashCode = prime * hashCode + ((getPasswordPolicy() == null) ? 0 : getPasswordPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBackendAuthUserPoolConfig clone() {
        try {
            return (UpdateBackendAuthUserPoolConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.UpdateBackendAuthUserPoolConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
