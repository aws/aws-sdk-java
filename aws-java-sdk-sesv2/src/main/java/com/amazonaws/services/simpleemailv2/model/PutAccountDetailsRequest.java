/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to submit new account details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutAccountDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of email your account will send.
     * </p>
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
     * The language you would prefer to be contacted with.
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
     * Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * </p>
     */
    private java.util.List<String> additionalContactEmailAddresses;
    /**
     * <p>
     * Indicates whether or not your account should have production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     */
    private Boolean productionAccessEnabled;

    /**
     * <p>
     * The type of email your account will send.
     * </p>
     * 
     * @param mailType
     *        The type of email your account will send.
     * @see MailType
     */

    public void setMailType(String mailType) {
        this.mailType = mailType;
    }

    /**
     * <p>
     * The type of email your account will send.
     * </p>
     * 
     * @return The type of email your account will send.
     * @see MailType
     */

    public String getMailType() {
        return this.mailType;
    }

    /**
     * <p>
     * The type of email your account will send.
     * </p>
     * 
     * @param mailType
     *        The type of email your account will send.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailType
     */

    public PutAccountDetailsRequest withMailType(String mailType) {
        setMailType(mailType);
        return this;
    }

    /**
     * <p>
     * The type of email your account will send.
     * </p>
     * 
     * @param mailType
     *        The type of email your account will send.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailType
     */

    public PutAccountDetailsRequest withMailType(MailType mailType) {
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

    public PutAccountDetailsRequest withWebsiteURL(String websiteURL) {
        setWebsiteURL(websiteURL);
        return this;
    }

    /**
     * <p>
     * The language you would prefer to be contacted with.
     * </p>
     * 
     * @param contactLanguage
     *        The language you would prefer to be contacted with.
     * @see ContactLanguage
     */

    public void setContactLanguage(String contactLanguage) {
        this.contactLanguage = contactLanguage;
    }

    /**
     * <p>
     * The language you would prefer to be contacted with.
     * </p>
     * 
     * @return The language you would prefer to be contacted with.
     * @see ContactLanguage
     */

    public String getContactLanguage() {
        return this.contactLanguage;
    }

    /**
     * <p>
     * The language you would prefer to be contacted with.
     * </p>
     * 
     * @param contactLanguage
     *        The language you would prefer to be contacted with.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactLanguage
     */

    public PutAccountDetailsRequest withContactLanguage(String contactLanguage) {
        setContactLanguage(contactLanguage);
        return this;
    }

    /**
     * <p>
     * The language you would prefer to be contacted with.
     * </p>
     * 
     * @param contactLanguage
     *        The language you would prefer to be contacted with.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactLanguage
     */

    public PutAccountDetailsRequest withContactLanguage(ContactLanguage contactLanguage) {
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

    public PutAccountDetailsRequest withUseCaseDescription(String useCaseDescription) {
        setUseCaseDescription(useCaseDescription);
        return this;
    }

    /**
     * <p>
     * Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * </p>
     * 
     * @return Additional email addresses that you would like to be notified regarding Amazon SES matters.
     */

    public java.util.List<String> getAdditionalContactEmailAddresses() {
        return additionalContactEmailAddresses;
    }

    /**
     * <p>
     * Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * </p>
     * 
     * @param additionalContactEmailAddresses
     *        Additional email addresses that you would like to be notified regarding Amazon SES matters.
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
     * Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalContactEmailAddresses(java.util.Collection)} or
     * {@link #withAdditionalContactEmailAddresses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalContactEmailAddresses
     *        Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountDetailsRequest withAdditionalContactEmailAddresses(String... additionalContactEmailAddresses) {
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
     * Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * </p>
     * 
     * @param additionalContactEmailAddresses
     *        Additional email addresses that you would like to be notified regarding Amazon SES matters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountDetailsRequest withAdditionalContactEmailAddresses(java.util.Collection<String> additionalContactEmailAddresses) {
        setAdditionalContactEmailAddresses(additionalContactEmailAddresses);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not your account should have production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @param productionAccessEnabled
     *        Indicates whether or not your account should have production access in the current AWS Region.</p>
     *        <p>
     *        If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *        the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *        you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *        send per second (your maximum sending rate) is 1.
     *        </p>
     *        <p>
     *        If the value is <code>true</code>, then your account has production access. When your account has
     *        production access, you can send email to any address. The sending quota and maximum sending rate for your
     *        account vary based on your specific use case.
     */

    public void setProductionAccessEnabled(Boolean productionAccessEnabled) {
        this.productionAccessEnabled = productionAccessEnabled;
    }

    /**
     * <p>
     * Indicates whether or not your account should have production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @return Indicates whether or not your account should have production access in the current AWS Region.</p>
     *         <p>
     *         If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *         the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *         you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *         send per second (your maximum sending rate) is 1.
     *         </p>
     *         <p>
     *         If the value is <code>true</code>, then your account has production access. When your account has
     *         production access, you can send email to any address. The sending quota and maximum sending rate for your
     *         account vary based on your specific use case.
     */

    public Boolean getProductionAccessEnabled() {
        return this.productionAccessEnabled;
    }

    /**
     * <p>
     * Indicates whether or not your account should have production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @param productionAccessEnabled
     *        Indicates whether or not your account should have production access in the current AWS Region.</p>
     *        <p>
     *        If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *        the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *        you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *        send per second (your maximum sending rate) is 1.
     *        </p>
     *        <p>
     *        If the value is <code>true</code>, then your account has production access. When your account has
     *        production access, you can send email to any address. The sending quota and maximum sending rate for your
     *        account vary based on your specific use case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountDetailsRequest withProductionAccessEnabled(Boolean productionAccessEnabled) {
        setProductionAccessEnabled(productionAccessEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not your account should have production access in the current AWS Region.
     * </p>
     * <p>
     * If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in the
     * sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send
     * in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your
     * maximum sending rate) is 1.
     * </p>
     * <p>
     * If the value is <code>true</code>, then your account has production access. When your account has production
     * access, you can send email to any address. The sending quota and maximum sending rate for your account vary based
     * on your specific use case.
     * </p>
     * 
     * @return Indicates whether or not your account should have production access in the current AWS Region.</p>
     *         <p>
     *         If the value is <code>false</code>, then your account is in the <i>sandbox</i>. When your account is in
     *         the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails
     *         you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can
     *         send per second (your maximum sending rate) is 1.
     *         </p>
     *         <p>
     *         If the value is <code>true</code>, then your account has production access. When your account has
     *         production access, you can send email to any address. The sending quota and maximum sending rate for your
     *         account vary based on your specific use case.
     */

    public Boolean isProductionAccessEnabled() {
        return this.productionAccessEnabled;
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
        if (getProductionAccessEnabled() != null)
            sb.append("ProductionAccessEnabled: ").append(getProductionAccessEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountDetailsRequest == false)
            return false;
        PutAccountDetailsRequest other = (PutAccountDetailsRequest) obj;
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
        if (other.getProductionAccessEnabled() == null ^ this.getProductionAccessEnabled() == null)
            return false;
        if (other.getProductionAccessEnabled() != null && other.getProductionAccessEnabled().equals(this.getProductionAccessEnabled()) == false)
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
        hashCode = prime * hashCode + ((getProductionAccessEnabled() == null) ? 0 : getProductionAccessEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountDetailsRequest clone() {
        return (PutAccountDetailsRequest) super.clone();
    }

}
