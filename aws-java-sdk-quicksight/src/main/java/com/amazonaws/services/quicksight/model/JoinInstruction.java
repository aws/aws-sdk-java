/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Join instruction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/JoinInstruction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JoinInstruction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Left operand.
     * </p>
     */
    private String leftOperand;
    /**
     * <p>
     * Right operand.
     * </p>
     */
    private String rightOperand;
    /**
     * <p>
     * Type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * On Clause.
     * </p>
     */
    private String onClause;

    /**
     * <p>
     * Left operand.
     * </p>
     * 
     * @param leftOperand
     *        Left operand.
     */

    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    /**
     * <p>
     * Left operand.
     * </p>
     * 
     * @return Left operand.
     */

    public String getLeftOperand() {
        return this.leftOperand;
    }

    /**
     * <p>
     * Left operand.
     * </p>
     * 
     * @param leftOperand
     *        Left operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withLeftOperand(String leftOperand) {
        setLeftOperand(leftOperand);
        return this;
    }

    /**
     * <p>
     * Right operand.
     * </p>
     * 
     * @param rightOperand
     *        Right operand.
     */

    public void setRightOperand(String rightOperand) {
        this.rightOperand = rightOperand;
    }

    /**
     * <p>
     * Right operand.
     * </p>
     * 
     * @return Right operand.
     */

    public String getRightOperand() {
        return this.rightOperand;
    }

    /**
     * <p>
     * Right operand.
     * </p>
     * 
     * @param rightOperand
     *        Right operand.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinInstruction withRightOperand(String rightOperand) {
        setRightOperand(rightOperand);
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @see JoinType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @return Type.
     * @see JoinType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinType
     */

    public JoinInstruction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinType
     */

    public JoinInstruction withType(JoinType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * On Clause.
     * </p>
     * 
     * @param onClause
     *        On Clause.
     */

    public void setOnClause(String onClause) {
        this.onClause = onClause;
    }

    /**
     * <p>
     * On Clause.
     * </p>
     * 
     * @return On Clause.
     */

    public String getOnClause() {
        return this.onClause;
    }

    /**
     * <p>
     * On Clause.
     * </p>
     * 
     * @param onClause
     *        On Clause.
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
