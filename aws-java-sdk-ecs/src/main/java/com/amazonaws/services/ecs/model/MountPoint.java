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
 * Details on a volume mount point that is used in a container definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/MountPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MountPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     */
    private String sourceVolume;
    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     */
    private String containerPath;
    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     * 
     * @param sourceVolume
     *        The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of
     *        task definition <code>volume</code>.
     */

    public void setSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     * 
     * @return The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of
     *         task definition <code>volume</code>.
     */

    public String getSourceVolume() {
        return this.sourceVolume;
    }

    /**
     * <p>
     * The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of task
     * definition <code>volume</code>.
     * </p>
     * 
     * @param sourceVolume
     *        The name of the volume to mount. Must be a volume name referenced in the <code>name</code> parameter of
     *        task definition <code>volume</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountPoint withSourceVolume(String sourceVolume) {
        setSourceVolume(sourceVolume);
        return this;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * 
     * @param containerPath
     *        The path on the container to mount the host volume at.
     */

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * 
     * @return The path on the container to mount the host volume at.
     */

    public String getContainerPath() {
        return this.containerPath;
    }

    /**
     * <p>
     * The path on the container to mount the host volume at.
     * </p>
     * 
     * @param containerPath
     *        The path on the container to mount the host volume at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountPoint withContainerPath(String containerPath) {
        setContainerPath(containerPath);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *        <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     */

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *         <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @param readOnly
     *        If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *        <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MountPoint withReadOnly(Boolean readOnly) {
        setReadOnly(readOnly);
        return this;
    }

    /**
     * <p>
     * If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     * <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     * </p>
     * 
     * @return If this value is <code>true</code>, the container has read-only access to the volume. If this value is
     *         <code>false</code>, then the container can write to the volume. The default value is <code>false</code>.
     */

    public Boolean isReadOnly() {
        return this.readOnly;
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
        if (getSourceVolume() != null)
            sb.append("SourceVolume: ").append(getSourceVolume()).append(",");
        if (getContainerPath() != null)
            sb.append("ContainerPath: ").append(getContainerPath()).append(",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: ").append(getReadOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MountPoint == false)
            return false;
        MountPoint other = (MountPoint) obj;
        if (other.getSourceVolume() == null ^ this.getSourceVolume() == null)
            return false;
        if (other.getSourceVolume() != null && other.getSourceVolume().equals(this.getSourceVolume()) == false)
            return false;
        if (other.getContainerPath() == null ^ this.getContainerPath() == null)
            return false;
        if (other.getContainerPath() != null && other.getContainerPath().equals(this.getContainerPath()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceVolume() == null) ? 0 : getSourceVolume().hashCode());
        hashCode = prime * hashCode + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        return hashCode;
    }

    @Override
    public MountPoint clone() {
        try {
            return (MountPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.MountPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
