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
 * <p>
 * Represents a request to delete an <i>Elastic Block Storage</i> (EBS)
 * volume.
 * </p>
 */
public class DeleteVolumeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the EBS volume to delete.
     */
    private String volumeId;

    /**
     * The ID of the EBS volume to delete.
     *
     * @return The ID of the EBS volume to delete.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the EBS volume to delete.
     *
     * @param volumeId The ID of the EBS volume to delete.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the EBS volume to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the EBS volume to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("VolumeId: " + volumeId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    