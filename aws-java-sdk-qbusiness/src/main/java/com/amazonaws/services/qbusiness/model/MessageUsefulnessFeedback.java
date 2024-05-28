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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * End user feedback on an AI-generated web experience chat message usefulness.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/MessageUsefulnessFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageUsefulnessFeedback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The usefulness value assigned by an end user to a message.
     * </p>
     */
    private String usefulness;
    /**
     * <p>
     * The reason for a usefulness rating.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A comment given by an end user on the usefulness of an AI-generated chat message.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The timestamp for when the feedback was submitted.
     * </p>
     */
    private java.util.Date submittedAt;

    /**
     * <p>
     * The usefulness value assigned by an end user to a message.
     * </p>
     * 
     * @param usefulness
     *        The usefulness value assigned by an end user to a message.
     * @see MessageUsefulness
     */

    public void setUsefulness(String usefulness) {
        this.usefulness = usefulness;
    }

    /**
     * <p>
     * The usefulness value assigned by an end user to a message.
     * </p>
     * 
     * @return The usefulness value assigned by an end user to a message.
     * @see MessageUsefulness
     */

    public String getUsefulness() {
        return this.usefulness;
    }

    /**
     * <p>
     * The usefulness value assigned by an end user to a message.
     * </p>
     * 
     * @param usefulness
     *        The usefulness value assigned by an end user to a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageUsefulness
     */

    public MessageUsefulnessFeedback withUsefulness(String usefulness) {
        setUsefulness(usefulness);
        return this;
    }

    /**
     * <p>
     * The usefulness value assigned by an end user to a message.
     * </p>
     * 
     * @param usefulness
     *        The usefulness value assigned by an end user to a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageUsefulness
     */

    public MessageUsefulnessFeedback withUsefulness(MessageUsefulness usefulness) {
        this.usefulness = usefulness.toString();
        return this;
    }

    /**
     * <p>
     * The reason for a usefulness rating.
     * </p>
     * 
     * @param reason
     *        The reason for a usefulness rating.
     * @see MessageUsefulnessReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for a usefulness rating.
     * </p>
     * 
     * @return The reason for a usefulness rating.
     * @see MessageUsefulnessReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for a usefulness rating.
     * </p>
     * 
     * @param reason
     *        The reason for a usefulness rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageUsefulnessReason
     */

    public MessageUsefulnessFeedback withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The reason for a usefulness rating.
     * </p>
     * 
     * @param reason
     *        The reason for a usefulness rating.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageUsefulnessReason
     */

    public MessageUsefulnessFeedback withReason(MessageUsefulnessReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * <p>
     * A comment given by an end user on the usefulness of an AI-generated chat message.
     * </p>
     * 
     * @param comment
     *        A comment given by an end user on the usefulness of an AI-generated chat message.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * A comment given by an end user on the usefulness of an AI-generated chat message.
     * </p>
     * 
     * @return A comment given by an end user on the usefulness of an AI-generated chat message.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * A comment given by an end user on the usefulness of an AI-generated chat message.
     * </p>
     * 
     * @param comment
     *        A comment given by an end user on the usefulness of an AI-generated chat message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageUsefulnessFeedback withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the feedback was submitted.
     * </p>
     * 
     * @param submittedAt
     *        The timestamp for when the feedback was submitted.
     */

    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    /**
     * <p>
     * The timestamp for when the feedback was submitted.
     * </p>
     * 
     * @return The timestamp for when the feedback was submitted.
     */

    public java.util.Date getSubmittedAt() {
        return this.submittedAt;
    }

    /**
     * <p>
     * The timestamp for when the feedback was submitted.
     * </p>
     * 
     * @param submittedAt
     *        The timestamp for when the feedback was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageUsefulnessFeedback withSubmittedAt(java.util.Date submittedAt) {
        setSubmittedAt(submittedAt);
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
        if (getUsefulness() != null)
            sb.append("Usefulness: ").append(getUsefulness()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getSubmittedAt() != null)
            sb.append("SubmittedAt: ").append(getSubmittedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageUsefulnessFeedback == false)
            return false;
        MessageUsefulnessFeedback other = (MessageUsefulnessFeedback) obj;
        if (other.getUsefulness() == null ^ this.getUsefulness() == null)
            return false;
        if (other.getUsefulness() != null && other.getUsefulness().equals(this.getUsefulness()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getSubmittedAt() == null ^ this.getSubmittedAt() == null)
            return false;
        if (other.getSubmittedAt() != null && other.getSubmittedAt().equals(this.getSubmittedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsefulness() == null) ? 0 : getUsefulness().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getSubmittedAt() == null) ? 0 : getSubmittedAt().hashCode());
        return hashCode;
    }

    @Override
    public MessageUsefulnessFeedback clone() {
        try {
            return (MessageUsefulnessFeedback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.MessageUsefulnessFeedbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
