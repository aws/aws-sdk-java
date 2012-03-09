/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * The root device name (e.g., <code>/dev/sda1</code>).
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

    private java.util.List<GroupIdentifier> securityGroups;

    private Boolean sourceDestCheck;

    private String hypervisor;

    private java.util.List<InstanceNetworkInterface> networkInterfaces;

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
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>(productCodes.size());
        productCodesCopy.addAll(productCodes);
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
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
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
        if (productCodes == null) {
            this.productCodes = null;
        } else {
            java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>(productCodes.size());
            productCodesCopy.addAll(productCodes);
            this.productCodes = productCodesCopy;
        }

        return this;
    }
    
    /**
     * The instance type. For more information on instance types, please see
     * the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * The instance type. For more information on instance types, please see
     * the <a
     * "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     * Amazon Elastic Compute Cloud Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type. For more information on instance types, please see
     *         the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/2009-07-15/DeveloperGuide/">
     *         Amazon Elastic Compute Cloud Developer Guide</a>.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
    public Instance withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
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
     * The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @return The root device name (e.g., <code>/dev/sda1</code>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @param rootDeviceName The root device name (e.g., <code>/dev/sda1</code>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (e.g., <code>/dev/sda1</code>).
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
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        java.util.List<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
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
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.length));
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
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            java.util.List<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

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
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
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
    public Instance withVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
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
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
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
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
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
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the SecurityGroups property for this object.
     *
     * @return The value of the SecurityGroups property for this object.
     */
    public java.util.List<GroupIdentifier> getSecurityGroups() {
        
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<GroupIdentifier>();
        }
        return securityGroups;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     */
    public void setSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        java.util.List<GroupIdentifier> securityGroupsCopy = new java.util.ArrayList<GroupIdentifier>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withSecurityGroups(GroupIdentifier... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<GroupIdentifier>(securityGroups.length));
        for (GroupIdentifier value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            java.util.List<GroupIdentifier> securityGroupsCopy = new java.util.ArrayList<GroupIdentifier>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the SourceDestCheck property for this object.
     *
     * @return The value of the SourceDestCheck property for this object.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Sets the value of the SourceDestCheck property for this object.
     *
     * @param sourceDestCheck The new value for the SourceDestCheck property for this object.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Sets the value of the SourceDestCheck property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck The new value for the SourceDestCheck property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }
    
    
    /**
     * Returns the value of the SourceDestCheck property for this object.
     *
     * @return The value of the SourceDestCheck property for this object.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Returns the value of the Hypervisor property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @return The value of the Hypervisor property for this object.
     *
     * @see HypervisorType
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @see HypervisorType
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see HypervisorType
     */
    public Instance withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }
    
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @see HypervisorType
     */
    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see HypervisorType
     */
    public Instance withHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
        return this;
    }
    
    /**
     * Returns the value of the NetworkInterfaces property for this object.
     *
     * @return The value of the NetworkInterfaces property for this object.
     */
    public java.util.List<InstanceNetworkInterface> getNetworkInterfaces() {
        
        if (networkInterfaces == null) {
            networkInterfaces = new java.util.ArrayList<InstanceNetworkInterface>();
        }
        return networkInterfaces;
    }
    
    /**
     * Sets the value of the NetworkInterfaces property for this object.
     *
     * @param networkInterfaces The new value for the NetworkInterfaces property for this object.
     */
    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        java.util.List<InstanceNetworkInterface> networkInterfacesCopy = new java.util.ArrayList<InstanceNetworkInterface>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * Sets the value of the NetworkInterfaces property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces The new value for the NetworkInterfaces property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withNetworkInterfaces(InstanceNetworkInterface... networkInterfaces) {
        if (getNetworkInterfaces() == null) setNetworkInterfaces(new java.util.ArrayList<InstanceNetworkInterface>(networkInterfaces.length));
        for (InstanceNetworkInterface value : networkInterfaces) {
            getNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the NetworkInterfaces property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces The new value for the NetworkInterfaces property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Instance withNetworkInterfaces(java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            java.util.List<InstanceNetworkInterface> networkInterfacesCopy = new java.util.ArrayList<InstanceNetworkInterface>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

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
        if (instanceId != null) sb.append("InstanceId: " + instanceId + ", ");
        if (imageId != null) sb.append("ImageId: " + imageId + ", ");
        if (state != null) sb.append("State: " + state + ", ");
        if (privateDnsName != null) sb.append("PrivateDnsName: " + privateDnsName + ", ");
        if (publicDnsName != null) sb.append("PublicDnsName: " + publicDnsName + ", ");
        if (stateTransitionReason != null) sb.append("StateTransitionReason: " + stateTransitionReason + ", ");
        if (keyName != null) sb.append("KeyName: " + keyName + ", ");
        if (amiLaunchIndex != null) sb.append("AmiLaunchIndex: " + amiLaunchIndex + ", ");
        if (productCodes != null) sb.append("ProductCodes: " + productCodes + ", ");
        if (instanceType != null) sb.append("InstanceType: " + instanceType + ", ");
        if (launchTime != null) sb.append("LaunchTime: " + launchTime + ", ");
        if (placement != null) sb.append("Placement: " + placement + ", ");
        if (kernelId != null) sb.append("KernelId: " + kernelId + ", ");
        if (ramdiskId != null) sb.append("RamdiskId: " + ramdiskId + ", ");
        if (platform != null) sb.append("Platform: " + platform + ", ");
        if (monitoring != null) sb.append("Monitoring: " + monitoring + ", ");
        if (subnetId != null) sb.append("SubnetId: " + subnetId + ", ");
        if (vpcId != null) sb.append("VpcId: " + vpcId + ", ");
        if (privateIpAddress != null) sb.append("PrivateIpAddress: " + privateIpAddress + ", ");
        if (publicIpAddress != null) sb.append("PublicIpAddress: " + publicIpAddress + ", ");
        if (stateReason != null) sb.append("StateReason: " + stateReason + ", ");
        if (architecture != null) sb.append("Architecture: " + architecture + ", ");
        if (rootDeviceType != null) sb.append("RootDeviceType: " + rootDeviceType + ", ");
        if (rootDeviceName != null) sb.append("RootDeviceName: " + rootDeviceName + ", ");
        if (blockDeviceMappings != null) sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        if (virtualizationType != null) sb.append("VirtualizationType: " + virtualizationType + ", ");
        if (instanceLifecycle != null) sb.append("InstanceLifecycle: " + instanceLifecycle + ", ");
        if (spotInstanceRequestId != null) sb.append("SpotInstanceRequestId: " + spotInstanceRequestId + ", ");
        if (license != null) sb.append("License: " + license + ", ");
        if (clientToken != null) sb.append("ClientToken: " + clientToken + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
        if (securityGroups != null) sb.append("SecurityGroups: " + securityGroups + ", ");
        if (sourceDestCheck != null) sb.append("SourceDestCheck: " + sourceDestCheck + ", ");
        if (hypervisor != null) sb.append("Hypervisor: " + hypervisor + ", ");
        if (networkInterfaces != null) sb.append("NetworkInterfaces: " + networkInterfaces + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode()); 
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode()); 
        hashCode = prime * hashCode + ((getStateTransitionReason() == null) ? 0 : getStateTransitionReason().hashCode()); 
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getAmiLaunchIndex() == null) ? 0 : getAmiLaunchIndex().hashCode()); 
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceLifecycle() == null) ? 0 : getInstanceLifecycle().hashCode()); 
        hashCode = prime * hashCode + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getLicense() == null) ? 0 : getLicense().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((isSourceDestCheck() == null) ? 0 : isSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof Instance == false) return false;
        Instance other = (Instance)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null) return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false) return false; 
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null) return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false) return false; 
        if (other.getStateTransitionReason() == null ^ this.getStateTransitionReason() == null) return false;
        if (other.getStateTransitionReason() != null && other.getStateTransitionReason().equals(this.getStateTransitionReason()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getAmiLaunchIndex() == null ^ this.getAmiLaunchIndex() == null) return false;
        if (other.getAmiLaunchIndex() != null && other.getAmiLaunchIndex().equals(this.getAmiLaunchIndex()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null) return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getMonitoring() == null ^ this.getMonitoring() == null) return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null) return false;
        if (other.getPublicIpAddress() != null && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false) return false; 
        if (other.getStateReason() == null ^ this.getStateReason() == null) return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null) return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false) return false; 
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null) return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null) return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false) return false; 
        if (other.getInstanceLifecycle() == null ^ this.getInstanceLifecycle() == null) return false;
        if (other.getInstanceLifecycle() != null && other.getInstanceLifecycle().equals(this.getInstanceLifecycle()) == false) return false; 
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null) return false;
        if (other.getSpotInstanceRequestId() != null && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false) return false; 
        if (other.getLicense() == null ^ this.getLicense() == null) return false;
        if (other.getLicense() != null && other.getLicense().equals(this.getLicense()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.isSourceDestCheck() == null ^ this.isSourceDestCheck() == null) return false;
        if (other.isSourceDestCheck() != null && other.isSourceDestCheck().equals(this.isSourceDestCheck()) == false) return false; 
        if (other.getHypervisor() == null ^ this.getHypervisor() == null) return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false) return false; 
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null) return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false) return false; 
        return true;
    }
    
}
    