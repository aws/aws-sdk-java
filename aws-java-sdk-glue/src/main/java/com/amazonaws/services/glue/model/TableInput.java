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
 * Structure used to create or update the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Owner of the table.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Last time the table was accessed.
     * </p>
     */
    private java.util.Date lastAccessTime;
    /**
     * <p>
     * Last time column statistics were computed for this table.
     * </p>
     */
    private java.util.Date lastAnalyzedTime;
    /**
     * <p>
     * Retention time for this table.
     * </p>
     */
    private Integer retention;
    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     */
    private StorageDescriptor storageDescriptor;
    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at least
     * set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     */
    private java.util.List<Column> partitionKeys;
    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise <code>null</code>.
     * </p>
     */
    private String viewOriginalText;
    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     * </p>
     */
    private String viewExpandedText;
    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     */
    private String tableType;
    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     * 
     * @param name
     *        Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     * 
     * @return Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     * </p>
     * 
     * @param name
     *        Name of the table. For Hive compatibility, this is folded to lowercase when it is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the table.
     * </p>
     * 
     * @param description
     *        Description of the table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the table.
     * </p>
     * 
     * @return Description of the table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the table.
     * </p>
     * 
     * @param description
     *        Description of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Owner of the table.
     * </p>
     * 
     * @param owner
     *        Owner of the table.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Owner of the table.
     * </p>
     * 
     * @return Owner of the table.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * Owner of the table.
     * </p>
     * 
     * @param owner
     *        Owner of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Last time the table was accessed.
     * </p>
     * 
     * @param lastAccessTime
     *        Last time the table was accessed.
     */

    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * Last time the table was accessed.
     * </p>
     * 
     * @return Last time the table was accessed.
     */

    public java.util.Date getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * <p>
     * Last time the table was accessed.
     * </p>
     * 
     * @param lastAccessTime
     *        Last time the table was accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withLastAccessTime(java.util.Date lastAccessTime) {
        setLastAccessTime(lastAccessTime);
        return this;
    }

    /**
     * <p>
     * Last time column statistics were computed for this table.
     * </p>
     * 
     * @param lastAnalyzedTime
     *        Last time column statistics were computed for this table.
     */

    public void setLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    /**
     * <p>
     * Last time column statistics were computed for this table.
     * </p>
     * 
     * @return Last time column statistics were computed for this table.
     */

    public java.util.Date getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * <p>
     * Last time column statistics were computed for this table.
     * </p>
     * 
     * @param lastAnalyzedTime
     *        Last time column statistics were computed for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        setLastAnalyzedTime(lastAnalyzedTime);
        return this;
    }

    /**
     * <p>
     * Retention time for this table.
     * </p>
     * 
     * @param retention
     *        Retention time for this table.
     */

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * Retention time for this table.
     * </p>
     * 
     * @return Retention time for this table.
     */

    public Integer getRetention() {
        return this.retention;
    }

    /**
     * <p>
     * Retention time for this table.
     * </p>
     * 
     * @param retention
     *        Retention time for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withRetention(Integer retention) {
        setRetention(retention);
        return this;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     * 
     * @param storageDescriptor
     *        A storage descriptor containing information about the physical storage of this table.
     */

    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     * 
     * @return A storage descriptor containing information about the physical storage of this table.
     */

    public StorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     * 
     * @param storageDescriptor
     *        A storage descriptor containing information about the physical storage of this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withStorageDescriptor(StorageDescriptor storageDescriptor) {
        setStorageDescriptor(storageDescriptor);
        return this;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at least
     * set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * 
     * @return A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *         keys.</p>
     *         <p>
     *         When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at
     *         least set the value of <code>partitionKeys</code> to an empty list. For example:
     *         </p>
     *         <p>
     *         <code>"PartitionKeys": []</code>
     */

    public java.util.List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at least
     * set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * 
     * @param partitionKeys
     *        A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *        keys.</p>
     *        <p>
     *        When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at
     *        least set the value of <code>partitionKeys</code> to an empty list. For example:
     *        </p>
     *        <p>
     *        <code>"PartitionKeys": []</code>
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
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at least
     * set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *        keys.</p>
     *        <p>
     *        When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at
     *        least set the value of <code>partitionKeys</code> to an empty list. For example:
     *        </p>
     *        <p>
     *        <code>"PartitionKeys": []</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withPartitionKeys(Column... partitionKeys) {
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
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at least
     * set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * 
     * @param partitionKeys
     *        A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *        keys.</p>
     *        <p>
     *        When creating a table used by Athena, and you do not specify any <code>partitionKeys</code>, you must at
     *        least set the value of <code>partitionKeys</code> to an empty list. For example:
     *        </p>
     *        <p>
     *        <code>"PartitionKeys": []</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withPartitionKeys(java.util.Collection<Column> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise <code>null</code>.
     * </p>
     * 
     * @param viewOriginalText
     *        If the table is a view, the original text of the view; otherwise <code>null</code>.
     */

    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise <code>null</code>.
     * </p>
     * 
     * @return If the table is a view, the original text of the view; otherwise <code>null</code>.
     */

    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    /**
     * <p>
     * If the table is a view, the original text of the view; otherwise <code>null</code>.
     * </p>
     * 
     * @param viewOriginalText
     *        If the table is a view, the original text of the view; otherwise <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withViewOriginalText(String viewOriginalText) {
        setViewOriginalText(viewOriginalText);
        return this;
    }

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     * </p>
     * 
     * @param viewExpandedText
     *        If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     */

    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     * </p>
     * 
     * @return If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     */

    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * <p>
     * If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     * </p>
     * 
     * @param viewExpandedText
     *        If the table is a view, the expanded text of the view; otherwise <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withViewExpandedText(String viewExpandedText) {
        setViewExpandedText(viewExpandedText);
        return this;
    }

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * 
     * @param tableType
     *        The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     */

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * 
     * @return The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     */

    public String getTableType() {
        return this.tableType;
    }

    /**
     * <p>
     * The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     * </p>
     * 
     * @param tableType
     *        The type of this table (<code>EXTERNAL_TABLE</code>, <code>VIRTUAL_VIEW</code>, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withTableType(String tableType) {
        setTableType(tableType);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * 
     * @return These key-value pairs define properties associated with the table.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define properties associated with the table.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define properties associated with the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableInput withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public TableInput addParametersEntry(String key, String value) {
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

    public TableInput clearParametersEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: ").append(getLastAccessTime()).append(",");
        if (getLastAnalyzedTime() != null)
            sb.append("LastAnalyzedTime: ").append(getLastAnalyzedTime()).append(",");
        if (getRetention() != null)
            sb.append("Retention: ").append(getRetention()).append(",");
        if (getStorageDescriptor() != null)
            sb.append("StorageDescriptor: ").append(getStorageDescriptor()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getViewOriginalText() != null)
            sb.append("ViewOriginalText: ").append(getViewOriginalText()).append(",");
        if (getViewExpandedText() != null)
            sb.append("ViewExpandedText: ").append(getViewExpandedText()).append(",");
        if (getTableType() != null)
            sb.append("TableType: ").append(getTableType()).append(",");
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

        if (obj instanceof TableInput == false)
            return false;
        TableInput other = (TableInput) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getLastAnalyzedTime() == null ^ this.getLastAnalyzedTime() == null)
            return false;
        if (other.getLastAnalyzedTime() != null && other.getLastAnalyzedTime().equals(this.getLastAnalyzedTime()) == false)
            return false;
        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null && other.getRetention().equals(this.getRetention()) == false)
            return false;
        if (other.getStorageDescriptor() == null ^ this.getStorageDescriptor() == null)
            return false;
        if (other.getStorageDescriptor() != null && other.getStorageDescriptor().equals(this.getStorageDescriptor()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getViewOriginalText() == null ^ this.getViewOriginalText() == null)
            return false;
        if (other.getViewOriginalText() != null && other.getViewOriginalText().equals(this.getViewOriginalText()) == false)
            return false;
        if (other.getViewExpandedText() == null ^ this.getViewExpandedText() == null)
            return false;
        if (other.getViewExpandedText() != null && other.getViewExpandedText().equals(this.getViewExpandedText()) == false)
            return false;
        if (other.getTableType() == null ^ this.getTableType() == null)
            return false;
        if (other.getTableType() != null && other.getTableType().equals(this.getTableType()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode + ((getLastAnalyzedTime() == null) ? 0 : getLastAnalyzedTime().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        hashCode = prime * hashCode + ((getStorageDescriptor() == null) ? 0 : getStorageDescriptor().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getViewOriginalText() == null) ? 0 : getViewOriginalText().hashCode());
        hashCode = prime * hashCode + ((getViewExpandedText() == null) ? 0 : getViewExpandedText().hashCode());
        hashCode = prime * hashCode + ((getTableType() == null) ? 0 : getTableType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public TableInput clone() {
        try {
            return (TableInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
