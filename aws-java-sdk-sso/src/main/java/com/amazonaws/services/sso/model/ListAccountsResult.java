/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sso.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-2019-06-10/ListAccounts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A paginated response with the list of account information and the next token if more results are available.
     * </p>
     */
    private java.util.List<AccountInfo> accountList;

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     * 
     * @param nextToken
     *        The page token client that is used to retrieve the list of accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     * 
     * @return The page token client that is used to retrieve the list of accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The page token client that is used to retrieve the list of accounts.
     * </p>
     * 
     * @param nextToken
     *        The page token client that is used to retrieve the list of accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A paginated response with the list of account information and the next token if more results are available.
     * </p>
     * 
     * @return A paginated response with the list of account information and the next token if more results are
     *         available.
     */

    public java.util.List<AccountInfo> getAccountList() {
        return accountList;
    }

    /**
     * <p>
     * A paginated response with the list of account information and the next token if more results are available.
     * </p>
     * 
     * @param accountList
     *        A paginated response with the list of account information and the next token if more results are
     *        available.
     */

    public void setAccountList(java.util.Collection<AccountInfo> accountList) {
        if (accountList == null) {
            this.accountList = null;
            return;
        }

        this.accountList = new java.util.ArrayList<AccountInfo>(accountList);
    }

    /**
     * <p>
     * A paginated response with the list of account information and the next token if more results are available.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountList(java.util.Collection)} or {@link #withAccountList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountList
     *        A paginated response with the list of account information and the next token if more results are
     *        available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsResult withAccountList(AccountInfo... accountList) {
        if (this.accountList == null) {
            setAccountList(new java.util.ArrayList<AccountInfo>(accountList.length));
        }
        for (AccountInfo ele : accountList) {
            this.accountList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A paginated response with the list of account information and the next token if more results are available.
     * </p>
     * 
     * @param accountList
     *        A paginated response with the list of account information and the next token if more results are
     *        available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountsResult withAccountList(java.util.Collection<AccountInfo> accountList) {
        setAccountList(accountList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getAccountList() != null)
            sb.append("AccountList: ").append(getAccountList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountsResult == false)
            return false;
        ListAccountsResult other = (ListAccountsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAccountList() == null ^ this.getAccountList() == null)
            return false;
        if (other.getAccountList() != null && other.getAccountList().equals(this.getAccountList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAccountList() == null) ? 0 : getAccountList().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountsResult clone() {
        try {
            return (ListAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
