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
 * Summary information about bot locales returned by the <a>ListBotLocales</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotLocaleSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotLocaleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language and locale of the bot locale.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The name of the bot locale.
     * </p>
     */
    private String localeName;
    /**
     * <p>
     * The description of the bot locale.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * </p>
     */
    private String botLocaleStatus;
    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last built.
     * </p>
     */
    private java.util.Date lastBuildSubmittedDateTime;

    /**
     * <p>
     * The language and locale of the bot locale.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the bot locale.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale of the bot locale.
     * </p>
     * 
     * @return The language and locale of the bot locale.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale of the bot locale.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleSummary withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The name of the bot locale.
     * </p>
     * 
     * @param localeName
     *        The name of the bot locale.
     */

    public void setLocaleName(String localeName) {
        this.localeName = localeName;
    }

    /**
     * <p>
     * The name of the bot locale.
     * </p>
     * 
     * @return The name of the bot locale.
     */

    public String getLocaleName() {
        return this.localeName;
    }

    /**
     * <p>
     * The name of the bot locale.
     * </p>
     * 
     * @param localeName
     *        The name of the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleSummary withLocaleName(String localeName) {
        setLocaleName(localeName);
        return this;
    }

    /**
     * <p>
     * The description of the bot locale.
     * </p>
     * 
     * @param description
     *        The description of the bot locale.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the bot locale.
     * </p>
     * 
     * @return The description of the bot locale.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the bot locale.
     * </p>
     * 
     * @param description
     *        The description of the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @param botLocaleStatus
     *        The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * @see BotLocaleStatus
     */

    public void setBotLocaleStatus(String botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus;
    }

    /**
     * <p>
     * The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @return The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * @see BotLocaleStatus
     */

    public String getBotLocaleStatus() {
        return this.botLocaleStatus;
    }

    /**
     * <p>
     * The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @param botLocaleStatus
     *        The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public BotLocaleSummary withBotLocaleStatus(String botLocaleStatus) {
        setBotLocaleStatus(botLocaleStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * </p>
     * 
     * @param botLocaleStatus
     *        The current status of the bot locale. When the status is <code>Built</code> the locale is ready for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public BotLocaleSummary withBotLocaleStatus(BotLocaleStatus botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot locale was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot locale was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot locale was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last built.
     * </p>
     * 
     * @param lastBuildSubmittedDateTime
     *        A timestamp of the date and time that the bot locale was last built.
     */

    public void setLastBuildSubmittedDateTime(java.util.Date lastBuildSubmittedDateTime) {
        this.lastBuildSubmittedDateTime = lastBuildSubmittedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last built.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot locale was last built.
     */

    public java.util.Date getLastBuildSubmittedDateTime() {
        return this.lastBuildSubmittedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot locale was last built.
     * </p>
     * 
     * @param lastBuildSubmittedDateTime
     *        A timestamp of the date and time that the bot locale was last built.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleSummary withLastBuildSubmittedDateTime(java.util.Date lastBuildSubmittedDateTime) {
        setLastBuildSubmittedDateTime(lastBuildSubmittedDateTime);
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
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getLocaleName() != null)
            sb.append("LocaleName: ").append(getLocaleName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotLocaleStatus() != null)
            sb.append("BotLocaleStatus: ").append(getBotLocaleStatus()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getLastBuildSubmittedDateTime() != null)
            sb.append("LastBuildSubmittedDateTime: ").append(getLastBuildSubmittedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotLocaleSummary == false)
            return false;
        BotLocaleSummary other = (BotLocaleSummary) obj;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getLocaleName() == null ^ this.getLocaleName() == null)
            return false;
        if (other.getLocaleName() != null && other.getLocaleName().equals(this.getLocaleName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotLocaleStatus() == null ^ this.getBotLocaleStatus() == null)
            return false;
        if (other.getBotLocaleStatus() != null && other.getBotLocaleStatus().equals(this.getBotLocaleStatus()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getLastBuildSubmittedDateTime() == null ^ this.getLastBuildSubmittedDateTime() == null)
            return false;
        if (other.getLastBuildSubmittedDateTime() != null && other.getLastBuildSubmittedDateTime().equals(this.getLastBuildSubmittedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getLocaleName() == null) ? 0 : getLocaleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleStatus() == null) ? 0 : getBotLocaleStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastBuildSubmittedDateTime() == null) ? 0 : getLastBuildSubmittedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BotLocaleSummary clone() {
        try {
            return (BotLocaleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotLocaleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
