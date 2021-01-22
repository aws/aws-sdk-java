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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that contains the version.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The name of the bot that contains the version.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The version of the bot to describe.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The description specified for the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Data privacy settings for the bot version.
     * </p>
     */
    private DataPrivacy dataPrivacy;
    /**
     * <p>
     * The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code>, the bot version is ready for use.
     * </p>
     */
    private String botStatus;
    /**
     * <p>
     * If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version couldn't
     * be built.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * A timestamp of the date and time that the bot version was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The identifier of the bot that contains the version.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the version.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the version.
     * </p>
     * 
     * @return The identifier of the bot that contains the version.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the version.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The name of the bot that contains the version.
     * </p>
     * 
     * @param botName
     *        The name of the bot that contains the version.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that contains the version.
     * </p>
     * 
     * @return The name of the bot that contains the version.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot that contains the version.
     * </p>
     * 
     * @param botName
     *        The name of the bot that contains the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The version of the bot to describe.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to describe.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot to describe.
     * </p>
     * 
     * @return The version of the bot to describe.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot to describe.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The description specified for the bot.
     * </p>
     * 
     * @param description
     *        The description specified for the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description specified for the bot.
     * </p>
     * 
     * @return The description specified for the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description specified for the bot.
     * </p>
     * 
     * @param description
     *        The description specified for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Data privacy settings for the bot version.
     * </p>
     * 
     * @param dataPrivacy
     *        Data privacy settings for the bot version.
     */

    public void setDataPrivacy(DataPrivacy dataPrivacy) {
        this.dataPrivacy = dataPrivacy;
    }

    /**
     * <p>
     * Data privacy settings for the bot version.
     * </p>
     * 
     * @return Data privacy settings for the bot version.
     */

    public DataPrivacy getDataPrivacy() {
        return this.dataPrivacy;
    }

    /**
     * <p>
     * Data privacy settings for the bot version.
     * </p>
     * 
     * @param dataPrivacy
     *        Data privacy settings for the bot version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withDataPrivacy(DataPrivacy dataPrivacy) {
        setDataPrivacy(dataPrivacy);
        return this;
    }

    /**
     * <p>
     * The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     * </p>
     * 
     * @return The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The number of seconds that a session with the bot remains active before it is discarded by Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code>, the bot version is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code>, the bot version is ready for
     *        use.
     * @see BotStatus
     */

    public void setBotStatus(String botStatus) {
        this.botStatus = botStatus;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code>, the bot version is ready for use.
     * </p>
     * 
     * @return The current status of the bot. When the status is <code>Available</code>, the bot version is ready for
     *         use.
     * @see BotStatus
     */

    public String getBotStatus() {
        return this.botStatus;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code>, the bot version is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code>, the bot version is ready for
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DescribeBotVersionResult withBotStatus(String botStatus) {
        setBotStatus(botStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the bot. When the status is <code>Available</code>, the bot version is ready for use.
     * </p>
     * 
     * @param botStatus
     *        The current status of the bot. When the status is <code>Available</code>, the bot version is ready for
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotStatus
     */

    public DescribeBotVersionResult withBotStatus(BotStatus botStatus) {
        this.botStatus = botStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version couldn't
     * be built.
     * </p>
     * 
     * @return If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version
     *         couldn't be built.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version couldn't
     * be built.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version
     *        couldn't be built.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version couldn't
     * be built.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version
     *        couldn't be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version couldn't
     * be built.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>botStatus</code> is <code>Failed</code>, this contains a list of reasons that the version
     *        couldn't be built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot version was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot version was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot version was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot version was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot version was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotVersionResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataPrivacy() != null)
            sb.append("DataPrivacy: ").append(getDataPrivacy()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getBotStatus() != null)
            sb.append("BotStatus: ").append(getBotStatus()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBotVersionResult == false)
            return false;
        DescribeBotVersionResult other = (DescribeBotVersionResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
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
        if (other.getBotStatus() == null ^ this.getBotStatus() == null)
            return false;
        if (other.getBotStatus() != null && other.getBotStatus().equals(this.getBotStatus()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPrivacy() == null) ? 0 : getDataPrivacy().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBotStatus() == null) ? 0 : getBotStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotVersionResult clone() {
        try {
            return (DescribeBotVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
