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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetAccountStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAccountStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that provide details on the status of Amazon Inspector for each of the requested accounts.
     * </p>
     */
    private java.util.List<AccountState> accounts;
    /**
     * <p>
     * An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * </p>
     */
    private java.util.List<FailedAccount> failedAccounts;

    /**
     * <p>
     * An array of objects that provide details on the status of Amazon Inspector for each of the requested accounts.
     * </p>
     * 
     * @return An array of objects that provide details on the status of Amazon Inspector for each of the requested
     *         accounts.
     */

    public java.util.List<AccountState> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * An array of objects that provide details on the status of Amazon Inspector for each of the requested accounts.
     * </p>
     * 
     * @param accounts
     *        An array of objects that provide details on the status of Amazon Inspector for each of the requested
     *        accounts.
     */

    public void setAccounts(java.util.Collection<AccountState> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<AccountState>(accounts);
    }

    /**
     * <p>
     * An array of objects that provide details on the status of Amazon Inspector for each of the requested accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        An array of objects that provide details on the status of Amazon Inspector for each of the requested
     *        accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAccountStatusResult withAccounts(AccountState... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<AccountState>(accounts.length));
        }
        for (AccountState ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provide details on the status of Amazon Inspector for each of the requested accounts.
     * </p>
     * 
     * @param accounts
     *        An array of objects that provide details on the status of Amazon Inspector for each of the requested
     *        accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAccountStatusResult withAccounts(java.util.Collection<AccountState> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * </p>
     * 
     * @return An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     */

    public java.util.List<FailedAccount> getFailedAccounts() {
        return failedAccounts;
    }

    /**
     * <p>
     * An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * </p>
     * 
     * @param failedAccounts
     *        An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     */

    public void setFailedAccounts(java.util.Collection<FailedAccount> failedAccounts) {
        if (failedAccounts == null) {
            this.failedAccounts = null;
            return;
        }

        this.failedAccounts = new java.util.ArrayList<FailedAccount>(failedAccounts);
    }

    /**
     * <p>
     * An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedAccounts(java.util.Collection)} or {@link #withFailedAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failedAccounts
     *        An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAccountStatusResult withFailedAccounts(FailedAccount... failedAccounts) {
        if (this.failedAccounts == null) {
            setFailedAccounts(new java.util.ArrayList<FailedAccount>(failedAccounts.length));
        }
        for (FailedAccount ele : failedAccounts) {
            this.failedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * </p>
     * 
     * @param failedAccounts
     *        An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAccountStatusResult withFailedAccounts(java.util.Collection<FailedAccount> failedAccounts) {
        setFailedAccounts(failedAccounts);
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
        if (getFailedAccounts() != null)
            sb.append("FailedAccounts: ").append(getFailedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAccountStatusResult == false)
            return false;
        BatchGetAccountStatusResult other = (BatchGetAccountStatusResult) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getFailedAccounts() == null ^ this.getFailedAccounts() == null)
            return false;
        if (other.getFailedAccounts() != null && other.getFailedAccounts().equals(this.getFailedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getFailedAccounts() == null) ? 0 : getFailedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAccountStatusResult clone() {
        try {
            return (BatchGetAccountStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
