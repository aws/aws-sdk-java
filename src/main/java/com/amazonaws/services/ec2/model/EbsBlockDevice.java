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
 * An EBS volume backed block device.
 * </p>
 */
public class EbsBlockDevice {

    /**
     * The ID of the snapshot from which the volume will be created.
     */
    private String snapshotId;

    /**
     * The size of the volume, in gigabytes.
     */
    private Integer volumeSize;

    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     */
    private Boolean deleteOnTermination;

    /**
     * The ID of the snapshot from which the volume will be created.
     *
     * @return The ID of the snapshot from which the volume will be created.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The ID of the snapshot from which the volume will be created.
     *
     * @param snapshotId The ID of the snapshot from which the volume will be created.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The ID of the snapshot from which the volume will be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotId The ID of the snapshot from which the volume will be created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EbsBlockDevice withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    
    
    /**
     * The size of the volume, in gigabytes.
     *
     * @return The size of the volume, in gigabytes.
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }
    
    /**
     * The size of the volume, in gigabytes.
     *
     * @param volumeSize The size of the volume, in gigabytes.
     */
    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }
    
    /**
     * The size of the volume, in gigabytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeSize The size of the volume, in gigabytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EbsBlockDevice withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }
    
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean isDeleteOnTermination() {
        return deleteOnTermination;
    }
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @param deleteOnTermination Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteOnTermination Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EbsBlockDevice withDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
        return this;
    }
    
    
    /**
     * Specifies whether the Amazon EBS volume is deleted on instance
     * termination.
     *
     * @return Specifies whether the Amazon EBS volume is deleted on instance
     *         termination.
     */
    public Boolean getDeleteOnTermination() {
        return deleteOnTermination;
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
        sb.append("SnapshotId: " + snapshotId + ", ");
        sb.append("VolumeSize: " + volumeSize + ", ");
        sb.append("DeleteOnTermination: " + deleteOnTermination + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    