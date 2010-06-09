/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The result of describing EBS snapshots.
 * </p>
 */
public class DescribeSnapshotsResult {

    /**
     * The list of described EBS snapshots.
     */
    private java.util.List<Snapshot> snapshots;

    /**
     * The list of described EBS snapshots.
     *
     * @return The list of described EBS snapshots.
     */
    public java.util.List<Snapshot> getSnapshots() {
        if (snapshots == null) {
            snapshots = new java.util.ArrayList<Snapshot>();
        }
        return snapshots;
    }
    
    /**
     * The list of described EBS snapshots.
     *
     * @param snapshots The list of described EBS snapshots.
     */
    public void setSnapshots(java.util.Collection<Snapshot> snapshots) {
        java.util.List<Snapshot> snapshotsCopy = new java.util.ArrayList<Snapshot>();
        if (snapshots != null) {
            snapshotsCopy.addAll(snapshots);
        }
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
        java.util.List<Snapshot> snapshotsCopy = new java.util.ArrayList<Snapshot>();
        if (snapshots != null) {
            snapshotsCopy.addAll(snapshots);
        }
        this.snapshots = snapshotsCopy;

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
        
        sb.append("Snapshots: " + snapshots + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    