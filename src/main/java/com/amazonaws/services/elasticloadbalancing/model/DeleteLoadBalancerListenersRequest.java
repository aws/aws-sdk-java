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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest) DeleteLoadBalancerListeners operation}.
 * <p>
 * Deletes listeners from the LoadBalancer for the specified port.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deleteLoadBalancerListeners(DeleteLoadBalancerListenersRequest)
 */
public class DeleteLoadBalancerListenersRequest extends AmazonWebServiceRequest {

    /**
     * The mnemonic name associated with the LoadBalancer.
     */
    private String loadBalancerName;

    /**
     * The client port number(s) of the LoadBalancerListener(s) to be
     * removed.
     */
    private java.util.List<Integer> loadBalancerPorts;

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
     * @param loadBalancerName The mnemonic name associated with the
     * LoadBalancer.
     * @param loadBalancerPorts The client port number(s) of the
     * LoadBalancerListener(s) to be removed.
     */
    public DeleteLoadBalancerListenersRequest(String loadBalancerName, java.util.List<Integer> loadBalancerPorts) {
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerPorts = loadBalancerPorts;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer.
     *
     * @return The mnemonic name associated with the LoadBalancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer.
     *
     * @param loadBalancerName The mnemonic name associated with the LoadBalancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * The client port number(s) of the LoadBalancerListener(s) to be
     * removed.
     *
     * @return The client port number(s) of the LoadBalancerListener(s) to be
     *         removed.
     */
    public java.util.List<Integer> getLoadBalancerPorts() {
        if (loadBalancerPorts == null) {
            loadBalancerPorts = new java.util.ArrayList<Integer>();
        }
        return loadBalancerPorts;
    }
    
    /**
     * The client port number(s) of the LoadBalancerListener(s) to be
     * removed.
     *
     * @param loadBalancerPorts The client port number(s) of the LoadBalancerListener(s) to be
     *         removed.
     */
    public void setLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        java.util.List<Integer> loadBalancerPortsCopy = new java.util.ArrayList<Integer>();
        if (loadBalancerPorts != null) {
            loadBalancerPortsCopy.addAll(loadBalancerPorts);
        }
        this.loadBalancerPorts = loadBalancerPortsCopy;
    }
    
    /**
     * The client port number(s) of the LoadBalancerListener(s) to be
     * removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPorts The client port number(s) of the LoadBalancerListener(s) to be
     *         removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(Integer... loadBalancerPorts) {
        for (Integer value : loadBalancerPorts) {
            getLoadBalancerPorts().add(value);
        }
        return this;
    }
    
    /**
     * The client port number(s) of the LoadBalancerListener(s) to be
     * removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPorts The client port number(s) of the LoadBalancerListener(s) to be
     *         removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteLoadBalancerListenersRequest withLoadBalancerPorts(java.util.Collection<Integer> loadBalancerPorts) {
        java.util.List<Integer> loadBalancerPortsCopy = new java.util.ArrayList<Integer>();
        if (loadBalancerPorts != null) {
            loadBalancerPortsCopy.addAll(loadBalancerPorts);
        }
        this.loadBalancerPorts = loadBalancerPortsCopy;

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
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("LoadBalancerPorts: " + loadBalancerPorts + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    