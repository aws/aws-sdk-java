/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a Classic Load Balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of Availability Zones for the load balancer.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * Information about the configuration of the EC2 instances.
     * </p>
     */
    private java.util.List<AwsElbLoadBalancerBackendServerDescription> backendServerDescriptions;
    /**
     * <p>
     * The name of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     */
    private String canonicalHostedZoneName;
    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     */
    private String canonicalHostedZoneNameID;
    /**
     * <p>
     * Indicates when the load balancer was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * Information about the health checks that are conducted on the load balancer.
     * </p>
     */
    private AwsElbLoadBalancerHealthCheck healthCheck;
    /**
     * <p>
     * List of EC2 instances for the load balancer.
     * </p>
     */
    private java.util.List<AwsElbLoadBalancerInstance> instances;
    /**
     * <p>
     * The policies that are enabled for the load balancer listeners.
     * </p>
     */
    private java.util.List<AwsElbLoadBalancerListenerDescription> listenerDescriptions;
    /**
     * <p>
     * The attributes for a load balancer.
     * </p>
     */
    private AwsElbLoadBalancerAttributes loadBalancerAttributes;
    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The policies for a load balancer.
     * </p>
     */
    private AwsElbLoadBalancerPolicies policies;
    /**
     * <p>
     * The type of load balancer. Only provided if the load balancer is in a VPC.
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
     * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * Information about the security group for the load balancer. This is the security group that is used for inbound
     * rules.
     * </p>
     */
    private AwsElbLoadBalancerSourceSecurityGroup sourceSecurityGroup;
    /**
     * <p>
     * The list of subnet identifiers for the load balancer.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The identifier of the VPC for the load balancer.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The list of Availability Zones for the load balancer.
     * </p>
     * 
     * @return The list of Availability Zones for the load balancer.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * The list of Availability Zones for the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones for the load balancer.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * The list of Availability Zones for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones for the load balancer.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Information about the configuration of the EC2 instances.
     * </p>
     * 
     * @return Information about the configuration of the EC2 instances.
     */

    public java.util.List<AwsElbLoadBalancerBackendServerDescription> getBackendServerDescriptions() {
        return backendServerDescriptions;
    }

    /**
     * <p>
     * Information about the configuration of the EC2 instances.
     * </p>
     * 
     * @param backendServerDescriptions
     *        Information about the configuration of the EC2 instances.
     */

    public void setBackendServerDescriptions(java.util.Collection<AwsElbLoadBalancerBackendServerDescription> backendServerDescriptions) {
        if (backendServerDescriptions == null) {
            this.backendServerDescriptions = null;
            return;
        }

        this.backendServerDescriptions = new java.util.ArrayList<AwsElbLoadBalancerBackendServerDescription>(backendServerDescriptions);
    }

    /**
     * <p>
     * Information about the configuration of the EC2 instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackendServerDescriptions(java.util.Collection)} or
     * {@link #withBackendServerDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param backendServerDescriptions
     *        Information about the configuration of the EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withBackendServerDescriptions(AwsElbLoadBalancerBackendServerDescription... backendServerDescriptions) {
        if (this.backendServerDescriptions == null) {
            setBackendServerDescriptions(new java.util.ArrayList<AwsElbLoadBalancerBackendServerDescription>(backendServerDescriptions.length));
        }
        for (AwsElbLoadBalancerBackendServerDescription ele : backendServerDescriptions) {
            this.backendServerDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the configuration of the EC2 instances.
     * </p>
     * 
     * @param backendServerDescriptions
     *        Information about the configuration of the EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withBackendServerDescriptions(java.util.Collection<AwsElbLoadBalancerBackendServerDescription> backendServerDescriptions) {
        setBackendServerDescriptions(backendServerDescriptions);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneName
     *        The name of the Amazon Route 53 hosted zone for the load balancer.
     */

    public void setCanonicalHostedZoneName(String canonicalHostedZoneName) {
        this.canonicalHostedZoneName = canonicalHostedZoneName;
    }

    /**
     * <p>
     * The name of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @return The name of the Amazon Route 53 hosted zone for the load balancer.
     */

    public String getCanonicalHostedZoneName() {
        return this.canonicalHostedZoneName;
    }

    /**
     * <p>
     * The name of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneName
     *        The name of the Amazon Route 53 hosted zone for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withCanonicalHostedZoneName(String canonicalHostedZoneName) {
        setCanonicalHostedZoneName(canonicalHostedZoneName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneNameID
     *        The ID of the Amazon Route 53 hosted zone for the load balancer.
     */

    public void setCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        this.canonicalHostedZoneNameID = canonicalHostedZoneNameID;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @return The ID of the Amazon Route 53 hosted zone for the load balancer.
     */

    public String getCanonicalHostedZoneNameID() {
        return this.canonicalHostedZoneNameID;
    }

    /**
     * <p>
     * The ID of the Amazon Route 53 hosted zone for the load balancer.
     * </p>
     * 
     * @param canonicalHostedZoneNameID
     *        The ID of the Amazon Route 53 hosted zone for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withCanonicalHostedZoneNameID(String canonicalHostedZoneNameID) {
        setCanonicalHostedZoneNameID(canonicalHostedZoneNameID);
        return this;
    }

    /**
     * <p>
     * Indicates when the load balancer was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdTime
     *        Indicates when the load balancer was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Indicates when the load balancer was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the load balancer was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Indicates when the load balancer was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdTime
     *        Indicates when the load balancer was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the load balancer.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @return The DNS name of the load balancer.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * Information about the health checks that are conducted on the load balancer.
     * </p>
     * 
     * @param healthCheck
     *        Information about the health checks that are conducted on the load balancer.
     */

    public void setHealthCheck(AwsElbLoadBalancerHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    /**
     * <p>
     * Information about the health checks that are conducted on the load balancer.
     * </p>
     * 
     * @return Information about the health checks that are conducted on the load balancer.
     */

    public AwsElbLoadBalancerHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * <p>
     * Information about the health checks that are conducted on the load balancer.
     * </p>
     * 
     * @param healthCheck
     *        Information about the health checks that are conducted on the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withHealthCheck(AwsElbLoadBalancerHealthCheck healthCheck) {
        setHealthCheck(healthCheck);
        return this;
    }

    /**
     * <p>
     * List of EC2 instances for the load balancer.
     * </p>
     * 
     * @return List of EC2 instances for the load balancer.
     */

    public java.util.List<AwsElbLoadBalancerInstance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * List of EC2 instances for the load balancer.
     * </p>
     * 
     * @param instances
     *        List of EC2 instances for the load balancer.
     */

    public void setInstances(java.util.Collection<AwsElbLoadBalancerInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<AwsElbLoadBalancerInstance>(instances);
    }

    /**
     * <p>
     * List of EC2 instances for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        List of EC2 instances for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withInstances(AwsElbLoadBalancerInstance... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<AwsElbLoadBalancerInstance>(instances.length));
        }
        for (AwsElbLoadBalancerInstance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of EC2 instances for the load balancer.
     * </p>
     * 
     * @param instances
     *        List of EC2 instances for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withInstances(java.util.Collection<AwsElbLoadBalancerInstance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * The policies that are enabled for the load balancer listeners.
     * </p>
     * 
     * @return The policies that are enabled for the load balancer listeners.
     */

    public java.util.List<AwsElbLoadBalancerListenerDescription> getListenerDescriptions() {
        return listenerDescriptions;
    }

    /**
     * <p>
     * The policies that are enabled for the load balancer listeners.
     * </p>
     * 
     * @param listenerDescriptions
     *        The policies that are enabled for the load balancer listeners.
     */

    public void setListenerDescriptions(java.util.Collection<AwsElbLoadBalancerListenerDescription> listenerDescriptions) {
        if (listenerDescriptions == null) {
            this.listenerDescriptions = null;
            return;
        }

        this.listenerDescriptions = new java.util.ArrayList<AwsElbLoadBalancerListenerDescription>(listenerDescriptions);
    }

    /**
     * <p>
     * The policies that are enabled for the load balancer listeners.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListenerDescriptions(java.util.Collection)} or {@link #withListenerDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param listenerDescriptions
     *        The policies that are enabled for the load balancer listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withListenerDescriptions(AwsElbLoadBalancerListenerDescription... listenerDescriptions) {
        if (this.listenerDescriptions == null) {
            setListenerDescriptions(new java.util.ArrayList<AwsElbLoadBalancerListenerDescription>(listenerDescriptions.length));
        }
        for (AwsElbLoadBalancerListenerDescription ele : listenerDescriptions) {
            this.listenerDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policies that are enabled for the load balancer listeners.
     * </p>
     * 
     * @param listenerDescriptions
     *        The policies that are enabled for the load balancer listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withListenerDescriptions(java.util.Collection<AwsElbLoadBalancerListenerDescription> listenerDescriptions) {
        setListenerDescriptions(listenerDescriptions);
        return this;
    }

    /**
     * <p>
     * The attributes for a load balancer.
     * </p>
     * 
     * @param loadBalancerAttributes
     *        The attributes for a load balancer.
     */

    public void setLoadBalancerAttributes(AwsElbLoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
    }

    /**
     * <p>
     * The attributes for a load balancer.
     * </p>
     * 
     * @return The attributes for a load balancer.
     */

    public AwsElbLoadBalancerAttributes getLoadBalancerAttributes() {
        return this.loadBalancerAttributes;
    }

    /**
     * <p>
     * The attributes for a load balancer.
     * </p>
     * 
     * @param loadBalancerAttributes
     *        The attributes for a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withLoadBalancerAttributes(AwsElbLoadBalancerAttributes loadBalancerAttributes) {
        setLoadBalancerAttributes(loadBalancerAttributes);
        return this;
    }

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

    public AwsElbLoadBalancerDetails withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The policies for a load balancer.
     * </p>
     * 
     * @param policies
     *        The policies for a load balancer.
     */

    public void setPolicies(AwsElbLoadBalancerPolicies policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies for a load balancer.
     * </p>
     * 
     * @return The policies for a load balancer.
     */

    public AwsElbLoadBalancerPolicies getPolicies() {
        return this.policies;
    }

    /**
     * <p>
     * The policies for a load balancer.
     * </p>
     * 
     * @param policies
     *        The policies for a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withPolicies(AwsElbLoadBalancerPolicies policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * The type of load balancer. Only provided if the load balancer is in a VPC.
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
     *        The type of load balancer. Only provided if the load balancer is in a VPC.</p>
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
     * The type of load balancer. Only provided if the load balancer is in a VPC.
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
     * @return The type of load balancer. Only provided if the load balancer is in a VPC.</p>
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
     * The type of load balancer. Only provided if the load balancer is in a VPC.
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
     *        The type of load balancer. Only provided if the load balancer is in a VPC.</p>
     *        <p>
     *        If <code>Scheme</code> is <code>internet-facing</code>, the load balancer has a public DNS name that
     *        resolves to a public IP address.
     *        </p>
     *        <p>
     *        If <code>Scheme</code> is <code>internal</code>, the load balancer has a public DNS name that resolves to
     *        a private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withScheme(String scheme) {
        setScheme(scheme);
        return this;
    }

    /**
     * <p>
     * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * </p>
     * 
     * @return The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the load balancer. Only provided if the load balancer is in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Information about the security group for the load balancer. This is the security group that is used for inbound
     * rules.
     * </p>
     * 
     * @param sourceSecurityGroup
     *        Information about the security group for the load balancer. This is the security group that is used for
     *        inbound rules.
     */

    public void setSourceSecurityGroup(AwsElbLoadBalancerSourceSecurityGroup sourceSecurityGroup) {
        this.sourceSecurityGroup = sourceSecurityGroup;
    }

    /**
     * <p>
     * Information about the security group for the load balancer. This is the security group that is used for inbound
     * rules.
     * </p>
     * 
     * @return Information about the security group for the load balancer. This is the security group that is used for
     *         inbound rules.
     */

    public AwsElbLoadBalancerSourceSecurityGroup getSourceSecurityGroup() {
        return this.sourceSecurityGroup;
    }

    /**
     * <p>
     * Information about the security group for the load balancer. This is the security group that is used for inbound
     * rules.
     * </p>
     * 
     * @param sourceSecurityGroup
     *        Information about the security group for the load balancer. This is the security group that is used for
     *        inbound rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withSourceSecurityGroup(AwsElbLoadBalancerSourceSecurityGroup sourceSecurityGroup) {
        setSourceSecurityGroup(sourceSecurityGroup);
        return this;
    }

    /**
     * <p>
     * The list of subnet identifiers for the load balancer.
     * </p>
     * 
     * @return The list of subnet identifiers for the load balancer.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The list of subnet identifiers for the load balancer.
     * </p>
     * 
     * @param subnets
     *        The list of subnet identifiers for the load balancer.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The list of subnet identifiers for the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The list of subnet identifiers for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of subnet identifiers for the load balancer.
     * </p>
     * 
     * @param subnets
     *        The list of subnet identifiers for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC for the load balancer.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC for the load balancer.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC for the load balancer.
     * </p>
     * 
     * @return The identifier of the VPC for the load balancer.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC for the load balancer.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getBackendServerDescriptions() != null)
            sb.append("BackendServerDescriptions: ").append(getBackendServerDescriptions()).append(",");
        if (getCanonicalHostedZoneName() != null)
            sb.append("CanonicalHostedZoneName: ").append(getCanonicalHostedZoneName()).append(",");
        if (getCanonicalHostedZoneNameID() != null)
            sb.append("CanonicalHostedZoneNameID: ").append(getCanonicalHostedZoneNameID()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getHealthCheck() != null)
            sb.append("HealthCheck: ").append(getHealthCheck()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getListenerDescriptions() != null)
            sb.append("ListenerDescriptions: ").append(getListenerDescriptions()).append(",");
        if (getLoadBalancerAttributes() != null)
            sb.append("LoadBalancerAttributes: ").append(getLoadBalancerAttributes()).append(",");
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
        if (getScheme() != null)
            sb.append("Scheme: ").append(getScheme()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSourceSecurityGroup() != null)
            sb.append("SourceSecurityGroup: ").append(getSourceSecurityGroup()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerDetails == false)
            return false;
        AwsElbLoadBalancerDetails other = (AwsElbLoadBalancerDetails) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackendServerDescriptions() == null ^ this.getBackendServerDescriptions() == null)
            return false;
        if (other.getBackendServerDescriptions() != null && other.getBackendServerDescriptions().equals(this.getBackendServerDescriptions()) == false)
            return false;
        if (other.getCanonicalHostedZoneName() == null ^ this.getCanonicalHostedZoneName() == null)
            return false;
        if (other.getCanonicalHostedZoneName() != null && other.getCanonicalHostedZoneName().equals(this.getCanonicalHostedZoneName()) == false)
            return false;
        if (other.getCanonicalHostedZoneNameID() == null ^ this.getCanonicalHostedZoneNameID() == null)
            return false;
        if (other.getCanonicalHostedZoneNameID() != null && other.getCanonicalHostedZoneNameID().equals(this.getCanonicalHostedZoneNameID()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null)
            return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getListenerDescriptions() == null ^ this.getListenerDescriptions() == null)
            return false;
        if (other.getListenerDescriptions() != null && other.getListenerDescriptions().equals(this.getListenerDescriptions()) == false)
            return false;
        if (other.getLoadBalancerAttributes() == null ^ this.getLoadBalancerAttributes() == null)
            return false;
        if (other.getLoadBalancerAttributes() != null && other.getLoadBalancerAttributes().equals(this.getLoadBalancerAttributes()) == false)
            return false;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getScheme() == null ^ this.getScheme() == null)
            return false;
        if (other.getScheme() != null && other.getScheme().equals(this.getScheme()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSourceSecurityGroup() == null ^ this.getSourceSecurityGroup() == null)
            return false;
        if (other.getSourceSecurityGroup() != null && other.getSourceSecurityGroup().equals(this.getSourceSecurityGroup()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getBackendServerDescriptions() == null) ? 0 : getBackendServerDescriptions().hashCode());
        hashCode = prime * hashCode + ((getCanonicalHostedZoneName() == null) ? 0 : getCanonicalHostedZoneName().hashCode());
        hashCode = prime * hashCode + ((getCanonicalHostedZoneNameID() == null) ? 0 : getCanonicalHostedZoneNameID().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getListenerDescriptions() == null) ? 0 : getListenerDescriptions().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerAttributes() == null) ? 0 : getLoadBalancerAttributes().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getScheme() == null) ? 0 : getScheme().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSourceSecurityGroup() == null) ? 0 : getSourceSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerDetails clone() {
        try {
            return (AwsElbLoadBalancerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
