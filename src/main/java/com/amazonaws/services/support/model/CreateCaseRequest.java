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
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#createCase(CreateCaseRequest) CreateCase operation}.
 * <p>
 * Creates a new case in the AWS Support Center. This action is modeled on the behavior of the AWS Support Center <a
 * href="https://aws.amazon.com/support/createCase"> Open a new case </a> page. Its parameters require you to specify the following information:
 * </p>
 * <ol> <li> <b>ServiceCode.</b> Represents a code for an AWS service. You obtain the <i>ServiceCode</i> by calling <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> . </li>
 * <li> <b>CategoryCode</b> . Represents a category for the service defined for the ServiceCode value. You also obtain the cateogory code for a service
 * by calling <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> . Each AWS service
 * defines its own set of category codes. </li>
 * <li> <b>SeverityCode</b> . Represents a value that specifies the urgency of the case, and the time interval in which your service level agreement
 * specifies a response from AWS Support. You obtain the SeverityCode by calling <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"> DescribeSeverityLevels </a> .</li>
 * <li> <b>Subject</b> . Represents the <b>Subject</b> field on the AWS Support Center <a href="https://aws.amazon.com/support/createCase"> Open a new
 * case </a> page.</li>
 * <li> <b>CommunicationBody</b> . Represents the <b>Description</b> field on the AWS Support Center <a
 * href="https://aws.amazon.com/support/createCase"> Open a new case </a> page.</li>
 * <li> <b>Language</b> . Specifies the human language in which AWS Support handles the case. The API currently supports English and Japanese.</li>
 * <li> <b>CcEmailAddresses</b> . Represents the AWS Support Center <b>CC</b> field on the <a href="https://aws.amazon.com/support/createCase"> Open a
 * new case </a> page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already
 * identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by
 * an <a href="http://aws.amazon.com/tools/"> AWS SDK </a> . </li>
 * <li> <b>IssueType</b> . Indicates the type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a
 * value, this parameter defaults to "technical." </li>
 * </ol> <p>
 * <b>NOTE:</b>The AWS Support API does not currently support the ability to add attachments to cases. You can, however, call AddCommunicationToCase to
 * add information to an open case.
 * </p>
 * <p>
 * A successful <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"> CreateCase </a> request returns an AWS Support
 * case number. Case numbers are used by <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"> DescribeCases </a>
 * request to retrieve existing AWS Support support cases.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#createCase(CreateCaseRequest)
 */
public class CreateCaseRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Title of the AWS Support case.
     */
    private String subject;

    /**
     * Code for the AWS service returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     */
    private String serviceCode;

    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     * availability of severity levels depends on each customer's support
     * subscription. In other words, your subscription may not necessarily
     * require the urgent level of response time.</note>
     */
    private String severityCode;

    /**
     * Specifies the category of problem for the AWS Support case.
     */
    private String categoryCode;

    /**
     * Parameter that represents the communication body text when you create
     * an AWS Support case by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String communicationBody;

    /**
     * List of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ccEmailAddresses;

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     */
    private String language;

    /**
     * Field passed as a parameter in a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a> call.
     */
    private String issueType;

    /**
     * Title of the AWS Support case.
     *
     * @return Title of the AWS Support case.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Title of the AWS Support case.
     *
     * @param subject Title of the AWS Support case.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * Title of the AWS Support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject Title of the AWS Support case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Code for the AWS service returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     *
     * @return Code for the AWS service returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a>.
     */
    public String getServiceCode() {
        return serviceCode;
    }
    
    /**
     * Code for the AWS service returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     *
     * @param serviceCode Code for the AWS service returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a>.
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    
    /**
     * Code for the AWS service returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9a-z\-_]+<br/>
     *
     * @param serviceCode Code for the AWS service returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     * availability of severity levels depends on each customer's support
     * subscription. In other words, your subscription may not necessarily
     * require the urgent level of response time.</note>
     *
     * @return Code for the severity level returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     *         title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     *         availability of severity levels depends on each customer's support
     *         subscription. In other words, your subscription may not necessarily
     *         require the urgent level of response time.</note>
     */
    public String getSeverityCode() {
        return severityCode;
    }
    
    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     * availability of severity levels depends on each customer's support
     * subscription. In other words, your subscription may not necessarily
     * require the urgent level of response time.</note>
     *
     * @param severityCode Code for the severity level returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     *         title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     *         availability of severity levels depends on each customer's support
     *         subscription. In other words, your subscription may not necessarily
     *         require the urgent level of response time.</note>
     */
    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }
    
    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     * availability of severity levels depends on each customer's support
     * subscription. In other words, your subscription may not necessarily
     * require the urgent level of response time.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severityCode Code for the severity level returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     *         title="DescribeSeverityLevels">DescribeSeverityLevels</a>. <note>The
     *         availability of severity levels depends on each customer's support
     *         subscription. In other words, your subscription may not necessarily
     *         require the urgent level of response time.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withSeverityCode(String severityCode) {
        this.severityCode = severityCode;
        return this;
    }

    /**
     * Specifies the category of problem for the AWS Support case.
     *
     * @return Specifies the category of problem for the AWS Support case.
     */
    public String getCategoryCode() {
        return categoryCode;
    }
    
    /**
     * Specifies the category of problem for the AWS Support case.
     *
     * @param categoryCode Specifies the category of problem for the AWS Support case.
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
    
    /**
     * Specifies the category of problem for the AWS Support case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categoryCode Specifies the category of problem for the AWS Support case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * Parameter that represents the communication body text when you create
     * an AWS Support case by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return Parameter that represents the communication body text when you create
     *         an AWS Support case by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     */
    public String getCommunicationBody() {
        return communicationBody;
    }
    
    /**
     * Parameter that represents the communication body text when you create
     * an AWS Support case by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody Parameter that represents the communication body text when you create
     *         an AWS Support case by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     */
    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }
    
    /**
     * Parameter that represents the communication body text when you create
     * an AWS Support case by calling <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param communicationBody Parameter that represents the communication body text when you create
     *         an AWS Support case by calling <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
        return this;
    }

    /**
     * List of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return List of email addresses that AWS Support copies on case
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
     * List of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses List of email addresses that AWS Support copies on case
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
     * List of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses List of email addresses that AWS Support copies on case
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
     * List of email addresses that AWS Support copies on case
     * correspondence.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param ccEmailAddresses List of email addresses that AWS Support copies on case
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
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @return Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Field passed as a parameter in a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a> call.
     *
     * @return Field passed as a parameter in a <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a> call.
     */
    public String getIssueType() {
        return issueType;
    }
    
    /**
     * Field passed as a parameter in a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a> call.
     *
     * @param issueType Field passed as a parameter in a <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a> call.
     */
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    /**
     * Field passed as a parameter in a <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a> call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param issueType Field passed as a parameter in a <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a> call.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateCaseRequest withIssueType(String issueType) {
        this.issueType = issueType;
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
        if (getIssueType() != null) sb.append("IssueType: " + getIssueType() );
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
        return true;
    }
    
}
    