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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource that allows Enterprise account administrators to configure an interface to receive events from Amazon
 * Chime.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Bot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bot ID.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The bot display name.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The bot type.
     * </p>
     */
    private String botType;
    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;
    /**
     * <p>
     * The bot email address.
     * </p>
     */
    private String botEmail;
    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     * </p>
     */
    private String securityToken;

    /**
     * <p>
     * The bot ID.
     * </p>
     * 
     * @param botId
     *        The bot ID.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * 
     * @return The bot ID.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * 
     * @param botId
     *        The bot ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     * 
     * @param userId
     *        The unique ID for the bot user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     * 
     * @return The unique ID for the bot user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique ID for the bot user.
     * </p>
     * 
     * @param userId
     *        The unique ID for the bot user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The bot display name.
     * </p>
     * 
     * @param displayName
     *        The bot display name.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The bot display name.
     * </p>
     * 
     * @return The bot display name.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The bot display name.
     * </p>
     * 
     * @param displayName
     *        The bot display name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * 
     * @param botType
     *        The bot type.
     * @see BotType
     */

    public void setBotType(String botType) {
        this.botType = botType;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * 
     * @return The bot type.
     * @see BotType
     */

    public String getBotType() {
        return this.botType;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * 
     * @param botType
     *        The bot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotType
     */

    public Bot withBotType(String botType) {
        setBotType(botType);
        return this;
    }

    /**
     * <p>
     * The bot type.
     * </p>
     * 
     * @param botType
     *        The bot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotType
     */

    public Bot withBotType(BotType botType) {
        this.botType = botType.toString();
        return this;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     * 
     * @param disabled
     *        When true, the bot is stopped from running in your account.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     * 
     * @return When true, the bot is stopped from running in your account.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     * 
     * @param disabled
     *        When true, the bot is stopped from running in your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * When true, the bot is stopped from running in your account.
     * </p>
     * 
     * @return When true, the bot is stopped from running in your account.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The bot creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The bot creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The bot creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The bot creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated bot timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The updated bot timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The updated bot timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated bot timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The bot email address.
     * </p>
     * 
     * @param botEmail
     *        The bot email address.
     */

    public void setBotEmail(String botEmail) {
        this.botEmail = botEmail;
    }

    /**
     * <p>
     * The bot email address.
     * </p>
     * 
     * @return The bot email address.
     */

    public String getBotEmail() {
        return this.botEmail;
    }

    /**
     * <p>
     * The bot email address.
     * </p>
     * 
     * @param botEmail
     *        The bot email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withBotEmail(String botEmail) {
        setBotEmail(botEmail);
        return this;
    }

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     * </p>
     * 
     * @param securityToken
     *        The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     */

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     * </p>
     * 
     * @return The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     */

    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * <p>
     * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     * </p>
     * 
     * @param securityToken
     *        The security token used to authenticate Amazon Chime with the outgoing event endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bot withSecurityToken(String securityToken) {
        setSecurityToken(securityToken);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getBotType() != null)
            sb.append("BotType: ").append(getBotType()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getBotEmail() != null)
            sb.append("BotEmail: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecurityToken() != null)
            sb.append("SecurityToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bot == false)
            return false;
        Bot other = (Bot) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getBotType() == null ^ this.getBotType() == null)
            return false;
        if (other.getBotType() != null && other.getBotType().equals(this.getBotType()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getBotEmail() == null ^ this.getBotEmail() == null)
            return false;
        if (other.getBotEmail() != null && other.getBotEmail().equals(this.getBotEmail()) == false)
            return false;
        if (other.getSecurityToken() == null ^ this.getSecurityToken() == null)
            return false;
        if (other.getSecurityToken() != null && other.getSecurityToken().equals(this.getSecurityToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getBotType() == null) ? 0 : getBotType().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getBotEmail() == null) ? 0 : getBotEmail().hashCode());
        hashCode = prime * hashCode + ((getSecurityToken() == null) ? 0 : getSecurityToken().hashCode());
        return hashCode;
    }

    @Override
    public Bot clone() {
        try {
            return (Bot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.BotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
