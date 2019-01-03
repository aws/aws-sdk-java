/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of details about the Security Hub member accounts.
     * </p>
     */
    private java.util.List<Member> members;
    /**
     * <p>
     * A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * </p>
     */
    private java.util.List<Result> unprocessedAccounts;

    /**
     * <p>
     * A list of details about the Security Hub member accounts.
     * </p>
     * 
     * @return A list of details about the Security Hub member accounts.
     */

    public java.util.List<Member> getMembers() {
        return members;
    }

    /**
     * <p>
     * A list of details about the Security Hub member accounts.
     * </p>
     * 
     * @param members
     *        A list of details about the Security Hub member accounts.
     */

    public void setMembers(java.util.Collection<Member> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<Member>(members);
    }

    /**
     * <p>
     * A list of details about the Security Hub member accounts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        A list of details about the Security Hub member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withMembers(Member... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<Member>(members.length));
        }
        for (Member ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of details about the Security Hub member accounts.
     * </p>
     * 
     * @param members
     *        A list of details about the Security Hub member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withMembers(java.util.Collection<Member> members) {
        setMembers(members);
        return this;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * </p>
     * 
     * @return A list of account ID and email address pairs of the AWS accounts that could not be processed.
     */

    public java.util.List<Result> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        A list of account ID and email address pairs of the AWS accounts that could not be processed.
     */

    public void setUnprocessedAccounts(java.util.Collection<Result> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<Result>(unprocessedAccounts);
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withUnprocessedAccounts(Result... unprocessedAccounts) {
        if (this.unprocessedAccounts == null) {
            setUnprocessedAccounts(new java.util.ArrayList<Result>(unprocessedAccounts.length));
        }
        for (Result ele : unprocessedAccounts) {
            this.unprocessedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        A list of account ID and email address pairs of the AWS accounts that could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersResult withUnprocessedAccounts(java.util.Collection<Result> unprocessedAccounts) {
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
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers()).append(",");
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

        if (obj instanceof GetMembersResult == false)
            return false;
        GetMembersResult other = (GetMembersResult) obj;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
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

        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public GetMembersResult clone() {
        try {
            return (GetMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
