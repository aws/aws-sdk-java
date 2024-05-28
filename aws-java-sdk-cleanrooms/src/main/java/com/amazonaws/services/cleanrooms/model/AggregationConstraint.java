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
 * Constraint on query output removing output rows that do not meet a minimum number of distinct values of a specified
 * column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/AggregationConstraint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationConstraint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Column in aggregation constraint for which there must be a minimum number of distinct values in an output row for
     * it to be in the query output.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of distinct
     * values for a specified column that must exist in an output row for it to be in the query output.
     * </p>
     */
    private Integer minimum;
    /**
     * <p>
     * The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Column in aggregation constraint for which there must be a minimum number of distinct values in an output row for
     * it to be in the query output.
     * </p>
     * 
     * @param columnName
     *        Column in aggregation constraint for which there must be a minimum number of distinct values in an output
     *        row for it to be in the query output.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * Column in aggregation constraint for which there must be a minimum number of distinct values in an output row for
     * it to be in the query output.
     * </p>
     * 
     * @return Column in aggregation constraint for which there must be a minimum number of distinct values in an output
     *         row for it to be in the query output.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * Column in aggregation constraint for which there must be a minimum number of distinct values in an output row for
     * it to be in the query output.
     * </p>
     * 
     * @param columnName
     *        Column in aggregation constraint for which there must be a minimum number of distinct values in an output
     *        row for it to be in the query output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationConstraint withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of distinct
     * values for a specified column that must exist in an output row for it to be in the query output.
     * </p>
     * 
     * @param minimum
     *        The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of
     *        distinct values for a specified column that must exist in an output row for it to be in the query output.
     */

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of distinct
     * values for a specified column that must exist in an output row for it to be in the query output.
     * </p>
     * 
     * @return The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of
     *         distinct values for a specified column that must exist in an output row for it to be in the query output.
     */

    public Integer getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of distinct
     * values for a specified column that must exist in an output row for it to be in the query output.
     * </p>
     * 
     * @param minimum
     *        The minimum number of distinct values that an output row must be an aggregation of. Minimum threshold of
     *        distinct values for a specified column that must exist in an output row for it to be in the query output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationConstraint withMinimum(Integer minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * </p>
     * 
     * @param type
     *        The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * @see AggregationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * </p>
     * 
     * @return The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * @see AggregationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * </p>
     * 
     * @param type
     *        The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationType
     */

    public AggregationConstraint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * </p>
     * 
     * @param type
     *        The type of aggregation the constraint allows. The only valid value is currently `COUNT_DISTINCT`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationType
     */

    public AggregationConstraint withType(AggregationType type) {
        this.type = type.toString();
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
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregationConstraint == false)
            return false;
        AggregationConstraint other = (AggregationConstraint) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AggregationConstraint clone() {
        try {
            return (AggregationConstraint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.AggregationConstraintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
