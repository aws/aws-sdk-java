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
 * Defines the resource configuration when creating an auth resource in your Amplify project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackendAuthResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendAuthResourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines whether you want to configure only authentication or both authentication and authorization settings.
     * </p>
     */
    private String authResources;
    /**
     * <p>
     * Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of your
     * auth resource in the Amplify project.
     * </p>
     */
    private CreateBackendAuthIdentityPoolConfig identityPoolConfigs;
    /**
     * <p>
     * Defines the service name to use when configuring an authentication resource in your Amplify project.
     * </p>
     */
    private String service;
    /**
     * <p>
     * Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your auth
     * resource in the Amplify project.
     * </p>
     */
    private CreateBackendAuthUserPoolConfig userPoolConfigs;

    /**
     * <p>
     * Defines whether you want to configure only authentication or both authentication and authorization settings.
     * </p>
     * 
     * @param authResources
     *        Defines whether you want to configure only authentication or both authentication and authorization
     *        settings.
     * @see AuthResources
     */

    public void setAuthResources(String authResources) {
        this.authResources = authResources;
    }

    /**
     * <p>
     * Defines whether you want to configure only authentication or both authentication and authorization settings.
     * </p>
     * 
     * @return Defines whether you want to configure only authentication or both authentication and authorization
     *         settings.
     * @see AuthResources
     */

    public String getAuthResources() {
        return this.authResources;
    }

    /**
     * <p>
     * Defines whether you want to configure only authentication or both authentication and authorization settings.
     * </p>
     * 
     * @param authResources
     *        Defines whether you want to configure only authentication or both authentication and authorization
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthResources
     */

    public CreateBackendAuthResourceConfig withAuthResources(String authResources) {
        setAuthResources(authResources);
        return this;
    }

    /**
     * <p>
     * Defines whether you want to configure only authentication or both authentication and authorization settings.
     * </p>
     * 
     * @param authResources
     *        Defines whether you want to configure only authentication or both authentication and authorization
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthResources
     */

    public CreateBackendAuthResourceConfig withAuthResources(AuthResources authResources) {
        this.authResources = authResources.toString();
        return this;
    }

    /**
     * <p>
     * Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of your
     * auth resource in the Amplify project.
     * </p>
     * 
     * @param identityPoolConfigs
     *        Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of
     *        your auth resource in the Amplify project.
     */

    public void setIdentityPoolConfigs(CreateBackendAuthIdentityPoolConfig identityPoolConfigs) {
        this.identityPoolConfigs = identityPoolConfigs;
    }

    /**
     * <p>
     * Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of your
     * auth resource in the Amplify project.
     * </p>
     * 
     * @return Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of
     *         your auth resource in the Amplify project.
     */

    public CreateBackendAuthIdentityPoolConfig getIdentityPoolConfigs() {
        return this.identityPoolConfigs;
    }

    /**
     * <p>
     * Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of your
     * auth resource in the Amplify project.
     * </p>
     * 
     * @param identityPoolConfigs
     *        Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of
     *        your auth resource in the Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthResourceConfig withIdentityPoolConfigs(CreateBackendAuthIdentityPoolConfig identityPoolConfigs) {
        setIdentityPoolConfigs(identityPoolConfigs);
        return this;
    }

    /**
     * <p>
     * Defines the service name to use when configuring an authentication resource in your Amplify project.
     * </p>
     * 
     * @param service
     *        Defines the service name to use when configuring an authentication resource in your Amplify project.
     * @see Service
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * Defines the service name to use when configuring an authentication resource in your Amplify project.
     * </p>
     * 
     * @return Defines the service name to use when configuring an authentication resource in your Amplify project.
     * @see Service
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * Defines the service name to use when configuring an authentication resource in your Amplify project.
     * </p>
     * 
     * @param service
     *        Defines the service name to use when configuring an authentication resource in your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public CreateBackendAuthResourceConfig withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * Defines the service name to use when configuring an authentication resource in your Amplify project.
     * </p>
     * 
     * @param service
     *        Defines the service name to use when configuring an authentication resource in your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Service
     */

    public CreateBackendAuthResourceConfig withService(Service service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your auth
     * resource in the Amplify project.
     * </p>
     * 
     * @param userPoolConfigs
     *        Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your
     *        auth resource in the Amplify project.
     */

    public void setUserPoolConfigs(CreateBackendAuthUserPoolConfig userPoolConfigs) {
        this.userPoolConfigs = userPoolConfigs;
    }

    /**
     * <p>
     * Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your auth
     * resource in the Amplify project.
     * </p>
     * 
     * @return Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your
     *         auth resource in the Amplify project.
     */

    public CreateBackendAuthUserPoolConfig getUserPoolConfigs() {
        return this.userPoolConfigs;
    }

    /**
     * <p>
     * Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your auth
     * resource in the Amplify project.
     * </p>
     * 
     * @param userPoolConfigs
     *        Describes authentication configuration for the Amazon Cognito user pool, provisioned as a part of your
     *        auth resource in the Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendAuthResourceConfig withUserPoolConfigs(CreateBackendAuthUserPoolConfig userPoolConfigs) {
        setUserPoolConfigs(userPoolConfigs);
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
        if (getAuthResources() != null)
            sb.append("AuthResources: ").append(getAuthResources()).append(",");
        if (getIdentityPoolConfigs() != null)
            sb.append("IdentityPoolConfigs: ").append(getIdentityPoolConfigs()).append(",");
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getUserPoolConfigs() != null)
            sb.append("UserPoolConfigs: ").append(getUserPoolConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendAuthResourceConfig == false)
            return false;
        CreateBackendAuthResourceConfig other = (CreateBackendAuthResourceConfig) obj;
        if (other.getAuthResources() == null ^ this.getAuthResources() == null)
            return false;
        if (other.getAuthResources() != null && other.getAuthResources().equals(this.getAuthResources()) == false)
            return false;
        if (other.getIdentityPoolConfigs() == null ^ this.getIdentityPoolConfigs() == null)
            return false;
        if (other.getIdentityPoolConfigs() != null && other.getIdentityPoolConfigs().equals(this.getIdentityPoolConfigs()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getUserPoolConfigs() == null ^ this.getUserPoolConfigs() == null)
            return false;
        if (other.getUserPoolConfigs() != null && other.getUserPoolConfigs().equals(this.getUserPoolConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthResources() == null) ? 0 : getAuthResources().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolConfigs() == null) ? 0 : getIdentityPoolConfigs().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getUserPoolConfigs() == null) ? 0 : getUserPoolConfigs().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendAuthResourceConfig clone() {
        try {
            return (CreateBackendAuthResourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifybackend.model.transform.CreateBackendAuthResourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
