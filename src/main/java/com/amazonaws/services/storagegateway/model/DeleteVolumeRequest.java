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
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#deleteVolume(DeleteVolumeRequest) DeleteVolume operation}.
 * <p>
 * This operation delete the specified gateway volume that you previously created using the CreateStorediSCSIVolume API. For gateway-stored volumes, the
 * local disk that was configured as the storage volume is not deleted. You can reuse the local disk to create another storage volume.
 * </p>
 * <p>
 * Before you delete a gateway volume, make sure there are no iSCSI connections to the volume you are deleting. You should also make sure there is no
 * snapshot in progress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to query snapshots on the volume you are deleting and check the
 * snapshot status. For more information, go to <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"> DescribeSnapshots </a> in the <i>Amazon
 * Elastic Compute Cloud API Reference</i> .
 * </p>
 * <p>
 * In the request, you must provide the Amazon Resource Name (ARN) of the storage volume you want to delete.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#deleteVolume(DeleteVolumeRequest)
 */
public class DeleteVolumeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the volume. Use the
     * <a>ListVolumes</a> operation to return a list of gateway volumes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

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
    public DeleteVolumeRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
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
        if (getVolumeARN() != null) sb.append("VolumeARN: " + getVolumeARN() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVolumeRequest == false) return false;
        DeleteVolumeRequest other = (DeleteVolumeRequest)obj;
        
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null) return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false) return false; 
        return true;
    }
    
}
    