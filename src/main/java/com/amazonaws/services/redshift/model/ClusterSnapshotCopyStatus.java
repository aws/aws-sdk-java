/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Returns the destination region and retention period that are configured for cross-region snapshot copy.
 * </p>
 */
public class ClusterSnapshotCopyStatus implements Serializable {

    /**
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     */
    private String destinationRegion;

    /**
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     */
    private Long retentionPeriod;

    /**
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     *
     * @return The destination region that snapshots are automatically copied to when
     *         cross-region snapshot copy is enabled.
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }
    
    /**
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     *
     * @param destinationRegion The destination region that snapshots are automatically copied to when
     *         cross-region snapshot copy is enabled.
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }
    
    /**
     * The destination region that snapshots are automatically copied to when
     * cross-region snapshot copy is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationRegion The destination region that snapshots are automatically copied to when
     *         cross-region snapshot copy is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSnapshotCopyStatus withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     *
     * @return The number of days that automated snapshots are retained in the
     *         destination region after they are copied from a source region.
     */
    public Long getRetentionPeriod() {
        return retentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     *
     * @param retentionPeriod The number of days that automated snapshots are retained in the
     *         destination region after they are copied from a source region.
     */
    public void setRetentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }
    
    /**
     * The number of days that automated snapshots are retained in the
     * destination region after they are copied from a source region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retentionPeriod The number of days that automated snapshots are retained in the
     *         destination region after they are copied from a source region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ClusterSnapshotCopyStatus withRetentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
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
        if (getDestinationRegion() != null) sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getRetentionPeriod() != null) sb.append("RetentionPeriod: " + getRetentionPeriod() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode()); 
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterSnapshotCopyStatus == false) return false;
        ClusterSnapshotCopyStatus other = (ClusterSnapshotCopyStatus)obj;
        
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null) return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false) return false; 
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null) return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false) return false; 
        return true;
    }
    
}
    