/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#addCommunicationToCase(AddCommunicationToCaseRequest) AddCommunicationToCase operation}.
 * <p>
 * Adds additional customer communication to an AWS Support case. You use
 * the <code>CaseId</code> value to identify the case to add
 * communication to. You can list a set of email addresses to copy on the
 * communication using the <code>CcEmailAddresses</code> value. The
 * <code>CommunicationBody</code> value contains the text of the
 * communication.
 * </p>
 * <p>
 * The response indicates the success or failure of the request.
 * </p>
 * <p>
 * This operation implements a subset of the behavior on the AWS Support
 * <a href="https://aws.amazon.com/support"> Your Support Cases </a>
 * web form.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#addCommunicationToCase(AddCommunicationToCaseRequest)
 */
public class AddCommunicationToCaseRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The AWS Support case ID requested or returned in the call. The case ID
     * is an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * The body of an email communication to add to the support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String communicationBody;

    /**
     * The email addresses in the CC line of an email to be added to the
     * support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ccEmailAddresses;

    private String attachmentSetId;

    /**
     * The AWS Support case ID requested or returned in the call. The case ID
     * is an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return The AWS Support case ID requested or returned in the call. The case ID
     *         is an alphanumeric string formatted as shown in this example:
     *         case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public String getCaseId() {
        return caseId;
    }
    
    /**
     * The AWS Support case ID requested or returned in the call. The case ID
     * is an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @param caseId The AWS Support case ID requested or returned in the call. The case ID
     *         is an alphanumeric string formatted as shown in this example:
     *         case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    
    /**
     * The AWS Support case ID requested or returned in the call. The case ID
     * is an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param caseId The AWS Support case ID requested or returned in the call. The case ID
     *         is an alphanumeric string formatted as shown in this example:
     *         case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCommunicationToCaseRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * The body of an email communication to add to the support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return The body of an email communication to add to the support case.
     */
    public String getCommunicationBody() {
        return communicationBody;
    }
    
    /**
     * The body of an email communication to add to the support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody The body of an email communication to add to the support case.
     */
    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }
    
    /**
     * The body of an email communication to add to the support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody The body of an email communication to add to the support case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCommunicationToCaseRequest withCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
        return this;
    }

    /**
     * The email addresses in the CC line of an email to be added to the
     * support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return The email addresses in the CC line of an email to be added to the
     *         support case.
     */
    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
              ccEmailAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ccEmailAddresses.setAutoConstruct(true);
        }
        return ccEmailAddresses;
    }
    
    /**
     * The email addresses in the CC line of an email to be added to the
     * support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses The email addresses in the CC line of an email to be added to the
     *         support case.
     */
    public void setCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        if (ccEmailAddresses == null) {
            this.ccEmailAddresses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ccEmailAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ccEmailAddresses.size());
        ccEmailAddressesCopy.addAll(ccEmailAddresses);
        this.ccEmailAddresses = ccEmailAddressesCopy;
    }
    
    /**
     * The email addresses in the CC line of an email to be added to the
     * support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses The email addresses in the CC line of an email to be added to the
     *         support case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCommunicationToCaseRequest withCcEmailAddresses(String... ccEmailAddresses) {
        if (getCcEmailAddresses() == null) setCcEmailAddresses(new java.util.ArrayList<String>(ccEmailAddresses.length));
        for (String value : ccEmailAddresses) {
            getCcEmailAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The email addresses in the CC line of an email to be added to the
     * support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses The email addresses in the CC line of an email to be added to the
     *         support case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCommunicationToCaseRequest withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        if (ccEmailAddresses == null) {
            this.ccEmailAddresses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ccEmailAddressesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ccEmailAddresses.size());
            ccEmailAddressesCopy.addAll(ccEmailAddresses);
            this.ccEmailAddresses = ccEmailAddressesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the AttachmentSetId property for this object.
     *
     * @return The value of the AttachmentSetId property for this object.
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }
    
    /**
     * Sets the value of the AttachmentSetId property for this object.
     *
     * @param attachmentSetId The new value for the AttachmentSetId property for this object.
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }
    
    /**
     * Sets the value of the AttachmentSetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentSetId The new value for the AttachmentSetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddCommunicationToCaseRequest withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCaseId() != null) sb.append("CaseId: " + getCaseId() + ",");
        if (getCommunicationBody() != null) sb.append("CommunicationBody: " + getCommunicationBody() + ",");
        if (getCcEmailAddresses() != null) sb.append("CcEmailAddresses: " + getCcEmailAddresses() + ",");
        if (getAttachmentSetId() != null) sb.append("AttachmentSetId: " + getAttachmentSetId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddCommunicationToCaseRequest == false) return false;
        AddCommunicationToCaseRequest other = (AddCommunicationToCaseRequest)obj;
        
        if (other.getCaseId() == null ^ this.getCaseId() == null) return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false) return false; 
        if (other.getCommunicationBody() == null ^ this.getCommunicationBody() == null) return false;
        if (other.getCommunicationBody() != null && other.getCommunicationBody().equals(this.getCommunicationBody()) == false) return false; 
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null) return false;
        if (other.getCcEmailAddresses() != null && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false) return false; 
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null) return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false) return false; 
        return true;
    }
    
}
    