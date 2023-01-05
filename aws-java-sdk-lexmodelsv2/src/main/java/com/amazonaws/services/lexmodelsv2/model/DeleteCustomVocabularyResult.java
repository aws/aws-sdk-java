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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteCustomVocabulary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomVocabularyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that the custom vocabulary was removed from.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that the custom vocabulary was removed from.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale identifier for the locale that the custom vocabulary was removed from.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The status of removing the custom vocabulary.
     * </p>
     */
    private String customVocabularyStatus;

    /**
     * <p>
     * The identifier of the bot that the custom vocabulary was removed from.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that the custom vocabulary was removed from.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that the custom vocabulary was removed from.
     * </p>
     * 
     * @return The identifier of the bot that the custom vocabulary was removed from.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that the custom vocabulary was removed from.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that the custom vocabulary was removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomVocabularyResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that the custom vocabulary was removed from.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the custom vocabulary was removed from.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that the custom vocabulary was removed from.
     * </p>
     * 
     * @return The version of the bot that the custom vocabulary was removed from.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that the custom vocabulary was removed from.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that the custom vocabulary was removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomVocabularyResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale identifier for the locale that the custom vocabulary was removed from.
     * </p>
     * 
     * @param localeId
     *        The locale identifier for the locale that the custom vocabulary was removed from.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale identifier for the locale that the custom vocabulary was removed from.
     * </p>
     * 
     * @return The locale identifier for the locale that the custom vocabulary was removed from.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale identifier for the locale that the custom vocabulary was removed from.
     * </p>
     * 
     * @param localeId
     *        The locale identifier for the locale that the custom vocabulary was removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomVocabularyResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The status of removing the custom vocabulary.
     * </p>
     * 
     * @param customVocabularyStatus
     *        The status of removing the custom vocabulary.
     * @see CustomVocabularyStatus
     */

    public void setCustomVocabularyStatus(String customVocabularyStatus) {
        this.customVocabularyStatus = customVocabularyStatus;
    }

    /**
     * <p>
     * The status of removing the custom vocabulary.
     * </p>
     * 
     * @return The status of removing the custom vocabulary.
     * @see CustomVocabularyStatus
     */

    public String getCustomVocabularyStatus() {
        return this.customVocabularyStatus;
    }

    /**
     * <p>
     * The status of removing the custom vocabulary.
     * </p>
     * 
     * @param customVocabularyStatus
     *        The status of removing the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomVocabularyStatus
     */

    public DeleteCustomVocabularyResult withCustomVocabularyStatus(String customVocabularyStatus) {
        setCustomVocabularyStatus(customVocabularyStatus);
        return this;
    }

    /**
     * <p>
     * The status of removing the custom vocabulary.
     * </p>
     * 
     * @param customVocabularyStatus
     *        The status of removing the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomVocabularyStatus
     */

    public DeleteCustomVocabularyResult withCustomVocabularyStatus(CustomVocabularyStatus customVocabularyStatus) {
        this.customVocabularyStatus = customVocabularyStatus.toString();
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
        if (getCustomVocabularyStatus() != null)
            sb.append("CustomVocabularyStatus: ").append(getCustomVocabularyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomVocabularyResult == false)
            return false;
        DeleteCustomVocabularyResult other = (DeleteCustomVocabularyResult) obj;
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
        if (other.getCustomVocabularyStatus() == null ^ this.getCustomVocabularyStatus() == null)
            return false;
        if (other.getCustomVocabularyStatus() != null && other.getCustomVocabularyStatus().equals(this.getCustomVocabularyStatus()) == false)
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
        hashCode = prime * hashCode + ((getCustomVocabularyStatus() == null) ? 0 : getCustomVocabularyStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomVocabularyResult clone() {
        try {
            return (DeleteCustomVocabularyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
