/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a locked snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LockedSnapshotsInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LockedSnapshotsInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The state of the snapshot lock. Valid states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within the
     * cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be modified
     * by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it can be
     * unlocked and the lock settings can be modified by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has expired. The
     * snapshot can't be unlocked or deleted. The lock duration can only be increased by users with appropriate
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     * expired. The snapshot is not locked and can be deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String lockState;
    /**
     * <p>
     * The period of time for which the snapshot is locked, in days.
     * </p>
     */
    private Integer lockDuration;
    /**
     * <p>
     * The compliance mode cooling-off period, in hours.
     * </p>
     */
    private Integer coolOffPeriod;
    /**
     * <p>
     * The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     */
    private java.util.Date coolOffPeriodExpiresOn;
    /**
     * <p>
     * The date and time at which the snapshot was locked, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     */
    private java.util.Date lockCreatedOn;
    /**
     * <p>
     * The date and time at which the lock duration started, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * ).
     * </p>
     * <p>
     * If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the snapshot
     * enters the <code>completed</code> state.
     * </p>
     */
    private java.util.Date lockDurationStartTime;
    /**
     * <p>
     * The date and time at which the lock will expire, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     */
    private java.util.Date lockExpiresOn;

    /**
     * <p>
     * The account ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @param ownerId
     *        The account ID of the Amazon Web Services account that owns the snapshot.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The account ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @return The account ID of the Amazon Web Services account that owns the snapshot.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The account ID of the Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @param ownerId
     *        The account ID of the Amazon Web Services account that owns the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The state of the snapshot lock. Valid states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within the
     * cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be modified
     * by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it can be
     * unlocked and the lock settings can be modified by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has expired. The
     * snapshot can't be unlocked or deleted. The lock duration can only be increased by users with appropriate
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     * expired. The snapshot is not locked and can be deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The state of the snapshot lock. Valid states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within
     *        the cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be
     *        modified by users with appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it
     *        can be unlocked and the lock settings can be modified by users with appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has
     *        expired. The snapshot can't be unlocked or deleted. The lock duration can only be increased by users with
     *        appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     *        expired. The snapshot is not locked and can be deleted.
     *        </p>
     *        </li>
     * @see LockState
     */

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    /**
     * <p>
     * The state of the snapshot lock. Valid states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within the
     * cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be modified
     * by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it can be
     * unlocked and the lock settings can be modified by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has expired. The
     * snapshot can't be unlocked or deleted. The lock duration can only be increased by users with appropriate
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     * expired. The snapshot is not locked and can be deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the snapshot lock. Valid states include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within
     *         the cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can
     *         be modified by users with appropriate permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but
     *         it can be unlocked and the lock settings can be modified by users with appropriate permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has
     *         expired. The snapshot can't be unlocked or deleted. The lock duration can only be increased by users with
     *         appropriate permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     *         expired. The snapshot is not locked and can be deleted.
     *         </p>
     *         </li>
     * @see LockState
     */

    public String getLockState() {
        return this.lockState;
    }

    /**
     * <p>
     * The state of the snapshot lock. Valid states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within the
     * cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be modified
     * by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it can be
     * unlocked and the lock settings can be modified by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has expired. The
     * snapshot can't be unlocked or deleted. The lock duration can only be increased by users with appropriate
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     * expired. The snapshot is not locked and can be deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The state of the snapshot lock. Valid states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within
     *        the cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be
     *        modified by users with appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it
     *        can be unlocked and the lock settings can be modified by users with appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has
     *        expired. The snapshot can't be unlocked or deleted. The lock duration can only be increased by users with
     *        appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     *        expired. The snapshot is not locked and can be deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public LockedSnapshotsInfo withLockState(String lockState) {
        setLockState(lockState);
        return this;
    }

    /**
     * <p>
     * The state of the snapshot lock. Valid states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within the
     * cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be modified
     * by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it can be
     * unlocked and the lock settings can be modified by users with appropriate permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has expired. The
     * snapshot can't be unlocked or deleted. The lock duration can only be increased by users with appropriate
     * permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     * expired. The snapshot is not locked and can be deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The state of the snapshot lock. Valid states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>compliance-cooloff</code> - The snapshot has been locked in compliance mode but it is still within
     *        the cooling-off period. The snapshot can't be deleted, but it can be unlocked and the lock settings can be
     *        modified by users with appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>governance</code> - The snapshot is locked in governance mode. The snapshot can't be deleted, but it
     *        can be unlocked and the lock settings can be modified by users with appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compliance</code> - The snapshot is locked in compliance mode and the cooling-off period has
     *        expired. The snapshot can't be unlocked or deleted. The lock duration can only be increased by users with
     *        appropriate permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>expired</code> - The snapshot was locked in compliance or governance mode but the lock duration has
     *        expired. The snapshot is not locked and can be deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public LockedSnapshotsInfo withLockState(LockState lockState) {
        this.lockState = lockState.toString();
        return this;
    }

    /**
     * <p>
     * The period of time for which the snapshot is locked, in days.
     * </p>
     * 
     * @param lockDuration
     *        The period of time for which the snapshot is locked, in days.
     */

    public void setLockDuration(Integer lockDuration) {
        this.lockDuration = lockDuration;
    }

    /**
     * <p>
     * The period of time for which the snapshot is locked, in days.
     * </p>
     * 
     * @return The period of time for which the snapshot is locked, in days.
     */

    public Integer getLockDuration() {
        return this.lockDuration;
    }

    /**
     * <p>
     * The period of time for which the snapshot is locked, in days.
     * </p>
     * 
     * @param lockDuration
     *        The period of time for which the snapshot is locked, in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withLockDuration(Integer lockDuration) {
        setLockDuration(lockDuration);
        return this;
    }

    /**
     * <p>
     * The compliance mode cooling-off period, in hours.
     * </p>
     * 
     * @param coolOffPeriod
     *        The compliance mode cooling-off period, in hours.
     */

    public void setCoolOffPeriod(Integer coolOffPeriod) {
        this.coolOffPeriod = coolOffPeriod;
    }

    /**
     * <p>
     * The compliance mode cooling-off period, in hours.
     * </p>
     * 
     * @return The compliance mode cooling-off period, in hours.
     */

    public Integer getCoolOffPeriod() {
        return this.coolOffPeriod;
    }

    /**
     * <p>
     * The compliance mode cooling-off period, in hours.
     * </p>
     * 
     * @param coolOffPeriod
     *        The compliance mode cooling-off period, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withCoolOffPeriod(Integer coolOffPeriod) {
        setCoolOffPeriod(coolOffPeriod);
        return this;
    }

    /**
     * <p>
     * The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @param coolOffPeriodExpiresOn
     *        The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     */

    public void setCoolOffPeriodExpiresOn(java.util.Date coolOffPeriodExpiresOn) {
        this.coolOffPeriodExpiresOn = coolOffPeriodExpiresOn;
    }

    /**
     * <p>
     * The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @return The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     */

    public java.util.Date getCoolOffPeriodExpiresOn() {
        return this.coolOffPeriodExpiresOn;
    }

    /**
     * <p>
     * The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @param coolOffPeriodExpiresOn
     *        The date and time at which the compliance mode cooling-off period expires, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withCoolOffPeriodExpiresOn(java.util.Date coolOffPeriodExpiresOn) {
        setCoolOffPeriodExpiresOn(coolOffPeriodExpiresOn);
        return this;
    }

    /**
     * <p>
     * The date and time at which the snapshot was locked, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @param lockCreatedOn
     *        The date and time at which the snapshot was locked, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     */

    public void setLockCreatedOn(java.util.Date lockCreatedOn) {
        this.lockCreatedOn = lockCreatedOn;
    }

    /**
     * <p>
     * The date and time at which the snapshot was locked, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @return The date and time at which the snapshot was locked, in the UTC time zone (
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     */

    public java.util.Date getLockCreatedOn() {
        return this.lockCreatedOn;
    }

    /**
     * <p>
     * The date and time at which the snapshot was locked, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @param lockCreatedOn
     *        The date and time at which the snapshot was locked, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withLockCreatedOn(java.util.Date lockCreatedOn) {
        setLockCreatedOn(lockCreatedOn);
        return this;
    }

    /**
     * <p>
     * The date and time at which the lock duration started, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * ).
     * </p>
     * <p>
     * If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the snapshot
     * enters the <code>completed</code> state.
     * </p>
     * 
     * @param lockDurationStartTime
     *        The date and time at which the lock duration started, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).</p>
     *        <p>
     *        If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the
     *        snapshot enters the <code>completed</code> state.
     */

    public void setLockDurationStartTime(java.util.Date lockDurationStartTime) {
        this.lockDurationStartTime = lockDurationStartTime;
    }

    /**
     * <p>
     * The date and time at which the lock duration started, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * ).
     * </p>
     * <p>
     * If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the snapshot
     * enters the <code>completed</code> state.
     * </p>
     * 
     * @return The date and time at which the lock duration started, in the UTC time zone (
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).</p>
     *         <p>
     *         If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the
     *         snapshot enters the <code>completed</code> state.
     */

    public java.util.Date getLockDurationStartTime() {
        return this.lockDurationStartTime;
    }

    /**
     * <p>
     * The date and time at which the lock duration started, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * ).
     * </p>
     * <p>
     * If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the snapshot
     * enters the <code>completed</code> state.
     * </p>
     * 
     * @param lockDurationStartTime
     *        The date and time at which the lock duration started, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).</p>
     *        <p>
     *        If you lock a snapshot that is in the <code>pending</code> state, the lock duration starts only once the
     *        snapshot enters the <code>completed</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withLockDurationStartTime(java.util.Date lockDurationStartTime) {
        setLockDurationStartTime(lockDurationStartTime);
        return this;
    }

    /**
     * <p>
     * The date and time at which the lock will expire, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @param lockExpiresOn
     *        The date and time at which the lock will expire, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     */

    public void setLockExpiresOn(java.util.Date lockExpiresOn) {
        this.lockExpiresOn = lockExpiresOn;
    }

    /**
     * <p>
     * The date and time at which the lock will expire, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @return The date and time at which the lock will expire, in the UTC time zone (
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     */

    public java.util.Date getLockExpiresOn() {
        return this.lockExpiresOn;
    }

    /**
     * <p>
     * The date and time at which the lock will expire, in the UTC time zone (<code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * 
     * @param lockExpiresOn
     *        The date and time at which the lock will expire, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockedSnapshotsInfo withLockExpiresOn(java.util.Date lockExpiresOn) {
        setLockExpiresOn(lockExpiresOn);
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
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getLockState() != null)
            sb.append("LockState: ").append(getLockState()).append(",");
        if (getLockDuration() != null)
            sb.append("LockDuration: ").append(getLockDuration()).append(",");
        if (getCoolOffPeriod() != null)
            sb.append("CoolOffPeriod: ").append(getCoolOffPeriod()).append(",");
        if (getCoolOffPeriodExpiresOn() != null)
            sb.append("CoolOffPeriodExpiresOn: ").append(getCoolOffPeriodExpiresOn()).append(",");
        if (getLockCreatedOn() != null)
            sb.append("LockCreatedOn: ").append(getLockCreatedOn()).append(",");
        if (getLockDurationStartTime() != null)
            sb.append("LockDurationStartTime: ").append(getLockDurationStartTime()).append(",");
        if (getLockExpiresOn() != null)
            sb.append("LockExpiresOn: ").append(getLockExpiresOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LockedSnapshotsInfo == false)
            return false;
        LockedSnapshotsInfo other = (LockedSnapshotsInfo) obj;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getLockState() == null ^ this.getLockState() == null)
            return false;
        if (other.getLockState() != null && other.getLockState().equals(this.getLockState()) == false)
            return false;
        if (other.getLockDuration() == null ^ this.getLockDuration() == null)
            return false;
        if (other.getLockDuration() != null && other.getLockDuration().equals(this.getLockDuration()) == false)
            return false;
        if (other.getCoolOffPeriod() == null ^ this.getCoolOffPeriod() == null)
            return false;
        if (other.getCoolOffPeriod() != null && other.getCoolOffPeriod().equals(this.getCoolOffPeriod()) == false)
            return false;
        if (other.getCoolOffPeriodExpiresOn() == null ^ this.getCoolOffPeriodExpiresOn() == null)
            return false;
        if (other.getCoolOffPeriodExpiresOn() != null && other.getCoolOffPeriodExpiresOn().equals(this.getCoolOffPeriodExpiresOn()) == false)
            return false;
        if (other.getLockCreatedOn() == null ^ this.getLockCreatedOn() == null)
            return false;
        if (other.getLockCreatedOn() != null && other.getLockCreatedOn().equals(this.getLockCreatedOn()) == false)
            return false;
        if (other.getLockDurationStartTime() == null ^ this.getLockDurationStartTime() == null)
            return false;
        if (other.getLockDurationStartTime() != null && other.getLockDurationStartTime().equals(this.getLockDurationStartTime()) == false)
            return false;
        if (other.getLockExpiresOn() == null ^ this.getLockExpiresOn() == null)
            return false;
        if (other.getLockExpiresOn() != null && other.getLockExpiresOn().equals(this.getLockExpiresOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getLockState() == null) ? 0 : getLockState().hashCode());
        hashCode = prime * hashCode + ((getLockDuration() == null) ? 0 : getLockDuration().hashCode());
        hashCode = prime * hashCode + ((getCoolOffPeriod() == null) ? 0 : getCoolOffPeriod().hashCode());
        hashCode = prime * hashCode + ((getCoolOffPeriodExpiresOn() == null) ? 0 : getCoolOffPeriodExpiresOn().hashCode());
        hashCode = prime * hashCode + ((getLockCreatedOn() == null) ? 0 : getLockCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLockDurationStartTime() == null) ? 0 : getLockDurationStartTime().hashCode());
        hashCode = prime * hashCode + ((getLockExpiresOn() == null) ? 0 : getLockExpiresOn().hashCode());
        return hashCode;
    }

    @Override
    public LockedSnapshotsInfo clone() {
        try {
            return (LockedSnapshotsInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
