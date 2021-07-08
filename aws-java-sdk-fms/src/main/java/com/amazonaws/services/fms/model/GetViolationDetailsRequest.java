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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetViolationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetViolationDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Firewall Manager policy that you want the details for. This currently only supports security group
     * content audit policies.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The Amazon Web Services account ID that you want the details for.
     * </p>
     */
    private String memberAccount;
    /**
     * <p>
     * The ID of the resource that has violations.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The resource type. This is in the format shown in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a>. Supported resource types are: <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::NetworkInterface</code>, <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::NetworkFirewall::FirewallPolicy</code>, and <code>AWS::EC2::Subnet</code>.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The ID of the Firewall Manager policy that you want the details for. This currently only supports security group
     * content audit policies.
     * </p>
     * 
     * @param policyId
     *        The ID of the Firewall Manager policy that you want the details for. This currently only supports security
     *        group content audit policies.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager policy that you want the details for. This currently only supports security group
     * content audit policies.
     * </p>
     * 
     * @return The ID of the Firewall Manager policy that you want the details for. This currently only supports
     *         security group content audit policies.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the Firewall Manager policy that you want the details for. This currently only supports security group
     * content audit policies.
     * </p>
     * 
     * @param policyId
     *        The ID of the Firewall Manager policy that you want the details for. This currently only supports security
     *        group content audit policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViolationDetailsRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that you want the details for.
     * </p>
     * 
     * @param memberAccount
     *        The Amazon Web Services account ID that you want the details for.
     */

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that you want the details for.
     * </p>
     * 
     * @return The Amazon Web Services account ID that you want the details for.
     */

    public String getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that you want the details for.
     * </p>
     * 
     * @param memberAccount
     *        The Amazon Web Services account ID that you want the details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViolationDetailsRequest withMemberAccount(String memberAccount) {
        setMemberAccount(memberAccount);
        return this;
    }

    /**
     * <p>
     * The ID of the resource that has violations.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that has violations.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource that has violations.
     * </p>
     * 
     * @return The ID of the resource that has violations.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource that has violations.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource that has violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViolationDetailsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a>. Supported resource types are: <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::NetworkInterface</code>, <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::NetworkFirewall::FirewallPolicy</code>, and <code>AWS::EC2::Subnet</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type. This is in the format shown in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >Amazon Web Services Resource Types Reference</a>. Supported resource types are:
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::NetworkInterface</code>,
     *        <code>AWS::EC2::SecurityGroup</code>, <code>AWS::NetworkFirewall::FirewallPolicy</code>, and
     *        <code>AWS::EC2::Subnet</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a>. Supported resource types are: <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::NetworkInterface</code>, <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::NetworkFirewall::FirewallPolicy</code>, and <code>AWS::EC2::Subnet</code>.
     * </p>
     * 
     * @return The resource type. This is in the format shown in the <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         >Amazon Web Services Resource Types Reference</a>. Supported resource types are:
     *         <code>AWS::EC2::Instance</code>, <code>AWS::EC2::NetworkInterface</code>,
     *         <code>AWS::EC2::SecurityGroup</code>, <code>AWS::NetworkFirewall::FirewallPolicy</code>, and
     *         <code>AWS::EC2::Subnet</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type. This is in the format shown in the <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">Amazon
     * Web Services Resource Types Reference</a>. Supported resource types are: <code>AWS::EC2::Instance</code>,
     * <code>AWS::EC2::NetworkInterface</code>, <code>AWS::EC2::SecurityGroup</code>,
     * <code>AWS::NetworkFirewall::FirewallPolicy</code>, and <code>AWS::EC2::Subnet</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type. This is in the format shown in the <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        >Amazon Web Services Resource Types Reference</a>. Supported resource types are:
     *        <code>AWS::EC2::Instance</code>, <code>AWS::EC2::NetworkInterface</code>,
     *        <code>AWS::EC2::SecurityGroup</code>, <code>AWS::NetworkFirewall::FirewallPolicy</code>, and
     *        <code>AWS::EC2::Subnet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViolationDetailsRequest withResourceType(String resourceType) {
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getMemberAccount() != null)
            sb.append("MemberAccount: ").append(getMemberAccount()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof GetViolationDetailsRequest == false)
            return false;
        GetViolationDetailsRequest other = (GetViolationDetailsRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public GetViolationDetailsRequest clone() {
        return (GetViolationDetailsRequest) super.clone();
    }

}
