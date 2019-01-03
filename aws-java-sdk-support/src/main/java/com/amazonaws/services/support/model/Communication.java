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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A communication associated with an AWS Support case. The communication consists of the case ID, the message body,
 * attachment information, the account email address, and the date and time of the communication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/Communication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Communication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The email address of the account that submitted the AWS Support case.
     * </p>
     */
    private String submittedBy;
    /**
     * <p>
     * The time the communication was created.
     * </p>
     */
    private String timeCreated;
    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachmentDetails> attachmentSet;

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted
     *        as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @return The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string
     *         formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */

    public String getCaseId() {
        return this.caseId;
    }

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     * 
     * @param caseId
     *        The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted
     *        as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Communication withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * 
     * @param body
     *        The text of the communication between the customer and AWS Support.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * 
     * @return The text of the communication between the customer and AWS Support.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The text of the communication between the customer and AWS Support.
     * </p>
     * 
     * @param body
     *        The text of the communication between the customer and AWS Support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Communication withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The email address of the account that submitted the AWS Support case.
     * </p>
     * 
     * @param submittedBy
     *        The email address of the account that submitted the AWS Support case.
     */

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    /**
     * <p>
     * The email address of the account that submitted the AWS Support case.
     * </p>
     * 
     * @return The email address of the account that submitted the AWS Support case.
     */

    public String getSubmittedBy() {
        return this.submittedBy;
    }

    /**
     * <p>
     * The email address of the account that submitted the AWS Support case.
     * </p>
     * 
     * @param submittedBy
     *        The email address of the account that submitted the AWS Support case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Communication withSubmittedBy(String submittedBy) {
        setSubmittedBy(submittedBy);
        return this;
    }

    /**
     * <p>
     * The time the communication was created.
     * </p>
     * 
     * @param timeCreated
     *        The time the communication was created.
     */

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * The time the communication was created.
     * </p>
     * 
     * @return The time the communication was created.
     */

    public String getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * <p>
     * The time the communication was created.
     * </p>
     * 
     * @param timeCreated
     *        The time the communication was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Communication withTimeCreated(String timeCreated) {
        setTimeCreated(timeCreated);
        return this;
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     * 
     * @return Information about the attachments to the case communication.
     */

    public java.util.List<AttachmentDetails> getAttachmentSet() {
        if (attachmentSet == null) {
            attachmentSet = new com.amazonaws.internal.SdkInternalList<AttachmentDetails>();
        }
        return attachmentSet;
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     * 
     * @param attachmentSet
     *        Information about the attachments to the case communication.
     */

    public void setAttachmentSet(java.util.Collection<AttachmentDetails> attachmentSet) {
        if (attachmentSet == null) {
            this.attachmentSet = null;
            return;
        }

        this.attachmentSet = new com.amazonaws.internal.SdkInternalList<AttachmentDetails>(attachmentSet);
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachmentSet(java.util.Collection)} or {@link #withAttachmentSet(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attachmentSet
     *        Information about the attachments to the case communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Communication withAttachmentSet(AttachmentDetails... attachmentSet) {
        if (this.attachmentSet == null) {
            setAttachmentSet(new com.amazonaws.internal.SdkInternalList<AttachmentDetails>(attachmentSet.length));
        }
        for (AttachmentDetails ele : attachmentSet) {
            this.attachmentSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the attachments to the case communication.
     * </p>
     * 
     * @param attachmentSet
     *        Information about the attachments to the case communication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Communication withAttachmentSet(java.util.Collection<AttachmentDetails> attachmentSet) {
        setAttachmentSet(attachmentSet);
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
        if (getCaseId() != null)
            sb.append("CaseId: ").append(getCaseId()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getSubmittedBy() != null)
            sb.append("SubmittedBy: ").append(getSubmittedBy()).append(",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: ").append(getTimeCreated()).append(",");
        if (getAttachmentSet() != null)
            sb.append("AttachmentSet: ").append(getAttachmentSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Communication == false)
            return false;
        Communication other = (Communication) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getSubmittedBy() == null ^ this.getSubmittedBy() == null)
            return false;
        if (other.getSubmittedBy() != null && other.getSubmittedBy().equals(this.getSubmittedBy()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getAttachmentSet() == null ^ this.getAttachmentSet() == null)
            return false;
        if (other.getAttachmentSet() != null && other.getAttachmentSet().equals(this.getAttachmentSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getSubmittedBy() == null) ? 0 : getSubmittedBy().hashCode());
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode + ((getAttachmentSet() == null) ? 0 : getAttachmentSet().hashCode());
        return hashCode;
    }

    @Override
    public Communication clone() {
        try {
            return (Communication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.CommunicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
