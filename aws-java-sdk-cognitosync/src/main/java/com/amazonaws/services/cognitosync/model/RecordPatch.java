/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * An update operation for a record.
 * </p>
 */
public class RecordPatch implements Serializable {

    /**
     * An operation, either replace or remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replace, remove
     */
    private String op;

    /**
     * The key associated with the record patch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String key;

    /**
     * The value associated with the record patch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048575<br/>
     */
    private String value;

    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     */
    private Long syncCount;

    /**
     * The last modified date of the client device.
     */
    private java.util.Date deviceLastModifiedDate;

    /**
     * An operation, either replace or remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replace, remove
     *
     * @return An operation, either replace or remove.
     *
     * @see Operation
     */
    public String getOp() {
        return op;
    }
    
    /**
     * An operation, either replace or remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replace, remove
     *
     * @param op An operation, either replace or remove.
     *
     * @see Operation
     */
    public void setOp(String op) {
        this.op = op;
    }
    
    /**
     * An operation, either replace or remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replace, remove
     *
     * @param op An operation, either replace or remove.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Operation
     */
    public RecordPatch withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * An operation, either replace or remove.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replace, remove
     *
     * @param op An operation, either replace or remove.
     *
     * @see Operation
     */
    public void setOp(Operation op) {
        this.op = op.toString();
    }
    
    /**
     * An operation, either replace or remove.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>replace, remove
     *
     * @param op An operation, either replace or remove.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Operation
     */
    public RecordPatch withOp(Operation op) {
        this.op = op.toString();
        return this;
    }

    /**
     * The key associated with the record patch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The key associated with the record patch.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The key associated with the record patch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param key The key associated with the record patch.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The key associated with the record patch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param key The key associated with the record patch.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordPatch withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The value associated with the record patch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048575<br/>
     *
     * @return The value associated with the record patch.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value associated with the record patch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048575<br/>
     *
     * @param value The value associated with the record patch.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value associated with the record patch.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1048575<br/>
     *
     * @param value The value associated with the record patch.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordPatch withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     *
     * @return Last known server sync count for this record. Set to 0 if unknown.
     */
    public Long getSyncCount() {
        return syncCount;
    }
    
    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     *
     * @param syncCount Last known server sync count for this record. Set to 0 if unknown.
     */
    public void setSyncCount(Long syncCount) {
        this.syncCount = syncCount;
    }
    
    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param syncCount Last known server sync count for this record. Set to 0 if unknown.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordPatch withSyncCount(Long syncCount) {
        this.syncCount = syncCount;
        return this;
    }

    /**
     * The last modified date of the client device.
     *
     * @return The last modified date of the client device.
     */
    public java.util.Date getDeviceLastModifiedDate() {
        return deviceLastModifiedDate;
    }
    
    /**
     * The last modified date of the client device.
     *
     * @param deviceLastModifiedDate The last modified date of the client device.
     */
    public void setDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
    }
    
    /**
     * The last modified date of the client device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceLastModifiedDate The last modified date of the client device.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordPatch withDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
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
        if (getOp() != null) sb.append("Op: " + getOp() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getSyncCount() != null) sb.append("SyncCount: " + getSyncCount() + ",");
        if (getDeviceLastModifiedDate() != null) sb.append("DeviceLastModifiedDate: " + getDeviceLastModifiedDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOp() == null) ? 0 : getOp().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getSyncCount() == null) ? 0 : getSyncCount().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceLastModifiedDate() == null) ? 0 : getDeviceLastModifiedDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecordPatch == false) return false;
        RecordPatch other = (RecordPatch)obj;
        
        if (other.getOp() == null ^ this.getOp() == null) return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getSyncCount() == null ^ this.getSyncCount() == null) return false;
        if (other.getSyncCount() != null && other.getSyncCount().equals(this.getSyncCount()) == false) return false; 
        if (other.getDeviceLastModifiedDate() == null ^ this.getDeviceLastModifiedDate() == null) return false;
        if (other.getDeviceLastModifiedDate() != null && other.getDeviceLastModifiedDate().equals(this.getDeviceLastModifiedDate()) == false) return false; 
        return true;
    }
    
}
    