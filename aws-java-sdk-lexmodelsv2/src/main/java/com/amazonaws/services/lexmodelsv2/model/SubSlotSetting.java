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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifications for the constituent sub slots and the expression for the composite slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SubSlotSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubSlotSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     * operators.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * Specifications for the constituent sub slots of a composite slot.
     * </p>
     */
    private java.util.Map<String, Specifications> slotSpecifications;

    /**
     * <p>
     * The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     * operators.
     * </p>
     * 
     * @param expression
     *        The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     *        operators.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     * operators.
     * </p>
     * 
     * @return The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     *         operators.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     * operators.
     * </p>
     * 
     * @param expression
     *        The expression text for defining the constituent sub slots in the composite slot using logical AND and OR
     *        operators.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotSetting withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Specifications for the constituent sub slots of a composite slot.
     * </p>
     * 
     * @return Specifications for the constituent sub slots of a composite slot.
     */

    public java.util.Map<String, Specifications> getSlotSpecifications() {
        return slotSpecifications;
    }

    /**
     * <p>
     * Specifications for the constituent sub slots of a composite slot.
     * </p>
     * 
     * @param slotSpecifications
     *        Specifications for the constituent sub slots of a composite slot.
     */

    public void setSlotSpecifications(java.util.Map<String, Specifications> slotSpecifications) {
        this.slotSpecifications = slotSpecifications;
    }

    /**
     * <p>
     * Specifications for the constituent sub slots of a composite slot.
     * </p>
     * 
     * @param slotSpecifications
     *        Specifications for the constituent sub slots of a composite slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotSetting withSlotSpecifications(java.util.Map<String, Specifications> slotSpecifications) {
        setSlotSpecifications(slotSpecifications);
        return this;
    }

    /**
     * Add a single SlotSpecifications entry
     *
     * @see SubSlotSetting#withSlotSpecifications
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotSetting addSlotSpecificationsEntry(String key, Specifications value) {
        if (null == this.slotSpecifications) {
            this.slotSpecifications = new java.util.HashMap<String, Specifications>();
        }
        if (this.slotSpecifications.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.slotSpecifications.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SlotSpecifications.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotSetting clearSlotSpecificationsEntries() {
        this.slotSpecifications = null;
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getSlotSpecifications() != null)
            sb.append("SlotSpecifications: ").append(getSlotSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubSlotSetting == false)
            return false;
        SubSlotSetting other = (SubSlotSetting) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getSlotSpecifications() == null ^ this.getSlotSpecifications() == null)
            return false;
        if (other.getSlotSpecifications() != null && other.getSlotSpecifications().equals(this.getSlotSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getSlotSpecifications() == null) ? 0 : getSlotSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public SubSlotSetting clone() {
        try {
            return (SubSlotSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SubSlotSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
