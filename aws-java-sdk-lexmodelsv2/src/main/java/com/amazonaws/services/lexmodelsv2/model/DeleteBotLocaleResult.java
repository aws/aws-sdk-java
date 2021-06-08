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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBotLocale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotLocaleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that contained the deleted locale.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contained the deleted locale.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The language and locale of the deleted locale.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the locale
     * is deleted it no longer appears in the list of locales for the bot.
     * </p>
     */
    private String botLocaleStatus;

    /**
     * <p>
     * The identifier of the bot that contained the deleted locale.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contained the deleted locale.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contained the deleted locale.
     * </p>
     * 
     * @return The identifier of the bot that contained the deleted locale.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contained the deleted locale.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contained the deleted locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotLocaleResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contained the deleted locale.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contained the deleted locale.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contained the deleted locale.
     * </p>
     * 
     * @return The version of the bot that contained the deleted locale.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contained the deleted locale.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contained the deleted locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotLocaleResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The language and locale of the deleted locale.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the deleted locale.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale of the deleted locale.
     * </p>
     * 
     * @return The language and locale of the deleted locale.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale of the deleted locale.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the deleted locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotLocaleResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the locale
     * is deleted it no longer appears in the list of locales for the bot.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the
     *        locale is deleted it no longer appears in the list of locales for the bot.
     * @see BotLocaleStatus
     */

    public void setBotLocaleStatus(String botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus;
    }

    /**
     * <p>
     * The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the locale
     * is deleted it no longer appears in the list of locales for the bot.
     * </p>
     * 
     * @return The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the
     *         locale is deleted it no longer appears in the list of locales for the bot.
     * @see BotLocaleStatus
     */

    public String getBotLocaleStatus() {
        return this.botLocaleStatus;
    }

    /**
     * <p>
     * The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the locale
     * is deleted it no longer appears in the list of locales for the bot.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the
     *        locale is deleted it no longer appears in the list of locales for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public DeleteBotLocaleResult withBotLocaleStatus(String botLocaleStatus) {
        setBotLocaleStatus(botLocaleStatus);
        return this;
    }

    /**
     * <p>
     * The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the locale
     * is deleted it no longer appears in the list of locales for the bot.
     * </p>
     * 
     * @param botLocaleStatus
     *        The status of deleting the bot locale. The locale first enters the <code>Deleting</code> status. Once the
     *        locale is deleted it no longer appears in the list of locales for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotLocaleStatus
     */

    public DeleteBotLocaleResult withBotLocaleStatus(BotLocaleStatus botLocaleStatus) {
        this.botLocaleStatus = botLocaleStatus.toString();
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getBotLocaleStatus() != null)
            sb.append("BotLocaleStatus: ").append(getBotLocaleStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotLocaleResult == false)
            return false;
        DeleteBotLocaleResult other = (DeleteBotLocaleResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getBotLocaleStatus() == null ^ this.getBotLocaleStatus() == null)
            return false;
        if (other.getBotLocaleStatus() != null && other.getBotLocaleStatus().equals(this.getBotLocaleStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleStatus() == null) ? 0 : getBotLocaleStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotLocaleResult clone() {
        try {
            return (DeleteBotLocaleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
