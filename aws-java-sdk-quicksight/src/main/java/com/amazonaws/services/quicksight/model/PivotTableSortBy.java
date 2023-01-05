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
 * The sort by field for the field sort options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableSortBy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableSortBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field sort (field id, direction) for the pivot table sort by options.
     * </p>
     */
    private FieldSort field;
    /**
     * <p>
     * The column sort (field id, direction) for the pivot table sort by options.
     * </p>
     */
    private ColumnSort column;
    /**
     * <p>
     * The data path sort (data path value, direction) for the pivot table sort by options.
     * </p>
     */
    private DataPathSort dataPath;

    /**
     * <p>
     * The field sort (field id, direction) for the pivot table sort by options.
     * </p>
     * 
     * @param field
     *        The field sort (field id, direction) for the pivot table sort by options.
     */

    public void setField(FieldSort field) {
        this.field = field;
    }

    /**
     * <p>
     * The field sort (field id, direction) for the pivot table sort by options.
     * </p>
     * 
     * @return The field sort (field id, direction) for the pivot table sort by options.
     */

    public FieldSort getField() {
        return this.field;
    }

    /**
     * <p>
     * The field sort (field id, direction) for the pivot table sort by options.
     * </p>
     * 
     * @param field
     *        The field sort (field id, direction) for the pivot table sort by options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableSortBy withField(FieldSort field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The column sort (field id, direction) for the pivot table sort by options.
     * </p>
     * 
     * @param column
     *        The column sort (field id, direction) for the pivot table sort by options.
     */

    public void setColumn(ColumnSort column) {
        this.column = column;
    }

    /**
     * <p>
     * The column sort (field id, direction) for the pivot table sort by options.
     * </p>
     * 
     * @return The column sort (field id, direction) for the pivot table sort by options.
     */

    public ColumnSort getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column sort (field id, direction) for the pivot table sort by options.
     * </p>
     * 
     * @param column
     *        The column sort (field id, direction) for the pivot table sort by options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableSortBy withColumn(ColumnSort column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The data path sort (data path value, direction) for the pivot table sort by options.
     * </p>
     * 
     * @param dataPath
     *        The data path sort (data path value, direction) for the pivot table sort by options.
     */

    public void setDataPath(DataPathSort dataPath) {
        this.dataPath = dataPath;
    }

    /**
     * <p>
     * The data path sort (data path value, direction) for the pivot table sort by options.
     * </p>
     * 
     * @return The data path sort (data path value, direction) for the pivot table sort by options.
     */

    public DataPathSort getDataPath() {
        return this.dataPath;
    }

    /**
     * <p>
     * The data path sort (data path value, direction) for the pivot table sort by options.
     * </p>
     * 
     * @param dataPath
     *        The data path sort (data path value, direction) for the pivot table sort by options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableSortBy withDataPath(DataPathSort dataPath) {
        setDataPath(dataPath);
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getDataPath() != null)
            sb.append("DataPath: ").append(getDataPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableSortBy == false)
            return false;
        PivotTableSortBy other = (PivotTableSortBy) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getDataPath() == null ^ this.getDataPath() == null)
            return false;
        if (other.getDataPath() != null && other.getDataPath().equals(this.getDataPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getDataPath() == null) ? 0 : getDataPath().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableSortBy clone() {
        try {
            return (PivotTableSortBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableSortByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
