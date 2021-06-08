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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains attributes about a single column in a table
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/TableColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the column in the table.
     * </p>
     */
    private String tableColumnId;
    /**
     * <p>
     * The name of the column in the table.
     * </p>
     */
    private String tableColumnName;
    /**
     * <p>
     * The column level format that is applied in the table. An empty value in this field means that the column format
     * is the default value 'AUTO'.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The id of the column in the table.
     * </p>
     * 
     * @param tableColumnId
     *        The id of the column in the table.
     */

    public void setTableColumnId(String tableColumnId) {
        this.tableColumnId = tableColumnId;
    }

    /**
     * <p>
     * The id of the column in the table.
     * </p>
     * 
     * @return The id of the column in the table.
     */

    public String getTableColumnId() {
        return this.tableColumnId;
    }

    /**
     * <p>
     * The id of the column in the table.
     * </p>
     * 
     * @param tableColumnId
     *        The id of the column in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableColumn withTableColumnId(String tableColumnId) {
        setTableColumnId(tableColumnId);
        return this;
    }

    /**
     * <p>
     * The name of the column in the table.
     * </p>
     * 
     * @param tableColumnName
     *        The name of the column in the table.
     */

    public void setTableColumnName(String tableColumnName) {
        this.tableColumnName = tableColumnName;
    }

    /**
     * <p>
     * The name of the column in the table.
     * </p>
     * 
     * @return The name of the column in the table.
     */

    public String getTableColumnName() {
        return this.tableColumnName;
    }

    /**
     * <p>
     * The name of the column in the table.
     * </p>
     * 
     * @param tableColumnName
     *        The name of the column in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableColumn withTableColumnName(String tableColumnName) {
        setTableColumnName(tableColumnName);
        return this;
    }

    /**
     * <p>
     * The column level format that is applied in the table. An empty value in this field means that the column format
     * is the default value 'AUTO'.
     * </p>
     * 
     * @param format
     *        The column level format that is applied in the table. An empty value in this field means that the column
     *        format is the default value 'AUTO'.
     * @see Format
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The column level format that is applied in the table. An empty value in this field means that the column format
     * is the default value 'AUTO'.
     * </p>
     * 
     * @return The column level format that is applied in the table. An empty value in this field means that the column
     *         format is the default value 'AUTO'.
     * @see Format
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The column level format that is applied in the table. An empty value in this field means that the column format
     * is the default value 'AUTO'.
     * </p>
     * 
     * @param format
     *        The column level format that is applied in the table. An empty value in this field means that the column
     *        format is the default value 'AUTO'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public TableColumn withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The column level format that is applied in the table. An empty value in this field means that the column format
     * is the default value 'AUTO'.
     * </p>
     * 
     * @param format
     *        The column level format that is applied in the table. An empty value in this field means that the column
     *        format is the default value 'AUTO'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Format
     */

    public TableColumn withFormat(Format format) {
        this.format = format.toString();
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
        if (getTableColumnId() != null)
            sb.append("TableColumnId: ").append(getTableColumnId()).append(",");
        if (getTableColumnName() != null)
            sb.append("TableColumnName: ").append(getTableColumnName()).append(",");
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

        if (obj instanceof TableColumn == false)
            return false;
        TableColumn other = (TableColumn) obj;
        if (other.getTableColumnId() == null ^ this.getTableColumnId() == null)
            return false;
        if (other.getTableColumnId() != null && other.getTableColumnId().equals(this.getTableColumnId()) == false)
            return false;
        if (other.getTableColumnName() == null ^ this.getTableColumnName() == null)
            return false;
        if (other.getTableColumnName() != null && other.getTableColumnName().equals(this.getTableColumnName()) == false)
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

        hashCode = prime * hashCode + ((getTableColumnId() == null) ? 0 : getTableColumnId().hashCode());
        hashCode = prime * hashCode + ((getTableColumnName() == null) ? 0 : getTableColumnName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public TableColumn clone() {
        try {
            return (TableColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.TableColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
