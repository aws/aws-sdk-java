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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error information for an OpenSearch Serverless request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/EffectiveLifecyclePolicyDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectiveLifecyclePolicyDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of index retention days set. That is an optional param that will return as <code>true</code>
     * if the minimum number of days or hours is not set to a index resource.
     * </p>
     */
    private Boolean noMinRetentionPeriod;
    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The name of the OpenSearch Serverless index resource.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The minimum number of index retention in days or hours. This is an optional parameter that will return only if
     * it’s set.
     * </p>
     */
    private String retentionPeriod;
    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The minimum number of index retention days set. That is an optional param that will return as <code>true</code>
     * if the minimum number of days or hours is not set to a index resource.
     * </p>
     * 
     * @param noMinRetentionPeriod
     *        The minimum number of index retention days set. That is an optional param that will return as
     *        <code>true</code> if the minimum number of days or hours is not set to a index resource.
     */

    public void setNoMinRetentionPeriod(Boolean noMinRetentionPeriod) {
        this.noMinRetentionPeriod = noMinRetentionPeriod;
    }

    /**
     * <p>
     * The minimum number of index retention days set. That is an optional param that will return as <code>true</code>
     * if the minimum number of days or hours is not set to a index resource.
     * </p>
     * 
     * @return The minimum number of index retention days set. That is an optional param that will return as
     *         <code>true</code> if the minimum number of days or hours is not set to a index resource.
     */

    public Boolean getNoMinRetentionPeriod() {
        return this.noMinRetentionPeriod;
    }

    /**
     * <p>
     * The minimum number of index retention days set. That is an optional param that will return as <code>true</code>
     * if the minimum number of days or hours is not set to a index resource.
     * </p>
     * 
     * @param noMinRetentionPeriod
     *        The minimum number of index retention days set. That is an optional param that will return as
     *        <code>true</code> if the minimum number of days or hours is not set to a index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyDetail withNoMinRetentionPeriod(Boolean noMinRetentionPeriod) {
        setNoMinRetentionPeriod(noMinRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The minimum number of index retention days set. That is an optional param that will return as <code>true</code>
     * if the minimum number of days or hours is not set to a index resource.
     * </p>
     * 
     * @return The minimum number of index retention days set. That is an optional param that will return as
     *         <code>true</code> if the minimum number of days or hours is not set to a index resource.
     */

    public Boolean isNoMinRetentionPeriod() {
        return this.noMinRetentionPeriod;
    }

    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     * 
     * @param policyName
     *        The name of the lifecycle policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     * 
     * @return The name of the lifecycle policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the lifecycle policy.
     * </p>
     * 
     * @param policyName
     *        The name of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyDetail withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The name of the OpenSearch Serverless index resource.
     * </p>
     * 
     * @param resource
     *        The name of the OpenSearch Serverless index resource.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The name of the OpenSearch Serverless index resource.
     * </p>
     * 
     * @return The name of the OpenSearch Serverless index resource.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The name of the OpenSearch Serverless index resource.
     * </p>
     * 
     * @param resource
     *        The name of the OpenSearch Serverless index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyDetail withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * </p>
     * 
     * @return The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public EffectiveLifecyclePolicyDetail withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of OpenSearch Serverless resource. Currently, the only supported resource is <code>index</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public EffectiveLifecyclePolicyDetail withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The minimum number of index retention in days or hours. This is an optional parameter that will return only if
     * it’s set.
     * </p>
     * 
     * @param retentionPeriod
     *        The minimum number of index retention in days or hours. This is an optional parameter that will return
     *        only if it’s set.
     */

    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The minimum number of index retention in days or hours. This is an optional parameter that will return only if
     * it’s set.
     * </p>
     * 
     * @return The minimum number of index retention in days or hours. This is an optional parameter that will return
     *         only if it’s set.
     */

    public String getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The minimum number of index retention in days or hours. This is an optional parameter that will return only if
     * it’s set.
     * </p>
     * 
     * @param retentionPeriod
     *        The minimum number of index retention in days or hours. This is an optional parameter that will return
     *        only if it’s set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EffectiveLifecyclePolicyDetail withRetentionPeriod(String retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @param type
     *        The type of lifecycle policy.
     * @see LifecyclePolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @return The type of lifecycle policy.
     * @see LifecyclePolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @param type
     *        The type of lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyType
     */

    public EffectiveLifecyclePolicyDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of lifecycle policy.
     * </p>
     * 
     * @param type
     *        The type of lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyType
     */

    public EffectiveLifecyclePolicyDetail withType(LifecyclePolicyType type) {
        this.type = type.toString();
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
        if (getNoMinRetentionPeriod() != null)
            sb.append("NoMinRetentionPeriod: ").append(getNoMinRetentionPeriod()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EffectiveLifecyclePolicyDetail == false)
            return false;
        EffectiveLifecyclePolicyDetail other = (EffectiveLifecyclePolicyDetail) obj;
        if (other.getNoMinRetentionPeriod() == null ^ this.getNoMinRetentionPeriod() == null)
            return false;
        if (other.getNoMinRetentionPeriod() != null && other.getNoMinRetentionPeriod().equals(this.getNoMinRetentionPeriod()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoMinRetentionPeriod() == null) ? 0 : getNoMinRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EffectiveLifecyclePolicyDetail clone() {
        try {
            return (EffectiveLifecyclePolicyDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.EffectiveLifecyclePolicyDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
