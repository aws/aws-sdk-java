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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceDetailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     * <code>PutPolicy</code> and by <code>ListPolicies</code>.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details for.
     * </p>
     */
    private String memberAccount;

    /**
     * <p>
     * The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     * <code>PutPolicy</code> and by <code>ListPolicies</code>.
     * </p>
     * 
     * @param policyId
     *        The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     *        <code>PutPolicy</code> and by <code>ListPolicies</code>.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     * <code>PutPolicy</code> and by <code>ListPolicies</code>.
     * </p>
     * 
     * @return The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     *         <code>PutPolicy</code> and by <code>ListPolicies</code>.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     * <code>PutPolicy</code> and by <code>ListPolicies</code>.
     * </p>
     * 
     * @param policyId
     *        The ID of the policy that you want to get the details for. <code>PolicyId</code> is returned by
     *        <code>PutPolicy</code> and by <code>ListPolicies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details for.
     * </p>
     * 
     * @param memberAccount
     *        The AWS account that owns the resources that you want to get the details for.
     */

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details for.
     * </p>
     * 
     * @return The AWS account that owns the resources that you want to get the details for.
     */

    public String getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * <p>
     * The AWS account that owns the resources that you want to get the details for.
     * </p>
     * 
     * @param memberAccount
     *        The AWS account that owns the resources that you want to get the details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailRequest withMemberAccount(String memberAccount) {
        setMemberAccount(memberAccount);
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
            sb.append("MemberAccount: ").append(getMemberAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceDetailRequest == false)
            return false;
        GetComplianceDetailRequest other = (GetComplianceDetailRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceDetailRequest clone() {
        return (GetComplianceDetailRequest) super.clone();
    }

}
