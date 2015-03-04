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
public class NetworkBinding implements Serializable, Cloneable {

    /**
     * The IP address that the container is bound to on the container
     * instance.
     */
    private String bindIP;

    /**
     * The port number on the container that is be used with the network
     * binding.
     */
    private Integer containerPort;

    /**
     * The port number on the host that is used with the network binding.
     */
    private Integer hostPort;

    /**
     * The IP address that the container is bound to on the container
     * instance.
     *
     * @return The IP address that the container is bound to on the container
     *         instance.
     */
    public String getBindIP() {
        return bindIP;
    }
    
    /**
     * The IP address that the container is bound to on the container
     * instance.
     *
     * @param bindIP The IP address that the container is bound to on the container
     *         instance.
     */
    public void setBindIP(String bindIP) {
        this.bindIP = bindIP;
    }
    
    /**
     * The IP address that the container is bound to on the container
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bindIP The IP address that the container is bound to on the container
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkBinding withBindIP(String bindIP) {
        this.bindIP = bindIP;
        return this;
    }

    /**
     * The port number on the container that is be used with the network
     * binding.
     *
     * @return The port number on the container that is be used with the network
     *         binding.
     */
    public Integer getContainerPort() {
        return containerPort;
    }
    
    /**
     * The port number on the container that is be used with the network
     * binding.
     *
     * @param containerPort The port number on the container that is be used with the network
     *         binding.
     */
    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }
    
    /**
     * The port number on the container that is be used with the network
     * binding.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param containerPort The port number on the container that is be used with the network
     *         binding.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkBinding withContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * The port number on the host that is used with the network binding.
     *
     * @return The port number on the host that is used with the network binding.
     */
    public Integer getHostPort() {
        return hostPort;
    }
    
    /**
     * The port number on the host that is used with the network binding.
     *
     * @param hostPort The port number on the host that is used with the network binding.
     */
    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }
    
    /**
     * The port number on the host that is used with the network binding.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostPort The port number on the host that is used with the network binding.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public NetworkBinding withHostPort(Integer hostPort) {
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
        if (getBindIP() != null) sb.append("BindIP: " + getBindIP() + ",");
        if (getContainerPort() != null) sb.append("ContainerPort: " + getContainerPort() + ",");
        if (getHostPort() != null) sb.append("HostPort: " + getHostPort() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBindIP() == null) ? 0 : getBindIP().hashCode()); 
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode()); 
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof NetworkBinding == false) return false;
        NetworkBinding other = (NetworkBinding)obj;
        
        if (other.getBindIP() == null ^ this.getBindIP() == null) return false;
        if (other.getBindIP() != null && other.getBindIP().equals(this.getBindIP()) == false) return false; 
        if (other.getContainerPort() == null ^ this.getContainerPort() == null) return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false) return false; 
        if (other.getHostPort() == null ^ this.getHostPort() == null) return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false) return false; 
        return true;
    }
    
    @Override
    public NetworkBinding clone() {
        try {
            return (NetworkBinding) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    