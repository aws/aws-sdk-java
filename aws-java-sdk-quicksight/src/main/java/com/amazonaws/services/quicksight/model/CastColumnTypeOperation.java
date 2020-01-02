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
 * A transform operation that casts a column to a different type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CastColumnTypeOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CastColumnTypeOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Column name.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * New column data type.
     * </p>
     */
    private String newColumnType;
    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon
     * QuickSight to denote the source data format.
     * </p>
     */
    private String format;

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

    public CastColumnTypeOperation withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * 
     * @param newColumnType
     *        New column data type.
     * @see ColumnDataType
     */

    public void setNewColumnType(String newColumnType) {
        this.newColumnType = newColumnType;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * 
     * @return New column data type.
     * @see ColumnDataType
     */

    public String getNewColumnType() {
        return this.newColumnType;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * 
     * @param newColumnType
     *        New column data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public CastColumnTypeOperation withNewColumnType(String newColumnType) {
        setNewColumnType(newColumnType);
        return this;
    }

    /**
     * <p>
     * New column data type.
     * </p>
     * 
     * @param newColumnType
     *        New column data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public CastColumnTypeOperation withNewColumnType(ColumnDataType newColumnType) {
        this.newColumnType = newColumnType.toString();
        return this;
    }

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon
     * QuickSight to denote the source data format.
     * </p>
     * 
     * @param format
     *        When casting a column from string to datetime type, you can supply a string in a format supported by
     *        Amazon QuickSight to denote the source data format.
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon
     * QuickSight to denote the source data format.
     * </p>
     * 
     * @return When casting a column from string to datetime type, you can supply a string in a format supported by
     *         Amazon QuickSight to denote the source data format.
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * When casting a column from string to datetime type, you can supply a string in a format supported by Amazon
     * QuickSight to denote the source data format.
     * </p>
     * 
     * @param format
     *        When casting a column from string to datetime type, you can supply a string in a format supported by
     *        Amazon QuickSight to denote the source data format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CastColumnTypeOperation withFormat(String format) {
        setFormat(format);
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
        if (getNewColumnType() != null)
            sb.append("NewColumnType: ").append(getNewColumnType()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CastColumnTypeOperation == false)
            return false;
        CastColumnTypeOperation other = (CastColumnTypeOperation) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getNewColumnType() == null ^ this.getNewColumnType() == null)
            return false;
        if (other.getNewColumnType() != null && other.getNewColumnType().equals(this.getNewColumnType()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getNewColumnType() == null) ? 0 : getNewColumnType().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public CastColumnTypeOperation clone() {
        try {
            return (CastColumnTypeOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CastColumnTypeOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
