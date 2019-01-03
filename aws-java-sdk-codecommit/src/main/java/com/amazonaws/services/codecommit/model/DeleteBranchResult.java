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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a delete branch operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/DeleteBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBranchResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the branch deleted by the operation, including the branch name and the commit ID that was the
     * tip of the branch.
     * </p>
     */
    private BranchInfo deletedBranch;

    /**
     * <p>
     * Information about the branch deleted by the operation, including the branch name and the commit ID that was the
     * tip of the branch.
     * </p>
     * 
     * @param deletedBranch
     *        Information about the branch deleted by the operation, including the branch name and the commit ID that
     *        was the tip of the branch.
     */

    public void setDeletedBranch(BranchInfo deletedBranch) {
        this.deletedBranch = deletedBranch;
    }

    /**
     * <p>
     * Information about the branch deleted by the operation, including the branch name and the commit ID that was the
     * tip of the branch.
     * </p>
     * 
     * @return Information about the branch deleted by the operation, including the branch name and the commit ID that
     *         was the tip of the branch.
     */

    public BranchInfo getDeletedBranch() {
        return this.deletedBranch;
    }

    /**
     * <p>
     * Information about the branch deleted by the operation, including the branch name and the commit ID that was the
     * tip of the branch.
     * </p>
     * 
     * @param deletedBranch
     *        Information about the branch deleted by the operation, including the branch name and the commit ID that
     *        was the tip of the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBranchResult withDeletedBranch(BranchInfo deletedBranch) {
        setDeletedBranch(deletedBranch);
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
        if (getDeletedBranch() != null)
            sb.append("DeletedBranch: ").append(getDeletedBranch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBranchResult == false)
            return false;
        DeleteBranchResult other = (DeleteBranchResult) obj;
        if (other.getDeletedBranch() == null ^ this.getDeletedBranch() == null)
            return false;
        if (other.getDeletedBranch() != null && other.getDeletedBranch().equals(this.getDeletedBranch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletedBranch() == null) ? 0 : getDeletedBranch().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBranchResult clone() {
        try {
            return (DeleteBranchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
