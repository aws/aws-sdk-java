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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the resource that is not protected by the policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ComplianceViolator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceViolator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     */
    private String violationReason;
    /**
     * <p>
     * The resource type. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @param resourceId
     *        The resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @return The resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID.
     * </p>
     * 
     * @param resourceId
     *        The resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceViolator withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * 
     * @param violationReason
     *        The reason that the resource is not protected by the policy.
     * @see ViolationReason
     */

    public void setViolationReason(String violationReason) {
        this.violationReason = violationReason;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * 
     * @return The reason that the resource is not protected by the policy.
     * @see ViolationReason
     */

    public String getViolationReason() {
        return this.violationReason;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * 
     * @param violationReason
     *        The reason that the resource is not protected by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViolationReason
     */

    public ComplianceViolator withViolationReason(String violationReason) {
        setViolationReason(violationReason);
        return this;
    }

    /**
     * <p>
     * The reason that the resource is not protected by the policy.
     * </p>
     * 
     * @param violationReason
     *        The reason that the resource is not protected by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ViolationReason
     */

    public ComplianceViolator withViolationReason(ViolationReason violationReason) {
        this.violationReason = violationReason.toString();
        return this;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type. This is in the format shown in <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *        Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *        <code>AWS::CloudFront::Distribution</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @return The resource type. This is in the format shown in <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >AWS Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *         <code>AWS::CloudFront::Distribution</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type. This is in the format shown in <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *        Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *        <code>AWS::CloudFront::Distribution</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceViolator withResourceType(String resourceType) {
        setResourceType(resourceType);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getViolationReason() != null)
            sb.append("ViolationReason: ").append(getViolationReason()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceViolator == false)
            return false;
        ComplianceViolator other = (ComplianceViolator) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getViolationReason() == null ^ this.getViolationReason() == null)
            return false;
        if (other.getViolationReason() != null && other.getViolationReason().equals(this.getViolationReason()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getViolationReason() == null) ? 0 : getViolationReason().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceViolator clone() {
        try {
            return (ComplianceViolator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ComplianceViolatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
