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
import com.amazonaws.services.ec2.model.transform.DeleteVolumeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteVolume(DeleteVolumeRequest) DeleteVolume operation}.
 * <p>
 * Deletes a previously created volume. Once successfully deleted, a new volume can be created with the same name.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteVolume(DeleteVolumeRequest)
 */
public class DeleteVolumeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteVolumeRequest> {

    /**
     * The ID of the EBS volume to delete.
     */
    private String volumeId;

    /**
     * Default constructor for a new DeleteVolumeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteVolumeRequest() {}
    
    /**
     * Constructs a new DeleteVolumeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeId The ID of the EBS volume to delete.
     */
    public DeleteVolumeRequest(String volumeId) {
        setVolumeId(volumeId);
    }

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

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteVolumeRequest> getDryRunRequest() {
        Request<DeleteVolumeRequest> request = new DeleteVolumeRequestMarshaller().marshall(this);
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVolumeRequest == false) return false;
        DeleteVolumeRequest other = (DeleteVolumeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        return true;
    }
    
}
    