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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeAccountAssignmentDeletionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountAssignmentDeletionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     */
    private AccountAssignmentOperationStatus accountAssignmentDeletionStatus;

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * 
     * @param accountAssignmentDeletionStatus
     *        The status object for the account assignment deletion operation.
     */

    public void setAccountAssignmentDeletionStatus(AccountAssignmentOperationStatus accountAssignmentDeletionStatus) {
        this.accountAssignmentDeletionStatus = accountAssignmentDeletionStatus;
    }

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * 
     * @return The status object for the account assignment deletion operation.
     */

    public AccountAssignmentOperationStatus getAccountAssignmentDeletionStatus() {
        return this.accountAssignmentDeletionStatus;
    }

    /**
     * <p>
     * The status object for the account assignment deletion operation.
     * </p>
     * 
     * @param accountAssignmentDeletionStatus
     *        The status object for the account assignment deletion operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAssignmentDeletionStatusResult withAccountAssignmentDeletionStatus(AccountAssignmentOperationStatus accountAssignmentDeletionStatus) {
        setAccountAssignmentDeletionStatus(accountAssignmentDeletionStatus);
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
        if (getAccountAssignmentDeletionStatus() != null)
            sb.append("AccountAssignmentDeletionStatus: ").append(getAccountAssignmentDeletionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAssignmentDeletionStatusResult == false)
            return false;
        DescribeAccountAssignmentDeletionStatusResult other = (DescribeAccountAssignmentDeletionStatusResult) obj;
        if (other.getAccountAssignmentDeletionStatus() == null ^ this.getAccountAssignmentDeletionStatus() == null)
            return false;
        if (other.getAccountAssignmentDeletionStatus() != null
                && other.getAccountAssignmentDeletionStatus().equals(this.getAccountAssignmentDeletionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountAssignmentDeletionStatus() == null) ? 0 : getAccountAssignmentDeletionStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountAssignmentDeletionStatusResult clone() {
        try {
            return (DescribeAccountAssignmentDeletionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
