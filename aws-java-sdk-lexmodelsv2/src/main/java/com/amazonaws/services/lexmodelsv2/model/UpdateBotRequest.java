/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot to update. This identifier is returned by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The new name of the bot. The name must be unique in the account that creates the bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * A description of the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     * </p>
     */
    private DataPrivacy dataPrivacy;
    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * The type of the bot to be updated.
     * </p>
     */
    private String botType;
    /**
     * <p>
     * The list of bot members in the network associated with the update action.
     * </p>
     */
    private java.util.List<BotMember> botMembers;

    /**
     * <p>
     * The unique identifier of the bot to update. This identifier is returned by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to update. This identifier is returned by the <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to update. This identifier is returned by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     * </p>
     * 
     * @return The unique identifier of the bot to update. This identifier is returned by the <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to update. This identifier is returned by the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to update. This identifier is returned by the <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/APIReference/API_CreateBot.html">CreateBot</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The new name of the bot. The name must be unique in the account that creates the bot.
     * </p>
     * 
     * @param botName
     *        The new name of the bot. The name must be unique in the account that creates the bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The new name of the bot. The name must be unique in the account that creates the bot.
     * </p>
     * 
     * @return The new name of the bot. The name must be unique in the account that creates the bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The new name of the bot. The name must be unique in the account that creates the bot.
     * </p>
     * 
     * @param botName
     *        The new name of the bot. The name must be unique in the account that creates the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @return A description of the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permissions to access the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     * </p>
     * 
     * @param dataPrivacy
     *        Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     */

    public void setDataPrivacy(DataPrivacy dataPrivacy) {
        this.dataPrivacy = dataPrivacy;
    }

    /**
     * <p>
     * Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     * </p>
     * 
     * @return Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     */

    public DataPrivacy getDataPrivacy() {
        return this.dataPrivacy;
    }

    /**
     * <p>
     * Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     * </p>
     * 
     * @param dataPrivacy
     *        Provides information on additional privacy protections Amazon Lex should use with the bot's data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withDataPrivacy(DataPrivacy dataPrivacy) {
        setDataPrivacy(dataPrivacy);
        return this;
    }

    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The time, in seconds, that Amazon Lex should keep information about a user's conversation with the
     *        bot.</p>
     *        <p>
     *        A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *        time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *        </p>
     *        <p>
     *        You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     * 
     * @return The time, in seconds, that Amazon Lex should keep information about a user's conversation with the
     *         bot.</p>
     *         <p>
     *         A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *         time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *         </p>
     *         <p>
     *         You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The time, in seconds, that Amazon Lex should keep information about a user's conversation with the
     *        bot.</p>
     *        <p>
     *        A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *        time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *        </p>
     *        <p>
     *        You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * The type of the bot to be updated.
     * </p>
     * 
     * @param botType
     *        The type of the bot to be updated.
     * @see BotType
     */

    public void setBotType(String botType) {
        this.botType = botType;
    }

    /**
     * <p>
     * The type of the bot to be updated.
     * </p>
     * 
     * @return The type of the bot to be updated.
     * @see BotType
     */

    public String getBotType() {
        return this.botType;
    }

    /**
     * <p>
     * The type of the bot to be updated.
     * </p>
     * 
     * @param botType
     *        The type of the bot to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotType
     */

    public UpdateBotRequest withBotType(String botType) {
        setBotType(botType);
        return this;
    }

    /**
     * <p>
     * The type of the bot to be updated.
     * </p>
     * 
     * @param botType
     *        The type of the bot to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotType
     */

    public UpdateBotRequest withBotType(BotType botType) {
        this.botType = botType.toString();
        return this;
    }

    /**
     * <p>
     * The list of bot members in the network associated with the update action.
     * </p>
     * 
     * @return The list of bot members in the network associated with the update action.
     */

    public java.util.List<BotMember> getBotMembers() {
        return botMembers;
    }

    /**
     * <p>
     * The list of bot members in the network associated with the update action.
     * </p>
     * 
     * @param botMembers
     *        The list of bot members in the network associated with the update action.
     */

    public void setBotMembers(java.util.Collection<BotMember> botMembers) {
        if (botMembers == null) {
            this.botMembers = null;
            return;
        }

        this.botMembers = new java.util.ArrayList<BotMember>(botMembers);
    }

    /**
     * <p>
     * The list of bot members in the network associated with the update action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotMembers(java.util.Collection)} or {@link #withBotMembers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param botMembers
     *        The list of bot members in the network associated with the update action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withBotMembers(BotMember... botMembers) {
        if (this.botMembers == null) {
            setBotMembers(new java.util.ArrayList<BotMember>(botMembers.length));
        }
        for (BotMember ele : botMembers) {
            this.botMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of bot members in the network associated with the update action.
     * </p>
     * 
     * @param botMembers
     *        The list of bot members in the network associated with the update action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBotRequest withBotMembers(java.util.Collection<BotMember> botMembers) {
        setBotMembers(botMembers);
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataPrivacy() != null)
            sb.append("DataPrivacy: ").append(getDataPrivacy()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getBotType() != null)
            sb.append("BotType: ").append(getBotType()).append(",");
        if (getBotMembers() != null)
            sb.append("BotMembers: ").append(getBotMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBotRequest == false)
            return false;
        UpdateBotRequest other = (UpdateBotRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDataPrivacy() == null ^ this.getDataPrivacy() == null)
            return false;
        if (other.getDataPrivacy() != null && other.getDataPrivacy().equals(this.getDataPrivacy()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getBotType() == null ^ this.getBotType() == null)
            return false;
        if (other.getBotType() != null && other.getBotType().equals(this.getBotType()) == false)
            return false;
        if (other.getBotMembers() == null ^ this.getBotMembers() == null)
            return false;
        if (other.getBotMembers() != null && other.getBotMembers().equals(this.getBotMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPrivacy() == null) ? 0 : getDataPrivacy().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBotType() == null) ? 0 : getBotType().hashCode());
        hashCode = prime * hashCode + ((getBotMembers() == null) ? 0 : getBotMembers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBotRequest clone() {
        return (UpdateBotRequest) super.clone();
    }

}
