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
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#createSnapshotFromVolumeRecoveryPoint(CreateSnapshotFromVolumeRecoveryPointRequest) CreateSnapshotFromVolumeRecoveryPoint operation}.
 * <p>
 * This operation initiates a snapshot of a gateway from a volume recovery point. This operation is supported only for the gateway-cached volume
 * architecture (see ).
 * </p>
 * <p>
 * A volume recovery point is a point in time at which all data of the volume is consistent and from which you can create a snapshot. To get a list of
 * volume recovery point for gateway-cached volumes, use ListVolumeRecoveryPoints.
 * </p>
 * <p>
 * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you identify the volume by providing its Amazon Resource Name (ARN). You must also
 * provide a description for the snapshot. When AWS Storage Gateway takes a snapshot of the specified volume, the snapshot and its description appear in
 * the AWS Storage Gateway console. In response, AWS Storage Gateway returns you a snapshot ID. You can use this snapshot ID to check the snapshot
 * progress or later use it when you want to create a volume from a snapshot.
 * </p>
 * <p>
 * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2 API. For more information, in Amazon Elastic Compute Cloud API Reference.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#createSnapshotFromVolumeRecoveryPoint(CreateSnapshotFromVolumeRecoveryPointRequest)
 */
public class CreateSnapshotFromVolumeRecoveryPointRequest extends AmazonWebServiceRequest implements Serializable {

    private String volumeARN;

    private String snapshotDescription;

    /**
     * Returns the value of the VolumeARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The value of the VolumeARN property for this object.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * Sets the value of the VolumeARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The new value for the VolumeARN property for this object.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * Sets the value of the VolumeARN property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The new value for the VolumeARN property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSnapshotFromVolumeRecoveryPointRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * Returns the value of the SnapshotDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The value of the SnapshotDescription property for this object.
     */
    public String getSnapshotDescription() {
        return snapshotDescription;
    }
    
    /**
     * Sets the value of the SnapshotDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param snapshotDescription The new value for the SnapshotDescription property for this object.
     */
    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }
    
    /**
     * Sets the value of the SnapshotDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param snapshotDescription The new value for the SnapshotDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSnapshotFromVolumeRecoveryPointRequest withSnapshotDescription(String snapshotDescription) {
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

        if (obj instanceof CreateSnapshotFromVolumeRecoveryPointRequest == false) return false;
        CreateSnapshotFromVolumeRecoveryPointRequest other = (CreateSnapshotFromVolumeRecoveryPointRequest)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getSnapshotDescription() == null ^ this.getSnapshotDescription() == null) return false;
        if (other.getSnapshotDescription() != null && other.getSnapshotDescription().equals(this.getSnapshotDescription()) == false) return false; 
        return true;
    }
    
}
    