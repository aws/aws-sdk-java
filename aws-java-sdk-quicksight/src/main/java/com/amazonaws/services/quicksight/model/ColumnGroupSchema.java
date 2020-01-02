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
 * The column group schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnGroupSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnGroupSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     */
    private java.util.List<ColumnGroupColumnSchema> columnGroupColumnSchemaList;

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     * 
     * @param name
     *        The name of the column group schema.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     * 
     * @return The name of the column group schema.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the column group schema.
     * </p>
     * 
     * @param name
     *        The name of the column group schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnGroupSchema withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     * 
     * @return A structure containing the list of schemas for column group columns.
     */

    public java.util.List<ColumnGroupColumnSchema> getColumnGroupColumnSchemaList() {
        return columnGroupColumnSchemaList;
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     * 
     * @param columnGroupColumnSchemaList
     *        A structure containing the list of schemas for column group columns.
     */

    public void setColumnGroupColumnSchemaList(java.util.Collection<ColumnGroupColumnSchema> columnGroupColumnSchemaList) {
        if (columnGroupColumnSchemaList == null) {
            this.columnGroupColumnSchemaList = null;
            return;
        }

        this.columnGroupColumnSchemaList = new java.util.ArrayList<ColumnGroupColumnSchema>(columnGroupColumnSchemaList);
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnGroupColumnSchemaList(java.util.Collection)} or
     * {@link #withColumnGroupColumnSchemaList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param columnGroupColumnSchemaList
     *        A structure containing the list of schemas for column group columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnGroupSchema withColumnGroupColumnSchemaList(ColumnGroupColumnSchema... columnGroupColumnSchemaList) {
        if (this.columnGroupColumnSchemaList == null) {
            setColumnGroupColumnSchemaList(new java.util.ArrayList<ColumnGroupColumnSchema>(columnGroupColumnSchemaList.length));
        }
        for (ColumnGroupColumnSchema ele : columnGroupColumnSchemaList) {
            this.columnGroupColumnSchemaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing the list of schemas for column group columns.
     * </p>
     * 
     * @param columnGroupColumnSchemaList
     *        A structure containing the list of schemas for column group columns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnGroupSchema withColumnGroupColumnSchemaList(java.util.Collection<ColumnGroupColumnSchema> columnGroupColumnSchemaList) {
        setColumnGroupColumnSchemaList(columnGroupColumnSchemaList);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getColumnGroupColumnSchemaList() != null)
            sb.append("ColumnGroupColumnSchemaList: ").append(getColumnGroupColumnSchemaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnGroupSchema == false)
            return false;
        ColumnGroupSchema other = (ColumnGroupSchema) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getColumnGroupColumnSchemaList() == null ^ this.getColumnGroupColumnSchemaList() == null)
            return false;
        if (other.getColumnGroupColumnSchemaList() != null && other.getColumnGroupColumnSchemaList().equals(this.getColumnGroupColumnSchemaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getColumnGroupColumnSchemaList() == null) ? 0 : getColumnGroupColumnSchemaList().hashCode());
        return hashCode;
    }

    @Override
    public ColumnGroupSchema clone() {
        try {
            return (ColumnGroupSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnGroupSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
