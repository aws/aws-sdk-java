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
 * Details of the AWS Firewall Manager policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PolicySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either a WAF policy or Shield Advanced policy.
     * </p>
     */
    private String securityServiceType;
    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     */
    private Boolean remediationEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the specified policy.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified policy.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the specified policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     * 
     * @return The ID of the specified policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the specified policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name of the specified policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     * 
     * @return The friendly name of the specified policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The friendly name of the specified policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name of the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to protect with the policy. This is in the format shown in <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *        Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *        <code>AWS::CloudFront::Distribution</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @return The type of resource to protect with the policy. This is in the format shown in <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >AWS Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *         <code>AWS::CloudFront::Distribution</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to protect with the policy. This is in the format shown in <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     * Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     * <code>AWS::CloudFront::Distribution</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to protect with the policy. This is in the format shown in <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">AWS
     *        Resource Types Reference</a>. For example: <code>AWS::ElasticLoadBalancingV2::LoadBalancer</code> or
     *        <code>AWS::CloudFront::Distribution</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either a WAF policy or Shield Advanced policy.
     * </p>
     * 
     * @param securityServiceType
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either a WAF policy or Shield Advanced policy.
     * @see SecurityServiceType
     */

    public void setSecurityServiceType(String securityServiceType) {
        this.securityServiceType = securityServiceType;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either a WAF policy or Shield Advanced policy.
     * </p>
     * 
     * @return The service that the policy is using to protect the resources. This specifies the type of policy that is
     *         created, either a WAF policy or Shield Advanced policy.
     * @see SecurityServiceType
     */

    public String getSecurityServiceType() {
        return this.securityServiceType;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either a WAF policy or Shield Advanced policy.
     * </p>
     * 
     * @param securityServiceType
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either a WAF policy or Shield Advanced policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public PolicySummary withSecurityServiceType(String securityServiceType) {
        setSecurityServiceType(securityServiceType);
        return this;
    }

    /**
     * <p>
     * The service that the policy is using to protect the resources. This specifies the type of policy that is created,
     * either a WAF policy or Shield Advanced policy.
     * </p>
     * 
     * @param securityServiceType
     *        The service that the policy is using to protect the resources. This specifies the type of policy that is
     *        created, either a WAF policy or Shield Advanced policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public PolicySummary withSecurityServiceType(SecurityServiceType securityServiceType) {
        this.securityServiceType = securityServiceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @param remediationEnabled
     *        Indicates if the policy should be automatically applied to new resources.
     */

    public void setRemediationEnabled(Boolean remediationEnabled) {
        this.remediationEnabled = remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @return Indicates if the policy should be automatically applied to new resources.
     */

    public Boolean getRemediationEnabled() {
        return this.remediationEnabled;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @param remediationEnabled
     *        Indicates if the policy should be automatically applied to new resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicySummary withRemediationEnabled(Boolean remediationEnabled) {
        setRemediationEnabled(remediationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates if the policy should be automatically applied to new resources.
     * </p>
     * 
     * @return Indicates if the policy should be automatically applied to new resources.
     */

    public Boolean isRemediationEnabled() {
        return this.remediationEnabled;
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSecurityServiceType() != null)
            sb.append("SecurityServiceType: ").append(getSecurityServiceType()).append(",");
        if (getRemediationEnabled() != null)
            sb.append("RemediationEnabled: ").append(getRemediationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicySummary == false)
            return false;
        PolicySummary other = (PolicySummary) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSecurityServiceType() == null ^ this.getSecurityServiceType() == null)
            return false;
        if (other.getSecurityServiceType() != null && other.getSecurityServiceType().equals(this.getSecurityServiceType()) == false)
            return false;
        if (other.getRemediationEnabled() == null ^ this.getRemediationEnabled() == null)
            return false;
        if (other.getRemediationEnabled() != null && other.getRemediationEnabled().equals(this.getRemediationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSecurityServiceType() == null) ? 0 : getSecurityServiceType().hashCode());
        hashCode = prime * hashCode + ((getRemediationEnabled() == null) ? 0 : getRemediationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PolicySummary clone() {
        try {
            return (PolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PolicySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
