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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssignmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of assignments that match the input AWS account and permission set.
     * </p>
     */
    private java.util.List<AccountAssignment> accountAssignments;
    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of assignments that match the input AWS account and permission set.
     * </p>
     * 
     * @return The list of assignments that match the input AWS account and permission set.
     */

    public java.util.List<AccountAssignment> getAccountAssignments() {
        return accountAssignments;
    }

    /**
     * <p>
     * The list of assignments that match the input AWS account and permission set.
     * </p>
     * 
     * @param accountAssignments
     *        The list of assignments that match the input AWS account and permission set.
     */

    public void setAccountAssignments(java.util.Collection<AccountAssignment> accountAssignments) {
        if (accountAssignments == null) {
            this.accountAssignments = null;
            return;
        }

        this.accountAssignments = new java.util.ArrayList<AccountAssignment>(accountAssignments);
    }

    /**
     * <p>
     * The list of assignments that match the input AWS account and permission set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountAssignments(java.util.Collection)} or {@link #withAccountAssignments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountAssignments
     *        The list of assignments that match the input AWS account and permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsResult withAccountAssignments(AccountAssignment... accountAssignments) {
        if (this.accountAssignments == null) {
            setAccountAssignments(new java.util.ArrayList<AccountAssignment>(accountAssignments.length));
        }
        for (AccountAssignment ele : accountAssignments) {
            this.accountAssignments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of assignments that match the input AWS account and permission set.
     * </p>
     * 
     * @param accountAssignments
     *        The list of assignments that match the input AWS account and permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsResult withAccountAssignments(java.util.Collection<AccountAssignment> accountAssignments) {
        setAccountAssignments(accountAssignments);
        return this;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @return The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *         to make subsequent calls.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the list API. Initially the value is null. Use the output of previous API calls
     *        to make subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsResult withNextToken(String nextToken) {
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
        if (getAccountAssignments() != null)
            sb.append("AccountAssignments: ").append(getAccountAssignments()).append(",");
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

        if (obj instanceof ListAccountAssignmentsResult == false)
            return false;
        ListAccountAssignmentsResult other = (ListAccountAssignmentsResult) obj;
        if (other.getAccountAssignments() == null ^ this.getAccountAssignments() == null)
            return false;
        if (other.getAccountAssignments() != null && other.getAccountAssignments().equals(this.getAccountAssignments()) == false)
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

        hashCode = prime * hashCode + ((getAccountAssignments() == null) ? 0 : getAccountAssignments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountAssignmentsResult clone() {
        try {
            return (ListAccountAssignmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
