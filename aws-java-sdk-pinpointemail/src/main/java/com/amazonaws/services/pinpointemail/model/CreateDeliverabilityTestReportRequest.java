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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how
 * your messages will be handled by various email providers around the world. When you perform a predictive inbox
 * placement test, you provide a sample message that contains the content that you plan to send to your customers.
 * Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After
 * about 24 hours, the test is complete, and you can use the <code>GetDeliverabilityTestReport</code> operation to view
 * the results of the test.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDeliverabilityTestReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeliverabilityTestReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
     * </p>
     */
    private String reportName;
    /**
     * <p>
     * The email address that the predictive inbox placement test email was sent from.
     * </p>
     */
    private String fromEmailAddress;
    /**
     * <p>
     * The HTML body of the message that you sent when you performed the predictive inbox placement test.
     * </p>
     */
    private EmailContent content;
    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the predictive inbox placement
     * test.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
     * </p>
     * 
     * @param reportName
     *        A unique name that helps you to identify the predictive inbox placement test when you retrieve the
     *        results.
     */

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * <p>
     * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
     * </p>
     * 
     * @return A unique name that helps you to identify the predictive inbox placement test when you retrieve the
     *         results.
     */

    public String getReportName() {
        return this.reportName;
    }

    /**
     * <p>
     * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
     * </p>
     * 
     * @param reportName
     *        A unique name that helps you to identify the predictive inbox placement test when you retrieve the
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliverabilityTestReportRequest withReportName(String reportName) {
        setReportName(reportName);
        return this;
    }

    /**
     * <p>
     * The email address that the predictive inbox placement test email was sent from.
     * </p>
     * 
     * @param fromEmailAddress
     *        The email address that the predictive inbox placement test email was sent from.
     */

    public void setFromEmailAddress(String fromEmailAddress) {
        this.fromEmailAddress = fromEmailAddress;
    }

    /**
     * <p>
     * The email address that the predictive inbox placement test email was sent from.
     * </p>
     * 
     * @return The email address that the predictive inbox placement test email was sent from.
     */

    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }

    /**
     * <p>
     * The email address that the predictive inbox placement test email was sent from.
     * </p>
     * 
     * @param fromEmailAddress
     *        The email address that the predictive inbox placement test email was sent from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliverabilityTestReportRequest withFromEmailAddress(String fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

    /**
     * <p>
     * The HTML body of the message that you sent when you performed the predictive inbox placement test.
     * </p>
     * 
     * @param content
     *        The HTML body of the message that you sent when you performed the predictive inbox placement test.
     */

    public void setContent(EmailContent content) {
        this.content = content;
    }

    /**
     * <p>
     * The HTML body of the message that you sent when you performed the predictive inbox placement test.
     * </p>
     * 
     * @return The HTML body of the message that you sent when you performed the predictive inbox placement test.
     */

    public EmailContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * The HTML body of the message that you sent when you performed the predictive inbox placement test.
     * </p>
     * 
     * @param content
     *        The HTML body of the message that you sent when you performed the predictive inbox placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliverabilityTestReportRequest withContent(EmailContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the predictive inbox placement
     * test.
     * </p>
     * 
     * @return An object that defines the tags (keys and values) that you want to associate with the predictive inbox
     *         placement test.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the predictive inbox placement
     * test.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the predictive inbox
     *        placement test.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the predictive inbox placement
     * test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the predictive inbox
     *        placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliverabilityTestReportRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the predictive inbox placement
     * test.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the predictive inbox
     *        placement test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliverabilityTestReportRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReportName() != null)
            sb.append("ReportName: ").append(getReportName()).append(",");
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: ").append(getFromEmailAddress()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeliverabilityTestReportRequest == false)
            return false;
        CreateDeliverabilityTestReportRequest other = (CreateDeliverabilityTestReportRequest) obj;
        if (other.getReportName() == null ^ this.getReportName() == null)
            return false;
        if (other.getReportName() != null && other.getReportName().equals(this.getReportName()) == false)
            return false;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportName() == null) ? 0 : getReportName().hashCode());
        hashCode = prime * hashCode + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliverabilityTestReportRequest clone() {
        return (CreateDeliverabilityTestReportRequest) super.clone();
    }

}
