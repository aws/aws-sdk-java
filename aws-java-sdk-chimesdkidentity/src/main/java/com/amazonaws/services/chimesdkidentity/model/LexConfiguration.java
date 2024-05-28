/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for an Amazon Lex V2 bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/LexConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LexConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not supported.
     * </p>
     */
    private String respondsTo;
    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     */
    private InvokedBy invokedBy;
    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     */
    private String lexBotAliasArn;
    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales in
     * Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     */
    private String welcomeIntent;

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not supported.
     * </p>
     * 
     * @param respondsTo
     *        <p>
     *        <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *        </p>
     *        </important>
     *        <p>
     *        Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not
     *        supported.
     * @see RespondsTo
     */

    public void setRespondsTo(String respondsTo) {
        this.respondsTo = respondsTo;
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not supported.
     * </p>
     * 
     * @return <p>
     *         <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *         </p>
     *         </important>
     *         <p>
     *         Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not
     *         supported.
     * @see RespondsTo
     */

    public String getRespondsTo() {
        return this.respondsTo;
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not supported.
     * </p>
     * 
     * @param respondsTo
     *        <p>
     *        <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *        </p>
     *        </important>
     *        <p>
     *        Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RespondsTo
     */

    public LexConfiguration withRespondsTo(String respondsTo) {
        setRespondsTo(respondsTo);
        return this;
    }

    /**
     * <important>
     * <p>
     * <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     * </p>
     * </important>
     * <p>
     * Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not supported.
     * </p>
     * 
     * @param respondsTo
     *        <p>
     *        <b>Deprecated</b>. Use <code>InvokedBy</code> instead.
     *        </p>
     *        </important>
     *        <p>
     *        Determines whether the Amazon Lex V2 bot responds to all standard messages. Control messages are not
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RespondsTo
     */

    public LexConfiguration withRespondsTo(RespondsTo respondsTo) {
        this.respondsTo = respondsTo.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     * 
     * @param invokedBy
     *        Specifies the type of message that triggers a bot.
     */

    public void setInvokedBy(InvokedBy invokedBy) {
        this.invokedBy = invokedBy;
    }

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     * 
     * @return Specifies the type of message that triggers a bot.
     */

    public InvokedBy getInvokedBy() {
        return this.invokedBy;
    }

    /**
     * <p>
     * Specifies the type of message that triggers a bot.
     * </p>
     * 
     * @param invokedBy
     *        Specifies the type of message that triggers a bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexConfiguration withInvokedBy(InvokedBy invokedBy) {
        setInvokedBy(invokedBy);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * 
     * @param lexBotAliasArn
     *        The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     *        <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     */

    public void setLexBotAliasArn(String lexBotAliasArn) {
        this.lexBotAliasArn = lexBotAliasArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * 
     * @return The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     *         <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     */

    public String getLexBotAliasArn() {
        return this.lexBotAliasArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     * <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * </p>
     * 
     * @param lexBotAliasArn
     *        The ARN of the Amazon Lex V2 bot's alias. The ARN uses this format:
     *        <code>arn:aws:lex:REGION:ACCOUNT:bot-alias/MYBOTID/MYBOTALIAS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexConfiguration withLexBotAliasArn(String lexBotAliasArn) {
        setLexBotAliasArn(lexBotAliasArn);
        return this;
    }

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales in
     * Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     * 
     * @param localeId
     *        Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales
     *        in Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For
     *        more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     *        languages</a> in the <i>Amazon Lex V2 Developer Guide</i>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales in
     * Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     * 
     * @return Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported
     *         locales in Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same
     *         locale. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a> in the
     *         <i>Amazon Lex V2 Developer Guide</i>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales in
     * Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * in the <i>Amazon Lex V2 Developer Guide</i>.
     * </p>
     * 
     * @param localeId
     *        Identifies the Amazon Lex V2 bot's language and locale. The string must match one of the supported locales
     *        in Amazon Lex V2. All of the intents, slot types, and slots used in the bot must have the same locale. For
     *        more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported
     *        languages</a> in the <i>Amazon Lex V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexConfiguration withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * 
     * @param welcomeIntent
     *        The name of the welcome intent configured in the Amazon Lex V2 bot.
     */

    public void setWelcomeIntent(String welcomeIntent) {
        this.welcomeIntent = welcomeIntent;
    }

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * 
     * @return The name of the welcome intent configured in the Amazon Lex V2 bot.
     */

    public String getWelcomeIntent() {
        return this.welcomeIntent;
    }

    /**
     * <p>
     * The name of the welcome intent configured in the Amazon Lex V2 bot.
     * </p>
     * 
     * @param welcomeIntent
     *        The name of the welcome intent configured in the Amazon Lex V2 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexConfiguration withWelcomeIntent(String welcomeIntent) {
        setWelcomeIntent(welcomeIntent);
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
        if (getRespondsTo() != null)
            sb.append("RespondsTo: ").append(getRespondsTo()).append(",");
        if (getInvokedBy() != null)
            sb.append("InvokedBy: ").append(getInvokedBy()).append(",");
        if (getLexBotAliasArn() != null)
            sb.append("LexBotAliasArn: ").append(getLexBotAliasArn()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getWelcomeIntent() != null)
            sb.append("WelcomeIntent: ").append(getWelcomeIntent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexConfiguration == false)
            return false;
        LexConfiguration other = (LexConfiguration) obj;
        if (other.getRespondsTo() == null ^ this.getRespondsTo() == null)
            return false;
        if (other.getRespondsTo() != null && other.getRespondsTo().equals(this.getRespondsTo()) == false)
            return false;
        if (other.getInvokedBy() == null ^ this.getInvokedBy() == null)
            return false;
        if (other.getInvokedBy() != null && other.getInvokedBy().equals(this.getInvokedBy()) == false)
            return false;
        if (other.getLexBotAliasArn() == null ^ this.getLexBotAliasArn() == null)
            return false;
        if (other.getLexBotAliasArn() != null && other.getLexBotAliasArn().equals(this.getLexBotAliasArn()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getWelcomeIntent() == null ^ this.getWelcomeIntent() == null)
            return false;
        if (other.getWelcomeIntent() != null && other.getWelcomeIntent().equals(this.getWelcomeIntent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRespondsTo() == null) ? 0 : getRespondsTo().hashCode());
        hashCode = prime * hashCode + ((getInvokedBy() == null) ? 0 : getInvokedBy().hashCode());
        hashCode = prime * hashCode + ((getLexBotAliasArn() == null) ? 0 : getLexBotAliasArn().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getWelcomeIntent() == null) ? 0 : getWelcomeIntent().hashCode());
        return hashCode;
    }

    @Override
    public LexConfiguration clone() {
        try {
            return (LexConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.LexConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
