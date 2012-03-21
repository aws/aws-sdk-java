/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodb.model;

/**
 * Table Description
 */
public class TableDescription {

    /**
     * The name of the table being described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     */
    private KeySchema keySchema;

    private String tableStatus;

    private java.util.Date creationDateTime;

    private ProvisionedThroughputDescription provisionedThroughput;

    private Long tableSizeBytes;

    private Long itemCount;

    /**
     * Default constructor for a new TableDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public TableDescription() {}
    
    /**
     * The name of the table being described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table being described.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table being described.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table being described.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table being described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table being described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TableDescription withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     *
     * @return The KeySchema identifies the primary key as a one attribute primary
     *         key (hash) or a composite two attribute (hash-and-range) primary key.
     *         Single attribute primary keys have one index value: a
     *         <code>HashKeyElement</code>. A composite hash-and-range primary key
     *         contains two attribute values: a <code>HashKeyElement</code> and a
     *         <code>RangeKeyElement</code>.
     */
    public KeySchema getKeySchema() {
        return keySchema;
    }
    
    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     *
     * @param keySchema The KeySchema identifies the primary key as a one attribute primary
     *         key (hash) or a composite two attribute (hash-and-range) primary key.
     *         Single attribute primary keys have one index value: a
     *         <code>HashKeyElement</code>. A composite hash-and-range primary key
     *         contains two attribute values: a <code>HashKeyElement</code> and a
     *         <code>RangeKeyElement</code>.
     */
    public void setKeySchema(KeySchema keySchema) {
        this.keySchema = keySchema;
    }
    
    /**
     * The KeySchema identifies the primary key as a one attribute primary
     * key (hash) or a composite two attribute (hash-and-range) primary key.
     * Single attribute primary keys have one index value: a
     * <code>HashKeyElement</code>. A composite hash-and-range primary key
     * contains two attribute values: a <code>HashKeyElement</code> and a
     * <code>RangeKeyElement</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keySchema The KeySchema identifies the primary key as a one attribute primary
     *         key (hash) or a composite two attribute (hash-and-range) primary key.
     *         Single attribute primary keys have one index value: a
     *         <code>HashKeyElement</code>. A composite hash-and-range primary key
     *         contains two attribute values: a <code>HashKeyElement</code> and a
     *         <code>RangeKeyElement</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TableDescription withKeySchema(KeySchema keySchema) {
        this.keySchema = keySchema;
        return this;
    }
    
    
    /**
     * Returns the value of the TableStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @return The value of the TableStatus property for this object.
     *
     * @see TableStatus
     */
    public String getTableStatus() {
        return tableStatus;
    }
    
    /**
     * Sets the value of the TableStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus The new value for the TableStatus property for this object.
     *
     * @see TableStatus
     */
    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }
    
    /**
     * Sets the value of the TableStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus The new value for the TableStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see TableStatus
     */
    public TableDescription withTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
        return this;
    }
    
    
    /**
     * Sets the value of the TableStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus The new value for the TableStatus property for this object.
     *
     * @see TableStatus
     */
    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
    }
    
    /**
     * Sets the value of the TableStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param tableStatus The new value for the TableStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see TableStatus
     */
    public TableDescription withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }
    
    /**
     * Returns the value of the CreationDateTime property for this object.
     *
     * @return The value of the CreationDateTime property for this object.
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }
    
    /**
     * Sets the value of the CreationDateTime property for this object.
     *
     * @param creationDateTime The new value for the CreationDateTime property for this object.
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    
    /**
     * Sets the value of the CreationDateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDateTime The new value for the CreationDateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TableDescription withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    
    
    /**
     * Returns the value of the ProvisionedThroughput property for this
     * object.
     *
     * @return The value of the ProvisionedThroughput property for this object.
     */
    public ProvisionedThroughputDescription getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * Sets the value of the ProvisionedThroughput property for this object.
     *
     * @param provisionedThroughput The new value for the ProvisionedThroughput property for this object.
     */
    public void setProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * Sets the value of the ProvisionedThroughput property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput The new value for the ProvisionedThroughput property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TableDescription withProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }
    
    
    /**
     * Returns the value of the TableSizeBytes property for this object.
     *
     * @return The value of the TableSizeBytes property for this object.
     */
    public Long getTableSizeBytes() {
        return tableSizeBytes;
    }
    
    /**
     * Sets the value of the TableSizeBytes property for this object.
     *
     * @param tableSizeBytes The new value for the TableSizeBytes property for this object.
     */
    public void setTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
    }
    
    /**
     * Sets the value of the TableSizeBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tableSizeBytes The new value for the TableSizeBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TableDescription withTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
        return this;
    }
    
    
    /**
     * Returns the value of the ItemCount property for this object.
     *
     * @return The value of the ItemCount property for this object.
     */
    public Long getItemCount() {
        return itemCount;
    }
    
    /**
     * Sets the value of the ItemCount property for this object.
     *
     * @param itemCount The new value for the ItemCount property for this object.
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }
    
    /**
     * Sets the value of the ItemCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCount The new value for the ItemCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TableDescription withItemCount(Long itemCount) {
        this.itemCount = itemCount;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (tableName != null) sb.append("TableName: " + tableName + ", ");
        if (keySchema != null) sb.append("KeySchema: " + keySchema + ", ");
        if (tableStatus != null) sb.append("TableStatus: " + tableStatus + ", ");
        if (creationDateTime != null) sb.append("CreationDateTime: " + creationDateTime + ", ");
        if (provisionedThroughput != null) sb.append("ProvisionedThroughput: " + provisionedThroughput + ", ");
        if (tableSizeBytes != null) sb.append("TableSizeBytes: " + tableSizeBytes + ", ");
        if (itemCount != null) sb.append("ItemCount: " + itemCount + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        hashCode = prime * hashCode + ((getTableSizeBytes() == null) ? 0 : getTableSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof TableDescription == false) return false;
        TableDescription other = (TableDescription)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getTableStatus() == null ^ this.getTableStatus() == null) return false;
        if (other.getTableStatus() != null && other.getTableStatus().equals(this.getTableStatus()) == false) return false; 
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null) return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        if (other.getTableSizeBytes() == null ^ this.getTableSizeBytes() == null) return false;
        if (other.getTableSizeBytes() != null && other.getTableSizeBytes().equals(this.getTableSizeBytes()) == false) return false; 
        if (other.getItemCount() == null ^ this.getItemCount() == null) return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false) return false; 
        return true;
    }
    
}
    