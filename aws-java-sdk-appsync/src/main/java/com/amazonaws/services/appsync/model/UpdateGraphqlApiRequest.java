/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The new authentication type for the <code>GraphqlApi</code> object.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     */
    private UserPoolConfig userPoolConfig;

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
     * The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param userPoolConfig
     *        The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     */

    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     */

    public UserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param userPoolConfig
     *        The new Amazon Cognito User Pool configuration for the <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGraphqlApiRequest withUserPoolConfig(UserPoolConfig userPoolConfig) {
        setUserPoolConfig(userPoolConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
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
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
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

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGraphqlApiRequest clone() {
        return (UpdateGraphqlApiRequest) super.clone();
    }

}
