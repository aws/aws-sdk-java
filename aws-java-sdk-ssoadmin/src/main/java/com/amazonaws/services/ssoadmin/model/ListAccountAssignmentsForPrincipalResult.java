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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentsForPrincipal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssignmentsForPrincipalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array list of the account assignments for the principal.
     * </p>
     */
    private java.util.List<AccountAssignmentForPrincipal> accountAssignments;
    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array list of the account assignments for the principal.
     * </p>
     * 
     * @return An array list of the account assignments for the principal.
     */

    public java.util.List<AccountAssignmentForPrincipal> getAccountAssignments() {
        return accountAssignments;
    }

    /**
     * <p>
     * An array list of the account assignments for the principal.
     * </p>
     * 
     * @param accountAssignments
     *        An array list of the account assignments for the principal.
     */

    public void setAccountAssignments(java.util.Collection<AccountAssignmentForPrincipal> accountAssignments) {
        if (accountAssignments == null) {
            this.accountAssignments = null;
            return;
        }

        this.accountAssignments = new java.util.ArrayList<AccountAssignmentForPrincipal>(accountAssignments);
    }

    /**
     * <p>
     * An array list of the account assignments for the principal.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountAssignments(java.util.Collection)} or {@link #withAccountAssignments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountAssignments
     *        An array list of the account assignments for the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalResult withAccountAssignments(AccountAssignmentForPrincipal... accountAssignments) {
        if (this.accountAssignments == null) {
            setAccountAssignments(new java.util.ArrayList<AccountAssignmentForPrincipal>(accountAssignments.length));
        }
        for (AccountAssignmentForPrincipal ele : accountAssignments) {
            this.accountAssignments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array list of the account assignments for the principal.
     * </p>
     * 
     * @param accountAssignments
     *        An array list of the account assignments for the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalResult withAccountAssignments(java.util.Collection<AccountAssignmentForPrincipal> accountAssignments) {
        setAccountAssignments(accountAssignments);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @return If present, this value indicates that more output is available than is included in the current response.
     *         Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *         get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalResult withNextToken(String nextToken) {
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

        if (obj instanceof ListAccountAssignmentsForPrincipalResult == false)
            return false;
        ListAccountAssignmentsForPrincipalResult other = (ListAccountAssignmentsForPrincipalResult) obj;
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
    public ListAccountAssignmentsForPrincipalResult clone() {
        try {
            return (ListAccountAssignmentsForPrincipalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
