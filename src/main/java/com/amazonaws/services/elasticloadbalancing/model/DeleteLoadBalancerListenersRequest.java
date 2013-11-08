/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest) DeleteLoadBalancerListeners operation}.
 * <p>
 * Deletes listeners from the load balancer for the specified port.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest)
 */
public class DeleteLoadBalancerListenersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The mnemonic name associated with the load balancer.
     */
    private String loadBalancerName;

    /**
     * The client port number(s) of the load balancer listener(s) to be
     * removed.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Integer> loadBalancerPorts;

    /**
     * Default constructor for a new DeleteLoadBalancerListenersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteLoadBalancerListenersRequest() {}
    
    /**
     * Constructs a new DeleteLoadBalancerListenersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The mnemonic name associated with the load
     * balancer.
     * @param loadBalancerPorts The client port number(s) of the load
     * balancer listener(s) to be removed.
     */
    public DeleteLoadBalancerListenersRequest(String loadBalancerName, java.util.List<Integer> loadBalancerPorts) {
        setLoadBalancerName(loadBalancerName);
        setLoadBalancerPorts(loadBalancerPorts);
    }

    /**
     * The mnemonic name associated with the load balancer.
     *
     * @return The mnemonic name associated with the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The client port number(s) of the load balancer listener(s) to be
     * removed.
     *
     * @return The client port number(s) of the load balancer listener(s) to be
     *         removed.
     */
    public java.util.List<Integer> getLoadBalancerPorts() {
        if (loadBalancerPorts == null) {
              loadBalancerPorts = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>();
              loadBalancerPorts.setAutoConstruct(true);
        }
        return loadBalancerPorts;
    }
    
    /**
     * The client port number(s) of the load balancer listener(s) to be
     * removed.
     *
     * @param loadBalancerPorts The client port number(s) of the load balancer listener(s) to be
     *         removed.
     */
    public void setLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        if (loadBalancerPorts == null) {
            this.loadBalancerPorts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Integer> loadBalancerPortsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>(loadBalancerPorts.size());
        loadBalancerPortsCopy.addAll(loadBalancerPorts);
        this.loadBalancerPorts = loadBalancerPortsCopy;
    }
    
    /**
     * The client port number(s) of the load balancer listener(s) to be
     * removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPorts The client port number(s) of the load balancer listener(s) to be
     *         removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(Integer... loadBalancerPorts) {
        if (getLoadBalancerPorts() == null) setLoadBalancerPorts(new java.util.ArrayList<Integer>(loadBalancerPorts.length));
        for (Integer value : loadBalancerPorts) {
            getLoadBalancerPorts().add(value);
        }
        return this;
    }
    
    /**
     * The client port number(s) of the load balancer listener(s) to be
     * removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPorts The client port number(s) of the load balancer listener(s) to be
     *         removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        if (loadBalancerPorts == null) {
            this.loadBalancerPorts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Integer> loadBalancerPortsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Integer>(loadBalancerPorts.size());
            loadBalancerPortsCopy.addAll(loadBalancerPorts);
            this.loadBalancerPorts = loadBalancerPortsCopy;
        }

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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getLoadBalancerPorts() != null) sb.append("LoadBalancerPorts: " + getLoadBalancerPorts() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancerPorts() == null) ? 0 : getLoadBalancerPorts().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteLoadBalancerListenersRequest == false) return false;
        DeleteLoadBalancerListenersRequest other = (DeleteLoadBalancerListenersRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getLoadBalancerPorts() == null ^ this.getLoadBalancerPorts() == null) return false;
        if (other.getLoadBalancerPorts() != null && other.getLoadBalancerPorts().equals(this.getLoadBalancerPorts()) == false) return false; 
        return true;
    }
    
}
    