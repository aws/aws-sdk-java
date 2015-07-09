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
 * <p>
 * Details on a data volume from another container.
 * </p>
 */
public class VolumeFrom implements Serializable, Cloneable {

    /**
     * The name of the container to mount volumes from.
     */
    private String sourceContainer;

    /**
     * If this value is <code>true</code>, the container has read-only access
     * to the volume. If this value is <code>false</code>, then the container
     * can write to the volume. The default value is <code>false</code>.
     */
    private Boolean readOnly;

    /**
     * The name of the container to mount volumes from.
     *
     * @return The name of the container to mount volumes from.
     */
    public String getSourceContainer() {
        return sourceContainer;
    }
    
    /**
     * The name of the container to mount volumes from.
     *
     * @param sourceContainer The name of the container to mount volumes from.
     */
    public void setSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
    }
    
    /**
     * The name of the container to mount volumes from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceContainer The name of the container to mount volumes from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VolumeFrom withSourceContainer(String sourceContainer) {
        this.sourceContainer = sourceContainer;
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
    public VolumeFrom withReadOnly(Boolean readOnly) {
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
        if (getSourceContainer() != null) sb.append("SourceContainer: " + getSourceContainer() + ",");
        if (isReadOnly() != null) sb.append("ReadOnly: " + isReadOnly() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceContainer() == null) ? 0 : getSourceContainer().hashCode()); 
        hashCode = prime * hashCode + ((isReadOnly() == null) ? 0 : isReadOnly().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VolumeFrom == false) return false;
        VolumeFrom other = (VolumeFrom)obj;
        
        if (other.getSourceContainer() == null ^ this.getSourceContainer() == null) return false;
        if (other.getSourceContainer() != null && other.getSourceContainer().equals(this.getSourceContainer()) == false) return false; 
        if (other.isReadOnly() == null ^ this.isReadOnly() == null) return false;
        if (other.isReadOnly() != null && other.isReadOnly().equals(this.isReadOnly()) == false) return false; 
        return true;
    }
    
    @Override
    public VolumeFrom clone() {
        try {
            return (VolumeFrom) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    