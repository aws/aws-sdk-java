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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/DeleteSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that contained the session data.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The alias identifier in use for the bot that contained the session data.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The locale where the session was used.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the deleted session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * The identifier of the bot that contained the session data.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contained the session data.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contained the session data.
     * </p>
     * 
     * @return The identifier of the bot that contained the session data.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contained the session data.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contained the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that contained the session data.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier in use for the bot that contained the session data.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that contained the session data.
     * </p>
     * 
     * @return The alias identifier in use for the bot that contained the session data.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The alias identifier in use for the bot that contained the session data.
     * </p>
     * 
     * @param botAliasId
     *        The alias identifier in use for the bot that contained the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The locale where the session was used.
     * </p>
     * 
     * @param localeId
     *        The locale where the session was used.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale where the session was used.
     * </p>
     * 
     * @return The locale where the session was used.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale where the session was used.
     * </p>
     * 
     * @param localeId
     *        The locale where the session was used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the deleted session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the deleted session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the deleted session.
     * </p>
     * 
     * @return The identifier of the deleted session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the deleted session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the deleted session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSessionResult == false)
            return false;
        DeleteSessionResult other = (DeleteSessionResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSessionResult clone() {
        try {
            return (DeleteSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
