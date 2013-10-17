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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSnapshotRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createSnapshot(CreateSnapshotRequest) CreateSnapshot operation}.
 * <p>
 * Create a snapshot of the volume identified by volume ID. A volume does not have to be detached at the time the snapshot is taken.
 * </p>
 * <p>
 * <b>NOTE:</b> Snapshot creation requires that the system is in a consistent state. For instance, this means that if taking a snapshot of a database,
 * the tables must be read-only locked to ensure that the snapshot will not contain a corrupted version of the database. Therefore, be careful when
 * using this API to ensure that the system remains in the consistent state until the create snapshot status has returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSnapshot(CreateSnapshotRequest)
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateSnapshotRequest> {

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
        setVolumeId(volumeId);
        setDescription(description);
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateSnapshotRequest> getDryRunRequest() {
        Request<CreateSnapshotRequest> request = new CreateSnapshotRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSnapshotRequest == false) return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    