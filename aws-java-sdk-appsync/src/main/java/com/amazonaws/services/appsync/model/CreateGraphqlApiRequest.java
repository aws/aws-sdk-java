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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateGraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGraphqlApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The Amazon Cognito User Pool configuration.
     * </p>
     */
    private UserPoolConfig userPoolConfig;

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name for the <code>GraphqlApi</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     * 
     * @return A user-supplied name for the <code>GraphqlApi</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name for the <code>GraphqlApi</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name for the <code>GraphqlApi</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * </p>
     * 
     * @return The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CreateGraphqlApiRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type: API key, IAM, or Amazon Cognito User Pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CreateGraphqlApiRequest withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Cognito User Pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito User Pool configuration.
     */

    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito User Pool configuration.
     * </p>
     * 
     * @return The Amazon Cognito User Pool configuration.
     */

    public UserPoolConfig getUserPoolConfig() {
        return this.userPoolConfig;
    }

    /**
     * <p>
     * The Amazon Cognito User Pool configuration.
     * </p>
     * 
     * @param userPoolConfig
     *        The Amazon Cognito User Pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGraphqlApiRequest withUserPoolConfig(UserPoolConfig userPoolConfig) {
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

        if (obj instanceof CreateGraphqlApiRequest == false)
            return false;
        CreateGraphqlApiRequest other = (CreateGraphqlApiRequest) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfig() == null) ? 0 : getUserPoolConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateGraphqlApiRequest clone() {
        return (CreateGraphqlApiRequest) super.clone();
    }

}
