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
 * Port mappings allow containers to access ports on the host container
 * instance to send or receive traffic. Port mappings are specified as
 * part of the container definition.
 * </p>
 */
public class PortMapping implements Serializable {

    /**
     * The port number on the container that should be used with the port
     * mapping.
     */
    private Integer containerPort;

    /**
     * The port number on the host that should be used with the port mapping.
     */
    private Integer hostPort;

    /**
     * The port number on the container that should be used with the port
     * mapping.
     *
     * @return The port number on the container that should be used with the port
     *         mapping.
     */
    public Integer getContainerPort() {
        return containerPort;
    }
    
    /**
     * The port number on the container that should be used with the port
     * mapping.
     *
     * @param containerPort The port number on the container that should be used with the port
     *         mapping.
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }
    
    /**
     * The port number on the container that should be used with the port
     * mapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerPort The port number on the container that should be used with the port
     *         mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PortMapping withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * The port number on the host that should be used with the port mapping.
     *
     * @return The port number on the host that should be used with the port mapping.
     */
    public Integer getHostPort() {
        return hostPort;
    }
    
    /**
     * The port number on the host that should be used with the port mapping.
     *
     * @param hostPort The port number on the host that should be used with the port mapping.
     */
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }
    
    /**
     * The port number on the host that should be used with the port mapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostPort The port number on the host that should be used with the port mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PortMapping withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
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
        if (getContainerPort() != null) sb.append("ContainerPort: " + getContainerPort() + ",");
        if (getHostPort() != null) sb.append("HostPort: " + getHostPort() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode()); 
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PortMapping == false) return false;
        PortMapping other = (PortMapping)obj;
        
        if (other.getContainerPort() == null ^ this.getContainerPort() == null) return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false) return false; 
        if (other.getHostPort() == null ^ this.getHostPort() == null) return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false) return false; 
        return true;
    }
    
}
    