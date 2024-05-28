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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The bot member that processes the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizedBotMember" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecognizedBotMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the bot member that processes the request.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The name of the bot member that processes the request.
     * </p>
     */
    private String botName;

    /**
     * <p>
     * The identifier of the bot member that processes the request.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot member that processes the request.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot member that processes the request.
     * </p>
     * 
     * @return The identifier of the bot member that processes the request.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot member that processes the request.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot member that processes the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizedBotMember withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The name of the bot member that processes the request.
     * </p>
     * 
     * @param botName
     *        The name of the bot member that processes the request.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot member that processes the request.
     * </p>
     * 
     * @return The name of the bot member that processes the request.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot member that processes the request.
     * </p>
     * 
     * @param botName
     *        The name of the bot member that processes the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizedBotMember withBotName(String botName) {
        setBotName(botName);
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
            sb.append("BotName: ").append(getBotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecognizedBotMember == false)
            return false;
        RecognizedBotMember other = (RecognizedBotMember) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        return hashCode;
    }

    @Override
    public RecognizedBotMember clone() {
        try {
            return (RecognizedBotMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.RecognizedBotMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
