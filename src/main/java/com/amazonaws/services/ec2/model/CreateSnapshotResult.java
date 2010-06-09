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
 * The result of creating a snapshot from an EBS volume.
 * </p>
 */
public class CreateSnapshotResult {

    /**
     * The new snapshot.
     */
    private Snapshot snapshot;

    /**
     * The new snapshot.
     *
     * @return The new snapshot.
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }
    
    /**
     * The new snapshot.
     *
     * @param snapshot The new snapshot.
     */
    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }
    
    /**
     * The new snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshot The new snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSnapshotResult withSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
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
        
        sb.append("Snapshot: " + snapshot + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    