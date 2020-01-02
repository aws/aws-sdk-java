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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeBranchesByThreeWay" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeBranchesByThreeWayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The commit ID of the merge in the destination or target branch.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * The tree ID of the merge in the destination or target branch.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * The commit ID of the merge in the destination or target branch.
     * </p>
     * 
     * @param commitId
     *        The commit ID of the merge in the destination or target branch.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID of the merge in the destination or target branch.
     * </p>
     * 
     * @return The commit ID of the merge in the destination or target branch.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The commit ID of the merge in the destination or target branch.
     * </p>
     * 
     * @param commitId
     *        The commit ID of the merge in the destination or target branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByThreeWayResult withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * The tree ID of the merge in the destination or target branch.
     * </p>
     * 
     * @param treeId
     *        The tree ID of the merge in the destination or target branch.
     */

    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * The tree ID of the merge in the destination or target branch.
     * </p>
     * 
     * @return The tree ID of the merge in the destination or target branch.
     */

    public String getTreeId() {
        return this.treeId;
    }

    /**
     * <p>
     * The tree ID of the merge in the destination or target branch.
     * </p>
     * 
     * @param treeId
     *        The tree ID of the merge in the destination or target branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeBranchesByThreeWayResult withTreeId(String treeId) {
        setTreeId(treeId);
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
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getTreeId() != null)
            sb.append("TreeId: ").append(getTreeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeBranchesByThreeWayResult == false)
            return false;
        MergeBranchesByThreeWayResult other = (MergeBranchesByThreeWayResult) obj;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        return hashCode;
    }

    @Override
    public MergeBranchesByThreeWayResult clone() {
        try {
            return (MergeBranchesByThreeWayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
