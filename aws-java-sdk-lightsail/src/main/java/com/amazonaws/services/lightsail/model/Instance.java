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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance (a virtual private server).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Instance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     */
    private String blueprintId;
    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     */
    private String blueprintName;
    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * </p>
     */
    private Boolean isStaticIp;
    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     */
    private String publicIpAddress;
    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     */
    private String ipv6Address;
    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     */
    private InstanceHardware hardware;
    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for the instance.
     * </p>
     */
    private InstanceNetworking networking;
    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the instance.
     * </p>
     */
    private InstanceState state;
    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     * </p>
     */
    private String username;
    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>).
     * </p>
     */
    private String sshKeyName;

    /**
     * <p>
     * The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * 
     * @param name
     *        The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * 
     * @return The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * </p>
     * 
     * @param name
     *        The name the user gave the instance (e.g., <code>Amazon_Linux-1GB-Ohio-1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance (e.g.,
     *        <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance (e.g.,
     *         <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance (e.g.,
     * <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the instance (e.g.,
     *        <code>arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about an instance or
     *         another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *         more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about an instance or another
     * resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about an instance or
     *        another resource in Lightsail. This code enables our support team to look up your Lightsail information
     *        more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     * </p>
     * 
     * @return The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the instance was created (e.g., <code>1479734909.17</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     * 
     * @param location
     *        The region name and Availability Zone where the instance is located.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     * 
     * @return The region name and Availability Zone where the instance is located.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The region name and Availability Zone where the instance is located.
     * </p>
     * 
     * @param location
     *        The region name and Availability Zone where the instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>Instance</code>).
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * 
     * @return The type of resource (usually <code>Instance</code>).
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>Instance</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Instance withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>Instance</code>).
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource (usually <code>Instance</code>).
     * </p>
     * 
     * @param resourceType
     *        The type of resource (usually <code>Instance</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public Instance withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * 
     * @param blueprintId
     *        The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     */

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * 
     * @return The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     */

    public String getBlueprintId() {
        return this.blueprintId;
    }

    /**
     * <p>
     * The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * </p>
     * 
     * @param blueprintId
     *        The blueprint ID (e.g., <code>os_amlinux_2016_03</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBlueprintId(String blueprintId) {
        setBlueprintId(blueprintId);
        return this;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * 
     * @param blueprintName
     *        The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     */

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * 
     * @return The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     */

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * <p>
     * The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * </p>
     * 
     * @param blueprintName
     *        The friendly name of the blueprint (e.g., <code>Amazon Linux</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBlueprintName(String blueprintName) {
        setBlueprintName(blueprintName);
        return this;
    }

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle for the instance (e.g., <code>micro_1_0</code>).
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @return The bundle for the instance (e.g., <code>micro_1_0</code>).
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle for the instance (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle for the instance (e.g., <code>micro_1_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * </p>
     * 
     * @param isStaticIp
     *        A Boolean value indicating whether this instance has a static IP assigned to it.
     */

    public void setIsStaticIp(Boolean isStaticIp) {
        this.isStaticIp = isStaticIp;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * </p>
     * 
     * @return A Boolean value indicating whether this instance has a static IP assigned to it.
     */

    public Boolean getIsStaticIp() {
        return this.isStaticIp;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * </p>
     * 
     * @param isStaticIp
     *        A Boolean value indicating whether this instance has a static IP assigned to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withIsStaticIp(Boolean isStaticIp) {
        setIsStaticIp(isStaticIp);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * </p>
     * 
     * @return A Boolean value indicating whether this instance has a static IP assigned to it.
     */

    public Boolean isStaticIp() {
        return this.isStaticIp;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the instance.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * 
     * @return The private IP address of the instance.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address of the instance.
     */

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * 
     * @return The public IP address of the instance.
     */

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the instance.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPublicIpAddress(String publicIpAddress) {
        setPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * 
     * @param ipv6Address
     *        The IPv6 address of the instance.
     */

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * 
     * @return The IPv6 address of the instance.
     */

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    /**
     * <p>
     * The IPv6 address of the instance.
     * </p>
     * 
     * @param ipv6Address
     *        The IPv6 address of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withIpv6Address(String ipv6Address) {
        setIpv6Address(ipv6Address);
        return this;
    }

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     * 
     * @param hardware
     *        The size of the vCPU and the amount of RAM for the instance.
     */

    public void setHardware(InstanceHardware hardware) {
        this.hardware = hardware;
    }

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     * 
     * @return The size of the vCPU and the amount of RAM for the instance.
     */

    public InstanceHardware getHardware() {
        return this.hardware;
    }

    /**
     * <p>
     * The size of the vCPU and the amount of RAM for the instance.
     * </p>
     * 
     * @param hardware
     *        The size of the vCPU and the amount of RAM for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withHardware(InstanceHardware hardware) {
        setHardware(hardware);
        return this;
    }

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for the instance.
     * </p>
     * 
     * @param networking
     *        Information about the public ports and monthly data transfer rates for the instance.
     */

    public void setNetworking(InstanceNetworking networking) {
        this.networking = networking;
    }

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for the instance.
     * </p>
     * 
     * @return Information about the public ports and monthly data transfer rates for the instance.
     */

    public InstanceNetworking getNetworking() {
        return this.networking;
    }

    /**
     * <p>
     * Information about the public ports and monthly data transfer rates for the instance.
     * </p>
     * 
     * @param networking
     *        Information about the public ports and monthly data transfer rates for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withNetworking(InstanceNetworking networking) {
        setNetworking(networking);
        return this;
    }

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the instance.
     * </p>
     * 
     * @param state
     *        The status code and the state (e.g., <code>running</code>) for the instance.
     */

    public void setState(InstanceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the instance.
     * </p>
     * 
     * @return The status code and the state (e.g., <code>running</code>) for the instance.
     */

    public InstanceState getState() {
        return this.state;
    }

    /**
     * <p>
     * The status code and the state (e.g., <code>running</code>) for the instance.
     * </p>
     * 
     * @param state
     *        The status code and the state (e.g., <code>running</code>) for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withState(InstanceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     * </p>
     * 
     * @param username
     *        The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     * </p>
     * 
     * @return The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     * </p>
     * 
     * @param username
     *        The user name for connecting to the instance (e.g., <code>ec2-user</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>).
     * </p>
     * 
     * @param sshKeyName
     *        The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>
     *        ).
     */

    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>).
     * </p>
     * 
     * @return The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>
     *         ).
     */

    public String getSshKeyName() {
        return this.sshKeyName;
    }

    /**
     * <p>
     * The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>).
     * </p>
     * 
     * @param sshKeyName
     *        The name of the SSH key being used to connect to the instance (e.g., <code>LightsailDefaultKeyPair</code>
     *        ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSshKeyName(String sshKeyName) {
        setSshKeyName(sshKeyName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getBlueprintId() != null)
            sb.append("BlueprintId: ").append(getBlueprintId()).append(",");
        if (getBlueprintName() != null)
            sb.append("BlueprintName: ").append(getBlueprintName()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getIsStaticIp() != null)
            sb.append("IsStaticIp: ").append(getIsStaticIp()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: ").append(getPublicIpAddress()).append(",");
        if (getIpv6Address() != null)
            sb.append("Ipv6Address: ").append(getIpv6Address()).append(",");
        if (getHardware() != null)
            sb.append("Hardware: ").append(getHardware()).append(",");
        if (getNetworking() != null)
            sb.append("Networking: ").append(getNetworking()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getSshKeyName() != null)
            sb.append("SshKeyName: ").append(getSshKeyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null && other.getBlueprintId().equals(this.getBlueprintId()) == false)
            return false;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getIsStaticIp() == null ^ this.getIsStaticIp() == null)
            return false;
        if (other.getIsStaticIp() != null && other.getIsStaticIp().equals(this.getIsStaticIp()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getIpv6Address() == null ^ this.getIpv6Address() == null)
            return false;
        if (other.getIpv6Address() != null && other.getIpv6Address().equals(this.getIpv6Address()) == false)
            return false;
        if (other.getHardware() == null ^ this.getHardware() == null)
            return false;
        if (other.getHardware() != null && other.getHardware().equals(this.getHardware()) == false)
            return false;
        if (other.getNetworking() == null ^ this.getNetworking() == null)
            return false;
        if (other.getNetworking() != null && other.getNetworking().equals(this.getNetworking()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null)
            return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getIsStaticIp() == null) ? 0 : getIsStaticIp().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getIpv6Address() == null) ? 0 : getIpv6Address().hashCode());
        hashCode = prime * hashCode + ((getHardware() == null) ? 0 : getHardware().hashCode());
        hashCode = prime * hashCode + ((getNetworking() == null) ? 0 : getNetworking().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
