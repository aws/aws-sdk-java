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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a device that Linux processes in a container can access.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaDeviceMount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaDeviceMount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The mount path for the device in the file system.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     */
    private String permission;
    /**
     * <p>
     * Whether or not to add the component's system user as an owner of the device.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean addGroupOwner;

    /**
     * <p>
     * The mount path for the device in the file system.
     * </p>
     * 
     * @param path
     *        The mount path for the device in the file system.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The mount path for the device in the file system.
     * </p>
     * 
     * @return The mount path for the device in the file system.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The mount path for the device in the file system.
     * </p>
     * 
     * @param path
     *        The mount path for the device in the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDeviceMount withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @param permission
     *        The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *        <p>
     *        Default: <code>ro</code>
     * @see LambdaFilesystemPermission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @return The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *         <p>
     *         Default: <code>ro</code>
     * @see LambdaFilesystemPermission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @param permission
     *        The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *        <p>
     *        Default: <code>ro</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFilesystemPermission
     */

    public LambdaDeviceMount withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @param permission
     *        The permission to access the device: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *        <p>
     *        Default: <code>ro</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFilesystemPermission
     */

    public LambdaDeviceMount withPermission(LambdaFilesystemPermission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * Whether or not to add the component's system user as an owner of the device.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param addGroupOwner
     *        Whether or not to add the component's system user as an owner of the device.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAddGroupOwner(Boolean addGroupOwner) {
        this.addGroupOwner = addGroupOwner;
    }

    /**
     * <p>
     * Whether or not to add the component's system user as an owner of the device.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Whether or not to add the component's system user as an owner of the device.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAddGroupOwner() {
        return this.addGroupOwner;
    }

    /**
     * <p>
     * Whether or not to add the component's system user as an owner of the device.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param addGroupOwner
     *        Whether or not to add the component's system user as an owner of the device.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaDeviceMount withAddGroupOwner(Boolean addGroupOwner) {
        setAddGroupOwner(addGroupOwner);
        return this;
    }

    /**
     * <p>
     * Whether or not to add the component's system user as an owner of the device.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Whether or not to add the component's system user as an owner of the device.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isAddGroupOwner() {
        return this.addGroupOwner;
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getAddGroupOwner() != null)
            sb.append("AddGroupOwner: ").append(getAddGroupOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaDeviceMount == false)
            return false;
        LambdaDeviceMount other = (LambdaDeviceMount) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getAddGroupOwner() == null ^ this.getAddGroupOwner() == null)
            return false;
        if (other.getAddGroupOwner() != null && other.getAddGroupOwner().equals(this.getAddGroupOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getAddGroupOwner() == null) ? 0 : getAddGroupOwner().hashCode());
        return hashCode;
    }

    @Override
    public LambdaDeviceMount clone() {
        try {
            return (LambdaDeviceMount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaDeviceMountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
