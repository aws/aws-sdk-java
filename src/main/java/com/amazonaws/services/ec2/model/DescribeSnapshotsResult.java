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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * The result of describing EBS snapshots.
 * </p>
 */
public class DescribeSnapshotsResult implements Serializable {

    /**
     * The list of described EBS snapshots.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshots;

    /**
     * The list of described EBS snapshots.
     *
     * @return The list of described EBS snapshots.
     */
    public java.util.List<Snapshot> getSnapshots() {
        if (snapshots == null) {
              snapshots = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>();
              snapshots.setAutoConstruct(true);
        }
        return snapshots;
    }
    
    /**
     * The list of described EBS snapshots.
     *
     * @param snapshots The list of described EBS snapshots.
     */
    public void setSnapshots(java.util.Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>(snapshots.size());
        snapshotsCopy.addAll(snapshots);
        this.snapshots = snapshotsCopy;
    }
    
    /**
     * The list of described EBS snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshots The list of described EBS snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        if (getSnapshots() == null) setSnapshots(new java.util.ArrayList<Snapshot>(snapshots.length));
        for (Snapshot value : snapshots) {
            getSnapshots().add(value);
        }
        return this;
    }
    
    /**
     * The list of described EBS snapshots.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshots The list of described EBS snapshots.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSnapshotsResult withSnapshots(java.util.Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>(snapshots.size());
            snapshotsCopy.addAll(snapshots);
            this.snapshots = snapshotsCopy;
        }

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
        if (getSnapshots() != null) sb.append("Snapshots: " + getSnapshots() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSnapshotsResult == false) return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult)obj;
        
        if (other.getSnapshots() == null ^ this.getSnapshots() == null) return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false) return false; 
        return true;
    }
    
}
    