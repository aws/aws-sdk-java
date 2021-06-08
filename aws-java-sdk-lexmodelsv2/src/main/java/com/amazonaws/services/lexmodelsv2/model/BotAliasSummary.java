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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about bot aliases returned from the <a>ListBotAliases</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotAliasSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotAliasSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the alias
     * using the <a>DescribeBotAlias</a> operation.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The name of the bot alias.
     * </p>
     */
    private String botAliasName;
    /**
     * <p>
     * The description of the bot alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the bot that the bot alias references.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * </p>
     */
    private String botAliasStatus;
    /**
     * <p>
     * A timestamp of the date and time that the bot alias was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the bot alias was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the alias
     * using the <a>DescribeBotAlias</a> operation.
     * </p>
     * 
     * @param botAliasId
     *        The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the
     *        alias using the <a>DescribeBotAlias</a> operation.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the alias
     * using the <a>DescribeBotAlias</a> operation.
     * </p>
     * 
     * @return The unique identifier assigned to the bot alias. You can use this ID to get detailed information about
     *         the alias using the <a>DescribeBotAlias</a> operation.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the alias
     * using the <a>DescribeBotAlias</a> operation.
     * </p>
     * 
     * @param botAliasId
     *        The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the
     *        alias using the <a>DescribeBotAlias</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasSummary withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The name of the bot alias.
     */

    public void setBotAliasName(String botAliasName) {
        this.botAliasName = botAliasName;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * 
     * @return The name of the bot alias.
     */

    public String getBotAliasName() {
        return this.botAliasName;
    }

    /**
     * <p>
     * The name of the bot alias.
     * </p>
     * 
     * @param botAliasName
     *        The name of the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasSummary withBotAliasName(String botAliasName) {
        setBotAliasName(botAliasName);
        return this;
    }

    /**
     * <p>
     * The description of the bot alias.
     * </p>
     * 
     * @param description
     *        The description of the bot alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the bot alias.
     * </p>
     * 
     * @return The description of the bot alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the bot alias.
     * </p>
     * 
     * @param description
     *        The description of the bot alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the bot that the bot alias references.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the bot alias references.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that the bot alias references.
     * </p>
     * 
     * @return The version of the bot that the bot alias references.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that the bot alias references.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the bot alias references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasSummary withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * </p>
     * 
     * @param botAliasStatus
     *        The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * @see BotAliasStatus
     */

    public void setBotAliasStatus(String botAliasStatus) {
        this.botAliasStatus = botAliasStatus;
    }

    /**
     * <p>
     * The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * </p>
     * 
     * @return The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * @see BotAliasStatus
     */

    public String getBotAliasStatus() {
        return this.botAliasStatus;
    }

    /**
     * <p>
     * The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * </p>
     * 
     * @param botAliasStatus
     *        The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public BotAliasSummary withBotAliasStatus(String botAliasStatus) {
        setBotAliasStatus(botAliasStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * </p>
     * 
     * @param botAliasStatus
     *        The current state of the bot alias. If the status is <code>Available</code>, the alias is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotAliasStatus
     */

    public BotAliasSummary withBotAliasStatus(BotAliasStatus botAliasStatus) {
        this.botAliasStatus = botAliasStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot alias was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot alias was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot alias was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot alias was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot alias was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot alias was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot alias was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot alias was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot alias was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot alias was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot alias was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot alias was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getBotAliasName() != null)
            sb.append("BotAliasName: ").append(getBotAliasName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotAliasStatus() != null)
            sb.append("BotAliasStatus: ").append(getBotAliasStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotAliasSummary == false)
            return false;
        BotAliasSummary other = (BotAliasSummary) obj;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotAliasName() == null ^ this.getBotAliasName() == null)
            return false;
        if (other.getBotAliasName() != null && other.getBotAliasName().equals(this.getBotAliasName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotAliasStatus() == null ^ this.getBotAliasStatus() == null)
            return false;
        if (other.getBotAliasStatus() != null && other.getBotAliasStatus().equals(this.getBotAliasStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasName() == null) ? 0 : getBotAliasName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotAliasStatus() == null) ? 0 : getBotAliasStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BotAliasSummary clone() {
        try {
            return (BotAliasSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotAliasSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
