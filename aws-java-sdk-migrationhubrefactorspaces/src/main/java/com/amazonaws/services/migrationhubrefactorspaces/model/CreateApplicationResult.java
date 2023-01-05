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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A wrapper object holding the API Gateway endpoint type and stage name for the proxy.
     * </p>
     */
    private ApiGatewayProxyInput apiGatewayProxy;
    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Web Services account ID of application creator.
     * </p>
     */
    private String createdByAccountId;
    /**
     * <p>
     * A timestamp that indicates when the application is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The ID of the environment in which the application is created.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A timestamp that indicates when the application was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Web Services account ID of the application owner (which is always the same as the environment owner
     * account ID).
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The proxy type of the proxy created within the application.
     * </p>
     */
    private String proxyType;
    /**
     * <p>
     * The current state of the application.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ID of the Amazon VPC.
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

    public CreateApplicationResult withApiGatewayProxy(ApiGatewayProxyInput apiGatewayProxy) {
        setApiGatewayProxy(apiGatewayProxy);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @return The unique identifier of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is
     *        <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>.
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is
     *         <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is
     *        <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>.
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of application creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of application creator.
     */

    public void setCreatedByAccountId(String createdByAccountId) {
        this.createdByAccountId = createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of application creator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of application creator.
     */

    public String getCreatedByAccountId() {
        return this.createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of application creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of application creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withCreatedByAccountId(String createdByAccountId) {
        setCreatedByAccountId(createdByAccountId);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the application is created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the application is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the application is created.
     * </p>
     * 
     * @return A timestamp that indicates when the application is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the application is created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the application is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which the application is created.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment in which the application is created.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment in which the application is created.
     * </p>
     * 
     * @return The ID of the environment in which the application is created.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment in which the application is created.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment in which the application is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the application was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the application was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the application was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the application was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the application was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the application owner (which is always the same as the environment owner
     * account ID).
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the application owner (which is always the same as the environment
     *        owner account ID).
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the application owner (which is always the same as the environment owner
     * account ID).
     * </p>
     * 
     * @return The Amazon Web Services account ID of the application owner (which is always the same as the environment
     *         owner account ID).
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the application owner (which is always the same as the environment owner
     * account ID).
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the application owner (which is always the same as the environment
     *        owner account ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
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

    public CreateApplicationResult withProxyType(String proxyType) {
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

    public CreateApplicationResult withProxyType(ProxyType proxyType) {
        this.proxyType = proxyType.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the application.
     * </p>
     * 
     * @param state
     *        The current state of the application.
     * @see ApplicationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the application.
     * </p>
     * 
     * @return The current state of the application.
     * @see ApplicationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the application.
     * </p>
     * 
     * @param state
     *        The current state of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public CreateApplicationResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the application.
     * </p>
     * 
     * @param state
     *        The current state of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public CreateApplicationResult withState(ApplicationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @return The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services
     *         resource. Each tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult addTagsEntry(String key, String value) {
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

    public CreateApplicationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC.
     * </p>
     * 
     * @return The ID of the Amazon VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the Amazon VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withVpcId(String vpcId) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedByAccountId() != null)
            sb.append("CreatedByAccountId: ").append(getCreatedByAccountId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getProxyType() != null)
            sb.append("ProxyType: ").append(getProxyType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof CreateApplicationResult == false)
            return false;
        CreateApplicationResult other = (CreateApplicationResult) obj;
        if (other.getApiGatewayProxy() == null ^ this.getApiGatewayProxy() == null)
            return false;
        if (other.getApiGatewayProxy() != null && other.getApiGatewayProxy().equals(this.getApiGatewayProxy()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedByAccountId() == null ^ this.getCreatedByAccountId() == null)
            return false;
        if (other.getCreatedByAccountId() != null && other.getCreatedByAccountId().equals(this.getCreatedByAccountId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getProxyType() == null ^ this.getProxyType() == null)
            return false;
        if (other.getProxyType() != null && other.getProxyType().equals(this.getProxyType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedByAccountId() == null) ? 0 : getCreatedByAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getProxyType() == null) ? 0 : getProxyType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationResult clone() {
        try {
            return (CreateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
