/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a container in which AWS Lambda functions run on AWS IoT Greengrass core devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaContainerParams" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaContainerParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The memory size of the container, expressed in kilobytes.
     * </p>
     * <p>
     * Default: <code>16384</code> (16 MB)
     * </p>
     */
    private Integer memorySizeInKB;
    /**
     * <p>
     * Whether or not the container can read information from the device's <code>/sys</code> folder.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean mountROSysfs;
    /**
     * <p>
     * The list of volumes that the container can access.
     * </p>
     */
    private java.util.List<LambdaVolumeMount> volumes;
    /**
     * <p>
     * The list of system devices that the container can access.
     * </p>
     */
    private java.util.List<LambdaDeviceMount> devices;

    /**
     * <p>
     * The memory size of the container, expressed in kilobytes.
     * </p>
     * <p>
     * Default: <code>16384</code> (16 MB)
     * </p>
     * 
     * @param memorySizeInKB
     *        The memory size of the container, expressed in kilobytes.</p>
     *        <p>
     *        Default: <code>16384</code> (16 MB)
     */

    public void setMemorySizeInKB(Integer memorySizeInKB) {
        this.memorySizeInKB = memorySizeInKB;
    }

    /**
     * <p>
     * The memory size of the container, expressed in kilobytes.
     * </p>
     * <p>
     * Default: <code>16384</code> (16 MB)
     * </p>
     * 
     * @return The memory size of the container, expressed in kilobytes.</p>
     *         <p>
     *         Default: <code>16384</code> (16 MB)
     */

    public Integer getMemorySizeInKB() {
        return this.memorySizeInKB;
    }

    /**
     * <p>
     * The memory size of the container, expressed in kilobytes.
     * </p>
     * <p>
     * Default: <code>16384</code> (16 MB)
     * </p>
     * 
     * @param memorySizeInKB
     *        The memory size of the container, expressed in kilobytes.</p>
     *        <p>
     *        Default: <code>16384</code> (16 MB)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaContainerParams withMemorySizeInKB(Integer memorySizeInKB) {
        setMemorySizeInKB(memorySizeInKB);
        return this;
    }

    /**
     * <p>
     * Whether or not the container can read information from the device's <code>/sys</code> folder.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param mountROSysfs
     *        Whether or not the container can read information from the device's <code>/sys</code> folder.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setMountROSysfs(Boolean mountROSysfs) {
        this.mountROSysfs = mountROSysfs;
    }

    /**
     * <p>
     * Whether or not the container can read information from the device's <code>/sys</code> folder.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Whether or not the container can read information from the device's <code>/sys</code> folder.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getMountROSysfs() {
        return this.mountROSysfs;
    }

    /**
     * <p>
     * Whether or not the container can read information from the device's <code>/sys</code> folder.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param mountROSysfs
     *        Whether or not the container can read information from the device's <code>/sys</code> folder.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaContainerParams withMountROSysfs(Boolean mountROSysfs) {
        setMountROSysfs(mountROSysfs);
        return this;
    }

    /**
     * <p>
     * Whether or not the container can read information from the device's <code>/sys</code> folder.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Whether or not the container can read information from the device's <code>/sys</code> folder.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isMountROSysfs() {
        return this.mountROSysfs;
    }

    /**
     * <p>
     * The list of volumes that the container can access.
     * </p>
     * 
     * @return The list of volumes that the container can access.
     */

    public java.util.List<LambdaVolumeMount> getVolumes() {
        return volumes;
    }

    /**
     * <p>
     * The list of volumes that the container can access.
     * </p>
     * 
     * @param volumes
     *        The list of volumes that the container can access.
     */

    public void setVolumes(java.util.Collection<LambdaVolumeMount> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new java.util.ArrayList<LambdaVolumeMount>(volumes);
    }

    /**
     * <p>
     * The list of volumes that the container can access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        The list of volumes that the container can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaContainerParams withVolumes(LambdaVolumeMount... volumes) {
        if (this.volumes == null) {
            setVolumes(new java.util.ArrayList<LambdaVolumeMount>(volumes.length));
        }
        for (LambdaVolumeMount ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of volumes that the container can access.
     * </p>
     * 
     * @param volumes
     *        The list of volumes that the container can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaContainerParams withVolumes(java.util.Collection<LambdaVolumeMount> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The list of system devices that the container can access.
     * </p>
     * 
     * @return The list of system devices that the container can access.
     */

    public java.util.List<LambdaDeviceMount> getDevices() {
        return devices;
    }

    /**
     * <p>
     * The list of system devices that the container can access.
     * </p>
     * 
     * @param devices
     *        The list of system devices that the container can access.
     */

    public void setDevices(java.util.Collection<LambdaDeviceMount> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<LambdaDeviceMount>(devices);
    }

    /**
     * <p>
     * The list of system devices that the container can access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        The list of system devices that the container can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaContainerParams withDevices(LambdaDeviceMount... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<LambdaDeviceMount>(devices.length));
        }
        for (LambdaDeviceMount ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of system devices that the container can access.
     * </p>
     * 
     * @param devices
     *        The list of system devices that the container can access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaContainerParams withDevices(java.util.Collection<LambdaDeviceMount> devices) {
        setDevices(devices);
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
        if (getMemorySizeInKB() != null)
            sb.append("MemorySizeInKB: ").append(getMemorySizeInKB()).append(",");
        if (getMountROSysfs() != null)
            sb.append("MountROSysfs: ").append(getMountROSysfs()).append(",");
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaContainerParams == false)
            return false;
        LambdaContainerParams other = (LambdaContainerParams) obj;
        if (other.getMemorySizeInKB() == null ^ this.getMemorySizeInKB() == null)
            return false;
        if (other.getMemorySizeInKB() != null && other.getMemorySizeInKB().equals(this.getMemorySizeInKB()) == false)
            return false;
        if (other.getMountROSysfs() == null ^ this.getMountROSysfs() == null)
            return false;
        if (other.getMountROSysfs() != null && other.getMountROSysfs().equals(this.getMountROSysfs()) == false)
            return false;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
            return false;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemorySizeInKB() == null) ? 0 : getMemorySizeInKB().hashCode());
        hashCode = prime * hashCode + ((getMountROSysfs() == null) ? 0 : getMountROSysfs().hashCode());
        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        return hashCode;
    }

    @Override
    public LambdaContainerParams clone() {
        try {
            return (LambdaContainerParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaContainerParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
