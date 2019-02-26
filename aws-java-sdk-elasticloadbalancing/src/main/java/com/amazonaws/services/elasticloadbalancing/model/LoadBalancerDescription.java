/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/LoadBalancerDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html">Configure
     * a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private String canonicalHostedZoneName;
    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     */
    private String canonicalHostedZoneNameID;
    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ListenerDescription> listenerDescriptions;
    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     */
    private Policies policies;
    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BackendServerDescription> backendServerDescriptions;
    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnets;
    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     */
    private String vPCId;
    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Instance> instances;
    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     */
    private HealthCheck healthCheck;
    /**
     * <p>
     * The security group for the load balancer, which you can use as part of your inbound rules for your registered
     * instances. To only allow traffic from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     */
    private SourceSecurityGroup sourceSecurityGroup;
    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers in a VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that resolves to
     * a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to a
     * private IP address.
     * </p>
     */
    private String scheme;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @param dNSName
     *        The DNS name of the load balancer.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @return The DNS name of the load balancer.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @param dNSName
     *        The DNS name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html">Configure
     * a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param canonicalHostedZoneName
     *        The DNS name of the load balancer.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     *        >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setCanonicalHostedZoneName(String canonicalHostedZoneName) {
        this.canonicalHostedZoneName = canonicalHostedZoneName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html">Configure
     * a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return The DNS name of the load balancer.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     *         >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public String getCanonicalHostedZoneName() {
        return this.canonicalHostedZoneName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html">Configure
     * a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param canonicalHostedZoneName
     *        The DNS name of the load balancer.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/using-domain-names-with-elb.html"
     *        >Configure a Custom Domain Name</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withCanonicalHostedZoneName(String canonicalHostedZoneName) {
        setCanonicalHostedZoneName(canonicalHostedZoneName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneNameID
     *        The ID of the Amazon Route 53 hosted zone for the load balancer.
     */

    public void setCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        this.canonicalHostedZoneNameID = canonicalHostedZoneNameID;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @return The ID of the Amazon Route 53 hosted zone for the load balancer.
     */

    public String getCanonicalHostedZoneNameID() {
        return this.canonicalHostedZoneNameID;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneNameID
     *        The ID of the Amazon Route 53 hosted zone for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        setCanonicalHostedZoneNameID(canonicalHostedZoneNameID);
        return this;
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     * 
     * @return The listeners for the load balancer.
     */

    public java.util.List<ListenerDescription> getListenerDescriptions() {
        if (listenerDescriptions == null) {
            listenerDescriptions = new com.amazonaws.internal.SdkInternalList<ListenerDescription>();
        }
        return listenerDescriptions;
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     * 
     * @param listenerDescriptions
     *        The listeners for the load balancer.
     */

    public void setListenerDescriptions(java.util.Collection<ListenerDescription> listenerDescriptions) {
        if (listenerDescriptions == null) {
            this.listenerDescriptions = null;
            return;
        }

        this.listenerDescriptions = new com.amazonaws.internal.SdkInternalList<ListenerDescription>(listenerDescriptions);
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListenerDescriptions(java.util.Collection)} or {@link #withListenerDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param listenerDescriptions
     *        The listeners for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withListenerDescriptions(ListenerDescription... listenerDescriptions) {
        if (this.listenerDescriptions == null) {
            setListenerDescriptions(new com.amazonaws.internal.SdkInternalList<ListenerDescription>(listenerDescriptions.length));
        }
        for (ListenerDescription ele : listenerDescriptions) {
            this.listenerDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The listeners for the load balancer.
     * </p>
     * 
     * @param listenerDescriptions
     *        The listeners for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withListenerDescriptions(java.util.Collection<ListenerDescription> listenerDescriptions) {
        setListenerDescriptions(listenerDescriptions);
        return this;
    }

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     * 
     * @param policies
     *        The policies defined for the load balancer.
     */

    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     * 
     * @return The policies defined for the load balancer.
     */

    public Policies getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * The policies defined for the load balancer.
     * </p>
     * 
     * @param policies
     *        The policies defined for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withPolicies(Policies policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     * 
     * @return Information about your EC2 instances.
     */

    public java.util.List<BackendServerDescription> getBackendServerDescriptions() {
        if (backendServerDescriptions == null) {
            backendServerDescriptions = new com.amazonaws.internal.SdkInternalList<BackendServerDescription>();
        }
        return backendServerDescriptions;
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     * 
     * @param backendServerDescriptions
     *        Information about your EC2 instances.
     */

    public void setBackendServerDescriptions(java.util.Collection<BackendServerDescription> backendServerDescriptions) {
        if (backendServerDescriptions == null) {
            this.backendServerDescriptions = null;
            return;
        }

        this.backendServerDescriptions = new com.amazonaws.internal.SdkInternalList<BackendServerDescription>(backendServerDescriptions);
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackendServerDescriptions(java.util.Collection)} or
     * {@link #withBackendServerDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param backendServerDescriptions
     *        Information about your EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withBackendServerDescriptions(BackendServerDescription... backendServerDescriptions) {
        if (this.backendServerDescriptions == null) {
            setBackendServerDescriptions(new com.amazonaws.internal.SdkInternalList<BackendServerDescription>(backendServerDescriptions.length));
        }
        for (BackendServerDescription ele : backendServerDescriptions) {
            this.backendServerDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about your EC2 instances.
     * </p>
     * 
     * @param backendServerDescriptions
     *        Information about your EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withBackendServerDescriptions(java.util.Collection<BackendServerDescription> backendServerDescriptions) {
        setBackendServerDescriptions(backendServerDescriptions);
        return this;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * 
     * @return The Availability Zones for the load balancer.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones for the load balancer.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Availability Zones for the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     * 
     * @return The IDs of the subnets for the load balancer.
     */

    public java.util.List<String> getSubnets() {
        if (subnets == null) {
            subnets = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnets;
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets for the load balancer.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new com.amazonaws.internal.SdkInternalList<String>(subnets);
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new com.amazonaws.internal.SdkInternalList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets for the load balancer.
     * </p>
     * 
     * @param subnets
     *        The IDs of the subnets for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * 
     * @param vPCId
     *        The ID of the VPC for the load balancer.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * 
     * @return The ID of the VPC for the load balancer.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * The ID of the VPC for the load balancer.
     * </p>
     * 
     * @param vPCId
     *        The ID of the VPC for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withVPCId(String vPCId) {
        setVPCId(vPCId);
        return this;
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     * 
     * @return The IDs of the instances for the load balancer.
     */

    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<Instance>();
        }
        return instances;
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     * 
     * @param instances
     *        The IDs of the instances for the load balancer.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<Instance>(instances);
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        The IDs of the instances for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withInstances(Instance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<Instance>(instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances for the load balancer.
     * </p>
     * 
     * @param instances
     *        The IDs of the instances for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withInstances(java.util.Collection<Instance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     * 
     * @param healthCheck
     *        Information about the health checks conducted on the load balancer.
     */

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     * 
     * @return Information about the health checks conducted on the load balancer.
     */

    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * Information about the health checks conducted on the load balancer.
     * </p>
     * 
     * @param healthCheck
     *        Information about the health checks conducted on the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withHealthCheck(HealthCheck healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of your inbound rules for your registered
     * instances. To only allow traffic from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     * 
     * @param sourceSecurityGroup
     *        The security group for the load balancer, which you can use as part of your inbound rules for your
     *        registered instances. To only allow traffic from load balancers, add a security group rule that specifies
     *        this source security group as the inbound source.
     */

    public void setSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
        this.sourceSecurityGroup = sourceSecurityGroup;
    }

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of your inbound rules for your registered
     * instances. To only allow traffic from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     * 
     * @return The security group for the load balancer, which you can use as part of your inbound rules for your
     *         registered instances. To only allow traffic from load balancers, add a security group rule that specifies
     *         this source security group as the inbound source.
     */

    public SourceSecurityGroup getSourceSecurityGroup() {
        return this.sourceSecurityGroup;
    }

    /**
     * <p>
     * The security group for the load balancer, which you can use as part of your inbound rules for your registered
     * instances. To only allow traffic from load balancers, add a security group rule that specifies this source
     * security group as the inbound source.
     * </p>
     * 
     * @param sourceSecurityGroup
     *        The security group for the load balancer, which you can use as part of your inbound rules for your
     *        registered instances. To only allow traffic from load balancers, add a security group rule that specifies
     *        this source security group as the inbound source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
        setSourceSecurityGroup(sourceSecurityGroup);
        return this;
    }

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers in a VPC.
     * </p>
     * 
     * @return The security groups for the load balancer. Valid only for load balancers in a VPC.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers in a VPC.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the load balancer. Valid only for load balancers in a VPC.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the load balancer. Valid only for load balancers in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the load balancer. Valid only for load balancers in a VPC.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the load balancer. Valid only for load balancers in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the load balancer was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * 
     * @return The date and time the load balancer was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the load balancer was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the load balancer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that resolves to
     * a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to a
     * private IP address.
     * </p>
     * 
     * @param scheme
     *        The type of load balancer. Valid only for load balancers in a VPC.</p>
     *        <p>
     *        If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that
     *        resolves to a public IP address.
     *        </p>
     *        <p>
     *        If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to
     *        a private IP address.
     */

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that resolves to
     * a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to a
     * private IP address.
     * </p>
     * 
     * @return The type of load balancer. Valid only for load balancers in a VPC.</p>
     *         <p>
     *         If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that
     *         resolves to a public IP address.
     *         </p>
     *         <p>
     *         If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to
     *         a private IP address.
     */

    public String getScheme() {
        return this.scheme;
    }

    /**
     * <p>
     * The type of load balancer. Valid only for load balancers in a VPC.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that resolves to
     * a public IP address.
     * </p>
     * <p>
     * If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to a
     * private IP address.
     * </p>
     * 
     * @param scheme
     *        The type of load balancer. Valid only for load balancers in a VPC.</p>
     *        <p>
     *        If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that
     *        resolves to a public IP address.
     *        </p>
     *        <p>
     *        If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to
     *        a private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerDescription withScheme(String scheme) {
        setScheme(scheme);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getDNSName() != null)
            sb.append("DNSName: ").append(getDNSName()).append(",");
        if (getCanonicalHostedZoneName() != null)
            sb.append("CanonicalHostedZoneName: ").append(getCanonicalHostedZoneName()).append(",");
        if (getCanonicalHostedZoneNameID() != null)
            sb.append("CanonicalHostedZoneNameID: ").append(getCanonicalHostedZoneNameID()).append(",");
        if (getListenerDescriptions() != null)
            sb.append("ListenerDescriptions: ").append(getListenerDescriptions()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getBackendServerDescriptions() != null)
            sb.append("BackendServerDescriptions: ").append(getBackendServerDescriptions()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getSourceSecurityGroup() != null)
            sb.append("SourceSecurityGroup: ").append(getSourceSecurityGroup()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getScheme() != null)
            sb.append("Scheme: ").append(getScheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerDescription == false)
            return false;
        LoadBalancerDescription other = (LoadBalancerDescription) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getCanonicalHostedZoneName() == null ^ this.getCanonicalHostedZoneName() == null)
            return false;
        if (other.getCanonicalHostedZoneName() != null && other.getCanonicalHostedZoneName().equals(this.getCanonicalHostedZoneName()) == false)
            return false;
        if (other.getCanonicalHostedZoneNameID() == null ^ this.getCanonicalHostedZoneNameID() == null)
            return false;
        if (other.getCanonicalHostedZoneNameID() != null && other.getCanonicalHostedZoneNameID().equals(this.getCanonicalHostedZoneNameID()) == false)
            return false;
        if (other.getListenerDescriptions() == null ^ this.getListenerDescriptions() == null)
            return false;
        if (other.getListenerDescriptions() != null && other.getListenerDescriptions().equals(this.getListenerDescriptions()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getBackendServerDescriptions() == null ^ this.getBackendServerDescriptions() == null)
            return false;
        if (other.getBackendServerDescriptions() != null && other.getBackendServerDescriptions().equals(this.getBackendServerDescriptions()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getSourceSecurityGroup() == null ^ this.getSourceSecurityGroup() == null)
            return false;
        if (other.getSourceSecurityGroup() != null && other.getSourceSecurityGroup().equals(this.getSourceSecurityGroup()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        return true;
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
    public LoadBalancerDescription clone() {
        try {
            return (LoadBalancerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
