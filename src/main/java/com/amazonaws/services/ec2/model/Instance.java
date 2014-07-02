/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * <p>
 * Describes an instance.
 * </p>
 */
public class Instance implements Serializable {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The ID of the AMI used to launch the instance.
     */
    private String imageId;

    /**
     * The current state of the instance.
     */
    private InstanceState state;

    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This name is not available
     * until the instance enters the <code>running</code> state.
     */
    private String privateDnsName;

    /**
     * The public DNS name assigned to the instance. This name is not
     * available until the instance enters the <code>running</code> state.
     */
    private String publicDnsName;

    /**
     * The reason for the most recent state transition. This might be an
     * empty string.
     */
    private String stateTransitionReason;

    /**
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     */
    private String keyName;

    /**
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     */
    private Integer amiLaunchIndex;

    /**
     * The product codes attached to this instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     */
    private String instanceType;

    /**
     * The time the instance was launched.
     */
    private java.util.Date launchTime;

    /**
     * The location where the instance launched.
     */
    private Placement placement;

    /**
     * The kernel associated with this instance.
     */
    private String kernelId;

    /**
     * The RAM disk associated with this instance.
     */
    private String ramdiskId;

    /**
     * The value is <code>Windows</code> for Windows instances; otherwise
     * blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    /**
     * The monitoring information for the instance.
     */
    private Monitoring monitoring;

    /**
     * The ID of the subnet in which the instance is running.
     */
    private String subnetId;

    /**
     * The ID of the VPC in which the instance is running.
     */
    private String vpcId;

    /**
     * The private IP address assigned to the instance.
     */
    private String privateIpAddress;

    /**
     * The public IP address assigned to the instance.
     */
    private String publicIpAddress;

    /**
     * The reason for the most recent state transition.
     */
    private StateReason stateReason;

    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     */
    private String architecture;

    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

    /**
     * The root device name (for example, <code>/dev/sda1</code>).
     */
    private String rootDeviceName;

    /**
     * Any block device mapping entries for the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * The virtualization type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     */
    private String virtualizationType;

    /**
     * Indicates whether this is a Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     */
    private String instanceLifecycle;

    /**
     * The ID of the Spot Instance request.
     */
    private String spotInstanceRequestId;

    /**
     * The idempotency token you provided when you launched the instance.
     */
    private String clientToken;

    /**
     * Any tags assigned to the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * One or more security groups for the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> securityGroups;

    /**
     * Specifies whether to enable an instance launched in a VPC to perform
     * NAT. This controls whether source/destination checking is enabled on
     * the instance. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    private Boolean sourceDestCheck;

    /**
     * The hypervisor type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     */
    private String hypervisor;

    /**
     * [EC2-VPC] One or more network interfaces for the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterface> networkInterfaces;

    /**
     * The IAM instance profile associated with the instance.
     */
    private IamInstanceProfile iamInstanceProfile;

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     */
    private Boolean ebsOptimized;

    /**
     * Specifies whether enhanced networking is enabled.
     */
    private String sriovNetSupport;

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The ID of the AMI used to launch the instance.
     *
     * @return The ID of the AMI used to launch the instance.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI used to launch the instance.
     *
     * @param imageId The ID of the AMI used to launch the instance.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI used to launch the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI used to launch the instance.
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
     * be used inside the Amazon EC2 network. This name is not available
     * until the instance enters the <code>running</code> state.
     *
     * @return The private DNS name assigned to the instance. This DNS name can only
     *         be used inside the Amazon EC2 network. This name is not available
     *         until the instance enters the <code>running</code> state.
     */
    public String getPrivateDnsName() {
        return privateDnsName;
    }
    
    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This name is not available
     * until the instance enters the <code>running</code> state.
     *
     * @param privateDnsName The private DNS name assigned to the instance. This DNS name can only
     *         be used inside the Amazon EC2 network. This name is not available
     *         until the instance enters the <code>running</code> state.
     */
    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }
    
    /**
     * The private DNS name assigned to the instance. This DNS name can only
     * be used inside the Amazon EC2 network. This name is not available
     * until the instance enters the <code>running</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateDnsName The private DNS name assigned to the instance. This DNS name can only
     *         be used inside the Amazon EC2 network. This name is not available
     *         until the instance enters the <code>running</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * The public DNS name assigned to the instance. This name is not
     * available until the instance enters the <code>running</code> state.
     *
     * @return The public DNS name assigned to the instance. This name is not
     *         available until the instance enters the <code>running</code> state.
     */
    public String getPublicDnsName() {
        return publicDnsName;
    }
    
    /**
     * The public DNS name assigned to the instance. This name is not
     * available until the instance enters the <code>running</code> state.
     *
     * @param publicDnsName The public DNS name assigned to the instance. This name is not
     *         available until the instance enters the <code>running</code> state.
     */
    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }
    
    /**
     * The public DNS name assigned to the instance. This name is not
     * available until the instance enters the <code>running</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicDnsName The public DNS name assigned to the instance. This name is not
     *         available until the instance enters the <code>running</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * The reason for the most recent state transition. This might be an
     * empty string.
     *
     * @return The reason for the most recent state transition. This might be an
     *         empty string.
     */
    public String getStateTransitionReason() {
        return stateTransitionReason;
    }
    
    /**
     * The reason for the most recent state transition. This might be an
     * empty string.
     *
     * @param stateTransitionReason The reason for the most recent state transition. This might be an
     *         empty string.
     */
    public void setStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
    }
    
    /**
     * The reason for the most recent state transition. This might be an
     * empty string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateTransitionReason The reason for the most recent state transition. This might be an
     *         empty string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withStateTransitionReason(String stateTransitionReason) {
        this.stateTransitionReason = stateTransitionReason;
        return this;
    }

    /**
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     *
     * @return The name of the key pair, if this instance was launched with an
     *         associated key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     *
     * @param keyName The name of the key pair, if this instance was launched with an
     *         associated key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair, if this instance was launched with an
     * associated key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair, if this instance was launched with an
     *         associated key pair.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     *
     * @return The AMI launch index, which can be used to find this instance in the
     *         launch group.
     */
    public Integer getAmiLaunchIndex() {
        return amiLaunchIndex;
    }
    
    /**
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     *
     * @param amiLaunchIndex The AMI launch index, which can be used to find this instance in the
     *         launch group.
     */
    public void setAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
    }
    
    /**
     * The AMI launch index, which can be used to find this instance in the
     * launch group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amiLaunchIndex The AMI launch index, which can be used to find this instance in the
     *         launch group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
        return this;
    }

    /**
     * The product codes attached to this instance.
     *
     * @return The product codes attached to this instance.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * The product codes attached to this instance.
     *
     * @param productCodes The product codes attached to this instance.
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>(productCodes.size());
        productCodesCopy.addAll(productCodes);
        this.productCodes = productCodesCopy;
    }
    
    /**
     * The product codes attached to this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The product codes attached to this instance.
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
     * The product codes attached to this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The product codes attached to this instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>(productCodes.size());
            productCodesCopy.addAll(productCodes);
            this.productCodes = productCodesCopy;
        }

        return this;
    }

    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @return The instance type.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type.
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
     * The instance type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type.
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
     * The time the instance was launched.
     *
     * @return The time the instance was launched.
     */
    public java.util.Date getLaunchTime() {
        return launchTime;
    }
    
    /**
     * The time the instance was launched.
     *
     * @param launchTime The time the instance was launched.
     */
    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }
    
    /**
     * The time the instance was launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchTime The time the instance was launched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
        return this;
    }

    /**
     * The location where the instance launched.
     *
     * @return The location where the instance launched.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * The location where the instance launched.
     *
     * @param placement The location where the instance launched.
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    
    /**
     * The location where the instance launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The location where the instance launched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * The kernel associated with this instance.
     *
     * @return The kernel associated with this instance.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The kernel associated with this instance.
     *
     * @param kernelId The kernel associated with this instance.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The kernel associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The kernel associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The RAM disk associated with this instance.
     *
     * @return The RAM disk associated with this instance.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The RAM disk associated with this instance.
     *
     * @param ramdiskId The RAM disk associated with this instance.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The RAM disk associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The RAM disk associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * The value is <code>Windows</code> for Windows instances; otherwise
     * blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return The value is <code>Windows</code> for Windows instances; otherwise
     *         blank.
     *
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The value is <code>Windows</code> for Windows instances; otherwise
     * blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows instances; otherwise
     *         blank.
     *
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The value is <code>Windows</code> for Windows instances; otherwise
     * blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows instances; otherwise
     *         blank.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlatformValues
     */
    public Instance withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The value is <code>Windows</code> for Windows instances; otherwise
     * blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows instances; otherwise
     *         blank.
     *
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }
    
    /**
     * The value is <code>Windows</code> for Windows instances; otherwise
     * blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows instances; otherwise
     *         blank.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PlatformValues
     */
    public Instance withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * The monitoring information for the instance.
     *
     * @return The monitoring information for the instance.
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }
    
    /**
     * The monitoring information for the instance.
     *
     * @param monitoring The monitoring information for the instance.
     */
    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * The monitoring information for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring The monitoring information for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * The ID of the subnet in which the instance is running.
     *
     * @return The ID of the subnet in which the instance is running.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet in which the instance is running.
     *
     * @param subnetId The ID of the subnet in which the instance is running.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet in which the instance is running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet in which the instance is running.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the VPC in which the instance is running.
     *
     * @return The ID of the VPC in which the instance is running.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC in which the instance is running.
     *
     * @param vpcId The ID of the VPC in which the instance is running.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC in which the instance is running.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC in which the instance is running.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The private IP address assigned to the instance.
     *
     * @return The private IP address assigned to the instance.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * The private IP address assigned to the instance.
     *
     * @param privateIpAddress The private IP address assigned to the instance.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * The private IP address assigned to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The private IP address assigned to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * The public IP address assigned to the instance.
     *
     * @return The public IP address assigned to the instance.
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }
    
    /**
     * The public IP address assigned to the instance.
     *
     * @param publicIpAddress The public IP address assigned to the instance.
     */
    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }
    
    /**
     * The public IP address assigned to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIpAddress The public IP address assigned to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * The reason for the most recent state transition.
     *
     * @return The reason for the most recent state transition.
     */
    public StateReason getStateReason() {
        return stateReason;
    }
    
    /**
     * The reason for the most recent state transition.
     *
     * @param stateReason The reason for the most recent state transition.
     */
    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }
    
    /**
     * The reason for the most recent state transition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateReason The reason for the most recent state transition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
        return this;
    }

    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @return The architecture of the image.
     *
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ArchitectureValues
     */
    public Instance withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The architecture of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ArchitectureValues
     */
    public Instance withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The root device type used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @see DeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @see DeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeviceType
     */
    public Instance withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @see DeviceType
     */
    public void setRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeviceType
     */
    public Instance withRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * The root device name (for example, <code>/dev/sda1</code>).
     *
     * @return The root device name (for example, <code>/dev/sda1</code>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (for example, <code>/dev/sda1</code>).
     *
     * @param rootDeviceName The root device name (for example, <code>/dev/sda1</code>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (for example, <code>/dev/sda1</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (for example, <code>/dev/sda1</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * Any block device mapping entries for the instance.
     *
     * @return Any block device mapping entries for the instance.
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Any block device mapping entries for the instance.
     *
     * @param blockDeviceMappings Any block device mapping entries for the instance.
     */
    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Any block device mapping entries for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Any block device mapping entries for the instance.
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
     * Any block device mapping entries for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Any block device mapping entries for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * The virtualization type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @return The virtualization type of the instance.
     *
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * The virtualization type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The virtualization type of the instance.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * The virtualization type of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The virtualization type of the instance.
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
     * The virtualization type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The virtualization type of the instance.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }
    
    /**
     * The virtualization type of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The virtualization type of the instance.
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
     * Indicates whether this is a Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @return Indicates whether this is a Spot Instance.
     *
     * @see InstanceLifecycleType
     */
    public String getInstanceLifecycle() {
        return instanceLifecycle;
    }
    
    /**
     * Indicates whether this is a Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param instanceLifecycle Indicates whether this is a Spot Instance.
     *
     * @see InstanceLifecycleType
     */
    public void setInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
    }
    
    /**
     * Indicates whether this is a Spot Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param instanceLifecycle Indicates whether this is a Spot Instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceLifecycleType
     */
    public Instance withInstanceLifecycle(String instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle;
        return this;
    }

    /**
     * Indicates whether this is a Spot Instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param instanceLifecycle Indicates whether this is a Spot Instance.
     *
     * @see InstanceLifecycleType
     */
    public void setInstanceLifecycle(InstanceLifecycleType instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle.toString();
    }
    
    /**
     * Indicates whether this is a Spot Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot
     *
     * @param instanceLifecycle Indicates whether this is a Spot Instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceLifecycleType
     */
    public Instance withInstanceLifecycle(InstanceLifecycleType instanceLifecycle) {
        this.instanceLifecycle = instanceLifecycle.toString();
        return this;
    }

    /**
     * The ID of the Spot Instance request.
     *
     * @return The ID of the Spot Instance request.
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }
    
    /**
     * The ID of the Spot Instance request.
     *
     * @param spotInstanceRequestId The ID of the Spot Instance request.
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }
    
    /**
     * The ID of the Spot Instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestId The ID of the Spot Instance request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }

    /**
     * The idempotency token you provided when you launched the instance.
     *
     * @return The idempotency token you provided when you launched the instance.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * The idempotency token you provided when you launched the instance.
     *
     * @param clientToken The idempotency token you provided when you launched the instance.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * The idempotency token you provided when you launched the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The idempotency token you provided when you launched the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Any tags assigned to the instance.
     *
     * @return Any tags assigned to the instance.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the instance.
     *
     * @param tags Any tags assigned to the instance.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the instance.
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
     * Any tags assigned to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * One or more security groups for the instance.
     *
     * @return One or more security groups for the instance.
     */
    public java.util.List<GroupIdentifier> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * One or more security groups for the instance.
     *
     * @param securityGroups One or more security groups for the instance.
     */
    public void setSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * One or more security groups for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups One or more security groups for the instance.
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
     * One or more security groups for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups One or more security groups for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSecurityGroups(java.util.Collection<GroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * Specifies whether to enable an instance launched in a VPC to perform
     * NAT. This controls whether source/destination checking is enabled on
     * the instance. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return Specifies whether to enable an instance launched in a VPC to perform
     *         NAT. This controls whether source/destination checking is enabled on
     *         the instance. A value of <code>true</code> means checking is enabled,
     *         and <code>false</code> means checking is disabled. The value must be
     *         <code>false</code> for the instance to perform NAT. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Specifies whether to enable an instance launched in a VPC to perform
     * NAT. This controls whether source/destination checking is enabled on
     * the instance. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     *         NAT. This controls whether source/destination checking is enabled on
     *         the instance. A value of <code>true</code> means checking is enabled,
     *         and <code>false</code> means checking is disabled. The value must be
     *         <code>false</code> for the instance to perform NAT. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Specifies whether to enable an instance launched in a VPC to perform
     * NAT. This controls whether source/destination checking is enabled on
     * the instance. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Specifies whether to enable an instance launched in a VPC to perform
     *         NAT. This controls whether source/destination checking is enabled on
     *         the instance. A value of <code>true</code> means checking is enabled,
     *         and <code>false</code> means checking is disabled. The value must be
     *         <code>false</code> for the instance to perform NAT. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Specifies whether to enable an instance launched in a VPC to perform
     * NAT. This controls whether source/destination checking is enabled on
     * the instance. A value of <code>true</code> means checking is enabled,
     * and <code>false</code> means checking is disabled. The value must be
     * <code>false</code> for the instance to perform NAT. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     * Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return Specifies whether to enable an instance launched in a VPC to perform
     *         NAT. This controls whether source/destination checking is enabled on
     *         the instance. A value of <code>true</code> means checking is enabled,
     *         and <code>false</code> means checking is disabled. The value must be
     *         <code>false</code> for the instance to perform NAT. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html">NAT
     *         Instances</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * The hypervisor type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @return The hypervisor type of the instance.
     *
     * @see HypervisorType
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * The hypervisor type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the instance.
     *
     * @see HypervisorType
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * The hypervisor type of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the instance.
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
     * The hypervisor type of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the instance.
     *
     * @see HypervisorType
     */
    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }
    
    /**
     * The hypervisor type of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the instance.
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
     * [EC2-VPC] One or more network interfaces for the instance.
     *
     * @return [EC2-VPC] One or more network interfaces for the instance.
     */
    public java.util.List<InstanceNetworkInterface> getNetworkInterfaces() {
        if (networkInterfaces == null) {
              networkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterface>();
              networkInterfaces.setAutoConstruct(true);
        }
        return networkInterfaces;
    }
    
    /**
     * [EC2-VPC] One or more network interfaces for the instance.
     *
     * @param networkInterfaces [EC2-VPC] One or more network interfaces for the instance.
     */
    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterface> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterface>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * [EC2-VPC] One or more network interfaces for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces [EC2-VPC] One or more network interfaces for the instance.
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
     * [EC2-VPC] One or more network interfaces for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces [EC2-VPC] One or more network interfaces for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withNetworkInterfaces(java.util.Collection<InstanceNetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterface> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterface>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

        return this;
    }

    /**
     * The IAM instance profile associated with the instance.
     *
     * @return The IAM instance profile associated with the instance.
     */
    public IamInstanceProfile getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * The IAM instance profile associated with the instance.
     *
     * @param iamInstanceProfile The IAM instance profile associated with the instance.
     */
    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * The IAM instance profile associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile The IAM instance profile associated with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     *
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance. This
     *         optimization isn't available with all instance types. Additional usage
     *         charges apply when using an EBS Optimized instance.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance. This
     *         optimization isn't available with all instance types. Additional usage
     *         charges apply when using an EBS Optimized instance.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance. This
     *         optimization isn't available with all instance types. Additional usage
     *         charges apply when using an EBS Optimized instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal I/O performance. This
     * optimization isn't available with all instance types. Additional usage
     * charges apply when using an EBS Optimized instance.
     *
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal I/O performance. This
     *         optimization isn't available with all instance types. Additional usage
     *         charges apply when using an EBS Optimized instance.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * Specifies whether enhanced networking is enabled.
     *
     * @return Specifies whether enhanced networking is enabled.
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * Specifies whether enhanced networking is enabled.
     *
     * @param sriovNetSupport Specifies whether enhanced networking is enabled.
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * Specifies whether enhanced networking is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport Specifies whether enhanced networking is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getPrivateDnsName() != null) sb.append("PrivateDnsName: " + getPrivateDnsName() + ",");
        if (getPublicDnsName() != null) sb.append("PublicDnsName: " + getPublicDnsName() + ",");
        if (getStateTransitionReason() != null) sb.append("StateTransitionReason: " + getStateTransitionReason() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getAmiLaunchIndex() != null) sb.append("AmiLaunchIndex: " + getAmiLaunchIndex() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getLaunchTime() != null) sb.append("LaunchTime: " + getLaunchTime() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getMonitoring() != null) sb.append("Monitoring: " + getMonitoring() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getPublicIpAddress() != null) sb.append("PublicIpAddress: " + getPublicIpAddress() + ",");
        if (getStateReason() != null) sb.append("StateReason: " + getStateReason() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getRootDeviceType() != null) sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getRootDeviceName() != null) sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getVirtualizationType() != null) sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getInstanceLifecycle() != null) sb.append("InstanceLifecycle: " + getInstanceLifecycle() + ",");
        if (getSpotInstanceRequestId() != null) sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (isSourceDestCheck() != null) sb.append("SourceDestCheck: " + isSourceDestCheck() + ",");
        if (getHypervisor() != null) sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getNetworkInterfaces() != null) sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() );
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
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((isSourceDestCheck() == null) ? 0 : isSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode()); 
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
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null) return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false) return false; 
        return true;
    }
    
}
    