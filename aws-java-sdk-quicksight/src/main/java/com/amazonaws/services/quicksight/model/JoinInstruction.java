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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The instructions associated with a join.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/JoinInstruction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JoinInstruction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operand on the left side of a join.
     * </p>
     */
    private String leftOperand;
    /**
     * <p>
     * The operand on the right side of a join.
     * </p>
     */
    private String rightOperand;
    /**
     * <p>
     * Join key properties of the left operand.
     * </p>
     */
    private JoinKeyProperties leftJoinKeyProperties;
    /**
     * <p>
     * Join key properties of the right operand.
     * </p>
     */
    private JoinKeyProperties rightJoinKeyProperties;
    /**
     * <p>
     * The type of join that it is.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The join instructions provided in the <code>ON</code> clause of a join.
     * </p>
     */
    private String onClause;

    /**
     * <p>
     * The operand on the left side of a join.
     * </p>
     * 
     * @param leftOperand
     *        The operand on the left side of a join.
     */

    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    /**
     * <p>
     * The operand on the left side of a join.
     * </p>
     * 
     * @return The operand on the left side of a join.
     */

    public String getLeftOperand() {
        return this.leftOperand;
    }

    /**
     * <p>
     * The operand on the left side of a join.
     * </p>
     * 
     * @param leftOperand
     *        The operand on the left side of a join.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withLeftOperand(String leftOperand) {
        setLeftOperand(leftOperand);
        return this;
    }

    /**
     * <p>
     * The operand on the right side of a join.
     * </p>
     * 
     * @param rightOperand
     *        The operand on the right side of a join.
     */

    public void setRightOperand(String rightOperand) {
        this.rightOperand = rightOperand;
    }

    /**
     * <p>
     * The operand on the right side of a join.
     * </p>
     * 
     * @return The operand on the right side of a join.
     */

    public String getRightOperand() {
        return this.rightOperand;
    }

    /**
     * <p>
     * The operand on the right side of a join.
     * </p>
     * 
     * @param rightOperand
     *        The operand on the right side of a join.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withRightOperand(String rightOperand) {
        setRightOperand(rightOperand);
        return this;
    }

    /**
     * <p>
     * Join key properties of the left operand.
     * </p>
     * 
     * @param leftJoinKeyProperties
     *        Join key properties of the left operand.
     */

    public void setLeftJoinKeyProperties(JoinKeyProperties leftJoinKeyProperties) {
        this.leftJoinKeyProperties = leftJoinKeyProperties;
    }

    /**
     * <p>
     * Join key properties of the left operand.
     * </p>
     * 
     * @return Join key properties of the left operand.
     */

    public JoinKeyProperties getLeftJoinKeyProperties() {
        return this.leftJoinKeyProperties;
    }

    /**
     * <p>
     * Join key properties of the left operand.
     * </p>
     * 
     * @param leftJoinKeyProperties
     *        Join key properties of the left operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withLeftJoinKeyProperties(JoinKeyProperties leftJoinKeyProperties) {
        setLeftJoinKeyProperties(leftJoinKeyProperties);
        return this;
    }

    /**
     * <p>
     * Join key properties of the right operand.
     * </p>
     * 
     * @param rightJoinKeyProperties
     *        Join key properties of the right operand.
     */

    public void setRightJoinKeyProperties(JoinKeyProperties rightJoinKeyProperties) {
        this.rightJoinKeyProperties = rightJoinKeyProperties;
    }

    /**
     * <p>
     * Join key properties of the right operand.
     * </p>
     * 
     * @return Join key properties of the right operand.
     */

    public JoinKeyProperties getRightJoinKeyProperties() {
        return this.rightJoinKeyProperties;
    }

    /**
     * <p>
     * Join key properties of the right operand.
     * </p>
     * 
     * @param rightJoinKeyProperties
     *        Join key properties of the right operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withRightJoinKeyProperties(JoinKeyProperties rightJoinKeyProperties) {
        setRightJoinKeyProperties(rightJoinKeyProperties);
        return this;
    }

    /**
     * <p>
     * The type of join that it is.
     * </p>
     * 
     * @param type
     *        The type of join that it is.
     * @see JoinType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of join that it is.
     * </p>
     * 
     * @return The type of join that it is.
     * @see JoinType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of join that it is.
     * </p>
     * 
     * @param type
     *        The type of join that it is.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinType
     */

    public JoinInstruction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of join that it is.
     * </p>
     * 
     * @param type
     *        The type of join that it is.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinType
     */

    public JoinInstruction withType(JoinType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The join instructions provided in the <code>ON</code> clause of a join.
     * </p>
     * 
     * @param onClause
     *        The join instructions provided in the <code>ON</code> clause of a join.
     */

    public void setOnClause(String onClause) {
        this.onClause = onClause;
    }

    /**
     * <p>
     * The join instructions provided in the <code>ON</code> clause of a join.
     * </p>
     * 
     * @return The join instructions provided in the <code>ON</code> clause of a join.
     */

    public String getOnClause() {
        return this.onClause;
    }

    /**
     * <p>
     * The join instructions provided in the <code>ON</code> clause of a join.
     * </p>
     * 
     * @param onClause
     *        The join instructions provided in the <code>ON</code> clause of a join.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withOnClause(String onClause) {
        setOnClause(onClause);
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
        if (getLeftOperand() != null)
            sb.append("LeftOperand: ").append(getLeftOperand()).append(",");
        if (getRightOperand() != null)
            sb.append("RightOperand: ").append(getRightOperand()).append(",");
        if (getLeftJoinKeyProperties() != null)
            sb.append("LeftJoinKeyProperties: ").append(getLeftJoinKeyProperties()).append(",");
        if (getRightJoinKeyProperties() != null)
            sb.append("RightJoinKeyProperties: ").append(getRightJoinKeyProperties()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOnClause() != null)
            sb.append("OnClause: ").append(getOnClause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinInstruction == false)
            return false;
        JoinInstruction other = (JoinInstruction) obj;
        if (other.getLeftOperand() == null ^ this.getLeftOperand() == null)
            return false;
        if (other.getLeftOperand() != null && other.getLeftOperand().equals(this.getLeftOperand()) == false)
            return false;
        if (other.getRightOperand() == null ^ this.getRightOperand() == null)
            return false;
        if (other.getRightOperand() != null && other.getRightOperand().equals(this.getRightOperand()) == false)
            return false;
        if (other.getLeftJoinKeyProperties() == null ^ this.getLeftJoinKeyProperties() == null)
            return false;
        if (other.getLeftJoinKeyProperties() != null && other.getLeftJoinKeyProperties().equals(this.getLeftJoinKeyProperties()) == false)
            return false;
        if (other.getRightJoinKeyProperties() == null ^ this.getRightJoinKeyProperties() == null)
            return false;
        if (other.getRightJoinKeyProperties() != null && other.getRightJoinKeyProperties().equals(this.getRightJoinKeyProperties()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOnClause() == null ^ this.getOnClause() == null)
            return false;
        if (other.getOnClause() != null && other.getOnClause().equals(this.getOnClause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLeftOperand() == null) ? 0 : getLeftOperand().hashCode());
        hashCode = prime * hashCode + ((getRightOperand() == null) ? 0 : getRightOperand().hashCode());
        hashCode = prime * hashCode + ((getLeftJoinKeyProperties() == null) ? 0 : getLeftJoinKeyProperties().hashCode());
        hashCode = prime * hashCode + ((getRightJoinKeyProperties() == null) ? 0 : getRightJoinKeyProperties().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOnClause() == null) ? 0 : getOnClause().hashCode());
        return hashCode;
    }

    @Override
    public JoinInstruction clone() {
        try {
            return (JoinInstruction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.JoinInstructionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
