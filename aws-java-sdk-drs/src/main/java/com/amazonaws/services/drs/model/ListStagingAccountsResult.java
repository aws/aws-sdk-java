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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ListStagingAccounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStagingAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of staging AWS Accounts.
     * </p>
     */
    private java.util.List<Account> accounts;
    /**
     * <p>
     * The token of the next staging Account to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of staging AWS Accounts.
     * </p>
     * 
     * @return An array of staging AWS Accounts.
     */

    public java.util.List<Account> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * An array of staging AWS Accounts.
     * </p>
     * 
     * @param accounts
     *        An array of staging AWS Accounts.
     */

    public void setAccounts(java.util.Collection<Account> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<Account>(accounts);
    }

    /**
     * <p>
     * An array of staging AWS Accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        An array of staging AWS Accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStagingAccountsResult withAccounts(Account... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<Account>(accounts.length));
        }
        for (Account ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of staging AWS Accounts.
     * </p>
     * 
     * @param accounts
     *        An array of staging AWS Accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStagingAccountsResult withAccounts(java.util.Collection<Account> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The token of the next staging Account to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next staging Account to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token of the next staging Account to retrieve.
     * </p>
     * 
     * @return The token of the next staging Account to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token of the next staging Account to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The token of the next staging Account to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStagingAccountsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStagingAccountsResult == false)
            return false;
        ListStagingAccountsResult other = (ListStagingAccountsResult) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStagingAccountsResult clone() {
        try {
            return (ListStagingAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
