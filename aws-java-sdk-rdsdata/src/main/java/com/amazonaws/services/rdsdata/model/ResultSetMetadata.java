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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * List of columns and their types.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ResultSetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultSetMetadata implements Serializable, Cloneable, StructuredPojo {

    /** Number of columns */
    private Long columnCount;
    /** List of columns and their types */
    private java.util.List<ColumnMetadata> columnMetadata;

    /**
     * Number of columns
     * 
     * @param columnCount
     *        Number of columns
     */

    public void setColumnCount(Long columnCount) {
        this.columnCount = columnCount;
    }

    /**
     * Number of columns
     * 
     * @return Number of columns
     */

    public Long getColumnCount() {
        return this.columnCount;
    }

    /**
     * Number of columns
     * 
     * @param columnCount
     *        Number of columns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSetMetadata withColumnCount(Long columnCount) {
        setColumnCount(columnCount);
        return this;
    }

    /**
     * List of columns and their types
     * 
     * @return List of columns and their types
     */

    public java.util.List<ColumnMetadata> getColumnMetadata() {
        return columnMetadata;
    }

    /**
     * List of columns and their types
     * 
     * @param columnMetadata
     *        List of columns and their types
     */

    public void setColumnMetadata(java.util.Collection<ColumnMetadata> columnMetadata) {
        if (columnMetadata == null) {
            this.columnMetadata = null;
            return;
        }

        this.columnMetadata = new java.util.ArrayList<ColumnMetadata>(columnMetadata);
    }

    /**
     * List of columns and their types
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnMetadata(java.util.Collection)} or {@link #withColumnMetadata(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param columnMetadata
     *        List of columns and their types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSetMetadata withColumnMetadata(ColumnMetadata... columnMetadata) {
        if (this.columnMetadata == null) {
            setColumnMetadata(new java.util.ArrayList<ColumnMetadata>(columnMetadata.length));
        }
        for (ColumnMetadata ele : columnMetadata) {
            this.columnMetadata.add(ele);
        }
        return this;
    }

    /**
     * List of columns and their types
     * 
     * @param columnMetadata
     *        List of columns and their types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultSetMetadata withColumnMetadata(java.util.Collection<ColumnMetadata> columnMetadata) {
        setColumnMetadata(columnMetadata);
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
        if (getColumnCount() != null)
            sb.append("ColumnCount: ").append(getColumnCount()).append(",");
        if (getColumnMetadata() != null)
            sb.append("ColumnMetadata: ").append(getColumnMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultSetMetadata == false)
            return false;
        ResultSetMetadata other = (ResultSetMetadata) obj;
        if (other.getColumnCount() == null ^ this.getColumnCount() == null)
            return false;
        if (other.getColumnCount() != null && other.getColumnCount().equals(this.getColumnCount()) == false)
            return false;
        if (other.getColumnMetadata() == null ^ this.getColumnMetadata() == null)
            return false;
        if (other.getColumnMetadata() != null && other.getColumnMetadata().equals(this.getColumnMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnCount() == null) ? 0 : getColumnCount().hashCode());
        hashCode = prime * hashCode + ((getColumnMetadata() == null) ? 0 : getColumnMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ResultSetMetadata clone() {
        try {
            return (ResultSetMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.ResultSetMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
