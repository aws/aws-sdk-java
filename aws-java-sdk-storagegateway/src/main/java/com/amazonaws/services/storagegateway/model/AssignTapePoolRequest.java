/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AssignTapePool" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignTapePoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     */
    private String tapeARN;
    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * Set permissions to bypass governance retention. If the lock type of the archived tape is <code>Governance</code>,
     * the tape's archived age is not older than <code>RetentionLockInDays</code>, and the user does not already have
     * <code>BypassGovernanceRetention</code>, setting this to TRUE enables the user to bypass the retention lock. This
     * parameter is set to true by default for calls from the console.
     * </p>
     * <p>
     * Valid values: <code>TRUE</code> | <code>FALSE</code>
     * </p>
     */
    private Boolean bypassGovernanceRetention;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     * 
     * @param tapeARN
     *        The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * </p>
     * 
     * @param tapeARN
     *        The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignTapePoolRequest withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     *        corresponds to the pool.</p>
     *        <p>
     *        Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @return The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *         the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *         tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     *         corresponds to the pool.</p>
     *         <p>
     *         Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3
     * storage class that is associated with the pool. When you use your backup application to eject the tape, the tape
     * is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * 
     * @param poolId
     *        The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in
     *        the S3 storage class that is associated with the pool. When you use your backup application to eject the
     *        tape, the tape is archived directly into the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     *        corresponds to the pool.</p>
     *        <p>
     *        Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignTapePoolRequest withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * Set permissions to bypass governance retention. If the lock type of the archived tape is <code>Governance</code>,
     * the tape's archived age is not older than <code>RetentionLockInDays</code>, and the user does not already have
     * <code>BypassGovernanceRetention</code>, setting this to TRUE enables the user to bypass the retention lock. This
     * parameter is set to true by default for calls from the console.
     * </p>
     * <p>
     * Valid values: <code>TRUE</code> | <code>FALSE</code>
     * </p>
     * 
     * @param bypassGovernanceRetention
     *        Set permissions to bypass governance retention. If the lock type of the archived tape is
     *        <code>Governance</code>, the tape's archived age is not older than <code>RetentionLockInDays</code>, and
     *        the user does not already have <code>BypassGovernanceRetention</code>, setting this to TRUE enables the
     *        user to bypass the retention lock. This parameter is set to true by default for calls from the
     *        console.</p>
     *        <p>
     *        Valid values: <code>TRUE</code> | <code>FALSE</code>
     */

    public void setBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
    }

    /**
     * <p>
     * Set permissions to bypass governance retention. If the lock type of the archived tape is <code>Governance</code>,
     * the tape's archived age is not older than <code>RetentionLockInDays</code>, and the user does not already have
     * <code>BypassGovernanceRetention</code>, setting this to TRUE enables the user to bypass the retention lock. This
     * parameter is set to true by default for calls from the console.
     * </p>
     * <p>
     * Valid values: <code>TRUE</code> | <code>FALSE</code>
     * </p>
     * 
     * @return Set permissions to bypass governance retention. If the lock type of the archived tape is
     *         <code>Governance</code>, the tape's archived age is not older than <code>RetentionLockInDays</code>, and
     *         the user does not already have <code>BypassGovernanceRetention</code>, setting this to TRUE enables the
     *         user to bypass the retention lock. This parameter is set to true by default for calls from the
     *         console.</p>
     *         <p>
     *         Valid values: <code>TRUE</code> | <code>FALSE</code>
     */

    public Boolean getBypassGovernanceRetention() {
        return this.bypassGovernanceRetention;
    }

    /**
     * <p>
     * Set permissions to bypass governance retention. If the lock type of the archived tape is <code>Governance</code>,
     * the tape's archived age is not older than <code>RetentionLockInDays</code>, and the user does not already have
     * <code>BypassGovernanceRetention</code>, setting this to TRUE enables the user to bypass the retention lock. This
     * parameter is set to true by default for calls from the console.
     * </p>
     * <p>
     * Valid values: <code>TRUE</code> | <code>FALSE</code>
     * </p>
     * 
     * @param bypassGovernanceRetention
     *        Set permissions to bypass governance retention. If the lock type of the archived tape is
     *        <code>Governance</code>, the tape's archived age is not older than <code>RetentionLockInDays</code>, and
     *        the user does not already have <code>BypassGovernanceRetention</code>, setting this to TRUE enables the
     *        user to bypass the retention lock. This parameter is set to true by default for calls from the
     *        console.</p>
     *        <p>
     *        Valid values: <code>TRUE</code> | <code>FALSE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignTapePoolRequest withBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        setBypassGovernanceRetention(bypassGovernanceRetention);
        return this;
    }

    /**
     * <p>
     * Set permissions to bypass governance retention. If the lock type of the archived tape is <code>Governance</code>,
     * the tape's archived age is not older than <code>RetentionLockInDays</code>, and the user does not already have
     * <code>BypassGovernanceRetention</code>, setting this to TRUE enables the user to bypass the retention lock. This
     * parameter is set to true by default for calls from the console.
     * </p>
     * <p>
     * Valid values: <code>TRUE</code> | <code>FALSE</code>
     * </p>
     * 
     * @return Set permissions to bypass governance retention. If the lock type of the archived tape is
     *         <code>Governance</code>, the tape's archived age is not older than <code>RetentionLockInDays</code>, and
     *         the user does not already have <code>BypassGovernanceRetention</code>, setting this to TRUE enables the
     *         user to bypass the retention lock. This parameter is set to true by default for calls from the
     *         console.</p>
     *         <p>
     *         Valid values: <code>TRUE</code> | <code>FALSE</code>
     */

    public Boolean isBypassGovernanceRetention() {
        return this.bypassGovernanceRetention;
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getBypassGovernanceRetention() != null)
            sb.append("BypassGovernanceRetention: ").append(getBypassGovernanceRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignTapePoolRequest == false)
            return false;
        AssignTapePoolRequest other = (AssignTapePoolRequest) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getBypassGovernanceRetention() == null ^ this.getBypassGovernanceRetention() == null)
            return false;
        if (other.getBypassGovernanceRetention() != null && other.getBypassGovernanceRetention().equals(this.getBypassGovernanceRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getBypassGovernanceRetention() == null) ? 0 : getBypassGovernanceRetention().hashCode());
        return hashCode;
    }

    @Override
    public AssignTapePoolRequest clone() {
        return (AssignTapePoolRequest) super.clone();
    }

}
