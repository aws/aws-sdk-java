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
public class Volume implements Serializable, Cloneable {

    /**
     * The name of the volume. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     */
    private String name;

    /**
     * The path on the host container instance that is presented to the
     * containers which access the volume. If this parameter is empty, then
     * the Docker daemon assigns a host path for you.
     */
    private HostVolumeProperties host;

    /**
     * The name of the volume. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     *
     * @return The name of the volume. This name is referenced in the
     *         <code>sourceVolume</code> parameter of container definition
     *         <code>mountPoints</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the volume. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     *
     * @param name The name of the volume. This name is referenced in the
     *         <code>sourceVolume</code> parameter of container definition
     *         <code>mountPoints</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the volume. This name is referenced in the
     * <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the volume. This name is referenced in the
     *         <code>sourceVolume</code> parameter of container definition
     *         <code>mountPoints</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The path on the host container instance that is presented to the
     * containers which access the volume. If this parameter is empty, then
     * the Docker daemon assigns a host path for you.
     *
     * @return The path on the host container instance that is presented to the
     *         containers which access the volume. If this parameter is empty, then
     *         the Docker daemon assigns a host path for you.
     */
    public HostVolumeProperties getHost() {
        return host;
    }
    
    /**
     * The path on the host container instance that is presented to the
     * containers which access the volume. If this parameter is empty, then
     * the Docker daemon assigns a host path for you.
     *
     * @param host The path on the host container instance that is presented to the
     *         containers which access the volume. If this parameter is empty, then
     *         the Docker daemon assigns a host path for you.
     */
    public void setHost(HostVolumeProperties host) {
        this.host = host;
    }
    
    /**
     * The path on the host container instance that is presented to the
     * containers which access the volume. If this parameter is empty, then
     * the Docker daemon assigns a host path for you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param host The path on the host container instance that is presented to the
     *         containers which access the volume. If this parameter is empty, then
     *         the Docker daemon assigns a host path for you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Volume withHost(HostVolumeProperties host) {
        this.host = host;
        return this;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getHost() != null) sb.append("Host: " + getHost() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Volume == false) return false;
        Volume other = (Volume)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getHost() == null ^ this.getHost() == null) return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false) return false; 
        return true;
    }
    
    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    