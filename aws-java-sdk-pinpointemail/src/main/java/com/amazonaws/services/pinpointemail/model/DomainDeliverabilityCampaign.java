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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the deliverability data for a specific campaign. This data is available for a campaign only
 * if the campaign sent email by using a domain that the Deliverability dashboard is enabled for (
 * <code>PutDeliverabilityDashboardOption</code> operation).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/DomainDeliverabilityCampaign"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDeliverabilityCampaign implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     */
    private String campaignId;
    /**
     * <p>
     * The URL of an image that contains a snapshot of the email message that was sent.
     * </p>
     */
    private String imageUrl;
    /**
     * <p>
     * The subject line, or title, of the email message.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The verified email address that the email message was sent from.
     * </p>
     */
    private String fromAddress;
    /**
     * <p>
     * The IP addresses that were used to send the email message.
     * </p>
     */
    private java.util.List<String> sendingIps;
    /**
     * <p>
     * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value
     * can help you determine how long it took for a campaign to deliver an email message.
     * </p>
     */
    private java.util.Date firstSeenDateTime;
    /**
     * <p>
     * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can
     * help you determine how long it took for a campaign to deliver an email message.
     * </p>
     */
    private java.util.Date lastSeenDateTime;
    /**
     * <p>
     * The number of email messages that were delivered to recipients’ inboxes.
     * </p>
     */
    private Long inboxCount;
    /**
     * <p>
     * The number of email messages that were delivered to recipients' spam or junk mail folders.
     * </p>
     */
    private Long spamCount;
    /**
     * <p>
     * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only
     * includes recipients who opened the message by using an email client that supports images.
     * </p>
     */
    private Double readRate;
    /**
     * <p>
     * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical
     * limitations, this value only includes recipients who opened the message by using an email client that supports
     * images.
     * </p>
     */
    private Double deleteRate;
    /**
     * <p>
     * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations,
     * this value only includes recipients who opened the message by using an email client that supports images.
     * </p>
     */
    private Double readDeleteRate;
    /**
     * <p>
     * The projected number of recipients that the email message was sent to.
     * </p>
     */
    private Long projectedVolume;
    /**
     * <p>
     * The major email providers who handled the email message.
     * </p>
     */
    private java.util.List<String> esps;

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     * 
     * @param campaignId
     *        The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this
     *        identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint
     *        assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint
     *        console.
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this
     *         identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint
     *         assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint
     *         console.
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a
     * campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that
     * you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
     * </p>
     * 
     * @param campaignId
     *        The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this
     *        identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint
     *        assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint
     *        console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * <p>
     * The URL of an image that contains a snapshot of the email message that was sent.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image that contains a snapshot of the email message that was sent.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image that contains a snapshot of the email message that was sent.
     * </p>
     * 
     * @return The URL of an image that contains a snapshot of the email message that was sent.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * <p>
     * The URL of an image that contains a snapshot of the email message that was sent.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image that contains a snapshot of the email message that was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * <p>
     * The subject line, or title, of the email message.
     * </p>
     * 
     * @param subject
     *        The subject line, or title, of the email message.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject line, or title, of the email message.
     * </p>
     * 
     * @return The subject line, or title, of the email message.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject line, or title, of the email message.
     * </p>
     * 
     * @param subject
     *        The subject line, or title, of the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The verified email address that the email message was sent from.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address that the email message was sent from.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address that the email message was sent from.
     * </p>
     * 
     * @return The verified email address that the email message was sent from.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * <p>
     * The verified email address that the email message was sent from.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address that the email message was sent from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
    }

    /**
     * <p>
     * The IP addresses that were used to send the email message.
     * </p>
     * 
     * @return The IP addresses that were used to send the email message.
     */

    public java.util.List<String> getSendingIps() {
        return sendingIps;
    }

    /**
     * <p>
     * The IP addresses that were used to send the email message.
     * </p>
     * 
     * @param sendingIps
     *        The IP addresses that were used to send the email message.
     */

    public void setSendingIps(java.util.Collection<String> sendingIps) {
        if (sendingIps == null) {
            this.sendingIps = null;
            return;
        }

        this.sendingIps = new java.util.ArrayList<String>(sendingIps);
    }

    /**
     * <p>
     * The IP addresses that were used to send the email message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSendingIps(java.util.Collection)} or {@link #withSendingIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sendingIps
     *        The IP addresses that were used to send the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withSendingIps(String... sendingIps) {
        if (this.sendingIps == null) {
            setSendingIps(new java.util.ArrayList<String>(sendingIps.length));
        }
        for (String ele : sendingIps) {
            this.sendingIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses that were used to send the email message.
     * </p>
     * 
     * @param sendingIps
     *        The IP addresses that were used to send the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withSendingIps(java.util.Collection<String> sendingIps) {
        setSendingIps(sendingIps);
        return this;
    }

    /**
     * <p>
     * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value
     * can help you determine how long it took for a campaign to deliver an email message.
     * </p>
     * 
     * @param firstSeenDateTime
     *        The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This
     *        value can help you determine how long it took for a campaign to deliver an email message.
     */

    public void setFirstSeenDateTime(java.util.Date firstSeenDateTime) {
        this.firstSeenDateTime = firstSeenDateTime;
    }

    /**
     * <p>
     * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value
     * can help you determine how long it took for a campaign to deliver an email message.
     * </p>
     * 
     * @return The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This
     *         value can help you determine how long it took for a campaign to deliver an email message.
     */

    public java.util.Date getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }

    /**
     * <p>
     * The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This value
     * can help you determine how long it took for a campaign to deliver an email message.
     * </p>
     * 
     * @param firstSeenDateTime
     *        The first time, in Unix time format, when the email message was delivered to any recipient's inbox. This
     *        value can help you determine how long it took for a campaign to deliver an email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withFirstSeenDateTime(java.util.Date firstSeenDateTime) {
        setFirstSeenDateTime(firstSeenDateTime);
        return this;
    }

    /**
     * <p>
     * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can
     * help you determine how long it took for a campaign to deliver an email message.
     * </p>
     * 
     * @param lastSeenDateTime
     *        The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This
     *        value can help you determine how long it took for a campaign to deliver an email message.
     */

    public void setLastSeenDateTime(java.util.Date lastSeenDateTime) {
        this.lastSeenDateTime = lastSeenDateTime;
    }

    /**
     * <p>
     * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can
     * help you determine how long it took for a campaign to deliver an email message.
     * </p>
     * 
     * @return The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This
     *         value can help you determine how long it took for a campaign to deliver an email message.
     */

    public java.util.Date getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }

    /**
     * <p>
     * The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This value can
     * help you determine how long it took for a campaign to deliver an email message.
     * </p>
     * 
     * @param lastSeenDateTime
     *        The last time, in Unix time format, when the email message was delivered to any recipient's inbox. This
     *        value can help you determine how long it took for a campaign to deliver an email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withLastSeenDateTime(java.util.Date lastSeenDateTime) {
        setLastSeenDateTime(lastSeenDateTime);
        return this;
    }

    /**
     * <p>
     * The number of email messages that were delivered to recipients’ inboxes.
     * </p>
     * 
     * @param inboxCount
     *        The number of email messages that were delivered to recipients’ inboxes.
     */

    public void setInboxCount(Long inboxCount) {
        this.inboxCount = inboxCount;
    }

    /**
     * <p>
     * The number of email messages that were delivered to recipients’ inboxes.
     * </p>
     * 
     * @return The number of email messages that were delivered to recipients’ inboxes.
     */

    public Long getInboxCount() {
        return this.inboxCount;
    }

    /**
     * <p>
     * The number of email messages that were delivered to recipients’ inboxes.
     * </p>
     * 
     * @param inboxCount
     *        The number of email messages that were delivered to recipients’ inboxes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withInboxCount(Long inboxCount) {
        setInboxCount(inboxCount);
        return this;
    }

    /**
     * <p>
     * The number of email messages that were delivered to recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamCount
     *        The number of email messages that were delivered to recipients' spam or junk mail folders.
     */

    public void setSpamCount(Long spamCount) {
        this.spamCount = spamCount;
    }

    /**
     * <p>
     * The number of email messages that were delivered to recipients' spam or junk mail folders.
     * </p>
     * 
     * @return The number of email messages that were delivered to recipients' spam or junk mail folders.
     */

    public Long getSpamCount() {
        return this.spamCount;
    }

    /**
     * <p>
     * The number of email messages that were delivered to recipients' spam or junk mail folders.
     * </p>
     * 
     * @param spamCount
     *        The number of email messages that were delivered to recipients' spam or junk mail folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withSpamCount(Long spamCount) {
        setSpamCount(spamCount);
        return this;
    }

    /**
     * <p>
     * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only
     * includes recipients who opened the message by using an email client that supports images.
     * </p>
     * 
     * @param readRate
     *        The percentage of email messages that were opened by recipients. Due to technical limitations, this value
     *        only includes recipients who opened the message by using an email client that supports images.
     */

    public void setReadRate(Double readRate) {
        this.readRate = readRate;
    }

    /**
     * <p>
     * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only
     * includes recipients who opened the message by using an email client that supports images.
     * </p>
     * 
     * @return The percentage of email messages that were opened by recipients. Due to technical limitations, this value
     *         only includes recipients who opened the message by using an email client that supports images.
     */

    public Double getReadRate() {
        return this.readRate;
    }

    /**
     * <p>
     * The percentage of email messages that were opened by recipients. Due to technical limitations, this value only
     * includes recipients who opened the message by using an email client that supports images.
     * </p>
     * 
     * @param readRate
     *        The percentage of email messages that were opened by recipients. Due to technical limitations, this value
     *        only includes recipients who opened the message by using an email client that supports images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withReadRate(Double readRate) {
        setReadRate(readRate);
        return this;
    }

    /**
     * <p>
     * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical
     * limitations, this value only includes recipients who opened the message by using an email client that supports
     * images.
     * </p>
     * 
     * @param deleteRate
     *        The percentage of email messages that were deleted by recipients, without being opened first. Due to
     *        technical limitations, this value only includes recipients who opened the message by using an email client
     *        that supports images.
     */

    public void setDeleteRate(Double deleteRate) {
        this.deleteRate = deleteRate;
    }

    /**
     * <p>
     * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical
     * limitations, this value only includes recipients who opened the message by using an email client that supports
     * images.
     * </p>
     * 
     * @return The percentage of email messages that were deleted by recipients, without being opened first. Due to
     *         technical limitations, this value only includes recipients who opened the message by using an email
     *         client that supports images.
     */

    public Double getDeleteRate() {
        return this.deleteRate;
    }

    /**
     * <p>
     * The percentage of email messages that were deleted by recipients, without being opened first. Due to technical
     * limitations, this value only includes recipients who opened the message by using an email client that supports
     * images.
     * </p>
     * 
     * @param deleteRate
     *        The percentage of email messages that were deleted by recipients, without being opened first. Due to
     *        technical limitations, this value only includes recipients who opened the message by using an email client
     *        that supports images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withDeleteRate(Double deleteRate) {
        setDeleteRate(deleteRate);
        return this;
    }

    /**
     * <p>
     * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations,
     * this value only includes recipients who opened the message by using an email client that supports images.
     * </p>
     * 
     * @param readDeleteRate
     *        The percentage of email messages that were opened and then deleted by recipients. Due to technical
     *        limitations, this value only includes recipients who opened the message by using an email client that
     *        supports images.
     */

    public void setReadDeleteRate(Double readDeleteRate) {
        this.readDeleteRate = readDeleteRate;
    }

    /**
     * <p>
     * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations,
     * this value only includes recipients who opened the message by using an email client that supports images.
     * </p>
     * 
     * @return The percentage of email messages that were opened and then deleted by recipients. Due to technical
     *         limitations, this value only includes recipients who opened the message by using an email client that
     *         supports images.
     */

    public Double getReadDeleteRate() {
        return this.readDeleteRate;
    }

    /**
     * <p>
     * The percentage of email messages that were opened and then deleted by recipients. Due to technical limitations,
     * this value only includes recipients who opened the message by using an email client that supports images.
     * </p>
     * 
     * @param readDeleteRate
     *        The percentage of email messages that were opened and then deleted by recipients. Due to technical
     *        limitations, this value only includes recipients who opened the message by using an email client that
     *        supports images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withReadDeleteRate(Double readDeleteRate) {
        setReadDeleteRate(readDeleteRate);
        return this;
    }

    /**
     * <p>
     * The projected number of recipients that the email message was sent to.
     * </p>
     * 
     * @param projectedVolume
     *        The projected number of recipients that the email message was sent to.
     */

    public void setProjectedVolume(Long projectedVolume) {
        this.projectedVolume = projectedVolume;
    }

    /**
     * <p>
     * The projected number of recipients that the email message was sent to.
     * </p>
     * 
     * @return The projected number of recipients that the email message was sent to.
     */

    public Long getProjectedVolume() {
        return this.projectedVolume;
    }

    /**
     * <p>
     * The projected number of recipients that the email message was sent to.
     * </p>
     * 
     * @param projectedVolume
     *        The projected number of recipients that the email message was sent to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withProjectedVolume(Long projectedVolume) {
        setProjectedVolume(projectedVolume);
        return this;
    }

    /**
     * <p>
     * The major email providers who handled the email message.
     * </p>
     * 
     * @return The major email providers who handled the email message.
     */

    public java.util.List<String> getEsps() {
        return esps;
    }

    /**
     * <p>
     * The major email providers who handled the email message.
     * </p>
     * 
     * @param esps
     *        The major email providers who handled the email message.
     */

    public void setEsps(java.util.Collection<String> esps) {
        if (esps == null) {
            this.esps = null;
            return;
        }

        this.esps = new java.util.ArrayList<String>(esps);
    }

    /**
     * <p>
     * The major email providers who handled the email message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEsps(java.util.Collection)} or {@link #withEsps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param esps
     *        The major email providers who handled the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withEsps(String... esps) {
        if (this.esps == null) {
            setEsps(new java.util.ArrayList<String>(esps.length));
        }
        for (String ele : esps) {
            this.esps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The major email providers who handled the email message.
     * </p>
     * 
     * @param esps
     *        The major email providers who handled the email message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDeliverabilityCampaign withEsps(java.util.Collection<String> esps) {
        setEsps(esps);
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
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: ").append(getImageUrl()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getFromAddress() != null)
            sb.append("FromAddress: ").append(getFromAddress()).append(",");
        if (getSendingIps() != null)
            sb.append("SendingIps: ").append(getSendingIps()).append(",");
        if (getFirstSeenDateTime() != null)
            sb.append("FirstSeenDateTime: ").append(getFirstSeenDateTime()).append(",");
        if (getLastSeenDateTime() != null)
            sb.append("LastSeenDateTime: ").append(getLastSeenDateTime()).append(",");
        if (getInboxCount() != null)
            sb.append("InboxCount: ").append(getInboxCount()).append(",");
        if (getSpamCount() != null)
            sb.append("SpamCount: ").append(getSpamCount()).append(",");
        if (getReadRate() != null)
            sb.append("ReadRate: ").append(getReadRate()).append(",");
        if (getDeleteRate() != null)
            sb.append("DeleteRate: ").append(getDeleteRate()).append(",");
        if (getReadDeleteRate() != null)
            sb.append("ReadDeleteRate: ").append(getReadDeleteRate()).append(",");
        if (getProjectedVolume() != null)
            sb.append("ProjectedVolume: ").append(getProjectedVolume()).append(",");
        if (getEsps() != null)
            sb.append("Esps: ").append(getEsps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDeliverabilityCampaign == false)
            return false;
        DomainDeliverabilityCampaign other = (DomainDeliverabilityCampaign) obj;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getSendingIps() == null ^ this.getSendingIps() == null)
            return false;
        if (other.getSendingIps() != null && other.getSendingIps().equals(this.getSendingIps()) == false)
            return false;
        if (other.getFirstSeenDateTime() == null ^ this.getFirstSeenDateTime() == null)
            return false;
        if (other.getFirstSeenDateTime() != null && other.getFirstSeenDateTime().equals(this.getFirstSeenDateTime()) == false)
            return false;
        if (other.getLastSeenDateTime() == null ^ this.getLastSeenDateTime() == null)
            return false;
        if (other.getLastSeenDateTime() != null && other.getLastSeenDateTime().equals(this.getLastSeenDateTime()) == false)
            return false;
        if (other.getInboxCount() == null ^ this.getInboxCount() == null)
            return false;
        if (other.getInboxCount() != null && other.getInboxCount().equals(this.getInboxCount()) == false)
            return false;
        if (other.getSpamCount() == null ^ this.getSpamCount() == null)
            return false;
        if (other.getSpamCount() != null && other.getSpamCount().equals(this.getSpamCount()) == false)
            return false;
        if (other.getReadRate() == null ^ this.getReadRate() == null)
            return false;
        if (other.getReadRate() != null && other.getReadRate().equals(this.getReadRate()) == false)
            return false;
        if (other.getDeleteRate() == null ^ this.getDeleteRate() == null)
            return false;
        if (other.getDeleteRate() != null && other.getDeleteRate().equals(this.getDeleteRate()) == false)
            return false;
        if (other.getReadDeleteRate() == null ^ this.getReadDeleteRate() == null)
            return false;
        if (other.getReadDeleteRate() != null && other.getReadDeleteRate().equals(this.getReadDeleteRate()) == false)
            return false;
        if (other.getProjectedVolume() == null ^ this.getProjectedVolume() == null)
            return false;
        if (other.getProjectedVolume() != null && other.getProjectedVolume().equals(this.getProjectedVolume()) == false)
            return false;
        if (other.getEsps() == null ^ this.getEsps() == null)
            return false;
        if (other.getEsps() != null && other.getEsps().equals(this.getEsps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getSendingIps() == null) ? 0 : getSendingIps().hashCode());
        hashCode = prime * hashCode + ((getFirstSeenDateTime() == null) ? 0 : getFirstSeenDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastSeenDateTime() == null) ? 0 : getLastSeenDateTime().hashCode());
        hashCode = prime * hashCode + ((getInboxCount() == null) ? 0 : getInboxCount().hashCode());
        hashCode = prime * hashCode + ((getSpamCount() == null) ? 0 : getSpamCount().hashCode());
        hashCode = prime * hashCode + ((getReadRate() == null) ? 0 : getReadRate().hashCode());
        hashCode = prime * hashCode + ((getDeleteRate() == null) ? 0 : getDeleteRate().hashCode());
        hashCode = prime * hashCode + ((getReadDeleteRate() == null) ? 0 : getReadDeleteRate().hashCode());
        hashCode = prime * hashCode + ((getProjectedVolume() == null) ? 0 : getProjectedVolume().hashCode());
        hashCode = prime * hashCode + ((getEsps() == null) ? 0 : getEsps().hashCode());
        return hashCode;
    }

    @Override
    public DomainDeliverabilityCampaign clone() {
        try {
            return (DomainDeliverabilityCampaign) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DomainDeliverabilityCampaignMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
