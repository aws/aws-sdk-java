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
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#createCase(CreateCaseRequest) CreateCase operation}.
 * <p>
 * Creates a new case in the AWS Support Center. This operation is
 * modeled on the behavior of the AWS Support Center
 * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
 * page. Its parameters require you to specify the following
 * information:
 * </p>
 * <ol> <li> <b>IssueType.</b> The type of issue for the case. You can
 * specify either "customer-service" or "technical." If you do not
 * indicate a value, the default is "technical." </li>
 * <li> <b>ServiceCode.</b> The code for an AWS service. You obtain the
 * <code>ServiceCode</code> by calling DescribeServices. </li>
 * <li> <b>CategoryCode.</b> The category for the service defined for
 * the <code>ServiceCode</code> value. You also obtain the category code
 * for a service by calling DescribeServices. Each AWS service defines
 * its own set of category codes. </li>
 * <li> <b>SeverityCode.</b> A value that indicates the urgency of the
 * case, which in turn determines the response time according to your
 * service level agreement with AWS Support. You obtain the SeverityCode
 * by calling DescribeSeverityLevels.</li>
 * <li> <b>Subject.</b> The <b>Subject</b> field on the AWS Support
 * Center
 * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
 * page.</li>
 * <li> <b>CommunicationBody.</b> The <b>Description</b> field on the
 * AWS Support Center
 * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a>
 * page.</li>
 * <li> <b>AttachmentSetId.</b> The ID of a set of attachments that has
 * been created by using AddAttachmentsToSet.</li>
 * <li> <b>Language.</b> The human language in which AWS Support handles
 * the case. English and Japanese are currently supported.</li>
 * <li> <b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field
 * on the
 * <a href="https://console.aws.amazon.com/support/home#/case/create"> Create Case </a> page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an <a href="http://aws.amazon.com/tools/"> AWS SDK </a>
 * . </li>
 * </ol> <p>
 * <b>NOTE:</b> To add additional communication or attachments to an
 * existing case, use AddCommunicationToCase.
 * </p>
 * <p>
 * A successful CreateCase request returns an AWS Support case number.
 * Case numbers are used by the DescribeCases operation to retrieve
 * existing AWS Support cases.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#createCase(CreateCaseRequest)
 */
public class CreateCaseRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The title of the AWS Support case.
     */
    private String subject;

    /**
     * The code for the AWS service returned by the call to
     * <a>DescribeServices</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     */
    private String serviceCode;

    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     * levels depends on each customer's support subscription. In other
     * words, your subscription may not necessarily require the urgent level
     * of response time.</note>
     */
    private String severityCode;

    /**
     * The category of problem for the AWS Support case.
     */
    private String categoryCode;

    /**
     * The communication body text when you create an AWS Support case by
     * calling <a>CreateCase</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String communicationBody;

    /**
     * A list of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ccEmailAddresses;

    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     */
    private String language;

    /**
     * The type of issue for the case. You can specify either
     * "customer-service" or "technical." If you do not indicate a value, the
     * default is "technical."
     */
    private String issueType;

    /**
     * The ID of a set of one or more attachments for the case. Create the
     * set by using <a>AddAttachmentsToSet</a>.
     */
    private String attachmentSetId;

    /**
     * The title of the AWS Support case.
     *
     * @return The title of the AWS Support case.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * The title of the AWS Support case.
     *
     * @param subject The title of the AWS Support case.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * The title of the AWS Support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject The title of the AWS Support case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * The code for the AWS service returned by the call to
     * <a>DescribeServices</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     *
     * @return The code for the AWS service returned by the call to
     *         <a>DescribeServices</a>.
     */
    public String getServiceCode() {
        return serviceCode;
    }
    
    /**
     * The code for the AWS service returned by the call to
     * <a>DescribeServices</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     *
     * @param serviceCode The code for the AWS service returned by the call to
     *         <a>DescribeServices</a>.
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    
    /**
     * The code for the AWS service returned by the call to
     * <a>DescribeServices</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     *
     * @param serviceCode The code for the AWS service returned by the call to
     *         <a>DescribeServices</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     * levels depends on each customer's support subscription. In other
     * words, your subscription may not necessarily require the urgent level
     * of response time.</note>
     *
     * @return The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     *         levels depends on each customer's support subscription. In other
     *         words, your subscription may not necessarily require the urgent level
     *         of response time.</note>
     */
    public String getSeverityCode() {
        return severityCode;
    }
    
    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     * levels depends on each customer's support subscription. In other
     * words, your subscription may not necessarily require the urgent level
     * of response time.</note>
     *
     * @param severityCode The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     *         levels depends on each customer's support subscription. In other
     *         words, your subscription may not necessarily require the urgent level
     *         of response time.</note>
     */
    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }
    
    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     * levels depends on each customer's support subscription. In other
     * words, your subscription may not necessarily require the urgent level
     * of response time.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severityCode The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>. <note><p>The availability of severity
     *         levels depends on each customer's support subscription. In other
     *         words, your subscription may not necessarily require the urgent level
     *         of response time.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withSeverityCode(String severityCode) {
        this.severityCode = severityCode;
        return this;
    }

    /**
     * The category of problem for the AWS Support case.
     *
     * @return The category of problem for the AWS Support case.
     */
    public String getCategoryCode() {
        return categoryCode;
    }
    
    /**
     * The category of problem for the AWS Support case.
     *
     * @param categoryCode The category of problem for the AWS Support case.
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
    
    /**
     * The category of problem for the AWS Support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categoryCode The category of problem for the AWS Support case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * The communication body text when you create an AWS Support case by
     * calling <a>CreateCase</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return The communication body text when you create an AWS Support case by
     *         calling <a>CreateCase</a>.
     */
    public String getCommunicationBody() {
        return communicationBody;
    }
    
    /**
     * The communication body text when you create an AWS Support case by
     * calling <a>CreateCase</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody The communication body text when you create an AWS Support case by
     *         calling <a>CreateCase</a>.
     */
    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }
    
    /**
     * The communication body text when you create an AWS Support case by
     * calling <a>CreateCase</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody The communication body text when you create an AWS Support case by
     *         calling <a>CreateCase</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
        return this;
    }

    /**
     * A list of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of email addresses that AWS Support copies on case
     *         correspondence.
     */
    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
              ccEmailAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ccEmailAddresses.setAutoConstruct(true);
        }
        return ccEmailAddresses;
    }
    
    /**
     * A list of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses A list of email addresses that AWS Support copies on case
     *         correspondence.
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
     * A list of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses A list of email addresses that AWS Support copies on case
     *         correspondence.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withCcEmailAddresses(String... ccEmailAddresses) {
        if (getCcEmailAddresses() == null) setCcEmailAddresses(new java.util.ArrayList<String>(ccEmailAddresses.length));
        for (String value : ccEmailAddresses) {
            getCcEmailAddresses().add(value);
        }
        return this;
    }
    
    /**
     * A list of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses A list of email addresses that AWS Support copies on case
     *         correspondence.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
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
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     *
     * @return The ISO 639-1 code for the language in which AWS provides support. AWS
     *         Support currently supports English ("en") and Japanese ("ja").
     *         Language parameters must be passed explicitly for operations that take
     *         them.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     *
     * @param language The ISO 639-1 code for the language in which AWS provides support. AWS
     *         Support currently supports English ("en") and Japanese ("ja").
     *         Language parameters must be passed explicitly for operations that take
     *         them.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * The ISO 639-1 code for the language in which AWS provides support. AWS
     * Support currently supports English ("en") and Japanese ("ja").
     * Language parameters must be passed explicitly for operations that take
     * them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param language The ISO 639-1 code for the language in which AWS provides support. AWS
     *         Support currently supports English ("en") and Japanese ("ja").
     *         Language parameters must be passed explicitly for operations that take
     *         them.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * The type of issue for the case. You can specify either
     * "customer-service" or "technical." If you do not indicate a value, the
     * default is "technical."
     *
     * @return The type of issue for the case. You can specify either
     *         "customer-service" or "technical." If you do not indicate a value, the
     *         default is "technical."
     */
    public String getIssueType() {
        return issueType;
    }
    
    /**
     * The type of issue for the case. You can specify either
     * "customer-service" or "technical." If you do not indicate a value, the
     * default is "technical."
     *
     * @param issueType The type of issue for the case. You can specify either
     *         "customer-service" or "technical." If you do not indicate a value, the
     *         default is "technical."
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    /**
     * The type of issue for the case. You can specify either
     * "customer-service" or "technical." If you do not indicate a value, the
     * default is "technical."
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param issueType The type of issue for the case. You can specify either
     *         "customer-service" or "technical." If you do not indicate a value, the
     *         default is "technical."
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withIssueType(String issueType) {
        this.issueType = issueType;
        return this;
    }

    /**
     * The ID of a set of one or more attachments for the case. Create the
     * set by using <a>AddAttachmentsToSet</a>.
     *
     * @return The ID of a set of one or more attachments for the case. Create the
     *         set by using <a>AddAttachmentsToSet</a>.
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }
    
    /**
     * The ID of a set of one or more attachments for the case. Create the
     * set by using <a>AddAttachmentsToSet</a>.
     *
     * @param attachmentSetId The ID of a set of one or more attachments for the case. Create the
     *         set by using <a>AddAttachmentsToSet</a>.
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }
    
    /**
     * The ID of a set of one or more attachments for the case. Create the
     * set by using <a>AddAttachmentsToSet</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentSetId The ID of a set of one or more attachments for the case. Create the
     *         set by using <a>AddAttachmentsToSet</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateCaseRequest withAttachmentSetId(String attachmentSetId) {
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
        if (getSubject() != null) sb.append("Subject: " + getSubject() + ",");
        if (getServiceCode() != null) sb.append("ServiceCode: " + getServiceCode() + ",");
        if (getSeverityCode() != null) sb.append("SeverityCode: " + getSeverityCode() + ",");
        if (getCategoryCode() != null) sb.append("CategoryCode: " + getCategoryCode() + ",");
        if (getCommunicationBody() != null) sb.append("CommunicationBody: " + getCommunicationBody() + ",");
        if (getCcEmailAddresses() != null) sb.append("CcEmailAddresses: " + getCcEmailAddresses() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() + ",");
        if (getIssueType() != null) sb.append("IssueType: " + getIssueType() + ",");
        if (getAttachmentSetId() != null) sb.append("AttachmentSetId: " + getAttachmentSetId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode()); 
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode()); 
        hashCode = prime * hashCode + ((getSeverityCode() == null) ? 0 : getSeverityCode().hashCode()); 
        hashCode = prime * hashCode + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode()); 
        hashCode = prime * hashCode + ((getCommunicationBody() == null) ? 0 : getCommunicationBody().hashCode()); 
        hashCode = prime * hashCode + ((getCcEmailAddresses() == null) ? 0 : getCcEmailAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        hashCode = prime * hashCode + ((getIssueType() == null) ? 0 : getIssueType().hashCode()); 
        hashCode = prime * hashCode + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateCaseRequest == false) return false;
        CreateCaseRequest other = (CreateCaseRequest)obj;
        
        if (other.getSubject() == null ^ this.getSubject() == null) return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false) return false; 
        if (other.getServiceCode() == null ^ this.getServiceCode() == null) return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false) return false; 
        if (other.getSeverityCode() == null ^ this.getSeverityCode() == null) return false;
        if (other.getSeverityCode() != null && other.getSeverityCode().equals(this.getSeverityCode()) == false) return false; 
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null) return false;
        if (other.getCategoryCode() != null && other.getCategoryCode().equals(this.getCategoryCode()) == false) return false; 
        if (other.getCommunicationBody() == null ^ this.getCommunicationBody() == null) return false;
        if (other.getCommunicationBody() != null && other.getCommunicationBody().equals(this.getCommunicationBody()) == false) return false; 
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null) return false;
        if (other.getCcEmailAddresses() != null && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        if (other.getIssueType() == null ^ this.getIssueType() == null) return false;
        if (other.getIssueType() != null && other.getIssueType().equals(this.getIssueType()) == false) return false; 
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null) return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false) return false; 
        return true;
    }
    
}
    