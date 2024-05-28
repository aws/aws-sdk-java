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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotResourceGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBotResourceGenerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The prompt to generate intents and slot types for the bot locale. Your description should be both <i>detailed</i>
     * and <i>precise</i> to help generate appropriate and sufficient intents for your bot. Include a list of actions to
     * improve the intent creation process.
     * </p>
     */
    private String generationInputPrompt;
    /**
     * <p>
     * The unique identifier of the bot for which to generate intents and slot types.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot for which to generate intents and slot types.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot for which to generate intents and slot types.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The prompt to generate intents and slot types for the bot locale. Your description should be both <i>detailed</i>
     * and <i>precise</i> to help generate appropriate and sufficient intents for your bot. Include a list of actions to
     * improve the intent creation process.
     * </p>
     * 
     * @param generationInputPrompt
     *        The prompt to generate intents and slot types for the bot locale. Your description should be both
     *        <i>detailed</i> and <i>precise</i> to help generate appropriate and sufficient intents for your bot.
     *        Include a list of actions to improve the intent creation process.
     */

    public void setGenerationInputPrompt(String generationInputPrompt) {
        this.generationInputPrompt = generationInputPrompt;
    }

    /**
     * <p>
     * The prompt to generate intents and slot types for the bot locale. Your description should be both <i>detailed</i>
     * and <i>precise</i> to help generate appropriate and sufficient intents for your bot. Include a list of actions to
     * improve the intent creation process.
     * </p>
     * 
     * @return The prompt to generate intents and slot types for the bot locale. Your description should be both
     *         <i>detailed</i> and <i>precise</i> to help generate appropriate and sufficient intents for your bot.
     *         Include a list of actions to improve the intent creation process.
     */

    public String getGenerationInputPrompt() {
        return this.generationInputPrompt;
    }

    /**
     * <p>
     * The prompt to generate intents and slot types for the bot locale. Your description should be both <i>detailed</i>
     * and <i>precise</i> to help generate appropriate and sufficient intents for your bot. Include a list of actions to
     * improve the intent creation process.
     * </p>
     * 
     * @param generationInputPrompt
     *        The prompt to generate intents and slot types for the bot locale. Your description should be both
     *        <i>detailed</i> and <i>precise</i> to help generate appropriate and sufficient intents for your bot.
     *        Include a list of actions to improve the intent creation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationRequest withGenerationInputPrompt(String generationInputPrompt) {
        setGenerationInputPrompt(generationInputPrompt);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which to generate intents and slot types.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @return The unique identifier of the bot for which to generate intents and slot types.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which to generate intents and slot types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which to generate intents and slot types.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @return The version of the bot for which to generate intents and slot types.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which to generate intents and slot types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which to generate intents and slot types.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @return The locale of the bot for which to generate intents and slot types.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot for which to generate intents and slot types.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which to generate intents and slot types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
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
        if (getGenerationInputPrompt() != null)
            sb.append("GenerationInputPrompt: ").append(getGenerationInputPrompt()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBotResourceGenerationRequest == false)
            return false;
        StartBotResourceGenerationRequest other = (StartBotResourceGenerationRequest) obj;
        if (other.getGenerationInputPrompt() == null ^ this.getGenerationInputPrompt() == null)
            return false;
        if (other.getGenerationInputPrompt() != null && other.getGenerationInputPrompt().equals(this.getGenerationInputPrompt()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationInputPrompt() == null) ? 0 : getGenerationInputPrompt().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public StartBotResourceGenerationRequest clone() {
        return (StartBotResourceGenerationRequest) super.clone();
    }

}
