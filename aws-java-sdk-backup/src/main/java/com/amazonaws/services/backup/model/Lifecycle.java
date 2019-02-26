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
 * Contains an array of <code>Transition</code> objects specifying how long in days before a recovery point transitions
 * to cold storage or is deleted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/Lifecycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Lifecycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     */
    private Long moveToColdStorageAfterDays;
    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     */
    private Long deleteAfterDays;

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     * 
     * @param moveToColdStorageAfterDays
     *        Specifies the number of days after creation that a recovery point is moved to cold storage.
     */

    public void setMoveToColdStorageAfterDays(Long moveToColdStorageAfterDays) {
        this.moveToColdStorageAfterDays = moveToColdStorageAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     * 
     * @return Specifies the number of days after creation that a recovery point is moved to cold storage.
     */

    public Long getMoveToColdStorageAfterDays() {
        return this.moveToColdStorageAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     * 
     * @param moveToColdStorageAfterDays
     *        Specifies the number of days after creation that a recovery point is moved to cold storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lifecycle withMoveToColdStorageAfterDays(Long moveToColdStorageAfterDays) {
        setMoveToColdStorageAfterDays(moveToColdStorageAfterDays);
        return this;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * 
     * @param deleteAfterDays
     *        Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     *        <code>MoveToColdStorageAfterDays</code>.
     */

    public void setDeleteAfterDays(Long deleteAfterDays) {
        this.deleteAfterDays = deleteAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * 
     * @return Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     *         <code>MoveToColdStorageAfterDays</code>.
     */

    public Long getDeleteAfterDays() {
        return this.deleteAfterDays;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * 
     * @param deleteAfterDays
     *        Specifies the number of days after creation that a recovery point is deleted. Must be greater than
     *        <code>MoveToColdStorageAfterDays</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lifecycle withDeleteAfterDays(Long deleteAfterDays) {
        setDeleteAfterDays(deleteAfterDays);
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
        if (getMoveToColdStorageAfterDays() != null)
            sb.append("MoveToColdStorageAfterDays: ").append(getMoveToColdStorageAfterDays()).append(",");
        if (getDeleteAfterDays() != null)
            sb.append("DeleteAfterDays: ").append(getDeleteAfterDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Lifecycle == false)
            return false;
        Lifecycle other = (Lifecycle) obj;
        if (other.getMoveToColdStorageAfterDays() == null ^ this.getMoveToColdStorageAfterDays() == null)
            return false;
        if (other.getMoveToColdStorageAfterDays() != null && other.getMoveToColdStorageAfterDays().equals(this.getMoveToColdStorageAfterDays()) == false)
            return false;
        if (other.getDeleteAfterDays() == null ^ this.getDeleteAfterDays() == null)
            return false;
        if (other.getDeleteAfterDays() != null && other.getDeleteAfterDays().equals(this.getDeleteAfterDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMoveToColdStorageAfterDays() == null) ? 0 : getMoveToColdStorageAfterDays().hashCode());
        hashCode = prime * hashCode + ((getDeleteAfterDays() == null) ? 0 : getDeleteAfterDays().hashCode());
        return hashCode;
    }

    @Override
    public Lifecycle clone() {
        try {
            return (Lifecycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.LifecycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
