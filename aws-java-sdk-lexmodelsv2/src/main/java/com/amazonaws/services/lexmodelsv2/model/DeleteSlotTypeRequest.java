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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteSlotType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSlotTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the slot type to delete.
     * </p>
     */
    private String slotTypeId;
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
     * The identifier of the language and locale that the slot type will be deleted from. The string must match one of
     * the supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code> exception if
     * you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     * </p>
     */
    private Boolean skipResourceInUseCheck;

    /**
     * <p>
     * The identifier of the slot type to delete.
     * </p>
     * 
     * @param slotTypeId
     *        The identifier of the slot type to delete.
     */

    public void setSlotTypeId(String slotTypeId) {
        this.slotTypeId = slotTypeId;
    }

    /**
     * <p>
     * The identifier of the slot type to delete.
     * </p>
     * 
     * @return The identifier of the slot type to delete.
     */

    public String getSlotTypeId() {
        return this.slotTypeId;
    }

    /**
     * <p>
     * The identifier of the slot type to delete.
     * </p>
     * 
     * @param slotTypeId
     *        The identifier of the slot type to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSlotTypeRequest withSlotTypeId(String slotTypeId) {
        setSlotTypeId(slotTypeId);
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

    public DeleteSlotTypeRequest withBotId(String botId) {
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

    public DeleteSlotTypeRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot type will be deleted from. The string must match one of
     * the supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the slot type will be deleted from. The string must match
     *        one of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot type will be deleted from. The string must match one of
     * the supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that the slot type will be deleted from. The string must match
     *         one of the supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the slot type will be deleted from. The string must match one of
     * the supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the slot type will be deleted from. The string must match
     *        one of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSlotTypeRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code> exception if
     * you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code>
     *        exception if you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code>
     *        parameter to <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     */

    public void setSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        this.skipResourceInUseCheck = skipResourceInUseCheck;
    }

    /**
     * <p>
     * By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code> exception if
     * you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     * </p>
     * 
     * @return By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code>
     *         exception if you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code>
     *         parameter to <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     */

    public Boolean getSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
    }

    /**
     * <p>
     * By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code> exception if
     * you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     * </p>
     * 
     * @param skipResourceInUseCheck
     *        By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code>
     *        exception if you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code>
     *        parameter to <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSlotTypeRequest withSkipResourceInUseCheck(Boolean skipResourceInUseCheck) {
        setSkipResourceInUseCheck(skipResourceInUseCheck);
        return this;
    }

    /**
     * <p>
     * By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code> exception if
     * you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code> parameter to
     * <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     * </p>
     * 
     * @return By default, the <code>DeleteSlotType</code> operations throws a <code>ResourceInUseException</code>
     *         exception if you try to delete a slot type used by a slot. Set the <code>skipResourceInUseCheck</code>
     *         parameter to <code>true</code> to skip this check and remove the slot type even if a slot uses it.
     */

    public Boolean isSkipResourceInUseCheck() {
        return this.skipResourceInUseCheck;
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getSkipResourceInUseCheck() != null)
            sb.append("SkipResourceInUseCheck: ").append(getSkipResourceInUseCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSlotTypeRequest == false)
            return false;
        DeleteSlotTypeRequest other = (DeleteSlotTypeRequest) obj;
        if (other.getSlotTypeId() == null ^ this.getSlotTypeId() == null)
            return false;
        if (other.getSlotTypeId() != null && other.getSlotTypeId().equals(this.getSlotTypeId()) == false)
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
        if (other.getSkipResourceInUseCheck() == null ^ this.getSkipResourceInUseCheck() == null)
            return false;
        if (other.getSkipResourceInUseCheck() != null && other.getSkipResourceInUseCheck().equals(this.getSkipResourceInUseCheck()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotTypeId() == null) ? 0 : getSlotTypeId().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getSkipResourceInUseCheck() == null) ? 0 : getSkipResourceInUseCheck().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSlotTypeRequest clone() {
        return (DeleteSlotTypeRequest) super.clone();
    }

}
