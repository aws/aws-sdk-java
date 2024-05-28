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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2InstanceDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2InstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     */
    private java.util.List<String> ipV4Addresses;
    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     */
    private java.util.List<String> ipV6Addresses;
    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     */
    private String iamInstanceProfileArn;
    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * Indicates when the instance was launched.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String launchedAt;
    /**
     * <p>
     * The identifiers of the network interfaces for the EC2 instance. The details for each network interface are in a
     * corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * </p>
     */
    private java.util.List<AwsEc2InstanceNetworkInterfacesDetails> networkInterfaces;
    /**
     * <p>
     * The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     * </p>
     */
    private String virtualizationType;
    /**
     * <p>
     * Details about the metadata options for the Amazon EC2 instance.
     * </p>
     */
    private AwsEc2InstanceMetadataOptions metadataOptions;
    /**
     * <p>
     * Describes the type of monitoring that’s turned on for an instance.
     * </p>
     */
    private AwsEc2InstanceMonitoringDetails monitoring;

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * 
     * @param type
     *        The instance type of the instance.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * 
     * @return The instance type of the instance.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The instance type of the instance.
     * </p>
     * 
     * @param type
     *        The instance type of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID of the instance.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * 
     * @return The Amazon Machine Image (AMI) ID of the instance.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) ID of the instance.
     * </p>
     * 
     * @param imageId
     *        The Amazon Machine Image (AMI) ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * 
     * @return The IPv4 addresses associated with the instance.
     */

    public java.util.List<String> getIpV4Addresses() {
        return ipV4Addresses;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IPv4 addresses associated with the instance.
     */

    public void setIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        if (ipV4Addresses == null) {
            this.ipV4Addresses = null;
            return;
        }

        this.ipV4Addresses = new java.util.ArrayList<String>(ipV4Addresses);
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV4Addresses(java.util.Collection)} or {@link #withIpV4Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IPv4 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV4Addresses(String... ipV4Addresses) {
        if (this.ipV4Addresses == null) {
            setIpV4Addresses(new java.util.ArrayList<String>(ipV4Addresses.length));
        }
        for (String ele : ipV4Addresses) {
            this.ipV4Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 addresses associated with the instance.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IPv4 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        setIpV4Addresses(ipV4Addresses);
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * 
     * @return The IPv6 addresses associated with the instance.
     */

    public java.util.List<String> getIpV6Addresses() {
        return ipV6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the instance.
     */

    public void setIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        if (ipV6Addresses == null) {
            this.ipV6Addresses = null;
            return;
        }

        this.ipV6Addresses = new java.util.ArrayList<String>(ipV6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV6Addresses(java.util.Collection)} or {@link #withIpV6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV6Addresses(String... ipV6Addresses) {
        if (this.ipV6Addresses == null) {
            setIpV6Addresses(new java.util.ArrayList<String>(ipV6Addresses.length));
        }
        for (String ele : ipV6Addresses) {
            this.ipV6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the instance.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        setIpV6Addresses(ipV6Addresses);
        return this;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * 
     * @param keyName
     *        The key name associated with the instance.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * 
     * @return The key name associated with the instance.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The key name associated with the instance.
     * </p>
     * 
     * @param keyName
     *        The key name associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * 
     * @param iamInstanceProfileArn
     *        The IAM profile ARN of the instance.
     */

    public void setIamInstanceProfileArn(String iamInstanceProfileArn) {
        this.iamInstanceProfileArn = iamInstanceProfileArn;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * 
     * @return The IAM profile ARN of the instance.
     */

    public String getIamInstanceProfileArn() {
        return this.iamInstanceProfileArn;
    }

    /**
     * <p>
     * The IAM profile ARN of the instance.
     * </p>
     * 
     * @param iamInstanceProfileArn
     *        The IAM profile ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withIamInstanceProfileArn(String iamInstanceProfileArn) {
        setIamInstanceProfileArn(iamInstanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the instance was launched in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * 
     * @return The identifier of the VPC that the instance was launched in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the instance was launched in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the instance was launched in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that the instance was launched in.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * 
     * @return The identifier of the subnet that the instance was launched in.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the instance was launched in.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that the instance was launched in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * Indicates when the instance was launched.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param launchedAt
     *        Indicates when the instance was launched.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * Indicates when the instance was launched.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates when the instance was launched.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getLaunchedAt() {
        return this.launchedAt;
    }

    /**
     * <p>
     * Indicates when the instance was launched.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param launchedAt
     *        Indicates when the instance was launched.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withLaunchedAt(String launchedAt) {
        setLaunchedAt(launchedAt);
        return this;
    }

    /**
     * <p>
     * The identifiers of the network interfaces for the EC2 instance. The details for each network interface are in a
     * corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * </p>
     * 
     * @return The identifiers of the network interfaces for the EC2 instance. The details for each network interface
     *         are in a corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     */

    public java.util.List<AwsEc2InstanceNetworkInterfacesDetails> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * The identifiers of the network interfaces for the EC2 instance. The details for each network interface are in a
     * corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * </p>
     * 
     * @param networkInterfaces
     *        The identifiers of the network interfaces for the EC2 instance. The details for each network interface are
     *        in a corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     */

    public void setNetworkInterfaces(java.util.Collection<AwsEc2InstanceNetworkInterfacesDetails> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<AwsEc2InstanceNetworkInterfacesDetails>(networkInterfaces);
    }

    /**
     * <p>
     * The identifiers of the network interfaces for the EC2 instance. The details for each network interface are in a
     * corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The identifiers of the network interfaces for the EC2 instance. The details for each network interface are
     *        in a corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withNetworkInterfaces(AwsEc2InstanceNetworkInterfacesDetails... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<AwsEc2InstanceNetworkInterfacesDetails>(networkInterfaces.length));
        }
        for (AwsEc2InstanceNetworkInterfacesDetails ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the network interfaces for the EC2 instance. The details for each network interface are in a
     * corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * </p>
     * 
     * @param networkInterfaces
     *        The identifiers of the network interfaces for the EC2 instance. The details for each network interface are
     *        in a corresponding <code>AwsEc2NetworkInterfacesDetails</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withNetworkInterfaces(java.util.Collection<AwsEc2InstanceNetworkInterfacesDetails> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     * </p>
     * 
     * @param virtualizationType
     *        The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     * </p>
     * 
     * @return The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     * </p>
     * 
     * @param virtualizationType
     *        The virtualization type of the Amazon Machine Image (AMI) required to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * Details about the metadata options for the Amazon EC2 instance.
     * </p>
     * 
     * @param metadataOptions
     *        Details about the metadata options for the Amazon EC2 instance.
     */

    public void setMetadataOptions(AwsEc2InstanceMetadataOptions metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    /**
     * <p>
     * Details about the metadata options for the Amazon EC2 instance.
     * </p>
     * 
     * @return Details about the metadata options for the Amazon EC2 instance.
     */

    public AwsEc2InstanceMetadataOptions getMetadataOptions() {
        return this.metadataOptions;
    }

    /**
     * <p>
     * Details about the metadata options for the Amazon EC2 instance.
     * </p>
     * 
     * @param metadataOptions
     *        Details about the metadata options for the Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withMetadataOptions(AwsEc2InstanceMetadataOptions metadataOptions) {
        setMetadataOptions(metadataOptions);
        return this;
    }

    /**
     * <p>
     * Describes the type of monitoring that’s turned on for an instance.
     * </p>
     * 
     * @param monitoring
     *        Describes the type of monitoring that’s turned on for an instance.
     */

    public void setMonitoring(AwsEc2InstanceMonitoringDetails monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * Describes the type of monitoring that’s turned on for an instance.
     * </p>
     * 
     * @return Describes the type of monitoring that’s turned on for an instance.
     */

    public AwsEc2InstanceMonitoringDetails getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * Describes the type of monitoring that’s turned on for an instance.
     * </p>
     * 
     * @param monitoring
     *        Describes the type of monitoring that’s turned on for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceDetails withMonitoring(AwsEc2InstanceMonitoringDetails monitoring) {
        setMonitoring(monitoring);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getIpV4Addresses() != null)
            sb.append("IpV4Addresses: ").append(getIpV4Addresses()).append(",");
        if (getIpV6Addresses() != null)
            sb.append("IpV6Addresses: ").append(getIpV6Addresses()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getIamInstanceProfileArn() != null)
            sb.append("IamInstanceProfileArn: ").append(getIamInstanceProfileArn()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: ").append(getLaunchedAt()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: ").append(getVirtualizationType()).append(",");
        if (getMetadataOptions() != null)
            sb.append("MetadataOptions: ").append(getMetadataOptions()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2InstanceDetails == false)
            return false;
        AwsEc2InstanceDetails other = (AwsEc2InstanceDetails) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getIpV4Addresses() == null ^ this.getIpV4Addresses() == null)
            return false;
        if (other.getIpV4Addresses() != null && other.getIpV4Addresses().equals(this.getIpV4Addresses()) == false)
            return false;
        if (other.getIpV6Addresses() == null ^ this.getIpV6Addresses() == null)
            return false;
        if (other.getIpV6Addresses() != null && other.getIpV6Addresses().equals(this.getIpV6Addresses()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getIamInstanceProfileArn() == null ^ this.getIamInstanceProfileArn() == null)
            return false;
        if (other.getIamInstanceProfileArn() != null && other.getIamInstanceProfileArn().equals(this.getIamInstanceProfileArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        if (other.getMetadataOptions() == null ^ this.getMetadataOptions() == null)
            return false;
        if (other.getMetadataOptions() != null && other.getMetadataOptions().equals(this.getMetadataOptions()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getIpV4Addresses() == null) ? 0 : getIpV4Addresses().hashCode());
        hashCode = prime * hashCode + ((getIpV6Addresses() == null) ? 0 : getIpV6Addresses().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfileArn() == null) ? 0 : getIamInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        hashCode = prime * hashCode + ((getMetadataOptions() == null) ? 0 : getMetadataOptions().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2InstanceDetails clone() {
        try {
            return (AwsEc2InstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2InstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
