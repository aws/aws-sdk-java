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
 * A JSON-formatted object that contains the metadata for a support case. It is contained the response from a
 * <a>DescribeCases</a> request. <b>CaseDetails</b> contains the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>caseId.</b> The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string
 * formatted as shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>categoryCode.</b> The category of problem for the AWS Support case. Corresponds to the CategoryCode values
 * returned by a call to <a>DescribeServices</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>displayId.</b> The identifier for the case on pages in the AWS Support Center.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>language.</b> The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports
 * English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>recentCommunications.</b> One or more <a>Communication</a> objects. Fields of these objects are
 * <code>attachments</code>, <code>body</code>, <code>caseId</code>, <code>submittedBy</code>, and
 * <code>timeCreated</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>nextToken.</b> A resumption point for pagination.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>serviceCode.</b> The identifier for the AWS service that corresponds to the service code defined in the call to
 * <a>DescribeServices</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>severityCode. </b>The severity code assigned to the case. Contains one of the values returned by the call to
 * <a>DescribeSeverityLevels</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>status.</b> The status of the case in the AWS Support Center.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>subject.</b> The subject line of the case.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>submittedBy.</b> The email address of the account that submitted the case.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>timeCreated.</b> The time the case was created, in ISO-8601 format.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CaseDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as
     * shown in this example: case-<i>12345678910-2013-c4c1d2bf33c5cf47</i>
     * </p>
     */
    private String caseId;
    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a numeric string.
     * </p>
     */
    private String displayId;
    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The status of the case.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The code for the AWS service returned by the call to <a>DescribeServices</a>.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     */
    private String categoryCode;
    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     */
    private String severityCode;
    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     */
    private String submittedBy;
    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     */
    private String timeCreated;
    /**
     * <p>
     * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to
     * the communications. Also includes a <code>nextToken</code> that you can use to retrieve earlier communications.
     * </p>
     */
    private RecentCaseCommunications recentCommunications;
    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ccEmailAddresses;
    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     */
    private String language;

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

    public CaseDetails withCaseId(String caseId) {
        setCaseId(caseId);
        return this;
    }

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a numeric string.
     * </p>
     * 
     * @param displayId
     *        The ID displayed for the case in the AWS Support Center. This is a numeric string.
     */

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a numeric string.
     * </p>
     * 
     * @return The ID displayed for the case in the AWS Support Center. This is a numeric string.
     */

    public String getDisplayId() {
        return this.displayId;
    }

    /**
     * <p>
     * The ID displayed for the case in the AWS Support Center. This is a numeric string.
     * </p>
     * 
     * @param displayId
     *        The ID displayed for the case in the AWS Support Center. This is a numeric string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withDisplayId(String displayId) {
        setDisplayId(displayId);
        return this;
    }

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     * 
     * @param subject
     *        The subject line for the case in the AWS Support Center.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     * 
     * @return The subject line for the case in the AWS Support Center.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line for the case in the AWS Support Center.
     * </p>
     * 
     * @param subject
     *        The subject line for the case in the AWS Support Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The status of the case.
     * </p>
     * 
     * @param status
     *        The status of the case.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the case.
     * </p>
     * 
     * @return The status of the case.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the case.
     * </p>
     * 
     * @param status
     *        The status of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The code for the AWS service returned by the call to <a>DescribeServices</a>.
     * </p>
     * 
     * @param serviceCode
     *        The code for the AWS service returned by the call to <a>DescribeServices</a>.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The code for the AWS service returned by the call to <a>DescribeServices</a>.
     * </p>
     * 
     * @return The code for the AWS service returned by the call to <a>DescribeServices</a>.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The code for the AWS service returned by the call to <a>DescribeServices</a>.
     * </p>
     * 
     * @param serviceCode
     *        The code for the AWS service returned by the call to <a>DescribeServices</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     * 
     * @param categoryCode
     *        The category of problem for the AWS Support case.
     */

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     * 
     * @return The category of problem for the AWS Support case.
     */

    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     * 
     * @param categoryCode
     *        The category of problem for the AWS Support case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withCategoryCode(String categoryCode) {
        setCategoryCode(categoryCode);
        return this;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * 
     * @param severityCode
     *        The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     */

    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * 
     * @return The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     */

    public String getSeverityCode() {
        return this.severityCode;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * 
     * @param severityCode
     *        The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withSeverityCode(String severityCode) {
        setSeverityCode(severityCode);
        return this;
    }

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     * 
     * @param submittedBy
     *        The email address of the account that submitted the case.
     */

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     * 
     * @return The email address of the account that submitted the case.
     */

    public String getSubmittedBy() {
        return this.submittedBy;
    }

    /**
     * <p>
     * The email address of the account that submitted the case.
     * </p>
     * 
     * @param submittedBy
     *        The email address of the account that submitted the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withSubmittedBy(String submittedBy) {
        setSubmittedBy(submittedBy);
        return this;
    }

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     * 
     * @param timeCreated
     *        The time that the case was case created in the AWS Support Center.
     */

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     * 
     * @return The time that the case was case created in the AWS Support Center.
     */

    public String getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * <p>
     * The time that the case was case created in the AWS Support Center.
     * </p>
     * 
     * @param timeCreated
     *        The time that the case was case created in the AWS Support Center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withTimeCreated(String timeCreated) {
        setTimeCreated(timeCreated);
        return this;
    }

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to
     * the communications. Also includes a <code>nextToken</code> that you can use to retrieve earlier communications.
     * </p>
     * 
     * @param recentCommunications
     *        The five most recent communications between you and AWS Support Center, including the IDs of any
     *        attachments to the communications. Also includes a <code>nextToken</code> that you can use to retrieve
     *        earlier communications.
     */

    public void setRecentCommunications(RecentCaseCommunications recentCommunications) {
        this.recentCommunications = recentCommunications;
    }

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to
     * the communications. Also includes a <code>nextToken</code> that you can use to retrieve earlier communications.
     * </p>
     * 
     * @return The five most recent communications between you and AWS Support Center, including the IDs of any
     *         attachments to the communications. Also includes a <code>nextToken</code> that you can use to retrieve
     *         earlier communications.
     */

    public RecentCaseCommunications getRecentCommunications() {
        return this.recentCommunications;
    }

    /**
     * <p>
     * The five most recent communications between you and AWS Support Center, including the IDs of any attachments to
     * the communications. Also includes a <code>nextToken</code> that you can use to retrieve earlier communications.
     * </p>
     * 
     * @param recentCommunications
     *        The five most recent communications between you and AWS Support Center, including the IDs of any
     *        attachments to the communications. Also includes a <code>nextToken</code> that you can use to retrieve
     *        earlier communications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withRecentCommunications(RecentCaseCommunications recentCommunications) {
        setRecentCommunications(recentCommunications);
        return this;
    }

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     * 
     * @return The email addresses that receive copies of communication about the case.
     */

    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
            ccEmailAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ccEmailAddresses;
    }

    /**
     * <p>
     * The email addresses that receive copies of communication about the case.
     * </p>
     * 
     * @param ccEmailAddresses
     *        The email addresses that receive copies of communication about the case.
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
     * The email addresses that receive copies of communication about the case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCcEmailAddresses(java.util.Collection)} or {@link #withCcEmailAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ccEmailAddresses
     *        The email addresses that receive copies of communication about the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withCcEmailAddresses(String... ccEmailAddresses) {
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
     * The email addresses that receive copies of communication about the case.
     * </p>
     * 
     * @param ccEmailAddresses
     *        The email addresses that receive copies of communication about the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
        setCcEmailAddresses(ccEmailAddresses);
        return this;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *        ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @return The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *         ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en")
     * and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * </p>
     * 
     * @param language
     *        The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English
     *        ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseDetails withLanguage(String language) {
        setLanguage(language);
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
        if (getDisplayId() != null)
            sb.append("DisplayId: ").append(getDisplayId()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getCategoryCode() != null)
            sb.append("CategoryCode: ").append(getCategoryCode()).append(",");
        if (getSeverityCode() != null)
            sb.append("SeverityCode: ").append(getSeverityCode()).append(",");
        if (getSubmittedBy() != null)
            sb.append("SubmittedBy: ").append(getSubmittedBy()).append(",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: ").append(getTimeCreated()).append(",");
        if (getRecentCommunications() != null)
            sb.append("RecentCommunications: ").append(getRecentCommunications()).append(",");
        if (getCcEmailAddresses() != null)
            sb.append("CcEmailAddresses: ").append(getCcEmailAddresses()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaseDetails == false)
            return false;
        CaseDetails other = (CaseDetails) obj;
        if (other.getCaseId() == null ^ this.getCaseId() == null)
            return false;
        if (other.getCaseId() != null && other.getCaseId().equals(this.getCaseId()) == false)
            return false;
        if (other.getDisplayId() == null ^ this.getDisplayId() == null)
            return false;
        if (other.getDisplayId() != null && other.getDisplayId().equals(this.getDisplayId()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null)
            return false;
        if (other.getCategoryCode() != null && other.getCategoryCode().equals(this.getCategoryCode()) == false)
            return false;
        if (other.getSeverityCode() == null ^ this.getSeverityCode() == null)
            return false;
        if (other.getSeverityCode() != null && other.getSeverityCode().equals(this.getSeverityCode()) == false)
            return false;
        if (other.getSubmittedBy() == null ^ this.getSubmittedBy() == null)
            return false;
        if (other.getSubmittedBy() != null && other.getSubmittedBy().equals(this.getSubmittedBy()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getRecentCommunications() == null ^ this.getRecentCommunications() == null)
            return false;
        if (other.getRecentCommunications() != null && other.getRecentCommunications().equals(this.getRecentCommunications()) == false)
            return false;
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null)
            return false;
        if (other.getCcEmailAddresses() != null && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        return true;
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
    public CaseDetails clone() {
        try {
            return (CaseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.CaseDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
