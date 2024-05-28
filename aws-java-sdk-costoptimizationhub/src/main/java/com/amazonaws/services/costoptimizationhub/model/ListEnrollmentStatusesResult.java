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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ListEnrollmentStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnrollmentStatusesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The enrollment status of all member accounts in the organization if the account is the management account.
     * </p>
     */
    private Boolean includeMemberAccounts;
    /**
     * <p>
     * The enrollment status of a specific account ID, including creation and last updated timestamps.
     * </p>
     */
    private java.util.List<AccountEnrollmentStatus> items;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The enrollment status of all member accounts in the organization if the account is the management account.
     * </p>
     * 
     * @param includeMemberAccounts
     *        The enrollment status of all member accounts in the organization if the account is the management account.
     */

    public void setIncludeMemberAccounts(Boolean includeMemberAccounts) {
        this.includeMemberAccounts = includeMemberAccounts;
    }

    /**
     * <p>
     * The enrollment status of all member accounts in the organization if the account is the management account.
     * </p>
     * 
     * @return The enrollment status of all member accounts in the organization if the account is the management
     *         account.
     */

    public Boolean getIncludeMemberAccounts() {
        return this.includeMemberAccounts;
    }

    /**
     * <p>
     * The enrollment status of all member accounts in the organization if the account is the management account.
     * </p>
     * 
     * @param includeMemberAccounts
     *        The enrollment status of all member accounts in the organization if the account is the management account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesResult withIncludeMemberAccounts(Boolean includeMemberAccounts) {
        setIncludeMemberAccounts(includeMemberAccounts);
        return this;
    }

    /**
     * <p>
     * The enrollment status of all member accounts in the organization if the account is the management account.
     * </p>
     * 
     * @return The enrollment status of all member accounts in the organization if the account is the management
     *         account.
     */

    public Boolean isIncludeMemberAccounts() {
        return this.includeMemberAccounts;
    }

    /**
     * <p>
     * The enrollment status of a specific account ID, including creation and last updated timestamps.
     * </p>
     * 
     * @return The enrollment status of a specific account ID, including creation and last updated timestamps.
     */

    public java.util.List<AccountEnrollmentStatus> getItems() {
        return items;
    }

    /**
     * <p>
     * The enrollment status of a specific account ID, including creation and last updated timestamps.
     * </p>
     * 
     * @param items
     *        The enrollment status of a specific account ID, including creation and last updated timestamps.
     */

    public void setItems(java.util.Collection<AccountEnrollmentStatus> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<AccountEnrollmentStatus>(items);
    }

    /**
     * <p>
     * The enrollment status of a specific account ID, including creation and last updated timestamps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The enrollment status of a specific account ID, including creation and last updated timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesResult withItems(AccountEnrollmentStatus... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<AccountEnrollmentStatus>(items.length));
        }
        for (AccountEnrollmentStatus ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The enrollment status of a specific account ID, including creation and last updated timestamps.
     * </p>
     * 
     * @param items
     *        The enrollment status of a specific account ID, including creation and last updated timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesResult withItems(java.util.Collection<AccountEnrollmentStatus> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnrollmentStatusesResult withNextToken(String nextToken) {
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
        if (getIncludeMemberAccounts() != null)
            sb.append("IncludeMemberAccounts: ").append(getIncludeMemberAccounts()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListEnrollmentStatusesResult == false)
            return false;
        ListEnrollmentStatusesResult other = (ListEnrollmentStatusesResult) obj;
        if (other.getIncludeMemberAccounts() == null ^ this.getIncludeMemberAccounts() == null)
            return false;
        if (other.getIncludeMemberAccounts() != null && other.getIncludeMemberAccounts().equals(this.getIncludeMemberAccounts()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getIncludeMemberAccounts() == null) ? 0 : getIncludeMemberAccounts().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEnrollmentStatusesResult clone() {
        try {
            return (ListEnrollmentStatusesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
