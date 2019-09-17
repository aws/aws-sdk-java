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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/CreateCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The title of the AWS Support case.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The code for the AWS service returned by the call to <a>DescribeServices</a>.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on each customer's support subscription. In other words, your
     * subscription may not necessarily require the urgent level of response time.
     * </p>
     * </note>
     */
    private String severityCode;
    /**
     * <p>
     * The category of problem for the AWS Support case.
     * </p>
     */
    private String categoryCode;
    /**
     * <p>
     * The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     * </p>
     */
    private String communicationBody;
    /**
     * <p>
     * A list of email addresses that AWS Support copies on case correspondence.
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
     * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate
     * a value, the default is "technical."
     * </p>
     */
    private String issueType;
    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set by using <a>AddAttachmentsToSet</a>.
     * </p>
     */
    private String attachmentSetId;

    /**
     * <p>
     * The title of the AWS Support case.
     * </p>
     * 
     * @param subject
     *        The title of the AWS Support case.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The title of the AWS Support case.
     * </p>
     * 
     * @return The title of the AWS Support case.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The title of the AWS Support case.
     * </p>
     * 
     * @param subject
     *        The title of the AWS Support case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withSubject(String subject) {
        setSubject(subject);
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

    public CreateCaseRequest withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on each customer's support subscription. In other words, your
     * subscription may not necessarily require the urgent level of response time.
     * </p>
     * </note>
     * 
     * @param severityCode
     *        The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.</p> <note>
     *        <p>
     *        The availability of severity levels depends on each customer's support subscription. In other words, your
     *        subscription may not necessarily require the urgent level of response time.
     *        </p>
     */

    public void setSeverityCode(String severityCode) {
        this.severityCode = severityCode;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on each customer's support subscription. In other words, your
     * subscription may not necessarily require the urgent level of response time.
     * </p>
     * </note>
     * 
     * @return The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.</p> <note>
     *         <p>
     *         The availability of severity levels depends on each customer's support subscription. In other words, your
     *         subscription may not necessarily require the urgent level of response time.
     *         </p>
     */

    public String getSeverityCode() {
        return this.severityCode;
    }

    /**
     * <p>
     * The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.
     * </p>
     * <note>
     * <p>
     * The availability of severity levels depends on each customer's support subscription. In other words, your
     * subscription may not necessarily require the urgent level of response time.
     * </p>
     * </note>
     * 
     * @param severityCode
     *        The code for the severity level returned by the call to <a>DescribeSeverityLevels</a>.</p> <note>
     *        <p>
     *        The availability of severity levels depends on each customer's support subscription. In other words, your
     *        subscription may not necessarily require the urgent level of response time.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withSeverityCode(String severityCode) {
        setSeverityCode(severityCode);
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

    public CreateCaseRequest withCategoryCode(String categoryCode) {
        setCategoryCode(categoryCode);
        return this;
    }

    /**
     * <p>
     * The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     * </p>
     * 
     * @param communicationBody
     *        The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     */

    public void setCommunicationBody(String communicationBody) {
        this.communicationBody = communicationBody;
    }

    /**
     * <p>
     * The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     * </p>
     * 
     * @return The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     */

    public String getCommunicationBody() {
        return this.communicationBody;
    }

    /**
     * <p>
     * The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     * </p>
     * 
     * @param communicationBody
     *        The communication body text when you create an AWS Support case by calling <a>CreateCase</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withCommunicationBody(String communicationBody) {
        setCommunicationBody(communicationBody);
        return this;
    }

    /**
     * <p>
     * A list of email addresses that AWS Support copies on case correspondence.
     * </p>
     * 
     * @return A list of email addresses that AWS Support copies on case correspondence.
     */

    public java.util.List<String> getCcEmailAddresses() {
        if (ccEmailAddresses == null) {
            ccEmailAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ccEmailAddresses;
    }

    /**
     * <p>
     * A list of email addresses that AWS Support copies on case correspondence.
     * </p>
     * 
     * @param ccEmailAddresses
     *        A list of email addresses that AWS Support copies on case correspondence.
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
     * A list of email addresses that AWS Support copies on case correspondence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCcEmailAddresses(java.util.Collection)} or {@link #withCcEmailAddresses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ccEmailAddresses
     *        A list of email addresses that AWS Support copies on case correspondence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withCcEmailAddresses(String... ccEmailAddresses) {
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
     * A list of email addresses that AWS Support copies on case correspondence.
     * </p>
     * 
     * @param ccEmailAddresses
     *        A list of email addresses that AWS Support copies on case correspondence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withCcEmailAddresses(java.util.Collection<String> ccEmailAddresses) {
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

    public CreateCaseRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate
     * a value, the default is "technical."
     * </p>
     * 
     * @param issueType
     *        The type of issue for the case. You can specify either "customer-service" or "technical." If you do not
     *        indicate a value, the default is "technical."
     */

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate
     * a value, the default is "technical."
     * </p>
     * 
     * @return The type of issue for the case. You can specify either "customer-service" or "technical." If you do not
     *         indicate a value, the default is "technical."
     */

    public String getIssueType() {
        return this.issueType;
    }

    /**
     * <p>
     * The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate
     * a value, the default is "technical."
     * </p>
     * 
     * @param issueType
     *        The type of issue for the case. You can specify either "customer-service" or "technical." If you do not
     *        indicate a value, the default is "technical."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withIssueType(String issueType) {
        setIssueType(issueType);
        return this;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set by using <a>AddAttachmentsToSet</a>.
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of a set of one or more attachments for the case. Create the set by using
     *        <a>AddAttachmentsToSet</a>.
     */

    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set by using <a>AddAttachmentsToSet</a>.
     * </p>
     * 
     * @return The ID of a set of one or more attachments for the case. Create the set by using
     *         <a>AddAttachmentsToSet</a>.
     */

    public String getAttachmentSetId() {
        return this.attachmentSetId;
    }

    /**
     * <p>
     * The ID of a set of one or more attachments for the case. Create the set by using <a>AddAttachmentsToSet</a>.
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of a set of one or more attachments for the case. Create the set by using
     *        <a>AddAttachmentsToSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCaseRequest withAttachmentSetId(String attachmentSetId) {
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
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getSeverityCode() != null)
            sb.append("SeverityCode: ").append(getSeverityCode()).append(",");
        if (getCategoryCode() != null)
            sb.append("CategoryCode: ").append(getCategoryCode()).append(",");
        if (getCommunicationBody() != null)
            sb.append("CommunicationBody: ").append(getCommunicationBody()).append(",");
        if (getCcEmailAddresses() != null)
            sb.append("CcEmailAddresses: ").append(getCcEmailAddresses()).append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getIssueType() != null)
            sb.append("IssueType: ").append(getIssueType()).append(",");
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

        if (obj instanceof CreateCaseRequest == false)
            return false;
        CreateCaseRequest other = (CreateCaseRequest) obj;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getSeverityCode() == null ^ this.getSeverityCode() == null)
            return false;
        if (other.getSeverityCode() != null && other.getSeverityCode().equals(this.getSeverityCode()) == false)
            return false;
        if (other.getCategoryCode() == null ^ this.getCategoryCode() == null)
            return false;
        if (other.getCategoryCode() != null && other.getCategoryCode().equals(this.getCategoryCode()) == false)
            return false;
        if (other.getCommunicationBody() == null ^ this.getCommunicationBody() == null)
            return false;
        if (other.getCommunicationBody() != null && other.getCommunicationBody().equals(this.getCommunicationBody()) == false)
            return false;
        if (other.getCcEmailAddresses() == null ^ this.getCcEmailAddresses() == null)
            return false;
        if (other.getCcEmailAddresses() != null && other.getCcEmailAddresses().equals(this.getCcEmailAddresses()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getIssueType() == null ^ this.getIssueType() == null)
            return false;
        if (other.getIssueType() != null && other.getIssueType().equals(this.getIssueType()) == false)
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
    public CreateCaseRequest clone() {
        return (CreateCaseRequest) super.clone();
    }

}
