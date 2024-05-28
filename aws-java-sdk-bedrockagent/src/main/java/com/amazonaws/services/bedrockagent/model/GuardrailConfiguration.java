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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the guardrails configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GuardrailConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The guardrails identifier assigned to the guardrails configuration.
     * </p>
     */
    private String guardrailIdentifier;
    /**
     * <p>
     * The guardrails version assigned to the guardrails configuration.
     * </p>
     */
    private String guardrailVersion;

    /**
     * <p>
     * The guardrails identifier assigned to the guardrails configuration.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The guardrails identifier assigned to the guardrails configuration.
     */

    public void setGuardrailIdentifier(String guardrailIdentifier) {
        this.guardrailIdentifier = guardrailIdentifier;
    }

    /**
     * <p>
     * The guardrails identifier assigned to the guardrails configuration.
     * </p>
     * 
     * @return The guardrails identifier assigned to the guardrails configuration.
     */

    public String getGuardrailIdentifier() {
        return this.guardrailIdentifier;
    }

    /**
     * <p>
     * The guardrails identifier assigned to the guardrails configuration.
     * </p>
     * 
     * @param guardrailIdentifier
     *        The guardrails identifier assigned to the guardrails configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailConfiguration withGuardrailIdentifier(String guardrailIdentifier) {
        setGuardrailIdentifier(guardrailIdentifier);
        return this;
    }

    /**
     * <p>
     * The guardrails version assigned to the guardrails configuration.
     * </p>
     * 
     * @param guardrailVersion
     *        The guardrails version assigned to the guardrails configuration.
     */

    public void setGuardrailVersion(String guardrailVersion) {
        this.guardrailVersion = guardrailVersion;
    }

    /**
     * <p>
     * The guardrails version assigned to the guardrails configuration.
     * </p>
     * 
     * @return The guardrails version assigned to the guardrails configuration.
     */

    public String getGuardrailVersion() {
        return this.guardrailVersion;
    }

    /**
     * <p>
     * The guardrails version assigned to the guardrails configuration.
     * </p>
     * 
     * @param guardrailVersion
     *        The guardrails version assigned to the guardrails configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailConfiguration withGuardrailVersion(String guardrailVersion) {
        setGuardrailVersion(guardrailVersion);
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
        if (getGuardrailIdentifier() != null)
            sb.append("GuardrailIdentifier: ").append(getGuardrailIdentifier()).append(",");
        if (getGuardrailVersion() != null)
            sb.append("GuardrailVersion: ").append(getGuardrailVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailConfiguration == false)
            return false;
        GuardrailConfiguration other = (GuardrailConfiguration) obj;
        if (other.getGuardrailIdentifier() == null ^ this.getGuardrailIdentifier() == null)
            return false;
        if (other.getGuardrailIdentifier() != null && other.getGuardrailIdentifier().equals(this.getGuardrailIdentifier()) == false)
            return false;
        if (other.getGuardrailVersion() == null ^ this.getGuardrailVersion() == null)
            return false;
        if (other.getGuardrailVersion() != null && other.getGuardrailVersion().equals(this.getGuardrailVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGuardrailIdentifier() == null) ? 0 : getGuardrailIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGuardrailVersion() == null) ? 0 : getGuardrailVersion().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailConfiguration clone() {
        try {
            return (GuardrailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.GuardrailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
