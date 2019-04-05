/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;


import java.io.Serializable;

/**
 * Describes the parameters for Select job types.
 */
public class SelectParameters implements Serializable, Cloneable {

    /**
     * Describes the serialization format of the object.
     */
    private InputSerialization inputSerialization;

    /**
     * The type of the provided expression (e.g., SQL).
     */
    private String expressionType;

    /**
     * The expression that is used to query the object.
     */
    private String expression;

    /**
     * Describes how the results of the Select job are serialized.
     */
    private OutputSerialization outputSerialization;

    /**
     * @return the serialization format of the object.
     */
    public InputSerialization getInputSerialization() {
        return inputSerialization;
    }

    /**
     * Sets the serialization format of the object.
     *
     * @param inputSerialization The new inputSerialization value.
     */
    public void setInputSerialization(InputSerialization inputSerialization) {
        this.inputSerialization = inputSerialization;
    }

    /**
     * Sets the serialization format of the object.
     *
     * @param inputSerialization The new inputSerialization value.
     * @return This object for method chaining.
     */
    public SelectParameters withInputSerialization(InputSerialization inputSerialization) {
        setInputSerialization(inputSerialization);
        return this;
    }

    /**
     * @return The type of the provided expression (e.g., SQL).
     */
    public String getExpressionType() {
        return expressionType;
    }

    /**
     * Sets the type of the provided expression (e.g., SQL).
     *
     * @param expressionType The new expressionType value.
     */
    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    /**
     * Sets the expressionType
     *
     * @param expressionType The new expressionType value.
     * @return This object for method chaining.
     */
    public SelectParameters withExpressionType(String expressionType) {
        setExpressionType(expressionType);
        return this;
    }

    /**
     * Sets the expressionType
     *
     * @param expressionType The new expressionType value.
     * @return This object for method chaining.
     */
    public SelectParameters withExpressionType(ExpressionType expressionType) {
        setExpressionType(expressionType == null ? null : expressionType.toString());
        return this;
    }

    /**
     * @return The expression that is used to query the object.
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the expression that is used to query the object.
     *
     * @param expression The new expression value.
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * Sets the expression
     *
     * @param expression The new expression value.
     * @return This object for method chaining.
     */
    public SelectParameters withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * @return how the results of the Select job are serialized.
     */
    public OutputSerialization getOutputSerialization() {
        return outputSerialization;
    }

    /**
     * Sets how the results of the Select job are serialized.
     *
     * @param outputSerialization The new outputSerialization value.
     */
    public void setOutputSerialization(OutputSerialization outputSerialization) {
        this.outputSerialization = outputSerialization;
    }

    /**
     * Sets the outputSerialization
     *
     * @param outputSerialization The new outputSerialization value.
     * @return This object for method chaining.
     */
    public SelectParameters withOutputSerialization(OutputSerialization outputSerialization) {
        setOutputSerialization(outputSerialization);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof SelectParameters)) {
            return false;
        }

        final SelectParameters other = (SelectParameters) obj;

        if (other.getInputSerialization() == null ^ this.getInputSerialization() == null)
            return false;
        if (other.getInputSerialization() != null && !other.getInputSerialization().equals(this.getInputSerialization()))
            return false;
        if (other.getExpressionType() == null ^ this.getExpressionType() == null)
            return false;
        if (other.getExpressionType() != null && !other.getExpressionType().equals(this.getExpressionType()))
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && !other.getExpression().equals(this.getExpression()))
            return false;
        if (other.getOutputSerialization() == null ^ this.getOutputSerialization() == null)
            return false;
        if (other.getOutputSerialization() != null && !other.getOutputSerialization().equals(this.getOutputSerialization()))
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
    public SelectParameters clone() {
        try {
            return (SelectParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
