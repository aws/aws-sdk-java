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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListAccountAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of linked accounts in the payer account.
     * </p>
     */
    private java.util.List<AccountAssociationsListElement> linkedAccounts;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to get accounts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of linked accounts in the payer account.
     * </p>
     * 
     * @return The list of linked accounts in the payer account.
     */

    public java.util.List<AccountAssociationsListElement> getLinkedAccounts() {
        return linkedAccounts;
    }

    /**
     * <p>
     * The list of linked accounts in the payer account.
     * </p>
     * 
     * @param linkedAccounts
     *        The list of linked accounts in the payer account.
     */

    public void setLinkedAccounts(java.util.Collection<AccountAssociationsListElement> linkedAccounts) {
        if (linkedAccounts == null) {
            this.linkedAccounts = null;
            return;
        }

        this.linkedAccounts = new java.util.ArrayList<AccountAssociationsListElement>(linkedAccounts);
    }

    /**
     * <p>
     * The list of linked accounts in the payer account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLinkedAccounts(java.util.Collection)} or {@link #withLinkedAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param linkedAccounts
     *        The list of linked accounts in the payer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssociationsResult withLinkedAccounts(AccountAssociationsListElement... linkedAccounts) {
        if (this.linkedAccounts == null) {
            setLinkedAccounts(new java.util.ArrayList<AccountAssociationsListElement>(linkedAccounts.length));
        }
        for (AccountAssociationsListElement ele : linkedAccounts) {
            this.linkedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of linked accounts in the payer account.
     * </p>
     * 
     * @param linkedAccounts
     *        The list of linked accounts in the payer account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssociationsResult withLinkedAccounts(java.util.Collection<AccountAssociationsListElement> linkedAccounts) {
        setLinkedAccounts(linkedAccounts);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get accounts.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get accounts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get accounts.
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to get accounts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get accounts.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssociationsResult withNextToken(String nextToken) {
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
        if (getLinkedAccounts() != null)
            sb.append("LinkedAccounts: ").append(getLinkedAccounts()).append(",");
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

        if (obj instanceof ListAccountAssociationsResult == false)
            return false;
        ListAccountAssociationsResult other = (ListAccountAssociationsResult) obj;
        if (other.getLinkedAccounts() == null ^ this.getLinkedAccounts() == null)
            return false;
        if (other.getLinkedAccounts() != null && other.getLinkedAccounts().equals(this.getLinkedAccounts()) == false)
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

        hashCode = prime * hashCode + ((getLinkedAccounts() == null) ? 0 : getLinkedAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountAssociationsResult clone() {
        try {
            return (ListAccountAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
