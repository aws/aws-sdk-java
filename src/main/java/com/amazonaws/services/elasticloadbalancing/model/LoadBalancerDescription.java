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
 * Load Balancer Description
 */
public class LoadBalancerDescription {

    private String loadBalancerName;

    private String dNSName;

    private java.util.List<ListenerDescription> listenerDescriptions;

    private Policies policies;

    private java.util.List<String> availabilityZones;

    private java.util.List<Instance> instances;

    private HealthCheck healthCheck;

    private java.util.Date createdTime;

    /**
     * Returns the value of the LoadBalancerName property for this object.
     *
     * @return The value of the LoadBalancerName property for this object.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * Sets the value of the LoadBalancerName property for this object.
     *
     * @param loadBalancerName The new value for the LoadBalancerName property for this object.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * Sets the value of the LoadBalancerName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The new value for the LoadBalancerName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * Returns the value of the DNSName property for this object.
     *
     * @return The value of the DNSName property for this object.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * Sets the value of the DNSName property for this object.
     *
     * @param dNSName The new value for the DNSName property for this object.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * Sets the value of the DNSName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName The new value for the DNSName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }
    
    
    /**
     * Returns the value of the ListenerDescriptions property for this
     * object.
     *
     * @return The value of the ListenerDescriptions property for this object.
     */
    public java.util.List<ListenerDescription> getListenerDescriptions() {
        if (listenerDescriptions == null) {
            listenerDescriptions = new java.util.ArrayList<ListenerDescription>();
        }
        return listenerDescriptions;
    }
    
    /**
     * Sets the value of the ListenerDescriptions property for this object.
     *
     * @param listenerDescriptions The new value for the ListenerDescriptions property for this object.
     */
    public void setListenerDescriptions(java.util.Collection<ListenerDescription> listenerDescriptions) {
        java.util.List<ListenerDescription> listenerDescriptionsCopy = new java.util.ArrayList<ListenerDescription>();
        if (listenerDescriptions != null) {
            listenerDescriptionsCopy.addAll(listenerDescriptions);
        }
        this.listenerDescriptions = listenerDescriptionsCopy;
    }
    
    /**
     * Sets the value of the ListenerDescriptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listenerDescriptions The new value for the ListenerDescriptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withListenerDescriptions(ListenerDescription... listenerDescriptions) {
        for (ListenerDescription value : listenerDescriptions) {
            getListenerDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ListenerDescriptions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listenerDescriptions The new value for the ListenerDescriptions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withListenerDescriptions(java.util.Collection<ListenerDescription> listenerDescriptions) {
        java.util.List<ListenerDescription> listenerDescriptionsCopy = new java.util.ArrayList<ListenerDescription>();
        if (listenerDescriptions != null) {
            listenerDescriptionsCopy.addAll(listenerDescriptions);
        }
        this.listenerDescriptions = listenerDescriptionsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Policies property for this object.
     *
     * @return The value of the Policies property for this object.
     */
    public Policies getPolicies() {
        return policies;
    }
    
    /**
     * Sets the value of the Policies property for this object.
     *
     * @param policies The new value for the Policies property for this object.
     */
    public void setPolicies(Policies policies) {
        this.policies = policies;
    }
    
    /**
     * Sets the value of the Policies property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies The new value for the Policies property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }
    
    
    /**
     * Returns the value of the AvailabilityZones property for this object.
     *
     * @return The value of the AvailabilityZones property for this object.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * Sets the value of the AvailabilityZones property for this object.
     *
     * @param availabilityZones The new value for the AvailabilityZones property for this object.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Sets the value of the AvailabilityZones property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones The new value for the AvailabilityZones property for this object.
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
     * Sets the value of the AvailabilityZones property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones The new value for the AvailabilityZones property for this object.
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
     * Returns the value of the Instances property for this object.
     *
     * @return The value of the Instances property for this object.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     *
     * @param instances The new value for the Instances property for this object.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The new value for the Instances property for this object.
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
     * Sets the value of the Instances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The new value for the Instances property for this object.
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
     * Returns the value of the HealthCheck property for this object.
     *
     * @return The value of the HealthCheck property for this object.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * Sets the value of the HealthCheck property for this object.
     *
     * @param healthCheck The new value for the HealthCheck property for this object.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * Sets the value of the HealthCheck property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck The new value for the HealthCheck property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    
    
    /**
     * Returns the value of the CreatedTime property for this object.
     *
     * @return The value of the CreatedTime property for this object.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * Sets the value of the CreatedTime property for this object.
     *
     * @param createdTime The new value for the CreatedTime property for this object.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * Sets the value of the CreatedTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime The new value for the CreatedTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoadBalancerDescription withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
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
        sb.append("DNSName: " + dNSName + ", ");
        sb.append("ListenerDescriptions: " + listenerDescriptions + ", ");
        sb.append("Policies: " + policies + ", ");
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("HealthCheck: " + healthCheck + ", ");
        sb.append("CreatedTime: " + createdTime + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    