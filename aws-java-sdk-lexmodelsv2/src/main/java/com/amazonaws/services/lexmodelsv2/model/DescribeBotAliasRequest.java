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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot alias to describe.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The identifier of the bot associated with the bot alias to describe.
     * </p>
     */
    private String botId;

    /**
     * <p>
     * The identifier of the bot alias to describe.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias to describe.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias to describe.
     * </p>
     * 
     * @return The identifier of the bot alias to describe.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias to describe.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasRequest withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with the bot alias to describe.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the bot alias to describe.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the bot alias to describe.
     * </p>
     * 
     * @return The identifier of the bot associated with the bot alias to describe.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the bot alias to describe.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the bot alias to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotAliasRequest withBotId(String botId) {
        setBotId(botId);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBotAliasRequest == false)
            return false;
        DescribeBotAliasRequest other = (DescribeBotAliasRequest) obj;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotAliasRequest clone() {
        return (DescribeBotAliasRequest) super.clone();
    }

}
