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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteCustomVocabulary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot to remove the custom vocabulary from.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot to remove the custom vocabulary from.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale identifier for the locale that contains the custom vocabulary to remove.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The unique identifier of the bot to remove the custom vocabulary from.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to remove the custom vocabulary from.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to remove the custom vocabulary from.
     * </p>
     * 
     * @return The unique identifier of the bot to remove the custom vocabulary from.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to remove the custom vocabulary from.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to remove the custom vocabulary from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomVocabularyRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot to remove the custom vocabulary from.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to remove the custom vocabulary from.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot to remove the custom vocabulary from.
     * </p>
     * 
     * @return The version of the bot to remove the custom vocabulary from.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot to remove the custom vocabulary from.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to remove the custom vocabulary from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomVocabularyRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale identifier for the locale that contains the custom vocabulary to remove.
     * </p>
     * 
     * @param localeId
     *        The locale identifier for the locale that contains the custom vocabulary to remove.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale identifier for the locale that contains the custom vocabulary to remove.
     * </p>
     * 
     * @return The locale identifier for the locale that contains the custom vocabulary to remove.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale identifier for the locale that contains the custom vocabulary to remove.
     * </p>
     * 
     * @param localeId
     *        The locale identifier for the locale that contains the custom vocabulary to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomVocabularyRequest withLocaleId(String localeId) {
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

        if (obj instanceof DeleteCustomVocabularyRequest == false)
            return false;
        DeleteCustomVocabularyRequest other = (DeleteCustomVocabularyRequest) obj;
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomVocabularyRequest clone() {
        return (DeleteCustomVocabularyRequest) super.clone();
    }

}
