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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an association between an Amazon Lex bot and an external messaging platform.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/BotChannelAssociation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotChannelAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     */
    private String botAlias;
    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     * </p>
     * </note>
     */
    private String botName;
    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot
     * and the external messaging platform.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Provides information necessary to communicate with the messaging platform.
     * </p>
     */
    private java.util.Map<String, String> botConfiguration;
    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For information about the reason for the failure,
     * see the <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create the
     * association.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     * 
     * @param name
     *        The name of the association between the bot and the channel.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     * 
     * @return The name of the association between the bot and the channel.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the association between the bot and the channel.
     * </p>
     * 
     * @param name
     *        The name of the association between the bot and the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * 
     * @param description
     *        A text description of the association you are creating.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * 
     * @return A text description of the association you are creating.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A text description of the association you are creating.
     * </p>
     * 
     * @param description
     *        A text description of the association you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     * 
     * @param botAlias
     *        An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     * 
     * @return An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     * 
     * @param botAlias
     *        An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withBotAlias(String botAlias) {
        setBotAlias(botAlias);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     * </p>
     * </note>
     * 
     * @param botName
     *        The name of the Amazon Lex bot to which this association is being made. </p> <note>
     *        <p>
     *        Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     *        </p>
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     * </p>
     * </note>
     * 
     * @return The name of the Amazon Lex bot to which this association is being made. </p> <note>
     *         <p>
     *         Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     *         </p>
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot to which this association is being made.
     * </p>
     * <note>
     * <p>
     * Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     * </p>
     * </note>
     * 
     * @param botName
     *        The name of the Amazon Lex bot to which this association is being made. </p> <note>
     *        <p>
     *        Currently, Amazon Lex supports associations with Facebook and Slack, and Twilio.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the association between the Amazon Lex bot and the channel was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel was created.
     * </p>
     * 
     * @return The date that the association between the Amazon Lex bot and the channel was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the association between the Amazon Lex bot and the channel was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the association between the Amazon Lex bot and the channel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot
     * and the external messaging platform.
     * </p>
     * 
     * @param type
     *        Specifies the type of association by indicating the type of channel being established between the Amazon
     *        Lex bot and the external messaging platform.
     * @see ChannelType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot
     * and the external messaging platform.
     * </p>
     * 
     * @return Specifies the type of association by indicating the type of channel being established between the Amazon
     *         Lex bot and the external messaging platform.
     * @see ChannelType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot
     * and the external messaging platform.
     * </p>
     * 
     * @param type
     *        Specifies the type of association by indicating the type of channel being established between the Amazon
     *        Lex bot and the external messaging platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public BotChannelAssociation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot
     * and the external messaging platform.
     * </p>
     * 
     * @param type
     *        Specifies the type of association by indicating the type of channel being established between the Amazon
     *        Lex bot and the external messaging platform.
     * @see ChannelType
     */

    public void setType(ChannelType type) {
        withType(type);
    }

    /**
     * <p>
     * Specifies the type of association by indicating the type of channel being established between the Amazon Lex bot
     * and the external messaging platform.
     * </p>
     * 
     * @param type
     *        Specifies the type of association by indicating the type of channel being established between the Amazon
     *        Lex bot and the external messaging platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelType
     */

    public BotChannelAssociation withType(ChannelType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging platform.
     * </p>
     * 
     * @return Provides information necessary to communicate with the messaging platform.
     */

    public java.util.Map<String, String> getBotConfiguration() {
        return botConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging platform.
     * </p>
     * 
     * @param botConfiguration
     *        Provides information necessary to communicate with the messaging platform.
     */

    public void setBotConfiguration(java.util.Map<String, String> botConfiguration) {
        this.botConfiguration = botConfiguration;
    }

    /**
     * <p>
     * Provides information necessary to communicate with the messaging platform.
     * </p>
     * 
     * @param botConfiguration
     *        Provides information necessary to communicate with the messaging platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withBotConfiguration(java.util.Map<String, String> botConfiguration) {
        setBotConfiguration(botConfiguration);
        return this;
    }

    public BotChannelAssociation addBotConfigurationEntry(String key, String value) {
        if (null == this.botConfiguration) {
            this.botConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.botConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.botConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BotConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation clearBotConfigurationEntries() {
        this.botConfiguration = null;
        return this;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For information about the reason for the failure,
     * see the <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bot channel. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The channel has been created and is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Channel creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - There was an error creating the channel. For information about the reason for the
     *        failure, see the <code>failureReason</code> field.
     *        </p>
     *        </li>
     * @see ChannelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For information about the reason for the failure,
     * see the <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the bot channel. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - The channel has been created and is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - Channel creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - There was an error creating the channel. For information about the reason for the
     *         failure, see the <code>failureReason</code> field.
     *         </p>
     *         </li>
     * @see ChannelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For information about the reason for the failure,
     * see the <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bot channel. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The channel has been created and is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Channel creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - There was an error creating the channel. For information about the reason for the
     *        failure, see the <code>failureReason</code> field.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelStatus
     */

    public BotChannelAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For information about the reason for the failure,
     * see the <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bot channel. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The channel has been created and is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Channel creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - There was an error creating the channel. For information about the reason for the
     *        failure, see the <code>failureReason</code> field.
     *        </p>
     *        </li>
     * @see ChannelStatus
     */

    public void setStatus(ChannelStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the bot channel.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The channel has been created and is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - Channel creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - There was an error creating the channel. For information about the reason for the failure,
     * see the <code>failureReason</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the bot channel. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The channel has been created and is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - Channel creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - There was an error creating the channel. For information about the reason for the
     *        failure, see the <code>failureReason</code> field.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelStatus
     */

    public BotChannelAssociation withStatus(ChannelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create the
     * association.
     * </p>
     * 
     * @param failureReason
     *        If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create the
     *        association.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create the
     * association.
     * </p>
     * 
     * @return If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create
     *         the association.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create the
     * association.
     * </p>
     * 
     * @param failureReason
     *        If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to create the
     *        association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotChannelAssociation withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotAlias() != null)
            sb.append("BotAlias: ").append(getBotAlias()).append(",");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getBotConfiguration() != null)
            sb.append("BotConfiguration: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotChannelAssociation == false)
            return false;
        BotChannelAssociation other = (BotChannelAssociation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getBotConfiguration() == null ^ this.getBotConfiguration() == null)
            return false;
        if (other.getBotConfiguration() != null && other.getBotConfiguration().equals(this.getBotConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getBotConfiguration() == null) ? 0 : getBotConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public BotChannelAssociation clone() {
        try {
            return (BotChannelAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.BotChannelAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
