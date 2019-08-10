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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/DeleteSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     */
    private String botAlias;
    /**
     * <p>
     * The ID of the client application user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     * 
     * @param botName
     *        The name of the bot associated with the session data.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     * 
     * @return The name of the bot associated with the session data.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot associated with the session data.
     * </p>
     * 
     * @param botName
     *        The name of the bot associated with the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     * 
     * @param botAlias
     *        The alias in use for the bot associated with the session data.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     * 
     * @return The alias in use for the bot associated with the session data.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * The alias in use for the bot associated with the session data.
     * </p>
     * 
     * @param botAlias
     *        The alias in use for the bot associated with the session data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withBotAlias(String botAlias) {
        setBotAlias(botAlias);
        return this;
    }

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * 
     * @param userId
     *        The ID of the client application user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * 
     * @return The ID of the client application user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The ID of the client application user.
     * </p>
     * 
     * @param userId
     *        The ID of the client application user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSessionResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier for the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * 
     * @return The unique identifier for the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier for the session.
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotAlias() != null)
            sb.append("BotAlias: ").append(getBotAlias()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
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
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
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

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
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
