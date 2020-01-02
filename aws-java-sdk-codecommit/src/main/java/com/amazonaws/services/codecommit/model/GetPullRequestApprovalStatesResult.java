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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetPullRequestApprovalStates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPullRequestApprovalStatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     */
    private java.util.List<Approval> approvals;

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     * 
     * @return Information about users who have approved the pull request.
     */

    public java.util.List<Approval> getApprovals() {
        return approvals;
    }

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     * 
     * @param approvals
     *        Information about users who have approved the pull request.
     */

    public void setApprovals(java.util.Collection<Approval> approvals) {
        if (approvals == null) {
            this.approvals = null;
            return;
        }

        this.approvals = new java.util.ArrayList<Approval>(approvals);
    }

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovals(java.util.Collection)} or {@link #withApprovals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param approvals
     *        Information about users who have approved the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPullRequestApprovalStatesResult withApprovals(Approval... approvals) {
        if (this.approvals == null) {
            setApprovals(new java.util.ArrayList<Approval>(approvals.length));
        }
        for (Approval ele : approvals) {
            this.approvals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about users who have approved the pull request.
     * </p>
     * 
     * @param approvals
     *        Information about users who have approved the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPullRequestApprovalStatesResult withApprovals(java.util.Collection<Approval> approvals) {
        setApprovals(approvals);
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
        if (getApprovals() != null)
            sb.append("Approvals: ").append(getApprovals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPullRequestApprovalStatesResult == false)
            return false;
        GetPullRequestApprovalStatesResult other = (GetPullRequestApprovalStatesResult) obj;
        if (other.getApprovals() == null ^ this.getApprovals() == null)
            return false;
        if (other.getApprovals() != null && other.getApprovals().equals(this.getApprovals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovals() == null) ? 0 : getApprovals().hashCode());
        return hashCode;
    }

    @Override
    public GetPullRequestApprovalStatesResult clone() {
        try {
            return (GetPullRequestApprovalStatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
