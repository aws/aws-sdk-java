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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The volume ID.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The new name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new mount point.
     * </p>
     */
    private String mountPoint;

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @param volumeId
     *        The volume ID.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @return The volume ID.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @param volumeId
     *        The volume ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The new name.
     * </p>
     * 
     * @param name
     *        The new name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name.
     * </p>
     * 
     * @return The new name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name.
     * </p>
     * 
     * @param name
     *        The new name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new mount point.
     * </p>
     * 
     * @param mountPoint
     *        The new mount point.
     */

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The new mount point.
     * </p>
     * 
     * @return The new mount point.
     */

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * <p>
     * The new mount point.
     * </p>
     * 
     * @param mountPoint
     *        The new mount point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVolumeRequest withMountPoint(String mountPoint) {
        setMountPoint(mountPoint);
        return this;
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
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMountPoint() != null)
            sb.append("MountPoint: ").append(getMountPoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVolumeRequest == false)
            return false;
        UpdateVolumeRequest other = (UpdateVolumeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVolumeRequest clone() {
        return (UpdateVolumeRequest) super.clone();
    }

}
