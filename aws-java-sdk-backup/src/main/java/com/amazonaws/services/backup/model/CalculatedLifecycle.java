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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains <code>DeleteAt</code> and <code>MoveToColdStorageAt</code> timestamps, which are used to specify a lifecycle
 * for a recovery point.
 * </p>
 * <p>
 * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
 * transitions and expires backups automatically according to the lifecycle that you define.
 * </p>
 * <p>
 * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire
 * after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold
 * after days” setting cannot be changed after a backup has been transitioned to cold.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CalculatedLifecycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CalculatedLifecycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp that specifies when to transition a recovery point to cold storage.
     * </p>
     */
    private java.util.Date moveToColdStorageAt;
    /**
     * <p>
     * A timestamp that specifies when to delete a recovery point.
     * </p>
     */
    private java.util.Date deleteAt;

    /**
     * <p>
     * A timestamp that specifies when to transition a recovery point to cold storage.
     * </p>
     * 
     * @param moveToColdStorageAt
     *        A timestamp that specifies when to transition a recovery point to cold storage.
     */

    public void setMoveToColdStorageAt(java.util.Date moveToColdStorageAt) {
        this.moveToColdStorageAt = moveToColdStorageAt;
    }

    /**
     * <p>
     * A timestamp that specifies when to transition a recovery point to cold storage.
     * </p>
     * 
     * @return A timestamp that specifies when to transition a recovery point to cold storage.
     */

    public java.util.Date getMoveToColdStorageAt() {
        return this.moveToColdStorageAt;
    }

    /**
     * <p>
     * A timestamp that specifies when to transition a recovery point to cold storage.
     * </p>
     * 
     * @param moveToColdStorageAt
     *        A timestamp that specifies when to transition a recovery point to cold storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedLifecycle withMoveToColdStorageAt(java.util.Date moveToColdStorageAt) {
        setMoveToColdStorageAt(moveToColdStorageAt);
        return this;
    }

    /**
     * <p>
     * A timestamp that specifies when to delete a recovery point.
     * </p>
     * 
     * @param deleteAt
     *        A timestamp that specifies when to delete a recovery point.
     */

    public void setDeleteAt(java.util.Date deleteAt) {
        this.deleteAt = deleteAt;
    }

    /**
     * <p>
     * A timestamp that specifies when to delete a recovery point.
     * </p>
     * 
     * @return A timestamp that specifies when to delete a recovery point.
     */

    public java.util.Date getDeleteAt() {
        return this.deleteAt;
    }

    /**
     * <p>
     * A timestamp that specifies when to delete a recovery point.
     * </p>
     * 
     * @param deleteAt
     *        A timestamp that specifies when to delete a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CalculatedLifecycle withDeleteAt(java.util.Date deleteAt) {
        setDeleteAt(deleteAt);
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
        if (getMoveToColdStorageAt() != null)
            sb.append("MoveToColdStorageAt: ").append(getMoveToColdStorageAt()).append(",");
        if (getDeleteAt() != null)
            sb.append("DeleteAt: ").append(getDeleteAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CalculatedLifecycle == false)
            return false;
        CalculatedLifecycle other = (CalculatedLifecycle) obj;
        if (other.getMoveToColdStorageAt() == null ^ this.getMoveToColdStorageAt() == null)
            return false;
        if (other.getMoveToColdStorageAt() != null && other.getMoveToColdStorageAt().equals(this.getMoveToColdStorageAt()) == false)
            return false;
        if (other.getDeleteAt() == null ^ this.getDeleteAt() == null)
            return false;
        if (other.getDeleteAt() != null && other.getDeleteAt().equals(this.getDeleteAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMoveToColdStorageAt() == null) ? 0 : getMoveToColdStorageAt().hashCode());
        hashCode = prime * hashCode + ((getDeleteAt() == null) ? 0 : getDeleteAt().hashCode());
        return hashCode;
    }

    @Override
    public CalculatedLifecycle clone() {
        try {
            return (CalculatedLifecycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.CalculatedLifecycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
