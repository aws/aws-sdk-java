/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateBotVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBotVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot to create the version for.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * A description of the version. Use the description to help identify the version in lists.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version or any
     * other previously published version for each locale. When you specify a source version, the locale data is copied
     * from the source version to the new version.
     * </p>
     */
    private java.util.Map<String, BotVersionLocaleDetails> botVersionLocaleSpecification;

    /**
     * <p>
     * The identifier of the bot to create the version for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to create the version for.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to create the version for.
     * </p>
     * 
     * @return The identifier of the bot to create the version for.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to create the version for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to create the version for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * A description of the version. Use the description to help identify the version in lists.
     * </p>
     * 
     * @param description
     *        A description of the version. Use the description to help identify the version in lists.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the version. Use the description to help identify the version in lists.
     * </p>
     * 
     * @return A description of the version. Use the description to help identify the version in lists.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the version. Use the description to help identify the version in lists.
     * </p>
     * 
     * @param description
     *        A description of the version. Use the description to help identify the version in lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version or any
     * other previously published version for each locale. When you specify a source version, the locale data is copied
     * from the source version to the new version.
     * </p>
     * 
     * @return Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version
     *         or any other previously published version for each locale. When you specify a source version, the locale
     *         data is copied from the source version to the new version.
     */

    public java.util.Map<String, BotVersionLocaleDetails> getBotVersionLocaleSpecification() {
        return botVersionLocaleSpecification;
    }

    /**
     * <p>
     * Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version or any
     * other previously published version for each locale. When you specify a source version, the locale data is copied
     * from the source version to the new version.
     * </p>
     * 
     * @param botVersionLocaleSpecification
     *        Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version
     *        or any other previously published version for each locale. When you specify a source version, the locale
     *        data is copied from the source version to the new version.
     */

    public void setBotVersionLocaleSpecification(java.util.Map<String, BotVersionLocaleDetails> botVersionLocaleSpecification) {
        this.botVersionLocaleSpecification = botVersionLocaleSpecification;
    }

    /**
     * <p>
     * Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version or any
     * other previously published version for each locale. When you specify a source version, the locale data is copied
     * from the source version to the new version.
     * </p>
     * 
     * @param botVersionLocaleSpecification
     *        Specifies the locales that Amazon Lex adds to this version. You can choose the <code>Draft</code> version
     *        or any other previously published version for each locale. When you specify a source version, the locale
     *        data is copied from the source version to the new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionRequest withBotVersionLocaleSpecification(java.util.Map<String, BotVersionLocaleDetails> botVersionLocaleSpecification) {
        setBotVersionLocaleSpecification(botVersionLocaleSpecification);
        return this;
    }

    /**
     * Add a single BotVersionLocaleSpecification entry
     *
     * @see CreateBotVersionRequest#withBotVersionLocaleSpecification
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionRequest addBotVersionLocaleSpecificationEntry(String key, BotVersionLocaleDetails value) {
        if (null == this.botVersionLocaleSpecification) {
            this.botVersionLocaleSpecification = new java.util.HashMap<String, BotVersionLocaleDetails>();
        }
        if (this.botVersionLocaleSpecification.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.botVersionLocaleSpecification.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BotVersionLocaleSpecification.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBotVersionRequest clearBotVersionLocaleSpecificationEntries() {
        this.botVersionLocaleSpecification = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotVersionLocaleSpecification() != null)
            sb.append("BotVersionLocaleSpecification: ").append(getBotVersionLocaleSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBotVersionRequest == false)
            return false;
        CreateBotVersionRequest other = (CreateBotVersionRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersionLocaleSpecification() == null ^ this.getBotVersionLocaleSpecification() == null)
            return false;
        if (other.getBotVersionLocaleSpecification() != null
                && other.getBotVersionLocaleSpecification().equals(this.getBotVersionLocaleSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersionLocaleSpecification() == null) ? 0 : getBotVersionLocaleSpecification().hashCode());
        return hashCode;
    }

    @Override
    public CreateBotVersionRequest clone() {
        return (CreateBotVersionRequest) super.clone();
    }

}
