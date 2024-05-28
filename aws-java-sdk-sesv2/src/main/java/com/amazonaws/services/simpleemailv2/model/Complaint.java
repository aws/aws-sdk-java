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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a <code>Complaint</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/Complaint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Complaint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     * <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it was on
     * the account-level suppression list.
     * </p>
     */
    private String complaintSubType;
    /**
     * <p>
     * The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     * </p>
     */
    private String complaintFeedbackType;

    /**
     * <p>
     * Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     * <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it was on
     * the account-level suppression list.
     * </p>
     * 
     * @param complaintSubType
     *        Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     *        <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it
     *        was on the account-level suppression list.
     */

    public void setComplaintSubType(String complaintSubType) {
        this.complaintSubType = complaintSubType;
    }

    /**
     * <p>
     * Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     * <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it was on
     * the account-level suppression list.
     * </p>
     * 
     * @return Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     *         <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it
     *         was on the account-level suppression list.
     */

    public String getComplaintSubType() {
        return this.complaintSubType;
    }

    /**
     * <p>
     * Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     * <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it was on
     * the account-level suppression list.
     * </p>
     * 
     * @param complaintSubType
     *        Can either be <code>null</code> or <code>OnAccountSuppressionList</code>. If the value is
     *        <code>OnAccountSuppressionList</code>, SES accepted the message, but didn't attempt to send it because it
     *        was on the account-level suppression list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Complaint withComplaintSubType(String complaintSubType) {
        setComplaintSubType(complaintSubType);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     * </p>
     * 
     * @param complaintFeedbackType
     *        The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     */

    public void setComplaintFeedbackType(String complaintFeedbackType) {
        this.complaintFeedbackType = complaintFeedbackType;
    }

    /**
     * <p>
     * The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     * </p>
     * 
     * @return The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     */

    public String getComplaintFeedbackType() {
        return this.complaintFeedbackType;
    }

    /**
     * <p>
     * The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     * </p>
     * 
     * @param complaintFeedbackType
     *        The value of the <code>Feedback-Type</code> field from the feedback report received from the ISP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Complaint withComplaintFeedbackType(String complaintFeedbackType) {
        setComplaintFeedbackType(complaintFeedbackType);
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
        if (getComplaintSubType() != null)
            sb.append("ComplaintSubType: ").append(getComplaintSubType()).append(",");
        if (getComplaintFeedbackType() != null)
            sb.append("ComplaintFeedbackType: ").append(getComplaintFeedbackType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Complaint == false)
            return false;
        Complaint other = (Complaint) obj;
        if (other.getComplaintSubType() == null ^ this.getComplaintSubType() == null)
            return false;
        if (other.getComplaintSubType() != null && other.getComplaintSubType().equals(this.getComplaintSubType()) == false)
            return false;
        if (other.getComplaintFeedbackType() == null ^ this.getComplaintFeedbackType() == null)
            return false;
        if (other.getComplaintFeedbackType() != null && other.getComplaintFeedbackType().equals(this.getComplaintFeedbackType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplaintSubType() == null) ? 0 : getComplaintSubType().hashCode());
        hashCode = prime * hashCode + ((getComplaintFeedbackType() == null) ? 0 : getComplaintFeedbackType().hashCode());
        return hashCode;
    }

    @Override
    public Complaint clone() {
        try {
            return (Complaint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ComplaintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
