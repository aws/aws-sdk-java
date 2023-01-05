/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifySubnetAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySubnetAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifySubnetAttributeRequest> {

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     */
    private Boolean assignIpv6AddressOnCreation;
    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     */
    private Boolean mapPublicIpOnLaunch;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     */
    private Boolean mapCustomerOwnedIpOnLaunch;
    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     */
    private String customerOwnedIpv4Pool;
    /**
     * <p>
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic
     * IPv6 addresses for IPv4-only destinations.
     * </p>
     */
    private Boolean enableDns64;
    /**
     * <p>
     * The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6)
     * subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID
     * (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).
     * </p>
     */
    private String privateDnsHostnameTypeOnLaunch;
    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     */
    private Boolean enableResourceNameDnsARecordOnLaunch;
    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     */
    private Boolean enableResourceNameDnsAAAARecordOnLaunch;
    /**
     * <p>
     * Indicates the device position for local network interfaces in this subnet. For example, <code>1</code> indicates
     * local network interfaces in this subnet are the secondary network interface (eth1). A local network interface
     * cannot be the primary network interface (eth0).
     * </p>
     */
    private Integer enableLniAtDeviceIndex;
    /**
     * <p>
     * Specify <code>true</code> to indicate that local network interfaces at the current position should be disabled.
     * </p>
     */
    private Boolean disableLniAtDeviceIndex;

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @param assignIpv6AddressOnCreation
     *        Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *        assigned an IPv6 address. This includes a network interface that's created when launching an instance into
     *        the subnet (the instance therefore receives an IPv6 address). </p>
     *        <p>
     *        If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *        receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *        API.
     */

    public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *         assigned an IPv6 address. This includes a network interface that's created when launching an instance
     *         into the subnet (the instance therefore receives an IPv6 address). </p>
     *         <p>
     *         If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *         receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *         API.
     */

    public Boolean getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @param assignIpv6AddressOnCreation
     *        Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *        assigned an IPv6 address. This includes a network interface that's created when launching an instance into
     *        the subnet (the instance therefore receives an IPv6 address). </p>
     *        <p>
     *        If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *        receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        setAssignIpv6AddressOnCreation(assignIpv6AddressOnCreation);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be assigned
     * an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the
     * instance therefore receives an IPv6 address).
     * </p>
     * <p>
     * If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an
     * IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2 API.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces created in the specified subnet should be
     *         assigned an IPv6 address. This includes a network interface that's created when launching an instance
     *         into the subnet (the instance therefore receives an IPv6 address). </p>
     *         <p>
     *         If you enable the IPv6 addressing feature for your subnet, your network interface or instance only
     *         receives an IPv6 address if it's created using version <code>2016-11-15</code> or later of the Amazon EC2
     *         API.
     */

    public Boolean isAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a public IPv4 address.
     */

    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a public IPv4 address.
     */

    public Boolean getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a public IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        setMapPublicIpOnLaunch(mapPublicIpOnLaunch);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a public IPv4 address.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a public IPv4 address.
     */

    public Boolean isMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @param mapCustomerOwnedIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a customer-owned IPv4 address.</p>
     *        <p>
     *        When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *        <code>CustomerOwnedIpv4Pool</code>.
     */

    public void setMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a customer-owned IPv4 address.</p>
     *         <p>
     *         When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *         <code>CustomerOwnedIpv4Pool</code>.
     */

    public Boolean getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @param mapCustomerOwnedIpOnLaunch
     *        Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *        specified subnet should be assigned a customer-owned IPv4 address.</p>
     *        <p>
     *        When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *        <code>CustomerOwnedIpv4Pool</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
        setMapCustomerOwnedIpOnLaunch(mapCustomerOwnedIpOnLaunch);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that network interfaces attached to instances created in the specified
     * subnet should be assigned a customer-owned IPv4 address.
     * </p>
     * <p>
     * When this value is <code>true</code>, you must specify the customer-owned IP pool using
     * <code>CustomerOwnedIpv4Pool</code>.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that network interfaces attached to instances created in the
     *         specified subnet should be assigned a customer-owned IPv4 address.</p>
     *         <p>
     *         When this value is <code>true</code>, you must specify the customer-owned IP pool using
     *         <code>CustomerOwnedIpv4Pool</code>.
     */

    public Boolean isMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The customer-owned IPv4 address pool associated with the subnet.</p>
     *        <p>
     *        You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     */

    public void setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     * 
     * @return The customer-owned IPv4 address pool associated with the subnet.</p>
     *         <p>
     *         You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     */

    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }

    /**
     * <p>
     * The customer-owned IPv4 address pool associated with the subnet.
     * </p>
     * <p>
     * You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * </p>
     * 
     * @param customerOwnedIpv4Pool
     *        The customer-owned IPv4 address pool associated with the subnet.</p>
     *        <p>
     *        You must set this value when you specify <code>true</code> for <code>MapCustomerOwnedIpOnLaunch</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
        setCustomerOwnedIpv4Pool(customerOwnedIpv4Pool);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic
     * IPv6 addresses for IPv4-only destinations.
     * </p>
     * 
     * @param enableDns64
     *        Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return
     *        synthetic IPv6 addresses for IPv4-only destinations.
     */

    public void setEnableDns64(Boolean enableDns64) {
        this.enableDns64 = enableDns64;
    }

    /**
     * <p>
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic
     * IPv6 addresses for IPv4-only destinations.
     * </p>
     * 
     * @return Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return
     *         synthetic IPv6 addresses for IPv4-only destinations.
     */

    public Boolean getEnableDns64() {
        return this.enableDns64;
    }

    /**
     * <p>
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic
     * IPv6 addresses for IPv4-only destinations.
     * </p>
     * 
     * @param enableDns64
     *        Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return
     *        synthetic IPv6 addresses for IPv4-only destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withEnableDns64(Boolean enableDns64) {
        setEnableDns64(enableDns64);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic
     * IPv6 addresses for IPv4-only destinations.
     * </p>
     * 
     * @return Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return
     *         synthetic IPv6 addresses for IPv4-only destinations.
     */

    public Boolean isEnableDns64() {
        return this.enableDns64;
    }

    /**
     * <p>
     * The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6)
     * subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID
     * (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).
     * </p>
     * 
     * @param privateDnsHostnameTypeOnLaunch
     *        The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4
     *        and IPv6) subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the
     *        instance ID (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID
     *        (resource-name).
     * @see HostnameType
     */

    public void setPrivateDnsHostnameTypeOnLaunch(String privateDnsHostnameTypeOnLaunch) {
        this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
    }

    /**
     * <p>
     * The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6)
     * subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID
     * (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).
     * </p>
     * 
     * @return The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4
     *         and IPv6) subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the
     *         instance ID (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID
     *         (resource-name).
     * @see HostnameType
     */

    public String getPrivateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch;
    }

    /**
     * <p>
     * The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6)
     * subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID
     * (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).
     * </p>
     * 
     * @param privateDnsHostnameTypeOnLaunch
     *        The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4
     *        and IPv6) subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the
     *        instance ID (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID
     *        (resource-name).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostnameType
     */

    public ModifySubnetAttributeRequest withPrivateDnsHostnameTypeOnLaunch(String privateDnsHostnameTypeOnLaunch) {
        setPrivateDnsHostnameTypeOnLaunch(privateDnsHostnameTypeOnLaunch);
        return this;
    }

    /**
     * <p>
     * The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6)
     * subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID
     * (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).
     * </p>
     * 
     * @param privateDnsHostnameTypeOnLaunch
     *        The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4
     *        and IPv6) subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the
     *        instance ID (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID
     *        (resource-name).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostnameType
     */

    public ModifySubnetAttributeRequest withPrivateDnsHostnameTypeOnLaunch(HostnameType privateDnsHostnameTypeOnLaunch) {
        this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @param enableResourceNameDnsARecordOnLaunch
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */

    public void setEnableResourceNameDnsARecordOnLaunch(Boolean enableResourceNameDnsARecordOnLaunch) {
        this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */

    public Boolean getEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @param enableResourceNameDnsARecordOnLaunch
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withEnableResourceNameDnsARecordOnLaunch(Boolean enableResourceNameDnsARecordOnLaunch) {
        setEnableResourceNameDnsARecordOnLaunch(enableResourceNameDnsARecordOnLaunch);
        return this;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     */

    public Boolean isEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @param enableResourceNameDnsAAAARecordOnLaunch
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     */

    public void setEnableResourceNameDnsAAAARecordOnLaunch(Boolean enableResourceNameDnsAAAARecordOnLaunch) {
        this.enableResourceNameDnsAAAARecordOnLaunch = enableResourceNameDnsAAAARecordOnLaunch;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     */

    public Boolean getEnableResourceNameDnsAAAARecordOnLaunch() {
        return this.enableResourceNameDnsAAAARecordOnLaunch;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @param enableResourceNameDnsAAAARecordOnLaunch
     *        Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withEnableResourceNameDnsAAAARecordOnLaunch(Boolean enableResourceNameDnsAAAARecordOnLaunch) {
        setEnableResourceNameDnsAAAARecordOnLaunch(enableResourceNameDnsAAAARecordOnLaunch);
        return this;
    }

    /**
     * <p>
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * </p>
     * 
     * @return Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     */

    public Boolean isEnableResourceNameDnsAAAARecordOnLaunch() {
        return this.enableResourceNameDnsAAAARecordOnLaunch;
    }

    /**
     * <p>
     * Indicates the device position for local network interfaces in this subnet. For example, <code>1</code> indicates
     * local network interfaces in this subnet are the secondary network interface (eth1). A local network interface
     * cannot be the primary network interface (eth0).
     * </p>
     * 
     * @param enableLniAtDeviceIndex
     *        Indicates the device position for local network interfaces in this subnet. For example, <code>1</code>
     *        indicates local network interfaces in this subnet are the secondary network interface (eth1). A local
     *        network interface cannot be the primary network interface (eth0).
     */

    public void setEnableLniAtDeviceIndex(Integer enableLniAtDeviceIndex) {
        this.enableLniAtDeviceIndex = enableLniAtDeviceIndex;
    }

    /**
     * <p>
     * Indicates the device position for local network interfaces in this subnet. For example, <code>1</code> indicates
     * local network interfaces in this subnet are the secondary network interface (eth1). A local network interface
     * cannot be the primary network interface (eth0).
     * </p>
     * 
     * @return Indicates the device position for local network interfaces in this subnet. For example, <code>1</code>
     *         indicates local network interfaces in this subnet are the secondary network interface (eth1). A local
     *         network interface cannot be the primary network interface (eth0).
     */

    public Integer getEnableLniAtDeviceIndex() {
        return this.enableLniAtDeviceIndex;
    }

    /**
     * <p>
     * Indicates the device position for local network interfaces in this subnet. For example, <code>1</code> indicates
     * local network interfaces in this subnet are the secondary network interface (eth1). A local network interface
     * cannot be the primary network interface (eth0).
     * </p>
     * 
     * @param enableLniAtDeviceIndex
     *        Indicates the device position for local network interfaces in this subnet. For example, <code>1</code>
     *        indicates local network interfaces in this subnet are the secondary network interface (eth1). A local
     *        network interface cannot be the primary network interface (eth0).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withEnableLniAtDeviceIndex(Integer enableLniAtDeviceIndex) {
        setEnableLniAtDeviceIndex(enableLniAtDeviceIndex);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that local network interfaces at the current position should be disabled.
     * </p>
     * 
     * @param disableLniAtDeviceIndex
     *        Specify <code>true</code> to indicate that local network interfaces at the current position should be
     *        disabled.
     */

    public void setDisableLniAtDeviceIndex(Boolean disableLniAtDeviceIndex) {
        this.disableLniAtDeviceIndex = disableLniAtDeviceIndex;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that local network interfaces at the current position should be disabled.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that local network interfaces at the current position should be
     *         disabled.
     */

    public Boolean getDisableLniAtDeviceIndex() {
        return this.disableLniAtDeviceIndex;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that local network interfaces at the current position should be disabled.
     * </p>
     * 
     * @param disableLniAtDeviceIndex
     *        Specify <code>true</code> to indicate that local network interfaces at the current position should be
     *        disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySubnetAttributeRequest withDisableLniAtDeviceIndex(Boolean disableLniAtDeviceIndex) {
        setDisableLniAtDeviceIndex(disableLniAtDeviceIndex);
        return this;
    }

    /**
     * <p>
     * Specify <code>true</code> to indicate that local network interfaces at the current position should be disabled.
     * </p>
     * 
     * @return Specify <code>true</code> to indicate that local network interfaces at the current position should be
     *         disabled.
     */

    public Boolean isDisableLniAtDeviceIndex() {
        return this.disableLniAtDeviceIndex;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifySubnetAttributeRequest> getDryRunRequest() {
        Request<ModifySubnetAttributeRequest> request = new ModifySubnetAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAssignIpv6AddressOnCreation() != null)
            sb.append("AssignIpv6AddressOnCreation: ").append(getAssignIpv6AddressOnCreation()).append(",");
        if (getMapPublicIpOnLaunch() != null)
            sb.append("MapPublicIpOnLaunch: ").append(getMapPublicIpOnLaunch()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getMapCustomerOwnedIpOnLaunch() != null)
            sb.append("MapCustomerOwnedIpOnLaunch: ").append(getMapCustomerOwnedIpOnLaunch()).append(",");
        if (getCustomerOwnedIpv4Pool() != null)
            sb.append("CustomerOwnedIpv4Pool: ").append(getCustomerOwnedIpv4Pool()).append(",");
        if (getEnableDns64() != null)
            sb.append("EnableDns64: ").append(getEnableDns64()).append(",");
        if (getPrivateDnsHostnameTypeOnLaunch() != null)
            sb.append("PrivateDnsHostnameTypeOnLaunch: ").append(getPrivateDnsHostnameTypeOnLaunch()).append(",");
        if (getEnableResourceNameDnsARecordOnLaunch() != null)
            sb.append("EnableResourceNameDnsARecordOnLaunch: ").append(getEnableResourceNameDnsARecordOnLaunch()).append(",");
        if (getEnableResourceNameDnsAAAARecordOnLaunch() != null)
            sb.append("EnableResourceNameDnsAAAARecordOnLaunch: ").append(getEnableResourceNameDnsAAAARecordOnLaunch()).append(",");
        if (getEnableLniAtDeviceIndex() != null)
            sb.append("EnableLniAtDeviceIndex: ").append(getEnableLniAtDeviceIndex()).append(",");
        if (getDisableLniAtDeviceIndex() != null)
            sb.append("DisableLniAtDeviceIndex: ").append(getDisableLniAtDeviceIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySubnetAttributeRequest == false)
            return false;
        ModifySubnetAttributeRequest other = (ModifySubnetAttributeRequest) obj;
        if (other.getAssignIpv6AddressOnCreation() == null ^ this.getAssignIpv6AddressOnCreation() == null)
            return false;
        if (other.getAssignIpv6AddressOnCreation() != null && other.getAssignIpv6AddressOnCreation().equals(this.getAssignIpv6AddressOnCreation()) == false)
            return false;
        if (other.getMapPublicIpOnLaunch() == null ^ this.getMapPublicIpOnLaunch() == null)
            return false;
        if (other.getMapPublicIpOnLaunch() != null && other.getMapPublicIpOnLaunch().equals(this.getMapPublicIpOnLaunch()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getMapCustomerOwnedIpOnLaunch() == null ^ this.getMapCustomerOwnedIpOnLaunch() == null)
            return false;
        if (other.getMapCustomerOwnedIpOnLaunch() != null && other.getMapCustomerOwnedIpOnLaunch().equals(this.getMapCustomerOwnedIpOnLaunch()) == false)
            return false;
        if (other.getCustomerOwnedIpv4Pool() == null ^ this.getCustomerOwnedIpv4Pool() == null)
            return false;
        if (other.getCustomerOwnedIpv4Pool() != null && other.getCustomerOwnedIpv4Pool().equals(this.getCustomerOwnedIpv4Pool()) == false)
            return false;
        if (other.getEnableDns64() == null ^ this.getEnableDns64() == null)
            return false;
        if (other.getEnableDns64() != null && other.getEnableDns64().equals(this.getEnableDns64()) == false)
            return false;
        if (other.getPrivateDnsHostnameTypeOnLaunch() == null ^ this.getPrivateDnsHostnameTypeOnLaunch() == null)
            return false;
        if (other.getPrivateDnsHostnameTypeOnLaunch() != null
                && other.getPrivateDnsHostnameTypeOnLaunch().equals(this.getPrivateDnsHostnameTypeOnLaunch()) == false)
            return false;
        if (other.getEnableResourceNameDnsARecordOnLaunch() == null ^ this.getEnableResourceNameDnsARecordOnLaunch() == null)
            return false;
        if (other.getEnableResourceNameDnsARecordOnLaunch() != null
                && other.getEnableResourceNameDnsARecordOnLaunch().equals(this.getEnableResourceNameDnsARecordOnLaunch()) == false)
            return false;
        if (other.getEnableResourceNameDnsAAAARecordOnLaunch() == null ^ this.getEnableResourceNameDnsAAAARecordOnLaunch() == null)
            return false;
        if (other.getEnableResourceNameDnsAAAARecordOnLaunch() != null
                && other.getEnableResourceNameDnsAAAARecordOnLaunch().equals(this.getEnableResourceNameDnsAAAARecordOnLaunch()) == false)
            return false;
        if (other.getEnableLniAtDeviceIndex() == null ^ this.getEnableLniAtDeviceIndex() == null)
            return false;
        if (other.getEnableLniAtDeviceIndex() != null && other.getEnableLniAtDeviceIndex().equals(this.getEnableLniAtDeviceIndex()) == false)
            return false;
        if (other.getDisableLniAtDeviceIndex() == null ^ this.getDisableLniAtDeviceIndex() == null)
            return false;
        if (other.getDisableLniAtDeviceIndex() != null && other.getDisableLniAtDeviceIndex().equals(this.getDisableLniAtDeviceIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignIpv6AddressOnCreation() == null) ? 0 : getAssignIpv6AddressOnCreation().hashCode());
        hashCode = prime * hashCode + ((getMapPublicIpOnLaunch() == null) ? 0 : getMapPublicIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getMapCustomerOwnedIpOnLaunch() == null) ? 0 : getMapCustomerOwnedIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getCustomerOwnedIpv4Pool() == null) ? 0 : getCustomerOwnedIpv4Pool().hashCode());
        hashCode = prime * hashCode + ((getEnableDns64() == null) ? 0 : getEnableDns64().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsHostnameTypeOnLaunch() == null) ? 0 : getPrivateDnsHostnameTypeOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getEnableResourceNameDnsARecordOnLaunch() == null) ? 0 : getEnableResourceNameDnsARecordOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getEnableResourceNameDnsAAAARecordOnLaunch() == null) ? 0 : getEnableResourceNameDnsAAAARecordOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getEnableLniAtDeviceIndex() == null) ? 0 : getEnableLniAtDeviceIndex().hashCode());
        hashCode = prime * hashCode + ((getDisableLniAtDeviceIndex() == null) ? 0 : getDisableLniAtDeviceIndex().hashCode());
        return hashCode;
    }

    @Override
    public ModifySubnetAttributeRequest clone() {
        return (ModifySubnetAttributeRequest) super.clone();
    }
}
