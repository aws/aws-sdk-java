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
 * Dataset schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSetSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     */
    private java.util.List<ColumnSchema> columnSchemaList;

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     * 
     * @return A structure containing the list of column schemas.
     */

    public java.util.List<ColumnSchema> getColumnSchemaList() {
        return columnSchemaList;
    }

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     * 
     * @param columnSchemaList
     *        A structure containing the list of column schemas.
     */

    public void setColumnSchemaList(java.util.Collection<ColumnSchema> columnSchemaList) {
        if (columnSchemaList == null) {
            this.columnSchemaList = null;
            return;
        }

        this.columnSchemaList = new java.util.ArrayList<ColumnSchema>(columnSchemaList);
    }

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnSchemaList(java.util.Collection)} or {@link #withColumnSchemaList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param columnSchemaList
     *        A structure containing the list of column schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetSchema withColumnSchemaList(ColumnSchema... columnSchemaList) {
        if (this.columnSchemaList == null) {
            setColumnSchemaList(new java.util.ArrayList<ColumnSchema>(columnSchemaList.length));
        }
        for (ColumnSchema ele : columnSchemaList) {
            this.columnSchemaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing the list of column schemas.
     * </p>
     * 
     * @param columnSchemaList
     *        A structure containing the list of column schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetSchema withColumnSchemaList(java.util.Collection<ColumnSchema> columnSchemaList) {
        setColumnSchemaList(columnSchemaList);
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
        if (getColumnSchemaList() != null)
            sb.append("ColumnSchemaList: ").append(getColumnSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetSchema == false)
            return false;
        DataSetSchema other = (DataSetSchema) obj;
        if (other.getColumnSchemaList() == null ^ this.getColumnSchemaList() == null)
            return false;
        if (other.getColumnSchemaList() != null && other.getColumnSchemaList().equals(this.getColumnSchemaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnSchemaList() == null) ? 0 : getColumnSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public DataSetSchema clone() {
        try {
            return (DataSetSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
