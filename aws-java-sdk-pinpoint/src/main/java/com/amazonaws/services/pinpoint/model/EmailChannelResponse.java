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
 * Email Channel Response.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EmailChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID of the application to which the email channel belongs. */
    private String applicationId;
    /** The configuration set that you want to use when you send email using the Pinpoint Email API. */
    private String configurationSet;
    /** The date that the settings were last updated in ISO 8601 format. */
    private String creationDate;
    /** If the channel is enabled for sending messages. */
    private Boolean enabled;
    /** The email address used to send emails from. */
    private String fromAddress;
    /** Not used. Retained for backwards compatibility. */
    private Boolean hasCredential;
    /** Channel ID. Not used, only for backwards compatibility. */
    private String id;
    /** The ARN of an identity verified with SES. */
    private String identity;
    /** Is this channel archived */
    private Boolean isArchived;
    /** Who last updated this entry */
    private String lastModifiedBy;
    /** Last date this was updated */
    private String lastModifiedDate;
    /** Messages per second that can be sent */
    private Integer messagesPerSecond;
    /** Platform type. Will be "EMAIL" */
    private String platform;
    /** The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service */
    private String roleArn;
    /** Version of channel */
    private Integer version;

    /**
     * The unique ID of the application to which the email channel belongs.
     * 
     * @param applicationId
     *        The unique ID of the application to which the email channel belongs.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of the application to which the email channel belongs.
     * 
     * @return The unique ID of the application to which the email channel belongs.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID of the application to which the email channel belongs.
     * 
     * @param applicationId
     *        The unique ID of the application to which the email channel belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The configuration set that you want to use when you send email using the Pinpoint Email API.
     * 
     * @param configurationSet
     *        The configuration set that you want to use when you send email using the Pinpoint Email API.
     */

    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * The configuration set that you want to use when you send email using the Pinpoint Email API.
     * 
     * @return The configuration set that you want to use when you send email using the Pinpoint Email API.
     */

    public String getConfigurationSet() {
        return this.configurationSet;
    }

    /**
     * The configuration set that you want to use when you send email using the Pinpoint Email API.
     * 
     * @param configurationSet
     *        The configuration set that you want to use when you send email using the Pinpoint Email API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withConfigurationSet(String configurationSet) {
        setConfigurationSet(configurationSet);
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

    public EmailChannelResponse withCreationDate(String creationDate) {
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

    public EmailChannelResponse withEnabled(Boolean enabled) {
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
     * The email address used to send emails from.
     * 
     * @param fromAddress
     *        The email address used to send emails from.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * The email address used to send emails from.
     * 
     * @return The email address used to send emails from.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * The email address used to send emails from.
     * 
     * @param fromAddress
     *        The email address used to send emails from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
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

    public EmailChannelResponse withHasCredential(Boolean hasCredential) {
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

    public EmailChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The ARN of an identity verified with SES.
     * 
     * @param identity
     *        The ARN of an identity verified with SES.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * The ARN of an identity verified with SES.
     * 
     * @return The ARN of an identity verified with SES.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * The ARN of an identity verified with SES.
     * 
     * @param identity
     *        The ARN of an identity verified with SES.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withIdentity(String identity) {
        setIdentity(identity);
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

    public EmailChannelResponse withIsArchived(Boolean isArchived) {
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

    public EmailChannelResponse withLastModifiedBy(String lastModifiedBy) {
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

    public EmailChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * Messages per second that can be sent
     * 
     * @param messagesPerSecond
     *        Messages per second that can be sent
     */

    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * Messages per second that can be sent
     * 
     * @return Messages per second that can be sent
     */

    public Integer getMessagesPerSecond() {
        return this.messagesPerSecond;
    }

    /**
     * Messages per second that can be sent
     * 
     * @param messagesPerSecond
     *        Messages per second that can be sent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withMessagesPerSecond(Integer messagesPerSecond) {
        setMessagesPerSecond(messagesPerSecond);
        return this;
    }

    /**
     * Platform type. Will be "EMAIL"
     * 
     * @param platform
     *        Platform type. Will be "EMAIL"
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * Platform type. Will be "EMAIL"
     * 
     * @return Platform type. Will be "EMAIL"
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * Platform type. Will be "EMAIL"
     * 
     * @param platform
     *        Platform type. Will be "EMAIL"
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
     * 
     * @param roleArn
     *        The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
     * 
     * @return The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
     * 
     * @param roleArn
     *        The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public EmailChannelResponse withVersion(Integer version) {
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
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: ").append(getConfigurationSet()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getFromAddress() != null)
            sb.append("FromAddress: ").append(getFromAddress()).append(",");
        if (getHasCredential() != null)
            sb.append("HasCredential: ").append(getHasCredential()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getMessagesPerSecond() != null)
            sb.append("MessagesPerSecond: ").append(getMessagesPerSecond()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof EmailChannelResponse == false)
            return false;
        EmailChannelResponse other = (EmailChannelResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getFromAddress() == null ^ this.getFromAddress() == null)
            return false;
        if (other.getFromAddress() != null && other.getFromAddress().equals(this.getFromAddress()) == false)
            return false;
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
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
        if (other.getMessagesPerSecond() == null ^ this.getMessagesPerSecond() == null)
            return false;
        if (other.getMessagesPerSecond() != null && other.getMessagesPerSecond().equals(this.getMessagesPerSecond()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getFromAddress() == null) ? 0 : getFromAddress().hashCode());
        hashCode = prime * hashCode + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getMessagesPerSecond() == null) ? 0 : getMessagesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public EmailChannelResponse clone() {
        try {
            return (EmailChannelResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EmailChannelResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
