/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyNetworkInterfaceAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyNetworkInterfaceAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyNetworkInterfaceAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyNetworkInterfaceAttributeRequest> {

    /**
     * <p>
     * Information about the interface attachment. If modifying the <code>delete on termination</code> attribute, you
     * must specify the ID of the interface attachment.
     * </p>
     */
    private NetworkInterfaceAttachmentChanges attachment;
    /**
     * <p>
     * A description for the network interface.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groups;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * Enable or disable source/destination checks, which ensure that the instance is either the source or the
     * destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks are
     * enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     * source/destination checks if the instance runs services such as network address translation, routing, or
     * firewalls.
     * </p>
     */
    private Boolean sourceDestCheck;
    /**
     * <p>
     * Updates the ENA Express configuration for the network interface that’s attached to the instance.
     * </p>
     */
    private EnaSrdSpecification enaSrdSpecification;
    /**
     * <p>
     * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign a
     * primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have
     * enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached to relies
     * on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address associated with
     * the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6 GUA address to be a
     * primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA
     * will be made the primary IPv6 address until the instance is terminated or the network interface is detached. If
     * you have multiple IPv6 addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     * </p>
     */
    private Boolean enablePrimaryIpv6;
    /**
     * <p>
     * A connection tracking specification.
     * </p>
     */
    private ConnectionTrackingSpecificationRequest connectionTrackingSpecification;
    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for any
     * network interface but will only apply to the primary network interface (eth0).
     * </p>
     */
    private Boolean associatePublicIpAddress;

    /**
     * <p>
     * Information about the interface attachment. If modifying the <code>delete on termination</code> attribute, you
     * must specify the ID of the interface attachment.
     * </p>
     * 
     * @param attachment
     *        Information about the interface attachment. If modifying the <code>delete on termination</code> attribute,
     *        you must specify the ID of the interface attachment.
     */

    public void setAttachment(NetworkInterfaceAttachmentChanges attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Information about the interface attachment. If modifying the <code>delete on termination</code> attribute, you
     * must specify the ID of the interface attachment.
     * </p>
     * 
     * @return Information about the interface attachment. If modifying the <code>delete on termination</code>
     *         attribute, you must specify the ID of the interface attachment.
     */

    public NetworkInterfaceAttachmentChanges getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Information about the interface attachment. If modifying the <code>delete on termination</code> attribute, you
     * must specify the ID of the interface attachment.
     * </p>
     * 
     * @param attachment
     *        Information about the interface attachment. If modifying the <code>delete on termination</code> attribute,
     *        you must specify the ID of the interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withAttachment(NetworkInterfaceAttachmentChanges attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @return A description for the network interface.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the network interface.
     * </p>
     * 
     * @param description
     *        A description for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * 
     * @return Changes the security groups for the network interface. The new set of groups you specify replaces the
     *         current set. You must specify at least one group, even if it's just the default security group in the
     *         VPC. You must specify the ID of the security group, not the name.
     */

    public java.util.List<String> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groups;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * 
     * @param groups
     *        Changes the security groups for the network interface. The new set of groups you specify replaces the
     *        current set. You must specify at least one group, even if it's just the default security group in the VPC.
     *        You must specify the ID of the security group, not the name.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<String>(groups);
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        Changes the security groups for the network interface. The new set of groups you specify replaces the
     *        current set. You must specify at least one group, even if it's just the default security group in the VPC.
     *        You must specify the ID of the security group, not the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Changes the security groups for the network interface. The new set of groups you specify replaces the current
     * set. You must specify at least one group, even if it's just the default security group in the VPC. You must
     * specify the ID of the security group, not the name.
     * </p>
     * 
     * @param groups
     *        Changes the security groups for the network interface. The new set of groups you specify replaces the
     *        current set. You must specify at least one group, even if it's just the default security group in the VPC.
     *        You must specify the ID of the security group, not the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * Enable or disable source/destination checks, which ensure that the instance is either the source or the
     * destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks are
     * enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     * source/destination checks if the instance runs services such as network address translation, routing, or
     * firewalls.
     * </p>
     * 
     * @param sourceDestCheck
     *        Enable or disable source/destination checks, which ensure that the instance is either the source or the
     *        destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks
     *        are enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     *        source/destination checks if the instance runs services such as network address translation, routing, or
     *        firewalls.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Enable or disable source/destination checks, which ensure that the instance is either the source or the
     * destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks are
     * enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     * source/destination checks if the instance runs services such as network address translation, routing, or
     * firewalls.
     * </p>
     * 
     * @return Enable or disable source/destination checks, which ensure that the instance is either the source or the
     *         destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks
     *         are enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     *         source/destination checks if the instance runs services such as network address translation, routing, or
     *         firewalls.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Enable or disable source/destination checks, which ensure that the instance is either the source or the
     * destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks are
     * enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     * source/destination checks if the instance runs services such as network address translation, routing, or
     * firewalls.
     * </p>
     * 
     * @param sourceDestCheck
     *        Enable or disable source/destination checks, which ensure that the instance is either the source or the
     *        destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks
     *        are enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     *        source/destination checks if the instance runs services such as network address translation, routing, or
     *        firewalls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Enable or disable source/destination checks, which ensure that the instance is either the source or the
     * destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks are
     * enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     * source/destination checks if the instance runs services such as network address translation, routing, or
     * firewalls.
     * </p>
     * 
     * @return Enable or disable source/destination checks, which ensure that the instance is either the source or the
     *         destination of any traffic that it receives. If the value is <code>true</code>, source/destination checks
     *         are enabled; otherwise, they are disabled. The default value is <code>true</code>. You must disable
     *         source/destination checks if the instance runs services such as network address translation, routing, or
     *         firewalls.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Updates the ENA Express configuration for the network interface that’s attached to the instance.
     * </p>
     * 
     * @param enaSrdSpecification
     *        Updates the ENA Express configuration for the network interface that’s attached to the instance.
     */

    public void setEnaSrdSpecification(EnaSrdSpecification enaSrdSpecification) {
        this.enaSrdSpecification = enaSrdSpecification;
    }

    /**
     * <p>
     * Updates the ENA Express configuration for the network interface that’s attached to the instance.
     * </p>
     * 
     * @return Updates the ENA Express configuration for the network interface that’s attached to the instance.
     */

    public EnaSrdSpecification getEnaSrdSpecification() {
        return this.enaSrdSpecification;
    }

    /**
     * <p>
     * Updates the ENA Express configuration for the network interface that’s attached to the instance.
     * </p>
     * 
     * @param enaSrdSpecification
     *        Updates the ENA Express configuration for the network interface that’s attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withEnaSrdSpecification(EnaSrdSpecification enaSrdSpecification) {
        setEnaSrdSpecification(enaSrdSpecification);
        return this;
    }

    /**
     * <p>
     * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign a
     * primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have
     * enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached to relies
     * on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address associated with
     * the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6 GUA address to be a
     * primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA
     * will be made the primary IPv6 address until the instance is terminated or the network interface is detached. If
     * you have multiple IPv6 addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     * </p>
     * 
     * @param enablePrimaryIpv6
     *        If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign
     *        a primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you
     *        have enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached
     *        to relies on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address
     *        associated with the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6
     *        GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a
     *        primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the instance is terminated or
     *        the network interface is detached. If you have multiple IPv6 addresses associated with an ENI attached to
     *        your instance and you enable a primary IPv6 address, the first IPv6 GUA address associated with the ENI
     *        becomes the primary IPv6 address.
     */

    public void setEnablePrimaryIpv6(Boolean enablePrimaryIpv6) {
        this.enablePrimaryIpv6 = enablePrimaryIpv6;
    }

    /**
     * <p>
     * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign a
     * primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have
     * enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached to relies
     * on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address associated with
     * the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6 GUA address to be a
     * primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA
     * will be made the primary IPv6 address until the instance is terminated or the network interface is detached. If
     * you have multiple IPv6 addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     * </p>
     * 
     * @return If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to
     *         assign a primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI
     *         that you have enabled to use a primary IPv6 address. Use this option if the instance that this ENI will
     *         be attached to relies on its IPv6 address not changing. Amazon Web Services will automatically assign an
     *         IPv6 address associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     *         enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6 GUA
     *         address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the instance
     *         is terminated or the network interface is detached. If you have multiple IPv6 addresses associated with
     *         an ENI attached to your instance and you enable a primary IPv6 address, the first IPv6 GUA address
     *         associated with the ENI becomes the primary IPv6 address.
     */

    public Boolean getEnablePrimaryIpv6() {
        return this.enablePrimaryIpv6;
    }

    /**
     * <p>
     * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign a
     * primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have
     * enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached to relies
     * on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address associated with
     * the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6 GUA address to be a
     * primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA
     * will be made the primary IPv6 address until the instance is terminated or the network interface is detached. If
     * you have multiple IPv6 addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     * </p>
     * 
     * @param enablePrimaryIpv6
     *        If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign
     *        a primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you
     *        have enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached
     *        to relies on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address
     *        associated with the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6
     *        GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a
     *        primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the instance is terminated or
     *        the network interface is detached. If you have multiple IPv6 addresses associated with an ENI attached to
     *        your instance and you enable a primary IPv6 address, the first IPv6 GUA address associated with the ENI
     *        becomes the primary IPv6 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withEnablePrimaryIpv6(Boolean enablePrimaryIpv6) {
        setEnablePrimaryIpv6(enablePrimaryIpv6);
        return this;
    }

    /**
     * <p>
     * If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to assign a
     * primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI that you have
     * enabled to use a primary IPv6 address. Use this option if the instance that this ENI will be attached to relies
     * on its IPv6 address not changing. Amazon Web Services will automatically assign an IPv6 address associated with
     * the ENI attached to your instance to be the primary IPv6 address. Once you enable an IPv6 GUA address to be a
     * primary IPv6, you cannot disable it. When you enable an IPv6 GUA address to be a primary IPv6, the first IPv6 GUA
     * will be made the primary IPv6 address until the instance is terminated or the network interface is detached. If
     * you have multiple IPv6 addresses associated with an ENI attached to your instance and you enable a primary IPv6
     * address, the first IPv6 GUA address associated with the ENI becomes the primary IPv6 address.
     * </p>
     * 
     * @return If you’re modifying a network interface in a dual-stack or IPv6-only subnet, you have the option to
     *         assign a primary IPv6 IP address. A primary IPv6 address is an IPv6 GUA address associated with an ENI
     *         that you have enabled to use a primary IPv6 address. Use this option if the instance that this ENI will
     *         be attached to relies on its IPv6 address not changing. Amazon Web Services will automatically assign an
     *         IPv6 address associated with the ENI attached to your instance to be the primary IPv6 address. Once you
     *         enable an IPv6 GUA address to be a primary IPv6, you cannot disable it. When you enable an IPv6 GUA
     *         address to be a primary IPv6, the first IPv6 GUA will be made the primary IPv6 address until the instance
     *         is terminated or the network interface is detached. If you have multiple IPv6 addresses associated with
     *         an ENI attached to your instance and you enable a primary IPv6 address, the first IPv6 GUA address
     *         associated with the ENI becomes the primary IPv6 address.
     */

    public Boolean isEnablePrimaryIpv6() {
        return this.enablePrimaryIpv6;
    }

    /**
     * <p>
     * A connection tracking specification.
     * </p>
     * 
     * @param connectionTrackingSpecification
     *        A connection tracking specification.
     */

    public void setConnectionTrackingSpecification(ConnectionTrackingSpecificationRequest connectionTrackingSpecification) {
        this.connectionTrackingSpecification = connectionTrackingSpecification;
    }

    /**
     * <p>
     * A connection tracking specification.
     * </p>
     * 
     * @return A connection tracking specification.
     */

    public ConnectionTrackingSpecificationRequest getConnectionTrackingSpecification() {
        return this.connectionTrackingSpecification;
    }

    /**
     * <p>
     * A connection tracking specification.
     * </p>
     * 
     * @param connectionTrackingSpecification
     *        A connection tracking specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withConnectionTrackingSpecification(ConnectionTrackingSpecificationRequest connectionTrackingSpecification) {
        setConnectionTrackingSpecification(connectionTrackingSpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for any
     * network interface but will only apply to the primary network interface (eth0).
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for
     *        any network interface but will only apply to the primary network interface (eth0).
     */

    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for any
     * network interface but will only apply to the primary network interface (eth0).
     * </p>
     * 
     * @return Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for
     *         any network interface but will only apply to the primary network interface (eth0).
     */

    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for any
     * network interface but will only apply to the primary network interface (eth0).
     * </p>
     * 
     * @param associatePublicIpAddress
     *        Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for
     *        any network interface but will only apply to the primary network interface (eth0).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyNetworkInterfaceAttributeRequest withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        setAssociatePublicIpAddress(associatePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for any
     * network interface but will only apply to the primary network interface (eth0).
     * </p>
     * 
     * @return Indicates whether to assign a public IPv4 address to a network interface. This option can be enabled for
     *         any network interface but will only apply to the primary network interface (eth0).
     */

    public Boolean isAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<ModifyNetworkInterfaceAttributeRequest> request = new ModifyNetworkInterfaceAttributeRequestMarshaller().marshall(this);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: ").append(getSourceDestCheck()).append(",");
        if (getEnaSrdSpecification() != null)
            sb.append("EnaSrdSpecification: ").append(getEnaSrdSpecification()).append(",");
        if (getEnablePrimaryIpv6() != null)
            sb.append("EnablePrimaryIpv6: ").append(getEnablePrimaryIpv6()).append(",");
        if (getConnectionTrackingSpecification() != null)
            sb.append("ConnectionTrackingSpecification: ").append(getConnectionTrackingSpecification()).append(",");
        if (getAssociatePublicIpAddress() != null)
            sb.append("AssociatePublicIpAddress: ").append(getAssociatePublicIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyNetworkInterfaceAttributeRequest == false)
            return false;
        ModifyNetworkInterfaceAttributeRequest other = (ModifyNetworkInterfaceAttributeRequest) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getEnaSrdSpecification() == null ^ this.getEnaSrdSpecification() == null)
            return false;
        if (other.getEnaSrdSpecification() != null && other.getEnaSrdSpecification().equals(this.getEnaSrdSpecification()) == false)
            return false;
        if (other.getEnablePrimaryIpv6() == null ^ this.getEnablePrimaryIpv6() == null)
            return false;
        if (other.getEnablePrimaryIpv6() != null && other.getEnablePrimaryIpv6().equals(this.getEnablePrimaryIpv6()) == false)
            return false;
        if (other.getConnectionTrackingSpecification() == null ^ this.getConnectionTrackingSpecification() == null)
            return false;
        if (other.getConnectionTrackingSpecification() != null
                && other.getConnectionTrackingSpecification().equals(this.getConnectionTrackingSpecification()) == false)
            return false;
        if (other.getAssociatePublicIpAddress() == null ^ this.getAssociatePublicIpAddress() == null)
            return false;
        if (other.getAssociatePublicIpAddress() != null && other.getAssociatePublicIpAddress().equals(this.getAssociatePublicIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode + ((getEnaSrdSpecification() == null) ? 0 : getEnaSrdSpecification().hashCode());
        hashCode = prime * hashCode + ((getEnablePrimaryIpv6() == null) ? 0 : getEnablePrimaryIpv6().hashCode());
        hashCode = prime * hashCode + ((getConnectionTrackingSpecification() == null) ? 0 : getConnectionTrackingSpecification().hashCode());
        hashCode = prime * hashCode + ((getAssociatePublicIpAddress() == null) ? 0 : getAssociatePublicIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public ModifyNetworkInterfaceAttributeRequest clone() {
        return (ModifyNetworkInterfaceAttributeRequest) super.clone();
    }
}
