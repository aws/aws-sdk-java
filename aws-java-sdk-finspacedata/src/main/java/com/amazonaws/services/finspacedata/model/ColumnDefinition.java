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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of a column in a tabular Dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ColumnDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Data type of a column.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> – A String data type.
     * </p>
     * <p>
     * <code>CHAR</code> – A char data type.
     * </p>
     * <p>
     * <code>INTEGER</code> – An integer data type.
     * </p>
     * <p>
     * <code>TINYINT</code> – A tinyint data type.
     * </p>
     * <p>
     * <code>SMALLINT</code> – A smallint data type.
     * </p>
     * <p>
     * <code>BIGINT</code> – A bigint data type.
     * </p>
     * <p>
     * <code>FLOAT</code> – A float data type.
     * </p>
     * <p>
     * <code>DOUBLE</code> – A double data type.
     * </p>
     * <p>
     * <code>DATE</code> – A date data type.
     * </p>
     * <p>
     * <code>DATETIME</code> – A datetime data type.
     * </p>
     * <p>
     * <code>BOOLEAN</code> – A boolean data type.
     * </p>
     * <p>
     * <code>BINARY</code> – A binary data type.
     * </p>
     * </li>
     * </ul>
     */
    private String dataType;
    /**
     * <p>
     * The name of a column.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * Description for a column.
     * </p>
     */
    private String columnDescription;

    /**
     * <p>
     * Data type of a column.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> – A String data type.
     * </p>
     * <p>
     * <code>CHAR</code> – A char data type.
     * </p>
     * <p>
     * <code>INTEGER</code> – An integer data type.
     * </p>
     * <p>
     * <code>TINYINT</code> – A tinyint data type.
     * </p>
     * <p>
     * <code>SMALLINT</code> – A smallint data type.
     * </p>
     * <p>
     * <code>BIGINT</code> – A bigint data type.
     * </p>
     * <p>
     * <code>FLOAT</code> – A float data type.
     * </p>
     * <p>
     * <code>DOUBLE</code> – A double data type.
     * </p>
     * <p>
     * <code>DATE</code> – A date data type.
     * </p>
     * <p>
     * <code>DATETIME</code> – A datetime data type.
     * </p>
     * <p>
     * <code>BOOLEAN</code> – A boolean data type.
     * </p>
     * <p>
     * <code>BINARY</code> – A binary data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataType
     *        Data type of a column.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STRING</code> – A String data type.
     *        </p>
     *        <p>
     *        <code>CHAR</code> – A char data type.
     *        </p>
     *        <p>
     *        <code>INTEGER</code> – An integer data type.
     *        </p>
     *        <p>
     *        <code>TINYINT</code> – A tinyint data type.
     *        </p>
     *        <p>
     *        <code>SMALLINT</code> – A smallint data type.
     *        </p>
     *        <p>
     *        <code>BIGINT</code> – A bigint data type.
     *        </p>
     *        <p>
     *        <code>FLOAT</code> – A float data type.
     *        </p>
     *        <p>
     *        <code>DOUBLE</code> – A double data type.
     *        </p>
     *        <p>
     *        <code>DATE</code> – A date data type.
     *        </p>
     *        <p>
     *        <code>DATETIME</code> – A datetime data type.
     *        </p>
     *        <p>
     *        <code>BOOLEAN</code> – A boolean data type.
     *        </p>
     *        <p>
     *        <code>BINARY</code> – A binary data type.
     *        </p>
     *        </li>
     * @see ColumnDataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * Data type of a column.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> – A String data type.
     * </p>
     * <p>
     * <code>CHAR</code> – A char data type.
     * </p>
     * <p>
     * <code>INTEGER</code> – An integer data type.
     * </p>
     * <p>
     * <code>TINYINT</code> – A tinyint data type.
     * </p>
     * <p>
     * <code>SMALLINT</code> – A smallint data type.
     * </p>
     * <p>
     * <code>BIGINT</code> – A bigint data type.
     * </p>
     * <p>
     * <code>FLOAT</code> – A float data type.
     * </p>
     * <p>
     * <code>DOUBLE</code> – A double data type.
     * </p>
     * <p>
     * <code>DATE</code> – A date data type.
     * </p>
     * <p>
     * <code>DATETIME</code> – A datetime data type.
     * </p>
     * <p>
     * <code>BOOLEAN</code> – A boolean data type.
     * </p>
     * <p>
     * <code>BINARY</code> – A binary data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Data type of a column.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>STRING</code> – A String data type.
     *         </p>
     *         <p>
     *         <code>CHAR</code> – A char data type.
     *         </p>
     *         <p>
     *         <code>INTEGER</code> – An integer data type.
     *         </p>
     *         <p>
     *         <code>TINYINT</code> – A tinyint data type.
     *         </p>
     *         <p>
     *         <code>SMALLINT</code> – A smallint data type.
     *         </p>
     *         <p>
     *         <code>BIGINT</code> – A bigint data type.
     *         </p>
     *         <p>
     *         <code>FLOAT</code> – A float data type.
     *         </p>
     *         <p>
     *         <code>DOUBLE</code> – A double data type.
     *         </p>
     *         <p>
     *         <code>DATE</code> – A date data type.
     *         </p>
     *         <p>
     *         <code>DATETIME</code> – A datetime data type.
     *         </p>
     *         <p>
     *         <code>BOOLEAN</code> – A boolean data type.
     *         </p>
     *         <p>
     *         <code>BINARY</code> – A binary data type.
     *         </p>
     *         </li>
     * @see ColumnDataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * Data type of a column.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> – A String data type.
     * </p>
     * <p>
     * <code>CHAR</code> – A char data type.
     * </p>
     * <p>
     * <code>INTEGER</code> – An integer data type.
     * </p>
     * <p>
     * <code>TINYINT</code> – A tinyint data type.
     * </p>
     * <p>
     * <code>SMALLINT</code> – A smallint data type.
     * </p>
     * <p>
     * <code>BIGINT</code> – A bigint data type.
     * </p>
     * <p>
     * <code>FLOAT</code> – A float data type.
     * </p>
     * <p>
     * <code>DOUBLE</code> – A double data type.
     * </p>
     * <p>
     * <code>DATE</code> – A date data type.
     * </p>
     * <p>
     * <code>DATETIME</code> – A datetime data type.
     * </p>
     * <p>
     * <code>BOOLEAN</code> – A boolean data type.
     * </p>
     * <p>
     * <code>BINARY</code> – A binary data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataType
     *        Data type of a column.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STRING</code> – A String data type.
     *        </p>
     *        <p>
     *        <code>CHAR</code> – A char data type.
     *        </p>
     *        <p>
     *        <code>INTEGER</code> – An integer data type.
     *        </p>
     *        <p>
     *        <code>TINYINT</code> – A tinyint data type.
     *        </p>
     *        <p>
     *        <code>SMALLINT</code> – A smallint data type.
     *        </p>
     *        <p>
     *        <code>BIGINT</code> – A bigint data type.
     *        </p>
     *        <p>
     *        <code>FLOAT</code> – A float data type.
     *        </p>
     *        <p>
     *        <code>DOUBLE</code> – A double data type.
     *        </p>
     *        <p>
     *        <code>DATE</code> – A date data type.
     *        </p>
     *        <p>
     *        <code>DATETIME</code> – A datetime data type.
     *        </p>
     *        <p>
     *        <code>BOOLEAN</code> – A boolean data type.
     *        </p>
     *        <p>
     *        <code>BINARY</code> – A binary data type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public ColumnDefinition withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * Data type of a column.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>STRING</code> – A String data type.
     * </p>
     * <p>
     * <code>CHAR</code> – A char data type.
     * </p>
     * <p>
     * <code>INTEGER</code> – An integer data type.
     * </p>
     * <p>
     * <code>TINYINT</code> – A tinyint data type.
     * </p>
     * <p>
     * <code>SMALLINT</code> – A smallint data type.
     * </p>
     * <p>
     * <code>BIGINT</code> – A bigint data type.
     * </p>
     * <p>
     * <code>FLOAT</code> – A float data type.
     * </p>
     * <p>
     * <code>DOUBLE</code> – A double data type.
     * </p>
     * <p>
     * <code>DATE</code> – A date data type.
     * </p>
     * <p>
     * <code>DATETIME</code> – A datetime data type.
     * </p>
     * <p>
     * <code>BOOLEAN</code> – A boolean data type.
     * </p>
     * <p>
     * <code>BINARY</code> – A binary data type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataType
     *        Data type of a column.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>STRING</code> – A String data type.
     *        </p>
     *        <p>
     *        <code>CHAR</code> – A char data type.
     *        </p>
     *        <p>
     *        <code>INTEGER</code> – An integer data type.
     *        </p>
     *        <p>
     *        <code>TINYINT</code> – A tinyint data type.
     *        </p>
     *        <p>
     *        <code>SMALLINT</code> – A smallint data type.
     *        </p>
     *        <p>
     *        <code>BIGINT</code> – A bigint data type.
     *        </p>
     *        <p>
     *        <code>FLOAT</code> – A float data type.
     *        </p>
     *        <p>
     *        <code>DOUBLE</code> – A double data type.
     *        </p>
     *        <p>
     *        <code>DATE</code> – A date data type.
     *        </p>
     *        <p>
     *        <code>DATETIME</code> – A datetime data type.
     *        </p>
     *        <p>
     *        <code>BOOLEAN</code> – A boolean data type.
     *        </p>
     *        <p>
     *        <code>BINARY</code> – A binary data type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public ColumnDefinition withDataType(ColumnDataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

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

    public ColumnDefinition withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * Description for a column.
     * </p>
     * 
     * @param columnDescription
     *        Description for a column.
     */

    public void setColumnDescription(String columnDescription) {
        this.columnDescription = columnDescription;
    }

    /**
     * <p>
     * Description for a column.
     * </p>
     * 
     * @return Description for a column.
     */

    public String getColumnDescription() {
        return this.columnDescription;
    }

    /**
     * <p>
     * Description for a column.
     * </p>
     * 
     * @param columnDescription
     *        Description for a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnDefinition withColumnDescription(String columnDescription) {
        setColumnDescription(columnDescription);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getColumnDescription() != null)
            sb.append("ColumnDescription: ").append(getColumnDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnDefinition == false)
            return false;
        ColumnDefinition other = (ColumnDefinition) obj;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnDescription() == null ^ this.getColumnDescription() == null)
            return false;
        if (other.getColumnDescription() != null && other.getColumnDescription().equals(this.getColumnDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnDescription() == null) ? 0 : getColumnDescription().hashCode());
        return hashCode;
    }

    @Override
    public ColumnDefinition clone() {
        try {
            return (ColumnDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.ColumnDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
