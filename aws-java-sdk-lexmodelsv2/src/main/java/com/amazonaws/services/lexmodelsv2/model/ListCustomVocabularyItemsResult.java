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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListCustomVocabularyItems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomVocabularyItemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot to the list custom vocabulary response.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot version of the bot to the list custom vocabulary response.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale identifier of the bot to the list custom vocabulary response.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The custom vocabulary items from the list custom vocabulary response.
     * </p>
     */
    private java.util.List<CustomVocabularyItem> customVocabularyItems;
    /**
     * <p>
     * The nextToken identifier to the list custom vocabulary response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to the list custom vocabulary response.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @return The unique identifier of the bot to the list custom vocabulary response.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to the list custom vocabulary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVocabularyItemsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot version of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to the list custom vocabulary response.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @return The bot version of the bot to the list custom vocabulary response.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to the list custom vocabulary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVocabularyItemsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale identifier of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @param localeId
     *        The locale identifier of the bot to the list custom vocabulary response.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale identifier of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @return The locale identifier of the bot to the list custom vocabulary response.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale identifier of the bot to the list custom vocabulary response.
     * </p>
     * 
     * @param localeId
     *        The locale identifier of the bot to the list custom vocabulary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVocabularyItemsResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The custom vocabulary items from the list custom vocabulary response.
     * </p>
     * 
     * @return The custom vocabulary items from the list custom vocabulary response.
     */

    public java.util.List<CustomVocabularyItem> getCustomVocabularyItems() {
        return customVocabularyItems;
    }

    /**
     * <p>
     * The custom vocabulary items from the list custom vocabulary response.
     * </p>
     * 
     * @param customVocabularyItems
     *        The custom vocabulary items from the list custom vocabulary response.
     */

    public void setCustomVocabularyItems(java.util.Collection<CustomVocabularyItem> customVocabularyItems) {
        if (customVocabularyItems == null) {
            this.customVocabularyItems = null;
            return;
        }

        this.customVocabularyItems = new java.util.ArrayList<CustomVocabularyItem>(customVocabularyItems);
    }

    /**
     * <p>
     * The custom vocabulary items from the list custom vocabulary response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomVocabularyItems(java.util.Collection)} or
     * {@link #withCustomVocabularyItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customVocabularyItems
     *        The custom vocabulary items from the list custom vocabulary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVocabularyItemsResult withCustomVocabularyItems(CustomVocabularyItem... customVocabularyItems) {
        if (this.customVocabularyItems == null) {
            setCustomVocabularyItems(new java.util.ArrayList<CustomVocabularyItem>(customVocabularyItems.length));
        }
        for (CustomVocabularyItem ele : customVocabularyItems) {
            this.customVocabularyItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom vocabulary items from the list custom vocabulary response.
     * </p>
     * 
     * @param customVocabularyItems
     *        The custom vocabulary items from the list custom vocabulary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVocabularyItemsResult withCustomVocabularyItems(java.util.Collection<CustomVocabularyItem> customVocabularyItems) {
        setCustomVocabularyItems(customVocabularyItems);
        return this;
    }

    /**
     * <p>
     * The nextToken identifier to the list custom vocabulary response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken identifier to the list custom vocabulary response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken identifier to the list custom vocabulary response.
     * </p>
     * 
     * @return The nextToken identifier to the list custom vocabulary response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken identifier to the list custom vocabulary response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken identifier to the list custom vocabulary response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomVocabularyItemsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCustomVocabularyItems() != null)
            sb.append("CustomVocabularyItems: ").append(getCustomVocabularyItems()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomVocabularyItemsResult == false)
            return false;
        ListCustomVocabularyItemsResult other = (ListCustomVocabularyItemsResult) obj;
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
        if (other.getCustomVocabularyItems() == null ^ this.getCustomVocabularyItems() == null)
            return false;
        if (other.getCustomVocabularyItems() != null && other.getCustomVocabularyItems().equals(this.getCustomVocabularyItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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
        hashCode = prime * hashCode + ((getCustomVocabularyItems() == null) ? 0 : getCustomVocabularyItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomVocabularyItemsResult clone() {
        try {
            return (ListCustomVocabularyItemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
