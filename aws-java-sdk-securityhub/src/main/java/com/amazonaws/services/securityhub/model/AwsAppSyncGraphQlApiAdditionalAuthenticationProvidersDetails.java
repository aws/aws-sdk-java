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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of additional authentication providers for the GraphqlApi API.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM), OpenID
     * Connect (OIDC), Amazon Cognito user pools, or Lambda.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The configuration for Lambda function authorization.
     * </p>
     */
    private AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails lambdaAuthorizerConfig;
    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     */
    private AwsAppSyncGraphQlApiOpenIdConnectConfigDetails openIdConnectConfig;
    /**
     * <p>
     * The Amazon Cognito user pools configuration.
     * </p>
     */
    private AwsAppSyncGraphQlApiUserPoolConfigDetails userPoolConfig;

    /**
     * <p>
     * The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM), OpenID
     * Connect (OIDC), Amazon Cognito user pools, or Lambda.
     * </p>
     * 
     * @param authenticationType
     *        The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM),
     *        OpenID Connect (OIDC), Amazon Cognito user pools, or Lambda.
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM), OpenID
     * Connect (OIDC), Amazon Cognito user pools, or Lambda.
     * </p>
     * 
     * @return The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM),
     *         OpenID Connect (OIDC), Amazon Cognito user pools, or Lambda.
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM), OpenID
     * Connect (OIDC), Amazon Cognito user pools, or Lambda.
     * </p>
     * 
     * @param authenticationType
     *        The type of security configuration for your GraphQL API: API key, Identity and Access Management (IAM),
     *        OpenID Connect (OIDC), Amazon Cognito user pools, or Lambda.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        The configuration for Lambda function authorization.
     */

    public void setLambdaAuthorizerConfig(AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails lambdaAuthorizerConfig) {
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * The configuration for Lambda function authorization.
     * </p>
     * 
     * @return The configuration for Lambda function authorization.
     */

    public AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * The configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        The configuration for Lambda function authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails withLambdaAuthorizerConfig(
            AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails lambdaAuthorizerConfig) {
        setLambdaAuthorizerConfig(lambdaAuthorizerConfig);
        return this;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIdConnectConfig
     *        The OpenID Connect configuration.
     */

    public void setOpenIdConnectConfig(AwsAppSyncGraphQlApiOpenIdConnectConfigDetails openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @return The OpenID Connect configuration.
     */

    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration.
     * </p>
     * 
     * @param openIdConnectConfig
     *        The OpenID Connect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails withOpenIdConnectConfig(
            AwsAppSyncGraphQlApiOpenIdConnectConfigDetails openIdConnectConfig) {
        setOpenIdConnectConfig(openIdConnectConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito user pools configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pools configuration.
     */

    public void setUserPoolConfig(AwsAppSyncGraphQlApiUserPoolConfigDetails userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pools configuration.
     * </p>
     * 
     * @return The Amazon Cognito user pools configuration.
     */

    public AwsAppSyncGraphQlApiUserPoolConfigDetails getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito user pools configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito user pools configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails withUserPoolConfig(AwsAppSyncGraphQlApiUserPoolConfigDetails userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
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
        if (getLambdaAuthorizerConfig() != null)
            sb.append("LambdaAuthorizerConfig: ").append(getLambdaAuthorizerConfig()).append(",");
        if (getOpenIdConnectConfig() != null)
            sb.append("OpenIdConnectConfig: ").append(getOpenIdConnectConfig()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails == false)
            return false;
        AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails other = (AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails) obj;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getLambdaAuthorizerConfig() == null ^ this.getLambdaAuthorizerConfig() == null)
            return false;
        if (other.getLambdaAuthorizerConfig() != null && other.getLambdaAuthorizerConfig().equals(this.getLambdaAuthorizerConfig()) == false)
            return false;
        if (other.getOpenIdConnectConfig() == null ^ this.getOpenIdConnectConfig() == null)
            return false;
        if (other.getOpenIdConnectConfig() != null && other.getOpenIdConnectConfig().equals(this.getOpenIdConnectConfig()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getLambdaAuthorizerConfig() == null) ? 0 : getLambdaAuthorizerConfig().hashCode());
        hashCode = prime * hashCode + ((getOpenIdConnectConfig() == null) ? 0 : getOpenIdConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails clone() {
        try {
            return (AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
