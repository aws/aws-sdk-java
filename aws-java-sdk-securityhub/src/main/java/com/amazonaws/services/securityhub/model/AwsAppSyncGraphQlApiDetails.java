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
 * Provides details about an AppSync Graph QL API, which lets you query multiple databases, microservices, and APIs from
 * a single GraphQL endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAppSyncGraphQlApiDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAppSyncGraphQlApiDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync GraphQL
     * API endpoint.
     * </p>
     */
    private AwsAppSyncGraphQlApiOpenIdConnectConfigDetails openIdConnectConfig;
    /**
     * <p>
     * The API name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the configuration for Lambda function authorization.
     * </p>
     */
    private AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails lambdaAuthorizerConfig;
    /**
     * <p>
     * Indicates whether to use X-Ray tracing for the GraphQL API.
     * </p>
     */
    private Boolean xrayEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the API.
     * </p>
     */
    private String arn;
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
     */
    private String authenticationType;
    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     */
    private AwsAppSyncGraphQlApiLogConfigDetails logConfig;
    /**
     * <p>
     * A list of additional authentication providers for the GraphQL API.
     * </p>
     */
    private java.util.List<AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails> additionalAuthenticationProviders;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL API, if
     * one exists.
     * </p>
     */
    private String wafWebAclArn;

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     * 
     * @param apiId
     *        The unique identifier for the API.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     * 
     * @return The unique identifier for the API.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     * 
     * @param apiId
     *        The unique identifier for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     * 
     * @param id
     *        The unique identifier for the API.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     * 
     * @return The unique identifier for the API.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the API.
     * </p>
     * 
     * @param id
     *        The unique identifier for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync GraphQL
     * API endpoint.
     * </p>
     * 
     * @param openIdConnectConfig
     *        Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync
     *        GraphQL API endpoint.
     */

    public void setOpenIdConnectConfig(AwsAppSyncGraphQlApiOpenIdConnectConfigDetails openIdConnectConfig) {
        this.openIdConnectConfig = openIdConnectConfig;
    }

    /**
     * <p>
     * Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync GraphQL
     * API endpoint.
     * </p>
     * 
     * @return Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync
     *         GraphQL API endpoint.
     */

    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails getOpenIdConnectConfig() {
        return this.openIdConnectConfig;
    }

    /**
     * <p>
     * Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync GraphQL
     * API endpoint.
     * </p>
     * 
     * @param openIdConnectConfig
     *        Specifies the authorization configuration for using an OpenID Connect compliant service with an AppSync
     *        GraphQL API endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withOpenIdConnectConfig(AwsAppSyncGraphQlApiOpenIdConnectConfigDetails openIdConnectConfig) {
        setOpenIdConnectConfig(openIdConnectConfig);
        return this;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param name
     *        The API name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @return The API name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param name
     *        The API name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        Specifies the configuration for Lambda function authorization.
     */

    public void setLambdaAuthorizerConfig(AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails lambdaAuthorizerConfig) {
        this.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * Specifies the configuration for Lambda function authorization.
     * </p>
     * 
     * @return Specifies the configuration for Lambda function authorization.
     */

    public AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails getLambdaAuthorizerConfig() {
        return this.lambdaAuthorizerConfig;
    }

    /**
     * <p>
     * Specifies the configuration for Lambda function authorization.
     * </p>
     * 
     * @param lambdaAuthorizerConfig
     *        Specifies the configuration for Lambda function authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withLambdaAuthorizerConfig(AwsAppSyncGraphQlApiLambdaAuthorizerConfigDetails lambdaAuthorizerConfig) {
        setLambdaAuthorizerConfig(lambdaAuthorizerConfig);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use X-Ray tracing for the GraphQL API.
     * </p>
     * 
     * @param xrayEnabled
     *        Indicates whether to use X-Ray tracing for the GraphQL API.
     */

    public void setXrayEnabled(Boolean xrayEnabled) {
        this.xrayEnabled = xrayEnabled;
    }

    /**
     * <p>
     * Indicates whether to use X-Ray tracing for the GraphQL API.
     * </p>
     * 
     * @return Indicates whether to use X-Ray tracing for the GraphQL API.
     */

    public Boolean getXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     * <p>
     * Indicates whether to use X-Ray tracing for the GraphQL API.
     * </p>
     * 
     * @param xrayEnabled
     *        Indicates whether to use X-Ray tracing for the GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withXrayEnabled(Boolean xrayEnabled) {
        setXrayEnabled(xrayEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use X-Ray tracing for the GraphQL API.
     * </p>
     * 
     * @return Indicates whether to use X-Ray tracing for the GraphQL API.
     */

    public Boolean isXrayEnabled() {
        return this.xrayEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the API.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the API.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the API.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the API.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the API.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withArn(String arn) {
        setArn(arn);
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

    public AwsAppSyncGraphQlApiDetails withUserPoolConfig(AwsAppSyncGraphQlApiUserPoolConfigDetails userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
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

    public AwsAppSyncGraphQlApiDetails withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     */

    public void setLogConfig(AwsAppSyncGraphQlApiLogConfigDetails logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs configuration.
     */

    public AwsAppSyncGraphQlApiLogConfigDetails getLogConfig() {
        return this.logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withLogConfig(AwsAppSyncGraphQlApiLogConfigDetails logConfig) {
        setLogConfig(logConfig);
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the GraphQL API.
     * </p>
     * 
     * @return A list of additional authentication providers for the GraphQL API.
     */

    public java.util.List<AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails> getAdditionalAuthenticationProviders() {
        return additionalAuthenticationProviders;
    }

    /**
     * <p>
     * A list of additional authentication providers for the GraphQL API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the GraphQL API.
     */

    public void setAdditionalAuthenticationProviders(
            java.util.Collection<AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails> additionalAuthenticationProviders) {
        if (additionalAuthenticationProviders == null) {
            this.additionalAuthenticationProviders = null;
            return;
        }

        this.additionalAuthenticationProviders = new java.util.ArrayList<AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails>(
                additionalAuthenticationProviders);
    }

    /**
     * <p>
     * A list of additional authentication providers for the GraphQL API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAuthenticationProviders(java.util.Collection)} or
     * {@link #withAdditionalAuthenticationProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withAdditionalAuthenticationProviders(
            AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails... additionalAuthenticationProviders) {
        if (this.additionalAuthenticationProviders == null) {
            setAdditionalAuthenticationProviders(new java.util.ArrayList<AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails>(
                    additionalAuthenticationProviders.length));
        }
        for (AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails ele : additionalAuthenticationProviders) {
            this.additionalAuthenticationProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional authentication providers for the GraphQL API.
     * </p>
     * 
     * @param additionalAuthenticationProviders
     *        A list of additional authentication providers for the GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withAdditionalAuthenticationProviders(
            java.util.Collection<AwsAppSyncGraphQlApiAdditionalAuthenticationProvidersDetails> additionalAuthenticationProviders) {
        setAdditionalAuthenticationProviders(additionalAuthenticationProviders);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL API, if
     * one exists.
     * </p>
     * 
     * @param wafWebAclArn
     *        The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL
     *        API, if one exists.
     */

    public void setWafWebAclArn(String wafWebAclArn) {
        this.wafWebAclArn = wafWebAclArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL API, if
     * one exists.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL
     *         API, if one exists.
     */

    public String getWafWebAclArn() {
        return this.wafWebAclArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL API, if
     * one exists.
     * </p>
     * 
     * @param wafWebAclArn
     *        The Amazon Resource Name (ARN) of the WAF web access control list (web ACL) associated with this GraphQL
     *        API, if one exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiDetails withWafWebAclArn(String wafWebAclArn) {
        setWafWebAclArn(wafWebAclArn);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getOpenIdConnectConfig() != null)
            sb.append("OpenIdConnectConfig: ").append(getOpenIdConnectConfig()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLambdaAuthorizerConfig() != null)
            sb.append("LambdaAuthorizerConfig: ").append(getLambdaAuthorizerConfig()).append(",");
        if (getXrayEnabled() != null)
            sb.append("XrayEnabled: ").append(getXrayEnabled()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getLogConfig() != null)
            sb.append("LogConfig: ").append(getLogConfig()).append(",");
        if (getAdditionalAuthenticationProviders() != null)
            sb.append("AdditionalAuthenticationProviders: ").append(getAdditionalAuthenticationProviders()).append(",");
        if (getWafWebAclArn() != null)
            sb.append("WafWebAclArn: ").append(getWafWebAclArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAppSyncGraphQlApiDetails == false)
            return false;
        AwsAppSyncGraphQlApiDetails other = (AwsAppSyncGraphQlApiDetails) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOpenIdConnectConfig() == null ^ this.getOpenIdConnectConfig() == null)
            return false;
        if (other.getOpenIdConnectConfig() != null && other.getOpenIdConnectConfig().equals(this.getOpenIdConnectConfig()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLambdaAuthorizerConfig() == null ^ this.getLambdaAuthorizerConfig() == null)
            return false;
        if (other.getLambdaAuthorizerConfig() != null && other.getLambdaAuthorizerConfig().equals(this.getLambdaAuthorizerConfig()) == false)
            return false;
        if (other.getXrayEnabled() == null ^ this.getXrayEnabled() == null)
            return false;
        if (other.getXrayEnabled() != null && other.getXrayEnabled().equals(this.getXrayEnabled()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getLogConfig() == null ^ this.getLogConfig() == null)
            return false;
        if (other.getLogConfig() != null && other.getLogConfig().equals(this.getLogConfig()) == false)
            return false;
        if (other.getAdditionalAuthenticationProviders() == null ^ this.getAdditionalAuthenticationProviders() == null)
            return false;
        if (other.getAdditionalAuthenticationProviders() != null
                && other.getAdditionalAuthenticationProviders().equals(this.getAdditionalAuthenticationProviders()) == false)
            return false;
        if (other.getWafWebAclArn() == null ^ this.getWafWebAclArn() == null)
            return false;
        if (other.getWafWebAclArn() != null && other.getWafWebAclArn().equals(this.getWafWebAclArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOpenIdConnectConfig() == null) ? 0 : getOpenIdConnectConfig().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLambdaAuthorizerConfig() == null) ? 0 : getLambdaAuthorizerConfig().hashCode());
        hashCode = prime * hashCode + ((getXrayEnabled() == null) ? 0 : getXrayEnabled().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getLogConfig() == null) ? 0 : getLogConfig().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAuthenticationProviders() == null) ? 0 : getAdditionalAuthenticationProviders().hashCode());
        hashCode = prime * hashCode + ((getWafWebAclArn() == null) ? 0 : getWafWebAclArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsAppSyncGraphQlApiDetails clone() {
        try {
            return (AwsAppSyncGraphQlApiDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAppSyncGraphQlApiDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
