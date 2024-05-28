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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotResourceGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotResourceGenerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot for which to return the generation details.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot for which to return the generation details.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot for which to return the generation details.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The unique identifier of the generation request for which to return the generation details.
     * </p>
     */
    private String generationId;

    /**
     * <p>
     * The unique identifier of the bot for which to return the generation details.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which to return the generation details.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which to return the generation details.
     * </p>
     * 
     * @return The unique identifier of the bot for which to return the generation details.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which to return the generation details.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which to return the generation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot for which to return the generation details.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which to return the generation details.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot for which to return the generation details.
     * </p>
     * 
     * @return The version of the bot for which to return the generation details.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot for which to return the generation details.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which to return the generation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot for which to return the generation details.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which to return the generation details.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot for which to return the generation details.
     * </p>
     * 
     * @return The locale of the bot for which to return the generation details.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot for which to return the generation details.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which to return the generation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the generation request for which to return the generation details.
     * </p>
     * 
     * @param generationId
     *        The unique identifier of the generation request for which to return the generation details.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The unique identifier of the generation request for which to return the generation details.
     * </p>
     * 
     * @return The unique identifier of the generation request for which to return the generation details.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The unique identifier of the generation request for which to return the generation details.
     * </p>
     * 
     * @param generationId
     *        The unique identifier of the generation request for which to return the generation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationRequest withGenerationId(String generationId) {
        setGenerationId(generationId);
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
        if (getGenerationId() != null)
            sb.append("GenerationId: ").append(getGenerationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBotResourceGenerationRequest == false)
            return false;
        DescribeBotResourceGenerationRequest other = (DescribeBotResourceGenerationRequest) obj;
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
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null && other.getGenerationId().equals(this.getGenerationId()) == false)
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
        hashCode = prime * hashCode + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotResourceGenerationRequest clone() {
        return (DescribeBotResourceGenerationRequest) super.clone();
    }

}
