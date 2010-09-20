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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * Represents an Amazon EC2 instance.
 * </p>
 */
public class Instance {

    /**
     * Unique ID of the instance launched.
     */
    private String instanceId;

    /**
     * Image ID of the AMI used to launch the instance.
     */
    private String imageId;

    /**
     * The current state of the instance.
     */
    private InstanceState state;

    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This element remains empty
     * until the instance enters a running state.
     */
    private String privateDnsName;

    /**
     * The public DNS name assigned to the instance. This DNS name is
     * contactable from outside the Amazon EC2 network. This element remains
     * empty until the instance enters a running state.
     */
    private String publicDnsName;

    /**
     * Reason for the most recent state transition. This might be an empty
     * string.
     */
    private String stateTransitionReason;

    /**
     * If this instance was launched with an associated key pair, this
     * displays the key pair name.
     */
    private String keyName;

    /**
     * The AMI launch index, which can be used to find this instance within
     * the launch group.
     */
    private Integer amiLaunchIndex;

    /**
     * Product codes attached to this instance.
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * The instance type. For more information on instance types, please see
     * the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     */
    private String instanceType;

    /**
     * The time this instance launched.
     */
    private java.util.Date launchTime;

    /**
     * The location where this instance launched.
     */
    private Placement placement;

    /**
     * Kernel associated with this instance.
     */
    private String kernelId;

    /**
     * RAM disk associated with this instance.
     */
    private String ramdiskId;

    /**
     * Platform of the instance (e.g., Windows).
     */
    private String platform;

    /**
     * Monitoring status for this instance.
     */
    private Monitoring monitoring;

    /**
     * Specifies the Amazon VPC subnet ID in which the instance is running.
     */
    private String subnetId;

    /**
     * Specifies the Amazon VPC in which the instance is running.
     */
    private String vpcId;

    /**
     * Specifies the private IP address that is assigned to the instance
     * (Amazon VPC).
     */
    private String privateIpAddress;

    /**
     * Specifies the IP address of the instance.
     */
    private String publicIpAddress;

    /**
     * The reason for the state change.
     */
    private StateReason stateReason;

    /**
     * The architecture of this instance.
     */
    private String architecture;

    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     */
    private String rootDeviceType;

    /**
     * The root device name (e.g., /dev/sda1).
     */
    private String rootDeviceName;

    /**
     * Block device mapping set.
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;

    private String virtualizationType;

    /**
     * 
     */
    private String instanceLifecycle;

    /**
     * 
     */
    private String spotInstanceRequestId;

    /**
     * Represents an active license in use and attached to an Amazon EC2
     * instance.
     */
    private InstanceLicense license;

    private String clientToken;

    /**
     * A list of tags for the Instance.
     */
    private java.util.List<Tag> tags;

    /**
     * Unique ID of the instance launched.
     *
     * @return Unique ID of the instance launched.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Unique ID of the instance launched.
     *
     * @param instanceId Unique ID of the instance launched.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Unique ID of the instance launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId Unique ID of the instance launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * Image ID of the AMI used to launch the instance.
     *
     * @return Image ID of the AMI used to launch the instance.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * Image ID of the AMI used to launch the instance.
     *
     * @param imageId Image ID of the AMI used to launch the instance.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * Image ID of the AMI used to launch the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId Image ID of the AMI used to launch the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * The current state of the instance.
     *
     * @return The current state of the instance.
     */
    public InstanceState getState() {
        return state;
    }
    
    /**
     * The current state of the instance.
     *
     * @param state The current state of the instance.
     */
    public void setState(InstanceState state) {
        this.state = state;
    }
    
    /**
     * The current state of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The current state of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withState(InstanceState state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This element remains empty
     * until the instance enters a running state.
     *
     * @return The private DNS name assigned to the instance. This DNS name can only
     *         be used inside the Amazon EC2 network. This element remains empty
     *         until the instance enters a running state.
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }
    
    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This element remains empty
     * until the instance enters a running state.
     *
     * @param privateDnsName The private DNS name assigned to the instance. This DNS name can only
     *         be used inside the Amazon EC2 network. This element remains empty
     *         until the instance enters a running state.
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }
    
    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This element remains empty
     * until the instance enters a running state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateDnsName The private DNS name assigned to the instance. This DNS name can only
     *         be used inside the Amazon EC2 network. This element remains empty
     *         until the instance enters a running state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }
    
    
    /**
     * The public DNS name assigned to the instance. This DNS name is
     * contactable from outside the Amazon EC2 network. This element remains
     * empty until the instance enters a running state.
     *
     * @return The public DNS name assigned to the instance. This DNS name is
     *         contactable from outside the Amazon EC2 network. This element remains
     *         empty until the instance enters a running state.
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }
    
    /**
     * The public DNS name assigned to the instance. This DNS name is
     * contactable from outside the Amazon EC2 network. This element remains
     * empty until the instance enters a running state.
     *
     * @param publicDnsName The public DNS name assigned to the instance. This DNS name is
     *         contactable from outside the Amazon EC2 network. This element remains
     *         empty until the instance enters a running state.
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }
    
    /**
     * The public DNS name assigned to the instance. This DNS name is
     * contactable from outside the Amazon EC2 network. This element remains
     * empty until the instance enters a running state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicDnsName The public DNS name assigned to the instance. This DNS name is
     *         contactable from outside the Amazon EC2 network. This element remains
     *         empty until the instance enters a running state.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }
    
    
    /**
     * Reason for the most recent state transition. This might be an empty
     * string.
     *
     * @return Reason for the most recent state transition. This might be an empty
     *         string.
     */
    public String getStateTransitionReason() {
        return stateTransitionReason;
    }
    
    /**
     * Reason for the most recent state transition. This might be an empty
     * string.
     *
     * @param stateTransitionReason Reason for the most recent state transition. This might be an empty
     *         string.
     */
    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }
    
    /**
     * Reason for the most recent state transition. This might be an empty
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateTransitionReason Reason for the most recent state transition. This might be an empty
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
        return this;
    }
    
    
    /**
     * If this instance was launched with an associated key pair, this
     * displays the key pair name.
     *
     * @return If this instance was launched with an associated key pair, this
     *         displays the key pair name.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * If this instance was launched with an associated key pair, this
     * displays the key pair name.
     *
     * @param keyName If this instance was launched with an associated key pair, this
     *         displays the key pair name.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * If this instance was launched with an associated key pair, this
     * displays the key pair name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName If this instance was launched with an associated key pair, this
     *         displays the key pair name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    
    
    /**
     * The AMI launch index, which can be used to find this instance within
     * the launch group.
     *
     * @return The AMI launch index, which can be used to find this instance within
     *         the launch group.
     */
    public Integer getAmiLaunchIndex() {
        return amiLaunchIndex;
    }
    
    /**
     * The AMI launch index, which can be used to find this instance within
     * the launch group.
     *
     * @param amiLaunchIndex The AMI launch index, which can be used to find this instance within
     *         the launch group.
     */
    public void setAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
    }
    
    /**
     * The AMI launch index, which can be used to find this instance within
     * the launch group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amiLaunchIndex The AMI launch index, which can be used to find this instance within
     *         the launch group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
        return this;
    }
    
    
    /**
     * Product codes attached to this instance.
     *
     * @return Product codes attached to this instance.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new java.util.ArrayList<ProductCode>();
        }
        return productCodes;
    }
    
    /**
     * Product codes attached to this instance.
     *
     * @param productCodes Product codes attached to this instance.
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;
    }
    
    /**
     * Product codes attached to this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Product codes attached to this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withProductCodes(ProductCode... productCodes) {
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * Product codes attached to this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Product codes attached to this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withProductCodes(java.util.Collection<ProductCode> productCodes) {
        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;

        return this;
    }
    
    /**
     * The instance type. For more information on instance types, please see
     * the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     *
     * @return The instance type. For more information on instance types, please see
     *         the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     *         Amazon Elastic Compute Cloud Developer Guide</a>.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. For more information on instance types, please see
     * the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     *
     * @param instanceType The instance type. For more information on instance types, please see
     *         the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     *         Amazon Elastic Compute Cloud Developer Guide</a>.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. For more information on instance types, please see
     * the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     *
     * @param instanceType The instance type. For more information on instance types, please see
     *         the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     *         Amazon Elastic Compute Cloud Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceType
     */
    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The time this instance launched.
     *
     * @return The time this instance launched.
     */
    public java.util.Date getLaunchTime() {
        return launchTime;
    }
    
    /**
     * The time this instance launched.
     *
     * @param launchTime The time this instance launched.
     */
    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }
    
    /**
     * The time this instance launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchTime The time this instance launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    
    
    /**
     * The location where this instance launched.
     *
     * @return The location where this instance launched.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * The location where this instance launched.
     *
     * @param placement The location where this instance launched.
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    
    /**
     * The location where this instance launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The location where this instance launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Kernel associated with this instance.
     *
     * @return Kernel associated with this instance.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * Kernel associated with this instance.
     *
     * @param kernelId Kernel associated with this instance.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * Kernel associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId Kernel associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }
    
    
    /**
     * RAM disk associated with this instance.
     *
     * @return RAM disk associated with this instance.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * RAM disk associated with this instance.
     *
     * @param ramdiskId RAM disk associated with this instance.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * RAM disk associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId RAM disk associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }
    
    
    /**
     * Platform of the instance (e.g., Windows).
     *
     * @return Platform of the instance (e.g., Windows).
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * Platform of the instance (e.g., Windows).
     *
     * @param platform Platform of the instance (e.g., Windows).
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * Platform of the instance (e.g., Windows).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform Platform of the instance (e.g., Windows).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    
    
    /**
     * Monitoring status for this instance.
     *
     * @return Monitoring status for this instance.
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }
    
    /**
     * Monitoring status for this instance.
     *
     * @param monitoring Monitoring status for this instance.
     */
    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Monitoring status for this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring Monitoring status for this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }
    
    
    /**
     * Specifies the Amazon VPC subnet ID in which the instance is running.
     *
     * @return Specifies the Amazon VPC subnet ID in which the instance is running.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Specifies the Amazon VPC subnet ID in which the instance is running.
     *
     * @param subnetId Specifies the Amazon VPC subnet ID in which the instance is running.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Specifies the Amazon VPC subnet ID in which the instance is running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId Specifies the Amazon VPC subnet ID in which the instance is running.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    
    
    /**
     * Specifies the Amazon VPC in which the instance is running.
     *
     * @return Specifies the Amazon VPC in which the instance is running.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Specifies the Amazon VPC in which the instance is running.
     *
     * @param vpcId Specifies the Amazon VPC in which the instance is running.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Specifies the Amazon VPC in which the instance is running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Specifies the Amazon VPC in which the instance is running.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    
    
    /**
     * Specifies the private IP address that is assigned to the instance
     * (Amazon VPC).
     *
     * @return Specifies the private IP address that is assigned to the instance
     *         (Amazon VPC).
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * Specifies the private IP address that is assigned to the instance
     * (Amazon VPC).
     *
     * @param privateIpAddress Specifies the private IP address that is assigned to the instance
     *         (Amazon VPC).
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * Specifies the private IP address that is assigned to the instance
     * (Amazon VPC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress Specifies the private IP address that is assigned to the instance
     *         (Amazon VPC).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    
    
    /**
     * Specifies the IP address of the instance.
     *
     * @return Specifies the IP address of the instance.
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }
    
    /**
     * Specifies the IP address of the instance.
     *
     * @param publicIpAddress Specifies the IP address of the instance.
     */
    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }
    
    /**
     * Specifies the IP address of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIpAddress Specifies the IP address of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    
    
    /**
     * The reason for the state change.
     *
     * @return The reason for the state change.
     */
    public StateReason getStateReason() {
        return stateReason;
    }
    
    /**
     * The reason for the state change.
     *
     * @param stateReason The reason for the state change.
     */
    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }
    
    /**
     * The reason for the state change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateReason The reason for the state change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
        return this;
    }
    
    
    /**
     * The architecture of this instance.
     *
     * @return The architecture of this instance.
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of this instance.
     *
     * @param architecture The architecture of this instance.
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param architecture The architecture of this instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     *
     * @return The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }
    
    
    /**
     * The root device name (e.g., /dev/sda1).
     *
     * @return The root device name (e.g., /dev/sda1).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (e.g., /dev/sda1).
     *
     * @param rootDeviceName The root device name (e.g., /dev/sda1).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (e.g., /dev/sda1).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (e.g., /dev/sda1).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }
    
    
    /**
     * Block device mapping set.
     *
     * @return Block device mapping set.
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * Block device mapping set.
     *
     * @param blockDeviceMappings Block device mapping set.
     */
    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        java.util.List<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Block device mapping set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Block device mapping set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        for (InstanceBlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Block device mapping set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Block device mapping set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        java.util.List<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;

        return this;
    }
    
    /**
     * Returns the value of the VirtualizationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @return The value of the VirtualizationType property for this object.
     *
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see VirtualizationType
     */
    public Instance withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getInstanceLifecycle() {
        return instanceLifecycle;
    }
    
    /**
     * 
     *
     * @param instanceLifecycle 
     */
    public void setInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceLifecycle 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }
    
    /**
     * 
     *
     * @param spotInstanceRequestId 
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }
    
    
    /**
     * Represents an active license in use and attached to an Amazon EC2
     * instance.
     *
     * @return Represents an active license in use and attached to an Amazon EC2
     *         instance.
     */
    public InstanceLicense getLicense() {
        return license;
    }
    
    /**
     * Represents an active license in use and attached to an Amazon EC2
     * instance.
     *
     * @param license Represents an active license in use and attached to an Amazon EC2
     *         instance.
     */
    public void setLicense(InstanceLicense license) {
        this.license = license;
    }
    
    /**
     * Represents an active license in use and attached to an Amazon EC2
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param license Represents an active license in use and attached to an Amazon EC2
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withLicense(InstanceLicense license) {
        this.license = license;
        return this;
    }
    
    
    /**
     * Returns the value of the ClientToken property for this object.
     *
     * @return The value of the ClientToken property for this object.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Sets the value of the ClientToken property for this object.
     *
     * @param clientToken The new value for the ClientToken property for this object.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Sets the value of the ClientToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The new value for the ClientToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    
    
    /**
     * A list of tags for the Instance.
     *
     * @return A list of tags for the Instance.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the Instance.
     *
     * @param tags A list of tags for the Instance.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withTags(Tag... tags) {
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("ImageId: " + imageId + ", ");
        sb.append("State: " + state + ", ");
        sb.append("PrivateDnsName: " + privateDnsName + ", ");
        sb.append("PublicDnsName: " + publicDnsName + ", ");
        sb.append("StateTransitionReason: " + stateTransitionReason + ", ");
        sb.append("KeyName: " + keyName + ", ");
        sb.append("AmiLaunchIndex: " + amiLaunchIndex + ", ");
        sb.append("ProductCodes: " + productCodes + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("LaunchTime: " + launchTime + ", ");
        sb.append("Placement: " + placement + ", ");
        sb.append("KernelId: " + kernelId + ", ");
        sb.append("RamdiskId: " + ramdiskId + ", ");
        sb.append("Platform: " + platform + ", ");
        sb.append("Monitoring: " + monitoring + ", ");
        sb.append("SubnetId: " + subnetId + ", ");
        sb.append("VpcId: " + vpcId + ", ");
        sb.append("PrivateIpAddress: " + privateIpAddress + ", ");
        sb.append("PublicIpAddress: " + publicIpAddress + ", ");
        sb.append("StateReason: " + stateReason + ", ");
        sb.append("Architecture: " + architecture + ", ");
        sb.append("RootDeviceType: " + rootDeviceType + ", ");
        sb.append("RootDeviceName: " + rootDeviceName + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("VirtualizationType: " + virtualizationType + ", ");
        sb.append("InstanceLifecycle: " + instanceLifecycle + ", ");
        sb.append("SpotInstanceRequestId: " + spotInstanceRequestId + ", ");
        sb.append("License: " + license + ", ");
        sb.append("ClientToken: " + clientToken + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    