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
 * The basic data structure of a dataset.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/Record" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Record implements Serializable, Cloneable, StructuredPojo {

    /** The key for the record. */
    private String key;
    /** The value for the record. */
    private String value;
    /** The server sync count for this record. */
    private Long syncCount;
    /** The date on which the record was last modified. */
    private java.util.Date lastModifiedDate;
    /** The user/device that made the last change to this record. */
    private String lastModifiedBy;
    /** The last modified date of the client device. */
    private java.util.Date deviceLastModifiedDate;

    /**
     * The key for the record.
     * 
     * @param key
     *        The key for the record.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The key for the record.
     * 
     * @return The key for the record.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * The key for the record.
     * 
     * @param key
     *        The key for the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * The value for the record.
     * 
     * @param value
     *        The value for the record.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The value for the record.
     * 
     * @return The value for the record.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * The value for the record.
     * 
     * @param value
     *        The value for the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * The server sync count for this record.
     * 
     * @param syncCount
     *        The server sync count for this record.
     */

    public void setSyncCount(Long syncCount) {
        this.syncCount = syncCount;
    }

    /**
     * The server sync count for this record.
     * 
     * @return The server sync count for this record.
     */

    public Long getSyncCount() {
        return this.syncCount;
    }

    /**
     * The server sync count for this record.
     * 
     * @param syncCount
     *        The server sync count for this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withSyncCount(Long syncCount) {
        setSyncCount(syncCount);
        return this;
    }

    /**
     * The date on which the record was last modified.
     * 
     * @param lastModifiedDate
     *        The date on which the record was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date on which the record was last modified.
     * 
     * @return The date on which the record was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date on which the record was last modified.
     * 
     * @param lastModifiedDate
     *        The date on which the record was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The user/device that made the last change to this record.
     * 
     * @param lastModifiedBy
     *        The user/device that made the last change to this record.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * The user/device that made the last change to this record.
     * 
     * @return The user/device that made the last change to this record.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * The user/device that made the last change to this record.
     * 
     * @param lastModifiedBy
     *        The user/device that made the last change to this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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

    public Record withDeviceLastModifiedDate(java.util.Date deviceLastModifiedDate) {
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSyncCount() != null)
            sb.append("SyncCount: ").append(getSyncCount()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
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

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
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
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
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

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSyncCount() == null) ? 0 : getSyncCount().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getDeviceLastModifiedDate() == null) ? 0 : getDeviceLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitosync.model.transform.RecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
