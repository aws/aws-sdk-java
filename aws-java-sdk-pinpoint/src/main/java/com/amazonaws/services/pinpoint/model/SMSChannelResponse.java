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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the status and settings of the SMS channel for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SMSChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that the SMS channel applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was enabled.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * Specifies whether the SMS channel is enabled for the application.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     */
    private Boolean hasCredential;
    /**
     * <p>
     * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether the SMS channel is archived.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * The user who last modified the SMS channel.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The maximum number of promotional messages that you can send through the SMS channel each second.
     * </p>
     */
    private Integer promotionalMessagesPerSecond;
    /**
     * <p>
     * The identity that displays on recipients' devices when they receive messages from the SMS channel.
     * </p>
     */
    private String senderId;
    /**
     * <p>
     * The registered short code to use when you send messages through the SMS channel.
     * </p>
     */
    private String shortCode;
    /**
     * <p>
     * The maximum number of transactional messages that you can send through the SMS channel each second.
     * </p>
     */
    private Integer transactionalMessagesPerSecond;
    /**
     * <p>
     * The current version of the SMS channel.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the SMS channel applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the SMS channel applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the SMS channel applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the SMS channel applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the SMS channel applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the SMS channel applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was enabled.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in ISO 8601 format, when the SMS channel was enabled.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was enabled.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the SMS channel was enabled.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was enabled.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in ISO 8601 format, when the SMS channel was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is enabled for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the SMS channel is enabled for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is enabled for the application.
     * </p>
     * 
     * @return Specifies whether the SMS channel is enabled for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is enabled for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the SMS channel is enabled for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is enabled for the application.
     * </p>
     * 
     * @return Specifies whether the SMS channel is enabled for the application.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @param hasCredential
     *        (Not used) This property is retained only for backward compatibility.
     */

    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Not used) This property is retained only for backward compatibility.
     */

    public Boolean getHasCredential() {
        return this.hasCredential;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @param hasCredential
     *        (Not used) This property is retained only for backward compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withHasCredential(Boolean hasCredential) {
        setHasCredential(hasCredential);
        return this;
    }

    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Not used) This property is retained only for backward compatibility.
     */

    public Boolean isHasCredential() {
        return this.hasCredential;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @param id
     *        (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Deprecated) An identifier for the SMS channel. This property is retained only for backward
     *         compatibility.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @param id
     *        (Deprecated) An identifier for the SMS channel. This property is retained only for backward compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is archived.
     * </p>
     * 
     * @param isArchived
     *        Specifies whether the SMS channel is archived.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is archived.
     * </p>
     * 
     * @return Specifies whether the SMS channel is archived.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is archived.
     * </p>
     * 
     * @param isArchived
     *        Specifies whether the SMS channel is archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Specifies whether the SMS channel is archived.
     * </p>
     * 
     * @return Specifies whether the SMS channel is archived.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * The user who last modified the SMS channel.
     * </p>
     * 
     * @param lastModifiedBy
     *        The user who last modified the SMS channel.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the SMS channel.
     * </p>
     * 
     * @return The user who last modified the SMS channel.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the SMS channel.
     * </p>
     * 
     * @param lastModifiedBy
     *        The user who last modified the SMS channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in ISO 8601 format, when the SMS channel was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was last modified.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the SMS channel was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the SMS channel was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in ISO 8601 format, when the SMS channel was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     * </p>
     * 
     * @param platform
     *        The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     * </p>
     * 
     * @return The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     * </p>
     * 
     * @param platform
     *        The type of messaging or notification platform for the channel. For the SMS channel, this value is SMS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The maximum number of promotional messages that you can send through the SMS channel each second.
     * </p>
     * 
     * @param promotionalMessagesPerSecond
     *        The maximum number of promotional messages that you can send through the SMS channel each second.
     */

    public void setPromotionalMessagesPerSecond(Integer promotionalMessagesPerSecond) {
        this.promotionalMessagesPerSecond = promotionalMessagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of promotional messages that you can send through the SMS channel each second.
     * </p>
     * 
     * @return The maximum number of promotional messages that you can send through the SMS channel each second.
     */

    public Integer getPromotionalMessagesPerSecond() {
        return this.promotionalMessagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of promotional messages that you can send through the SMS channel each second.
     * </p>
     * 
     * @param promotionalMessagesPerSecond
     *        The maximum number of promotional messages that you can send through the SMS channel each second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withPromotionalMessagesPerSecond(Integer promotionalMessagesPerSecond) {
        setPromotionalMessagesPerSecond(promotionalMessagesPerSecond);
        return this;
    }

    /**
     * <p>
     * The identity that displays on recipients' devices when they receive messages from the SMS channel.
     * </p>
     * 
     * @param senderId
     *        The identity that displays on recipients' devices when they receive messages from the SMS channel.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * <p>
     * The identity that displays on recipients' devices when they receive messages from the SMS channel.
     * </p>
     * 
     * @return The identity that displays on recipients' devices when they receive messages from the SMS channel.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * <p>
     * The identity that displays on recipients' devices when they receive messages from the SMS channel.
     * </p>
     * 
     * @param senderId
     *        The identity that displays on recipients' devices when they receive messages from the SMS channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * <p>
     * The registered short code to use when you send messages through the SMS channel.
     * </p>
     * 
     * @param shortCode
     *        The registered short code to use when you send messages through the SMS channel.
     */

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * <p>
     * The registered short code to use when you send messages through the SMS channel.
     * </p>
     * 
     * @return The registered short code to use when you send messages through the SMS channel.
     */

    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * <p>
     * The registered short code to use when you send messages through the SMS channel.
     * </p>
     * 
     * @param shortCode
     *        The registered short code to use when you send messages through the SMS channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withShortCode(String shortCode) {
        setShortCode(shortCode);
        return this;
    }

    /**
     * <p>
     * The maximum number of transactional messages that you can send through the SMS channel each second.
     * </p>
     * 
     * @param transactionalMessagesPerSecond
     *        The maximum number of transactional messages that you can send through the SMS channel each second.
     */

    public void setTransactionalMessagesPerSecond(Integer transactionalMessagesPerSecond) {
        this.transactionalMessagesPerSecond = transactionalMessagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of transactional messages that you can send through the SMS channel each second.
     * </p>
     * 
     * @return The maximum number of transactional messages that you can send through the SMS channel each second.
     */

    public Integer getTransactionalMessagesPerSecond() {
        return this.transactionalMessagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of transactional messages that you can send through the SMS channel each second.
     * </p>
     * 
     * @param transactionalMessagesPerSecond
     *        The maximum number of transactional messages that you can send through the SMS channel each second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelResponse withTransactionalMessagesPerSecond(Integer transactionalMessagesPerSecond) {
        setTransactionalMessagesPerSecond(transactionalMessagesPerSecond);
        return this;
    }

    /**
     * <p>
     * The current version of the SMS channel.
     * </p>
     * 
     * @param version
     *        The current version of the SMS channel.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the SMS channel.
     * </p>
     * 
     * @return The current version of the SMS channel.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the SMS channel.
     * </p>
     * 
     * @param version
     *        The current version of the SMS channel.
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
