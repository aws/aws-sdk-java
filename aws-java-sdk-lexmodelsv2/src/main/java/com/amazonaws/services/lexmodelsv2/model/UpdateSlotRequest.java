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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the slot to update.
     * </p>
     */
    private String slotId;
    /**
     * <p>
     * The new name for the slot.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * The new description for the slot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the new slot type to associate with this slot.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the slot.
     * </p>
     */
    private SlotValueElicitationSetting valueElicitationSetting;
    /**
     * <p>
     * New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     * </p>
     */
    private ObfuscationSetting obfuscationSetting;
    /**
     * <p>
     * The unique identifier of the bot that contains the slot.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that contains the slot. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * Determines whether the slot accepts multiple values in one response. Multiple value slots are only available in
     * the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex throws a
     * <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     * </p>
     */
    private MultipleValuesSetting multipleValuesSetting;

    /**
     * <p>
     * The unique identifier for the slot to update.
     * </p>
     * 
     * @param slotId
     *        The unique identifier for the slot to update.
     */

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    /**
     * <p>
     * The unique identifier for the slot to update.
     * </p>
     * 
     * @return The unique identifier for the slot to update.
     */

    public String getSlotId() {
        return this.slotId;
    }

    /**
     * <p>
     * The unique identifier for the slot to update.
     * </p>
     * 
     * @param slotId
     *        The unique identifier for the slot to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withSlotId(String slotId) {
        setSlotId(slotId);
        return this;
    }

    /**
     * <p>
     * The new name for the slot.
     * </p>
     * 
     * @param slotName
     *        The new name for the slot.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The new name for the slot.
     * </p>
     * 
     * @return The new name for the slot.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The new name for the slot.
     * </p>
     * 
     * @param slotName
     *        The new name for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * The new description for the slot.
     * </p>
     * 
     * @param description
     *        The new description for the slot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the slot.
     * </p>
     * 
     * @return The new description for the slot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the slot.
     * </p>
     * 
     * @param description
     *        The new description for the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the new slot type to associate with this slot.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier of the new slot type to associate with this slot.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The unique identifier of the new slot type to associate with this slot.
     * </p>
     * 
     * @return The unique identifier of the new slot type to associate with this slot.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The unique identifier of the new slot type to associate with this slot.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier of the new slot type to associate with this slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the
     *        slot.
     */

    public void setValueElicitationSetting(SlotValueElicitationSetting valueElicitationSetting) {
        this.valueElicitationSetting = valueElicitationSetting;
    }

    /**
     * <p>
     * A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the slot.
     * </p>
     * 
     * @return A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the
     *         slot.
     */

    public SlotValueElicitationSetting getValueElicitationSetting() {
        return this.valueElicitationSetting;
    }

    /**
     * <p>
     * A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the slot.
     * </p>
     * 
     * @param valueElicitationSetting
     *        A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the
     *        slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withValueElicitationSetting(SlotValueElicitationSetting valueElicitationSetting) {
        setValueElicitationSetting(valueElicitationSetting);
        return this;
    }

    /**
     * <p>
     * New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     * </p>
     * 
     * @param obfuscationSetting
     *        New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     */

    public void setObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        this.obfuscationSetting = obfuscationSetting;
    }

    /**
     * <p>
     * New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     * </p>
     * 
     * @return New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     */

    public ObfuscationSetting getObfuscationSetting() {
        return this.obfuscationSetting;
    }

    /**
     * <p>
     * New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     * </p>
     * 
     * @param obfuscationSetting
     *        New settings that determine how slot values are formatted in Amazon CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withObfuscationSetting(ObfuscationSetting obfuscationSetting) {
        setObfuscationSetting(obfuscationSetting);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the slot.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the slot.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the slot.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the slot.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the slot.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     * </p>
     * 
     * @return The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the slot. Must always be <code>DRAFT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that contains the slot. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that contains the slot. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that contains the slot. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that contains the slot. The string must match one of the
     *         supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that contains the slot. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that contains the slot. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that contains the slot.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     * 
     * @return The identifier of the intent that contains the slot.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slot.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that contains the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * Determines whether the slot accepts multiple values in one response. Multiple value slots are only available in
     * the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex throws a
     * <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @param multipleValuesSetting
     *        Determines whether the slot accepts multiple values in one response. Multiple value slots are only
     *        available in the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex
     *        throws a <code>ValidationException</code>.</p>
     *        <p>
     *        If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     */

    public void setMultipleValuesSetting(MultipleValuesSetting multipleValuesSetting) {
        this.multipleValuesSetting = multipleValuesSetting;
    }

    /**
     * <p>
     * Determines whether the slot accepts multiple values in one response. Multiple value slots are only available in
     * the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex throws a
     * <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @return Determines whether the slot accepts multiple values in one response. Multiple value slots are only
     *         available in the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex
     *         throws a <code>ValidationException</code>.</p>
     *         <p>
     *         If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     */

    public MultipleValuesSetting getMultipleValuesSetting() {
        return this.multipleValuesSetting;
    }

    /**
     * <p>
     * Determines whether the slot accepts multiple values in one response. Multiple value slots are only available in
     * the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex throws a
     * <code>ValidationException</code>.
     * </p>
     * <p>
     * If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     * </p>
     * 
     * @param multipleValuesSetting
     *        Determines whether the slot accepts multiple values in one response. Multiple value slots are only
     *        available in the en-US locale. If you set this value to <code>true</code> in any other locale, Amazon Lex
     *        throws a <code>ValidationException</code>.</p>
     *        <p>
     *        If the <code>multipleValuesSetting</code> is not set, the default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotRequest withMultipleValuesSetting(MultipleValuesSetting multipleValuesSetting) {
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

        if (obj instanceof UpdateSlotRequest == false)
            return false;
        UpdateSlotRequest other = (UpdateSlotRequest) obj;
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
        hashCode = prime * hashCode + ((getMultipleValuesSetting() == null) ? 0 : getMultipleValuesSetting().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSlotRequest clone() {
        return (UpdateSlotRequest) super.clone();
    }

}
