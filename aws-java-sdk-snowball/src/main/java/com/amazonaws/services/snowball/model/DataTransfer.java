/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * Defines the real-time status of a Snowball's data transfer while the appliance is at AWS. This data is only available
 * while a job has a <code>JobState</code> value of <code>InProgress</code>, for both import and export jobs.
 * </p>
 */
public class DataTransfer implements Serializable, Cloneable {

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     */
    private Long bytesTransferred;
    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     */
    private Long objectsTransferred;
    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all
     * the keys that will be transferred have been listed.
     * </p>
     */
    private Long totalBytes;
    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until
     * all the keys that will be transferred have been listed.
     * </p>
     */
    private Long totalObjects;

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     * 
     * @param bytesTransferred
     *        The number of bytes transferred between a Snowball and Amazon S3.
     */

    public void setBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     * 
     * @return The number of bytes transferred between a Snowball and Amazon S3.
     */

    public Long getBytesTransferred() {
        return this.bytesTransferred;
    }

    /**
     * <p>
     * The number of bytes transferred between a Snowball and Amazon S3.
     * </p>
     * 
     * @param bytesTransferred
     *        The number of bytes transferred between a Snowball and Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransfer withBytesTransferred(Long bytesTransferred) {
        setBytesTransferred(bytesTransferred);
        return this;
    }

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     * 
     * @param objectsTransferred
     *        The number of objects transferred between a Snowball and Amazon S3.
     */

    public void setObjectsTransferred(Long objectsTransferred) {
        this.objectsTransferred = objectsTransferred;
    }

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     * 
     * @return The number of objects transferred between a Snowball and Amazon S3.
     */

    public Long getObjectsTransferred() {
        return this.objectsTransferred;
    }

    /**
     * <p>
     * The number of objects transferred between a Snowball and Amazon S3.
     * </p>
     * 
     * @param objectsTransferred
     *        The number of objects transferred between a Snowball and Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransfer withObjectsTransferred(Long objectsTransferred) {
        setObjectsTransferred(objectsTransferred);
        return this;
    }

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all
     * the keys that will be transferred have been listed.
     * </p>
     * 
     * @param totalBytes
     *        The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero)
     *        until all the keys that will be transferred have been listed.
     */

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all
     * the keys that will be transferred have been listed.
     * </p>
     * 
     * @return The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero)
     *         until all the keys that will be transferred have been listed.
     */

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    /**
     * <p>
     * The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until all
     * the keys that will be transferred have been listed.
     * </p>
     * 
     * @param totalBytes
     *        The total bytes of data for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero)
     *        until all the keys that will be transferred have been listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransfer withTotalBytes(Long totalBytes) {
        setTotalBytes(totalBytes);
        return this;
    }

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until
     * all the keys that will be transferred have been listed.
     * </p>
     * 
     * @param totalObjects
     *        The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero)
     *        until all the keys that will be transferred have been listed.
     */

    public void setTotalObjects(Long totalObjects) {
        this.totalObjects = totalObjects;
    }

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until
     * all the keys that will be transferred have been listed.
     * </p>
     * 
     * @return The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0
     *         (zero) until all the keys that will be transferred have been listed.
     */

    public Long getTotalObjects() {
        return this.totalObjects;
    }

    /**
     * <p>
     * The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero) until
     * all the keys that will be transferred have been listed.
     * </p>
     * 
     * @param totalObjects
     *        The total number of objects for a transfer between a Snowball and Amazon S3. This value is set to 0 (zero)
     *        until all the keys that will be transferred have been listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataTransfer withTotalObjects(Long totalObjects) {
        setTotalObjects(totalObjects);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBytesTransferred() != null)
            sb.append("BytesTransferred: " + getBytesTransferred() + ",");
        if (getObjectsTransferred() != null)
            sb.append("ObjectsTransferred: " + getObjectsTransferred() + ",");
        if (getTotalBytes() != null)
            sb.append("TotalBytes: " + getTotalBytes() + ",");
        if (getTotalObjects() != null)
            sb.append("TotalObjects: " + getTotalObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataTransfer == false)
            return false;
        DataTransfer other = (DataTransfer) obj;
        if (other.getBytesTransferred() == null ^ this.getBytesTransferred() == null)
            return false;
        if (other.getBytesTransferred() != null && other.getBytesTransferred().equals(this.getBytesTransferred()) == false)
            return false;
        if (other.getObjectsTransferred() == null ^ this.getObjectsTransferred() == null)
            return false;
        if (other.getObjectsTransferred() != null && other.getObjectsTransferred().equals(this.getObjectsTransferred()) == false)
            return false;
        if (other.getTotalBytes() == null ^ this.getTotalBytes() == null)
            return false;
        if (other.getTotalBytes() != null && other.getTotalBytes().equals(this.getTotalBytes()) == false)
            return false;
        if (other.getTotalObjects() == null ^ this.getTotalObjects() == null)
            return false;
        if (other.getTotalObjects() != null && other.getTotalObjects().equals(this.getTotalObjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBytesTransferred() == null) ? 0 : getBytesTransferred().hashCode());
        hashCode = prime * hashCode + ((getObjectsTransferred() == null) ? 0 : getObjectsTransferred().hashCode());
        hashCode = prime * hashCode + ((getTotalBytes() == null) ? 0 : getTotalBytes().hashCode());
        hashCode = prime * hashCode + ((getTotalObjects() == null) ? 0 : getTotalObjects().hashCode());
        return hashCode;
    }

    @Override
    public DataTransfer clone() {
        try {
            return (DataTransfer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
