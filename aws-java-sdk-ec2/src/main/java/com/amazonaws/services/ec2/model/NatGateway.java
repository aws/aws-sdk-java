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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a NAT gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NatGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NatGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the NAT gateway was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The date and time the NAT gateway was deleted, if applicable.
     * </p>
     */
    private java.util.Date deleteTime;
    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error code for the failure. (
     * <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>
     * | <code>InvalidSubnetID.NotFound</code>)
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the
     * error code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidAllocationID.NotFound:
     * "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InternalError:
     * "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     * </p>
     * </li>
     * </ul>
     */
    private String failureMessage;
    /**
     * <p>
     * Information about the IP addresses and network interface associated with the NAT gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NatGatewayAddress> natGatewayAddresses;
    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * Reserved. If you need to sustain traffic greater than the <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>, contact
     * us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     * </p>
     */
    private ProvisionedBandwidth provisionedBandwidth;
    /**
     * <p>
     * The state of the NAT gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     * <code>failureMessage</code> fields for the reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete the NAT
     * gateway, and does not indicate the health of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The ID of the subnet in which the NAT gateway is located.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ID of the VPC in which the NAT gateway is located.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The tags for the NAT gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The date and time the NAT gateway was created.
     * </p>
     * 
     * @param createTime
     *        The date and time the NAT gateway was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the NAT gateway was created.
     * </p>
     * 
     * @return The date and time the NAT gateway was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time the NAT gateway was created.
     * </p>
     * 
     * @param createTime
     *        The date and time the NAT gateway was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The date and time the NAT gateway was deleted, if applicable.
     * </p>
     * 
     * @param deleteTime
     *        The date and time the NAT gateway was deleted, if applicable.
     */

    public void setDeleteTime(java.util.Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * <p>
     * The date and time the NAT gateway was deleted, if applicable.
     * </p>
     * 
     * @return The date and time the NAT gateway was deleted, if applicable.
     */

    public java.util.Date getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * <p>
     * The date and time the NAT gateway was deleted, if applicable.
     * </p>
     * 
     * @param deleteTime
     *        The date and time the NAT gateway was deleted, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withDeleteTime(java.util.Date deleteTime) {
        setDeleteTime(deleteTime);
        return this;
    }

    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error code for the failure. (
     * <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>
     * | <code>InvalidSubnetID.NotFound</code>)
     * </p>
     * 
     * @param failureCode
     *        If the NAT gateway could not be created, specifies the error code for the failure. (
     *        <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     *        <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> |
     *        <code>InternalError</code> | <code>InvalidSubnetID.NotFound</code>)
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error code for the failure. (
     * <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>
     * | <code>InvalidSubnetID.NotFound</code>)
     * </p>
     * 
     * @return If the NAT gateway could not be created, specifies the error code for the failure. (
     *         <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     *         <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> |
     *         <code>InternalError</code> | <code>InvalidSubnetID.NotFound</code>)
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error code for the failure. (
     * <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     * <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> | <code>InternalError</code>
     * | <code>InvalidSubnetID.NotFound</code>)
     * </p>
     * 
     * @param failureCode
     *        If the NAT gateway could not be created, specifies the error code for the failure. (
     *        <code>InsufficientFreeAddressesInSubnet</code> | <code>Gateway.NotAttached</code> |
     *        <code>InvalidAllocationID.NotFound</code> | <code>Resource.AlreadyAssociated</code> |
     *        <code>InternalError</code> | <code>InvalidSubnetID.NotFound</code>)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the
     * error code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidAllocationID.NotFound:
     * "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InternalError:
     * "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureMessage
     *        If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to
     *        the error code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For InvalidAllocationID.NotFound:
     *        "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For InternalError:
     *        "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     *        </p>
     *        </li>
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the
     * error code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidAllocationID.NotFound:
     * "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InternalError:
     * "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to
     *         the error code.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For InsufficientFreeAddressesInSubnet:
     *         "Subnet has insufficient free addresses to create this NAT gateway"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For InvalidAllocationID.NotFound:
     *         "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For InternalError:
     *         "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For InvalidSubnetID.NotFound:
     *         "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     *         </p>
     *         </li>
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to the
     * error code.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidAllocationID.NotFound:
     * "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     * </p>
     * </li>
     * <li>
     * <p>
     * For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     * </p>
     * </li>
     * <li>
     * <p>
     * For InternalError:
     * "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     * </p>
     * </li>
     * <li>
     * <p>
     * For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureMessage
     *        If the NAT gateway could not be created, specifies the error message for the failure, that corresponds to
     *        the error code.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For InsufficientFreeAddressesInSubnet: "Subnet has insufficient free addresses to create this NAT gateway"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Gateway.NotAttached: "Network vpc-xxxxxxxx has no Internet gateway attached"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For InvalidAllocationID.NotFound:
     *        "Elastic IP address eipalloc-xxxxxxxx could not be associated with this NAT gateway"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Resource.AlreadyAssociated: "Elastic IP address eipalloc-xxxxxxxx is already associated"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For InternalError:
     *        "Network interface eni-xxxxxxxx, created and used internally by this NAT gateway is in an invalid state. Please try again."
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For InvalidSubnetID.NotFound: "The specified subnet subnet-xxxxxxxx does not exist or could not be found."
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * Information about the IP addresses and network interface associated with the NAT gateway.
     * </p>
     * 
     * @return Information about the IP addresses and network interface associated with the NAT gateway.
     */

    public java.util.List<NatGatewayAddress> getNatGatewayAddresses() {
        if (natGatewayAddresses == null) {
            natGatewayAddresses = new com.amazonaws.internal.SdkInternalList<NatGatewayAddress>();
        }
        return natGatewayAddresses;
    }

    /**
     * <p>
     * Information about the IP addresses and network interface associated with the NAT gateway.
     * </p>
     * 
     * @param natGatewayAddresses
     *        Information about the IP addresses and network interface associated with the NAT gateway.
     */

    public void setNatGatewayAddresses(java.util.Collection<NatGatewayAddress> natGatewayAddresses) {
        if (natGatewayAddresses == null) {
            this.natGatewayAddresses = null;
            return;
        }

        this.natGatewayAddresses = new com.amazonaws.internal.SdkInternalList<NatGatewayAddress>(natGatewayAddresses);
    }

    /**
     * <p>
     * Information about the IP addresses and network interface associated with the NAT gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNatGatewayAddresses(java.util.Collection)} or {@link #withNatGatewayAddresses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param natGatewayAddresses
     *        Information about the IP addresses and network interface associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withNatGatewayAddresses(NatGatewayAddress... natGatewayAddresses) {
        if (this.natGatewayAddresses == null) {
            setNatGatewayAddresses(new com.amazonaws.internal.SdkInternalList<NatGatewayAddress>(natGatewayAddresses.length));
        }
        for (NatGatewayAddress ele : natGatewayAddresses) {
            this.natGatewayAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the IP addresses and network interface associated with the NAT gateway.
     * </p>
     * 
     * @param natGatewayAddresses
     *        Information about the IP addresses and network interface associated with the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withNatGatewayAddresses(java.util.Collection<NatGatewayAddress> natGatewayAddresses) {
        setNatGatewayAddresses(natGatewayAddresses);
        return this;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @return The ID of the NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * Reserved. If you need to sustain traffic greater than the <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>, contact
     * us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     * </p>
     * 
     * @param provisionedBandwidth
     *        Reserved. If you need to sustain traffic greater than the <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>,
     *        contact us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     */

    public void setProvisionedBandwidth(ProvisionedBandwidth provisionedBandwidth) {
        this.provisionedBandwidth = provisionedBandwidth;
    }

    /**
     * <p>
     * Reserved. If you need to sustain traffic greater than the <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>, contact
     * us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     * </p>
     * 
     * @return Reserved. If you need to sustain traffic greater than the <a
     *         href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>,
     *         contact us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     */

    public ProvisionedBandwidth getProvisionedBandwidth() {
        return this.provisionedBandwidth;
    }

    /**
     * <p>
     * Reserved. If you need to sustain traffic greater than the <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>, contact
     * us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     * </p>
     * 
     * @param provisionedBandwidth
     *        Reserved. If you need to sustain traffic greater than the <a
     *        href="https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html">documented limits</a>,
     *        contact us through the <a href="https://console.aws.amazon.com/support/home?">Support Center</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withProvisionedBandwidth(ProvisionedBandwidth provisionedBandwidth) {
        setProvisionedBandwidth(provisionedBandwidth);
        return this;
    }

    /**
     * <p>
     * The state of the NAT gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     * <code>failureMessage</code> fields for the reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete the NAT
     * gateway, and does not indicate the health of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the NAT gateway.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     *        <code>failureMessage</code> fields for the reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete
     *        the NAT gateway, and does not indicate the health of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing
     *        traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     *        </p>
     *        </li>
     * @see NatGatewayState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the NAT gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     * <code>failureMessage</code> fields for the reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete the NAT
     * gateway, and does not indicate the health of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the NAT gateway.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     *         <code>failureMessage</code> fields for the reason.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete
     *         the NAT gateway, and does not indicate the health of the NAT gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing
     *         traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     *         </p>
     *         </li>
     * @see NatGatewayState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the NAT gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     * <code>failureMessage</code> fields for the reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete the NAT
     * gateway, and does not indicate the health of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the NAT gateway.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     *        <code>failureMessage</code> fields for the reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete
     *        the NAT gateway, and does not indicate the health of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing
     *        traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NatGatewayState
     */

    public NatGateway withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the NAT gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     * <code>failureMessage</code> fields for the reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete the NAT
     * gateway, and does not indicate the health of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the NAT gateway.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     *        <code>failureMessage</code> fields for the reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete
     *        the NAT gateway, and does not indicate the health of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing
     *        traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     *        </p>
     *        </li>
     * @see NatGatewayState
     */

    public void setState(NatGatewayState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the NAT gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     * <code>failureMessage</code> fields for the reason.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete the NAT
     * gateway, and does not indicate the health of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The state of the NAT gateway.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending</code>: The NAT gateway is being created and is not ready to process traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: The NAT gateway could not be created. Check the <code>failureCode</code> and
     *        <code>failureMessage</code> fields for the reason.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The NAT gateway is able to process traffic. This status remains until you delete
     *        the NAT gateway, and does not indicate the health of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The NAT gateway is in the process of being terminated and may still be processing
     *        traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The NAT gateway has been terminated and is no longer processing traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NatGatewayState
     */

    public NatGateway withState(NatGatewayState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the subnet in which the NAT gateway is located.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which the NAT gateway is located.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which the NAT gateway is located.
     * </p>
     * 
     * @return The ID of the subnet in which the NAT gateway is located.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which the NAT gateway is located.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which the NAT gateway is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the NAT gateway is located.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the NAT gateway is located.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the NAT gateway is located.
     * </p>
     * 
     * @return The ID of the VPC in which the NAT gateway is located.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the NAT gateway is located.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the NAT gateway is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The tags for the NAT gateway.
     * </p>
     * 
     * @return The tags for the NAT gateway.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the NAT gateway.
     * </p>
     * 
     * @param tags
     *        The tags for the NAT gateway.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the NAT gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the NAT gateway.
     * </p>
     * 
     * @param tags
     *        The tags for the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NatGateway withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDeleteTime() != null)
            sb.append("DeleteTime: ").append(getDeleteTime()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getNatGatewayAddresses() != null)
            sb.append("NatGatewayAddresses: ").append(getNatGatewayAddresses()).append(",");
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getProvisionedBandwidth() != null)
            sb.append("ProvisionedBandwidth: ").append(getProvisionedBandwidth()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NatGateway == false)
            return false;
        NatGateway other = (NatGateway) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDeleteTime() == null ^ this.getDeleteTime() == null)
            return false;
        if (other.getDeleteTime() != null && other.getDeleteTime().equals(this.getDeleteTime()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getNatGatewayAddresses() == null ^ this.getNatGatewayAddresses() == null)
            return false;
        if (other.getNatGatewayAddresses() != null && other.getNatGatewayAddresses().equals(this.getNatGatewayAddresses()) == false)
            return false;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getProvisionedBandwidth() == null ^ this.getProvisionedBandwidth() == null)
            return false;
        if (other.getProvisionedBandwidth() != null && other.getProvisionedBandwidth().equals(this.getProvisionedBandwidth()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayAddresses() == null) ? 0 : getNatGatewayAddresses().hashCode());
        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedBandwidth() == null) ? 0 : getProvisionedBandwidth().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NatGateway clone() {
        try {
            return (NatGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
