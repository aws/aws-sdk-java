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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains manual snapshot limit information for a directory.
 * </p>
 */
public class SnapshotLimits implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of manual snapshots allowed.
     * </p>
     */
    private Integer manualSnapshotsLimit;
    /**
     * <p>
     * The current number of manual snapshots of the directory.
     * </p>
     */
    private Integer manualSnapshotsCurrentCount;
    /**
     * <p>
     * Indicates if the manual snapshot limit has been reached.
     * </p>
     */
    private Boolean manualSnapshotsLimitReached;

    /**
     * <p>
     * The maximum number of manual snapshots allowed.
     * </p>
     * 
     * @param manualSnapshotsLimit
     *        The maximum number of manual snapshots allowed.
     */

    public void setManualSnapshotsLimit(Integer manualSnapshotsLimit) {
        this.manualSnapshotsLimit = manualSnapshotsLimit;
    }

    /**
     * <p>
     * The maximum number of manual snapshots allowed.
     * </p>
     * 
     * @return The maximum number of manual snapshots allowed.
     */

    public Integer getManualSnapshotsLimit() {
        return this.manualSnapshotsLimit;
    }

    /**
     * <p>
     * The maximum number of manual snapshots allowed.
     * </p>
     * 
     * @param manualSnapshotsLimit
     *        The maximum number of manual snapshots allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotLimits withManualSnapshotsLimit(Integer manualSnapshotsLimit) {
        setManualSnapshotsLimit(manualSnapshotsLimit);
        return this;
    }

    /**
     * <p>
     * The current number of manual snapshots of the directory.
     * </p>
     * 
     * @param manualSnapshotsCurrentCount
     *        The current number of manual snapshots of the directory.
     */

    public void setManualSnapshotsCurrentCount(Integer manualSnapshotsCurrentCount) {
        this.manualSnapshotsCurrentCount = manualSnapshotsCurrentCount;
    }

    /**
     * <p>
     * The current number of manual snapshots of the directory.
     * </p>
     * 
     * @return The current number of manual snapshots of the directory.
     */

    public Integer getManualSnapshotsCurrentCount() {
        return this.manualSnapshotsCurrentCount;
    }

    /**
     * <p>
     * The current number of manual snapshots of the directory.
     * </p>
     * 
     * @param manualSnapshotsCurrentCount
     *        The current number of manual snapshots of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotLimits withManualSnapshotsCurrentCount(Integer manualSnapshotsCurrentCount) {
        setManualSnapshotsCurrentCount(manualSnapshotsCurrentCount);
        return this;
    }

    /**
     * <p>
     * Indicates if the manual snapshot limit has been reached.
     * </p>
     * 
     * @param manualSnapshotsLimitReached
     *        Indicates if the manual snapshot limit has been reached.
     */

    public void setManualSnapshotsLimitReached(Boolean manualSnapshotsLimitReached) {
        this.manualSnapshotsLimitReached = manualSnapshotsLimitReached;
    }

    /**
     * <p>
     * Indicates if the manual snapshot limit has been reached.
     * </p>
     * 
     * @return Indicates if the manual snapshot limit has been reached.
     */

    public Boolean getManualSnapshotsLimitReached() {
        return this.manualSnapshotsLimitReached;
    }

    /**
     * <p>
     * Indicates if the manual snapshot limit has been reached.
     * </p>
     * 
     * @param manualSnapshotsLimitReached
     *        Indicates if the manual snapshot limit has been reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotLimits withManualSnapshotsLimitReached(Boolean manualSnapshotsLimitReached) {
        setManualSnapshotsLimitReached(manualSnapshotsLimitReached);
        return this;
    }

    /**
     * <p>
     * Indicates if the manual snapshot limit has been reached.
     * </p>
     * 
     * @return Indicates if the manual snapshot limit has been reached.
     */

    public Boolean isManualSnapshotsLimitReached() {
        return this.manualSnapshotsLimitReached;
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
        if (getManualSnapshotsLimit() != null)
            sb.append("ManualSnapshotsLimit: " + getManualSnapshotsLimit() + ",");
        if (getManualSnapshotsCurrentCount() != null)
            sb.append("ManualSnapshotsCurrentCount: " + getManualSnapshotsCurrentCount() + ",");
        if (getManualSnapshotsLimitReached() != null)
            sb.append("ManualSnapshotsLimitReached: " + getManualSnapshotsLimitReached());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotLimits == false)
            return false;
        SnapshotLimits other = (SnapshotLimits) obj;
        if (other.getManualSnapshotsLimit() == null ^ this.getManualSnapshotsLimit() == null)
            return false;
        if (other.getManualSnapshotsLimit() != null && other.getManualSnapshotsLimit().equals(this.getManualSnapshotsLimit()) == false)
            return false;
        if (other.getManualSnapshotsCurrentCount() == null ^ this.getManualSnapshotsCurrentCount() == null)
            return false;
        if (other.getManualSnapshotsCurrentCount() != null && other.getManualSnapshotsCurrentCount().equals(this.getManualSnapshotsCurrentCount()) == false)
            return false;
        if (other.getManualSnapshotsLimitReached() == null ^ this.getManualSnapshotsLimitReached() == null)
            return false;
        if (other.getManualSnapshotsLimitReached() != null && other.getManualSnapshotsLimitReached().equals(this.getManualSnapshotsLimitReached()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManualSnapshotsLimit() == null) ? 0 : getManualSnapshotsLimit().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotsCurrentCount() == null) ? 0 : getManualSnapshotsCurrentCount().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotsLimitReached() == null) ? 0 : getManualSnapshotsLimitReached().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotLimits clone() {
        try {
            return (SnapshotLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
