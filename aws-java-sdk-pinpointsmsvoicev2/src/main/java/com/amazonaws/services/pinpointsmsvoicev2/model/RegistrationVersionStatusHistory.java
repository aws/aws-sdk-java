/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <b>RegistrationVersionStatusHistory</b> object contains the time stamps for when the reservations status changes.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/RegistrationVersionStatusHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegistrationVersionStatusHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date draftTimestamp;
    /**
     * <p>
     * The time when the registration was in the submitted state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     */
    private java.util.Date submittedTimestamp;
    /**
     * <p>
     * The time when the registration was in the reviewing state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     */
    private java.util.Date reviewingTimestamp;
    /**
     * <p>
     * The time when the registration was in the approved state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date approvedTimestamp;
    /**
     * <p>
     * The time when the registration was in the discarded state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     */
    private java.util.Date discardedTimestamp;
    /**
     * <p>
     * The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date deniedTimestamp;
    /**
     * <p>
     * The time when the registration was in the revoked state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date revokedTimestamp;
    /**
     * <p>
     * The time when the registration was in the archived state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date archivedTimestamp;

    /**
     * <p>
     * The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param draftTimestamp
     *        The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setDraftTimestamp(java.util.Date draftTimestamp) {
        this.draftTimestamp = draftTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX
     *         epoch time</a> format.
     */

    public java.util.Date getDraftTimestamp() {
        return this.draftTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param draftTimestamp
     *        The time when the registration was in the draft state, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withDraftTimestamp(java.util.Date draftTimestamp) {
        setDraftTimestamp(draftTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the submitted state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param submittedTimestamp
     *        The time when the registration was in the submitted state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setSubmittedTimestamp(java.util.Date submittedTimestamp) {
        this.submittedTimestamp = submittedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the submitted state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the submitted state, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getSubmittedTimestamp() {
        return this.submittedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the submitted state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param submittedTimestamp
     *        The time when the registration was in the submitted state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withSubmittedTimestamp(java.util.Date submittedTimestamp) {
        setSubmittedTimestamp(submittedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the reviewing state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param reviewingTimestamp
     *        The time when the registration was in the reviewing state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setReviewingTimestamp(java.util.Date reviewingTimestamp) {
        this.reviewingTimestamp = reviewingTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the reviewing state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the reviewing state, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getReviewingTimestamp() {
        return this.reviewingTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the reviewing state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param reviewingTimestamp
     *        The time when the registration was in the reviewing state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withReviewingTimestamp(java.util.Date reviewingTimestamp) {
        setReviewingTimestamp(reviewingTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the approved state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param approvedTimestamp
     *        The time when the registration was in the approved state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setApprovedTimestamp(java.util.Date approvedTimestamp) {
        this.approvedTimestamp = approvedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the approved state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the approved state, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getApprovedTimestamp() {
        return this.approvedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the approved state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param approvedTimestamp
     *        The time when the registration was in the approved state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withApprovedTimestamp(java.util.Date approvedTimestamp) {
        setApprovedTimestamp(approvedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the discarded state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param discardedTimestamp
     *        The time when the registration was in the discarded state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setDiscardedTimestamp(java.util.Date discardedTimestamp) {
        this.discardedTimestamp = discardedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the discarded state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the discarded state, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getDiscardedTimestamp() {
        return this.discardedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the discarded state, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param discardedTimestamp
     *        The time when the registration was in the discarded state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withDiscardedTimestamp(java.util.Date discardedTimestamp) {
        setDiscardedTimestamp(discardedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param deniedTimestamp
     *        The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setDeniedTimestamp(java.util.Date deniedTimestamp) {
        this.deniedTimestamp = deniedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX
     *         epoch time</a> format.
     */

    public java.util.Date getDeniedTimestamp() {
        return this.deniedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param deniedTimestamp
     *        The time when the registration was in the denied state, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withDeniedTimestamp(java.util.Date deniedTimestamp) {
        setDeniedTimestamp(deniedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the revoked state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param revokedTimestamp
     *        The time when the registration was in the revoked state, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setRevokedTimestamp(java.util.Date revokedTimestamp) {
        this.revokedTimestamp = revokedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the revoked state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the revoked state, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getRevokedTimestamp() {
        return this.revokedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the revoked state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param revokedTimestamp
     *        The time when the registration was in the revoked state, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withRevokedTimestamp(java.util.Date revokedTimestamp) {
        setRevokedTimestamp(revokedTimestamp);
        return this;
    }

    /**
     * <p>
     * The time when the registration was in the archived state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param archivedTimestamp
     *        The time when the registration was in the archived state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setArchivedTimestamp(java.util.Date archivedTimestamp) {
        this.archivedTimestamp = archivedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the archived state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the registration was in the archived state, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getArchivedTimestamp() {
        return this.archivedTimestamp;
    }

    /**
     * <p>
     * The time when the registration was in the archived state, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param archivedTimestamp
     *        The time when the registration was in the archived state, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegistrationVersionStatusHistory withArchivedTimestamp(java.util.Date archivedTimestamp) {
        setArchivedTimestamp(archivedTimestamp);
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
        if (getDraftTimestamp() != null)
            sb.append("DraftTimestamp: ").append(getDraftTimestamp()).append(",");
        if (getSubmittedTimestamp() != null)
            sb.append("SubmittedTimestamp: ").append(getSubmittedTimestamp()).append(",");
        if (getReviewingTimestamp() != null)
            sb.append("ReviewingTimestamp: ").append(getReviewingTimestamp()).append(",");
        if (getApprovedTimestamp() != null)
            sb.append("ApprovedTimestamp: ").append(getApprovedTimestamp()).append(",");
        if (getDiscardedTimestamp() != null)
            sb.append("DiscardedTimestamp: ").append(getDiscardedTimestamp()).append(",");
        if (getDeniedTimestamp() != null)
            sb.append("DeniedTimestamp: ").append(getDeniedTimestamp()).append(",");
        if (getRevokedTimestamp() != null)
            sb.append("RevokedTimestamp: ").append(getRevokedTimestamp()).append(",");
        if (getArchivedTimestamp() != null)
            sb.append("ArchivedTimestamp: ").append(getArchivedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegistrationVersionStatusHistory == false)
            return false;
        RegistrationVersionStatusHistory other = (RegistrationVersionStatusHistory) obj;
        if (other.getDraftTimestamp() == null ^ this.getDraftTimestamp() == null)
            return false;
        if (other.getDraftTimestamp() != null && other.getDraftTimestamp().equals(this.getDraftTimestamp()) == false)
            return false;
        if (other.getSubmittedTimestamp() == null ^ this.getSubmittedTimestamp() == null)
            return false;
        if (other.getSubmittedTimestamp() != null && other.getSubmittedTimestamp().equals(this.getSubmittedTimestamp()) == false)
            return false;
        if (other.getReviewingTimestamp() == null ^ this.getReviewingTimestamp() == null)
            return false;
        if (other.getReviewingTimestamp() != null && other.getReviewingTimestamp().equals(this.getReviewingTimestamp()) == false)
            return false;
        if (other.getApprovedTimestamp() == null ^ this.getApprovedTimestamp() == null)
            return false;
        if (other.getApprovedTimestamp() != null && other.getApprovedTimestamp().equals(this.getApprovedTimestamp()) == false)
            return false;
        if (other.getDiscardedTimestamp() == null ^ this.getDiscardedTimestamp() == null)
            return false;
        if (other.getDiscardedTimestamp() != null && other.getDiscardedTimestamp().equals(this.getDiscardedTimestamp()) == false)
            return false;
        if (other.getDeniedTimestamp() == null ^ this.getDeniedTimestamp() == null)
            return false;
        if (other.getDeniedTimestamp() != null && other.getDeniedTimestamp().equals(this.getDeniedTimestamp()) == false)
            return false;
        if (other.getRevokedTimestamp() == null ^ this.getRevokedTimestamp() == null)
            return false;
        if (other.getRevokedTimestamp() != null && other.getRevokedTimestamp().equals(this.getRevokedTimestamp()) == false)
            return false;
        if (other.getArchivedTimestamp() == null ^ this.getArchivedTimestamp() == null)
            return false;
        if (other.getArchivedTimestamp() != null && other.getArchivedTimestamp().equals(this.getArchivedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDraftTimestamp() == null) ? 0 : getDraftTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSubmittedTimestamp() == null) ? 0 : getSubmittedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getReviewingTimestamp() == null) ? 0 : getReviewingTimestamp().hashCode());
        hashCode = prime * hashCode + ((getApprovedTimestamp() == null) ? 0 : getApprovedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDiscardedTimestamp() == null) ? 0 : getDiscardedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDeniedTimestamp() == null) ? 0 : getDeniedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRevokedTimestamp() == null) ? 0 : getRevokedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getArchivedTimestamp() == null) ? 0 : getArchivedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public RegistrationVersionStatusHistory clone() {
        try {
            return (RegistrationVersionStatusHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.RegistrationVersionStatusHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
