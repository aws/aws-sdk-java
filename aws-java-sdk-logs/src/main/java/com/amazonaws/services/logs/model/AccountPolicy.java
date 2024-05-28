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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one CloudWatch Logs account policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AccountPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the account policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy document for this account policy.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     */
    private Long lastUpdatedTime;
    /**
     * <p>
     * The type of policy for this account policy.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * The scope of the account policy.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The log group selection criteria for this subscription filter policy.
     * </p>
     */
    private String selectionCriteria;
    /**
     * <p>
     * The Amazon Web Services account ID that the policy applies to.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The name of the account policy.
     * </p>
     * 
     * @param policyName
     *        The name of the account policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the account policy.
     * </p>
     * 
     * @return The name of the account policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the account policy.
     * </p>
     * 
     * @param policyName
     *        The name of the account policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy document for this account policy.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @param policyDocument
     *        The policy document for this account policy.</p>
     *        <p>
     *        The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document for this account policy.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @return The policy document for this account policy.</p>
     *         <p>
     *         The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document for this account policy.
     * </p>
     * <p>
     * The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * </p>
     * 
     * @param policyDocument
     *        The policy document for this account policy.</p>
     *        <p>
     *        The JSON specified in <code>policyDocument</code> can be up to 30,720 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountPolicy withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that this policy was most recently updated.
     */

    public void setLastUpdatedTime(Long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     * 
     * @return The date and time that this policy was most recently updated.
     */

    public Long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that this policy was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountPolicy withLastUpdatedTime(Long lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The type of policy for this account policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy for this account policy.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of policy for this account policy.
     * </p>
     * 
     * @return The type of policy for this account policy.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of policy for this account policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy for this account policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public AccountPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of policy for this account policy.
     * </p>
     * 
     * @param policyType
     *        The type of policy for this account policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public AccountPolicy withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * The scope of the account policy.
     * </p>
     * 
     * @param scope
     *        The scope of the account policy.
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of the account policy.
     * </p>
     * 
     * @return The scope of the account policy.
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of the account policy.
     * </p>
     * 
     * @param scope
     *        The scope of the account policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public AccountPolicy withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope of the account policy.
     * </p>
     * 
     * @param scope
     *        The scope of the account policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public AccountPolicy withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The log group selection criteria for this subscription filter policy.
     * </p>
     * 
     * @param selectionCriteria
     *        The log group selection criteria for this subscription filter policy.
     */

    public void setSelectionCriteria(String selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * <p>
     * The log group selection criteria for this subscription filter policy.
     * </p>
     * 
     * @return The log group selection criteria for this subscription filter policy.
     */

    public String getSelectionCriteria() {
        return this.selectionCriteria;
    }

    /**
     * <p>
     * The log group selection criteria for this subscription filter policy.
     * </p>
     * 
     * @param selectionCriteria
     *        The log group selection criteria for this subscription filter policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountPolicy withSelectionCriteria(String selectionCriteria) {
        setSelectionCriteria(selectionCriteria);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the policy applies to.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that the policy applies to.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the policy applies to.
     * </p>
     * 
     * @return The Amazon Web Services account ID that the policy applies to.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the policy applies to.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that the policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountPolicy withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getSelectionCriteria() != null)
            sb.append("SelectionCriteria: ").append(getSelectionCriteria()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountPolicy == false)
            return false;
        AccountPolicy other = (AccountPolicy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getSelectionCriteria() == null ^ this.getSelectionCriteria() == null)
            return false;
        if (other.getSelectionCriteria() != null && other.getSelectionCriteria().equals(this.getSelectionCriteria()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getSelectionCriteria() == null) ? 0 : getSelectionCriteria().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public AccountPolicy clone() {
        try {
            return (AccountPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.AccountPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
