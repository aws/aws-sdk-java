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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a branch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/BranchInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BranchInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the branch.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The ID of the last commit made to the branch.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The name of the branch.
     * </p>
     * 
     * @param branchName
     *        The name of the branch.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch.
     * </p>
     * 
     * @return The name of the branch.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the branch.
     * </p>
     * 
     * @param branchName
     *        The name of the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BranchInfo withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The ID of the last commit made to the branch.
     * </p>
     * 
     * @param commitId
     *        The ID of the last commit made to the branch.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The ID of the last commit made to the branch.
     * </p>
     * 
     * @return The ID of the last commit made to the branch.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The ID of the last commit made to the branch.
     * </p>
     * 
     * @param commitId
     *        The ID of the last commit made to the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BranchInfo withCommitId(String commitId) {
        setCommitId(commitId);
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
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BranchInfo == false)
            return false;
        BranchInfo other = (BranchInfo) obj;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        return hashCode;
    }

    @Override
    public BranchInfo clone() {
        try {
            return (BranchInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.BranchInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
