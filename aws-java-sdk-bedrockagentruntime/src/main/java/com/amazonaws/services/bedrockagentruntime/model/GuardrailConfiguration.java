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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/GuardrailConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the guardrail.
     * </p>
     */
    private String guardrailId;
    /**
     * <p>
     * The version of the guardrail.
     * </p>
     */
    private String guardrailVersion;

    /**
     * <p>
     * The unique identifier for the guardrail.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier for the guardrail.
     */

    public void setGuardrailId(String guardrailId) {
        this.guardrailId = guardrailId;
    }

    /**
     * <p>
     * The unique identifier for the guardrail.
     * </p>
     * 
     * @return The unique identifier for the guardrail.
     */

    public String getGuardrailId() {
        return this.guardrailId;
    }

    /**
     * <p>
     * The unique identifier for the guardrail.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailConfiguration withGuardrailId(String guardrailId) {
        setGuardrailId(guardrailId);
        return this;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param guardrailVersion
     *        The version of the guardrail.
     */

    public void setGuardrailVersion(String guardrailVersion) {
        this.guardrailVersion = guardrailVersion;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @return The version of the guardrail.
     */

    public String getGuardrailVersion() {
        return this.guardrailVersion;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param guardrailVersion
     *        The version of the guardrail.
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
        if (getGuardrailId() != null)
            sb.append("GuardrailId: ").append(getGuardrailId()).append(",");
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
        if (other.getGuardrailId() == null ^ this.getGuardrailId() == null)
            return false;
        if (other.getGuardrailId() != null && other.getGuardrailId().equals(this.getGuardrailId()) == false)
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

        hashCode = prime * hashCode + ((getGuardrailId() == null) ? 0 : getGuardrailId().hashCode());
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
        com.amazonaws.services.bedrockagentruntime.model.transform.GuardrailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
