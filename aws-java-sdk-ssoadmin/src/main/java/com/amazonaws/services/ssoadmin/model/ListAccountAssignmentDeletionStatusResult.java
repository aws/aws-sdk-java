/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentDeletionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssignmentDeletionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     */
    private java.util.List<AccountAssignmentOperationStatusMetadata> accountAssignmentsDeletionStatus;
    /**
     * <p>
     * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make
     * subsequent calls.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * 
     * @return The status object for the account assignment deletion operation.
     */

    public java.util.List<AccountAssignmentOperationStatusMetadata> getAccountAssignmentsDeletionStatus() {
        return accountAssignmentsDeletionStatus;
    }

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * 
     * @param accountAssignmentsDeletionStatus
     *        The status object for the account assignment deletion operation.
     */

    public void setAccountAssignmentsDeletionStatus(java.util.Collection<AccountAssignmentOperationStatusMetadata> accountAssignmentsDeletionStatus) {
        if (accountAssignmentsDeletionStatus == null) {
            this.accountAssignmentsDeletionStatus = null;
            return;
        }

        this.accountAssignmentsDeletionStatus = new java.util.ArrayList<AccountAssignmentOperationStatusMetadata>(accountAssignmentsDeletionStatus);
    }

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountAssignmentsDeletionStatus(java.util.Collection)} or
     * {@link #withAccountAssignmentsDeletionStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accountAssignmentsDeletionStatus
     *        The status object for the account assignment deletion operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentDeletionStatusResult withAccountAssignmentsDeletionStatus(
            AccountAssignmentOperationStatusMetadata... accountAssignmentsDeletionStatus) {
        if (this.accountAssignmentsDeletionStatus == null) {
            setAccountAssignmentsDeletionStatus(new java.util.ArrayList<AccountAssignmentOperationStatusMetadata>(accountAssignmentsDeletionStatus.length));
        }
        for (AccountAssignmentOperationStatusMetadata ele : accountAssignmentsDeletionStatus) {
            this.accountAssignmentsDeletionStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * 
     * @param accountAssignmentsDeletionStatus
     *        The status object for the account assignment deletion operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentDeletionStatusResult withAccountAssignmentsDeletionStatus(
            java.util.Collection<AccountAssignmentOperationStatusMetadata> accountAssignmentsDeletionStatus) {
        setAccountAssignmentsDeletionStatus(accountAssignmentsDeletionStatus);
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

    public ListAccountAssignmentDeletionStatusResult withNextToken(String nextToken) {
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
        if (getAccountAssignmentsDeletionStatus() != null)
            sb.append("AccountAssignmentsDeletionStatus: ").append(getAccountAssignmentsDeletionStatus()).append(",");
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

        if (obj instanceof ListAccountAssignmentDeletionStatusResult == false)
            return false;
        ListAccountAssignmentDeletionStatusResult other = (ListAccountAssignmentDeletionStatusResult) obj;
        if (other.getAccountAssignmentsDeletionStatus() == null ^ this.getAccountAssignmentsDeletionStatus() == null)
            return false;
        if (other.getAccountAssignmentsDeletionStatus() != null
                && other.getAccountAssignmentsDeletionStatus().equals(this.getAccountAssignmentsDeletionStatus()) == false)
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

        hashCode = prime * hashCode + ((getAccountAssignmentsDeletionStatus() == null) ? 0 : getAccountAssignmentsDeletionStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountAssignmentDeletionStatusResult clone() {
        try {
            return (ListAccountAssignmentDeletionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
