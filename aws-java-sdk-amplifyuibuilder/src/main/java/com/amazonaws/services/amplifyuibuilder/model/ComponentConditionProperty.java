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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a conditional expression to set a component property. Use <code>ComponentConditionProperty</code> to set a
 * property to different values conditionally, based on the value of another property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentConditionProperty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentConditionProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value to assign to the property if the condition is not met.
     * </p>
     */
    private ComponentProperty elseValue;
    /**
     * <p>
     * The name of a field. Specify this when the property is a data model.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The value of the property to evaluate.
     * </p>
     */
    private String operand;
    /**
     * <p>
     * The type of the property to evaluate.
     * </p>
     */
    private String operandType;
    /**
     * <p>
     * The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The name of the conditional property.
     * </p>
     */
    private String property;
    /**
     * <p>
     * The value to assign to the property if the condition is met.
     * </p>
     */
    private ComponentProperty then;

    /**
     * <p>
     * The value to assign to the property if the condition is not met.
     * </p>
     * 
     * @param elseValue
     *        The value to assign to the property if the condition is not met.
     */

    public void setElse(ComponentProperty elseValue) {
        this.elseValue = elseValue;
    }

    /**
     * <p>
     * The value to assign to the property if the condition is not met.
     * </p>
     * 
     * @return The value to assign to the property if the condition is not met.
     */

    public ComponentProperty getElse() {
        return this.elseValue;
    }

    /**
     * <p>
     * The value to assign to the property if the condition is not met.
     * </p>
     * 
     * @param elseValue
     *        The value to assign to the property if the condition is not met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withElse(ComponentProperty elseValue) {
        setElse(elseValue);
        return this;
    }

    /**
     * <p>
     * The name of a field. Specify this when the property is a data model.
     * </p>
     * 
     * @param field
     *        The name of a field. Specify this when the property is a data model.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The name of a field. Specify this when the property is a data model.
     * </p>
     * 
     * @return The name of a field. Specify this when the property is a data model.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The name of a field. Specify this when the property is a data model.
     * </p>
     * 
     * @param field
     *        The name of a field. Specify this when the property is a data model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The value of the property to evaluate.
     * </p>
     * 
     * @param operand
     *        The value of the property to evaluate.
     */

    public void setOperand(String operand) {
        this.operand = operand;
    }

    /**
     * <p>
     * The value of the property to evaluate.
     * </p>
     * 
     * @return The value of the property to evaluate.
     */

    public String getOperand() {
        return this.operand;
    }

    /**
     * <p>
     * The value of the property to evaluate.
     * </p>
     * 
     * @param operand
     *        The value of the property to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withOperand(String operand) {
        setOperand(operand);
        return this;
    }

    /**
     * <p>
     * The type of the property to evaluate.
     * </p>
     * 
     * @param operandType
     *        The type of the property to evaluate.
     */

    public void setOperandType(String operandType) {
        this.operandType = operandType;
    }

    /**
     * <p>
     * The type of the property to evaluate.
     * </p>
     * 
     * @return The type of the property to evaluate.
     */

    public String getOperandType() {
        return this.operandType;
    }

    /**
     * <p>
     * The type of the property to evaluate.
     * </p>
     * 
     * @param operandType
     *        The type of the property to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withOperandType(String operandType) {
        setOperandType(operandType);
        return this;
    }

    /**
     * <p>
     * The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     * </p>
     * 
     * @param operator
     *        The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     * </p>
     * 
     * @return The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     * </p>
     * 
     * @param operator
     *        The operator to use to perform the evaluation, such as <code>eq</code> to represent equals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The name of the conditional property.
     * </p>
     * 
     * @param property
     *        The name of the conditional property.
     */

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>
     * The name of the conditional property.
     * </p>
     * 
     * @return The name of the conditional property.
     */

    public String getProperty() {
        return this.property;
    }

    /**
     * <p>
     * The name of the conditional property.
     * </p>
     * 
     * @param property
     *        The name of the conditional property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withProperty(String property) {
        setProperty(property);
        return this;
    }

    /**
     * <p>
     * The value to assign to the property if the condition is met.
     * </p>
     * 
     * @param then
     *        The value to assign to the property if the condition is met.
     */

    public void setThen(ComponentProperty then) {
        this.then = then;
    }

    /**
     * <p>
     * The value to assign to the property if the condition is met.
     * </p>
     * 
     * @return The value to assign to the property if the condition is met.
     */

    public ComponentProperty getThen() {
        return this.then;
    }

    /**
     * <p>
     * The value to assign to the property if the condition is met.
     * </p>
     * 
     * @param then
     *        The value to assign to the property if the condition is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConditionProperty withThen(ComponentProperty then) {
        setThen(then);
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
        if (getElse() != null)
            sb.append("Else: ").append(getElse()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getOperand() != null)
            sb.append("Operand: ").append(getOperand()).append(",");
        if (getOperandType() != null)
            sb.append("OperandType: ").append(getOperandType()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getProperty() != null)
            sb.append("Property: ").append(getProperty()).append(",");
        if (getThen() != null)
            sb.append("Then: ").append(getThen());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentConditionProperty == false)
            return false;
        ComponentConditionProperty other = (ComponentConditionProperty) obj;
        if (other.getElse() == null ^ this.getElse() == null)
            return false;
        if (other.getElse() != null && other.getElse().equals(this.getElse()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getOperand() == null ^ this.getOperand() == null)
            return false;
        if (other.getOperand() != null && other.getOperand().equals(this.getOperand()) == false)
            return false;
        if (other.getOperandType() == null ^ this.getOperandType() == null)
            return false;
        if (other.getOperandType() != null && other.getOperandType().equals(this.getOperandType()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getProperty() == null ^ this.getProperty() == null)
            return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false)
            return false;
        if (other.getThen() == null ^ this.getThen() == null)
            return false;
        if (other.getThen() != null && other.getThen().equals(this.getThen()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElse() == null) ? 0 : getElse().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getOperand() == null) ? 0 : getOperand().hashCode());
        hashCode = prime * hashCode + ((getOperandType() == null) ? 0 : getOperandType().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        hashCode = prime * hashCode + ((getThen() == null) ? 0 : getThen().hashCode());
        return hashCode;
    }

    @Override
    public ComponentConditionProperty clone() {
        try {
            return (ComponentConditionProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentConditionPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
