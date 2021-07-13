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
 * Describes the Amazon Cognito user pool configuration for the auth resource to be configured for your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuthUserPoolConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendAuthUserPoolConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     */
    private CreateBackendAuthForgotPasswordConfig forgotPassword;
    /**
     * <p>
     * Describes whether to apply multi-factor authentication policies for your Amazon Cognito user pool configured as a
     * part of your Amplify project.
     * </p>
     */
    private CreateBackendAuthMFAConfig mfa;
    /**
     * <p>
     * Describes the OAuth policy and rules for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     */
    private CreateBackendAuthOAuthConfig oAuth;
    /**
     * <p>
     * Describes the password policy for your Amazon Cognito user pool, configured as a part of your Amplify project.
     * </p>
     */
    private CreateBackendAuthPasswordPolicyConfig passwordPolicy;
    /**
     * <p>
     * The required attributes to sign up new users in the user pool.
     * </p>
     */
    private java.util.List<String> requiredSignUpAttributes;
    /**
     * <p>
     * Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user pool,
     * configured as a part of your Amplify project.
     * </p>
     */
    private String signInMethod;
    /**
     * <p>
     * The Amazon Cognito user pool name.
     * </p>
     */
    private String userPoolName;

    /**
     * <p>
     * Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @param forgotPassword
     *        Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your
     *        Amplify project.
     */

    public void setForgotPassword(CreateBackendAuthForgotPasswordConfig forgotPassword) {
        this.forgotPassword = forgotPassword;
    }

    /**
     * <p>
     * Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @return Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your
     *         Amplify project.
     */

    public CreateBackendAuthForgotPasswordConfig getForgotPassword() {
        return this.forgotPassword;
    }

    /**
     * <p>
     * Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your Amplify
     * project.
     * </p>
     * 
     * @param forgotPassword
     *        Describes the forgotten password policy for your Amazon Cognito user pool, configured as a part of your
     *        Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthUserPoolConfig withForgotPassword(CreateBackendAuthForgotPasswordConfig forgotPassword) {
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

    public void setMfa(CreateBackendAuthMFAConfig mfa) {
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

    public CreateBackendAuthMFAConfig getMfa() {
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

    public CreateBackendAuthUserPoolConfig withMfa(CreateBackendAuthMFAConfig mfa) {
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

    public void setOAuth(CreateBackendAuthOAuthConfig oAuth) {
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

    public CreateBackendAuthOAuthConfig getOAuth() {
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

    public CreateBackendAuthUserPoolConfig withOAuth(CreateBackendAuthOAuthConfig oAuth) {
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

    public void setPasswordPolicy(CreateBackendAuthPasswordPolicyConfig passwordPolicy) {
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

    public CreateBackendAuthPasswordPolicyConfig getPasswordPolicy() {
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

    public CreateBackendAuthUserPoolConfig withPasswordPolicy(CreateBackendAuthPasswordPolicyConfig passwordPolicy) {
        setPasswordPolicy(passwordPolicy);
        return this;
    }

    /**
     * <p>
     * The required attributes to sign up new users in the user pool.
     * </p>
     * 
     * @return The required attributes to sign up new users in the user pool.
     * @see RequiredSignUpAttributesElement
     */

    public java.util.List<String> getRequiredSignUpAttributes() {
        return requiredSignUpAttributes;
    }

    /**
     * <p>
     * The required attributes to sign up new users in the user pool.
     * </p>
     * 
     * @param requiredSignUpAttributes
     *        The required attributes to sign up new users in the user pool.
     * @see RequiredSignUpAttributesElement
     */

    public void setRequiredSignUpAttributes(java.util.Collection<String> requiredSignUpAttributes) {
        if (requiredSignUpAttributes == null) {
            this.requiredSignUpAttributes = null;
            return;
        }

        this.requiredSignUpAttributes = new java.util.ArrayList<String>(requiredSignUpAttributes);
    }

    /**
     * <p>
     * The required attributes to sign up new users in the user pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredSignUpAttributes(java.util.Collection)} or
     * {@link #withRequiredSignUpAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiredSignUpAttributes
     *        The required attributes to sign up new users in the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiredSignUpAttributesElement
     */

    public CreateBackendAuthUserPoolConfig withRequiredSignUpAttributes(String... requiredSignUpAttributes) {
        if (this.requiredSignUpAttributes == null) {
            setRequiredSignUpAttributes(new java.util.ArrayList<String>(requiredSignUpAttributes.length));
        }
        for (String ele : requiredSignUpAttributes) {
            this.requiredSignUpAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The required attributes to sign up new users in the user pool.
     * </p>
     * 
     * @param requiredSignUpAttributes
     *        The required attributes to sign up new users in the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiredSignUpAttributesElement
     */

    public CreateBackendAuthUserPoolConfig withRequiredSignUpAttributes(java.util.Collection<String> requiredSignUpAttributes) {
        setRequiredSignUpAttributes(requiredSignUpAttributes);
        return this;
    }

    /**
     * <p>
     * The required attributes to sign up new users in the user pool.
     * </p>
     * 
     * @param requiredSignUpAttributes
     *        The required attributes to sign up new users in the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequiredSignUpAttributesElement
     */

    public CreateBackendAuthUserPoolConfig withRequiredSignUpAttributes(RequiredSignUpAttributesElement... requiredSignUpAttributes) {
        java.util.ArrayList<String> requiredSignUpAttributesCopy = new java.util.ArrayList<String>(requiredSignUpAttributes.length);
        for (RequiredSignUpAttributesElement value : requiredSignUpAttributes) {
            requiredSignUpAttributesCopy.add(value.toString());
        }
        if (getRequiredSignUpAttributes() == null) {
            setRequiredSignUpAttributes(requiredSignUpAttributesCopy);
        } else {
            getRequiredSignUpAttributes().addAll(requiredSignUpAttributesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user pool,
     * configured as a part of your Amplify project.
     * </p>
     * 
     * @param signInMethod
     *        Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user
     *        pool, configured as a part of your Amplify project.
     * @see SignInMethod
     */

    public void setSignInMethod(String signInMethod) {
        this.signInMethod = signInMethod;
    }

    /**
     * <p>
     * Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user pool,
     * configured as a part of your Amplify project.
     * </p>
     * 
     * @return Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user
     *         pool, configured as a part of your Amplify project.
     * @see SignInMethod
     */

    public String getSignInMethod() {
        return this.signInMethod;
    }

    /**
     * <p>
     * Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user pool,
     * configured as a part of your Amplify project.
     * </p>
     * 
     * @param signInMethod
     *        Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user
     *        pool, configured as a part of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignInMethod
     */

    public CreateBackendAuthUserPoolConfig withSignInMethod(String signInMethod) {
        setSignInMethod(signInMethod);
        return this;
    }

    /**
     * <p>
     * Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user pool,
     * configured as a part of your Amplify project.
     * </p>
     * 
     * @param signInMethod
     *        Describes the sign-in methods that your Amplify app users use to log in using the Amazon Cognito user
     *        pool, configured as a part of your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignInMethod
     */

    public CreateBackendAuthUserPoolConfig withSignInMethod(SignInMethod signInMethod) {
        this.signInMethod = signInMethod.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool name.
     * </p>
     * 
     * @param userPoolName
     *        The Amazon Cognito user pool name.
     */

    public void setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
    }

    /**
     * <p>
     * The Amazon Cognito user pool name.
     * </p>
     * 
     * @return The Amazon Cognito user pool name.
     */

    public String getUserPoolName() {
        return this.userPoolName;
    }

    /**
     * <p>
     * The Amazon Cognito user pool name.
     * </p>
     * 
     * @param userPoolName
     *        The Amazon Cognito user pool name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthUserPoolConfig withUserPoolName(String userPoolName) {
        setUserPoolName(userPoolName);
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
            sb.append("PasswordPolicy: ").append(getPasswordPolicy()).append(",");
        if (getRequiredSignUpAttributes() != null)
            sb.append("RequiredSignUpAttributes: ").append(getRequiredSignUpAttributes()).append(",");
        if (getSignInMethod() != null)
            sb.append("SignInMethod: ").append(getSignInMethod()).append(",");
        if (getUserPoolName() != null)
            sb.append("UserPoolName: ").append(getUserPoolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendAuthUserPoolConfig == false)
            return false;
        CreateBackendAuthUserPoolConfig other = (CreateBackendAuthUserPoolConfig) obj;
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
        if (other.getRequiredSignUpAttributes() == null ^ this.getRequiredSignUpAttributes() == null)
            return false;
        if (other.getRequiredSignUpAttributes() != null && other.getRequiredSignUpAttributes().equals(this.getRequiredSignUpAttributes()) == false)
            return false;
        if (other.getSignInMethod() == null ^ this.getSignInMethod() == null)
            return false;
        if (other.getSignInMethod() != null && other.getSignInMethod().equals(this.getSignInMethod()) == false)
            return false;
        if (other.getUserPoolName() == null ^ this.getUserPoolName() == null)
            return false;
        if (other.getUserPoolName() != null && other.getUserPoolName().equals(this.getUserPoolName()) == false)
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
        hashCode = prime * hashCode + ((getRequiredSignUpAttributes() == null) ? 0 : getRequiredSignUpAttributes().hashCode());
        hashCode = prime * hashCode + ((getSignInMethod() == null) ? 0 : getSignInMethod().hashCode());
        hashCode = prime * hashCode + ((getUserPoolName() == null) ? 0 : getUserPoolName().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendAuthUserPoolConfig clone() {
        try {
            return (CreateBackendAuthUserPoolConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendAuthUserPoolConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
