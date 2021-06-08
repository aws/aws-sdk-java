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
 * Information about the result of a document review request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ReviewInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time that the reviewer took action on the document review request.
     * </p>
     */
    private java.util.Date reviewedTime;
    /**
     * <p>
     * The current status of the document review request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reviewer assigned to take action on the document review request.
     * </p>
     */
    private String reviewer;

    /**
     * <p>
     * The time that the reviewer took action on the document review request.
     * </p>
     * 
     * @param reviewedTime
     *        The time that the reviewer took action on the document review request.
     */

    public void setReviewedTime(java.util.Date reviewedTime) {
        this.reviewedTime = reviewedTime;
    }

    /**
     * <p>
     * The time that the reviewer took action on the document review request.
     * </p>
     * 
     * @return The time that the reviewer took action on the document review request.
     */

    public java.util.Date getReviewedTime() {
        return this.reviewedTime;
    }

    /**
     * <p>
     * The time that the reviewer took action on the document review request.
     * </p>
     * 
     * @param reviewedTime
     *        The time that the reviewer took action on the document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewInformation withReviewedTime(java.util.Date reviewedTime) {
        setReviewedTime(reviewedTime);
        return this;
    }

    /**
     * <p>
     * The current status of the document review request.
     * </p>
     * 
     * @param status
     *        The current status of the document review request.
     * @see ReviewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the document review request.
     * </p>
     * 
     * @return The current status of the document review request.
     * @see ReviewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the document review request.
     * </p>
     * 
     * @param status
     *        The current status of the document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewStatus
     */

    public ReviewInformation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the document review request.
     * </p>
     * 
     * @param status
     *        The current status of the document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewStatus
     */

    public ReviewInformation withStatus(ReviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reviewer assigned to take action on the document review request.
     * </p>
     * 
     * @param reviewer
     *        The reviewer assigned to take action on the document review request.
     */

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * <p>
     * The reviewer assigned to take action on the document review request.
     * </p>
     * 
     * @return The reviewer assigned to take action on the document review request.
     */

    public String getReviewer() {
        return this.reviewer;
    }

    /**
     * <p>
     * The reviewer assigned to take action on the document review request.
     * </p>
     * 
     * @param reviewer
     *        The reviewer assigned to take action on the document review request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewInformation withReviewer(String reviewer) {
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
        if (getReviewedTime() != null)
            sb.append("ReviewedTime: ").append(getReviewedTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ReviewInformation == false)
            return false;
        ReviewInformation other = (ReviewInformation) obj;
        if (other.getReviewedTime() == null ^ this.getReviewedTime() == null)
            return false;
        if (other.getReviewedTime() != null && other.getReviewedTime().equals(this.getReviewedTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getReviewedTime() == null) ? 0 : getReviewedTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReviewer() == null) ? 0 : getReviewer().hashCode());
        return hashCode;
    }

    @Override
    public ReviewInformation clone() {
        try {
            return (ReviewInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ReviewInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
