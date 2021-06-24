/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * &gt;Linux-specific modifications that are applied to the container, such as Linux kernel capabilities.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     */
    private AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails capabilities;
    /**
     * <p>
     * The host devices to expose to the container.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails> devices;
    /**
     * <p>
     * Whether to run an <code>init</code> process inside the container that forwards signals and reaps processes.
     * </p>
     */
    private Boolean initProcessEnabled;
    /**
     * <p>
     * The total amount of swap memory (in MiB) that a container can use.
     * </p>
     */
    private Integer maxSwap;
    /**
     * <p>
     * The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     * </p>
     */
    private Integer sharedMemorySize;
    /**
     * <p>
     * Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The higher
     * the value, the more aggressive the swappiness. The default is 60.
     * </p>
     */
    private Integer swappiness;
    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails> tmpfs;

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     * 
     * @param capabilities
     *        The Linux capabilities for the container that are added to or dropped from the default configuration
     *        provided by Docker.
     */

    public void setCapabilities(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     * 
     * @return The Linux capabilities for the container that are added to or dropped from the default configuration
     *         provided by Docker.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
     * Docker.
     * </p>
     * 
     * @param capabilities
     *        The Linux capabilities for the container that are added to or dropped from the default configuration
     *        provided by Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withCapabilities(
            AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The host devices to expose to the container.
     * </p>
     * 
     * @return The host devices to expose to the container.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails> getDevices() {
        return devices;
    }

    /**
     * <p>
     * The host devices to expose to the container.
     * </p>
     * 
     * @param devices
     *        The host devices to expose to the container.
     */

    public void setDevices(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails>(devices);
    }

    /**
     * <p>
     * The host devices to expose to the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevices(java.util.Collection)} or {@link #withDevices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param devices
     *        The host devices to expose to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withDevices(
            AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails>(devices.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The host devices to expose to the container.
     * </p>
     * 
     * @param devices
     *        The host devices to expose to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withDevices(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * Whether to run an <code>init</code> process inside the container that forwards signals and reaps processes.
     * </p>
     * 
     * @param initProcessEnabled
     *        Whether to run an <code>init</code> process inside the container that forwards signals and reaps
     *        processes.
     */

    public void setInitProcessEnabled(Boolean initProcessEnabled) {
        this.initProcessEnabled = initProcessEnabled;
    }

    /**
     * <p>
     * Whether to run an <code>init</code> process inside the container that forwards signals and reaps processes.
     * </p>
     * 
     * @return Whether to run an <code>init</code> process inside the container that forwards signals and reaps
     *         processes.
     */

    public Boolean getInitProcessEnabled() {
        return this.initProcessEnabled;
    }

    /**
     * <p>
     * Whether to run an <code>init</code> process inside the container that forwards signals and reaps processes.
     * </p>
     * 
     * @param initProcessEnabled
     *        Whether to run an <code>init</code> process inside the container that forwards signals and reaps
     *        processes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withInitProcessEnabled(Boolean initProcessEnabled) {
        setInitProcessEnabled(initProcessEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to run an <code>init</code> process inside the container that forwards signals and reaps processes.
     * </p>
     * 
     * @return Whether to run an <code>init</code> process inside the container that forwards signals and reaps
     *         processes.
     */

    public Boolean isInitProcessEnabled() {
        return this.initProcessEnabled;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) that a container can use.
     * </p>
     * 
     * @param maxSwap
     *        The total amount of swap memory (in MiB) that a container can use.
     */

    public void setMaxSwap(Integer maxSwap) {
        this.maxSwap = maxSwap;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) that a container can use.
     * </p>
     * 
     * @return The total amount of swap memory (in MiB) that a container can use.
     */

    public Integer getMaxSwap() {
        return this.maxSwap;
    }

    /**
     * <p>
     * The total amount of swap memory (in MiB) that a container can use.
     * </p>
     * 
     * @param maxSwap
     *        The total amount of swap memory (in MiB) that a container can use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withMaxSwap(Integer maxSwap) {
        setMaxSwap(maxSwap);
        return this;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     * </p>
     * 
     * @param sharedMemorySize
     *        The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     */

    public void setSharedMemorySize(Integer sharedMemorySize) {
        this.sharedMemorySize = sharedMemorySize;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     * </p>
     * 
     * @return The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     */

    public Integer getSharedMemorySize() {
        return this.sharedMemorySize;
    }

    /**
     * <p>
     * The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     * </p>
     * 
     * @param sharedMemorySize
     *        The value for the size (in MiB) of the <b>/dev/shm</b> volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withSharedMemorySize(Integer sharedMemorySize) {
        setSharedMemorySize(sharedMemorySize);
        return this;
    }

    /**
     * <p>
     * Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The higher
     * the value, the more aggressive the swappiness. The default is 60.
     * </p>
     * 
     * @param swappiness
     *        Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The
     *        higher the value, the more aggressive the swappiness. The default is 60.
     */

    public void setSwappiness(Integer swappiness) {
        this.swappiness = swappiness;
    }

    /**
     * <p>
     * Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The higher
     * the value, the more aggressive the swappiness. The default is 60.
     * </p>
     * 
     * @return Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The
     *         higher the value, the more aggressive the swappiness. The default is 60.
     */

    public Integer getSwappiness() {
        return this.swappiness;
    }

    /**
     * <p>
     * Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The higher
     * the value, the more aggressive the swappiness. The default is 60.
     * </p>
     * 
     * @param swappiness
     *        Configures the container's memory swappiness behavior. Determines how aggressively pages are swapped. The
     *        higher the value, the more aggressive the swappiness. The default is 60.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withSwappiness(Integer swappiness) {
        setSwappiness(swappiness);
        return this;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * </p>
     * 
     * @return The container path, mount options, and size (in MiB) of the tmpfs mount.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails> getTmpfs() {
        return tmpfs;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * </p>
     * 
     * @param tmpfs
     *        The container path, mount options, and size (in MiB) of the tmpfs mount.
     */

    public void setTmpfs(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails> tmpfs) {
        if (tmpfs == null) {
            this.tmpfs = null;
            return;
        }

        this.tmpfs = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails>(tmpfs);
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTmpfs(java.util.Collection)} or {@link #withTmpfs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tmpfs
     *        The container path, mount options, and size (in MiB) of the tmpfs mount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withTmpfs(
            AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails... tmpfs) {
        if (this.tmpfs == null) {
            setTmpfs(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails>(tmpfs.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails ele : tmpfs) {
            this.tmpfs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container path, mount options, and size (in MiB) of the tmpfs mount.
     * </p>
     * 
     * @param tmpfs
     *        The container path, mount options, and size (in MiB) of the tmpfs mount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails withTmpfs(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails> tmpfs) {
        setTmpfs(tmpfs);
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
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getDevices() != null)
            sb.append("Devices: ").append(getDevices()).append(",");
        if (getInitProcessEnabled() != null)
            sb.append("InitProcessEnabled: ").append(getInitProcessEnabled()).append(",");
        if (getMaxSwap() != null)
            sb.append("MaxSwap: ").append(getMaxSwap()).append(",");
        if (getSharedMemorySize() != null)
            sb.append("SharedMemorySize: ").append(getSharedMemorySize()).append(",");
        if (getSwappiness() != null)
            sb.append("Swappiness: ").append(getSwappiness()).append(",");
        if (getTmpfs() != null)
            sb.append("Tmpfs: ").append(getTmpfs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails other = (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails) obj;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getInitProcessEnabled() == null ^ this.getInitProcessEnabled() == null)
            return false;
        if (other.getInitProcessEnabled() != null && other.getInitProcessEnabled().equals(this.getInitProcessEnabled()) == false)
            return false;
        if (other.getMaxSwap() == null ^ this.getMaxSwap() == null)
            return false;
        if (other.getMaxSwap() != null && other.getMaxSwap().equals(this.getMaxSwap()) == false)
            return false;
        if (other.getSharedMemorySize() == null ^ this.getSharedMemorySize() == null)
            return false;
        if (other.getSharedMemorySize() != null && other.getSharedMemorySize().equals(this.getSharedMemorySize()) == false)
            return false;
        if (other.getSwappiness() == null ^ this.getSwappiness() == null)
            return false;
        if (other.getSwappiness() != null && other.getSwappiness().equals(this.getSwappiness()) == false)
            return false;
        if (other.getTmpfs() == null ^ this.getTmpfs() == null)
            return false;
        if (other.getTmpfs() != null && other.getTmpfs().equals(this.getTmpfs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode + ((getInitProcessEnabled() == null) ? 0 : getInitProcessEnabled().hashCode());
        hashCode = prime * hashCode + ((getMaxSwap() == null) ? 0 : getMaxSwap().hashCode());
        hashCode = prime * hashCode + ((getSharedMemorySize() == null) ? 0 : getSharedMemorySize().hashCode());
        hashCode = prime * hashCode + ((getSwappiness() == null) ? 0 : getSwappiness().hashCode());
        hashCode = prime * hashCode + ((getTmpfs() == null) ? 0 : getTmpfs().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
