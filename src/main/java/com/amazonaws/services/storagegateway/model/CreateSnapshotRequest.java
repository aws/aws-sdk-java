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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#createSnapshot(CreateSnapshotRequest) CreateSnapshot operation}.
 * <p>
 * This operation initiates a snapshot of a volume.
 * </p>
 * <p>
 * AWS Storage Gateway provides the ability to back up point-in-time snapshots of your data to Amazon Simple Storage (S3) for durable off-site recovery,
 * as well as import the data to an Amazon Elastic Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You can take snapshots of your gateway
 * volume on a scheduled or ad-hoc basis. This API enables you to take ad-hoc snapshot. For more information, see Working With Snapshots in the AWS
 * Storage Gateway Console.
 * </p>
 * <p>
 * In the CreateSnapshot request you identify the volume by providing its Amazon Resource Name (ARN). You must also provide description for the snapshot.
 * When AWS Storage Gateway takes the snapshot of specified volume, the snapshot and description appears in the AWS Storage Gateway Console. In response,
 * AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot progress or later use it when you want to create a
 * volume from a snapshot.
 * </p>
 * <p>
 * <b>NOTE:</b>To list or delete a snapshot, you must use the Amazon EC2 API. For more information, .
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#createSnapshot(CreateSnapshotRequest)
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String snapshotDescription;

    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSnapshotRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return Textual description of the snapshot that appears in the Amazon EC2
     *         console, Elastic Block Store snapshots panel in the <b>Description</b>
     *         field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     *         <b>Description</b> field
     */
    public String getSnapshotDescription() {
        return snapshotDescription;
    }
    
    /**
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param snapshotDescription Textual description of the snapshot that appears in the Amazon EC2
     *         console, Elastic Block Store snapshots panel in the <b>Description</b>
     *         field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     *         <b>Description</b> field
     */
    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }
    
    /**
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param snapshotDescription Textual description of the snapshot that appears in the Amazon EC2
     *         console, Elastic Block Store snapshots panel in the <b>Description</b>
     *         field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     *         <b>Description</b> field
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSnapshotRequest withSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
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
        if (getVolumeARN() != null) sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getSnapshotDescription() != null) sb.append("SnapshotDescription: " + getSnapshotDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotDescription() == null) ? 0 : getSnapshotDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSnapshotRequest == false) return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getSnapshotDescription() == null ^ this.getSnapshotDescription() == null) return false;
        if (other.getSnapshotDescription() != null && other.getSnapshotDescription().equals(this.getSnapshotDescription()) == false) return false; 
        return true;
    }
    
}
    