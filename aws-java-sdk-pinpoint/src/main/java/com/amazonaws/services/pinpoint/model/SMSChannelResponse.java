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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * SMS Channel Response.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SMSChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID of the application to which the SMS channel belongs. */
    private String applicationId;
    /** The date that the settings were last updated in ISO 8601 format. */
    private String creationDate;
    /** If the channel is enabled for sending messages. */
    private Boolean enabled;
    /** Not used. Retained for backwards compatibility. */
    private Boolean hasCredential;
    /** Channel ID. Not used, only for backwards compatibility. */
    private String id;
    /** Is this channel archived */
    private Boolean isArchived;
    /** Who last updated this entry */
    private String lastModifiedBy;
    /** Last date this was updated */
    private String lastModifiedDate;
    /** Platform type. Will be "SMS" */
    private String platform;
    /** Promotional messages per second that can be sent */
    private Integer promotionalMessagesPerSecond;
    /** Sender identifier of your messages. */
    private String senderId;
    /** The short code registered with the phone provider. */
    private String shortCode;
    /** Transactional messages per second that can be sent */
    private Integer transactionalMessagesPerSecond;
    /** Version of channel */
    private Integer version;

    /**
     * The unique ID of the application to which the SMS channel belongs.
     * 
     * @param applicationId
     *        The unique ID of the application to which the SMS channel belongs.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of the application to which the SMS channel belongs.
     * 
     * @return The unique ID of the application to which the SMS channel belongs.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID of the application to which the SMS channel belongs.
     * 
     * @param applicationId
     *        The unique ID of the application to which the SMS channel belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * 
     * @param creationDate
     *        The date that the settings were last updated in ISO 8601 format.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * 
     * @return The date that the settings were last updated in ISO 8601 format.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * 
     * @param creationDate
     *        The date that the settings were last updated in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @param enabled
     *        If the channel is enabled for sending messages.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @return If the channel is enabled for sending messages.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @param enabled
     *        If the channel is enabled for sending messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @return If the channel is enabled for sending messages.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @param hasCredential
     *        Not used. Retained for backwards compatibility.
     */

    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @return Not used. Retained for backwards compatibility.
     */

    public Boolean getHasCredential() {
        return this.hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @param hasCredential
     *        Not used. Retained for backwards compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withHasCredential(Boolean hasCredential) {
        setHasCredential(hasCredential);
        return this;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @return Not used. Retained for backwards compatibility.
     */

    public Boolean isHasCredential() {
        return this.hasCredential;
    }

    /**
     * Channel ID. Not used, only for backwards compatibility.
     * 
     * @param id
     *        Channel ID. Not used, only for backwards compatibility.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Channel ID. Not used, only for backwards compatibility.
     * 
     * @return Channel ID. Not used, only for backwards compatibility.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Channel ID. Not used, only for backwards compatibility.
     * 
     * @param id
     *        Channel ID. Not used, only for backwards compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Is this channel archived
     * 
     * @param isArchived
     *        Is this channel archived
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * Is this channel archived
     * 
     * @return Is this channel archived
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * Is this channel archived
     * 
     * @param isArchived
     *        Is this channel archived
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * Is this channel archived
     * 
     * @return Is this channel archived
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * Who last updated this entry
     * 
     * @param lastModifiedBy
     *        Who last updated this entry
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * Who last updated this entry
     * 
     * @return Who last updated this entry
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Who last updated this entry
     * 
     * @param lastModifiedBy
     *        Who last updated this entry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * Last date this was updated
     * 
     * @param lastModifiedDate
     *        Last date this was updated
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Last date this was updated
     * 
     * @return Last date this was updated
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Last date this was updated
     * 
     * @param lastModifiedDate
     *        Last date this was updated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * Platform type. Will be "SMS"
     * 
     * @param platform
     *        Platform type. Will be "SMS"
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Platform type. Will be "SMS"
     * 
     * @return Platform type. Will be "SMS"
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * Platform type. Will be "SMS"
     * 
     * @param platform
     *        Platform type. Will be "SMS"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * Promotional messages per second that can be sent
     * 
     * @param promotionalMessagesPerSecond
     *        Promotional messages per second that can be sent
     */

    public void setPromotionalMessagesPerSecond(Integer promotionalMessagesPerSecond) {
        this.promotionalMessagesPerSecond = promotionalMessagesPerSecond;
    }

    /**
     * Promotional messages per second that can be sent
     * 
     * @return Promotional messages per second that can be sent
     */

    public Integer getPromotionalMessagesPerSecond() {
        return this.promotionalMessagesPerSecond;
    }

    /**
     * Promotional messages per second that can be sent
     * 
     * @param promotionalMessagesPerSecond
     *        Promotional messages per second that can be sent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withPromotionalMessagesPerSecond(Integer promotionalMessagesPerSecond) {
        setPromotionalMessagesPerSecond(promotionalMessagesPerSecond);
        return this;
    }

    /**
     * Sender identifier of your messages.
     * 
     * @param senderId
     *        Sender identifier of your messages.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sender identifier of your messages.
     * 
     * @return Sender identifier of your messages.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * Sender identifier of your messages.
     * 
     * @param senderId
     *        Sender identifier of your messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * The short code registered with the phone provider.
     * 
     * @param shortCode
     *        The short code registered with the phone provider.
     */

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * The short code registered with the phone provider.
     * 
     * @return The short code registered with the phone provider.
     */

    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * The short code registered with the phone provider.
     * 
     * @param shortCode
     *        The short code registered with the phone provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withShortCode(String shortCode) {
        setShortCode(shortCode);
        return this;
    }

    /**
     * Transactional messages per second that can be sent
     * 
     * @param transactionalMessagesPerSecond
     *        Transactional messages per second that can be sent
     */

    public void setTransactionalMessagesPerSecond(Integer transactionalMessagesPerSecond) {
        this.transactionalMessagesPerSecond = transactionalMessagesPerSecond;
    }

    /**
     * Transactional messages per second that can be sent
     * 
     * @return Transactional messages per second that can be sent
     */

    public Integer getTransactionalMessagesPerSecond() {
        return this.transactionalMessagesPerSecond;
    }

    /**
     * Transactional messages per second that can be sent
     * 
     * @param transactionalMessagesPerSecond
     *        Transactional messages per second that can be sent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withTransactionalMessagesPerSecond(Integer transactionalMessagesPerSecond) {
        setTransactionalMessagesPerSecond(transactionalMessagesPerSecond);
        return this;
    }

    /**
     * Version of channel
     * 
     * @param version
     *        Version of channel
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * Version of channel
     * 
     * @return Version of channel
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * Version of channel
     * 
     * @param version
     *        Version of channel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withVersion(Integer version) {
        setVersion(version);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getHasCredential() != null)
            sb.append("HasCredential: ").append(getHasCredential()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPromotionalMessagesPerSecond() != null)
            sb.append("PromotionalMessagesPerSecond: ").append(getPromotionalMessagesPerSecond()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId()).append(",");
        if (getShortCode() != null)
            sb.append("ShortCode: ").append(getShortCode()).append(",");
        if (getTransactionalMessagesPerSecond() != null)
            sb.append("TransactionalMessagesPerSecond: ").append(getTransactionalMessagesPerSecond()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSChannelResponse == false)
            return false;
        SMSChannelResponse other = (SMSChannelResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPromotionalMessagesPerSecond() == null ^ this.getPromotionalMessagesPerSecond() == null)
            return false;
        if (other.getPromotionalMessagesPerSecond() != null && other.getPromotionalMessagesPerSecond().equals(this.getPromotionalMessagesPerSecond()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getShortCode() == null ^ this.getShortCode() == null)
            return false;
        if (other.getShortCode() != null && other.getShortCode().equals(this.getShortCode()) == false)
            return false;
        if (other.getTransactionalMessagesPerSecond() == null ^ this.getTransactionalMessagesPerSecond() == null)
            return false;
        if (other.getTransactionalMessagesPerSecond() != null
                && other.getTransactionalMessagesPerSecond().equals(this.getTransactionalMessagesPerSecond()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPromotionalMessagesPerSecond() == null) ? 0 : getPromotionalMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getShortCode() == null) ? 0 : getShortCode().hashCode());
        hashCode = prime * hashCode + ((getTransactionalMessagesPerSecond() == null) ? 0 : getTransactionalMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public SMSChannelResponse clone() {
        try {
            return (SMSChannelResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SMSChannelResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
