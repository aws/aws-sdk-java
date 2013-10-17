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


/**
 * <p>
 * JSON-formatted object that contains the metadata for a support case. It is contained the response from a <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"> DescribeCases </a> request. This structure contains the
 * following fields:
 * </p>
 * <ol> <li> <b>CaseID</b> . String that indicates the AWS Support caseID requested or returned in the call. The caseID is an alphanumeric string
 * formatted as shown in this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i> </li>
 * <li> <b>CategoryCode</b> . Specifies the category of problem for the AWS Support case. Corresponds to the CategoryCode values returned by a call to
 * <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> </li>
 * <li> <b>DisplayId</b> . String that identifies the case on pages in the AWS Support Center</li>
 * <li> <b>Language</b> . Specifies the ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English and
 * Japanese, for which the codes are <i>en</i> and <i>ja</i> , respectively. Language parameters must be passed explicitly for operations that take
 * them.</li>
 * <li> <b>RecentCommunications</b> . One ore more <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_Communication.html">
 * Communication </a> data types. Subfields of these structures are Body, CaseId, SubmittedBy, and TimeCreated.</li>
 * <li> <b>NextToken</b> . Defines a resumption point for pagination.</li>
 * <li> <b>ServiceCode</b> . Identifier for the AWS service that corresponds to the service code defined in the call to <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeCases.html"> DescribeServices </a> </li>
 * <li> <b>SeverityCode. </b> Specifies the severity code assigned to the case. Contains one of the values returned by the call to <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"> DescribeSeverityLevels </a> </li>
 * <li> <b>Status</b> . Represents the status of your case in the AWS Support Center</li>
 * <li> <b>Subject</b> . Represents the subject line of the case.</li>
 * <li> <b>SubmittedBy</b> .Email address of the account that submitted the case.</li>
 * <li> <b>TimeCreated</b> .Time the case was created, using ISO 8601 format. </li>
 * </ol>
 */
public class CaseDetails implements Serializable {

    /**
     * String that indicates the AWS Support caseID requested or returned in
     * the call. The caseID is an alphanumeric string formatted as shown in
     * this example CaseId: <i>case-12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * Represents the Id value displayed on pages for the case in AWS Support
     * Center. This is a numeric string.
     */
    private String displayId;

    /**
     * Represents the subject line for a support case in the AWS Support
     * Center user interface.
     */
    private String subject;

    /**
     * Represents the status of a case submitted to AWS Support.
     */
    private String status;

    /**
     * Code for the AWS service returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a>.
     */
    private String serviceCode;

    /**
     * Specifies the category of problem for the AWS Support case.
     */
    private String categoryCode;

    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     */
    private String severityCode;

    /**
     * Represents the email address of the account that submitted the case to
     * support.
     */
    private String submittedBy;

    /**
     * Time that the case was case created in AWS Support Center.
     */
    private String timeCreated;

    /**
     * Returns up to the five most recent communications between you and AWS
     * Support Center. Includes a <i>nextToken</i> to retrieve the next set
     * of communications.
     */
    private RecentCaseCommunications recentCommunications;

    /**
     * List of email addresses that are copied in any communication about the
     * case.
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
    public CaseDetails withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * Represents the Id value displayed on pages for the case in AWS Support
     * Center. This is a numeric string.
     *
     * @return Represents the Id value displayed on pages for the case in AWS Support
     *         Center. This is a numeric string.
     */
    public String getDisplayId() {
        return displayId;
    }
    
    /**
     * Represents the Id value displayed on pages for the case in AWS Support
     * Center. This is a numeric string.
     *
     * @param displayId Represents the Id value displayed on pages for the case in AWS Support
     *         Center. This is a numeric string.
     */
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }
    
    /**
     * Represents the Id value displayed on pages for the case in AWS Support
     * Center. This is a numeric string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param displayId Represents the Id value displayed on pages for the case in AWS Support
     *         Center. This is a numeric string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * Represents the subject line for a support case in the AWS Support
     * Center user interface.
     *
     * @return Represents the subject line for a support case in the AWS Support
     *         Center user interface.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * Represents the subject line for a support case in the AWS Support
     * Center user interface.
     *
     * @param subject Represents the subject line for a support case in the AWS Support
     *         Center user interface.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * Represents the subject line for a support case in the AWS Support
     * Center user interface.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject Represents the subject line for a support case in the AWS Support
     *         Center user interface.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Represents the status of a case submitted to AWS Support.
     *
     * @return Represents the status of a case submitted to AWS Support.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Represents the status of a case submitted to AWS Support.
     *
     * @param status Represents the status of a case submitted to AWS Support.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Represents the status of a case submitted to AWS Support.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Represents the status of a case submitted to AWS Support.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Code for the AWS service returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a>.
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
     *
     * @param serviceCode Code for the AWS service returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
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
    public CaseDetails withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     *
     * @return Code for the severity level returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     *         title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     */
    public String getSeverityCode() {
        return severityCode;
    }
    
    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     *
     * @param severityCode Code for the severity level returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     *         title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     */
    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }
    
    /**
     * Code for the severity level returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     * title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severityCode Code for the severity level returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeSeverityLevels.html"
     *         title="DescribeSeverityLevels">DescribeSeverityLevels</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withSeverityCode(String severityCode) {
        this.severityCode = severityCode;
        return this;
    }

    /**
     * Represents the email address of the account that submitted the case to
     * support.
     *
     * @return Represents the email address of the account that submitted the case to
     *         support.
     */
    public String getSubmittedBy() {
        return submittedBy;
    }
    
    /**
     * Represents the email address of the account that submitted the case to
     * support.
     *
     * @param submittedBy Represents the email address of the account that submitted the case to
     *         support.
     */
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }
    
    /**
     * Represents the email address of the account that submitted the case to
     * support.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submittedBy Represents the email address of the account that submitted the case to
     *         support.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * Time that the case was case created in AWS Support Center.
     *
     * @return Time that the case was case created in AWS Support Center.
     */
    public String getTimeCreated() {
        return timeCreated;
    }
    
    /**
     * Time that the case was case created in AWS Support Center.
     *
     * @param timeCreated Time that the case was case created in AWS Support Center.
     */
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }
    
    /**
     * Time that the case was case created in AWS Support Center.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeCreated Time that the case was case created in AWS Support Center.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * Returns up to the five most recent communications between you and AWS
     * Support Center. Includes a <i>nextToken</i> to retrieve the next set
     * of communications.
     *
     * @return Returns up to the five most recent communications between you and AWS
     *         Support Center. Includes a <i>nextToken</i> to retrieve the next set
     *         of communications.
     */
    public RecentCaseCommunications getRecentCommunications() {
        return recentCommunications;
    }
    
    /**
     * Returns up to the five most recent communications between you and AWS
     * Support Center. Includes a <i>nextToken</i> to retrieve the next set
     * of communications.
     *
     * @param recentCommunications Returns up to the five most recent communications between you and AWS
     *         Support Center. Includes a <i>nextToken</i> to retrieve the next set
     *         of communications.
     */
    public void setRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
    }
    
    /**
     * Returns up to the five most recent communications between you and AWS
     * Support Center. Includes a <i>nextToken</i> to retrieve the next set
     * of communications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recentCommunications Returns up to the five most recent communications between you and AWS
     *         Support Center. Includes a <i>nextToken</i> to retrieve the next set
     *         of communications.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
        return this;
    }

    /**
     * List of email addresses that are copied in any communication about the
     * case.
     *
     * @return List of email addresses that are copied in any communication about the
     *         case.
     */
    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
              ccEmailAddresses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ccEmailAddresses.setAutoConstruct(true);
        }
        return ccEmailAddresses;
    }
    
    /**
     * List of email addresses that are copied in any communication about the
     * case.
     *
     * @param ccEmailAddresses List of email addresses that are copied in any communication about the
     *         case.
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
     * List of email addresses that are copied in any communication about the
     * case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ccEmailAddresses List of email addresses that are copied in any communication about the
     *         case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withCcEmailAddresses(String... ccEmailAddresses) {
        if (getCcEmailAddresses() == null) setCcEmailAddresses(new java.util.ArrayList<String>(ccEmailAddresses.length));
        for (String value : ccEmailAddresses) {
            getCcEmailAddresses().add(value);
        }
        return this;
    }
    
    /**
     * List of email addresses that are copied in any communication about the
     * case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ccEmailAddresses List of email addresses that are copied in any communication about the
     *         case.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CaseDetails withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
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
    public CaseDetails withLanguage(String language) {
        this.language = language;
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
        if (getDisplayId() != null) sb.append("DisplayId: " + getDisplayId() + ",");
        if (getSubject() != null) sb.append("Subject: " + getSubject() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getServiceCode() != null) sb.append("ServiceCode: " + getServiceCode() + ",");
        if (getCategoryCode() != null) sb.append("CategoryCode: " + getCategoryCode() + ",");
        if (getSeverityCode() != null) sb.append("SeverityCode: " + getSeverityCode() + ",");
        if (getSubmittedBy() != null) sb.append("SubmittedBy: " + getSubmittedBy() + ",");
        if (getTimeCreated() != null) sb.append("TimeCreated: " + getTimeCreated() + ",");
        if (getRecentCommunications() != null) sb.append("RecentCommunications: " + getRecentCommunications() + ",");
        if (getCcEmailAddresses() != null) sb.append("CcEmailAddresses: " + getCcEmailAddresses() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCaseId() == null) ? 0 : getCaseId().hashCode()); 
        hashCode = prime * hashCode + ((getDisplayId() == null) ? 0 : getDisplayId().hashCode()); 
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode()); 
        hashCode = prime * hashCode + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode()); 
        hashCode = prime * hashCode + ((getSeverityCode() == null) ? 0 : getSeverityCode().hashCode()); 
        hashCode = prime * hashCode + ((getSubmittedBy() == null) ? 0 : getSubmittedBy().hashCode()); 
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode()); 
        hashCode = prime * hashCode + ((getRecentCommunications() == null) ? 0 : getRecentCommunications().hashCode()); 
        hashCode = prime * hashCode + ((getCcEmailAddresses() == null) ? 0 : getCcEmailAddresses().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CaseDetails == false) return false;
        CaseDetails other = (CaseDetails)obj;
        
        if (other.getCaseId() == null ^ this.getCaseId() == null) return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false) return false; 
        if (other.getDisplayId() == null ^ this.getDisplayId() == null) return false;
        if (other.getDisplayId() != null && other.getDisplayId().equals(this.getDisplayId()) == false) return false; 
        if (other.getSubject() == null ^ this.getSubject() == null) return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getServiceCode() == null ^ this.getServiceCode() == null) return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false) return false; 
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null) return false;
        if (other.getCategoryCode() != null && other.getCategoryCode().equals(this.getCategoryCode()) == false) return false; 
        if (other.getSeverityCode() == null ^ this.getSeverityCode() == null) return false;
        if (other.getSeverityCode() != null && other.getSeverityCode().equals(this.getSeverityCode()) == false) return false; 
        if (other.getSubmittedBy() == null ^ this.getSubmittedBy() == null) return false;
        if (other.getSubmittedBy() != null && other.getSubmittedBy().equals(this.getSubmittedBy()) == false) return false; 
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null) return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false) return false; 
        if (other.getRecentCommunications() == null ^ this.getRecentCommunications() == null) return false;
        if (other.getRecentCommunications() != null && other.getRecentCommunications().equals(this.getRecentCommunications()) == false) return false; 
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null) return false;
        if (other.getCcEmailAddresses() != null && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        return true;
    }
    
}
    