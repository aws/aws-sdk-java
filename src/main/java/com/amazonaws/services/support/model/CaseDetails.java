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

/**
 * <p>
 * A JSON-formatted object that contains the metadata for a support case.
 * It is contained the response from a DescribeCases request.
 * <b>CaseDetails</b> contains the following fields:
 * </p>
 * <ol> <li> <b>CaseID.</b> The AWS Support case ID requested or
 * returned in the call. The case ID is an alphanumeric string formatted
 * as shown in this example: case-
 * <i>12345678910-2013-c4c1d2bf33c5cf47</i> .</li>
 * <li> <b>CategoryCode.</b> The category of problem for the AWS Support
 * case. Corresponds to the CategoryCode values returned by a call to
 * DescribeServices.</li>
 * <li> <b>DisplayId.</b> The identifier for the case on pages in the
 * AWS Support Center.</li>
 * <li> <b>Language.</b> The ISO 639-1 code for the language in which
 * AWS provides support. AWS Support currently supports English ("en")
 * and Japanese ("ja"). Language parameters must be passed explicitly for
 * operations that take them.</li>
 * <li> <b>RecentCommunications.</b> One or more Communication objects.
 * Fields of these objects are <code>Body</code> ,
 * <code>CaseId</code> ,
 * <code>SubmittedBy</code> , and
 * <code>TimeCreated</code> .</li>
 * <li> <b>NextToken.</b> A resumption point for pagination.</li>
 * <li> <b>ServiceCode.</b> The identifier for the AWS service that
 * corresponds to the service code defined in the call to
 * DescribeServices.</li>
 * <li> <b>SeverityCode. </b> The severity code assigned to the case.
 * Contains one of the values returned by the call to
 * DescribeSeverityLevels.</li>
 * <li> <b>Status.</b> The status of the case in the AWS Support
 * Center.</li>
 * <li> <b>Subject.</b> The subject line of the case.</li>
 * <li> <b>SubmittedBy.</b> The email address of the account that
 * submitted the case.</li>
 * <li> <b>TimeCreated.</b> The time the case was created, in ISO-8601
 * format.</li>
 * </ol>
 */
public class CaseDetails implements Serializable {

    /**
     * The AWS Support case ID requested or returned in the call. The case ID
     * is an alphanumeric string formatted as shown in this example:
     * case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     */
    private String caseId;

    /**
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     */
    private String displayId;

    /**
     * The subject line for the case in the AWS Support Center.
     */
    private String subject;

    /**
     * The status of the case.
     */
    private String status;

    /**
     * The code for the AWS service returned by the call to
     * <a>DescribeServices</a>.
     */
    private String serviceCode;

    /**
     * The category of problem for the AWS Support case.
     */
    private String categoryCode;

    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     */
    private String severityCode;

    /**
     * The email address of the account that submitted the case.
     */
    private String submittedBy;

    /**
     * The time that the case was case created in the AWS Support Center.
     */
    private String timeCreated;

    /**
     * The five most recent communications between you and AWS Support
     * Center. Includes a <code>nextToken</code> to retrieve the next set of
     * communications.
     */
    private RecentCaseCommunications recentCommunications;

    /**
     * The email addresses that receive copies of communication about the
     * case.
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
    public CaseDetails withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     *
     * @return The ID displayed for the case in the AWS Support Center. This is a
     *         numeric string.
     */
    public String getDisplayId() {
        return displayId;
    }
    
    /**
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     *
     * @param displayId The ID displayed for the case in the AWS Support Center. This is a
     *         numeric string.
     */
    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }
    
    /**
     * The ID displayed for the case in the AWS Support Center. This is a
     * numeric string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param displayId The ID displayed for the case in the AWS Support Center. This is a
     *         numeric string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withDisplayId(String displayId) {
        this.displayId = displayId;
        return this;
    }

    /**
     * The subject line for the case in the AWS Support Center.
     *
     * @return The subject line for the case in the AWS Support Center.
     */
    public String getSubject() {
        return subject;
    }
    
    /**
     * The subject line for the case in the AWS Support Center.
     *
     * @param subject The subject line for the case in the AWS Support Center.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * The subject line for the case in the AWS Support Center.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subject The subject line for the case in the AWS Support Center.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * The status of the case.
     *
     * @return The status of the case.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the case.
     *
     * @param status The status of the case.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The code for the AWS service returned by the call to
     * <a>DescribeServices</a>.
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
     *
     * @param serviceCode The code for the AWS service returned by the call to
     *         <a>DescribeServices</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
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
    public CaseDetails withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     *
     * @return The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>.
     */
    public String getSeverityCode() {
        return severityCode;
    }
    
    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     *
     * @param severityCode The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>.
     */
    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }
    
    /**
     * The code for the severity level returned by the call to
     * <a>DescribeSeverityLevels</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param severityCode The code for the severity level returned by the call to
     *         <a>DescribeSeverityLevels</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withSeverityCode(String severityCode) {
        this.severityCode = severityCode;
        return this;
    }

    /**
     * The email address of the account that submitted the case.
     *
     * @return The email address of the account that submitted the case.
     */
    public String getSubmittedBy() {
        return submittedBy;
    }
    
    /**
     * The email address of the account that submitted the case.
     *
     * @param submittedBy The email address of the account that submitted the case.
     */
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }
    
    /**
     * The email address of the account that submitted the case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param submittedBy The email address of the account that submitted the case.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
        return this;
    }

    /**
     * The time that the case was case created in the AWS Support Center.
     *
     * @return The time that the case was case created in the AWS Support Center.
     */
    public String getTimeCreated() {
        return timeCreated;
    }
    
    /**
     * The time that the case was case created in the AWS Support Center.
     *
     * @param timeCreated The time that the case was case created in the AWS Support Center.
     */
    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }
    
    /**
     * The time that the case was case created in the AWS Support Center.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeCreated The time that the case was case created in the AWS Support Center.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
        return this;
    }

    /**
     * The five most recent communications between you and AWS Support
     * Center. Includes a <code>nextToken</code> to retrieve the next set of
     * communications.
     *
     * @return The five most recent communications between you and AWS Support
     *         Center. Includes a <code>nextToken</code> to retrieve the next set of
     *         communications.
     */
    public RecentCaseCommunications getRecentCommunications() {
        return recentCommunications;
    }
    
    /**
     * The five most recent communications between you and AWS Support
     * Center. Includes a <code>nextToken</code> to retrieve the next set of
     * communications.
     *
     * @param recentCommunications The five most recent communications between you and AWS Support
     *         Center. Includes a <code>nextToken</code> to retrieve the next set of
     *         communications.
     */
    public void setRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
    }
    
    /**
     * The five most recent communications between you and AWS Support
     * Center. Includes a <code>nextToken</code> to retrieve the next set of
     * communications.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recentCommunications The five most recent communications between you and AWS Support
     *         Center. Includes a <code>nextToken</code> to retrieve the next set of
     *         communications.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CaseDetails withRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
        return this;
    }

    /**
     * The email addresses that receive copies of communication about the
     * case.
     *
     * @return The email addresses that receive copies of communication about the
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
     * The email addresses that receive copies of communication about the
     * case.
     *
     * @param ccEmailAddresses The email addresses that receive copies of communication about the
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
     * The email addresses that receive copies of communication about the
     * case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ccEmailAddresses The email addresses that receive copies of communication about the
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
     * The email addresses that receive copies of communication about the
     * case.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ccEmailAddresses The email addresses that receive copies of communication about the
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
    