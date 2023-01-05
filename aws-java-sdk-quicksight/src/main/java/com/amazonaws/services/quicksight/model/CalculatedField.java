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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The calculated field of an analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CalculatedField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculatedField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data set that is used in this calculated field.
     * </p>
     */
    private String dataSetIdentifier;
    /**
     * <p>
     * The name of the calculated field.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The expression of the calculated field.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The data set that is used in this calculated field.
     * </p>
     * 
     * @param dataSetIdentifier
     *        The data set that is used in this calculated field.
     */

    public void setDataSetIdentifier(String dataSetIdentifier) {
        this.dataSetIdentifier = dataSetIdentifier;
    }

    /**
     * <p>
     * The data set that is used in this calculated field.
     * </p>
     * 
     * @return The data set that is used in this calculated field.
     */

    public String getDataSetIdentifier() {
        return this.dataSetIdentifier;
    }

    /**
     * <p>
     * The data set that is used in this calculated field.
     * </p>
     * 
     * @param dataSetIdentifier
     *        The data set that is used in this calculated field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedField withDataSetIdentifier(String dataSetIdentifier) {
        setDataSetIdentifier(dataSetIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the calculated field.
     * </p>
     * 
     * @param name
     *        The name of the calculated field.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the calculated field.
     * </p>
     * 
     * @return The name of the calculated field.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the calculated field.
     * </p>
     * 
     * @param name
     *        The name of the calculated field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The expression of the calculated field.
     * </p>
     * 
     * @param expression
     *        The expression of the calculated field.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression of the calculated field.
     * </p>
     * 
     * @return The expression of the calculated field.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression of the calculated field.
     * </p>
     * 
     * @param expression
     *        The expression of the calculated field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedField withExpression(String expression) {
        setExpression(expression);
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
        if (getDataSetIdentifier() != null)
            sb.append("DataSetIdentifier: ").append(getDataSetIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculatedField == false)
            return false;
        CalculatedField other = (CalculatedField) obj;
        if (other.getDataSetIdentifier() == null ^ this.getDataSetIdentifier() == null)
            return false;
        if (other.getDataSetIdentifier() != null && other.getDataSetIdentifier().equals(this.getDataSetIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetIdentifier() == null) ? 0 : getDataSetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public CalculatedField clone() {
        try {
            return (CalculatedField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CalculatedFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
