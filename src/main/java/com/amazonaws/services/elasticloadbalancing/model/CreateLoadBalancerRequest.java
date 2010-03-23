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
 * <p>
 * 
 * </p>
 */
public class CreateLoadBalancerRequest extends AmazonWebServiceRequest {
        
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers requests on the specified protocol
     * and received by Elastic Load Balancing on the LoadBalancerPort are
     * load balanced across the registered instances and sent to port
     * InstancePort.
     */
    private String loadBalancerName;

    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     */
    private java.util.List<Listener> listeners;

    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     */
    private java.util.List<String> availabilityZones;

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers requests on the specified protocol
     * and received by Elastic Load Balancing on the LoadBalancerPort are
     * load balanced across the registered instances and sent to port
     * InstancePort.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within your set of LoadBalancers requests on the specified protocol
     *         and received by Elastic Load Balancing on the LoadBalancerPort are
     *         load balanced across the registered instances and sent to port
     *         InstancePort.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers requests on the specified protocol
     * and received by Elastic Load Balancing on the LoadBalancerPort are
     * load balanced across the registered instances and sent to port
     * InstancePort.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within your set of LoadBalancers requests on the specified protocol
     *         and received by Elastic Load Balancing on the LoadBalancerPort are
     *         load balanced across the registered instances and sent to port
     *         InstancePort.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within your set of LoadBalancers requests on the specified protocol
     * and received by Elastic Load Balancing on the LoadBalancerPort are
     * load balanced across the registered instances and sent to port
     * InstancePort.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within your set of LoadBalancers requests on the specified protocol
     *         and received by Elastic Load Balancing on the LoadBalancerPort are
     *         load balanced across the registered instances and sent to port
     *         InstancePort.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     *
     * @return A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
     */
    public java.util.List<Listener> getListeners() {
        if (listeners == null) {
            listeners = new java.util.ArrayList<Listener>();
        }
        return listeners;
    }
    
    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     *
     * @param listeners A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
     */
    public void setListeners(java.util.Collection<Listener> listeners) {
        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>();
        if (listeners != null) {
            listenersCopy.addAll(listeners);
        }
        this.listeners = listenersCopy;
    }
    
    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withListeners(Listener... listeners) {
        for (Listener value : listeners) {
            getListeners().add(value);
        }
        return this;
    }
    
    /**
     * A list of the following tuples: LoadBalancerPort, InstancePort, and
     * Protocol.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listeners A list of the following tuples: LoadBalancerPort, InstancePort, and
     *         Protocol.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withListeners(java.util.Collection<Listener> listeners) {
        java.util.List<Listener> listenersCopy = new java.util.ArrayList<Listener>();
        if (listeners != null) {
            listenersCopy.addAll(listeners);
        }
        this.listeners = listenersCopy;

        return this;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     *
     * @return A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<String>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withAvailabilityZones(String... availabilityZones) {
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of Availability Zones. <p> At least one Availability Zone must
     * be specified. Specified Availability Zones must be in the same EC2
     * Region as the LoadBalancer. Traffic will be equally distributed across
     * all zones. <p> This list can be modified after the creation of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of Availability Zones. <p> At least one Availability Zone must
     *         be specified. Specified Availability Zones must be in the same EC2
     *         Region as the LoadBalancer. Traffic will be equally distributed across
     *         all zones. <p> This list can be modified after the creation of the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        java.util.List<String> availabilityZonesCopy = new java.util.ArrayList<String>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

        return this;
    }
    
}
    