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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The managed word list that was configured for the guardrail. (This is a list of words that are pre-defined and
 * managed by Guardrails only.)
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailManagedWords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailManagedWords implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer profanity
     * word list)
     * </p>
     */
    private String type;

    /**
     * <p>
     * ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer profanity
     * word list)
     * </p>
     * 
     * @param type
     *        ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer
     *        profanity word list)
     * @see GuardrailManagedWordsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer profanity
     * word list)
     * </p>
     * 
     * @return ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer
     *         profanity word list)
     * @see GuardrailManagedWordsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer profanity
     * word list)
     * </p>
     * 
     * @param type
     *        ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer
     *        profanity word list)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailManagedWordsType
     */

    public GuardrailManagedWords withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer profanity
     * word list)
     * </p>
     * 
     * @param type
     *        ManagedWords$type The managed word type that was configured for the guardrail. (For now, we only offer
     *        profanity word list)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailManagedWordsType
     */

    public GuardrailManagedWords withType(GuardrailManagedWordsType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailManagedWords == false)
            return false;
        GuardrailManagedWords other = (GuardrailManagedWords) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailManagedWords clone() {
        try {
            return (GuardrailManagedWords) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailManagedWordsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
