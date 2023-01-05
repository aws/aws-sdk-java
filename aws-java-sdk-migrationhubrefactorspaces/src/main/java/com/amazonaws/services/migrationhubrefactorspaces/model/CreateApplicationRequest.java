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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     * </p>
     */
    private ApiGatewayProxyInput apiGatewayProxy;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The name to use for the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The proxy type of the proxy created within the application.
     * </p>
     */
    private String proxyType;
    /**
     * <p>
     * The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     * </p>
     * 
     * @param apiGatewayProxy
     *        A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     */

    public void setApiGatewayProxy(ApiGatewayProxyInput apiGatewayProxy) {
        this.apiGatewayProxy = apiGatewayProxy;
    }

    /**
     * <p>
     * A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     * </p>
     * 
     * @return A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     */

    public ApiGatewayProxyInput getApiGatewayProxy() {
        return this.apiGatewayProxy;
    }

    /**
     * <p>
     * A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     * </p>
     * 
     * @param apiGatewayProxy
     *        A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApiGatewayProxy(ApiGatewayProxyInput apiGatewayProxy) {
        setApiGatewayProxy(apiGatewayProxy);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The unique identifier of the environment.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @return The unique identifier of the environment.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentIdentifier
     *        The unique identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The name to use for the application.
     * </p>
     * 
     * @param name
     *        The name to use for the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to use for the application.
     * </p>
     * 
     * @return The name to use for the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to use for the application.
     * </p>
     * 
     * @param name
     *        The name to use for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The proxy type of the proxy created within the application.
     * </p>
     * 
     * @param proxyType
     *        The proxy type of the proxy created within the application.
     * @see ProxyType
     */

    public void setProxyType(String proxyType) {
        this.proxyType = proxyType;
    }

    /**
     * <p>
     * The proxy type of the proxy created within the application.
     * </p>
     * 
     * @return The proxy type of the proxy created within the application.
     * @see ProxyType
     */

    public String getProxyType() {
        return this.proxyType;
    }

    /**
     * <p>
     * The proxy type of the proxy created within the application.
     * </p>
     * 
     * @param proxyType
     *        The proxy type of the proxy created within the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProxyType
     */

    public CreateApplicationRequest withProxyType(String proxyType) {
        setProxyType(proxyType);
        return this;
    }

    /**
     * <p>
     * The proxy type of the proxy created within the application.
     * </p>
     * 
     * @param proxyType
     *        The proxy type of the proxy created within the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProxyType
     */

    public CreateApplicationRequest withProxyType(ProxyType proxyType) {
        this.proxyType = proxyType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @return The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services
     *         resource. Each tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC).
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC).
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC).
     * </p>
     * 
     * @param vpcId
     *        The ID of the virtual private cloud (VPC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getApiGatewayProxy() != null)
            sb.append("ApiGatewayProxy: ").append(getApiGatewayProxy()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProxyType() != null)
            sb.append("ProxyType: ").append(getProxyType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApiGatewayProxy() == null ^ this.getApiGatewayProxy() == null)
            return false;
        if (other.getApiGatewayProxy() != null && other.getApiGatewayProxy().equals(this.getApiGatewayProxy()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProxyType() == null ^ this.getProxyType() == null)
            return false;
        if (other.getProxyType() != null && other.getProxyType().equals(this.getProxyType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiGatewayProxy() == null) ? 0 : getApiGatewayProxy().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProxyType() == null) ? 0 : getProxyType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
