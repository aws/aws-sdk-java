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
 * Provided the identity of a the bot that was exported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotExportSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotExportSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the bot assigned by Amazon Lex.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     * </p>
     */
    private String botVersion;

    /**
     * <p>
     * The identifier of the bot assigned by Amazon Lex.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot assigned by Amazon Lex.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot assigned by Amazon Lex.
     * </p>
     * 
     * @return The identifier of the bot assigned by Amazon Lex.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot assigned by Amazon Lex.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot assigned by Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotExportSpecification withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     * </p>
     * 
     * @return The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was exported. This will be either <code>DRAFT</code> or the version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotExportSpecification withBotVersion(String botVersion) {
        setBotVersion(botVersion);
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
            sb.append("BotVersion: ").append(getBotVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotExportSpecification == false)
            return false;
        BotExportSpecification other = (BotExportSpecification) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        return hashCode;
    }

    @Override
    public BotExportSpecification clone() {
        try {
            return (BotExportSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotExportSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
