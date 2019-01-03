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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotChannelAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the association between the bot and the channel. The name is case sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     */
    private String botAlias;

    /**
     * <p>
     * The name of the association between the bot and the channel. The name is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the association between the bot and the channel. The name is case sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the association between the bot and the channel. The name is case sensitive.
     * </p>
     * 
     * @return The name of the association between the bot and the channel. The name is case sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the association between the bot and the channel. The name is case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the association between the bot and the channel. The name is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotChannelAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @return The name of the Amazon Lex bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotChannelAssociationRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     * 
     * @param botAlias
     *        An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     */

    public void setBotAlias(String botAlias) {
        this.botAlias = botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     * 
     * @return An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     */

    public String getBotAlias() {
        return this.botAlias;
    }

    /**
     * <p>
     * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * </p>
     * 
     * @param botAlias
     *        An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotChannelAssociationRequest withBotAlias(String botAlias) {
        setBotAlias(botAlias);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotAlias() != null)
            sb.append("BotAlias: ").append(getBotAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotChannelAssociationRequest == false)
            return false;
        GetBotChannelAssociationRequest other = (GetBotChannelAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotAlias() == null ^ this.getBotAlias() == null)
            return false;
        if (other.getBotAlias() != null && other.getBotAlias().equals(this.getBotAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotAlias() == null) ? 0 : getBotAlias().hashCode());
        return hashCode;
    }

    @Override
    public GetBotChannelAssociationRequest clone() {
        return (GetBotChannelAssociationRequest) super.clone();
    }

}
