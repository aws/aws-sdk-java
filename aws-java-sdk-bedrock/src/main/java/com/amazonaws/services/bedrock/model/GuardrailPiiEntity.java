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
 * The PII entity configured for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailPiiEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailPiiEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of PII entity. For example, Social Security Number.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The configured guardrail action when PII entity is detected.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The type of PII entity. For example, Social Security Number.
     * </p>
     * 
     * @param type
     *        The type of PII entity. For example, Social Security Number.
     * @see GuardrailPiiEntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of PII entity. For example, Social Security Number.
     * </p>
     * 
     * @return The type of PII entity. For example, Social Security Number.
     * @see GuardrailPiiEntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of PII entity. For example, Social Security Number.
     * </p>
     * 
     * @param type
     *        The type of PII entity. For example, Social Security Number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailPiiEntityType
     */

    public GuardrailPiiEntity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of PII entity. For example, Social Security Number.
     * </p>
     * 
     * @param type
     *        The type of PII entity. For example, Social Security Number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailPiiEntityType
     */

    public GuardrailPiiEntity withType(GuardrailPiiEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The configured guardrail action when PII entity is detected.
     * </p>
     * 
     * @param action
     *        The configured guardrail action when PII entity is detected.
     * @see GuardrailSensitiveInformationAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The configured guardrail action when PII entity is detected.
     * </p>
     * 
     * @return The configured guardrail action when PII entity is detected.
     * @see GuardrailSensitiveInformationAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The configured guardrail action when PII entity is detected.
     * </p>
     * 
     * @param action
     *        The configured guardrail action when PII entity is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationAction
     */

    public GuardrailPiiEntity withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The configured guardrail action when PII entity is detected.
     * </p>
     * 
     * @param action
     *        The configured guardrail action when PII entity is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationAction
     */

    public GuardrailPiiEntity withAction(GuardrailSensitiveInformationAction action) {
        this.action = action.toString();
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
            sb.append("Type: ").append(getType()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailPiiEntity == false)
            return false;
        GuardrailPiiEntity other = (GuardrailPiiEntity) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailPiiEntity clone() {
        try {
            return (GuardrailPiiEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailPiiEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
