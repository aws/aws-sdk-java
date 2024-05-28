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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.LockSnapshotRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LockSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<LockSnapshotRequest> {

    /**
     * <p>
     * The ID of the snapshot to lock.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The mode in which to lock the snapshot. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't be
     * deleted until one of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The lock duration expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot is unlocked by a user with the appropriate permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock duration, and
     * change the lock mode to <code>compliance</code> at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't be
     * unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease the lock
     * duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM permissions can
     * increase the lock duration at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     * </p>
     * </li>
     * </ul>
     */
    private String lockMode;
    /**
     * <p>
     * The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking the
     * snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or delete the
     * snapshot, decrease the lock duration, or change the lock mode. You can increase the lock duration after the
     * cooling-off period expires.
     * </p>
     * <p>
     * The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the snapshot in
     * governance mode, omit this parameter.
     * </p>
     * <p>
     * To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     * </p>
     * <p>
     * If you are extending the lock duration for a snapshot that is locked in compliance mode after the cooling-off
     * period has expired, omit this parameter. If you specify a cooling-period in a such a request, the request fails.
     * </p>
     * <p>
     * Allowed values: Min 1, max 72.
     * </p>
     */
    private Integer coolOffPeriod;
    /**
     * <p>
     * The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire after
     * this period lapses.
     * </p>
     * <p>
     * You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     * </p>
     * <p>
     * Allowed values: Min: 1, max 36500
     * </p>
     */
    private Integer lockDuration;
    /**
     * <p>
     * The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * <p>
     * You must specify either this parameter or <b>LockDuration</b>, but not both.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * The ID of the snapshot to lock.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot to lock.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot to lock.
     * </p>
     * 
     * @return The ID of the snapshot to lock.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot to lock.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot to lock.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockSnapshotRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The mode in which to lock the snapshot. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't be
     * deleted until one of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The lock duration expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot is unlocked by a user with the appropriate permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock duration, and
     * change the lock mode to <code>compliance</code> at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't be
     * unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease the lock
     * duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM permissions can
     * increase the lock duration at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockMode
     *        The mode in which to lock the snapshot. Specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't
     *        be deleted until one of the following conditions are met:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The lock duration expires.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The snapshot is unlocked by a user with the appropriate permissions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock
     *        duration, and change the lock mode to <code>compliance</code> at any time.
     *        </p>
     *        <p>
     *        If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't
     *        be unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease
     *        the lock duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM
     *        permissions can increase the lock duration at any time.
     *        </p>
     *        <p>
     *        If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     *        </p>
     *        </li>
     * @see LockMode
     */

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    /**
     * <p>
     * The mode in which to lock the snapshot. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't be
     * deleted until one of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The lock duration expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot is unlocked by a user with the appropriate permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock duration, and
     * change the lock mode to <code>compliance</code> at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't be
     * unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease the lock
     * duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM permissions can
     * increase the lock duration at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The mode in which to lock the snapshot. Specify one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode
     *         can't be deleted until one of the following conditions are met:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The lock duration expires.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The snapshot is unlocked by a user with the appropriate permissions.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock
     *         duration, and change the lock mode to <code>compliance</code> at any time.
     *         </p>
     *         <p>
     *         If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode
     *         can't be unlocked by any user. They can be deleted only after the lock duration expires. Users can't
     *         decrease the lock duration or change the lock mode to <code>governance</code>. However, users with
     *         appropriate IAM permissions can increase the lock duration at any time.
     *         </p>
     *         <p>
     *         If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     *         </p>
     *         </li>
     * @see LockMode
     */

    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * <p>
     * The mode in which to lock the snapshot. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't be
     * deleted until one of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The lock duration expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot is unlocked by a user with the appropriate permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock duration, and
     * change the lock mode to <code>compliance</code> at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't be
     * unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease the lock
     * duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM permissions can
     * increase the lock duration at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockMode
     *        The mode in which to lock the snapshot. Specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't
     *        be deleted until one of the following conditions are met:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The lock duration expires.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The snapshot is unlocked by a user with the appropriate permissions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock
     *        duration, and change the lock mode to <code>compliance</code> at any time.
     *        </p>
     *        <p>
     *        If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't
     *        be unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease
     *        the lock duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM
     *        permissions can increase the lock duration at any time.
     *        </p>
     *        <p>
     *        If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockMode
     */

    public LockSnapshotRequest withLockMode(String lockMode) {
        setLockMode(lockMode);
        return this;
    }

    /**
     * <p>
     * The mode in which to lock the snapshot. Specify one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't be
     * deleted until one of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The lock duration expires.
     * </p>
     * </li>
     * <li>
     * <p>
     * The snapshot is unlocked by a user with the appropriate permissions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock duration, and
     * change the lock mode to <code>compliance</code> at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't be
     * unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease the lock
     * duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM permissions can
     * increase the lock duration at any time.
     * </p>
     * <p>
     * If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockMode
     *        The mode in which to lock the snapshot. Specify one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>governance</code> - Locks the snapshot in governance mode. Snapshots locked in governance mode can't
     *        be deleted until one of the following conditions are met:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The lock duration expires.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The snapshot is unlocked by a user with the appropriate permissions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Users with the appropriate IAM permissions can unlock the snapshot, increase or decrease the lock
     *        duration, and change the lock mode to <code>compliance</code> at any time.
     *        </p>
     *        <p>
     *        If you lock a snapshot in <code>governance</code> mode, omit <b> CoolOffPeriod</b>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compliance</code> - Locks the snapshot in compliance mode. Snapshots locked in compliance mode can't
     *        be unlocked by any user. They can be deleted only after the lock duration expires. Users can't decrease
     *        the lock duration or change the lock mode to <code>governance</code>. However, users with appropriate IAM
     *        permissions can increase the lock duration at any time.
     *        </p>
     *        <p>
     *        If you lock a snapshot in <code>compliance</code> mode, you can optionally specify <b>CoolOffPeriod</b>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockMode
     */

    public LockSnapshotRequest withLockMode(LockMode lockMode) {
        this.lockMode = lockMode.toString();
        return this;
    }

    /**
     * <p>
     * The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking the
     * snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or delete the
     * snapshot, decrease the lock duration, or change the lock mode. You can increase the lock duration after the
     * cooling-off period expires.
     * </p>
     * <p>
     * The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the snapshot in
     * governance mode, omit this parameter.
     * </p>
     * <p>
     * To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     * </p>
     * <p>
     * If you are extending the lock duration for a snapshot that is locked in compliance mode after the cooling-off
     * period has expired, omit this parameter. If you specify a cooling-period in a such a request, the request fails.
     * </p>
     * <p>
     * Allowed values: Min 1, max 72.
     * </p>
     * 
     * @param coolOffPeriod
     *        The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking
     *        the snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or
     *        delete the snapshot, decrease the lock duration, or change the lock mode. You can increase the lock
     *        duration after the cooling-off period expires.</p>
     *        <p>
     *        The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the
     *        snapshot in governance mode, omit this parameter.
     *        </p>
     *        <p>
     *        To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     *        </p>
     *        <p>
     *        If you are extending the lock duration for a snapshot that is locked in compliance mode after the
     *        cooling-off period has expired, omit this parameter. If you specify a cooling-period in a such a request,
     *        the request fails.
     *        </p>
     *        <p>
     *        Allowed values: Min 1, max 72.
     */

    public void setCoolOffPeriod(Integer coolOffPeriod) {
        this.coolOffPeriod = coolOffPeriod;
    }

    /**
     * <p>
     * The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking the
     * snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or delete the
     * snapshot, decrease the lock duration, or change the lock mode. You can increase the lock duration after the
     * cooling-off period expires.
     * </p>
     * <p>
     * The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the snapshot in
     * governance mode, omit this parameter.
     * </p>
     * <p>
     * To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     * </p>
     * <p>
     * If you are extending the lock duration for a snapshot that is locked in compliance mode after the cooling-off
     * period has expired, omit this parameter. If you specify a cooling-period in a such a request, the request fails.
     * </p>
     * <p>
     * Allowed values: Min 1, max 72.
     * </p>
     * 
     * @return The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking
     *         the snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or
     *         delete the snapshot, decrease the lock duration, or change the lock mode. You can increase the lock
     *         duration after the cooling-off period expires.</p>
     *         <p>
     *         The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the
     *         snapshot in governance mode, omit this parameter.
     *         </p>
     *         <p>
     *         To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     *         </p>
     *         <p>
     *         If you are extending the lock duration for a snapshot that is locked in compliance mode after the
     *         cooling-off period has expired, omit this parameter. If you specify a cooling-period in a such a request,
     *         the request fails.
     *         </p>
     *         <p>
     *         Allowed values: Min 1, max 72.
     */

    public Integer getCoolOffPeriod() {
        return this.coolOffPeriod;
    }

    /**
     * <p>
     * The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking the
     * snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or delete the
     * snapshot, decrease the lock duration, or change the lock mode. You can increase the lock duration after the
     * cooling-off period expires.
     * </p>
     * <p>
     * The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the snapshot in
     * governance mode, omit this parameter.
     * </p>
     * <p>
     * To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     * </p>
     * <p>
     * If you are extending the lock duration for a snapshot that is locked in compliance mode after the cooling-off
     * period has expired, omit this parameter. If you specify a cooling-period in a such a request, the request fails.
     * </p>
     * <p>
     * Allowed values: Min 1, max 72.
     * </p>
     * 
     * @param coolOffPeriod
     *        The cooling-off period during which you can unlock the snapshot or modify the lock settings after locking
     *        the snapshot in compliance mode, in hours. After the cooling-off period expires, you can't unlock or
     *        delete the snapshot, decrease the lock duration, or change the lock mode. You can increase the lock
     *        duration after the cooling-off period expires.</p>
     *        <p>
     *        The cooling-off period is optional when locking a snapshot in compliance mode. If you are locking the
     *        snapshot in governance mode, omit this parameter.
     *        </p>
     *        <p>
     *        To lock the snapshot in compliance mode immediately without a cooling-off period, omit this parameter.
     *        </p>
     *        <p>
     *        If you are extending the lock duration for a snapshot that is locked in compliance mode after the
     *        cooling-off period has expired, omit this parameter. If you specify a cooling-period in a such a request,
     *        the request fails.
     *        </p>
     *        <p>
     *        Allowed values: Min 1, max 72.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockSnapshotRequest withCoolOffPeriod(Integer coolOffPeriod) {
        setCoolOffPeriod(coolOffPeriod);
        return this;
    }

    /**
     * <p>
     * The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire after
     * this period lapses.
     * </p>
     * <p>
     * You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     * </p>
     * <p>
     * Allowed values: Min: 1, max 36500
     * </p>
     * 
     * @param lockDuration
     *        The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire
     *        after this period lapses.</p>
     *        <p>
     *        You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     *        </p>
     *        <p>
     *        Allowed values: Min: 1, max 36500
     */

    public void setLockDuration(Integer lockDuration) {
        this.lockDuration = lockDuration;
    }

    /**
     * <p>
     * The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire after
     * this period lapses.
     * </p>
     * <p>
     * You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     * </p>
     * <p>
     * Allowed values: Min: 1, max 36500
     * </p>
     * 
     * @return The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire
     *         after this period lapses.</p>
     *         <p>
     *         You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     *         </p>
     *         <p>
     *         Allowed values: Min: 1, max 36500
     */

    public Integer getLockDuration() {
        return this.lockDuration;
    }

    /**
     * <p>
     * The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire after
     * this period lapses.
     * </p>
     * <p>
     * You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     * </p>
     * <p>
     * Allowed values: Min: 1, max 36500
     * </p>
     * 
     * @param lockDuration
     *        The period of time for which to lock the snapshot, in days. The snapshot lock will automatically expire
     *        after this period lapses.</p>
     *        <p>
     *        You must specify either this parameter or <b>ExpirationDate</b>, but not both.
     *        </p>
     *        <p>
     *        Allowed values: Min: 1, max 36500
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockSnapshotRequest withLockDuration(Integer lockDuration) {
        setLockDuration(lockDuration);
        return this;
    }

    /**
     * <p>
     * The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * <p>
     * You must specify either this parameter or <b>LockDuration</b>, but not both.
     * </p>
     * 
     * @param expirationDate
     *        The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).</p>
     *        <p>
     *        You must specify either this parameter or <b>LockDuration</b>, but not both.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * <p>
     * You must specify either this parameter or <b>LockDuration</b>, but not both.
     * </p>
     * 
     * @return The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).</p>
     *         <p>
     *         You must specify either this parameter or <b>LockDuration</b>, but not both.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).
     * </p>
     * <p>
     * You must specify either this parameter or <b>LockDuration</b>, but not both.
     * </p>
     * 
     * @param expirationDate
     *        The date and time at which the snapshot lock is to automatically expire, in the UTC time zone (
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>).</p>
     *        <p>
     *        You must specify either this parameter or <b>LockDuration</b>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockSnapshotRequest withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<LockSnapshotRequest> getDryRunRequest() {
        Request<LockSnapshotRequest> request = new LockSnapshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getLockMode() != null)
            sb.append("LockMode: ").append(getLockMode()).append(",");
        if (getCoolOffPeriod() != null)
            sb.append("CoolOffPeriod: ").append(getCoolOffPeriod()).append(",");
        if (getLockDuration() != null)
            sb.append("LockDuration: ").append(getLockDuration()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LockSnapshotRequest == false)
            return false;
        LockSnapshotRequest other = (LockSnapshotRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getLockMode() == null ^ this.getLockMode() == null)
            return false;
        if (other.getLockMode() != null && other.getLockMode().equals(this.getLockMode()) == false)
            return false;
        if (other.getCoolOffPeriod() == null ^ this.getCoolOffPeriod() == null)
            return false;
        if (other.getCoolOffPeriod() != null && other.getCoolOffPeriod().equals(this.getCoolOffPeriod()) == false)
            return false;
        if (other.getLockDuration() == null ^ this.getLockDuration() == null)
            return false;
        if (other.getLockDuration() != null && other.getLockDuration().equals(this.getLockDuration()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getLockMode() == null) ? 0 : getLockMode().hashCode());
        hashCode = prime * hashCode + ((getCoolOffPeriod() == null) ? 0 : getCoolOffPeriod().hashCode());
        hashCode = prime * hashCode + ((getLockDuration() == null) ? 0 : getLockDuration().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return hashCode;
    }

    @Override
    public LockSnapshotRequest clone() {
        return (LockSnapshotRequest) super.clone();
    }
}
