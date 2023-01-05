/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an additional authentication provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/AdditionalAuthenticationProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalAuthenticationProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito
     * user pools, or Lambda.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The OIDC configuration.
     * </p>
     */
    private OpenIDConnectConfig openIDConnectConfig;
    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     */
    private CognitoUserPoolConfig userPoolConfig;
    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     */
    private LambdaAuthorizerConfig lambdaAuthorizerConfig;

    /**
     * <p>
     * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito
     * user pools, or Lambda.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon
     *        Cognito user pools, or Lambda.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito
     * user pools, or Lambda.
     * </p>
     * 
     * @return The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon
     *         Cognito user pools, or Lambda.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito
     * user pools, or Lambda.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon
     *        Cognito user pools, or Lambda.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public AdditionalAuthenticationProvider withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon Cognito
     * user pools, or Lambda.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, Identity and Access Management (IAM), OpenID Connect (OIDC), Amazon
     *        Cognito user pools, or Lambda.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public AdditionalAuthenticationProvider withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The OIDC configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OIDC configuration.
     */

    public void setOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    /**
     * <p>
     * The OIDC configuration.
     * </p>
     * 
     * @return The OIDC configuration.
     */

    public OpenIDConnectConfig getOpenIDConnectConfig() {
        return this.openIDConnectConfig;
    }

    /**
     * <p>
     * The OIDC configuration.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OIDC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalAuthenticationProvider withOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        setOpenIDConnectConfig(openIDConnectConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     */

    public void setUserPoolConfig(CognitoUserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @return The Amazon Cognito user pool configuration.
     */

    public CognitoUserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalAuthenticationProvider withUserPoolConfig(CognitoUserPoolConfig userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
    }

    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        Configuration for Lambda function authorization.
     */

    public void setLambdaAuthorizerConfig(LambdaAuthorizerConfig lambdaAuthorizerConfig) {
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     * 
     * @return Configuration for Lambda function authorization.
     */

    public LambdaAuthorizerConfig getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * Configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        Configuration for Lambda function authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalAuthenticationProvider withLambdaAuthorizerConfig(LambdaAuthorizerConfig lambdaAuthorizerConfig) {
        setLambdaAuthorizerConfig(lambdaAuthorizerConfig);
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
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getOpenIDConnectConfig() != null)
            sb.append("OpenIDConnectConfig: ").append(getOpenIDConnectConfig()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig()).append(",");
        if (getLambdaAuthorizerConfig() != null)
            sb.append("LambdaAuthorizerConfig: ").append(getLambdaAuthorizerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalAuthenticationProvider == false)
            return false;
        AdditionalAuthenticationProvider other = (AdditionalAuthenticationProvider) obj;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getOpenIDConnectConfig() == null ^ this.getOpenIDConnectConfig() == null)
            return false;
        if (other.getOpenIDConnectConfig() != null && other.getOpenIDConnectConfig().equals(this.getOpenIDConnectConfig()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        if (other.getLambdaAuthorizerConfig() == null ^ this.getLambdaAuthorizerConfig() == null)
            return false;
        if (other.getLambdaAuthorizerConfig() != null && other.getLambdaAuthorizerConfig().equals(this.getLambdaAuthorizerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getOpenIDConnectConfig() == null) ? 0 : getOpenIDConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getLambdaAuthorizerConfig() == null) ? 0 : getLambdaAuthorizerConfig().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalAuthenticationProvider clone() {
        try {
            return (AdditionalAuthenticationProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.AdditionalAuthenticationProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
