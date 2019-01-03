/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVolumeAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyVolumeAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVolumeAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVolumeAttributeRequest> {

    /**
     * <p>
     * Indicates whether the volume should be auto-enabled for I/O operations.
     * </p>
     */
    private Boolean autoEnableIO;
    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;

    /**
     * <p>
     * Indicates whether the volume should be auto-enabled for I/O operations.
     * </p>
     * 
     * @param autoEnableIO
     *        Indicates whether the volume should be auto-enabled for I/O operations.
     */

    public void setAutoEnableIO(Boolean autoEnableIO) {
        this.autoEnableIO = autoEnableIO;
    }

    /**
     * <p>
     * Indicates whether the volume should be auto-enabled for I/O operations.
     * </p>
     * 
     * @return Indicates whether the volume should be auto-enabled for I/O operations.
     */

    public Boolean getAutoEnableIO() {
        return this.autoEnableIO;
    }

    /**
     * <p>
     * Indicates whether the volume should be auto-enabled for I/O operations.
     * </p>
     * 
     * @param autoEnableIO
     *        Indicates whether the volume should be auto-enabled for I/O operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeAttributeRequest withAutoEnableIO(Boolean autoEnableIO) {
        setAutoEnableIO(autoEnableIO);
        return this;
    }

    /**
     * <p>
     * Indicates whether the volume should be auto-enabled for I/O operations.
     * </p>
     * 
     * @return Indicates whether the volume should be auto-enabled for I/O operations.
     */

    public Boolean isAutoEnableIO() {
        return this.autoEnableIO;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVolumeAttributeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVolumeAttributeRequest> getDryRunRequest() {
        Request<ModifyVolumeAttributeRequest> request = new ModifyVolumeAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoEnableIO() != null)
            sb.append("AutoEnableIO: ").append(getAutoEnableIO()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVolumeAttributeRequest == false)
            return false;
        ModifyVolumeAttributeRequest other = (ModifyVolumeAttributeRequest) obj;
        if (other.getAutoEnableIO() == null ^ this.getAutoEnableIO() == null)
            return false;
        if (other.getAutoEnableIO() != null && other.getAutoEnableIO().equals(this.getAutoEnableIO()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnableIO() == null) ? 0 : getAutoEnableIO().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVolumeAttributeRequest clone() {
        return (ModifyVolumeAttributeRequest) super.clone();
    }
}
