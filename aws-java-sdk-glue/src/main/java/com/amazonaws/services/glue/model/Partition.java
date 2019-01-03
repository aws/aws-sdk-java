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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a slice of table data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Partition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Partition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values of the partition.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The name of the catalog database where the table in question is located.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table in question.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     */
    private java.util.Date lastAccessTime;
    /**
     * <p>
     * Provides information about the physical location where the partition is stored.
     * </p>
     */
    private StorageDescriptor storageDescriptor;
    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The last time at which column statistics were computed for this partition.
     * </p>
     */
    private java.util.Date lastAnalyzedTime;

    /**
     * <p>
     * The values of the partition.
     * </p>
     * 
     * @return The values of the partition.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the partition.
     * </p>
     * 
     * @param values
     *        The values of the partition.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values of the partition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the partition.
     * </p>
     * 
     * @param values
     *        The values of the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the table in question is located.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the table in question is located.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the table in question is located.
     * </p>
     * 
     * @return The name of the catalog database where the table in question is located.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the table in question is located.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the table in question is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table in question.
     * </p>
     * 
     * @param tableName
     *        The name of the table in question.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table in question.
     * </p>
     * 
     * @return The name of the table in question.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table in question.
     * </p>
     * 
     * @param tableName
     *        The name of the table in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the partition was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     * 
     * @return The time at which the partition was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the partition was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the partition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     * 
     * @param lastAccessTime
     *        The last time at which the partition was accessed.
     */

    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     * 
     * @return The last time at which the partition was accessed.
     */

    public java.util.Date getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * <p>
     * The last time at which the partition was accessed.
     * </p>
     * 
     * @param lastAccessTime
     *        The last time at which the partition was accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withLastAccessTime(java.util.Date lastAccessTime) {
        setLastAccessTime(lastAccessTime);
        return this;
    }

    /**
     * <p>
     * Provides information about the physical location where the partition is stored.
     * </p>
     * 
     * @param storageDescriptor
     *        Provides information about the physical location where the partition is stored.
     */

    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    /**
     * <p>
     * Provides information about the physical location where the partition is stored.
     * </p>
     * 
     * @return Provides information about the physical location where the partition is stored.
     */

    public StorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    /**
     * <p>
     * Provides information about the physical location where the partition is stored.
     * </p>
     * 
     * @param storageDescriptor
     *        Provides information about the physical location where the partition is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withStorageDescriptor(StorageDescriptor storageDescriptor) {
        setStorageDescriptor(storageDescriptor);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     * 
     * @return These key-value pairs define partition parameters.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define partition parameters.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define partition parameters.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define partition parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public Partition addParametersEntry(String key, String value) {
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

    public Partition clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The last time at which column statistics were computed for this partition.
     * </p>
     * 
     * @param lastAnalyzedTime
     *        The last time at which column statistics were computed for this partition.
     */

    public void setLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time at which column statistics were computed for this partition.
     * </p>
     * 
     * @return The last time at which column statistics were computed for this partition.
     */

    public java.util.Date getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time at which column statistics were computed for this partition.
     * </p>
     * 
     * @param lastAnalyzedTime
     *        The last time at which column statistics were computed for this partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Partition withLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        setLastAnalyzedTime(lastAnalyzedTime);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: ").append(getLastAccessTime()).append(",");
        if (getStorageDescriptor() != null)
            sb.append("StorageDescriptor: ").append(getStorageDescriptor()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getLastAnalyzedTime() != null)
            sb.append("LastAnalyzedTime: ").append(getLastAnalyzedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Partition == false)
            return false;
        Partition other = (Partition) obj;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getStorageDescriptor() == null ^ this.getStorageDescriptor() == null)
            return false;
        if (other.getStorageDescriptor() != null && other.getStorageDescriptor().equals(this.getStorageDescriptor()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getLastAnalyzedTime() == null ^ this.getLastAnalyzedTime() == null)
            return false;
        if (other.getLastAnalyzedTime() != null && other.getLastAnalyzedTime().equals(this.getLastAnalyzedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode + ((getStorageDescriptor() == null) ? 0 : getStorageDescriptor().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getLastAnalyzedTime() == null) ? 0 : getLastAnalyzedTime().hashCode());
        return hashCode;
    }

    @Override
    public Partition clone() {
        try {
            return (Partition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.PartitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
