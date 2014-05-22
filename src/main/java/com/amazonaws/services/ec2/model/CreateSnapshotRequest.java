/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a snapshot of an Amazon EBS volume and stores it in Amazon S3.
 * You can use snapshots for backups, to make copies of Amazon EBS
 * volumes, and to save data before shutting down an instance.
 * </p>
 * <p>
 * When a snapshot is created, any AWS Marketplace product codes that are
 * associated with the source volume are propagated to the snapshot.
 * </p>
 * <p>
 * You can take a snapshot of an attached volume that is in use. However,
 * snapshots only capture data that has been written to your Amazon EBS
 * volume at the time the snapshot command is issued; this may exclude
 * any data that has been cached by any applications or the operating
 * system. If you can pause any file writes to the volume long enough to
 * take a snapshot, your snapshot should be complete. However, if you
 * cannot pause all file writes to the volume, you should unmount the
 * volume from within the instance, issue the snapshot command, and then
 * remount the volume to ensure a consistent and complete snapshot. You
 * may remount and use your volume while the snapshot status is
 * <code>pending</code> .
 * </p>
 * <p>
 * To create a snapshot for Amazon EBS volumes that serve as root
 * devices, you should stop the instance before taking the snapshot.
 * </p>
 * <p>
 * Snapshots that are taken from encrypted volumes are automatically
 * encrypted. Volumes that are created from encrypted snapshots are also
 * automatically encrypted. Your encrypted volumes and any associated
 * snapshots always remain protected.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html"> Amazon Elastic Block Store </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createSnapshot(CreateSnapshotRequest)
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<CreateSnapshotRequest> {

    /**
     * The ID of the Amazon EBS volume.
     */
    private String volumeId;

    /**
     * A description for the snapshot.
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
     * @param volumeId The ID of the Amazon EBS volume.
     * @param description A description for the snapshot.
     */
    public CreateSnapshotRequest(String volumeId, String description) {
        setVolumeId(volumeId);
        setDescription(description);
    }

    /**
     * The ID of the Amazon EBS volume.
     *
     * @return The ID of the Amazon EBS volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume.
     *
     * @param volumeId The ID of the Amazon EBS volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the Amazon EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the Amazon EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSnapshotRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * A description for the snapshot.
     *
     * @return A description for the snapshot.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the snapshot.
     *
     * @param description A description for the snapshot.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the snapshot.
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
    