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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/StartBotResourceGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBotResourceGenerationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The prompt that was used generate intents and slot types for the bot locale.
     * </p>
     */
    private String generationInputPrompt;
    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     */
    private String generationId;
    /**
     * <p>
     * The unique identifier of the bot for which the generation request was made.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot for which the generation request was made.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale of the bot for which the generation request was made.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The status of the generation request.
     * </p>
     */
    private String generationStatus;
    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The prompt that was used generate intents and slot types for the bot locale.
     * </p>
     * 
     * @param generationInputPrompt
     *        The prompt that was used generate intents and slot types for the bot locale.
     */

    public void setGenerationInputPrompt(String generationInputPrompt) {
        this.generationInputPrompt = generationInputPrompt;
    }

    /**
     * <p>
     * The prompt that was used generate intents and slot types for the bot locale.
     * </p>
     * 
     * @return The prompt that was used generate intents and slot types for the bot locale.
     */

    public String getGenerationInputPrompt() {
        return this.generationInputPrompt;
    }

    /**
     * <p>
     * The prompt that was used generate intents and slot types for the bot locale.
     * </p>
     * 
     * @param generationInputPrompt
     *        The prompt that was used generate intents and slot types for the bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationResult withGenerationInputPrompt(String generationInputPrompt) {
        setGenerationInputPrompt(generationInputPrompt);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     * 
     * @param generationId
     *        The unique identifier of the generation request.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     * 
     * @return The unique identifier of the generation request.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The unique identifier of the generation request.
     * </p>
     * 
     * @param generationId
     *        The unique identifier of the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationResult withGenerationId(String generationId) {
        setGenerationId(generationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot for which the generation request was made.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which the generation request was made.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which the generation request was made.
     * </p>
     * 
     * @return The unique identifier of the bot for which the generation request was made.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot for which the generation request was made.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot for which the generation request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot for which the generation request was made.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which the generation request was made.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot for which the generation request was made.
     * </p>
     * 
     * @return The version of the bot for which the generation request was made.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot for which the generation request was made.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot for which the generation request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale of the bot for which the generation request was made.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which the generation request was made.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale of the bot for which the generation request was made.
     * </p>
     * 
     * @return The locale of the bot for which the generation request was made.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale of the bot for which the generation request was made.
     * </p>
     * 
     * @param localeId
     *        The locale of the bot for which the generation request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @param generationStatus
     *        The status of the generation request.
     * @see GenerationStatus
     */

    public void setGenerationStatus(String generationStatus) {
        this.generationStatus = generationStatus;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @return The status of the generation request.
     * @see GenerationStatus
     */

    public String getGenerationStatus() {
        return this.generationStatus;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @param generationStatus
     *        The status of the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public StartBotResourceGenerationResult withGenerationStatus(String generationStatus) {
        setGenerationStatus(generationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the generation request.
     * </p>
     * 
     * @param generationStatus
     *        The status of the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenerationStatus
     */

    public StartBotResourceGenerationResult withGenerationStatus(GenerationStatus generationStatus) {
        this.generationStatus = generationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the generation request was made.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     * 
     * @return The date and time at which the generation request was made.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the generation request was made.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the generation request was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBotResourceGenerationResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getGenerationId() != null)
            sb.append("GenerationId: ").append(getGenerationId()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getGenerationStatus() != null)
            sb.append("GenerationStatus: ").append(getGenerationStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBotResourceGenerationResult == false)
            return false;
        StartBotResourceGenerationResult other = (StartBotResourceGenerationResult) obj;
        if (other.getGenerationInputPrompt() == null ^ this.getGenerationInputPrompt() == null)
            return false;
        if (other.getGenerationInputPrompt() != null && other.getGenerationInputPrompt().equals(this.getGenerationInputPrompt()) == false)
            return false;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null && other.getGenerationId().equals(this.getGenerationId()) == false)
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
        if (other.getGenerationStatus() == null ^ this.getGenerationStatus() == null)
            return false;
        if (other.getGenerationStatus() != null && other.getGenerationStatus().equals(this.getGenerationStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationInputPrompt() == null) ? 0 : getGenerationInputPrompt().hashCode());
        hashCode = prime * hashCode + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getGenerationStatus() == null) ? 0 : getGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public StartBotResourceGenerationResult clone() {
        try {
            return (StartBotResourceGenerationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
