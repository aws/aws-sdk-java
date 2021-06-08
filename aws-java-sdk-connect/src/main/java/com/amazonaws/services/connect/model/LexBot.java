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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information of an Amazon Lex bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/LexBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LexBot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     */
    private String lexRegion;

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Lex bot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @return The name of the Amazon Lex bot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Lex bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexBot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * 
     * @param lexRegion
     *        The Region that the Amazon Lex bot was created in.
     */

    public void setLexRegion(String lexRegion) {
        this.lexRegion = lexRegion;
    }

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * 
     * @return The Region that the Amazon Lex bot was created in.
     */

    public String getLexRegion() {
        return this.lexRegion;
    }

    /**
     * <p>
     * The Region that the Amazon Lex bot was created in.
     * </p>
     * 
     * @param lexRegion
     *        The Region that the Amazon Lex bot was created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LexBot withLexRegion(String lexRegion) {
        setLexRegion(lexRegion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLexRegion() != null)
            sb.append("LexRegion: ").append(getLexRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LexBot == false)
            return false;
        LexBot other = (LexBot) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLexRegion() == null ^ this.getLexRegion() == null)
            return false;
        if (other.getLexRegion() != null && other.getLexRegion().equals(this.getLexRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLexRegion() == null) ? 0 : getLexRegion().hashCode());
        return hashCode;
    }

    @Override
    public LexBot clone() {
        try {
            return (LexBot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.LexBotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
