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
 * Provides information about the bot or bot locale that you want to export. You can specify the
 * <code>botExportSpecification</code> or the <code>botLocaleExportSpecification</code>, but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ExportResourceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportResourceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters for exporting a bot.
     * </p>
     */
    private BotExportSpecification botExportSpecification;
    /**
     * <p>
     * Parameters for exporting a bot locale.
     * </p>
     */
    private BotLocaleExportSpecification botLocaleExportSpecification;

    /**
     * <p>
     * Parameters for exporting a bot.
     * </p>
     * 
     * @param botExportSpecification
     *        Parameters for exporting a bot.
     */

    public void setBotExportSpecification(BotExportSpecification botExportSpecification) {
        this.botExportSpecification = botExportSpecification;
    }

    /**
     * <p>
     * Parameters for exporting a bot.
     * </p>
     * 
     * @return Parameters for exporting a bot.
     */

    public BotExportSpecification getBotExportSpecification() {
        return this.botExportSpecification;
    }

    /**
     * <p>
     * Parameters for exporting a bot.
     * </p>
     * 
     * @param botExportSpecification
     *        Parameters for exporting a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportResourceSpecification withBotExportSpecification(BotExportSpecification botExportSpecification) {
        setBotExportSpecification(botExportSpecification);
        return this;
    }

    /**
     * <p>
     * Parameters for exporting a bot locale.
     * </p>
     * 
     * @param botLocaleExportSpecification
     *        Parameters for exporting a bot locale.
     */

    public void setBotLocaleExportSpecification(BotLocaleExportSpecification botLocaleExportSpecification) {
        this.botLocaleExportSpecification = botLocaleExportSpecification;
    }

    /**
     * <p>
     * Parameters for exporting a bot locale.
     * </p>
     * 
     * @return Parameters for exporting a bot locale.
     */

    public BotLocaleExportSpecification getBotLocaleExportSpecification() {
        return this.botLocaleExportSpecification;
    }

    /**
     * <p>
     * Parameters for exporting a bot locale.
     * </p>
     * 
     * @param botLocaleExportSpecification
     *        Parameters for exporting a bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportResourceSpecification withBotLocaleExportSpecification(BotLocaleExportSpecification botLocaleExportSpecification) {
        setBotLocaleExportSpecification(botLocaleExportSpecification);
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
        if (getBotExportSpecification() != null)
            sb.append("BotExportSpecification: ").append(getBotExportSpecification()).append(",");
        if (getBotLocaleExportSpecification() != null)
            sb.append("BotLocaleExportSpecification: ").append(getBotLocaleExportSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportResourceSpecification == false)
            return false;
        ExportResourceSpecification other = (ExportResourceSpecification) obj;
        if (other.getBotExportSpecification() == null ^ this.getBotExportSpecification() == null)
            return false;
        if (other.getBotExportSpecification() != null && other.getBotExportSpecification().equals(this.getBotExportSpecification()) == false)
            return false;
        if (other.getBotLocaleExportSpecification() == null ^ this.getBotLocaleExportSpecification() == null)
            return false;
        if (other.getBotLocaleExportSpecification() != null && other.getBotLocaleExportSpecification().equals(this.getBotLocaleExportSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotExportSpecification() == null) ? 0 : getBotExportSpecification().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleExportSpecification() == null) ? 0 : getBotLocaleExportSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ExportResourceSpecification clone() {
        try {
            return (ExportResourceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ExportResourceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
