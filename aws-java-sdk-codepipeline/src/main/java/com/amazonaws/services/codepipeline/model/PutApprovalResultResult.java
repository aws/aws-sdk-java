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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a PutApprovalResult action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutApprovalResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutApprovalResultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp showing when the approval or rejection was submitted.
     * </p>
     */
    private java.util.Date approvedAt;

    /**
     * <p>
     * The timestamp showing when the approval or rejection was submitted.
     * </p>
     * 
     * @param approvedAt
     *        The timestamp showing when the approval or rejection was submitted.
     */

    public void setApprovedAt(java.util.Date approvedAt) {
        this.approvedAt = approvedAt;
    }

    /**
     * <p>
     * The timestamp showing when the approval or rejection was submitted.
     * </p>
     * 
     * @return The timestamp showing when the approval or rejection was submitted.
     */

    public java.util.Date getApprovedAt() {
        return this.approvedAt;
    }

    /**
     * <p>
     * The timestamp showing when the approval or rejection was submitted.
     * </p>
     * 
     * @param approvedAt
     *        The timestamp showing when the approval or rejection was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutApprovalResultResult withApprovedAt(java.util.Date approvedAt) {
        setApprovedAt(approvedAt);
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
        if (getApprovedAt() != null)
            sb.append("ApprovedAt: ").append(getApprovedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutApprovalResultResult == false)
            return false;
        PutApprovalResultResult other = (PutApprovalResultResult) obj;
        if (other.getApprovedAt() == null ^ this.getApprovedAt() == null)
            return false;
        if (other.getApprovedAt() != null && other.getApprovedAt().equals(this.getApprovedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovedAt() == null) ? 0 : getApprovedAt().hashCode());
        return hashCode;
    }

    @Override
    public PutApprovalResultResult clone() {
        try {
            return (PutApprovalResultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
