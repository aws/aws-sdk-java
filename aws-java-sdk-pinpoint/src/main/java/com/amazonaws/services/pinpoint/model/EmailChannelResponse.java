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
 * Provides information about the status and settings of the email channel for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EmailChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that the email channel applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The configuration set that's applied to email that's sent through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     */
    private String configurationSet;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was enabled.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The verified email address that you send email from when you send email through the channel.
     * </p>
     */
    private String fromAddress;
    /**
     * <p>
     * (Not used) This property is retained only for backward compatibility.
     * </p>
     */
    private Boolean hasCredential;
    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * use when you send email through the channel.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The maximum number of emails that you can send through the channel each second.
     * </p>
     */
    private Integer messagesPerSecond;
    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related
     * event data for the channel.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The current version of the email channel.
     * </p>
     */
    private Integer version;

    /**
     * <p>
     * The unique identifier for the application that the email channel applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the email channel applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the email channel applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the email channel applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the email channel applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the email channel applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     * 
     * @param configurationSet
     *        The configuration set that's applied to email that's sent through the channel by using the <a
     *        href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     */

    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     * 
     * @return The configuration set that's applied to email that's sent through the channel by using the <a
     *         href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     */

    public String getConfigurationSet() {
        return this.configurationSet;
    }

    /**
     * <p>
     * The configuration set that's applied to email that's sent through the channel by using the <a
     * href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * </p>
     * 
     * @param configurationSet
     *        The configuration set that's applied to email that's sent through the channel by using the <a
     *        href="emailAPIreference.html">Amazon Pinpoint Email API</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withConfigurationSet(String configurationSet) {
        setConfigurationSet(configurationSet);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was enabled.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in ISO 8601 format, when the email channel was enabled.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was enabled.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the email channel was enabled.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was enabled.
     * </p>
     * 
     * @param creationDate
     *        The date and time, in ISO 8601 format, when the email channel was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the email channel is enabled for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     * 
     * @return Specifies whether the email channel is enabled for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the email channel is enabled for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the email channel is enabled for the application.
     * </p>
     * 
     * @return Specifies whether the email channel is enabled for the application.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The verified email address that you send email from when you send email through the channel.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address that you send email from when you send email through the channel.
     */

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * <p>
     * The verified email address that you send email from when you send email through the channel.
     * </p>
     * 
     * @return The verified email address that you send email from when you send email through the channel.
     */

    public String getFromAddress() {
        return this.fromAddress;
    }

    /**
     * <p>
     * The verified email address that you send email from when you send email through the channel.
     * </p>
     * 
     * @param fromAddress
     *        The verified email address that you send email from when you send email through the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withFromAddress(String fromAddress) {
        setFromAddress(fromAddress);
        return this;
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

    public EmailChannelResponse withHasCredential(Boolean hasCredential) {
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
     * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @param id
     *        (Deprecated) An identifier for the email channel. This property is retained only for backward
     *        compatibility.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @return (Deprecated) An identifier for the email channel. This property is retained only for backward
     *         compatibility.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * (Deprecated) An identifier for the email channel. This property is retained only for backward compatibility.
     * </p>
     * 
     * @param id
     *        (Deprecated) An identifier for the email channel. This property is retained only for backward
     *        compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * use when you send email through the channel.
     * </p>
     * 
     * @param identity
     *        <p>
     *        The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES),
     *        that you use when you send email through the channel.
     *        </p>
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * use when you send email through the channel.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES),
     *         that you use when you send email through the channel.
     *         </p>
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES), that you
     * use when you send email through the channel.
     * </p>
     * 
     * @param identity
     *        <p>
     *        The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service (Amazon SES),
     *        that you use when you send email through the channel.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     * 
     * @param isArchived
     *        Specifies whether the email channel is archived.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     * 
     * @return Specifies whether the email channel is archived.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     * 
     * @param isArchived
     *        Specifies whether the email channel is archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Specifies whether the email channel is archived.
     * </p>
     * 
     * @return Specifies whether the email channel is archived.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     * 
     * @param lastModifiedBy
     *        The user who last modified the email channel.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     * 
     * @return The user who last modified the email channel.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The user who last modified the email channel.
     * </p>
     * 
     * @param lastModifiedBy
     *        The user who last modified the email channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in ISO 8601 format, when the email channel was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last modified.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the email channel was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the email channel was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in ISO 8601 format, when the email channel was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each second.
     * </p>
     * 
     * @param messagesPerSecond
     *        The maximum number of emails that you can send through the channel each second.
     */

    public void setMessagesPerSecond(Integer messagesPerSecond) {
        this.messagesPerSecond = messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each second.
     * </p>
     * 
     * @return The maximum number of emails that you can send through the channel each second.
     */

    public Integer getMessagesPerSecond() {
        return this.messagesPerSecond;
    }

    /**
     * <p>
     * The maximum number of emails that you can send through the channel each second.
     * </p>
     * 
     * @param messagesPerSecond
     *        The maximum number of emails that you can send through the channel each second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withMessagesPerSecond(Integer messagesPerSecond) {
        setMessagesPerSecond(messagesPerSecond);
        return this;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
     * </p>
     * 
     * @param platform
     *        The type of messaging or notification platform for the channel. For the email channel, this value is
     *        EMAIL.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
     * </p>
     * 
     * @return The type of messaging or notification platform for the channel. For the email channel, this value is
     *         EMAIL.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The type of messaging or notification platform for the channel. For the email channel, this value is EMAIL.
     * </p>
     * 
     * @param platform
     *        The type of messaging or notification platform for the channel. For the email channel, this value is
     *        EMAIL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related
     * event data for the channel.
     * </p>
     * 
     * @param roleArn
     *        <p>
     *        The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit
     *        email-related event data for the channel.
     *        </p>
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related
     * event data for the channel.
     * </p>
     * 
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit
     *         email-related event data for the channel.
     *         </p>
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit email-related
     * event data for the channel.
     * </p>
     * 
     * @param roleArn
     *        <p>
     *        The ARN of the AWS Identity and Access Management (IAM) role that Amazon Pinpoint uses to submit
     *        email-related event data for the channel.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailChannelResponse withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     * 
     * @param version
     *        The current version of the email channel.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     * 
     * @return The current version of the email channel.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The current version of the email channel.
     * </p>
     * 
     * @param version
     *        The current version of the email channel.
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
