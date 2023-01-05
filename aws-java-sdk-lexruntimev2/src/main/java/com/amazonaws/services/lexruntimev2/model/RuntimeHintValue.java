/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the phrase that Amazon Lex V2 should look for in the user's input to the bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RuntimeHintValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeHintValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     * </p>
     */
    private String phrase;

    /**
     * <p>
     * The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     * </p>
     * 
     * @param phrase
     *        The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     */

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    /**
     * <p>
     * The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     * </p>
     * 
     * @return The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     */

    public String getPhrase() {
        return this.phrase;
    }

    /**
     * <p>
     * The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     * </p>
     * 
     * @param phrase
     *        The phrase that Amazon Lex V2 should look for in the user's input to the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeHintValue withPhrase(String phrase) {
        setPhrase(phrase);
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
        if (getPhrase() != null)
            sb.append("Phrase: ").append(getPhrase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeHintValue == false)
            return false;
        RuntimeHintValue other = (RuntimeHintValue) obj;
        if (other.getPhrase() == null ^ this.getPhrase() == null)
            return false;
        if (other.getPhrase() != null && other.getPhrase().equals(this.getPhrase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhrase() == null) ? 0 : getPhrase().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeHintValue clone() {
        try {
            return (RuntimeHintValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.RuntimeHintValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
