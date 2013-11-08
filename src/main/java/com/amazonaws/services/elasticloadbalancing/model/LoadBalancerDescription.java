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


/**
 * <p>
 * Contains the result of a successful invocation of DescribeLoadBalancers.
 * </p>
 */
public class LoadBalancerDescription implements Serializable {

    /**
     * Specifies the name associated with the load balancer.
     */
    private String loadBalancerName;

    /**
     * Specifies the external DNS name associated with the load balancer.
     */
    private String dNSName;

    /**
     * Provides the name of the Amazon Route 53 hosted zone that is
     * associated with the load balancer. For information on how to associate
     * your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     */
    private String canonicalHostedZoneName;

    /**
     * Provides the ID of the Amazon Route 53 hosted zone name that is
     * associated with the load balancer. For information on how to associate
     * or disassociate your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     */
    private String canonicalHostedZoneNameID;

    /**
     * LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     * PolicyNames are returned in a list of tuples in the
     * ListenerDescriptions element.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ListenerDescription> listenerDescriptions;

    /**
     * Provides a list of policies defined for the load balancer.
     */
    private Policies policies;

    /**
     * Contains a list of back-end server descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BackendServerDescription> backendServerDescriptions;

    /**
     * Specifies a list of Availability Zones.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * Provides a list of VPC subnet IDs for the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnets;

    /**
     * Provides the ID of the VPC attached to the load balancer.
     */
    private String vPCId;

    /**
     * Provides a list of EC2 instance IDs for the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * Specifies information regarding the various health probes conducted on
     * the load balancer.
     */
    private HealthCheck healthCheck;

    /**
     * The security group that you can use as part of your inbound rules for
     * your load balancer's back-end Amazon EC2 application instances. To
     * only allow traffic from load balancers, add a security group rule to
     * your back end instance that specifies this source security group as
     * the inbound source.
     */
    private SourceSecurityGroup sourceSecurityGroup;

    /**
     * The security groups the load balancer is a member of (VPC only).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * Provides the date and time the load balancer was created.
     */
    private java.util.Date createdTime;

    /**
     * Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     * <code>internet-facing</code>, the load balancer has a publicly
     * resolvable DNS name that resolves to public IP addresses. <p>If the
     * <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * publicly resolvable DNS name that resolves to private IP addresses.
     * <p> This option is only available for load balancers attached to an
     * Amazon VPC.
     */
    private String scheme;

    /**
     * Default constructor for a new LoadBalancerDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public LoadBalancerDescription() {}
    
    /**
     * Specifies the name associated with the load balancer.
     *
     * @return Specifies the name associated with the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * Specifies the name associated with the load balancer.
     *
     * @param loadBalancerName Specifies the name associated with the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * Specifies the name associated with the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName Specifies the name associated with the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * Specifies the external DNS name associated with the load balancer.
     *
     * @return Specifies the external DNS name associated with the load balancer.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * Specifies the external DNS name associated with the load balancer.
     *
     * @param dNSName Specifies the external DNS name associated with the load balancer.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * Specifies the external DNS name associated with the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName Specifies the external DNS name associated with the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * Provides the name of the Amazon Route 53 hosted zone that is
     * associated with the load balancer. For information on how to associate
     * your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     *
     * @return Provides the name of the Amazon Route 53 hosted zone that is
     *         associated with the load balancer. For information on how to associate
     *         your load balancer with a hosted zone, go to <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     *         Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     */
    public String getCanonicalHostedZoneName() {
        return canonicalHostedZoneName;
    }
    
    /**
     * Provides the name of the Amazon Route 53 hosted zone that is
     * associated with the load balancer. For information on how to associate
     * your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     *
     * @param canonicalHostedZoneName Provides the name of the Amazon Route 53 hosted zone that is
     *         associated with the load balancer. For information on how to associate
     *         your load balancer with a hosted zone, go to <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     *         Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     */
    public void setCanonicalHostedZoneName(String canonicalHostedZoneName) {
        this.canonicalHostedZoneName = canonicalHostedZoneName;
    }
    
    /**
     * Provides the name of the Amazon Route 53 hosted zone that is
     * associated with the load balancer. For information on how to associate
     * your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param canonicalHostedZoneName Provides the name of the Amazon Route 53 hosted zone that is
     *         associated with the load balancer. For information on how to associate
     *         your load balancer with a hosted zone, go to <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     *         Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withCanonicalHostedZoneName(String canonicalHostedZoneName) {
        this.canonicalHostedZoneName = canonicalHostedZoneName;
        return this;
    }

    /**
     * Provides the ID of the Amazon Route 53 hosted zone name that is
     * associated with the load balancer. For information on how to associate
     * or disassociate your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     *
     * @return Provides the ID of the Amazon Route 53 hosted zone name that is
     *         associated with the load balancer. For information on how to associate
     *         or disassociate your load balancer with a hosted zone, go to <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     *         Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     */
    public String getCanonicalHostedZoneNameID() {
        return canonicalHostedZoneNameID;
    }
    
    /**
     * Provides the ID of the Amazon Route 53 hosted zone name that is
     * associated with the load balancer. For information on how to associate
     * or disassociate your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     *
     * @param canonicalHostedZoneNameID Provides the ID of the Amazon Route 53 hosted zone name that is
     *         associated with the load balancer. For information on how to associate
     *         or disassociate your load balancer with a hosted zone, go to <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     *         Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     */
    public void setCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        this.canonicalHostedZoneNameID = canonicalHostedZoneNameID;
    }
    
    /**
     * Provides the ID of the Amazon Route 53 hosted zone name that is
     * associated with the load balancer. For information on how to associate
     * or disassociate your load balancer with a hosted zone, go to <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     * Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     * Balancing Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param canonicalHostedZoneNameID Provides the ID of the Amazon Route 53 hosted zone name that is
     *         associated with the load balancer. For information on how to associate
     *         or disassociate your load balancer with a hosted zone, go to <a
     *         href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/using-domain-names-with-elb.html">Using
     *         Domain Names With Elastic Load Balancing</a> in the <i>Elastic Load
     *         Balancing Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        this.canonicalHostedZoneNameID = canonicalHostedZoneNameID;
        return this;
    }

    /**
     * LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     * PolicyNames are returned in a list of tuples in the
     * ListenerDescriptions element.
     *
     * @return LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     *         PolicyNames are returned in a list of tuples in the
     *         ListenerDescriptions element.
     */
    public java.util.List<ListenerDescription> getListenerDescriptions() {
        if (listenerDescriptions == null) {
              listenerDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<ListenerDescription>();
              listenerDescriptions.setAutoConstruct(true);
        }
        return listenerDescriptions;
    }
    
    /**
     * LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     * PolicyNames are returned in a list of tuples in the
     * ListenerDescriptions element.
     *
     * @param listenerDescriptions LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     *         PolicyNames are returned in a list of tuples in the
     *         ListenerDescriptions element.
     */
    public void setListenerDescriptions(java.util.Collection<ListenerDescription> listenerDescriptions) {
        if (listenerDescriptions == null) {
            this.listenerDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ListenerDescription> listenerDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ListenerDescription>(listenerDescriptions.size());
        listenerDescriptionsCopy.addAll(listenerDescriptions);
        this.listenerDescriptions = listenerDescriptionsCopy;
    }
    
    /**
     * LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     * PolicyNames are returned in a list of tuples in the
     * ListenerDescriptions element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listenerDescriptions LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     *         PolicyNames are returned in a list of tuples in the
     *         ListenerDescriptions element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withListenerDescriptions(ListenerDescription... listenerDescriptions) {
        if (getListenerDescriptions() == null) setListenerDescriptions(new java.util.ArrayList<ListenerDescription>(listenerDescriptions.length));
        for (ListenerDescription value : listenerDescriptions) {
            getListenerDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     * PolicyNames are returned in a list of tuples in the
     * ListenerDescriptions element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listenerDescriptions LoadBalancerPort, InstancePort, Protocol, InstanceProtocol, and
     *         PolicyNames are returned in a list of tuples in the
     *         ListenerDescriptions element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withListenerDescriptions(java.util.Collection<ListenerDescription> listenerDescriptions) {
        if (listenerDescriptions == null) {
            this.listenerDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ListenerDescription> listenerDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ListenerDescription>(listenerDescriptions.size());
            listenerDescriptionsCopy.addAll(listenerDescriptions);
            this.listenerDescriptions = listenerDescriptionsCopy;
        }

        return this;
    }

    /**
     * Provides a list of policies defined for the load balancer.
     *
     * @return Provides a list of policies defined for the load balancer.
     */
    public Policies getPolicies() {
        return policies;
    }
    
    /**
     * Provides a list of policies defined for the load balancer.
     *
     * @param policies Provides a list of policies defined for the load balancer.
     */
    public void setPolicies(Policies policies) {
        this.policies = policies;
    }
    
    /**
     * Provides a list of policies defined for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies Provides a list of policies defined for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Contains a list of back-end server descriptions.
     *
     * @return Contains a list of back-end server descriptions.
     */
    public java.util.List<BackendServerDescription> getBackendServerDescriptions() {
        if (backendServerDescriptions == null) {
              backendServerDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<BackendServerDescription>();
              backendServerDescriptions.setAutoConstruct(true);
        }
        return backendServerDescriptions;
    }
    
    /**
     * Contains a list of back-end server descriptions.
     *
     * @param backendServerDescriptions Contains a list of back-end server descriptions.
     */
    public void setBackendServerDescriptions(java.util.Collection<BackendServerDescription> backendServerDescriptions) {
        if (backendServerDescriptions == null) {
            this.backendServerDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BackendServerDescription> backendServerDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BackendServerDescription>(backendServerDescriptions.size());
        backendServerDescriptionsCopy.addAll(backendServerDescriptions);
        this.backendServerDescriptions = backendServerDescriptionsCopy;
    }
    
    /**
     * Contains a list of back-end server descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backendServerDescriptions Contains a list of back-end server descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withBackendServerDescriptions(BackendServerDescription... backendServerDescriptions) {
        if (getBackendServerDescriptions() == null) setBackendServerDescriptions(new java.util.ArrayList<BackendServerDescription>(backendServerDescriptions.length));
        for (BackendServerDescription value : backendServerDescriptions) {
            getBackendServerDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of back-end server descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backendServerDescriptions Contains a list of back-end server descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withBackendServerDescriptions(java.util.Collection<BackendServerDescription> backendServerDescriptions) {
        if (backendServerDescriptions == null) {
            this.backendServerDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BackendServerDescription> backendServerDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BackendServerDescription>(backendServerDescriptions.size());
            backendServerDescriptionsCopy.addAll(backendServerDescriptions);
            this.backendServerDescriptions = backendServerDescriptionsCopy;
        }

        return this;
    }

    /**
     * Specifies a list of Availability Zones.
     *
     * @return Specifies a list of Availability Zones.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * Specifies a list of Availability Zones.
     *
     * @param availabilityZones Specifies a list of Availability Zones.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
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
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
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
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * Provides a list of VPC subnet IDs for the load balancer.
     *
     * @return Provides a list of VPC subnet IDs for the load balancer.
     */
    public java.util.List<String> getSubnets() {
        if (subnets == null) {
              subnets = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnets.setAutoConstruct(true);
        }
        return subnets;
    }
    
    /**
     * Provides a list of VPC subnet IDs for the load balancer.
     *
     * @param subnets Provides a list of VPC subnet IDs for the load balancer.
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * Provides a list of VPC subnet IDs for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Provides a list of VPC subnet IDs for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withSubnets(String... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<String>(subnets.length));
        for (String value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of VPC subnet IDs for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Provides a list of VPC subnet IDs for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
        }

        return this;
    }

    /**
     * Provides the ID of the VPC attached to the load balancer.
     *
     * @return Provides the ID of the VPC attached to the load balancer.
     */
    public String getVPCId() {
        return vPCId;
    }
    
    /**
     * Provides the ID of the VPC attached to the load balancer.
     *
     * @param vPCId Provides the ID of the VPC attached to the load balancer.
     */
    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }
    
    /**
     * Provides the ID of the VPC attached to the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vPCId Provides the ID of the VPC attached to the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withVPCId(String vPCId) {
        this.vPCId = vPCId;
        return this;
    }

    /**
     * Provides a list of EC2 instance IDs for the load balancer.
     *
     * @return Provides a list of EC2 instance IDs for the load balancer.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the load balancer.
     *
     * @param instances Provides a list of EC2 instance IDs for the load balancer.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a list of EC2 instance IDs for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of EC2 instance IDs for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Provides a list of EC2 instance IDs for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
        }

        return this;
    }

    /**
     * Specifies information regarding the various health probes conducted on
     * the load balancer.
     *
     * @return Specifies information regarding the various health probes conducted on
     *         the load balancer.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * Specifies information regarding the various health probes conducted on
     * the load balancer.
     *
     * @param healthCheck Specifies information regarding the various health probes conducted on
     *         the load balancer.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * Specifies information regarding the various health probes conducted on
     * the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck Specifies information regarding the various health probes conducted on
     *         the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * The security group that you can use as part of your inbound rules for
     * your load balancer's back-end Amazon EC2 application instances. To
     * only allow traffic from load balancers, add a security group rule to
     * your back end instance that specifies this source security group as
     * the inbound source.
     *
     * @return The security group that you can use as part of your inbound rules for
     *         your load balancer's back-end Amazon EC2 application instances. To
     *         only allow traffic from load balancers, add a security group rule to
     *         your back end instance that specifies this source security group as
     *         the inbound source.
     */
    public SourceSecurityGroup getSourceSecurityGroup() {
        return sourceSecurityGroup;
    }
    
    /**
     * The security group that you can use as part of your inbound rules for
     * your load balancer's back-end Amazon EC2 application instances. To
     * only allow traffic from load balancers, add a security group rule to
     * your back end instance that specifies this source security group as
     * the inbound source.
     *
     * @param sourceSecurityGroup The security group that you can use as part of your inbound rules for
     *         your load balancer's back-end Amazon EC2 application instances. To
     *         only allow traffic from load balancers, add a security group rule to
     *         your back end instance that specifies this source security group as
     *         the inbound source.
     */
    public void setSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
        this.sourceSecurityGroup = sourceSecurityGroup;
    }
    
    /**
     * The security group that you can use as part of your inbound rules for
     * your load balancer's back-end Amazon EC2 application instances. To
     * only allow traffic from load balancers, add a security group rule to
     * your back end instance that specifies this source security group as
     * the inbound source.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSecurityGroup The security group that you can use as part of your inbound rules for
     *         your load balancer's back-end Amazon EC2 application instances. To
     *         only allow traffic from load balancers, add a security group rule to
     *         your back end instance that specifies this source security group as
     *         the inbound source.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
        this.sourceSecurityGroup = sourceSecurityGroup;
        return this;
    }

    /**
     * The security groups the load balancer is a member of (VPC only).
     *
     * @return The security groups the load balancer is a member of (VPC only).
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * The security groups the load balancer is a member of (VPC only).
     *
     * @param securityGroups The security groups the load balancer is a member of (VPC only).
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * The security groups the load balancer is a member of (VPC only).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups the load balancer is a member of (VPC only).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * The security groups the load balancer is a member of (VPC only).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups the load balancer is a member of (VPC only).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * Provides the date and time the load balancer was created.
     *
     * @return Provides the date and time the load balancer was created.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * Provides the date and time the load balancer was created.
     *
     * @param createdTime Provides the date and time the load balancer was created.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * Provides the date and time the load balancer was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime Provides the date and time the load balancer was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     * <code>internet-facing</code>, the load balancer has a publicly
     * resolvable DNS name that resolves to public IP addresses. <p>If the
     * <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * publicly resolvable DNS name that resolves to private IP addresses.
     * <p> This option is only available for load balancers attached to an
     * Amazon VPC.
     *
     * @return Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     *         <code>internet-facing</code>, the load balancer has a publicly
     *         resolvable DNS name that resolves to public IP addresses. <p>If the
     *         <code>Scheme</code> is <code>internal</code>, the load balancer has a
     *         publicly resolvable DNS name that resolves to private IP addresses.
     *         <p> This option is only available for load balancers attached to an
     *         Amazon VPC.
     */
    public String getScheme() {
        return scheme;
    }
    
    /**
     * Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     * <code>internet-facing</code>, the load balancer has a publicly
     * resolvable DNS name that resolves to public IP addresses. <p>If the
     * <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * publicly resolvable DNS name that resolves to private IP addresses.
     * <p> This option is only available for load balancers attached to an
     * Amazon VPC.
     *
     * @param scheme Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     *         <code>internet-facing</code>, the load balancer has a publicly
     *         resolvable DNS name that resolves to public IP addresses. <p>If the
     *         <code>Scheme</code> is <code>internal</code>, the load balancer has a
     *         publicly resolvable DNS name that resolves to private IP addresses.
     *         <p> This option is only available for load balancers attached to an
     *         Amazon VPC.
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    
    /**
     * Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     * <code>internet-facing</code>, the load balancer has a publicly
     * resolvable DNS name that resolves to public IP addresses. <p>If the
     * <code>Scheme</code> is <code>internal</code>, the load balancer has a
     * publicly resolvable DNS name that resolves to private IP addresses.
     * <p> This option is only available for load balancers attached to an
     * Amazon VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheme Specifies the type of load balancer. <p>If the <code>Scheme</code> is
     *         <code>internet-facing</code>, the load balancer has a publicly
     *         resolvable DNS name that resolves to public IP addresses. <p>If the
     *         <code>Scheme</code> is <code>internal</code>, the load balancer has a
     *         publicly resolvable DNS name that resolves to private IP addresses.
     *         <p> This option is only available for load balancers attached to an
     *         Amazon VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerDescription withScheme(String scheme) {
        this.scheme = scheme;
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
        if (getDNSName() != null) sb.append("DNSName: " + getDNSName() + ",");
        if (getCanonicalHostedZoneName() != null) sb.append("CanonicalHostedZoneName: " + getCanonicalHostedZoneName() + ",");
        if (getCanonicalHostedZoneNameID() != null) sb.append("CanonicalHostedZoneNameID: " + getCanonicalHostedZoneNameID() + ",");
        if (getListenerDescriptions() != null) sb.append("ListenerDescriptions: " + getListenerDescriptions() + ",");
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() + ",");
        if (getBackendServerDescriptions() != null) sb.append("BackendServerDescriptions: " + getBackendServerDescriptions() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getSubnets() != null) sb.append("Subnets: " + getSubnets() + ",");
        if (getVPCId() != null) sb.append("VPCId: " + getVPCId() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getHealthCheck() != null) sb.append("HealthCheck: " + getHealthCheck() + ",");
        if (getSourceSecurityGroup() != null) sb.append("SourceSecurityGroup: " + getSourceSecurityGroup() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getCreatedTime() != null) sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getScheme() != null) sb.append("Scheme: " + getScheme() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode()); 
        hashCode = prime * hashCode + ((getCanonicalHostedZoneName() == null) ? 0 : getCanonicalHostedZoneName().hashCode()); 
        hashCode = prime * hashCode + ((getCanonicalHostedZoneNameID() == null) ? 0 : getCanonicalHostedZoneNameID().hashCode()); 
        hashCode = prime * hashCode + ((getListenerDescriptions() == null) ? 0 : getListenerDescriptions().hashCode()); 
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getBackendServerDescriptions() == null) ? 0 : getBackendServerDescriptions().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode()); 
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode()); 
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSecurityGroup() == null) ? 0 : getSourceSecurityGroup().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode()); 
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LoadBalancerDescription == false) return false;
        LoadBalancerDescription other = (LoadBalancerDescription)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getDNSName() == null ^ this.getDNSName() == null) return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false) return false; 
        if (other.getCanonicalHostedZoneName() == null ^ this.getCanonicalHostedZoneName() == null) return false;
        if (other.getCanonicalHostedZoneName() != null && other.getCanonicalHostedZoneName().equals(this.getCanonicalHostedZoneName()) == false) return false; 
        if (other.getCanonicalHostedZoneNameID() == null ^ this.getCanonicalHostedZoneNameID() == null) return false;
        if (other.getCanonicalHostedZoneNameID() != null && other.getCanonicalHostedZoneNameID().equals(this.getCanonicalHostedZoneNameID()) == false) return false; 
        if (other.getListenerDescriptions() == null ^ this.getListenerDescriptions() == null) return false;
        if (other.getListenerDescriptions() != null && other.getListenerDescriptions().equals(this.getListenerDescriptions()) == false) return false; 
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        if (other.getBackendServerDescriptions() == null ^ this.getBackendServerDescriptions() == null) return false;
        if (other.getBackendServerDescriptions() != null && other.getBackendServerDescriptions().equals(this.getBackendServerDescriptions()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        if (other.getVPCId() == null ^ this.getVPCId() == null) return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null) return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false) return false; 
        if (other.getSourceSecurityGroup() == null ^ this.getSourceSecurityGroup() == null) return false;
        if (other.getSourceSecurityGroup() != null && other.getSourceSecurityGroup().equals(this.getSourceSecurityGroup()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null) return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false) return false; 
        if (other.getScheme() == null ^ this.getScheme() == null) return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false) return false; 
        return true;
    }
    
}
    