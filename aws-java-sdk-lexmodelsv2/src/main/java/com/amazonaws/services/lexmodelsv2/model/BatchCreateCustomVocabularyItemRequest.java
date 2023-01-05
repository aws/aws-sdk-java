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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchCreateCustomVocabularyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateCustomVocabularyItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item for.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * </p>
     */
    private java.util.List<NewCustomVocabularyItem> customVocabularyItemList;

    /**
     * <p>
     * The unique identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to batch create the custom vocabulary item for.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @return The unique identifier of the bot to batch create the custom vocabulary item for.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to batch create the custom vocabulary item for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to batch create the custom vocabulary item for.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @return The bot version of the bot to batch create the custom vocabulary item for.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to batch create the custom vocabulary item for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param localeId
     *        The unique locale identifier of the bot to batch create the custom vocabulary item for.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @return The unique locale identifier of the bot to batch create the custom vocabulary item for.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The unique locale identifier of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param localeId
     *        The unique locale identifier of the bot to batch create the custom vocabulary item for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @return The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     */

    public java.util.List<NewCustomVocabularyItem> getCustomVocabularyItemList() {
        return customVocabularyItemList;
    }

    /**
     * <p>
     * The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param customVocabularyItemList
     *        The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     */

    public void setCustomVocabularyItemList(java.util.Collection<NewCustomVocabularyItem> customVocabularyItemList) {
        if (customVocabularyItemList == null) {
            this.customVocabularyItemList = null;
            return;
        }

        this.customVocabularyItemList = new java.util.ArrayList<NewCustomVocabularyItem>(customVocabularyItemList);
    }

    /**
     * <p>
     * The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomVocabularyItemList(java.util.Collection)} or
     * {@link #withCustomVocabularyItemList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customVocabularyItemList
     *        The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemRequest withCustomVocabularyItemList(NewCustomVocabularyItem... customVocabularyItemList) {
        if (this.customVocabularyItemList == null) {
            setCustomVocabularyItemList(new java.util.ArrayList<NewCustomVocabularyItem>(customVocabularyItemList.length));
        }
        for (NewCustomVocabularyItem ele : customVocabularyItemList) {
            this.customVocabularyItemList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * </p>
     * 
     * @param customVocabularyItemList
     *        The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateCustomVocabularyItemRequest withCustomVocabularyItemList(java.util.Collection<NewCustomVocabularyItem> customVocabularyItemList) {
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

        if (obj instanceof BatchCreateCustomVocabularyItemRequest == false)
            return false;
        BatchCreateCustomVocabularyItemRequest other = (BatchCreateCustomVocabularyItemRequest) obj;
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
    public BatchCreateCustomVocabularyItemRequest clone() {
        return (BatchCreateCustomVocabularyItemRequest) super.clone();
    }

}
