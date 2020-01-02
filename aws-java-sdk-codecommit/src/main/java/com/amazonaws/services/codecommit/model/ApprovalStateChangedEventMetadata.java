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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a change in the approval state for a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ApprovalStateChangedEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApprovalStateChangedEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     */
    private String approvalStatus;

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the pull request when the approval state changed.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     * 
     * @return The revision ID of the pull request when the approval state changed.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision ID of the pull request when the approval state changed.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the pull request when the approval state changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApprovalStateChangedEventMetadata withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * 
     * @param approvalStatus
     *        The approval status for the pull request.
     * @see ApprovalState
     */

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * 
     * @return The approval status for the pull request.
     * @see ApprovalState
     */

    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * 
     * @param approvalStatus
     *        The approval status for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalState
     */

    public ApprovalStateChangedEventMetadata withApprovalStatus(String approvalStatus) {
        setApprovalStatus(approvalStatus);
        return this;
    }

    /**
     * <p>
     * The approval status for the pull request.
     * </p>
     * 
     * @param approvalStatus
     *        The approval status for the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApprovalState
     */

    public ApprovalStateChangedEventMetadata withApprovalStatus(ApprovalState approvalStatus) {
        this.approvalStatus = approvalStatus.toString();
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
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getApprovalStatus() != null)
            sb.append("ApprovalStatus: ").append(getApprovalStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApprovalStateChangedEventMetadata == false)
            return false;
        ApprovalStateChangedEventMetadata other = (ApprovalStateChangedEventMetadata) obj;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getApprovalStatus() == null ^ this.getApprovalStatus() == null)
            return false;
        if (other.getApprovalStatus() != null && other.getApprovalStatus().equals(this.getApprovalStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getApprovalStatus() == null) ? 0 : getApprovalStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApprovalStateChangedEventMetadata clone() {
        try {
            return (ApprovalStateChangedEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ApprovalStateChangedEventMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
