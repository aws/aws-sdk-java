/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This action adds additional customer communication to an AWS Support case. You use the <i>CaseId</i> value to identify the case to which you want to
 * add communication. You can list a set of email addresses to copy on the communication using the <i>CcEmailAddresses</i> value. The
 * <i>CommunicationBody</i> value contains the text of the communication.
 * </p>
 * <p>
 * This action's response indicates the success or failure of the request.
 * </p>
 * <p>
 * This action implements a subset of the behavior on the AWS Support <a href="https://aws.amazon.com/support"> Your Support Cases </a> web form.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#addCommunicationToCase(AddCommunicationToCaseRequest)
 */
public class AddCommunicationToCaseRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * Represents the body of an email communication added to the support
     * case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String communicationBody;

    /**
     * Represents any email addresses contained in the CC line of an email
     * added to the support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ccEmailAddresses;

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public String getCaseId() {
        return caseId;
    }
    
    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @param caseId String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }
    
    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param caseId String that indicates the AWS Support caseID requested or returned in
     *         the call. The caseID is an alphanumeric string formatted as shown in
     *         this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddCommunicationToCaseRequest withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * Represents the body of an email communication added to the support
     * case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return Represents the body of an email communication added to the support
     *         case.
     */
    public String getCommunicationBody() {
        return communicationBody;
    }
    
    /**
     * Represents the body of an email communication added to the support
     * case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody Represents the body of an email communication added to the support
     *         case.
     */
    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }
    
    /**
     * Represents the body of an email communication added to the support
     * case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody Represents the body of an email communication added to the support
     *         case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddCommunicationToCaseRequest withCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
        return this;
    }

    /**
     * Represents any email addresses contained in the CC line of an email
     * added to the support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return Represents any email addresses contained in the CC line of an email
     *         added to the support case.
     */
    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
              ccEmailAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ccEmailAddresses.setAutoConstruct(true);
        }
        return ccEmailAddresses;
    }
    
    /**
     * Represents any email addresses contained in the CC line of an email
     * added to the support case.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses Represents any email addresses contained in the CC line of an email
     *         added to the support case.
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
     * Represents any email addresses contained in the CC line of an email
     * added to the support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses Represents any email addresses contained in the CC line of an email
     *         added to the support case.
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
     * Represents any email addresses contained in the CC line of an email
     * added to the support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses Represents any email addresses contained in the CC line of an email
     *         added to the support case.
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
        if (getCcEmailAddresses() != null) sb.append("CcEmailAddresses: " + getCcEmailAddresses() );
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
        return true;
    }
    
}
    