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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a container instance host device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Device" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     */
    private String hostPath;
    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     */
    private String containerPath;
    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By default, the container has permissions
     * for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> permissions;

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     * 
     * @param hostPath
     *        The path for the device on the host container instance.
     */

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     * 
     * @return The path for the device on the host container instance.
     */

    public String getHostPath() {
        return this.hostPath;
    }

    /**
     * <p>
     * The path for the device on the host container instance.
     * </p>
     * 
     * @param hostPath
     *        The path for the device on the host container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withHostPath(String hostPath) {
        setHostPath(hostPath);
        return this;
    }

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     * 
     * @param containerPath
     *        The path inside the container at which to expose the host device.
     */

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     * 
     * @return The path inside the container at which to expose the host device.
     */

    public String getContainerPath() {
        return this.containerPath;
    }

    /**
     * <p>
     * The path inside the container at which to expose the host device.
     * </p>
     * 
     * @param containerPath
     *        The path inside the container at which to expose the host device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withContainerPath(String containerPath) {
        setContainerPath(containerPath);
        return this;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By default, the container has permissions
     * for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * 
     * @return The explicit permissions to provide to the container for the device. By default, the container has
     *         permissions for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * @see DeviceCgroupPermission
     */

    public java.util.List<String> getPermissions() {
        if (permissions == null) {
            permissions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return permissions;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By default, the container has permissions
     * for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * 
     * @param permissions
     *        The explicit permissions to provide to the container for the device. By default, the container has
     *        permissions for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * @see DeviceCgroupPermission
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new com.amazonaws.internal.SdkInternalList<String>(permissions);
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By default, the container has permissions
     * for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The explicit permissions to provide to the container for the device. By default, the container has
     *        permissions for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceCgroupPermission
     */

    public Device withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new com.amazonaws.internal.SdkInternalList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By default, the container has permissions
     * for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * 
     * @param permissions
     *        The explicit permissions to provide to the container for the device. By default, the container has
     *        permissions for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceCgroupPermission
     */

    public Device withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The explicit permissions to provide to the container for the device. By default, the container has permissions
     * for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * </p>
     * 
     * @param permissions
     *        The explicit permissions to provide to the container for the device. By default, the container has
     *        permissions for <code>read</code>, <code>write</code>, and <code>mknod</code> for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceCgroupPermission
     */

    public Device withPermissions(DeviceCgroupPermission... permissions) {
        com.amazonaws.internal.SdkInternalList<String> permissionsCopy = new com.amazonaws.internal.SdkInternalList<String>(permissions.length);
        for (DeviceCgroupPermission value : permissions) {
            permissionsCopy.add(value.toString());
        }
        if (getPermissions() == null) {
            setPermissions(permissionsCopy);
        } else {
            getPermissions().addAll(permissionsCopy);
        }
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
        if (getHostPath() != null)
            sb.append("HostPath: ").append(getHostPath()).append(",");
        if (getContainerPath() != null)
            sb.append("ContainerPath: ").append(getContainerPath()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;
        if (other.getHostPath() == null ^ this.getHostPath() == null)
            return false;
        if (other.getHostPath() != null && other.getHostPath().equals(this.getHostPath()) == false)
            return false;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostPath() == null) ? 0 : getHostPath().hashCode());
        hashCode = prime * hashCode + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
