/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyVolumeAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyVolumeAttribute(ModifyVolumeAttributeRequest) ModifyVolumeAttribute operation}.
 * <p>
 * Modifies a volume attribute.
 * </p>
 * <p>
 * By default, all I/O operations for the volume are suspended when the
 * data on the volume is determined to be potentially inconsistent, to
 * prevent undetectable, latent data corruption. The I/O access to the
 * volume can be resumed by first enabling I/O access and then checking
 * the data consistency on your volume.
 * </p>
 * <p>
 * You can change the default behavior to resume I/O operations. We
 * recommend that you change this only for boot volumes or for volumes
 * that are stateless or disposable.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyVolumeAttribute(ModifyVolumeAttributeRequest)
 */
public class ModifyVolumeAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifyVolumeAttributeRequest> {

    /**
     * The ID of the volume.
     */
    private String volumeId;

    /**
     * Indicates whether the volume should be auto-enabled for I/O
     * operations.
     */
    private Boolean autoEnableIO;

    /**
     * The ID of the volume.
     *
     * @return The ID of the volume.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The ID of the volume.
     *
     * @param volumeId The ID of the volume.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The ID of the volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The ID of the volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVolumeAttributeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * Indicates whether the volume should be auto-enabled for I/O
     * operations.
     *
     * @return Indicates whether the volume should be auto-enabled for I/O
     *         operations.
     */
    public Boolean isAutoEnableIO() {
        return autoEnableIO;
    }
    
    /**
     * Indicates whether the volume should be auto-enabled for I/O
     * operations.
     *
     * @param autoEnableIO Indicates whether the volume should be auto-enabled for I/O
     *         operations.
     */
    public void setAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
    }
    
    /**
     * Indicates whether the volume should be auto-enabled for I/O
     * operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoEnableIO Indicates whether the volume should be auto-enabled for I/O
     *         operations.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyVolumeAttributeRequest withAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
        return this;
    }

    /**
     * Indicates whether the volume should be auto-enabled for I/O
     * operations.
     *
     * @return Indicates whether the volume should be auto-enabled for I/O
     *         operations.
     */
    public Boolean getAutoEnableIO() {
        return autoEnableIO;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifyVolumeAttributeRequest> getDryRunRequest() {
        Request<ModifyVolumeAttributeRequest> request = new ModifyVolumeAttributeRequestMarshaller().marshall(this);
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
        if (isAutoEnableIO() != null) sb.append("AutoEnableIO: " + isAutoEnableIO() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((isAutoEnableIO() == null) ? 0 : isAutoEnableIO().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyVolumeAttributeRequest == false) return false;
        ModifyVolumeAttributeRequest other = (ModifyVolumeAttributeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.isAutoEnableIO() == null ^ this.isAutoEnableIO() == null) return false;
        if (other.isAutoEnableIO() != null && other.isAutoEnableIO().equals(this.isAutoEnableIO()) == false) return false; 
        return true;
    }
    
}
    