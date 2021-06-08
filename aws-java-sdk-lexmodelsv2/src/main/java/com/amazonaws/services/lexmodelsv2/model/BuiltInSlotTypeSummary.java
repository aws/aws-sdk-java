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
 * Provides summary information about a built-in slot type for the <a>ListBuiltInSlotTypes</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuiltInSlotTypeSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuiltInSlotTypeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     * </p>
     */
    private String slotTypeSignature;
    /**
     * <p>
     * The description of the built-in slot type.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     * </p>
     * 
     * @param slotTypeSignature
     *        The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     */

    public void setSlotTypeSignature(String slotTypeSignature) {
        this.slotTypeSignature = slotTypeSignature;
    }

    /**
     * <p>
     * The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     * </p>
     * 
     * @return The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     */

    public String getSlotTypeSignature() {
        return this.slotTypeSignature;
    }

    /**
     * <p>
     * The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     * </p>
     * 
     * @param slotTypeSignature
     *        The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuiltInSlotTypeSummary withSlotTypeSignature(String slotTypeSignature) {
        setSlotTypeSignature(slotTypeSignature);
        return this;
    }

    /**
     * <p>
     * The description of the built-in slot type.
     * </p>
     * 
     * @param description
     *        The description of the built-in slot type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the built-in slot type.
     * </p>
     * 
     * @return The description of the built-in slot type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the built-in slot type.
     * </p>
     * 
     * @param description
     *        The description of the built-in slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuiltInSlotTypeSummary withDescription(String description) {
        setDescription(description);
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
        if (getSlotTypeSignature() != null)
            sb.append("SlotTypeSignature: ").append(getSlotTypeSignature()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuiltInSlotTypeSummary == false)
            return false;
        BuiltInSlotTypeSummary other = (BuiltInSlotTypeSummary) obj;
        if (other.getSlotTypeSignature() == null ^ this.getSlotTypeSignature() == null)
            return false;
        if (other.getSlotTypeSignature() != null && other.getSlotTypeSignature().equals(this.getSlotTypeSignature()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotTypeSignature() == null) ? 0 : getSlotTypeSignature().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public BuiltInSlotTypeSummary clone() {
        try {
            return (BuiltInSlotTypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BuiltInSlotTypeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
