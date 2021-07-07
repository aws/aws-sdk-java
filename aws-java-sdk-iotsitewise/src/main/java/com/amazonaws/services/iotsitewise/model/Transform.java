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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an asset transform property. A transform is a one-to-one mapping of a property's data points from one form
 * to another. For example, you can use a transform to convert a Celsius data stream to Fahrenheit by applying the
 * transformation expression to each data point of the Celsius stream. A transform can only have a data type of
 * <code>DOUBLE</code> and consume properties with data types of <code>INTEGER</code> or <code>DOUBLE</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#transforms">Transforms</a> in
 * the <i>IoT SiteWise User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Transform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You can specify up to 10 variables per
     * expression. You can specify up to 10 functions per expression.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     */
    private java.util.List<ExpressionVariable> variables;

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You can specify up to 10 variables per
     * expression. You can specify up to 10 functions per expression.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param expression
     *        The mathematical expression that defines the transformation function. You can specify up to 10 variables
     *        per expression. You can specify up to 10 functions per expression. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You can specify up to 10 variables per
     * expression. You can specify up to 10 functions per expression.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @return The mathematical expression that defines the transformation function. You can specify up to 10 variables
     *         per expression. You can specify up to 10 functions per expression. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *         SiteWise User Guide</i>.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The mathematical expression that defines the transformation function. You can specify up to 10 variables per
     * expression. You can specify up to 10 functions per expression.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT SiteWise
     * User Guide</i>.
     * </p>
     * 
     * @param expression
     *        The mathematical expression that defines the transformation function. You can specify up to 10 variables
     *        per expression. You can specify up to 10 functions per expression. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/quotas.html">Quotas</a> in the <i>IoT
     *        SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transform withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     * 
     * @return The list of variables used in the expression.
     */

    public java.util.List<ExpressionVariable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     * 
     * @param variables
     *        The list of variables used in the expression.
     */

    public void setVariables(java.util.Collection<ExpressionVariable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<ExpressionVariable>(variables);
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        The list of variables used in the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transform withVariables(ExpressionVariable... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<ExpressionVariable>(variables.length));
        }
        for (ExpressionVariable ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of variables used in the expression.
     * </p>
     * 
     * @param variables
     *        The list of variables used in the expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transform withVariables(java.util.Collection<ExpressionVariable> variables) {
        setVariables(variables);
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
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transform == false)
            return false;
        Transform other = (Transform) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public Transform clone() {
        try {
            return (Transform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.TransformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
