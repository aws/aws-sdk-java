/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about your account details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/AccountDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of email your account is sending. The mail type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest offering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a customer.
     * </p>
     * </li>
     * </ul>
     */
    private String mailType;
    /**
     * <p>
     * The URL of your website. This information helps us better understand the type of content that you plan to send.
     * </p>
     */
    private String websiteURL;
    /**
     * <p>
     * The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     * <code>JAPANESE</code>.
     * </p>
     */
    private String contactLanguage;
    /**
     * <p>
     * A description of the types of email that you plan to send.
     * </p>
     */
    private String useCaseDescription;
    /**
     * <p>
     * Additional email addresses where updates are sent about your account review process.
     * </p>
     */
    private java.util.List<String> additionalContactEmailAddresses;
    /**
     * <p>
     * Information about the review of the latest details you submitted.
     * </p>
     */
    private ReviewDetails reviewDetails;

    /**
     * <p>
     * The type of email your account is sending. The mail type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest offering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailType
     *        The type of email your account is sending. The mail type can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest
     *        offering.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a
     *        customer.
     *        </p>
     *        </li>
     * @see MailType
     */

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    /**
     * <p>
     * The type of email your account is sending. The mail type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest offering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of email your account is sending. The mail type can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest
     *         offering.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a
     *         customer.
     *         </p>
     *         </li>
     * @see MailType
     */

    public String getMailType() {
        return this.mailType;
    }

    /**
     * <p>
     * The type of email your account is sending. The mail type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest offering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailType
     *        The type of email your account is sending. The mail type can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest
     *        offering.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a
     *        customer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailType
     */

    public AccountDetails withMailType(String mailType) {
        setMailType(mailType);
        return this;
    }

    /**
     * <p>
     * The type of email your account is sending. The mail type can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest offering.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a customer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailType
     *        The type of email your account is sending. The mail type can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MARKETING</code> – Most of your sending traffic is to keep your customers informed of your latest
     *        offering.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSACTIONAL</code> – Most of your sending traffic is to communicate during a transaction with a
     *        customer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailType
     */

    public AccountDetails withMailType(MailType mailType) {
        this.mailType = mailType.toString();
        return this;
    }

    /**
     * <p>
     * The URL of your website. This information helps us better understand the type of content that you plan to send.
     * </p>
     * 
     * @param websiteURL
     *        The URL of your website. This information helps us better understand the type of content that you plan to
     *        send.
     */

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    /**
     * <p>
     * The URL of your website. This information helps us better understand the type of content that you plan to send.
     * </p>
     * 
     * @return The URL of your website. This information helps us better understand the type of content that you plan to
     *         send.
     */

    public String getWebsiteURL() {
        return this.websiteURL;
    }

    /**
     * <p>
     * The URL of your website. This information helps us better understand the type of content that you plan to send.
     * </p>
     * 
     * @param websiteURL
     *        The URL of your website. This information helps us better understand the type of content that you plan to
     *        send.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withWebsiteURL(String websiteURL) {
        setWebsiteURL(websiteURL);
        return this;
    }

    /**
     * <p>
     * The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     * <code>JAPANESE</code>.
     * </p>
     * 
     * @param contactLanguage
     *        The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     *        <code>JAPANESE</code>.
     * @see ContactLanguage
     */

    public void setContactLanguage(String contactLanguage) {
        this.contactLanguage = contactLanguage;
    }

    /**
     * <p>
     * The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     * <code>JAPANESE</code>.
     * </p>
     * 
     * @return The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     *         <code>JAPANESE</code>.
     * @see ContactLanguage
     */

    public String getContactLanguage() {
        return this.contactLanguage;
    }

    /**
     * <p>
     * The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     * <code>JAPANESE</code>.
     * </p>
     * 
     * @param contactLanguage
     *        The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     *        <code>JAPANESE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactLanguage
     */

    public AccountDetails withContactLanguage(String contactLanguage) {
        setContactLanguage(contactLanguage);
        return this;
    }

    /**
     * <p>
     * The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     * <code>JAPANESE</code>.
     * </p>
     * 
     * @param contactLanguage
     *        The language you would prefer for the case. The contact language can be one of <code>ENGLISH</code> or
     *        <code>JAPANESE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactLanguage
     */

    public AccountDetails withContactLanguage(ContactLanguage contactLanguage) {
        this.contactLanguage = contactLanguage.toString();
        return this;
    }

    /**
     * <p>
     * A description of the types of email that you plan to send.
     * </p>
     * 
     * @param useCaseDescription
     *        A description of the types of email that you plan to send.
     */

    public void setUseCaseDescription(String useCaseDescription) {
        this.useCaseDescription = useCaseDescription;
    }

    /**
     * <p>
     * A description of the types of email that you plan to send.
     * </p>
     * 
     * @return A description of the types of email that you plan to send.
     */

    public String getUseCaseDescription() {
        return this.useCaseDescription;
    }

    /**
     * <p>
     * A description of the types of email that you plan to send.
     * </p>
     * 
     * @param useCaseDescription
     *        A description of the types of email that you plan to send.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withUseCaseDescription(String useCaseDescription) {
        setUseCaseDescription(useCaseDescription);
        return this;
    }

    /**
     * <p>
     * Additional email addresses where updates are sent about your account review process.
     * </p>
     * 
     * @return Additional email addresses where updates are sent about your account review process.
     */

    public java.util.List<String> getAdditionalContactEmailAddresses() {
        return additionalContactEmailAddresses;
    }

    /**
     * <p>
     * Additional email addresses where updates are sent about your account review process.
     * </p>
     * 
     * @param additionalContactEmailAddresses
     *        Additional email addresses where updates are sent about your account review process.
     */

    public void setAdditionalContactEmailAddresses(java.util.Collection<String> additionalContactEmailAddresses) {
        if (additionalContactEmailAddresses == null) {
            this.additionalContactEmailAddresses = null;
            return;
        }

        this.additionalContactEmailAddresses = new java.util.ArrayList<String>(additionalContactEmailAddresses);
    }

    /**
     * <p>
     * Additional email addresses where updates are sent about your account review process.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalContactEmailAddresses(java.util.Collection)} or
     * {@link #withAdditionalContactEmailAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalContactEmailAddresses
     *        Additional email addresses where updates are sent about your account review process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withAdditionalContactEmailAddresses(String... additionalContactEmailAddresses) {
        if (this.additionalContactEmailAddresses == null) {
            setAdditionalContactEmailAddresses(new java.util.ArrayList<String>(additionalContactEmailAddresses.length));
        }
        for (String ele : additionalContactEmailAddresses) {
            this.additionalContactEmailAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional email addresses where updates are sent about your account review process.
     * </p>
     * 
     * @param additionalContactEmailAddresses
     *        Additional email addresses where updates are sent about your account review process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withAdditionalContactEmailAddresses(java.util.Collection<String> additionalContactEmailAddresses) {
        setAdditionalContactEmailAddresses(additionalContactEmailAddresses);
        return this;
    }

    /**
     * <p>
     * Information about the review of the latest details you submitted.
     * </p>
     * 
     * @param reviewDetails
     *        Information about the review of the latest details you submitted.
     */

    public void setReviewDetails(ReviewDetails reviewDetails) {
        this.reviewDetails = reviewDetails;
    }

    /**
     * <p>
     * Information about the review of the latest details you submitted.
     * </p>
     * 
     * @return Information about the review of the latest details you submitted.
     */

    public ReviewDetails getReviewDetails() {
        return this.reviewDetails;
    }

    /**
     * <p>
     * Information about the review of the latest details you submitted.
     * </p>
     * 
     * @param reviewDetails
     *        Information about the review of the latest details you submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountDetails withReviewDetails(ReviewDetails reviewDetails) {
        setReviewDetails(reviewDetails);
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
        if (getMailType() != null)
            sb.append("MailType: ").append(getMailType()).append(",");
        if (getWebsiteURL() != null)
            sb.append("WebsiteURL: ").append("***Sensitive Data Redacted***").append(",");
        if (getContactLanguage() != null)
            sb.append("ContactLanguage: ").append(getContactLanguage()).append(",");
        if (getUseCaseDescription() != null)
            sb.append("UseCaseDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getAdditionalContactEmailAddresses() != null)
            sb.append("AdditionalContactEmailAddresses: ").append("***Sensitive Data Redacted***").append(",");
        if (getReviewDetails() != null)
            sb.append("ReviewDetails: ").append(getReviewDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountDetails == false)
            return false;
        AccountDetails other = (AccountDetails) obj;
        if (other.getMailType() == null ^ this.getMailType() == null)
            return false;
        if (other.getMailType() != null && other.getMailType().equals(this.getMailType()) == false)
            return false;
        if (other.getWebsiteURL() == null ^ this.getWebsiteURL() == null)
            return false;
        if (other.getWebsiteURL() != null && other.getWebsiteURL().equals(this.getWebsiteURL()) == false)
            return false;
        if (other.getContactLanguage() == null ^ this.getContactLanguage() == null)
            return false;
        if (other.getContactLanguage() != null && other.getContactLanguage().equals(this.getContactLanguage()) == false)
            return false;
        if (other.getUseCaseDescription() == null ^ this.getUseCaseDescription() == null)
            return false;
        if (other.getUseCaseDescription() != null && other.getUseCaseDescription().equals(this.getUseCaseDescription()) == false)
            return false;
        if (other.getAdditionalContactEmailAddresses() == null ^ this.getAdditionalContactEmailAddresses() == null)
            return false;
        if (other.getAdditionalContactEmailAddresses() != null
                && other.getAdditionalContactEmailAddresses().equals(this.getAdditionalContactEmailAddresses()) == false)
            return false;
        if (other.getReviewDetails() == null ^ this.getReviewDetails() == null)
            return false;
        if (other.getReviewDetails() != null && other.getReviewDetails().equals(this.getReviewDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMailType() == null) ? 0 : getMailType().hashCode());
        hashCode = prime * hashCode + ((getWebsiteURL() == null) ? 0 : getWebsiteURL().hashCode());
        hashCode = prime * hashCode + ((getContactLanguage() == null) ? 0 : getContactLanguage().hashCode());
        hashCode = prime * hashCode + ((getUseCaseDescription() == null) ? 0 : getUseCaseDescription().hashCode());
        hashCode = prime * hashCode + ((getAdditionalContactEmailAddresses() == null) ? 0 : getAdditionalContactEmailAddresses().hashCode());
        hashCode = prime * hashCode + ((getReviewDetails() == null) ? 0 : getReviewDetails().hashCode());
        return hashCode;
    }

    @Override
    public AccountDetails clone() {
        try {
            return (AccountDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.AccountDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
