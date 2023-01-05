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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListDelegatedAdminAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDelegatedAdminAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the Amazon Inspector delegated administrator of your organization.
     * </p>
     */
    private java.util.List<DelegatedAdminAccount> delegatedAdminAccounts;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details of the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @return Details of the Amazon Inspector delegated administrator of your organization.
     */

    public java.util.List<DelegatedAdminAccount> getDelegatedAdminAccounts() {
        return delegatedAdminAccounts;
    }

    /**
     * <p>
     * Details of the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @param delegatedAdminAccounts
     *        Details of the Amazon Inspector delegated administrator of your organization.
     */

    public void setDelegatedAdminAccounts(java.util.Collection<DelegatedAdminAccount> delegatedAdminAccounts) {
        if (delegatedAdminAccounts == null) {
            this.delegatedAdminAccounts = null;
            return;
        }

        this.delegatedAdminAccounts = new java.util.ArrayList<DelegatedAdminAccount>(delegatedAdminAccounts);
    }

    /**
     * <p>
     * Details of the Amazon Inspector delegated administrator of your organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegatedAdminAccounts(java.util.Collection)} or
     * {@link #withDelegatedAdminAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param delegatedAdminAccounts
     *        Details of the Amazon Inspector delegated administrator of your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedAdminAccountsResult withDelegatedAdminAccounts(DelegatedAdminAccount... delegatedAdminAccounts) {
        if (this.delegatedAdminAccounts == null) {
            setDelegatedAdminAccounts(new java.util.ArrayList<DelegatedAdminAccount>(delegatedAdminAccounts.length));
        }
        for (DelegatedAdminAccount ele : delegatedAdminAccounts) {
            this.delegatedAdminAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @param delegatedAdminAccounts
     *        Details of the Amazon Inspector delegated administrator of your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedAdminAccountsResult withDelegatedAdminAccounts(java.util.Collection<DelegatedAdminAccount> delegatedAdminAccounts) {
        setDelegatedAdminAccounts(delegatedAdminAccounts);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDelegatedAdminAccountsResult withNextToken(String nextToken) {
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
        if (getDelegatedAdminAccounts() != null)
            sb.append("DelegatedAdminAccounts: ").append(getDelegatedAdminAccounts()).append(",");
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

        if (obj instanceof ListDelegatedAdminAccountsResult == false)
            return false;
        ListDelegatedAdminAccountsResult other = (ListDelegatedAdminAccountsResult) obj;
        if (other.getDelegatedAdminAccounts() == null ^ this.getDelegatedAdminAccounts() == null)
            return false;
        if (other.getDelegatedAdminAccounts() != null && other.getDelegatedAdminAccounts().equals(this.getDelegatedAdminAccounts()) == false)
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

        hashCode = prime * hashCode + ((getDelegatedAdminAccounts() == null) ? 0 : getDelegatedAdminAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDelegatedAdminAccountsResult clone() {
        try {
            return (ListDelegatedAdminAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
