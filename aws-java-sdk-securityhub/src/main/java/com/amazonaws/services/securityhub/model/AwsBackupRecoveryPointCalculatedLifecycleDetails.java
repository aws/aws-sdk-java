/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies how long in days before a recovery point transitions to cold storage or is deleted.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupRecoveryPointCalculatedLifecycleDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupRecoveryPointCalculatedLifecycleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     */
    private String deleteAt;
    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     */
    private String moveToColdStorageAt;

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * 
     * @param deleteAt
     *        Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days
     *        plus <code>MoveToColdStorageAfterDays</code>.
     */

    public void setDeleteAt(String deleteAt) {
        this.deleteAt = deleteAt;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * 
     * @return Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90
     *         days plus <code>MoveToColdStorageAfterDays</code>.
     */

    public String getDeleteAt() {
        return this.deleteAt;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus
     * <code>MoveToColdStorageAfterDays</code>.
     * </p>
     * 
     * @param deleteAt
     *        Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days
     *        plus <code>MoveToColdStorageAfterDays</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointCalculatedLifecycleDetails withDeleteAt(String deleteAt) {
        setDeleteAt(deleteAt);
        return this;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     * 
     * @param moveToColdStorageAt
     *        Specifies the number of days after creation that a recovery point is moved to cold storage.
     */

    public void setMoveToColdStorageAt(String moveToColdStorageAt) {
        this.moveToColdStorageAt = moveToColdStorageAt;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     * 
     * @return Specifies the number of days after creation that a recovery point is moved to cold storage.
     */

    public String getMoveToColdStorageAt() {
        return this.moveToColdStorageAt;
    }

    /**
     * <p>
     * Specifies the number of days after creation that a recovery point is moved to cold storage.
     * </p>
     * 
     * @param moveToColdStorageAt
     *        Specifies the number of days after creation that a recovery point is moved to cold storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointCalculatedLifecycleDetails withMoveToColdStorageAt(String moveToColdStorageAt) {
        setMoveToColdStorageAt(moveToColdStorageAt);
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
        if (getDeleteAt() != null)
            sb.append("DeleteAt: ").append(getDeleteAt()).append(",");
        if (getMoveToColdStorageAt() != null)
            sb.append("MoveToColdStorageAt: ").append(getMoveToColdStorageAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupRecoveryPointCalculatedLifecycleDetails == false)
            return false;
        AwsBackupRecoveryPointCalculatedLifecycleDetails other = (AwsBackupRecoveryPointCalculatedLifecycleDetails) obj;
        if (other.getDeleteAt() == null ^ this.getDeleteAt() == null)
            return false;
        if (other.getDeleteAt() != null && other.getDeleteAt().equals(this.getDeleteAt()) == false)
            return false;
        if (other.getMoveToColdStorageAt() == null ^ this.getMoveToColdStorageAt() == null)
            return false;
        if (other.getMoveToColdStorageAt() != null && other.getMoveToColdStorageAt().equals(this.getMoveToColdStorageAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteAt() == null) ? 0 : getDeleteAt().hashCode());
        hashCode = prime * hashCode + ((getMoveToColdStorageAt() == null) ? 0 : getMoveToColdStorageAt().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupRecoveryPointCalculatedLifecycleDetails clone() {
        try {
            return (AwsBackupRecoveryPointCalculatedLifecycleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupRecoveryPointCalculatedLifecycleDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
