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
 * Provides a record of an event that affects a bot alias. For example, when the version of a bot that the alias points
 * to changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotAliasHistoryEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotAliasHistoryEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the bot that was used in the event.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The date and time that the event started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The version of the bot that was used in the event.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was used in the event.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that was used in the event.
     * </p>
     * 
     * @return The version of the bot that was used in the event.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that was used in the event.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was used in the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasHistoryEvent withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The date and time that the event started.
     * </p>
     * 
     * @param startDate
     *        The date and time that the event started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date and time that the event started.
     * </p>
     * 
     * @return The date and time that the event started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date and time that the event started.
     * </p>
     * 
     * @param startDate
     *        The date and time that the event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasHistoryEvent withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * 
     * @param endDate
     *        The date and time that the event ended.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * 
     * @return The date and time that the event ended.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * 
     * @param endDate
     *        The date and time that the event ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasHistoryEvent withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotAliasHistoryEvent == false)
            return false;
        BotAliasHistoryEvent other = (BotAliasHistoryEvent) obj;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        return hashCode;
    }

    @Override
    public BotAliasHistoryEvent clone() {
        try {
            return (BotAliasHistoryEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotAliasHistoryEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
