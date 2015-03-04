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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class MountPoint implements Serializable, Cloneable {

    /**
     * The name of the volume to mount.
     */
    private String sourceVolume;

    /**
     * The path on the container to mount the host volume at.
     */
    private String containerPath;

    /**
     * If this value is <code>true</code>, the container has read-only access
     * to the volume. If this value is <code>false</code>, then the container
     * can write to the volume. The default value is <code>false</code>.
     */
    private Boolean readOnly;

    /**
     * The name of the volume to mount.
     *
     * @return The name of the volume to mount.
     */
    public String getSourceVolume() {
        return sourceVolume;
    }
    
    /**
     * The name of the volume to mount.
     *
     * @param sourceVolume The name of the volume to mount.
     */
    public void setSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
    }
    
    /**
     * The name of the volume to mount.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceVolume The name of the volume to mount.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MountPoint withSourceVolume(String sourceVolume) {
        this.sourceVolume = sourceVolume;
        return this;
    }

    /**
     * The path on the container to mount the host volume at.
     *
     * @return The path on the container to mount the host volume at.
     */
    public String getContainerPath() {
        return containerPath;
    }
    
    /**
     * The path on the container to mount the host volume at.
     *
     * @param containerPath The path on the container to mount the host volume at.
     */
    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }
    
    /**
     * The path on the container to mount the host volume at.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerPath The path on the container to mount the host volume at.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MountPoint withContainerPath(String containerPath) {
        this.containerPath = containerPath;
        return this;
    }

    /**
     * If this value is <code>true</code>, the container has read-only access
     * to the volume. If this value is <code>false</code>, then the container
     * can write to the volume. The default value is <code>false</code>.
     *
     * @return If this value is <code>true</code>, the container has read-only access
     *         to the volume. If this value is <code>false</code>, then the container
     *         can write to the volume. The default value is <code>false</code>.
     */
    public Boolean isReadOnly() {
        return readOnly;
    }
    
    /**
     * If this value is <code>true</code>, the container has read-only access
     * to the volume. If this value is <code>false</code>, then the container
     * can write to the volume. The default value is <code>false</code>.
     *
     * @param readOnly If this value is <code>true</code>, the container has read-only access
     *         to the volume. If this value is <code>false</code>, then the container
     *         can write to the volume. The default value is <code>false</code>.
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }
    
    /**
     * If this value is <code>true</code>, the container has read-only access
     * to the volume. If this value is <code>false</code>, then the container
     * can write to the volume. The default value is <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readOnly If this value is <code>true</code>, the container has read-only access
     *         to the volume. If this value is <code>false</code>, then the container
     *         can write to the volume. The default value is <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public MountPoint withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * If this value is <code>true</code>, the container has read-only access
     * to the volume. If this value is <code>false</code>, then the container
     * can write to the volume. The default value is <code>false</code>.
     *
     * @return If this value is <code>true</code>, the container has read-only access
     *         to the volume. If this value is <code>false</code>, then the container
     *         can write to the volume. The default value is <code>false</code>.
     */
    public Boolean getReadOnly() {
        return readOnly;
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
        if (getSourceVolume() != null) sb.append("SourceVolume: " + getSourceVolume() + ",");
        if (getContainerPath() != null) sb.append("ContainerPath: " + getContainerPath() + ",");
        if (isReadOnly() != null) sb.append("ReadOnly: " + isReadOnly() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceVolume() == null) ? 0 : getSourceVolume().hashCode()); 
        hashCode = prime * hashCode + ((getContainerPath() == null) ? 0 : getContainerPath().hashCode()); 
        hashCode = prime * hashCode + ((isReadOnly() == null) ? 0 : isReadOnly().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof MountPoint == false) return false;
        MountPoint other = (MountPoint)obj;
        
        if (other.getSourceVolume() == null ^ this.getSourceVolume() == null) return false;
        if (other.getSourceVolume() != null && other.getSourceVolume().equals(this.getSourceVolume()) == false) return false; 
        if (other.getContainerPath() == null ^ this.getContainerPath() == null) return false;
        if (other.getContainerPath() != null && other.getContainerPath().equals(this.getContainerPath()) == false) return false; 
        if (other.isReadOnly() == null ^ this.isReadOnly() == null) return false;
        if (other.isReadOnly() != null && other.isReadOnly().equals(this.isReadOnly()) == false) return false; 
        return true;
    }
    
    @Override
    public MountPoint clone() {
        try {
            return (MountPoint) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    