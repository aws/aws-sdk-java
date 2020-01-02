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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/DeleteMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMembersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior
     * graph.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     * account, provides the reason that the deletion could not be processed.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior
     * graph.
     * </p>
     * 
     * @return The list of AWS account identifiers for the member accounts that Detective successfully deleted from the
     *         behavior graph.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior
     * graph.
     * </p>
     * 
     * @param accountIds
     *        The list of AWS account identifiers for the member accounts that Detective successfully deleted from the
     *        behavior graph.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior
     * graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The list of AWS account identifiers for the member accounts that Detective successfully deleted from the
     *        behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMembersResult withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member accounts that Detective successfully deleted from the behavior
     * graph.
     * </p>
     * 
     * @param accountIds
     *        The list of AWS account identifiers for the member accounts that Detective successfully deleted from the
     *        behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMembersResult withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     * account, provides the reason that the deletion could not be processed.
     * </p>
     * 
     * @return The list of member accounts that Detective was not able to delete from the behavior graph. For each
     *         member account, provides the reason that the deletion could not be processed.
     */

    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     * account, provides the reason that the deletion could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     *        account, provides the reason that the deletion could not be processed.
     */

    public void setUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts);
    }

    /**
     * <p>
     * The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     * account, provides the reason that the deletion could not be processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     *        account, provides the reason that the deletion could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMembersResult withUnprocessedAccounts(UnprocessedAccount... unprocessedAccounts) {
        if (this.unprocessedAccounts == null) {
            setUnprocessedAccounts(new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts.length));
        }
        for (UnprocessedAccount ele : unprocessedAccounts) {
            this.unprocessedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     * account, provides the reason that the deletion could not be processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        The list of member accounts that Detective was not able to delete from the behavior graph. For each member
     *        account, provides the reason that the deletion could not be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMembersResult withUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
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

        if (obj instanceof DeleteMembersResult == false)
            return false;
        DeleteMembersResult other = (DeleteMembersResult) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
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

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMembersResult clone() {
        try {
            return (DeleteMembersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
