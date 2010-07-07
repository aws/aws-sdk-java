/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Listener
 */
public class Listener {

    private String protocol;

    private Integer loadBalancerPort;

    private Integer instancePort;

    /**
     * Returns the value of the Protocol property for this object.
     *
     * @return The value of the Protocol property for this object.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * Sets the value of the Protocol property for this object.
     *
     * @param protocol The new value for the Protocol property for this object.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * Sets the value of the Protocol property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol The new value for the Protocol property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    
    /**
     * Returns the value of the LoadBalancerPort property for this object.
     *
     * @return The value of the LoadBalancerPort property for this object.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * Sets the value of the LoadBalancerPort property for this object.
     *
     * @param loadBalancerPort The new value for the LoadBalancerPort property for this object.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * Sets the value of the LoadBalancerPort property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort The new value for the LoadBalancerPort property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }
    
    
    /**
     * Returns the value of the InstancePort property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return The value of the InstancePort property for this object.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * Sets the value of the InstancePort property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort The new value for the InstancePort property for this object.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * Sets the value of the InstancePort property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort The new value for the InstancePort property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
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
        sb.append("Protocol: " + protocol + ", ");
        sb.append("LoadBalancerPort: " + loadBalancerPort + ", ");
        sb.append("InstancePort: " + instancePort + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    