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
 * <p>
 * The Listener data type.
 * </p>
 */
public class Listener {
        
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     */
    private String protocol;

    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     */
    private Integer loadBalancerPort;

    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     *
     * @return Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     *
     * @param protocol Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     *
     * @return Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     *
     * @param loadBalancerPort Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }
    
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the LoadBalancer.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the LoadBalancer.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    
    
}
    