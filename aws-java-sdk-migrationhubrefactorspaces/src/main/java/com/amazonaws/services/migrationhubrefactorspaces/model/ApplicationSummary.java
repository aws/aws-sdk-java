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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of <code>ApplicationSummary</code> objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/ApplicationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint URL of the Amazon API Gateway proxy.
     * </p>
     */
    private ApiGatewayProxySummary apiGatewayProxy;
    /**
     * <p>
     * The unique identifier of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Web Services account ID of the application creator.
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
     * The unique identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Any error associated with the application resource.
     * </p>
     */
    private ErrorResponse error;
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
     * The tags assigned to the application.
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
     * The endpoint URL of the Amazon API Gateway proxy.
     * </p>
     * 
     * @param apiGatewayProxy
     *        The endpoint URL of the Amazon API Gateway proxy.
     */

    public void setApiGatewayProxy(ApiGatewayProxySummary apiGatewayProxy) {
        this.apiGatewayProxy = apiGatewayProxy;
    }

    /**
     * <p>
     * The endpoint URL of the Amazon API Gateway proxy.
     * </p>
     * 
     * @return The endpoint URL of the Amazon API Gateway proxy.
     */

    public ApiGatewayProxySummary getApiGatewayProxy() {
        return this.apiGatewayProxy;
    }

    /**
     * <p>
     * The endpoint URL of the Amazon API Gateway proxy.
     * </p>
     * 
     * @param apiGatewayProxy
     *        The endpoint URL of the Amazon API Gateway proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withApiGatewayProxy(ApiGatewayProxySummary apiGatewayProxy) {
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

    public ApplicationSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the application creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the application creator.
     */

    public void setCreatedByAccountId(String createdByAccountId) {
        this.createdByAccountId = createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the application creator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the application creator.
     */

    public String getCreatedByAccountId() {
        return this.createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the application creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the application creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withCreatedByAccountId(String createdByAccountId) {
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

    public ApplicationSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @return The unique identifier of the environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Any error associated with the application resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the application resource.
     */

    public void setError(ErrorResponse error) {
        this.error = error;
    }

    /**
     * <p>
     * Any error associated with the application resource.
     * </p>
     * 
     * @return Any error associated with the application resource.
     */

    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * <p>
     * Any error associated with the application resource.
     * </p>
     * 
     * @param error
     *        Any error associated with the application resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withError(ErrorResponse error) {
        setError(error);
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

    public ApplicationSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
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

    public ApplicationSummary withName(String name) {
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

    public ApplicationSummary withOwnerAccountId(String ownerAccountId) {
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

    public ApplicationSummary withProxyType(String proxyType) {
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

    public ApplicationSummary withProxyType(ProxyType proxyType) {
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

    public ApplicationSummary withState(String state) {
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

    public ApplicationSummary withState(ApplicationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @return The tags assigned to the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the application.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ApplicationSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary addTagsEntry(String key, String value) {
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

    public ApplicationSummary clearTagsEntries() {
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

    public ApplicationSummary withVpcId(String vpcId) {
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
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

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
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
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
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
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
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
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
