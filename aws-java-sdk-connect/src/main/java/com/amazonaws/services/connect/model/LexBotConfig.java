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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information of an Amazon Lex or Amazon Lex V2 bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/LexBotConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LexBotConfig implements Serializable, Cloneable, StructuredPojo {

    private LexBot lexBot;
    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     */
    private LexV2Bot lexV2Bot;

    /**
     * @param lexBot
     */

    public void setLexBot(LexBot lexBot) {
        this.lexBot = lexBot;
    }

    /**
     * @return
     */

    public LexBot getLexBot() {
        return this.lexBot;
    }

    /**
     * @param lexBot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexBotConfig withLexBot(LexBot lexBot) {
        setLexBot(lexBot);
        return this;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     * 
     * @param lexV2Bot
     *        Configuration information of an Amazon Lex V2 bot.
     */

    public void setLexV2Bot(LexV2Bot lexV2Bot) {
        this.lexV2Bot = lexV2Bot;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     * 
     * @return Configuration information of an Amazon Lex V2 bot.
     */

    public LexV2Bot getLexV2Bot() {
        return this.lexV2Bot;
    }

    /**
     * <p>
     * Configuration information of an Amazon Lex V2 bot.
     * </p>
     * 
     * @param lexV2Bot
     *        Configuration information of an Amazon Lex V2 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexBotConfig withLexV2Bot(LexV2Bot lexV2Bot) {
        setLexV2Bot(lexV2Bot);
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
        if (getLexBot() != null)
            sb.append("LexBot: ").append(getLexBot()).append(",");
        if (getLexV2Bot() != null)
            sb.append("LexV2Bot: ").append(getLexV2Bot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexBotConfig == false)
            return false;
        LexBotConfig other = (LexBotConfig) obj;
        if (other.getLexBot() == null ^ this.getLexBot() == null)
            return false;
        if (other.getLexBot() != null && other.getLexBot().equals(this.getLexBot()) == false)
            return false;
        if (other.getLexV2Bot() == null ^ this.getLexV2Bot() == null)
            return false;
        if (other.getLexV2Bot() != null && other.getLexV2Bot().equals(this.getLexV2Bot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexBot() == null) ? 0 : getLexBot().hashCode());
        hashCode = prime * hashCode + ((getLexV2Bot() == null) ? 0 : getLexV2Bot().hashCode());
        return hashCode;
    }

    @Override
    public LexBotConfig clone() {
        try {
            return (LexBotConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.LexBotConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
