/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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
     * The maximum number of manual snapshots allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer manualSnapshotsLimit;

    /**
     * The current number of manual snapshots of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer manualSnapshotsCurrentCount;

    /**
     * Indicates if the manual snapshot limit has been reached.
     */
    private Boolean manualSnapshotsLimitReached;

    /**
     * The maximum number of manual snapshots allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The maximum number of manual snapshots allowed.
     */
    public Integer getManualSnapshotsLimit() {
        return manualSnapshotsLimit;
    }
    
    /**
     * The maximum number of manual snapshots allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param manualSnapshotsLimit The maximum number of manual snapshots allowed.
     */
    public void setManualSnapshotsLimit(Integer manualSnapshotsLimit) {
        this.manualSnapshotsLimit = manualSnapshotsLimit;
    }
    
    /**
     * The maximum number of manual snapshots allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param manualSnapshotsLimit The maximum number of manual snapshots allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotLimits withManualSnapshotsLimit(Integer manualSnapshotsLimit) {
        this.manualSnapshotsLimit = manualSnapshotsLimit;
        return this;
    }

    /**
     * The current number of manual snapshots of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The current number of manual snapshots of the directory.
     */
    public Integer getManualSnapshotsCurrentCount() {
        return manualSnapshotsCurrentCount;
    }
    
    /**
     * The current number of manual snapshots of the directory.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param manualSnapshotsCurrentCount The current number of manual snapshots of the directory.
     */
    public void setManualSnapshotsCurrentCount(Integer manualSnapshotsCurrentCount) {
        this.manualSnapshotsCurrentCount = manualSnapshotsCurrentCount;
    }
    
    /**
     * The current number of manual snapshots of the directory.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param manualSnapshotsCurrentCount The current number of manual snapshots of the directory.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotLimits withManualSnapshotsCurrentCount(Integer manualSnapshotsCurrentCount) {
        this.manualSnapshotsCurrentCount = manualSnapshotsCurrentCount;
        return this;
    }

    /**
     * Indicates if the manual snapshot limit has been reached.
     *
     * @return Indicates if the manual snapshot limit has been reached.
     */
    public Boolean isManualSnapshotsLimitReached() {
        return manualSnapshotsLimitReached;
    }
    
    /**
     * Indicates if the manual snapshot limit has been reached.
     *
     * @param manualSnapshotsLimitReached Indicates if the manual snapshot limit has been reached.
     */
    public void setManualSnapshotsLimitReached(Boolean manualSnapshotsLimitReached) {
        this.manualSnapshotsLimitReached = manualSnapshotsLimitReached;
    }
    
    /**
     * Indicates if the manual snapshot limit has been reached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manualSnapshotsLimitReached Indicates if the manual snapshot limit has been reached.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SnapshotLimits withManualSnapshotsLimitReached(Boolean manualSnapshotsLimitReached) {
        this.manualSnapshotsLimitReached = manualSnapshotsLimitReached;
        return this;
    }

    /**
     * Indicates if the manual snapshot limit has been reached.
     *
     * @return Indicates if the manual snapshot limit has been reached.
     */
    public Boolean getManualSnapshotsLimitReached() {
        return manualSnapshotsLimitReached;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getManualSnapshotsLimit() != null) sb.append("ManualSnapshotsLimit: " + getManualSnapshotsLimit() + ",");
        if (getManualSnapshotsCurrentCount() != null) sb.append("ManualSnapshotsCurrentCount: " + getManualSnapshotsCurrentCount() + ",");
        if (isManualSnapshotsLimitReached() != null) sb.append("ManualSnapshotsLimitReached: " + isManualSnapshotsLimitReached() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getManualSnapshotsLimit() == null) ? 0 : getManualSnapshotsLimit().hashCode()); 
        hashCode = prime * hashCode + ((getManualSnapshotsCurrentCount() == null) ? 0 : getManualSnapshotsCurrentCount().hashCode()); 
        hashCode = prime * hashCode + ((isManualSnapshotsLimitReached() == null) ? 0 : isManualSnapshotsLimitReached().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SnapshotLimits == false) return false;
        SnapshotLimits other = (SnapshotLimits)obj;
        
        if (other.getManualSnapshotsLimit() == null ^ this.getManualSnapshotsLimit() == null) return false;
        if (other.getManualSnapshotsLimit() != null && other.getManualSnapshotsLimit().equals(this.getManualSnapshotsLimit()) == false) return false; 
        if (other.getManualSnapshotsCurrentCount() == null ^ this.getManualSnapshotsCurrentCount() == null) return false;
        if (other.getManualSnapshotsCurrentCount() != null && other.getManualSnapshotsCurrentCount().equals(this.getManualSnapshotsCurrentCount()) == false) return false; 
        if (other.isManualSnapshotsLimitReached() == null ^ this.isManualSnapshotsLimitReached() == null) return false;
        if (other.isManualSnapshotsLimitReached() != null && other.isManualSnapshotsLimitReached().equals(this.isManualSnapshotsLimitReached()) == false) return false; 
        return true;
    }
    
    @Override
    public SnapshotLimits clone() {
        try {
            return (SnapshotLimits) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    