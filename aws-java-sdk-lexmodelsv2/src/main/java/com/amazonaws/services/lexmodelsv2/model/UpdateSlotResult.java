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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the slot that was updated.
     * </p>
     */
    private String slotId;
    /**
     * <p>
     * The updated name of the slot.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * The updated description of the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated identifier of the slot type that provides values for the slot.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the slot.
     * </p>
     */
    private SlotValueElicitationSetting valueElicitationSetting;
    /**
     * <p>
     * The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     * </p>
     */
    private ObfuscationSetting obfuscationSetting;
    /**
     * <p>
     * The identifier of the bot that contains the slot.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale that contains the slot.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The intent that contains the slot.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The timestamp of the date and time that the slot was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The timestamp of the date and time that the slot was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * Indicates whether the slot accepts multiple values in one response.
     * </p>
     */
    private MultipleValuesSetting multipleValuesSetting;

    /**
     * <p>
     * The unique identifier of the slot that was updated.
     * </p>
     * 
     * @param slotId
     *        The unique identifier of the slot that was updated.
     */

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     * <p>
     * The unique identifier of the slot that was updated.
     * </p>
     * 
     * @return The unique identifier of the slot that was updated.
     */

    public String getSlotId() {
        return this.slotId;
    }

    /**
     * <p>
     * The unique identifier of the slot that was updated.
     * </p>
     * 
     * @param slotId
     *        The unique identifier of the slot that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withSlotId(String slotId) {
        setSlotId(slotId);
        return this;
    }

    /**
     * <p>
     * The updated name of the slot.
     * </p>
     * 
     * @param slotName
     *        The updated name of the slot.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The updated name of the slot.
     * </p>
     * 
     * @return The updated name of the slot.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The updated name of the slot.
     * </p>
     * 
     * @param slotName
     *        The updated name of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * The updated description of the bot.
     * </p>
     * 
     * @param description
     *        The updated description of the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the bot.
     * </p>
     * 
     * @return The updated description of the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the bot.
     * </p>
     * 
     * @param description
     *        The updated description of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated identifier of the slot type that provides values for the slot.
     * </p>
     * 
     * @param slotTypeId
     *        The updated identifier of the slot type that provides values for the slot.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The updated identifier of the slot type that provides values for the slot.
     * </p>
     * 
     * @return The updated identifier of the slot type that provides values for the slot.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The updated identifier of the slot type that provides values for the slot.
     * </p>
     * 
     * @param slotTypeId
     *        The updated identifier of the slot type that provides values for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the
     *        slot.
     */

    public void setValueElicitationSetting(SlotValueElicitationSetting valueElicitationSetting) {
        this.valueElicitationSetting = valueElicitationSetting;
    }

    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the slot.
     * </p>
     * 
     * @return The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the
     *         slot.
     */

    public SlotValueElicitationSetting getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    /**
     * <p>
     * The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the
     *        slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withValueElicitationSetting(SlotValueElicitationSetting valueElicitationSetting) {
        setValueElicitationSetting(valueElicitationSetting);
        return this;
    }

    /**
     * <p>
     * The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     * </p>
     * 
     * @param obfuscationSetting
     *        The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     */

    public void setObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting;
    }

    /**
     * <p>
     * The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     * </p>
     * 
     * @return The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     */

    public ObfuscationSetting getObfuscationSetting() {
        return this.obfuscationSetting;
    }

    /**
     * <p>
     * The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     * </p>
     * 
     * @param obfuscationSetting
     *        The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        setObfuscationSetting(obfuscationSetting);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slot.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the slot.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slot.
     * </p>
     * 
     * @return The identifier of the bot that contains the slot.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slot.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     * </p>
     * 
     * @return The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the slot version that contains the slot. Will always be <code>DRAFT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale that contains the slot.
     * </p>
     * 
     * @param localeId
     *        The locale that contains the slot.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale that contains the slot.
     * </p>
     * 
     * @return The locale that contains the slot.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale that contains the slot.
     * </p>
     * 
     * @param localeId
     *        The locale that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The intent that contains the slot.
     * </p>
     * 
     * @param intentId
     *        The intent that contains the slot.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The intent that contains the slot.
     * </p>
     * 
     * @return The intent that contains the slot.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The intent that contains the slot.
     * </p>
     * 
     * @param intentId
     *        The intent that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The timestamp of the date and time that the slot was created.
     * </p>
     * 
     * @param creationDateTime
     *        The timestamp of the date and time that the slot was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The timestamp of the date and time that the slot was created.
     * </p>
     * 
     * @return The timestamp of the date and time that the slot was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The timestamp of the date and time that the slot was created.
     * </p>
     * 
     * @param creationDateTime
     *        The timestamp of the date and time that the slot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of the date and time that the slot was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The timestamp of the date and time that the slot was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The timestamp of the date and time that the slot was last updated.
     * </p>
     * 
     * @return The timestamp of the date and time that the slot was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The timestamp of the date and time that the slot was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The timestamp of the date and time that the slot was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the slot accepts multiple values in one response.
     * </p>
     * 
     * @param multipleValuesSetting
     *        Indicates whether the slot accepts multiple values in one response.
     */

    public void setMultipleValuesSetting(MultipleValuesSetting multipleValuesSetting) {
        this.multipleValuesSetting = multipleValuesSetting;
    }

    /**
     * <p>
     * Indicates whether the slot accepts multiple values in one response.
     * </p>
     * 
     * @return Indicates whether the slot accepts multiple values in one response.
     */

    public MultipleValuesSetting getMultipleValuesSetting() {
        return this.multipleValuesSetting;
    }

    /**
     * <p>
     * Indicates whether the slot accepts multiple values in one response.
     * </p>
     * 
     * @param multipleValuesSetting
     *        Indicates whether the slot accepts multiple values in one response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotResult withMultipleValuesSetting(MultipleValuesSetting multipleValuesSetting) {
        setMultipleValuesSetting(multipleValuesSetting);
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
        if (getSlotId() != null)
            sb.append("SlotId: ").append(getSlotId()).append(",");
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSlotTypeId() != null)
            sb.append("SlotTypeId: ").append(getSlotTypeId()).append(",");
        if (getValueElicitationSetting() != null)
            sb.append("ValueElicitationSetting: ").append(getValueElicitationSetting()).append(",");
        if (getObfuscationSetting() != null)
            sb.append("ObfuscationSetting: ").append(getObfuscationSetting()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getMultipleValuesSetting() != null)
            sb.append("MultipleValuesSetting: ").append(getMultipleValuesSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSlotResult == false)
            return false;
        UpdateSlotResult other = (UpdateSlotResult) obj;
        if (other.getSlotId() == null ^ this.getSlotId() == null)
            return false;
        if (other.getSlotId() != null && other.getSlotId().equals(this.getSlotId()) == false)
            return false;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
            return false;
        if (other.getValueElicitationSetting() == null ^ this.getValueElicitationSetting() == null)
            return false;
        if (other.getValueElicitationSetting() != null && other.getValueElicitationSetting().equals(this.getValueElicitationSetting()) == false)
            return false;
        if (other.getObfuscationSetting() == null ^ this.getObfuscationSetting() == null)
            return false;
        if (other.getObfuscationSetting() != null && other.getObfuscationSetting().equals(this.getObfuscationSetting()) == false)
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
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getMultipleValuesSetting() == null ^ this.getMultipleValuesSetting() == null)
            return false;
        if (other.getMultipleValuesSetting() != null && other.getMultipleValuesSetting().equals(this.getMultipleValuesSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotId() == null) ? 0 : getSlotId().hashCode());
        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getValueElicitationSetting() == null) ? 0 : getValueElicitationSetting().hashCode());
        hashCode = prime * hashCode + ((getObfuscationSetting() == null) ? 0 : getObfuscationSetting().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getMultipleValuesSetting() == null) ? 0 : getMultipleValuesSetting().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSlotResult clone() {
        try {
            return (UpdateSlotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
