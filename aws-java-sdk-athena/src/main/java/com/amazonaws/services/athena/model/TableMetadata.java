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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata for a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TableMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time that the table was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     */
    private java.util.Date lastAccessTime;
    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     * </p>
     */
    private String tableType;
    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     */
    private java.util.List<Column> columns;
    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     */
    private java.util.List<Column> partitionKeys;
    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param name
     *        The name of the table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param name
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time that the table was created.
     * </p>
     * 
     * @param createTime
     *        The time that the table was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time that the table was created.
     * </p>
     * 
     * @return The time that the table was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time that the table was created.
     * </p>
     * 
     * @param createTime
     *        The time that the table was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     * 
     * @param lastAccessTime
     *        The last time the table was accessed.
     */

    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     * 
     * @return The last time the table was accessed.
     */

    public java.util.Date getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * <p>
     * The last time the table was accessed.
     * </p>
     * 
     * @param lastAccessTime
     *        The last time the table was accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withLastAccessTime(java.util.Date lastAccessTime) {
        setLastAccessTime(lastAccessTime);
        return this;
    }

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     * </p>
     * 
     * @param tableType
     *        The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     */

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     * </p>
     * 
     * @return The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     */

    public String getTableType() {
        return this.tableType;
    }

    /**
     * <p>
     * The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     * </p>
     * 
     * @param tableType
     *        The type of table. In Athena, only <code>EXTERNAL_TABLE</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withTableType(String tableType) {
        setTableType(tableType);
        return this;
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     * 
     * @return A list of the columns in the table.
     */

    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     * 
     * @param columns
     *        A list of the columns in the table.
     */

    public void setColumns(java.util.Collection<Column> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<Column>(columns);
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        A list of the columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withColumns(Column... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<Column>(columns.length));
        }
        for (Column ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the columns in the table.
     * </p>
     * 
     * @param columns
     *        A list of the columns in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withColumns(java.util.Collection<Column> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     * 
     * @return A list of the partition keys in the table.
     */

    public java.util.List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     * 
     * @param partitionKeys
     *        A list of the partition keys in the table.
     */

    public void setPartitionKeys(java.util.Collection<Column> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys);
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        A list of the partition keys in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withPartitionKeys(Column... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<Column>(partitionKeys.length));
        }
        for (Column ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the partition keys in the table.
     * </p>
     * 
     * @param partitionKeys
     *        A list of the partition keys in the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withPartitionKeys(java.util.Collection<Column> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     * 
     * @return A set of custom key/value pairs for table properties.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     * 
     * @param parameters
     *        A set of custom key/value pairs for table properties.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A set of custom key/value pairs for table properties.
     * </p>
     * 
     * @param parameters
     *        A set of custom key/value pairs for table properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see TableMetadata#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMetadata clearParametersEntries() {
        this.parameters = null;
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: ").append(getLastAccessTime()).append(",");
        if (getTableType() != null)
            sb.append("TableType: ").append(getTableType()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableMetadata == false)
            return false;
        TableMetadata other = (TableMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getTableType() == null ^ this.getTableType() == null)
            return false;
        if (other.getTableType() != null && other.getTableType().equals(this.getTableType()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode + ((getTableType() == null) ? 0 : getTableType().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public TableMetadata clone() {
        try {
            return (TableMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.TableMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
