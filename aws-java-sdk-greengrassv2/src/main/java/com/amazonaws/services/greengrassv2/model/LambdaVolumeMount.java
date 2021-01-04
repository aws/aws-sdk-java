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
 * Contains information about a volume that Linux processes in a container can access. When you define a volume, the AWS
 * IoT Greengrass Core software mounts the source files to the destination inside the container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/LambdaVolumeMount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaVolumeMount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the physical volume in the file system.
     * </p>
     */
    private String sourcePath;
    /**
     * <p>
     * The path to the logical volume in the file system.
     * </p>
     */
    private String destinationPath;
    /**
     * <p>
     * The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     */
    private String permission;
    /**
     * <p>
     * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean addGroupOwner;

    /**
     * <p>
     * The path to the physical volume in the file system.
     * </p>
     * 
     * @param sourcePath
     *        The path to the physical volume in the file system.
     */

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * <p>
     * The path to the physical volume in the file system.
     * </p>
     * 
     * @return The path to the physical volume in the file system.
     */

    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * <p>
     * The path to the physical volume in the file system.
     * </p>
     * 
     * @param sourcePath
     *        The path to the physical volume in the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaVolumeMount withSourcePath(String sourcePath) {
        setSourcePath(sourcePath);
        return this;
    }

    /**
     * <p>
     * The path to the logical volume in the file system.
     * </p>
     * 
     * @param destinationPath
     *        The path to the logical volume in the file system.
     */

    public void setDestinationPath(String destinationPath) {
        this.destinationPath = destinationPath;
    }

    /**
     * <p>
     * The path to the logical volume in the file system.
     * </p>
     * 
     * @return The path to the logical volume in the file system.
     */

    public String getDestinationPath() {
        return this.destinationPath;
    }

    /**
     * <p>
     * The path to the logical volume in the file system.
     * </p>
     * 
     * @param destinationPath
     *        The path to the logical volume in the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaVolumeMount withDestinationPath(String destinationPath) {
        setDestinationPath(destinationPath);
        return this;
    }

    /**
     * <p>
     * The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @param permission
     *        The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *        <p>
     *        Default: <code>ro</code>
     * @see LambdaFilesystemPermission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @return The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *         <p>
     *         Default: <code>ro</code>
     * @see LambdaFilesystemPermission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @param permission
     *        The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *        <p>
     *        Default: <code>ro</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFilesystemPermission
     */

    public LambdaVolumeMount withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).
     * </p>
     * <p>
     * Default: <code>ro</code>
     * </p>
     * 
     * @param permission
     *        The permission to access the volume: read/only (<code>ro</code>) or read/write (<code>rw</code>).</p>
     *        <p>
     *        Default: <code>ro</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LambdaFilesystemPermission
     */

    public LambdaVolumeMount withPermission(LambdaFilesystemPermission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param addGroupOwner
     *        Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setAddGroupOwner(Boolean addGroupOwner) {
        this.addGroupOwner = addGroupOwner;
    }

    /**
     * <p>
     * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getAddGroupOwner() {
        return this.addGroupOwner;
    }

    /**
     * <p>
     * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param addGroupOwner
     *        Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaVolumeMount withAddGroupOwner(Boolean addGroupOwner) {
        setAddGroupOwner(addGroupOwner);
        return this;
    }

    /**
     * <p>
     * Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Whether or not to add the AWS IoT Greengrass user group as an owner of the volume.</p>
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
        if (getSourcePath() != null)
            sb.append("SourcePath: ").append(getSourcePath()).append(",");
        if (getDestinationPath() != null)
            sb.append("DestinationPath: ").append(getDestinationPath()).append(",");
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

        if (obj instanceof LambdaVolumeMount == false)
            return false;
        LambdaVolumeMount other = (LambdaVolumeMount) obj;
        if (other.getSourcePath() == null ^ this.getSourcePath() == null)
            return false;
        if (other.getSourcePath() != null && other.getSourcePath().equals(this.getSourcePath()) == false)
            return false;
        if (other.getDestinationPath() == null ^ this.getDestinationPath() == null)
            return false;
        if (other.getDestinationPath() != null && other.getDestinationPath().equals(this.getDestinationPath()) == false)
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

        hashCode = prime * hashCode + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        hashCode = prime * hashCode + ((getDestinationPath() == null) ? 0 : getDestinationPath().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getAddGroupOwner() == null) ? 0 : getAddGroupOwner().hashCode());
        return hashCode;
    }

    @Override
    public LambdaVolumeMount clone() {
        try {
            return (LambdaVolumeMount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.LambdaVolumeMountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
