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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a reviewer's response to a document review request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DocumentReviewerResponseSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentReviewerResponseSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that a reviewer entered a response to a document review request.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The date and time that a reviewer last updated a response to a document review request.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * The current review status of a new custom SSM document created by a member of your organization, or of the latest
     * version of an existing SSM document.
     * </p>
     * <p>
     * Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the status
     * of the previous version changes to REJECTED.
     * </p>
     * <p>
     * Only one version of a document can be in review, or PENDING, at a time.
     * </p>
     */
    private String reviewStatus;
    /**
     * <p>
     * The comment entered by a reviewer as part of their document review response.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource> comment;
    /**
     * <p>
     * The user in your organization assigned to review a document request.
     * </p>
     */
    private String reviewer;

    /**
     * <p>
     * The date and time that a reviewer entered a response to a document review request.
     * </p>
     * 
     * @param createTime
     *        The date and time that a reviewer entered a response to a document review request.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time that a reviewer entered a response to a document review request.
     * </p>
     * 
     * @return The date and time that a reviewer entered a response to a document review request.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time that a reviewer entered a response to a document review request.
     * </p>
     * 
     * @param createTime
     *        The date and time that a reviewer entered a response to a document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviewerResponseSource withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The date and time that a reviewer last updated a response to a document review request.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that a reviewer last updated a response to a document review request.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date and time that a reviewer last updated a response to a document review request.
     * </p>
     * 
     * @return The date and time that a reviewer last updated a response to a document review request.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date and time that a reviewer last updated a response to a document review request.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that a reviewer last updated a response to a document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviewerResponseSource withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * The current review status of a new custom SSM document created by a member of your organization, or of the latest
     * version of an existing SSM document.
     * </p>
     * <p>
     * Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the status
     * of the previous version changes to REJECTED.
     * </p>
     * <p>
     * Only one version of a document can be in review, or PENDING, at a time.
     * </p>
     * 
     * @param reviewStatus
     *        The current review status of a new custom SSM document created by a member of your organization, or of the
     *        latest version of an existing SSM document.</p>
     *        <p>
     *        Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the
     *        status of the previous version changes to REJECTED.
     *        </p>
     *        <p>
     *        Only one version of a document can be in review, or PENDING, at a time.
     * @see ReviewStatus
     */

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * <p>
     * The current review status of a new custom SSM document created by a member of your organization, or of the latest
     * version of an existing SSM document.
     * </p>
     * <p>
     * Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the status
     * of the previous version changes to REJECTED.
     * </p>
     * <p>
     * Only one version of a document can be in review, or PENDING, at a time.
     * </p>
     * 
     * @return The current review status of a new custom SSM document created by a member of your organization, or of
     *         the latest version of an existing SSM document.</p>
     *         <p>
     *         Only one version of a document can be in the APPROVED state at a time. When a new version is approved,
     *         the status of the previous version changes to REJECTED.
     *         </p>
     *         <p>
     *         Only one version of a document can be in review, or PENDING, at a time.
     * @see ReviewStatus
     */

    public String getReviewStatus() {
        return this.reviewStatus;
    }

    /**
     * <p>
     * The current review status of a new custom SSM document created by a member of your organization, or of the latest
     * version of an existing SSM document.
     * </p>
     * <p>
     * Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the status
     * of the previous version changes to REJECTED.
     * </p>
     * <p>
     * Only one version of a document can be in review, or PENDING, at a time.
     * </p>
     * 
     * @param reviewStatus
     *        The current review status of a new custom SSM document created by a member of your organization, or of the
     *        latest version of an existing SSM document.</p>
     *        <p>
     *        Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the
     *        status of the previous version changes to REJECTED.
     *        </p>
     *        <p>
     *        Only one version of a document can be in review, or PENDING, at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewStatus
     */

    public DocumentReviewerResponseSource withReviewStatus(String reviewStatus) {
        setReviewStatus(reviewStatus);
        return this;
    }

    /**
     * <p>
     * The current review status of a new custom SSM document created by a member of your organization, or of the latest
     * version of an existing SSM document.
     * </p>
     * <p>
     * Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the status
     * of the previous version changes to REJECTED.
     * </p>
     * <p>
     * Only one version of a document can be in review, or PENDING, at a time.
     * </p>
     * 
     * @param reviewStatus
     *        The current review status of a new custom SSM document created by a member of your organization, or of the
     *        latest version of an existing SSM document.</p>
     *        <p>
     *        Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the
     *        status of the previous version changes to REJECTED.
     *        </p>
     *        <p>
     *        Only one version of a document can be in review, or PENDING, at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewStatus
     */

    public DocumentReviewerResponseSource withReviewStatus(ReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus.toString();
        return this;
    }

    /**
     * <p>
     * The comment entered by a reviewer as part of their document review response.
     * </p>
     * 
     * @return The comment entered by a reviewer as part of their document review response.
     */

    public java.util.List<DocumentReviewCommentSource> getComment() {
        if (comment == null) {
            comment = new com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource>();
        }
        return comment;
    }

    /**
     * <p>
     * The comment entered by a reviewer as part of their document review response.
     * </p>
     * 
     * @param comment
     *        The comment entered by a reviewer as part of their document review response.
     */

    public void setComment(java.util.Collection<DocumentReviewCommentSource> comment) {
        if (comment == null) {
            this.comment = null;
            return;
        }

        this.comment = new com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource>(comment);
    }

    /**
     * <p>
     * The comment entered by a reviewer as part of their document review response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComment(java.util.Collection)} or {@link #withComment(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param comment
     *        The comment entered by a reviewer as part of their document review response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviewerResponseSource withComment(DocumentReviewCommentSource... comment) {
        if (this.comment == null) {
            setComment(new com.amazonaws.internal.SdkInternalList<DocumentReviewCommentSource>(comment.length));
        }
        for (DocumentReviewCommentSource ele : comment) {
            this.comment.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The comment entered by a reviewer as part of their document review response.
     * </p>
     * 
     * @param comment
     *        The comment entered by a reviewer as part of their document review response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviewerResponseSource withComment(java.util.Collection<DocumentReviewCommentSource> comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The user in your organization assigned to review a document request.
     * </p>
     * 
     * @param reviewer
     *        The user in your organization assigned to review a document request.
     */

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * <p>
     * The user in your organization assigned to review a document request.
     * </p>
     * 
     * @return The user in your organization assigned to review a document request.
     */

    public String getReviewer() {
        return this.reviewer;
    }

    /**
     * <p>
     * The user in your organization assigned to review a document request.
     * </p>
     * 
     * @param reviewer
     *        The user in your organization assigned to review a document request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentReviewerResponseSource withReviewer(String reviewer) {
        setReviewer(reviewer);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime()).append(",");
        if (getReviewStatus() != null)
            sb.append("ReviewStatus: ").append(getReviewStatus()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getReviewer() != null)
            sb.append("Reviewer: ").append(getReviewer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentReviewerResponseSource == false)
            return false;
        DocumentReviewerResponseSource other = (DocumentReviewerResponseSource) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getReviewStatus() == null ^ this.getReviewStatus() == null)
            return false;
        if (other.getReviewStatus() != null && other.getReviewStatus().equals(this.getReviewStatus()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getReviewer() == null ^ this.getReviewer() == null)
            return false;
        if (other.getReviewer() != null && other.getReviewer().equals(this.getReviewer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getReviewStatus() == null) ? 0 : getReviewStatus().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getReviewer() == null) ? 0 : getReviewer().hashCode());
        return hashCode;
    }

    @Override
    public DocumentReviewerResponseSource clone() {
        try {
            return (DocumentReviewerResponseSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DocumentReviewerResponseSourceMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
