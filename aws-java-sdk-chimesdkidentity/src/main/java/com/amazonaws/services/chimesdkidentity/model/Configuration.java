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
 * A structure that contains configuration data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/Configuration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     */
    private LexConfiguration lex;

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     * 
     * @param lex
     *        The configuration for an Amazon Lex V2 bot.
     */

    public void setLex(LexConfiguration lex) {
        this.lex = lex;
    }

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     * 
     * @return The configuration for an Amazon Lex V2 bot.
     */

    public LexConfiguration getLex() {
        return this.lex;
    }

    /**
     * <p>
     * The configuration for an Amazon Lex V2 bot.
     * </p>
     * 
     * @param lex
     *        The configuration for an Amazon Lex V2 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withLex(LexConfiguration lex) {
        setLex(lex);
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
        if (getLex() != null)
            sb.append("Lex: ").append(getLex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
        if (other.getLex() == null ^ this.getLex() == null)
            return false;
        if (other.getLex() != null && other.getLex().equals(this.getLex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLex() == null) ? 0 : getLex().hashCode());
        return hashCode;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
