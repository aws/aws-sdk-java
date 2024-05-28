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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A boolean expression to evaluate email attribute values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ArchiveBooleanExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveBooleanExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email attribute value to evaluate.
     * </p>
     */
    private ArchiveBooleanToEvaluate evaluate;
    /**
     * <p>
     * The boolean operator to use for evaluation.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The email attribute value to evaluate.
     * </p>
     * 
     * @param evaluate
     *        The email attribute value to evaluate.
     */

    public void setEvaluate(ArchiveBooleanToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The email attribute value to evaluate.
     * </p>
     * 
     * @return The email attribute value to evaluate.
     */

    public ArchiveBooleanToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The email attribute value to evaluate.
     * </p>
     * 
     * @param evaluate
     *        The email attribute value to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveBooleanExpression withEvaluate(ArchiveBooleanToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The boolean operator to use for evaluation.
     * </p>
     * 
     * @param operator
     *        The boolean operator to use for evaluation.
     * @see ArchiveBooleanOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The boolean operator to use for evaluation.
     * </p>
     * 
     * @return The boolean operator to use for evaluation.
     * @see ArchiveBooleanOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The boolean operator to use for evaluation.
     * </p>
     * 
     * @param operator
     *        The boolean operator to use for evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveBooleanOperator
     */

    public ArchiveBooleanExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The boolean operator to use for evaluation.
     * </p>
     * 
     * @param operator
     *        The boolean operator to use for evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveBooleanOperator
     */

    public ArchiveBooleanExpression withOperator(ArchiveBooleanOperator operator) {
        this.operator = operator.toString();
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
        if (getEvaluate() != null)
            sb.append("Evaluate: ").append(getEvaluate()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveBooleanExpression == false)
            return false;
        ArchiveBooleanExpression other = (ArchiveBooleanExpression) obj;
        if (other.getEvaluate() == null ^ this.getEvaluate() == null)
            return false;
        if (other.getEvaluate() != null && other.getEvaluate().equals(this.getEvaluate()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveBooleanExpression clone() {
        try {
            return (ArchiveBooleanExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.ArchiveBooleanExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
