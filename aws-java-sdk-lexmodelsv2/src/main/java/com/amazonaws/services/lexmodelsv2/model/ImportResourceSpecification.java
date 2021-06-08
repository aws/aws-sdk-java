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
 * Provides information about the bot or bot locale that you want to import. You can sepcifiy the
 * <code>botImportSpecification</code> or the <code>botLocaleImportSpecification</code>, but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ImportResourceSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportResourceSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters for importing a bot.
     * </p>
     */
    private BotImportSpecification botImportSpecification;
    /**
     * <p>
     * Parameters for importing a bot locale.
     * </p>
     */
    private BotLocaleImportSpecification botLocaleImportSpecification;

    /**
     * <p>
     * Parameters for importing a bot.
     * </p>
     * 
     * @param botImportSpecification
     *        Parameters for importing a bot.
     */

    public void setBotImportSpecification(BotImportSpecification botImportSpecification) {
        this.botImportSpecification = botImportSpecification;
    }

    /**
     * <p>
     * Parameters for importing a bot.
     * </p>
     * 
     * @return Parameters for importing a bot.
     */

    public BotImportSpecification getBotImportSpecification() {
        return this.botImportSpecification;
    }

    /**
     * <p>
     * Parameters for importing a bot.
     * </p>
     * 
     * @param botImportSpecification
     *        Parameters for importing a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourceSpecification withBotImportSpecification(BotImportSpecification botImportSpecification) {
        setBotImportSpecification(botImportSpecification);
        return this;
    }

    /**
     * <p>
     * Parameters for importing a bot locale.
     * </p>
     * 
     * @param botLocaleImportSpecification
     *        Parameters for importing a bot locale.
     */

    public void setBotLocaleImportSpecification(BotLocaleImportSpecification botLocaleImportSpecification) {
        this.botLocaleImportSpecification = botLocaleImportSpecification;
    }

    /**
     * <p>
     * Parameters for importing a bot locale.
     * </p>
     * 
     * @return Parameters for importing a bot locale.
     */

    public BotLocaleImportSpecification getBotLocaleImportSpecification() {
        return this.botLocaleImportSpecification;
    }

    /**
     * <p>
     * Parameters for importing a bot locale.
     * </p>
     * 
     * @param botLocaleImportSpecification
     *        Parameters for importing a bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportResourceSpecification withBotLocaleImportSpecification(BotLocaleImportSpecification botLocaleImportSpecification) {
        setBotLocaleImportSpecification(botLocaleImportSpecification);
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
        if (getBotImportSpecification() != null)
            sb.append("BotImportSpecification: ").append(getBotImportSpecification()).append(",");
        if (getBotLocaleImportSpecification() != null)
            sb.append("BotLocaleImportSpecification: ").append(getBotLocaleImportSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportResourceSpecification == false)
            return false;
        ImportResourceSpecification other = (ImportResourceSpecification) obj;
        if (other.getBotImportSpecification() == null ^ this.getBotImportSpecification() == null)
            return false;
        if (other.getBotImportSpecification() != null && other.getBotImportSpecification().equals(this.getBotImportSpecification()) == false)
            return false;
        if (other.getBotLocaleImportSpecification() == null ^ this.getBotLocaleImportSpecification() == null)
            return false;
        if (other.getBotLocaleImportSpecification() != null && other.getBotLocaleImportSpecification().equals(this.getBotLocaleImportSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotImportSpecification() == null) ? 0 : getBotImportSpecification().hashCode());
        hashCode = prime * hashCode + ((getBotLocaleImportSpecification() == null) ? 0 : getBotLocaleImportSpecification().hashCode());
        return hashCode;
    }

    @Override
    public ImportResourceSpecification clone() {
        try {
            return (ImportResourceSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ImportResourceSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
