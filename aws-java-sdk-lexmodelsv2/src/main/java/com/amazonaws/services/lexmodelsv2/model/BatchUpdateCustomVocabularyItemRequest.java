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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BatchUpdateCustomVocabularyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateCustomVocabularyItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot version of the bot to the batch update request for the custom vocabulary item.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
     * </p>
     */
    private java.util.List<CustomVocabularyItem> customVocabularyItemList;

    /**
     * <p>
     * The unique identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to the batch update request for the custom vocabulary item.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @return The unique identifier of the bot to the batch update request for the custom vocabulary item.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot to the batch update request for the custom vocabulary item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot version of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to the batch update request for the custom vocabulary item.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @return The bot version of the bot to the batch update request for the custom vocabulary item.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to the batch update request for the custom vocabulary item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param localeId
     *        The locale identifier of the bot to the batch update request for the custom vocabulary item.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @return The locale identifier of the bot to the batch update request for the custom vocabulary item.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale identifier of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param localeId
     *        The locale identifier of the bot to the batch update request for the custom vocabulary item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateCustomVocabularyItemRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @return The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
     */

    public java.util.List<CustomVocabularyItem> getCustomVocabularyItemList() {
        return customVocabularyItemList;
    }

    /**
     * <p>
     * The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param customVocabularyItemList
     *        The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
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
     * The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomVocabularyItemList(java.util.Collection)} or
     * {@link #withCustomVocabularyItemList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customVocabularyItemList
     *        The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
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
     * The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
     * </p>
     * 
     * @param customVocabularyItemList
     *        The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
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
