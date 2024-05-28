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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeBotResourceGeneration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotResourceGenerationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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
     * The generation ID for which to return the generation details.
     * </p>
     */
    private String generationId;
    /**
     * <p>
     * A list of reasons why the generation of bot resources through natural language description failed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The status of the generation request.
     * </p>
     */
    private String generationStatus;
    /**
     * <p>
     * The prompt used in the generation request.
     * </p>
     */
    private String generationInputPrompt;
    /**
     * <p>
     * The Amazon S3 location of the generated bot locale configuration.
     * </p>
     */
    private String generatedBotLocaleUrl;
    /**
     * <p>
     * The date and time at which the item was generated.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The ARN of the model used to generate the bot resources.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The date and time at which the generated item was updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

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

    public DescribeBotResourceGenerationResult withBotId(String botId) {
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

    public DescribeBotResourceGenerationResult withBotVersion(String botVersion) {
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

    public DescribeBotResourceGenerationResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The generation ID for which to return the generation details.
     * </p>
     * 
     * @param generationId
     *        The generation ID for which to return the generation details.
     */

    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The generation ID for which to return the generation details.
     * </p>
     * 
     * @return The generation ID for which to return the generation details.
     */

    public String getGenerationId() {
        return this.generationId;
    }

    /**
     * <p>
     * The generation ID for which to return the generation details.
     * </p>
     * 
     * @param generationId
     *        The generation ID for which to return the generation details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withGenerationId(String generationId) {
        setGenerationId(generationId);
        return this;
    }

    /**
     * <p>
     * A list of reasons why the generation of bot resources through natural language description failed.
     * </p>
     * 
     * @return A list of reasons why the generation of bot resources through natural language description failed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * A list of reasons why the generation of bot resources through natural language description failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons why the generation of bot resources through natural language description failed.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * A list of reasons why the generation of bot resources through natural language description failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons why the generation of bot resources through natural language description failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reasons why the generation of bot resources through natural language description failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons why the generation of bot resources through natural language description failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
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

    public DescribeBotResourceGenerationResult withGenerationStatus(String generationStatus) {
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

    public DescribeBotResourceGenerationResult withGenerationStatus(GenerationStatus generationStatus) {
        this.generationStatus = generationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The prompt used in the generation request.
     * </p>
     * 
     * @param generationInputPrompt
     *        The prompt used in the generation request.
     */

    public void setGenerationInputPrompt(String generationInputPrompt) {
        this.generationInputPrompt = generationInputPrompt;
    }

    /**
     * <p>
     * The prompt used in the generation request.
     * </p>
     * 
     * @return The prompt used in the generation request.
     */

    public String getGenerationInputPrompt() {
        return this.generationInputPrompt;
    }

    /**
     * <p>
     * The prompt used in the generation request.
     * </p>
     * 
     * @param generationInputPrompt
     *        The prompt used in the generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withGenerationInputPrompt(String generationInputPrompt) {
        setGenerationInputPrompt(generationInputPrompt);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the generated bot locale configuration.
     * </p>
     * 
     * @param generatedBotLocaleUrl
     *        The Amazon S3 location of the generated bot locale configuration.
     */

    public void setGeneratedBotLocaleUrl(String generatedBotLocaleUrl) {
        this.generatedBotLocaleUrl = generatedBotLocaleUrl;
    }

    /**
     * <p>
     * The Amazon S3 location of the generated bot locale configuration.
     * </p>
     * 
     * @return The Amazon S3 location of the generated bot locale configuration.
     */

    public String getGeneratedBotLocaleUrl() {
        return this.generatedBotLocaleUrl;
    }

    /**
     * <p>
     * The Amazon S3 location of the generated bot locale configuration.
     * </p>
     * 
     * @param generatedBotLocaleUrl
     *        The Amazon S3 location of the generated bot locale configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withGeneratedBotLocaleUrl(String generatedBotLocaleUrl) {
        setGeneratedBotLocaleUrl(generatedBotLocaleUrl);
        return this;
    }

    /**
     * <p>
     * The date and time at which the item was generated.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the item was generated.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the item was generated.
     * </p>
     * 
     * @return The date and time at which the item was generated.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time at which the item was generated.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time at which the item was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the model used to generate the bot resources.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model used to generate the bot resources.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The ARN of the model used to generate the bot resources.
     * </p>
     * 
     * @return The ARN of the model used to generate the bot resources.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The ARN of the model used to generate the bot resources.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model used to generate the bot resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The date and time at which the generated item was updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time at which the generated item was updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time at which the generated item was updated.
     * </p>
     * 
     * @return The date and time at which the generated item was updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time at which the generated item was updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time at which the generated item was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBotResourceGenerationResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
            sb.append("GenerationId: ").append(getGenerationId()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getGenerationStatus() != null)
            sb.append("GenerationStatus: ").append(getGenerationStatus()).append(",");
        if (getGenerationInputPrompt() != null)
            sb.append("GenerationInputPrompt: ").append(getGenerationInputPrompt()).append(",");
        if (getGeneratedBotLocaleUrl() != null)
            sb.append("GeneratedBotLocaleUrl: ").append(getGeneratedBotLocaleUrl()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBotResourceGenerationResult == false)
            return false;
        DescribeBotResourceGenerationResult other = (DescribeBotResourceGenerationResult) obj;
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
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getGenerationStatus() == null ^ this.getGenerationStatus() == null)
            return false;
        if (other.getGenerationStatus() != null && other.getGenerationStatus().equals(this.getGenerationStatus()) == false)
            return false;
        if (other.getGenerationInputPrompt() == null ^ this.getGenerationInputPrompt() == null)
            return false;
        if (other.getGenerationInputPrompt() != null && other.getGenerationInputPrompt().equals(this.getGenerationInputPrompt()) == false)
            return false;
        if (other.getGeneratedBotLocaleUrl() == null ^ this.getGeneratedBotLocaleUrl() == null)
            return false;
        if (other.getGeneratedBotLocaleUrl() != null && other.getGeneratedBotLocaleUrl().equals(this.getGeneratedBotLocaleUrl()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getGenerationStatus() == null) ? 0 : getGenerationStatus().hashCode());
        hashCode = prime * hashCode + ((getGenerationInputPrompt() == null) ? 0 : getGenerationInputPrompt().hashCode());
        hashCode = prime * hashCode + ((getGeneratedBotLocaleUrl() == null) ? 0 : getGeneratedBotLocaleUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBotResourceGenerationResult clone() {
        try {
            return (DescribeBotResourceGenerationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
