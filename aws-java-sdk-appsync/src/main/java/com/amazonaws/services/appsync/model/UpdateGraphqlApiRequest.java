/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateGraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGraphqlApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The new name for the <code>GraphqlApi</code> object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     * </p>
     */
    private LogConfig logConfig;
    /**
     * <p>
     * The new authentication type for the <code>GraphqlApi</code> object.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     */
    private UserPoolConfig userPoolConfig;
    /**
     * <p>
     * The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     * </p>
     */
    private OpenIDConnectConfig openIDConnectConfig;

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The new name for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param name
     *        The new name for the <code>GraphqlApi</code> object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The new name for the <code>GraphqlApi</code> object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param name
     *        The new name for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     */

    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     */

    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param logConfig
     *        The Amazon CloudWatch Logs configuration for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiRequest withLogConfig(LogConfig logConfig) {
        setLogConfig(logConfig);
        return this;
    }

    /**
     * <p>
     * The new authentication type for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param authenticationType
     *        The new authentication type for the <code>GraphqlApi</code> object.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The new authentication type for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The new authentication type for the <code>GraphqlApi</code> object.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The new authentication type for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param authenticationType
     *        The new authentication type for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public UpdateGraphqlApiRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The new authentication type for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param authenticationType
     *        The new authentication type for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public UpdateGraphqlApiRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param userPoolConfig
     *        The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     */

    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     */

    public UserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param userPoolConfig
     *        The new Amazon Cognito user pool configuration for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiRequest withUserPoolConfig(UserPoolConfig userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
    }

    /**
     * <p>
     * The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     */

    public void setOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     */

    public OpenIDConnectConfig getOpenIDConnectConfig() {
        return this.openIDConnectConfig;
    }

    /**
     * <p>
     * The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param openIDConnectConfig
     *        The OpenID Connect configuration for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiRequest withOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        setOpenIDConnectConfig(openIDConnectConfig);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLogConfig() != null)
            sb.append("LogConfig: ").append(getLogConfig()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getUserPoolConfig() != null)
            sb.append("UserPoolConfig: ").append(getUserPoolConfig()).append(",");
        if (getOpenIDConnectConfig() != null)
            sb.append("OpenIDConnectConfig: ").append(getOpenIDConnectConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGraphqlApiRequest == false)
            return false;
        UpdateGraphqlApiRequest other = (UpdateGraphqlApiRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogConfig() == null ^ this.getLogConfig() == null)
            return false;
        if (other.getLogConfig() != null && other.getLogConfig().equals(this.getLogConfig()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getUserPoolConfig() == null ^ this.getUserPoolConfig() == null)
            return false;
        if (other.getUserPoolConfig() != null && other.getUserPoolConfig().equals(this.getUserPoolConfig()) == false)
            return false;
        if (other.getOpenIDConnectConfig() == null ^ this.getOpenIDConnectConfig() == null)
            return false;
        if (other.getOpenIDConnectConfig() != null && other.getOpenIDConnectConfig().equals(this.getOpenIDConnectConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogConfig() == null) ? 0 : getLogConfig().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getOpenIDConnectConfig() == null) ? 0 : getOpenIDConnectConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGraphqlApiRequest clone() {
        return (UpdateGraphqlApiRequest) super.clone();
    }

}
