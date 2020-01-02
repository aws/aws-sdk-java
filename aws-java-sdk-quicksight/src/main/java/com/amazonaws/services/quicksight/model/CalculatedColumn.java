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
 * A calculated column for a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CalculatedColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculatedColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Column name.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column
     * matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
     * </p>
     */
    private String columnId;
    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * Column name.
     * </p>
     * 
     * @param columnName
     *        Column name.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * Column name.
     * </p>
     * 
     * @return Column name.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * Column name.
     * </p>
     * 
     * @param columnName
     *        Column name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedColumn withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column
     * matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
     * </p>
     * 
     * @param columnId
     *        A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated
     *        column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated
     *        column.
     */

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column
     * matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
     * </p>
     * 
     * @return A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated
     *         column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated
     *         column.
     */

    public String getColumnId() {
        return this.columnId;
    }

    /**
     * <p>
     * A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated column
     * matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated column.
     * </p>
     * 
     * @param columnId
     *        A unique ID to identify a calculated column. During a dataset update, if the column ID of a calculated
     *        column matches that of an existing calculated column, Amazon QuickSight preserves the existing calculated
     *        column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedColumn withColumnId(String columnId) {
        setColumnId(columnId);
        return this;
    }

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * 
     * @param expression
     *        An expression that defines the calculated column.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * 
     * @return An expression that defines the calculated column.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * An expression that defines the calculated column.
     * </p>
     * 
     * @param expression
     *        An expression that defines the calculated column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedColumn withExpression(String expression) {
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getColumnId() != null)
            sb.append("ColumnId: ").append(getColumnId()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculatedColumn == false)
            return false;
        CalculatedColumn other = (CalculatedColumn) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnId() == null ^ this.getColumnId() == null)
            return false;
        if (other.getColumnId() != null && other.getColumnId().equals(this.getColumnId()) == false)
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

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnId() == null) ? 0 : getColumnId().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public CalculatedColumn clone() {
        try {
            return (CalculatedColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CalculatedColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
