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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerListeners(CreateLoadBalancerListenersRequest) CreateLoadBalancerListeners operation}.
 * <p>
 * Creates one or more listeners on a LoadBalancer for the specified
 * port. If a listener with the given port does not already exist, it
 * will be created; otherwise, the properties of the new listener must
 * match the properties of the existing listener.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#createLoadBalancerListeners(CreateLoadBalancerListenersRequest)
 */
public class CreateLoadBalancerListenersRequest extends AmazonWebServiceRequest {

    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of LoadBalancerPort, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     */
    private java.util.List<Listener> listeners;

    /**
     * Default constructor for a new CreateLoadBalancerListenersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateLoadBalancerListenersRequest() {}
    
    /**
     * Constructs a new CreateLoadBalancerListenersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name of the new LoadBalancer. The name
     * must be unique within your AWS account.
     * @param listeners A list of LoadBalancerPort,
     * <code>InstancePort</code>, <code>Protocol</code>, and
     * <code>SSLCertificateID</code> items.
     */
    public CreateLoadBalancerListenersRequest(String loadBalancerName, java.util.List<Listener> listeners) {
        this.loadBalancerName = loadBalancerName;
        this.listeners = listeners;
    }
    
    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     *
     * @return The name of the new LoadBalancer. The name must be unique within your
     *         AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     *
     * @param loadBalancerName The name of the new LoadBalancer. The name must be unique within your
     *         AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the new LoadBalancer. The name must be unique within your
     * AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the new LoadBalancer. The name must be unique within your
     *         AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerListenersRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of LoadBalancerPort, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     *
     * @return A list of LoadBalancerPort, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     */
    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
            listeners = new java.util.ArrayList<Listener>();
        }
        return listeners;
    }
    
    /**
     * A list of LoadBalancerPort, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     *
     * @param listeners A list of LoadBalancerPort, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>();
        if (listeners != null) {
            listenersCopy.addAll(listeners);
        }
        this.listeners = listenersCopy;
    }
    
    /**
     * A list of LoadBalancerPort, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of LoadBalancerPort, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerListenersRequest withListeners(Listener... listeners) {
        for (Listener value : listeners) {
            getListeners().add(value);
        }
        return this;
    }
    
    /**
     * A list of LoadBalancerPort, <code>InstancePort</code>,
     * <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of LoadBalancerPort, <code>InstancePort</code>,
     *         <code>Protocol</code>, and <code>SSLCertificateID</code> items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerListenersRequest withListeners(java.util.Collection<Listener> listeners) {
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
        sb.append("Listeners: " + listeners + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    