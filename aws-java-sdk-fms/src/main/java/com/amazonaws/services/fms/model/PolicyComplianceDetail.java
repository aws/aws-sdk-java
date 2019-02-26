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
 * Describes the non-compliant resources in a member account for a specific AWS Firewall Manager policy. A maximum of
 * 100 entries are displayed. If more than 100 resources are non-compliant, <code>EvaluationLimitExceeded</code> is set
 * to <code>True</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PolicyComplianceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyComplianceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     */
    private String policyOwner;
    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String memberAccount;
    /**
     * <p>
     * An array of resources that are not protected by the policy.
     * </p>
     */
    private java.util.List<ComplianceViolator> violators;
    /**
     * <p>
     * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     */
    private Boolean evaluationLimitExceeded;
    /**
     * <p>
     * A time stamp that indicates when the returned information should be considered out-of-date.
     * </p>
     */
    private java.util.Date expiredAt;
    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be
     * non-compliant. The details include the name of the dependent service and the error message received that
     * indicates the problem with the service.
     * </p>
     */
    private java.util.Map<String, String> issueInfoMap;

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyOwner
     *        The AWS account that created the AWS Firewall Manager policy.
     */

    public void setPolicyOwner(String policyOwner) {
        this.policyOwner = policyOwner;
    }

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * 
     * @return The AWS account that created the AWS Firewall Manager policy.
     */

    public String getPolicyOwner() {
        return this.policyOwner;
    }

    /**
     * <p>
     * The AWS account that created the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyOwner
     *        The AWS account that created the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withPolicyOwner(String policyOwner) {
        setPolicyOwner(policyOwner);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the AWS Firewall Manager policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * 
     * @return The ID of the AWS Firewall Manager policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyId
     *        The ID of the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param memberAccount
     *        The AWS account ID.
     */

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param memberAccount
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withMemberAccount(String memberAccount) {
        setMemberAccount(memberAccount);
        return this;
    }

    /**
     * <p>
     * An array of resources that are not protected by the policy.
     * </p>
     * 
     * @return An array of resources that are not protected by the policy.
     */

    public java.util.List<ComplianceViolator> getViolators() {
        return violators;
    }

    /**
     * <p>
     * An array of resources that are not protected by the policy.
     * </p>
     * 
     * @param violators
     *        An array of resources that are not protected by the policy.
     */

    public void setViolators(java.util.Collection<ComplianceViolator> violators) {
        if (violators == null) {
            this.violators = null;
            return;
        }

        this.violators = new java.util.ArrayList<ComplianceViolator>(violators);
    }

    /**
     * <p>
     * An array of resources that are not protected by the policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setViolators(java.util.Collection)} or {@link #withViolators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param violators
     *        An array of resources that are not protected by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withViolators(ComplianceViolator... violators) {
        if (this.violators == null) {
            setViolators(new java.util.ArrayList<ComplianceViolator>(violators.length));
        }
        for (ComplianceViolator ele : violators) {
            this.violators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of resources that are not protected by the policy.
     * </p>
     * 
     * @param violators
     *        An array of resources that are not protected by the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withViolators(java.util.Collection<ComplianceViolator> violators) {
        setViolators(violators);
        return this;
    }

    /**
     * <p>
     * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param evaluationLimitExceeded
     *        Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     */

    public void setEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        this.evaluationLimitExceeded = evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @return Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     */

    public Boolean getEvaluationLimitExceeded() {
        return this.evaluationLimitExceeded;
    }

    /**
     * <p>
     * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @param evaluationLimitExceeded
     *        Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withEvaluationLimitExceeded(Boolean evaluationLimitExceeded) {
        setEvaluationLimitExceeded(evaluationLimitExceeded);
        return this;
    }

    /**
     * <p>
     * Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     * </p>
     * 
     * @return Indicates if over 100 resources are non-compliant with the AWS Firewall Manager policy.
     */

    public Boolean isEvaluationLimitExceeded() {
        return this.evaluationLimitExceeded;
    }

    /**
     * <p>
     * A time stamp that indicates when the returned information should be considered out-of-date.
     * </p>
     * 
     * @param expiredAt
     *        A time stamp that indicates when the returned information should be considered out-of-date.
     */

    public void setExpiredAt(java.util.Date expiredAt) {
        this.expiredAt = expiredAt;
    }

    /**
     * <p>
     * A time stamp that indicates when the returned information should be considered out-of-date.
     * </p>
     * 
     * @return A time stamp that indicates when the returned information should be considered out-of-date.
     */

    public java.util.Date getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * <p>
     * A time stamp that indicates when the returned information should be considered out-of-date.
     * </p>
     * 
     * @param expiredAt
     *        A time stamp that indicates when the returned information should be considered out-of-date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withExpiredAt(java.util.Date expiredAt) {
        setExpiredAt(expiredAt);
        return this;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be
     * non-compliant. The details include the name of the dependent service and the error message received that
     * indicates the problem with the service.
     * </p>
     * 
     * @return Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a
     *         resource to be non-compliant. The details include the name of the dependent service and the error message
     *         received that indicates the problem with the service.
     */

    public java.util.Map<String, String> getIssueInfoMap() {
        return issueInfoMap;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be
     * non-compliant. The details include the name of the dependent service and the error message received that
     * indicates the problem with the service.
     * </p>
     * 
     * @param issueInfoMap
     *        Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource
     *        to be non-compliant. The details include the name of the dependent service and the error message received
     *        that indicates the problem with the service.
     */

    public void setIssueInfoMap(java.util.Map<String, String> issueInfoMap) {
        this.issueInfoMap = issueInfoMap;
    }

    /**
     * <p>
     * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be
     * non-compliant. The details include the name of the dependent service and the error message received that
     * indicates the problem with the service.
     * </p>
     * 
     * @param issueInfoMap
     *        Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource
     *        to be non-compliant. The details include the name of the dependent service and the error message received
     *        that indicates the problem with the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail withIssueInfoMap(java.util.Map<String, String> issueInfoMap) {
        setIssueInfoMap(issueInfoMap);
        return this;
    }

    public PolicyComplianceDetail addIssueInfoMapEntry(String key, String value) {
        if (null == this.issueInfoMap) {
            this.issueInfoMap = new java.util.HashMap<String, String>();
        }
        if (this.issueInfoMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.issueInfoMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IssueInfoMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceDetail clearIssueInfoMapEntries() {
        this.issueInfoMap = null;
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
        if (getPolicyOwner() != null)
            sb.append("PolicyOwner: ").append(getPolicyOwner()).append(",");
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getMemberAccount() != null)
            sb.append("MemberAccount: ").append(getMemberAccount()).append(",");
        if (getViolators() != null)
            sb.append("Violators: ").append(getViolators()).append(",");
        if (getEvaluationLimitExceeded() != null)
            sb.append("EvaluationLimitExceeded: ").append(getEvaluationLimitExceeded()).append(",");
        if (getExpiredAt() != null)
            sb.append("ExpiredAt: ").append(getExpiredAt()).append(",");
        if (getIssueInfoMap() != null)
            sb.append("IssueInfoMap: ").append(getIssueInfoMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyComplianceDetail == false)
            return false;
        PolicyComplianceDetail other = (PolicyComplianceDetail) obj;
        if (other.getPolicyOwner() == null ^ this.getPolicyOwner() == null)
            return false;
        if (other.getPolicyOwner() != null && other.getPolicyOwner().equals(this.getPolicyOwner()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        if (other.getViolators() == null ^ this.getViolators() == null)
            return false;
        if (other.getViolators() != null && other.getViolators().equals(this.getViolators()) == false)
            return false;
        if (other.getEvaluationLimitExceeded() == null ^ this.getEvaluationLimitExceeded() == null)
            return false;
        if (other.getEvaluationLimitExceeded() != null && other.getEvaluationLimitExceeded().equals(this.getEvaluationLimitExceeded()) == false)
            return false;
        if (other.getExpiredAt() == null ^ this.getExpiredAt() == null)
            return false;
        if (other.getExpiredAt() != null && other.getExpiredAt().equals(this.getExpiredAt()) == false)
            return false;
        if (other.getIssueInfoMap() == null ^ this.getIssueInfoMap() == null)
            return false;
        if (other.getIssueInfoMap() != null && other.getIssueInfoMap().equals(this.getIssueInfoMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyOwner() == null) ? 0 : getPolicyOwner().hashCode());
        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        hashCode = prime * hashCode + ((getViolators() == null) ? 0 : getViolators().hashCode());
        hashCode = prime * hashCode + ((getEvaluationLimitExceeded() == null) ? 0 : getEvaluationLimitExceeded().hashCode());
        hashCode = prime * hashCode + ((getExpiredAt() == null) ? 0 : getExpiredAt().hashCode());
        hashCode = prime * hashCode + ((getIssueInfoMap() == null) ? 0 : getIssueInfoMap().hashCode());
        return hashCode;
    }

    @Override
    public PolicyComplianceDetail clone() {
        try {
            return (PolicyComplianceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PolicyComplianceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
