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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocumentPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDocumentPermissionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be either an AWS account or <i>All</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accountIds;

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be either an AWS account or <i>All</i>.
     * </p>
     * 
     * @return The account IDs that have permission to use this document. The ID can be either an AWS account or
     *         <i>All</i>.
     */

    public java.util.List<String> getAccountIds() {
        if (accountIds == null) {
            accountIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accountIds;
    }

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be either an AWS account or <i>All</i>.
     * </p>
     * 
     * @param accountIds
     *        The account IDs that have permission to use this document. The ID can be either an AWS account or
     *        <i>All</i>.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new com.amazonaws.internal.SdkInternalList<String>(accountIds);
    }

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be either an AWS account or <i>All</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The account IDs that have permission to use this document. The ID can be either an AWS account or
     *        <i>All</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentPermissionResult withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new com.amazonaws.internal.SdkInternalList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account IDs that have permission to use this document. The ID can be either an AWS account or <i>All</i>.
     * </p>
     * 
     * @param accountIds
     *        The account IDs that have permission to use this document. The ID can be either an AWS account or
     *        <i>All</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentPermissionResult withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentPermissionResult == false)
            return false;
        DescribeDocumentPermissionResult other = (DescribeDocumentPermissionResult) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDocumentPermissionResult clone() {
        try {
            return (DescribeDocumentPermissionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
