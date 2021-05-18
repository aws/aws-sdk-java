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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlotTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the slot type to update.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * The new name of the slot type.
     * </p>
     */
    private String slotTypeName;
    /**
     * <p>
     * The new description of the slot type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A new list of values and their optional synonyms that define the values that the slot type can take.
     * </p>
     */
    private java.util.List<SlotTypeValue> slotTypeValues;
    /**
     * <p>
     * The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     * </p>
     */
    private SlotValueSelectionSetting valueSelectionSetting;
    /**
     * <p>
     * The new built-in slot type that should be used as the parent of this slot type.
     * </p>
     */
    private String parentSlotTypeSignature;
    /**
     * <p>
     * The identifier of the bot that contains the slot type.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that contains the slot type. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The unique identifier of the slot type to update.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier of the slot type to update.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The unique identifier of the slot type to update.
     * </p>
     * 
     * @return The unique identifier of the slot type to update.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The unique identifier of the slot type to update.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier of the slot type to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * The new name of the slot type.
     * </p>
     * 
     * @param slotTypeName
     *        The new name of the slot type.
     */

    public void setSlotTypeName(String slotTypeName) {
        this.slotTypeName = slotTypeName;
    }

    /**
     * <p>
     * The new name of the slot type.
     * </p>
     * 
     * @return The new name of the slot type.
     */

    public String getSlotTypeName() {
        return this.slotTypeName;
    }

    /**
     * <p>
     * The new name of the slot type.
     * </p>
     * 
     * @param slotTypeName
     *        The new name of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withSlotTypeName(String slotTypeName) {
        setSlotTypeName(slotTypeName);
        return this;
    }

    /**
     * <p>
     * The new description of the slot type.
     * </p>
     * 
     * @param description
     *        The new description of the slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description of the slot type.
     * </p>
     * 
     * @return The new description of the slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description of the slot type.
     * </p>
     * 
     * @param description
     *        The new description of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A new list of values and their optional synonyms that define the values that the slot type can take.
     * </p>
     * 
     * @return A new list of values and their optional synonyms that define the values that the slot type can take.
     */

    public java.util.List<SlotTypeValue> getSlotTypeValues() {
        return slotTypeValues;
    }

    /**
     * <p>
     * A new list of values and their optional synonyms that define the values that the slot type can take.
     * </p>
     * 
     * @param slotTypeValues
     *        A new list of values and their optional synonyms that define the values that the slot type can take.
     */

    public void setSlotTypeValues(java.util.Collection<SlotTypeValue> slotTypeValues) {
        if (slotTypeValues == null) {
            this.slotTypeValues = null;
            return;
        }

        this.slotTypeValues = new java.util.ArrayList<SlotTypeValue>(slotTypeValues);
    }

    /**
     * <p>
     * A new list of values and their optional synonyms that define the values that the slot type can take.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotTypeValues(java.util.Collection)} or {@link #withSlotTypeValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param slotTypeValues
     *        A new list of values and their optional synonyms that define the values that the slot type can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withSlotTypeValues(SlotTypeValue... slotTypeValues) {
        if (this.slotTypeValues == null) {
            setSlotTypeValues(new java.util.ArrayList<SlotTypeValue>(slotTypeValues.length));
        }
        for (SlotTypeValue ele : slotTypeValues) {
            this.slotTypeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A new list of values and their optional synonyms that define the values that the slot type can take.
     * </p>
     * 
     * @param slotTypeValues
     *        A new list of values and their optional synonyms that define the values that the slot type can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withSlotTypeValues(java.util.Collection<SlotTypeValue> slotTypeValues) {
        setSlotTypeValues(slotTypeValues);
        return this;
    }

    /**
     * <p>
     * The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     * </p>
     * 
     * @param valueSelectionSetting
     *        The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     */

    public void setValueSelectionSetting(SlotValueSelectionSetting valueSelectionSetting) {
        this.valueSelectionSetting = valueSelectionSetting;
    }

    /**
     * <p>
     * The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     * </p>
     * 
     * @return The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     */

    public SlotValueSelectionSetting getValueSelectionSetting() {
        return this.valueSelectionSetting;
    }

    /**
     * <p>
     * The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     * </p>
     * 
     * @param valueSelectionSetting
     *        The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withValueSelectionSetting(SlotValueSelectionSetting valueSelectionSetting) {
        setValueSelectionSetting(valueSelectionSetting);
        return this;
    }

    /**
     * <p>
     * The new built-in slot type that should be used as the parent of this slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The new built-in slot type that should be used as the parent of this slot type.
     */

    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * The new built-in slot type that should be used as the parent of this slot type.
     * </p>
     * 
     * @return The new built-in slot type that should be used as the parent of this slot type.
     */

    public String getParentSlotTypeSignature() {
        return this.parentSlotTypeSignature;
    }

    /**
     * <p>
     * The new built-in slot type that should be used as the parent of this slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The new built-in slot type that should be used as the parent of this slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withParentSlotTypeSignature(String parentSlotTypeSignature) {
        setParentSlotTypeSignature(parentSlotTypeSignature);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slot type.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the slot type.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slot type.
     * </p>
     * 
     * @return The identifier of the bot that contains the slot type.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slot type.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     * </p>
     * 
     * @return The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the slot type. Must be <code>DRAFT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that contains the slot type. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that contains the slot type. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that contains the slot type. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that contains the slot type. The string must match one of the
     *         supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that contains the slot type. The string must match one of the supported
     * locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that contains the slot type. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlotTypeRequest withLocaleId(String localeId) {
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
        if (getSlotTypeId() != null)
            sb.append("SlotTypeId: ").append(getSlotTypeId()).append(",");
        if (getSlotTypeName() != null)
            sb.append("SlotTypeName: ").append(getSlotTypeName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSlotTypeValues() != null)
            sb.append("SlotTypeValues: ").append(getSlotTypeValues()).append(",");
        if (getValueSelectionSetting() != null)
            sb.append("ValueSelectionSetting: ").append(getValueSelectionSetting()).append(",");
        if (getParentSlotTypeSignature() != null)
            sb.append("ParentSlotTypeSignature: ").append(getParentSlotTypeSignature()).append(",");
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

        if (obj instanceof UpdateSlotTypeRequest == false)
            return false;
        UpdateSlotTypeRequest other = (UpdateSlotTypeRequest) obj;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
            return false;
        if (other.getSlotTypeName() == null ^ this.getSlotTypeName() == null)
            return false;
        if (other.getSlotTypeName() != null && other.getSlotTypeName().equals(this.getSlotTypeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlotTypeValues() == null ^ this.getSlotTypeValues() == null)
            return false;
        if (other.getSlotTypeValues() != null && other.getSlotTypeValues().equals(this.getSlotTypeValues()) == false)
            return false;
        if (other.getValueSelectionSetting() == null ^ this.getValueSelectionSetting() == null)
            return false;
        if (other.getValueSelectionSetting() != null && other.getValueSelectionSetting().equals(this.getValueSelectionSetting()) == false)
            return false;
        if (other.getParentSlotTypeSignature() == null ^ this.getParentSlotTypeSignature() == null)
            return false;
        if (other.getParentSlotTypeSignature() != null && other.getParentSlotTypeSignature().equals(this.getParentSlotTypeSignature()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeName() == null) ? 0 : getSlotTypeName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeValues() == null) ? 0 : getSlotTypeValues().hashCode());
        hashCode = prime * hashCode + ((getValueSelectionSetting() == null) ? 0 : getValueSelectionSetting().hashCode());
        hashCode = prime * hashCode + ((getParentSlotTypeSignature() == null) ? 0 : getParentSlotTypeSignature().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSlotTypeRequest clone() {
        return (UpdateSlotTypeRequest) super.clone();
    }

}
