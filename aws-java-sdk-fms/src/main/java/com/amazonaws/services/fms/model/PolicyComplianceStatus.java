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
 * Indicates whether the account is compliant with the specified policy. An account is considered non-compliant if it
 * includes resources that are not protected by the policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PolicyComplianceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyComplianceStatus implements Serializable, Cloneable, StructuredPojo {

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
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The member account ID.
     * </p>
     */
    private String memberAccount;
    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     */
    private java.util.List<EvaluationResult> evaluationResults;
    /**
     * <p>
     * Time stamp of the last update to the <code>EvaluationResult</code> objects.
     * </p>
     */
    private java.util.Date lastUpdated;
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

    public PolicyComplianceStatus withPolicyOwner(String policyOwner) {
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

    public PolicyComplianceStatus withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name of the AWS Firewall Manager policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * 
     * @return The friendly name of the AWS Firewall Manager policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The friendly name of the AWS Firewall Manager policy.
     * </p>
     * 
     * @param policyName
     *        The friendly name of the AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceStatus withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The member account ID.
     * </p>
     * 
     * @param memberAccount
     *        The member account ID.
     */

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * <p>
     * The member account ID.
     * </p>
     * 
     * @return The member account ID.
     */

    public String getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * <p>
     * The member account ID.
     * </p>
     * 
     * @param memberAccount
     *        The member account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceStatus withMemberAccount(String memberAccount) {
        setMemberAccount(memberAccount);
        return this;
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     * 
     * @return An array of <code>EvaluationResult</code> objects.
     */

    public java.util.List<EvaluationResult> getEvaluationResults() {
        return evaluationResults;
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     * 
     * @param evaluationResults
     *        An array of <code>EvaluationResult</code> objects.
     */

    public void setEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        if (evaluationResults == null) {
            this.evaluationResults = null;
            return;
        }

        this.evaluationResults = new java.util.ArrayList<EvaluationResult>(evaluationResults);
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationResults(java.util.Collection)} or {@link #withEvaluationResults(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param evaluationResults
     *        An array of <code>EvaluationResult</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceStatus withEvaluationResults(EvaluationResult... evaluationResults) {
        if (this.evaluationResults == null) {
            setEvaluationResults(new java.util.ArrayList<EvaluationResult>(evaluationResults.length));
        }
        for (EvaluationResult ele : evaluationResults) {
            this.evaluationResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>EvaluationResult</code> objects.
     * </p>
     * 
     * @param evaluationResults
     *        An array of <code>EvaluationResult</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceStatus withEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        setEvaluationResults(evaluationResults);
        return this;
    }

    /**
     * <p>
     * Time stamp of the last update to the <code>EvaluationResult</code> objects.
     * </p>
     * 
     * @param lastUpdated
     *        Time stamp of the last update to the <code>EvaluationResult</code> objects.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Time stamp of the last update to the <code>EvaluationResult</code> objects.
     * </p>
     * 
     * @return Time stamp of the last update to the <code>EvaluationResult</code> objects.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * Time stamp of the last update to the <code>EvaluationResult</code> objects.
     * </p>
     * 
     * @param lastUpdated
     *        Time stamp of the last update to the <code>EvaluationResult</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyComplianceStatus withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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

    public PolicyComplianceStatus withIssueInfoMap(java.util.Map<String, String> issueInfoMap) {
        setIssueInfoMap(issueInfoMap);
        return this;
    }

    public PolicyComplianceStatus addIssueInfoMapEntry(String key, String value) {
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

    public PolicyComplianceStatus clearIssueInfoMapEntries() {
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getMemberAccount() != null)
            sb.append("MemberAccount: ").append(getMemberAccount()).append(",");
        if (getEvaluationResults() != null)
            sb.append("EvaluationResults: ").append(getEvaluationResults()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
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

        if (obj instanceof PolicyComplianceStatus == false)
            return false;
        PolicyComplianceStatus other = (PolicyComplianceStatus) obj;
        if (other.getPolicyOwner() == null ^ this.getPolicyOwner() == null)
            return false;
        if (other.getPolicyOwner() != null && other.getPolicyOwner().equals(this.getPolicyOwner()) == false)
            return false;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getMemberAccount() == null ^ this.getMemberAccount() == null)
            return false;
        if (other.getMemberAccount() != null && other.getMemberAccount().equals(this.getMemberAccount()) == false)
            return false;
        if (other.getEvaluationResults() == null ^ this.getEvaluationResults() == null)
            return false;
        if (other.getEvaluationResults() != null && other.getEvaluationResults().equals(this.getEvaluationResults()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
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
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getMemberAccount() == null) ? 0 : getMemberAccount().hashCode());
        hashCode = prime * hashCode + ((getEvaluationResults() == null) ? 0 : getEvaluationResults().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getIssueInfoMap() == null) ? 0 : getIssueInfoMap().hashCode());
        return hashCode;
    }

    @Override
    public PolicyComplianceStatus clone() {
        try {
            return (PolicyComplianceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PolicyComplianceStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
