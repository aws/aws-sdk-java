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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing the column name and column importance score for a column.
 * </p>
 * <p>
 * Column importance helps you understand how columns contribute to your model, by identifying which columns in your
 * records are more important than others.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ColumnImportance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnImportance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a column.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The column importance score for the column, as a decimal.
     * </p>
     */
    private Double importance;

    /**
     * <p>
     * The name of a column.
     * </p>
     * 
     * @param columnName
     *        The name of a column.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of a column.
     * </p>
     * 
     * @return The name of a column.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of a column.
     * </p>
     * 
     * @param columnName
     *        The name of a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnImportance withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The column importance score for the column, as a decimal.
     * </p>
     * 
     * @param importance
     *        The column importance score for the column, as a decimal.
     */

    public void setImportance(Double importance) {
        this.importance = importance;
    }

    /**
     * <p>
     * The column importance score for the column, as a decimal.
     * </p>
     * 
     * @return The column importance score for the column, as a decimal.
     */

    public Double getImportance() {
        return this.importance;
    }

    /**
     * <p>
     * The column importance score for the column, as a decimal.
     * </p>
     * 
     * @param importance
     *        The column importance score for the column, as a decimal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnImportance withImportance(Double importance) {
        setImportance(importance);
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
        if (getImportance() != null)
            sb.append("Importance: ").append(getImportance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnImportance == false)
            return false;
        ColumnImportance other = (ColumnImportance) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getImportance() == null ^ this.getImportance() == null)
            return false;
        if (other.getImportance() != null && other.getImportance().equals(this.getImportance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getImportance() == null) ? 0 : getImportance().hashCode());
        return hashCode;
    }

    @Override
    public ColumnImportance clone() {
        try {
            return (ColumnImportance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ColumnImportanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
