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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetRemainingFreeTrialDays"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRemainingFreeTrialDaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The member accounts which were included in a request and were processed successfully.
     * </p>
     */
    private java.util.List<AccountFreeTrialInfo> accounts;
    /**
     * <p>
     * The member account that was included in a request but for which the request could not be processed.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * The member accounts which were included in a request and were processed successfully.
     * </p>
     * 
     * @return The member accounts which were included in a request and were processed successfully.
     */

    public java.util.List<AccountFreeTrialInfo> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The member accounts which were included in a request and were processed successfully.
     * </p>
     * 
     * @param accounts
     *        The member accounts which were included in a request and were processed successfully.
     */

    public void setAccounts(java.util.Collection<AccountFreeTrialInfo> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<AccountFreeTrialInfo>(accounts);
    }

    /**
     * <p>
     * The member accounts which were included in a request and were processed successfully.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The member accounts which were included in a request and were processed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRemainingFreeTrialDaysResult withAccounts(AccountFreeTrialInfo... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<AccountFreeTrialInfo>(accounts.length));
        }
        for (AccountFreeTrialInfo ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The member accounts which were included in a request and were processed successfully.
     * </p>
     * 
     * @param accounts
     *        The member accounts which were included in a request and were processed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRemainingFreeTrialDaysResult withAccounts(java.util.Collection<AccountFreeTrialInfo> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The member account that was included in a request but for which the request could not be processed.
     * </p>
     * 
     * @return The member account that was included in a request but for which the request could not be processed.
     */

    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * The member account that was included in a request but for which the request could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The member account that was included in a request but for which the request could not be processed.
     */

    public void setUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts);
    }

    /**
     * <p>
     * The member account that was included in a request but for which the request could not be processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The member account that was included in a request but for which the request could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRemainingFreeTrialDaysResult withUnprocessedAccounts(UnprocessedAccount... unprocessedAccounts) {
        if (this.unprocessedAccounts == null) {
            setUnprocessedAccounts(new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts.length));
        }
        for (UnprocessedAccount ele : unprocessedAccounts) {
            this.unprocessedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The member account that was included in a request but for which the request could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The member account that was included in a request but for which the request could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRemainingFreeTrialDaysResult withUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        setUnprocessedAccounts(unprocessedAccounts);
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getUnprocessedAccounts() != null)
            sb.append("UnprocessedAccounts: ").append(getUnprocessedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRemainingFreeTrialDaysResult == false)
            return false;
        GetRemainingFreeTrialDaysResult other = (GetRemainingFreeTrialDaysResult) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getUnprocessedAccounts() == null ^ this.getUnprocessedAccounts() == null)
            return false;
        if (other.getUnprocessedAccounts() != null && other.getUnprocessedAccounts().equals(this.getUnprocessedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public GetRemainingFreeTrialDaysResult clone() {
        try {
            return (GetRemainingFreeTrialDaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
