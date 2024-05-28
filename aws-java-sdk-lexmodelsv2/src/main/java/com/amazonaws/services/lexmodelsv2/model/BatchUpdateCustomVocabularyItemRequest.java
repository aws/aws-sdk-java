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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchUpdateCustomVocabularyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateCustomVocabularyItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot associated with this custom vocabulary
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the version of the bot associated with this custom vocabulary.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     * contain a displayAs and/or a weight.
     * </p>
     */
    private java.util.List<CustomVocabularyItem> customVocabularyItemList;

    /**
     * <p>
     * The identifier of the bot associated with this custom vocabulary
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with this custom vocabulary
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with this custom vocabulary
     * </p>
     * 
     * @return The identifier of the bot associated with this custom vocabulary
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with this custom vocabulary
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with this custom vocabulary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with this custom vocabulary.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the version of the bot associated with this custom vocabulary.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with this custom vocabulary.
     * </p>
     * 
     * @return The identifier of the version of the bot associated with this custom vocabulary.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the version of the bot associated with this custom vocabulary.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the version of the bot associated with this custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where this custom vocabulary is used. The string must match one
     *        of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     * </p>
     * 
     * @return The identifier of the language and locale where this custom vocabulary is used. The string must match one
     *         of the supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where this custom vocabulary is used. The string must match one
     *        of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html"> Supported Languages </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     * contain a displayAs and/or a weight.
     * </p>
     * 
     * @return A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can
     *         optionally contain a displayAs and/or a weight.
     */

    public java.util.List<CustomVocabularyItem> getCustomVocabularyItemList() {
        return customVocabularyItemList;
    }

    /**
     * <p>
     * A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     * contain a displayAs and/or a weight.
     * </p>
     * 
     * @param customVocabularyItemList
     *        A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     *        contain a displayAs and/or a weight.
     */

    public void setCustomVocabularyItemList(java.util.Collection<CustomVocabularyItem> customVocabularyItemList) {
        if (customVocabularyItemList == null) {
            this.customVocabularyItemList = null;
            return;
        }

        this.customVocabularyItemList = new java.util.ArrayList<CustomVocabularyItem>(customVocabularyItemList);
    }

    /**
     * <p>
     * A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     * contain a displayAs and/or a weight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomVocabularyItemList(java.util.Collection)} or
     * {@link #withCustomVocabularyItemList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customVocabularyItemList
     *        A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     *        contain a displayAs and/or a weight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withCustomVocabularyItemList(CustomVocabularyItem... customVocabularyItemList) {
        if (this.customVocabularyItemList == null) {
            setCustomVocabularyItemList(new java.util.ArrayList<CustomVocabularyItem>(customVocabularyItemList.length));
        }
        for (CustomVocabularyItem ele : customVocabularyItemList) {
            this.customVocabularyItemList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     * contain a displayAs and/or a weight.
     * </p>
     * 
     * @param customVocabularyItemList
     *        A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally
     *        contain a displayAs and/or a weight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withCustomVocabularyItemList(java.util.Collection<CustomVocabularyItem> customVocabularyItemList) {
        setCustomVocabularyItemList(customVocabularyItemList);
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
        if (getCustomVocabularyItemList() != null)
            sb.append("CustomVocabularyItemList: ").append(getCustomVocabularyItemList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateCustomVocabularyItemRequest == false)
            return false;
        BatchUpdateCustomVocabularyItemRequest other = (BatchUpdateCustomVocabularyItemRequest) obj;
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
        if (other.getCustomVocabularyItemList() == null ^ this.getCustomVocabularyItemList() == null)
            return false;
        if (other.getCustomVocabularyItemList() != null && other.getCustomVocabularyItemList().equals(this.getCustomVocabularyItemList()) == false)
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
        hashCode = prime * hashCode + ((getCustomVocabularyItemList() == null) ? 0 : getCustomVocabularyItemList().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateCustomVocabularyItemRequest clone() {
        return (BatchUpdateCustomVocabularyItemRequest) super.clone();
    }

}
