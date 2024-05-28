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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Column in configured table that can be used in aggregate function in query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AggregateColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Column names in configured table of aggregate columns.
     * </p>
     */
    private java.util.List<String> columnNames;
    /**
     * <p>
     * Aggregation function that can be applied to aggregate column in query.
     * </p>
     */
    private String function;

    /**
     * <p>
     * Column names in configured table of aggregate columns.
     * </p>
     * 
     * @return Column names in configured table of aggregate columns.
     */

    public java.util.List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * <p>
     * Column names in configured table of aggregate columns.
     * </p>
     * 
     * @param columnNames
     *        Column names in configured table of aggregate columns.
     */

    public void setColumnNames(java.util.Collection<String> columnNames) {
        if (columnNames == null) {
            this.columnNames = null;
            return;
        }

        this.columnNames = new java.util.ArrayList<String>(columnNames);
    }

    /**
     * <p>
     * Column names in configured table of aggregate columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnNames(java.util.Collection)} or {@link #withColumnNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param columnNames
     *        Column names in configured table of aggregate columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateColumn withColumnNames(String... columnNames) {
        if (this.columnNames == null) {
            setColumnNames(new java.util.ArrayList<String>(columnNames.length));
        }
        for (String ele : columnNames) {
            this.columnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Column names in configured table of aggregate columns.
     * </p>
     * 
     * @param columnNames
     *        Column names in configured table of aggregate columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateColumn withColumnNames(java.util.Collection<String> columnNames) {
        setColumnNames(columnNames);
        return this;
    }

    /**
     * <p>
     * Aggregation function that can be applied to aggregate column in query.
     * </p>
     * 
     * @param function
     *        Aggregation function that can be applied to aggregate column in query.
     * @see AggregateFunctionName
     */

    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * Aggregation function that can be applied to aggregate column in query.
     * </p>
     * 
     * @return Aggregation function that can be applied to aggregate column in query.
     * @see AggregateFunctionName
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * <p>
     * Aggregation function that can be applied to aggregate column in query.
     * </p>
     * 
     * @param function
     *        Aggregation function that can be applied to aggregate column in query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateFunctionName
     */

    public AggregateColumn withFunction(String function) {
        setFunction(function);
        return this;
    }

    /**
     * <p>
     * Aggregation function that can be applied to aggregate column in query.
     * </p>
     * 
     * @param function
     *        Aggregation function that can be applied to aggregate column in query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregateFunctionName
     */

    public AggregateColumn withFunction(AggregateFunctionName function) {
        this.function = function.toString();
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
        if (getColumnNames() != null)
            sb.append("ColumnNames: ").append(getColumnNames()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregateColumn == false)
            return false;
        AggregateColumn other = (AggregateColumn) obj;
        if (other.getColumnNames() == null ^ this.getColumnNames() == null)
            return false;
        if (other.getColumnNames() != null && other.getColumnNames().equals(this.getColumnNames()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnNames() == null) ? 0 : getColumnNames().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        return hashCode;
    }

    @Override
    public AggregateColumn clone() {
        try {
            return (AggregateColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AggregateColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
