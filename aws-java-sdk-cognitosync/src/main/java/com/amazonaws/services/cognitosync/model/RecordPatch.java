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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An update operation for a record.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/RecordPatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordPatch implements Serializable, Cloneable, StructuredPojo {

    /** An operation, either replace or remove. */
    private String op;
    /** The key associated with the record patch. */
    private String key;
    /** The value associated with the record patch. */
    private String value;
    /** Last known server sync count for this record. Set to 0 if unknown. */
    private Long syncCount;
    /** The last modified date of the client device. */
    private java.util.Date deviceLastModifiedDate;

    /**
     * An operation, either replace or remove.
     * 
     * @param op
     *        An operation, either replace or remove.
     * @see Operation
     */

    public void setOp(String op) {
        this.op = op;
    }

    /**
     * An operation, either replace or remove.
     * 
     * @return An operation, either replace or remove.
     * @see Operation
     */

    public String getOp() {
        return this.op;
    }

    /**
     * An operation, either replace or remove.
     * 
     * @param op
     *        An operation, either replace or remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public RecordPatch withOp(String op) {
        setOp(op);
        return this;
    }

    /**
     * An operation, either replace or remove.
     * 
     * @param op
     *        An operation, either replace or remove.
     * @see Operation
     */

    public void setOp(Operation op) {
        withOp(op);
    }

    /**
     * An operation, either replace or remove.
     * 
     * @param op
     *        An operation, either replace or remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public RecordPatch withOp(Operation op) {
        this.op = op.toString();
        return this;
    }

    /**
     * The key associated with the record patch.
     * 
     * @param key
     *        The key associated with the record patch.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The key associated with the record patch.
     * 
     * @return The key associated with the record patch.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * The key associated with the record patch.
     * 
     * @param key
     *        The key associated with the record patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordPatch withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * The value associated with the record patch.
     * 
     * @param value
     *        The value associated with the record patch.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The value associated with the record patch.
     * 
     * @return The value associated with the record patch.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * The value associated with the record patch.
     * 
     * @param value
     *        The value associated with the record patch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordPatch withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     * 
     * @param syncCount
     *        Last known server sync count for this record. Set to 0 if unknown.
     */

    public void setSyncCount(Long syncCount) {
        this.syncCount = syncCount;
    }

    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     * 
     * @return Last known server sync count for this record. Set to 0 if unknown.
     */

    public Long getSyncCount() {
        return this.syncCount;
    }

    /**
     * Last known server sync count for this record. Set to 0 if unknown.
     * 
     * @param syncCount
     *        Last known server sync count for this record. Set to 0 if unknown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordPatch withSyncCount(Long syncCount) {
        setSyncCount(syncCount);
        return this;
    }

    /**
     * The last modified date of the client device.
     * 
     * @param deviceLastModifiedDate
     *        The last modified date of the client device.
     */

    public void setDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        this.deviceLastModifiedDate = deviceLastModifiedDate;
    }

    /**
     * The last modified date of the client device.
     * 
     * @return The last modified date of the client device.
     */

    public java.util.Date getDeviceLastModifiedDate() {
        return this.deviceLastModifiedDate;
    }

    /**
     * The last modified date of the client device.
     * 
     * @param deviceLastModifiedDate
     *        The last modified date of the client device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordPatch withDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
        setDeviceLastModifiedDate(deviceLastModifiedDate);
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
        if (getOp() != null)
            sb.append("Op: ").append(getOp()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSyncCount() != null)
            sb.append("SyncCount: ").append(getSyncCount()).append(",");
        if (getDeviceLastModifiedDate() != null)
            sb.append("DeviceLastModifiedDate: ").append(getDeviceLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordPatch == false)
            return false;
        RecordPatch other = (RecordPatch) obj;
        if (other.getOp() == null ^ this.getOp() == null)
            return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSyncCount() == null ^ this.getSyncCount() == null)
            return false;
        if (other.getSyncCount() != null && other.getSyncCount().equals(this.getSyncCount()) == false)
            return false;
        if (other.getDeviceLastModifiedDate() == null ^ this.getDeviceLastModifiedDate() == null)
            return false;
        if (other.getDeviceLastModifiedDate() != null && other.getDeviceLastModifiedDate().equals(this.getDeviceLastModifiedDate()) == false)
            return false;
        return true;
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
    public RecordPatch clone() {
        try {
            return (RecordPatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitosync.model.transform.RecordPatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
