/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> CreateSnapshotFromVolumeRecoveryPointOutput$SnapshotId </li>
 * <li> CreateSnapshotFromVolumeRecoveryPointOutput$VolumeARN </li>
 * <li> CreateSnapshotFromVolumeRecoveryPointOutput$VolumeRecoveryPointTime </li>
 * 
 * </ul>
 */
public class CreateSnapshotFromVolumeRecoveryPointResult {

    /**
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud
     * API DescribeSnapshots) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     */
    private String snapshotId;

    /**
     * The ARN of the volume of which the snapshot was taken. Obtain volume
     * ARNs from the <a>ListVolumes</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * The time of the recovery point. Data up to this recovery point are
     * included in the snapshot. <p><emphasis>Type</emphasis>: String format
     * of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */
    private String volumeRecoveryPointTime;

    /**
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud
     * API DescribeSnapshots) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @return The snapshot ID that is used to refer to the snapshot in future
     *         operations such as describing snapshots (Amazon Elastic Compute Cloud
     *         API DescribeSnapshots) or creating a volume from a snapshot
     *         (<a>CreateStorediSCSIVolume</a>).
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud
     * API DescribeSnapshots) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The snapshot ID that is used to refer to the snapshot in future
     *         operations such as describing snapshots (Amazon Elastic Compute Cloud
     *         API DescribeSnapshots) or creating a volume from a snapshot
     *         (<a>CreateStorediSCSIVolume</a>).
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The snapshot ID that is used to refer to the snapshot in future
     * operations such as describing snapshots (Amazon Elastic Compute Cloud
     * API DescribeSnapshots) or creating a volume from a snapshot
     * (<a>CreateStorediSCSIVolume</a>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-[0-9a-fA-F]{8}\z<br/>
     *
     * @param snapshotId The snapshot ID that is used to refer to the snapshot in future
     *         operations such as describing snapshots (Amazon Elastic Compute Cloud
     *         API DescribeSnapshots) or creating a volume from a snapshot
     *         (<a>CreateStorediSCSIVolume</a>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The ARN of the volume of which the snapshot was taken. Obtain volume
     * ARNs from the <a>ListVolumes</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The ARN of the volume of which the snapshot was taken. Obtain volume
     *         ARNs from the <a>ListVolumes</a> operation.
     */
    public String getVolumeARN() {
        return volumeARN;
    }
    
    /**
     * The ARN of the volume of which the snapshot was taken. Obtain volume
     * ARNs from the <a>ListVolumes</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The ARN of the volume of which the snapshot was taken. Obtain volume
     *         ARNs from the <a>ListVolumes</a> operation.
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }
    
    /**
     * The ARN of the volume of which the snapshot was taken. Obtain volume
     * ARNs from the <a>ListVolumes</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN The ARN of the volume of which the snapshot was taken. Obtain volume
     *         ARNs from the <a>ListVolumes</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }
    
    
    /**
     * The time of the recovery point. Data up to this recovery point are
     * included in the snapshot. <p><emphasis>Type</emphasis>: String format
     * of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *
     * @return The time of the recovery point. Data up to this recovery point are
     *         included in the snapshot. <p><emphasis>Type</emphasis>: String format
     *         of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */
    public String getVolumeRecoveryPointTime() {
        return volumeRecoveryPointTime;
    }
    
    /**
     * The time of the recovery point. Data up to this recovery point are
     * included in the snapshot. <p><emphasis>Type</emphasis>: String format
     * of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *
     * @param volumeRecoveryPointTime The time of the recovery point. Data up to this recovery point are
     *         included in the snapshot. <p><emphasis>Type</emphasis>: String format
     *         of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     */
    public void setVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
    }
    
    /**
     * The time of the recovery point. Data up to this recovery point are
     * included in the snapshot. <p><emphasis>Type</emphasis>: String format
     * of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeRecoveryPointTime The time of the recovery point. Data up to this recovery point are
     *         included in the snapshot. <p><emphasis>Type</emphasis>: String format
     *         of a date in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateSnapshotFromVolumeRecoveryPointResult withVolumeRecoveryPointTime(String volumeRecoveryPointTime) {
        this.volumeRecoveryPointTime = volumeRecoveryPointTime;
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
        if (snapshotId != null) sb.append("SnapshotId: " + snapshotId + ", ");
        if (volumeARN != null) sb.append("VolumeARN: " + volumeARN + ", ");
        if (volumeRecoveryPointTime != null) sb.append("VolumeRecoveryPointTime: " + volumeRecoveryPointTime + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeRecoveryPointTime() == null) ? 0 : getVolumeRecoveryPointTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateSnapshotFromVolumeRecoveryPointResult == false) return false;
        CreateSnapshotFromVolumeRecoveryPointResult other = (CreateSnapshotFromVolumeRecoveryPointResult)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        if (other.getVolumeRecoveryPointTime() == null ^ this.getVolumeRecoveryPointTime() == null) return false;
        if (other.getVolumeRecoveryPointTime() != null && other.getVolumeRecoveryPointTime().equals(this.getVolumeRecoveryPointTime()) == false) return false; 
        return true;
    }
    
}
    