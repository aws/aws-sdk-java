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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSnapshot(CreateSnapshotRequest) CreateSnapshot operation}.
 * <p>
 * Create a snapshot of the volume identified by volume ID. A volume
 * does not have to be detached at the time the snapshot is taken.
 * </p>
 * <p>
 * <b>NOTE:</b> Snapshot creation requires that the system is in a
 * consistent state. For instance, this means that if taking a snapshot
 * of a database, the tables must be read-only locked to ensure that the
 * snapshot will not contain a corrupted version of the database.
 * Therefore, be careful when using this API to ensure that the system
 * remains in the consistent state until the create snapshot status has
 * returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSnapshot(CreateSnapshotRequest)
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the volume from which to create the snapshot.
     */
    private String volumeId;

    /**
     * The description for the new snapshot.
     */
    private String description;

    /**
     * Default constructor for a new CreateSnapshotRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateSnapshotRequest() {}
    
    /**
     * Constructs a new CreateSnapshotRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeId The ID of the volume from which to create the
     * snapshot.
     * @param description The description for the new snapshot.
     */
    public CreateSnapshotRequest(String volumeId, String description) {
        this.volumeId = volumeId;
        this.description = description;
    }
    
    /**
     * The ID of the volume from which to create the snapshot.
     *
     * @return The ID of the volume from which to create the snapshot.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume from which to create the snapshot.
     *
     * @param volumeId The ID of the volume from which to create the snapshot.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume from which to create the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume from which to create the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSnapshotRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    /**
     * The description for the new snapshot.
     *
     * @return The description for the new snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the new snapshot.
     *
     * @param description The description for the new snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the new snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the new snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSnapshotRequest withDescription(String description) {
        this.description = description;
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
        sb.append("VolumeId: " + volumeId + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    