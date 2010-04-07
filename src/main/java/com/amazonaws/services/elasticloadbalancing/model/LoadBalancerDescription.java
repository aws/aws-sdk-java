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
 * The LoadBalancerDescription data type.
 * </p>
 */
public class LoadBalancerDescription {

    /**
     * Specifies the name associated with the LoadBalancer.
     */
    private String loadBalancerName;

    /**
     * Specifies the external DNS name associated with the LoadBalancer.
     */
    private String dNSName;

    /**
     * LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     * tuples in the Listeners element.
     */
    private java.util.List<Listener> listeners;

    /**
     * Specifies a list of Availability Zones.
     */
    private java.util.List<String> availabilityZones;

    /**
     * Provides a list of EC2 instance IDs for the LoadBalancer.
     */
    private java.util.List<Instance> instances;

    /**
     * Specifies information regarding the the various health probes
     * conducted on the LoadBalancer.
     */
    private HealthCheck healthCheck;

    /**
     * Provides the date and time the LoadBalancer was created.
     */
    private java.util.Date createdTime;

    /**
     * Specifies the name associated with the LoadBalancer.
     *
     * @return Specifies the name associated with the LoadBalancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * Specifies the name associated with the LoadBalancer.
     *
     * @param loadBalancerName Specifies the name associated with the LoadBalancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * Specifies the name associated with the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName Specifies the name associated with the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * Specifies the external DNS name associated with the LoadBalancer.
     *
     * @return Specifies the external DNS name associated with the LoadBalancer.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * Specifies the external DNS name associated with the LoadBalancer.
     *
     * @param dNSName Specifies the external DNS name associated with the LoadBalancer.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * Specifies the external DNS name associated with the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName Specifies the external DNS name associated with the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }
    
    
    /**
     * LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     * tuples in the Listeners element.
     *
     * @return LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     *         tuples in the Listeners element.
     */
    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
            listeners = new java.util.ArrayList<Listener>();
        }
        return listeners;
    }
    
    /**
     * LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     * tuples in the Listeners element.
     *
     * @param listeners LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     *         tuples in the Listeners element.
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>();
        if (listeners != null) {
            listenersCopy.addAll(listeners);
        }
        this.listeners = listenersCopy;
    }
    
    /**
     * LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     * tuples in the Listeners element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     *         tuples in the Listeners element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withListeners(Listener... listeners) {
        for (Listener value : listeners) {
            getListeners().add(value);
        }
        return this;
    }
    
    /**
     * LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     * tuples in the Listeners element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners LoadBalancerPort, InstancePort, and Protocol are returned in a list of
     *         tuples in the Listeners element.
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
     * Specifies a list of Availability Zones.
     *
     * @return Specifies a list of Availability Zones.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * Specifies a list of Availability Zones.
     *
     * @param availabilityZones Specifies a list of Availability Zones.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Specifies a list of Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Specifies a list of Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withAvailabilityZones(String... availabilityZones) {
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Specifies a list of Availability Zones.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Specifies a list of Availability Zones.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

        return this;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the LoadBalancer.
     *
     * @return Provides a list of EC2 instance IDs for the LoadBalancer.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the LoadBalancer.
     *
     * @param instances Provides a list of EC2 instance IDs for the LoadBalancer.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a list of EC2 instance IDs for the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withInstances(Instance... instances) {
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a list of EC2 instance IDs for the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;

        return this;
    }
    
    /**
     * Specifies information regarding the the various health probes
     * conducted on the LoadBalancer.
     *
     * @return Specifies information regarding the the various health probes
     *         conducted on the LoadBalancer.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * Specifies information regarding the the various health probes
     * conducted on the LoadBalancer.
     *
     * @param healthCheck Specifies information regarding the the various health probes
     *         conducted on the LoadBalancer.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * Specifies information regarding the the various health probes
     * conducted on the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck Specifies information regarding the the various health probes
     *         conducted on the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    
    
    /**
     * Provides the date and time the LoadBalancer was created.
     *
     * @return Provides the date and time the LoadBalancer was created.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * Provides the date and time the LoadBalancer was created.
     *
     * @param createdTime Provides the date and time the LoadBalancer was created.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * Provides the date and time the LoadBalancer was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime Provides the date and time the LoadBalancer was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    
    
}
    