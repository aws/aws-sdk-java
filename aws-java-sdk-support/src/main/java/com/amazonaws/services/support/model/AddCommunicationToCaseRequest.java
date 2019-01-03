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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * To be written.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddCommunicationToCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddCommunicationToCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     */
    private String communicationBody;
    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support case.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ccEmailAddresses;
    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling
     * <a>AddAttachmentsToSet</a>
     * </p>
     */
    private String attachmentSetId;

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

    public AddCommunicationToCaseRequest withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     * 
     * @param communicationBody
     *        The body of an email communication to add to the support case.
     */

    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }

    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     * 
     * @return The body of an email communication to add to the support case.
     */

    public String getCommunicationBody() {
        return this.communicationBody;
    }

    /**
     * <p>
     * The body of an email communication to add to the support case.
     * </p>
     * 
     * @param communicationBody
     *        The body of an email communication to add to the support case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCommunicationToCaseRequest withCommunicationBody(String communicationBody) {
        setCommunicationBody(communicationBody);
        return this;
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support case.
     * </p>
     * 
     * @return The email addresses in the CC line of an email to be added to the support case.
     */

    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
            ccEmailAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ccEmailAddresses;
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support case.
     * </p>
     * 
     * @param ccEmailAddresses
     *        The email addresses in the CC line of an email to be added to the support case.
     */

    public void setCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        if (ccEmailAddresses == null) {
            this.ccEmailAddresses = null;
            return;
        }

        this.ccEmailAddresses = new com.amazonaws.internal.SdkInternalList<String>(ccEmailAddresses);
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCcEmailAddresses(java.util.Collection)} or {@link #withCcEmailAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ccEmailAddresses
     *        The email addresses in the CC line of an email to be added to the support case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCommunicationToCaseRequest withCcEmailAddresses(String... ccEmailAddresses) {
        if (this.ccEmailAddresses == null) {
            setCcEmailAddresses(new com.amazonaws.internal.SdkInternalList<String>(ccEmailAddresses.length));
        }
        for (String ele : ccEmailAddresses) {
            this.ccEmailAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The email addresses in the CC line of an email to be added to the support case.
     * </p>
     * 
     * @param ccEmailAddresses
     *        The email addresses in the CC line of an email to be added to the support case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCommunicationToCaseRequest withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        setCcEmailAddresses(ccEmailAddresses);
        return this;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling
     * <a>AddAttachmentsToSet</a>
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of a set of one or more attachments for the communication to add to the case. Create the set by
     *        calling <a>AddAttachmentsToSet</a>
     */

    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling
     * <a>AddAttachmentsToSet</a>
     * </p>
     * 
     * @return The ID of a set of one or more attachments for the communication to add to the case. Create the set by
     *         calling <a>AddAttachmentsToSet</a>
     */

    public String getAttachmentSetId() {
        return this.attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the communication to add to the case. Create the set by calling
     * <a>AddAttachmentsToSet</a>
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of a set of one or more attachments for the communication to add to the case. Create the set by
     *        calling <a>AddAttachmentsToSet</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddCommunicationToCaseRequest withAttachmentSetId(String attachmentSetId) {
        setAttachmentSetId(attachmentSetId);
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
        if (getCommunicationBody() != null)
            sb.append("CommunicationBody: ").append(getCommunicationBody()).append(",");
        if (getCcEmailAddresses() != null)
            sb.append("CcEmailAddresses: ").append(getCcEmailAddresses()).append(",");
        if (getAttachmentSetId() != null)
            sb.append("AttachmentSetId: ").append(getAttachmentSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddCommunicationToCaseRequest == false)
            return false;
        AddCommunicationToCaseRequest other = (AddCommunicationToCaseRequest) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getCommunicationBody() == null ^ this.getCommunicationBody() == null)
            return false;
        if (other.getCommunicationBody() != null && other.getCommunicationBody().equals(this.getCommunicationBody()) == false)
            return false;
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null)
            return false;
        if (other.getCcEmailAddresses() != null && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false)
            return false;
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        hashCode = prime * hashCode + ((getCommunicationBody() == null) ? 0 : getCommunicationBody().hashCode());
        hashCode = prime * hashCode + ((getCcEmailAddresses() == null) ? 0 : getCcEmailAddresses().hashCode());
        hashCode = prime * hashCode + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode());
        return hashCode;
    }

    @Override
    public AddCommunicationToCaseRequest clone() {
        return (AddCommunicationToCaseRequest) super.clone();
    }

}
