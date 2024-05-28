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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the usage statistics, calculated by top accounts by feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageTopAccountsResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageTopAccountsResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Features by which you can generate the usage statistics.
     * </p>
     * <p>
     * <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * The accounts that contributed to the total usage cost.
     * </p>
     */
    private java.util.List<UsageTopAccountResult> accounts;

    /**
     * <p>
     * Features by which you can generate the usage statistics.
     * </p>
     * <p>
     * <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * </p>
     * 
     * @param feature
     *        Features by which you can generate the usage statistics.</p>
     *        <p>
     *        <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * @see UsageFeature
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * Features by which you can generate the usage statistics.
     * </p>
     * <p>
     * <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * </p>
     * 
     * @return Features by which you can generate the usage statistics.</p>
     *         <p>
     *         <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * @see UsageFeature
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * Features by which you can generate the usage statistics.
     * </p>
     * <p>
     * <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * </p>
     * 
     * @param feature
     *        Features by which you can generate the usage statistics.</p>
     *        <p>
     *        <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageFeature
     */

    public UsageTopAccountsResult withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * Features by which you can generate the usage statistics.
     * </p>
     * <p>
     * <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * </p>
     * 
     * @param feature
     *        Features by which you can generate the usage statistics.</p>
     *        <p>
     *        <code>RDS_LOGIN_EVENTS</code> is currently not supported with <code>topAccountsByFeature</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageFeature
     */

    public UsageTopAccountsResult withFeature(UsageFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * The accounts that contributed to the total usage cost.
     * </p>
     * 
     * @return The accounts that contributed to the total usage cost.
     */

    public java.util.List<UsageTopAccountResult> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The accounts that contributed to the total usage cost.
     * </p>
     * 
     * @param accounts
     *        The accounts that contributed to the total usage cost.
     */

    public void setAccounts(java.util.Collection<UsageTopAccountResult> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<UsageTopAccountResult>(accounts);
    }

    /**
     * <p>
     * The accounts that contributed to the total usage cost.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The accounts that contributed to the total usage cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageTopAccountsResult withAccounts(UsageTopAccountResult... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<UsageTopAccountResult>(accounts.length));
        }
        for (UsageTopAccountResult ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The accounts that contributed to the total usage cost.
     * </p>
     * 
     * @param accounts
     *        The accounts that contributed to the total usage cost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageTopAccountsResult withAccounts(java.util.Collection<UsageTopAccountResult> accounts) {
        setAccounts(accounts);
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
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageTopAccountsResult == false)
            return false;
        UsageTopAccountsResult other = (UsageTopAccountsResult) obj;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        return hashCode;
    }

    @Override
    public UsageTopAccountsResult clone() {
        try {
            return (UsageTopAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageTopAccountsResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
