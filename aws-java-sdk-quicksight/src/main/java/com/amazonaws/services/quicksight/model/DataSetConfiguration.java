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
 * Dataset configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSetConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Placeholder.
     * </p>
     */
    private String placeholder;
    /**
     * <p>
     * Dataset schema.
     * </p>
     */
    private DataSetSchema dataSetSchema;
    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     */
    private java.util.List<ColumnGroupSchema> columnGroupSchemaList;

    /**
     * <p>
     * Placeholder.
     * </p>
     * 
     * @param placeholder
     *        Placeholder.
     */

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * <p>
     * Placeholder.
     * </p>
     * 
     * @return Placeholder.
     */

    public String getPlaceholder() {
        return this.placeholder;
    }

    /**
     * <p>
     * Placeholder.
     * </p>
     * 
     * @param placeholder
     *        Placeholder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetConfiguration withPlaceholder(String placeholder) {
        setPlaceholder(placeholder);
        return this;
    }

    /**
     * <p>
     * Dataset schema.
     * </p>
     * 
     * @param dataSetSchema
     *        Dataset schema.
     */

    public void setDataSetSchema(DataSetSchema dataSetSchema) {
        this.dataSetSchema = dataSetSchema;
    }

    /**
     * <p>
     * Dataset schema.
     * </p>
     * 
     * @return Dataset schema.
     */

    public DataSetSchema getDataSetSchema() {
        return this.dataSetSchema;
    }

    /**
     * <p>
     * Dataset schema.
     * </p>
     * 
     * @param dataSetSchema
     *        Dataset schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetConfiguration withDataSetSchema(DataSetSchema dataSetSchema) {
        setDataSetSchema(dataSetSchema);
        return this;
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     * 
     * @return A structure containing the list of column group schemas.
     */

    public java.util.List<ColumnGroupSchema> getColumnGroupSchemaList() {
        return columnGroupSchemaList;
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     * 
     * @param columnGroupSchemaList
     *        A structure containing the list of column group schemas.
     */

    public void setColumnGroupSchemaList(java.util.Collection<ColumnGroupSchema> columnGroupSchemaList) {
        if (columnGroupSchemaList == null) {
            this.columnGroupSchemaList = null;
            return;
        }

        this.columnGroupSchemaList = new java.util.ArrayList<ColumnGroupSchema>(columnGroupSchemaList);
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnGroupSchemaList(java.util.Collection)} or
     * {@link #withColumnGroupSchemaList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param columnGroupSchemaList
     *        A structure containing the list of column group schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetConfiguration withColumnGroupSchemaList(ColumnGroupSchema... columnGroupSchemaList) {
        if (this.columnGroupSchemaList == null) {
            setColumnGroupSchemaList(new java.util.ArrayList<ColumnGroupSchema>(columnGroupSchemaList.length));
        }
        for (ColumnGroupSchema ele : columnGroupSchemaList) {
            this.columnGroupSchemaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing the list of column group schemas.
     * </p>
     * 
     * @param columnGroupSchemaList
     *        A structure containing the list of column group schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetConfiguration withColumnGroupSchemaList(java.util.Collection<ColumnGroupSchema> columnGroupSchemaList) {
        setColumnGroupSchemaList(columnGroupSchemaList);
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
        if (getPlaceholder() != null)
            sb.append("Placeholder: ").append(getPlaceholder()).append(",");
        if (getDataSetSchema() != null)
            sb.append("DataSetSchema: ").append(getDataSetSchema()).append(",");
        if (getColumnGroupSchemaList() != null)
            sb.append("ColumnGroupSchemaList: ").append(getColumnGroupSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetConfiguration == false)
            return false;
        DataSetConfiguration other = (DataSetConfiguration) obj;
        if (other.getPlaceholder() == null ^ this.getPlaceholder() == null)
            return false;
        if (other.getPlaceholder() != null && other.getPlaceholder().equals(this.getPlaceholder()) == false)
            return false;
        if (other.getDataSetSchema() == null ^ this.getDataSetSchema() == null)
            return false;
        if (other.getDataSetSchema() != null && other.getDataSetSchema().equals(this.getDataSetSchema()) == false)
            return false;
        if (other.getColumnGroupSchemaList() == null ^ this.getColumnGroupSchemaList() == null)
            return false;
        if (other.getColumnGroupSchemaList() != null && other.getColumnGroupSchemaList().equals(this.getColumnGroupSchemaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlaceholder() == null) ? 0 : getPlaceholder().hashCode());
        hashCode = prime * hashCode + ((getDataSetSchema() == null) ? 0 : getDataSetSchema().hashCode());
        hashCode = prime * hashCode + ((getColumnGroupSchemaList() == null) ? 0 : getColumnGroupSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public DataSetConfiguration clone() {
        try {
            return (DataSetConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
