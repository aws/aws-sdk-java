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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot to delete.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using the bot
     * before it is deleted.
     * </p>
     */
    private Boolean skipResourceInUseCheck;

    /**
     * <p>
     * The identifier of the bot to delete.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to delete.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to delete.
     * </p>
     * 
     * @return The identifier of the bot to delete.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to delete.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using the bot
     * before it is deleted.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using
     *        the bot before it is deleted.
     */

    public void setSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        this.skipResourceInUseCheck = skipResourceInUseCheck;
    }

    /**
     * <p>
     * When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using the bot
     * before it is deleted.
     * </p>
     * 
     * @return When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using
     *         the bot before it is deleted.
     */

    public Boolean getSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
    }

    /**
     * <p>
     * When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using the bot
     * before it is deleted.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using
     *        the bot before it is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBotRequest withSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        setSkipResourceInUseCheck(skipResourceInUseCheck);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using the bot
     * before it is deleted.
     * </p>
     * 
     * @return When <code>true</code>, Amazon Lex doesn't check to see if another resource, such as an alias, is using
     *         the bot before it is deleted.
     */

    public Boolean isSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
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
        if (getSkipResourceInUseCheck() != null)
            sb.append("SkipResourceInUseCheck: ").append(getSkipResourceInUseCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBotRequest == false)
            return false;
        DeleteBotRequest other = (DeleteBotRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getSkipResourceInUseCheck() == null ^ this.getSkipResourceInUseCheck() == null)
            return false;
        if (other.getSkipResourceInUseCheck() != null && other.getSkipResourceInUseCheck().equals(this.getSkipResourceInUseCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getSkipResourceInUseCheck() == null) ? 0 : getSkipResourceInUseCheck().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBotRequest clone() {
        return (DeleteBotRequest) super.clone();
    }

}
