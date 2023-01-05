/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchCreateCustomVocabularyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateCustomVocabularyItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique identifier of the bot to batch create response for the custom vocabulary item.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item response for.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The errors of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     */
    private java.util.List<FailedCustomVocabularyItem> errors;
    /**
     * <p>
     * The resources of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     */
    private java.util.List<CustomVocabularyItem> resources;

    /**
     * <p>
     * The unique identifier of the bot to batch create response for the custom vocabulary item.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to batch create response for the custom vocabulary item.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to batch create response for the custom vocabulary item.
     * </p>
     * 
     * @return The unique identifier of the bot to batch create response for the custom vocabulary item.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to batch create response for the custom vocabulary item.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to batch create response for the custom vocabulary item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item response for.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to batch create the custom vocabulary item response for.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item response for.
     * </p>
     * 
     * @return The bot version of the bot to batch create the custom vocabulary item response for.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item response for.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to batch create the custom vocabulary item response for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     * </p>
     * 
     * @param localeId
     *        The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     * </p>
     * 
     * @return The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     * </p>
     * 
     * @param localeId
     *        The unique locale identifier of the bot to batch create the custom vocabulary item response for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The errors of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * 
     * @return The errors of the action to batch create the custom vocabulary item response for a bot.
     */

    public java.util.List<FailedCustomVocabularyItem> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The errors of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * 
     * @param errors
     *        The errors of the action to batch create the custom vocabulary item response for a bot.
     */

    public void setErrors(java.util.Collection<FailedCustomVocabularyItem> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<FailedCustomVocabularyItem>(errors);
    }

    /**
     * <p>
     * The errors of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The errors of the action to batch create the custom vocabulary item response for a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withErrors(FailedCustomVocabularyItem... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<FailedCustomVocabularyItem>(errors.length));
        }
        for (FailedCustomVocabularyItem ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The errors of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * 
     * @param errors
     *        The errors of the action to batch create the custom vocabulary item response for a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withErrors(java.util.Collection<FailedCustomVocabularyItem> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The resources of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * 
     * @return The resources of the action to batch create the custom vocabulary item response for a bot.
     */

    public java.util.List<CustomVocabularyItem> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * 
     * @param resources
     *        The resources of the action to batch create the custom vocabulary item response for a bot.
     */

    public void setResources(java.util.Collection<CustomVocabularyItem> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<CustomVocabularyItem>(resources);
    }

    /**
     * <p>
     * The resources of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources of the action to batch create the custom vocabulary item response for a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withResources(CustomVocabularyItem... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<CustomVocabularyItem>(resources.length));
        }
        for (CustomVocabularyItem ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources of the action to batch create the custom vocabulary item response for a bot.
     * </p>
     * 
     * @param resources
     *        The resources of the action to batch create the custom vocabulary item response for a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemResult withResources(java.util.Collection<CustomVocabularyItem> resources) {
        setResources(resources);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateCustomVocabularyItemResult == false)
            return false;
        BatchCreateCustomVocabularyItemResult other = (BatchCreateCustomVocabularyItemResult) obj;
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
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateCustomVocabularyItemResult clone() {
        try {
            return (BatchCreateCustomVocabularyItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
