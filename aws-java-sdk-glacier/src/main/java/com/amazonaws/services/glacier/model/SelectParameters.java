/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the parameters used for a select.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     */
    private InputSerialization inputSerialization;
    /**
     * <p>
     * The type of the provided expression, for example <code>SQL</code>.
     * </p>
     */
    private String expressionType;
    /**
     * <p>
     * The expression that is used to select the object.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * Describes how the results of the select job are serialized.
     * </p>
     */
    private OutputSerialization outputSerialization;

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     * 
     * @param inputSerialization
     *        Describes the serialization format of the object.
     */

    public void setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
    }

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     * 
     * @return Describes the serialization format of the object.
     */

    public InputSerialization getInputSerialization() {
        return this.inputSerialization;
    }

    /**
     * <p>
     * Describes the serialization format of the object.
     * </p>
     * 
     * @param inputSerialization
     *        Describes the serialization format of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectParameters withInputSerialization(InputSerialization inputSerialization) {
        setInputSerialization(inputSerialization);
        return this;
    }

    /**
     * <p>
     * The type of the provided expression, for example <code>SQL</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of the provided expression, for example <code>SQL</code>.
     * @see ExpressionType
     */

    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * <p>
     * The type of the provided expression, for example <code>SQL</code>.
     * </p>
     * 
     * @return The type of the provided expression, for example <code>SQL</code>.
     * @see ExpressionType
     */

    public String getExpressionType() {
        return this.expressionType;
    }

    /**
     * <p>
     * The type of the provided expression, for example <code>SQL</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of the provided expression, for example <code>SQL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpressionType
     */

    public SelectParameters withExpressionType(String expressionType) {
        setExpressionType(expressionType);
        return this;
    }

    /**
     * <p>
     * The type of the provided expression, for example <code>SQL</code>.
     * </p>
     * 
     * @param expressionType
     *        The type of the provided expression, for example <code>SQL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpressionType
     */

    public SelectParameters withExpressionType(ExpressionType expressionType) {
        this.expressionType = expressionType.toString();
        return this;
    }

    /**
     * <p>
     * The expression that is used to select the object.
     * </p>
     * 
     * @param expression
     *        The expression that is used to select the object.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression that is used to select the object.
     * </p>
     * 
     * @return The expression that is used to select the object.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression that is used to select the object.
     * </p>
     * 
     * @param expression
     *        The expression that is used to select the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectParameters withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Describes how the results of the select job are serialized.
     * </p>
     * 
     * @param outputSerialization
     *        Describes how the results of the select job are serialized.
     */

    public void setOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
    }

    /**
     * <p>
     * Describes how the results of the select job are serialized.
     * </p>
     * 
     * @return Describes how the results of the select job are serialized.
     */

    public OutputSerialization getOutputSerialization() {
        return this.outputSerialization;
    }

    /**
     * <p>
     * Describes how the results of the select job are serialized.
     * </p>
     * 
     * @param outputSerialization
     *        Describes how the results of the select job are serialized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectParameters withOutputSerialization(OutputSerialization outputSerialization) {
        setOutputSerialization(outputSerialization);
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
        if (getInputSerialization() != null)
            sb.append("InputSerialization: ").append(getInputSerialization()).append(",");
        if (getExpressionType() != null)
            sb.append("ExpressionType: ").append(getExpressionType()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getOutputSerialization() != null)
            sb.append("OutputSerialization: ").append(getOutputSerialization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectParameters == false)
            return false;
        SelectParameters other = (SelectParameters) obj;
        if (other.getInputSerialization() == null ^ this.getInputSerialization() == null)
            return false;
        if (other.getInputSerialization() != null && other.getInputSerialization().equals(this.getInputSerialization()) == false)
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null && other.getExpressionType().equals(this.getExpressionType()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getOutputSerialization() == null ^ this.getOutputSerialization() == null)
            return false;
        if (other.getOutputSerialization() != null && other.getOutputSerialization().equals(this.getOutputSerialization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSerialization() == null) ? 0 : getInputSerialization().hashCode());
        hashCode = prime * hashCode + ((getExpressionType() == null) ? 0 : getExpressionType().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getOutputSerialization() == null) ? 0 : getOutputSerialization().hashCode());
        return hashCode;
    }

    @Override
    public SelectParameters clone() {
        try {
            return (SelectParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.SelectParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
