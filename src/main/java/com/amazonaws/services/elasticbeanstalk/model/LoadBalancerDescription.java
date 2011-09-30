/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

/**
 * <p>
 * Describes the details of a LoadBalancer.
 * </p>
 */
public class LoadBalancerDescription {

    /**
     * The name of the LoadBalancer.
     */
    private String loadBalancerName;

    /**
     * The domain name of the LoadBalancer.
     */
    private String domain;

    /**
     * A list of Listeners used by the LoadBalancer.
     */
    private java.util.List<Listener> listeners;

    /**
     * The name of the LoadBalancer.
     *
     * @return The name of the LoadBalancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the LoadBalancer.
     *
     * @param loadBalancerName The name of the LoadBalancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * The domain name of the LoadBalancer.
     *
     * @return The domain name of the LoadBalancer.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The domain name of the LoadBalancer.
     *
     * @param domain The domain name of the LoadBalancer.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The domain name of the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domain The domain name of the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withDomain(String domain) {
        this.domain = domain;
        return this;
    }
    
    
    /**
     * A list of Listeners used by the LoadBalancer.
     *
     * @return A list of Listeners used by the LoadBalancer.
     */
    public java.util.List<Listener> getListeners() {
        
        if (listeners == null) {
            listeners = new java.util.ArrayList<Listener>();
        }
        return listeners;
    }
    
    /**
     * A list of Listeners used by the LoadBalancer.
     *
     * @param listeners A list of Listeners used by the LoadBalancer.
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>();
        if (listeners != null) {
            listenersCopy.addAll(listeners);
        }
        this.listeners = listenersCopy;
    }
    
    /**
     * A list of Listeners used by the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of Listeners used by the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withListeners(Listener... listeners) {
        if (getListeners() == null) setListeners(new java.util.ArrayList<Listener>());
        for (Listener value : listeners) {
            getListeners().add(value);
        }
        return this;
    }
    
    /**
     * A list of Listeners used by the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of Listeners used by the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withListeners(java.util.Collection<Listener> listeners) {
        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>();
        if (listeners != null) {
            listenersCopy.addAll(listeners);
        }
        this.listeners = listenersCopy;

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
        sb.append("Domain: " + domain + ", ");
        sb.append("Listeners: " + listeners + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    