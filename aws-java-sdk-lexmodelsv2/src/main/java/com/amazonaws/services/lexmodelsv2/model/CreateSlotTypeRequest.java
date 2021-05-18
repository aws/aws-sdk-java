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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the slot. A slot type name must be unique within the account.
     * </p>
     */
    private String slotTypeName;
    /**
     * <p>
     * A description of the slot type. Use the description to help identify the slot type in lists.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each value can
     * have a list of synonyms, additional values that help train the machine learning model about the values that it
     * resolves for a slot.
     * </p>
     */
    private java.util.List<SlotTypeValue> slotTypeValues;
    /**
     * <p>
     * Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be
     * set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the resolution
     * list. If there is no resolution list, return null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionSetting</code> parameter, the default is <code>OriginalValue</code>.
     * </p>
     */
    private SlotValueSelectionSetting valueSelectionSetting;
    /**
     * <p>
     * The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type
     * has the configuration of the parent slot type.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     */
    private String parentSlotTypeSignature;
    /**
     * <p>
     * The identifier of the bot associated with this slot type.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the bot version associated with this slot type.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that the slot type will be used in. The string must match one of the
     * supported locales. All of the bots, intents, and slots used by the slot type must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The name for the slot. A slot type name must be unique within the account.
     * </p>
     * 
     * @param slotTypeName
     *        The name for the slot. A slot type name must be unique within the account.
     */

    public void setSlotTypeName(String slotTypeName) {
        this.slotTypeName = slotTypeName;
    }

    /**
     * <p>
     * The name for the slot. A slot type name must be unique within the account.
     * </p>
     * 
     * @return The name for the slot. A slot type name must be unique within the account.
     */

    public String getSlotTypeName() {
        return this.slotTypeName;
    }

    /**
     * <p>
     * The name for the slot. A slot type name must be unique within the account.
     * </p>
     * 
     * @param slotTypeName
     *        The name for the slot. A slot type name must be unique within the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withSlotTypeName(String slotTypeName) {
        setSlotTypeName(slotTypeName);
        return this;
    }

    /**
     * <p>
     * A description of the slot type. Use the description to help identify the slot type in lists.
     * </p>
     * 
     * @param description
     *        A description of the slot type. Use the description to help identify the slot type in lists.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot type. Use the description to help identify the slot type in lists.
     * </p>
     * 
     * @return A description of the slot type. Use the description to help identify the slot type in lists.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the slot type. Use the description to help identify the slot type in lists.
     * </p>
     * 
     * @param description
     *        A description of the slot type. Use the description to help identify the slot type in lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each value can
     * have a list of synonyms, additional values that help train the machine learning model about the values that it
     * resolves for a slot.
     * </p>
     * 
     * @return A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each
     *         value can have a list of synonyms, additional values that help train the machine learning model about the
     *         values that it resolves for a slot.
     */

    public java.util.List<SlotTypeValue> getSlotTypeValues() {
        return slotTypeValues;
    }

    /**
     * <p>
     * A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each value can
     * have a list of synonyms, additional values that help train the machine learning model about the values that it
     * resolves for a slot.
     * </p>
     * 
     * @param slotTypeValues
     *        A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each
     *        value can have a list of synonyms, additional values that help train the machine learning model about the
     *        values that it resolves for a slot.
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
     * A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each value can
     * have a list of synonyms, additional values that help train the machine learning model about the values that it
     * resolves for a slot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotTypeValues(java.util.Collection)} or {@link #withSlotTypeValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param slotTypeValues
     *        A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each
     *        value can have a list of synonyms, additional values that help train the machine learning model about the
     *        values that it resolves for a slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withSlotTypeValues(SlotTypeValue... slotTypeValues) {
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
     * A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each value can
     * have a list of synonyms, additional values that help train the machine learning model about the values that it
     * resolves for a slot.
     * </p>
     * 
     * @param slotTypeValues
     *        A list of <code>SlotTypeValue</code> objects that defines the values that the slot type can take. Each
     *        value can have a list of synonyms, additional values that help train the machine learning model about the
     *        values that it resolves for a slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withSlotTypeValues(java.util.Collection<SlotTypeValue> slotTypeValues) {
        setSlotTypeValues(slotTypeValues);
        return this;
    }

    /**
     * <p>
     * Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be
     * set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the resolution
     * list. If there is no resolution list, return null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionSetting</code> parameter, the default is <code>OriginalValue</code>.
     * </p>
     * 
     * @param valueSelectionSetting
     *        Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field
     *        can be set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the
     *        slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the
     *        resolution list. If there is no resolution list, return null.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the <code>valueSelectionSetting</code> parameter, the default is
     *        <code>OriginalValue</code>.
     */

    public void setValueSelectionSetting(SlotValueSelectionSetting valueSelectionSetting) {
        this.valueSelectionSetting = valueSelectionSetting;
    }

    /**
     * <p>
     * Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be
     * set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the resolution
     * list. If there is no resolution list, return null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionSetting</code> parameter, the default is <code>OriginalValue</code>.
     * </p>
     * 
     * @return Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The
     *         field can be set to one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the
     *         slot value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the
     *         resolution list. If there is no resolution list, return null.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify the <code>valueSelectionSetting</code> parameter, the default is
     *         <code>OriginalValue</code>.
     */

    public SlotValueSelectionSetting getValueSelectionSetting() {
        return this.valueSelectionSetting;
    }

    /**
     * <p>
     * Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be
     * set to one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the slot
     * value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the resolution
     * list. If there is no resolution list, return null.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify the <code>valueSelectionSetting</code> parameter, the default is <code>OriginalValue</code>.
     * </p>
     * 
     * @param valueSelectionSetting
     *        Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field
     *        can be set to one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OriginalValue</code> - Returns the value entered by the user, if the user value is similar to the
     *        slot value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TopResolution</code> - If there is a resolution list for the slot, return the first value in the
     *        resolution list. If there is no resolution list, return null.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify the <code>valueSelectionSetting</code> parameter, the default is
     *        <code>OriginalValue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withValueSelectionSetting(SlotValueSelectionSetting valueSelectionSetting) {
        setValueSelectionSetting(valueSelectionSetting);
        return this;
    }

    /**
     * <p>
     * The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type
     * has the configuration of the parent slot type.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new
     *        slot type has the configuration of the parent slot type.</p>
     *        <p>
     *        Only <code>AMAZON.AlphaNumeric</code> is supported.
     */

    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type
     * has the configuration of the parent slot type.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * 
     * @return The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new
     *         slot type has the configuration of the parent slot type.</p>
     *         <p>
     *         Only <code>AMAZON.AlphaNumeric</code> is supported.
     */

    public String getParentSlotTypeSignature() {
        return this.parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type
     * has the configuration of the parent slot type.
     * </p>
     * <p>
     * Only <code>AMAZON.AlphaNumeric</code> is supported.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The built-in slot type used as a parent of this slot type. When you define a parent slot type, the new
     *        slot type has the configuration of the parent slot type.</p>
     *        <p>
     *        Only <code>AMAZON.AlphaNumeric</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withParentSlotTypeSignature(String parentSlotTypeSignature) {
        setParentSlotTypeSignature(parentSlotTypeSignature);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with this slot type.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with this slot type.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with this slot type.
     * </p>
     * 
     * @return The identifier of the bot associated with this slot type.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with this slot type.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with this slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot version associated with this slot type.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the bot version associated with this slot type.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the bot version associated with this slot type.
     * </p>
     * 
     * @return The identifier of the bot version associated with this slot type.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the bot version associated with this slot type.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the bot version associated with this slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot type will be used in. The string must match one of the
     * supported locales. All of the bots, intents, and slots used by the slot type must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the slot type will be used in. The string must match one of
     *        the supported locales. All of the bots, intents, and slots used by the slot type must have the same
     *        locale. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot type will be used in. The string must match one of the
     * supported locales. All of the bots, intents, and slots used by the slot type must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that the slot type will be used in. The string must match one
     *         of the supported locales. All of the bots, intents, and slots used by the slot type must have the same
     *         locale. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot type will be used in. The string must match one of the
     * supported locales. All of the bots, intents, and slots used by the slot type must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     * languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the slot type will be used in. The string must match one of
     *        the supported locales. All of the bots, intents, and slots used by the slot type must have the same
     *        locale. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSlotTypeRequest withLocaleId(String localeId) {
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

        if (obj instanceof CreateSlotTypeRequest == false)
            return false;
        CreateSlotTypeRequest other = (CreateSlotTypeRequest) obj;
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
    public CreateSlotTypeRequest clone() {
        return (CreateSlotTypeRequest) super.clone();
    }

}
