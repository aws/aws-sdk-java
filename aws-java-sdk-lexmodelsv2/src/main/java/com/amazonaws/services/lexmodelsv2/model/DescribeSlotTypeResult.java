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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSlotTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the slot type.
     * </p>
     */
    private String slotTypeId;
    /**
     * <p>
     * The name specified for the slot type.
     * </p>
     */
    private String slotTypeName;
    /**
     * <p>
     * The description specified for the slot type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The values that the slot type can take. Includes any synonyms for the slot type values.
     * </p>
     */
    private java.util.List<SlotTypeValue> slotTypeValues;
    /**
     * <p>
     * The strategy that Amazon Lex uses to choose a value from a list of possible values.
     * </p>
     */
    private SlotValueSelectionSetting valueSelectionSetting;
    /**
     * <p>
     * The built in slot type used as a parent to this slot type.
     * </p>
     */
    private String parentSlotTypeSignature;
    /**
     * <p>
     * The identifier of the bot associated with the slot type.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot associated with the slot type.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The language and locale specified for the slot type.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * A timestamp of the date and time that the slot type was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier for the slot type.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier for the slot type.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The unique identifier for the slot type.
     * </p>
     * 
     * @return The unique identifier for the slot type.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The unique identifier for the slot type.
     * </p>
     * 
     * @param slotTypeId
     *        The unique identifier for the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
        return this;
    }

    /**
     * <p>
     * The name specified for the slot type.
     * </p>
     * 
     * @param slotTypeName
     *        The name specified for the slot type.
     */

    public void setSlotTypeName(String slotTypeName) {
        this.slotTypeName = slotTypeName;
    }

    /**
     * <p>
     * The name specified for the slot type.
     * </p>
     * 
     * @return The name specified for the slot type.
     */

    public String getSlotTypeName() {
        return this.slotTypeName;
    }

    /**
     * <p>
     * The name specified for the slot type.
     * </p>
     * 
     * @param slotTypeName
     *        The name specified for the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withSlotTypeName(String slotTypeName) {
        setSlotTypeName(slotTypeName);
        return this;
    }

    /**
     * <p>
     * The description specified for the slot type.
     * </p>
     * 
     * @param description
     *        The description specified for the slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description specified for the slot type.
     * </p>
     * 
     * @return The description specified for the slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description specified for the slot type.
     * </p>
     * 
     * @param description
     *        The description specified for the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The values that the slot type can take. Includes any synonyms for the slot type values.
     * </p>
     * 
     * @return The values that the slot type can take. Includes any synonyms for the slot type values.
     */

    public java.util.List<SlotTypeValue> getSlotTypeValues() {
        return slotTypeValues;
    }

    /**
     * <p>
     * The values that the slot type can take. Includes any synonyms for the slot type values.
     * </p>
     * 
     * @param slotTypeValues
     *        The values that the slot type can take. Includes any synonyms for the slot type values.
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
     * The values that the slot type can take. Includes any synonyms for the slot type values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotTypeValues(java.util.Collection)} or {@link #withSlotTypeValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param slotTypeValues
     *        The values that the slot type can take. Includes any synonyms for the slot type values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withSlotTypeValues(SlotTypeValue... slotTypeValues) {
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
     * The values that the slot type can take. Includes any synonyms for the slot type values.
     * </p>
     * 
     * @param slotTypeValues
     *        The values that the slot type can take. Includes any synonyms for the slot type values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withSlotTypeValues(java.util.Collection<SlotTypeValue> slotTypeValues) {
        setSlotTypeValues(slotTypeValues);
        return this;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to choose a value from a list of possible values.
     * </p>
     * 
     * @param valueSelectionSetting
     *        The strategy that Amazon Lex uses to choose a value from a list of possible values.
     */

    public void setValueSelectionSetting(SlotValueSelectionSetting valueSelectionSetting) {
        this.valueSelectionSetting = valueSelectionSetting;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to choose a value from a list of possible values.
     * </p>
     * 
     * @return The strategy that Amazon Lex uses to choose a value from a list of possible values.
     */

    public SlotValueSelectionSetting getValueSelectionSetting() {
        return this.valueSelectionSetting;
    }

    /**
     * <p>
     * The strategy that Amazon Lex uses to choose a value from a list of possible values.
     * </p>
     * 
     * @param valueSelectionSetting
     *        The strategy that Amazon Lex uses to choose a value from a list of possible values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withValueSelectionSetting(SlotValueSelectionSetting valueSelectionSetting) {
        setValueSelectionSetting(valueSelectionSetting);
        return this;
    }

    /**
     * <p>
     * The built in slot type used as a parent to this slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The built in slot type used as a parent to this slot type.
     */

    public void setParentSlotTypeSignature(String parentSlotTypeSignature) {
        this.parentSlotTypeSignature = parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built in slot type used as a parent to this slot type.
     * </p>
     * 
     * @return The built in slot type used as a parent to this slot type.
     */

    public String getParentSlotTypeSignature() {
        return this.parentSlotTypeSignature;
    }

    /**
     * <p>
     * The built in slot type used as a parent to this slot type.
     * </p>
     * 
     * @param parentSlotTypeSignature
     *        The built in slot type used as a parent to this slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withParentSlotTypeSignature(String parentSlotTypeSignature) {
        setParentSlotTypeSignature(parentSlotTypeSignature);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot associated with the slot type.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the slot type.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the slot type.
     * </p>
     * 
     * @return The identifier of the bot associated with the slot type.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot associated with the slot type.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot associated with the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot associated with the slot type.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the slot type.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the slot type.
     * </p>
     * 
     * @return The version of the bot associated with the slot type.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot associated with the slot type.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot associated with the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The language and locale specified for the slot type.
     * </p>
     * 
     * @param localeId
     *        The language and locale specified for the slot type.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale specified for the slot type.
     * </p>
     * 
     * @return The language and locale specified for the slot type.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale specified for the slot type.
     * </p>
     * 
     * @param localeId
     *        The language and locale specified for the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the slot type was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the slot type was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the slot type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the slot type was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the slot type was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the slot type was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the slot type was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlotTypeResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSlotTypeResult == false)
            return false;
        DescribeSlotTypeResult other = (DescribeSlotTypeResult) obj;
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
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSlotTypeResult clone() {
        try {
            return (DescribeSlotTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
