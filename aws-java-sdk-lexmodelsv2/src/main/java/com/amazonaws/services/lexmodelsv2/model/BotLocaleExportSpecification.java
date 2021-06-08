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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the bot locale parameters required for exporting a bot locale.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotLocaleExportSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotLocaleExportSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot to export.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale to export. The string must match one of the locales in the bot.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to create the locale for.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     * 
     * @return The identifier of the bot to create the locale for.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to create the locale for.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to create the locale for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleExportSpecification withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to export.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * 
     * @return The version of the bot to export.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot to export.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleExportSpecification withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale to export. The string must match one of the locales in the bot.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale to export. The string must match one of the locales in the bot.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale to export. The string must match one of the locales in the bot.
     * </p>
     * 
     * @return The identifier of the language and locale to export. The string must match one of the locales in the bot.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale to export. The string must match one of the locales in the bot.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale to export. The string must match one of the locales in the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotLocaleExportSpecification withLocaleId(String localeId) {
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

        if (obj instanceof BotLocaleExportSpecification == false)
            return false;
        BotLocaleExportSpecification other = (BotLocaleExportSpecification) obj;
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public BotLocaleExportSpecification clone() {
        try {
            return (BotLocaleExportSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotLocaleExportSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
