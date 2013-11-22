/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RunInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#runInstances(RunInstancesRequest) RunInstances operation}.
 * <p>
 * The RunInstances operation launches a specified number of instances.
 * </p>
 * <p>
 * If Amazon EC2 cannot launch the minimum number AMIs you request, no instances launch. If there is insufficient capacity to launch the maximum number
 * of AMIs you request, Amazon EC2 launches as many as possible to satisfy the requested maximum values.
 * </p>
 * <p>
 * Every instance is launched in a security group. If you do not specify a security group at launch, the instances start in your default security group.
 * For more information on creating security groups, see CreateSecurityGroup.
 * </p>
 * <p>
 * An optional instance type can be specified. For information about instance types, see Instance Types.
 * </p>
 * <p>
 * You can provide an optional key pair ID for each image in the launch request (for more information, see CreateKeyPair). All instances that are
 * created from images that use this key pair will have access to the associated public key at boot. You can use this key to provide secure access to an
 * instance of an image on a per-instance basis. Amazon EC2 public images use this feature to provide secure access without passwords.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> Launching public images without a key pair ID will leave them inaccessible. The public key material is made available to the
 * instance at boot time by placing it in the openssh_id.pub file on a logical device that is exposed to the instance as /dev/sda2 (the ephemeral store).
 * The format of this file is suitable for use as an entry within ~/.ssh/authorized_keys (the OpenSSH format). This can be done at boot (e.g., as part of
 * rc.local) allowing for secure access without passwords. Optional user data can be provided in the launch request. All instances that collectively
 * comprise the launch request have access to this data For more information, see Instance Metadata.
 * </p>
 * <p>
 * <b>NOTE:</b> If any of the AMIs have a product code attached for which the user has not subscribed, the RunInstances call will fail.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> We strongly recommend using the 2.6.18 Xen stock kernel with the c1.medium and c1.xlarge instances. Although the default Amazon EC2
 * kernels will work, the new kernels provide greater stability and performance for these instance types. For more information about kernels, see
 * Kernels, RAM Disks, and Block Device Mappings.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#runInstances(RunInstancesRequest)
 */
public class RunInstancesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<RunInstancesRequest> {

    /**
     * Unique ID of a machine image, returned by a call to DescribeImages.
     */
    private String imageId;

    /**
     * Minimum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, no instances are launched at all.
     */
    private Integer minCount;

    /**
     * Maximum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, the largest possible number above minCount will
     * be launched instead. <p> Between 1 and the maximum number allowed for
     * your account (default: 20).
     */
    private Integer maxCount;

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * The names of the security groups into which the instances will be
     * launched.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * Specifies additional information to make available to the instance(s).
     * This parameter must be passed as a Base64-encoded string.
     */
    private String userData;

    /**
     * Specifies the instance type for the launched instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     */
    private String instanceType;

    /**
     * Specifies the placement constraints (Availability Zones) for launching
     * the instances.
     */
    private Placement placement;

    /**
     * The ID of the kernel with which to launch the instance.
     */
    private String kernelId;

    /**
     * The ID of the RAM disk with which to launch the instance. Some kernels
     * require additional drivers at launch. Check the kernel requirements
     * for information on whether you need to specify a RAM disk. To find
     * kernel requirements, go to the Resource Center and search for the
     * kernel ID.
     */
    private String ramdiskId;

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enables monitoring for the instance.
     */
    private Boolean monitoring;

    /**
     * Specifies the subnet ID within which to launch the instance(s) for
     * Amazon Virtual Private Cloud.
     */
    private String subnetId;

    /**
     * Specifies whether the instance can be terminated using the APIs. You
     * must modify this attribute before you can terminate any "locked"
     * instances from the APIs.
     */
    private Boolean disableApiTermination;

    /**
     * Specifies whether the instance's Amazon EBS volumes are stopped or
     * terminated when the instance is shut down.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     */
    private InstanceLicenseSpecification license;

    /**
     * If you're using Amazon Virtual Private Cloud, you can optionally use
     * this parameter to assign the instance a specific available IP address
     * from the subnet.
     */
    private String privateIpAddress;

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, go to How to Ensure Idempotency in
     * the Amazon Elastic Compute Cloud User Guide.
     */
    private String clientToken;

    /**
     * Do not use. Reserved for internal use.
     */
    private String additionalInfo;

    /**
     * List of network interfaces associated with the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfaces;

    private IamInstanceProfileSpecification iamInstanceProfile;

    private Boolean ebsOptimized;

    /**
     * Default constructor for a new RunInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RunInstancesRequest() {}
    
    /**
     * Constructs a new RunInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId Unique ID of a machine image, returned by a call to
     * DescribeImages.
     * @param minCount Minimum number of instances to launch. If the value is
     * more than Amazon EC2 can launch, no instances are launched at all.
     * @param maxCount Maximum number of instances to launch. If the value is
     * more than Amazon EC2 can launch, the largest possible number above
     * minCount will be launched instead. <p> Between 1 and the maximum
     * number allowed for your account (default: 20).
     */
    public RunInstancesRequest(String imageId, Integer minCount, Integer maxCount) {
        setImageId(imageId);
        setMinCount(minCount);
        setMaxCount(maxCount);
    }

    /**
     * Unique ID of a machine image, returned by a call to DescribeImages.
     *
     * @return Unique ID of a machine image, returned by a call to DescribeImages.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * Unique ID of a machine image, returned by a call to DescribeImages.
     *
     * @param imageId Unique ID of a machine image, returned by a call to DescribeImages.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * Unique ID of a machine image, returned by a call to DescribeImages.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId Unique ID of a machine image, returned by a call to DescribeImages.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * Minimum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, no instances are launched at all.
     *
     * @return Minimum number of instances to launch. If the value is more than
     *         Amazon EC2 can launch, no instances are launched at all.
     */
    public Integer getMinCount() {
        return minCount;
    }
    
    /**
     * Minimum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, no instances are launched at all.
     *
     * @param minCount Minimum number of instances to launch. If the value is more than
     *         Amazon EC2 can launch, no instances are launched at all.
     */
    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }
    
    /**
     * Minimum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, no instances are launched at all.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minCount Minimum number of instances to launch. If the value is more than
     *         Amazon EC2 can launch, no instances are launched at all.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Maximum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, the largest possible number above minCount will
     * be launched instead. <p> Between 1 and the maximum number allowed for
     * your account (default: 20).
     *
     * @return Maximum number of instances to launch. If the value is more than
     *         Amazon EC2 can launch, the largest possible number above minCount will
     *         be launched instead. <p> Between 1 and the maximum number allowed for
     *         your account (default: 20).
     */
    public Integer getMaxCount() {
        return maxCount;
    }
    
    /**
     * Maximum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, the largest possible number above minCount will
     * be launched instead. <p> Between 1 and the maximum number allowed for
     * your account (default: 20).
     *
     * @param maxCount Maximum number of instances to launch. If the value is more than
     *         Amazon EC2 can launch, the largest possible number above minCount will
     *         be launched instead. <p> Between 1 and the maximum number allowed for
     *         your account (default: 20).
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }
    
    /**
     * Maximum number of instances to launch. If the value is more than
     * Amazon EC2 can launch, the largest possible number above minCount will
     * be launched instead. <p> Between 1 and the maximum number allowed for
     * your account (default: 20).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxCount Maximum number of instances to launch. If the value is more than
     *         Amazon EC2 can launch, the largest possible number above minCount will
     *         be launched instead. <p> Between 1 and the maximum number allowed for
     *         your account (default: 20).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * The name of the key pair.
     *
     * @return The name of the key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair.
     *
     * @param keyName The name of the key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The names of the security groups into which the instances will be
     * launched.
     *
     * @return The names of the security groups into which the instances will be
     *         launched.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * The names of the security groups into which the instances will be
     * launched.
     *
     * @param securityGroups The names of the security groups into which the instances will be
     *         launched.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * The names of the security groups into which the instances will be
     * launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The names of the security groups into which the instances will be
     *         launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * The names of the security groups into which the instances will be
     * launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The names of the security groups into which the instances will be
     *         launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the SecurityGroupIds property for this object.
     *
     * @return The value of the SecurityGroupIds property for this object.
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * Sets the value of the SecurityGroupIds property for this object.
     *
     * @param securityGroupIds The new value for the SecurityGroupIds property for this object.
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
        securityGroupIdsCopy.addAll(securityGroupIds);
        this.securityGroupIds = securityGroupIdsCopy;
    }
    
    /**
     * Sets the value of the SecurityGroupIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds The new value for the SecurityGroupIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SecurityGroupIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds The new value for the SecurityGroupIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
            securityGroupIdsCopy.addAll(securityGroupIds);
            this.securityGroupIds = securityGroupIdsCopy;
        }

        return this;
    }

    /**
     * Specifies additional information to make available to the instance(s).
     * This parameter must be passed as a Base64-encoded string.
     *
     * @return Specifies additional information to make available to the instance(s).
     *         This parameter must be passed as a Base64-encoded string.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * Specifies additional information to make available to the instance(s).
     * This parameter must be passed as a Base64-encoded string.
     *
     * @param userData Specifies additional information to make available to the instance(s).
     *         This parameter must be passed as a Base64-encoded string.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * Specifies additional information to make available to the instance(s).
     * This parameter must be passed as a Base64-encoded string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData Specifies additional information to make available to the instance(s).
     *         This parameter must be passed as a Base64-encoded string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Specifies the instance type for the launched instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @return Specifies the instance type for the launched instances.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Specifies the instance type for the launched instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type for the launched instances.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Specifies the instance type for the launched instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type for the launched instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceType
     */
    public RunInstancesRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Specifies the instance type for the launched instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type for the launched instances.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * Specifies the instance type for the launched instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge
     *
     * @param instanceType Specifies the instance type for the launched instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceType
     */
    public RunInstancesRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * Specifies the placement constraints (Availability Zones) for launching
     * the instances.
     *
     * @return Specifies the placement constraints (Availability Zones) for launching
     *         the instances.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * Specifies the placement constraints (Availability Zones) for launching
     * the instances.
     *
     * @param placement Specifies the placement constraints (Availability Zones) for launching
     *         the instances.
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    
    /**
     * Specifies the placement constraints (Availability Zones) for launching
     * the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement Specifies the placement constraints (Availability Zones) for launching
     *         the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * The ID of the kernel with which to launch the instance.
     *
     * @return The ID of the kernel with which to launch the instance.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel with which to launch the instance.
     *
     * @param kernelId The ID of the kernel with which to launch the instance.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel with which to launch the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The ID of the kernel with which to launch the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ID of the RAM disk with which to launch the instance. Some kernels
     * require additional drivers at launch. Check the kernel requirements
     * for information on whether you need to specify a RAM disk. To find
     * kernel requirements, go to the Resource Center and search for the
     * kernel ID.
     *
     * @return The ID of the RAM disk with which to launch the instance. Some kernels
     *         require additional drivers at launch. Check the kernel requirements
     *         for information on whether you need to specify a RAM disk. To find
     *         kernel requirements, go to the Resource Center and search for the
     *         kernel ID.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk with which to launch the instance. Some kernels
     * require additional drivers at launch. Check the kernel requirements
     * for information on whether you need to specify a RAM disk. To find
     * kernel requirements, go to the Resource Center and search for the
     * kernel ID.
     *
     * @param ramdiskId The ID of the RAM disk with which to launch the instance. Some kernels
     *         require additional drivers at launch. Check the kernel requirements
     *         for information on whether you need to specify a RAM disk. To find
     *         kernel requirements, go to the Resource Center and search for the
     *         kernel ID.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk with which to launch the instance. Some kernels
     * require additional drivers at launch. Check the kernel requirements
     * for information on whether you need to specify a RAM disk. To find
     * kernel requirements, go to the Resource Center and search for the
     * kernel ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ID of the RAM disk with which to launch the instance. Some kernels
     *         require additional drivers at launch. Check the kernel requirements
     *         for information on whether you need to specify a RAM disk. To find
     *         kernel requirements, go to the Resource Center and search for the
     *         kernel ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     *
     * @return Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a virtualName and a deviceName.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * Enables monitoring for the instance.
     *
     * @return Enables monitoring for the instance.
     */
    public Boolean isMonitoring() {
        return monitoring;
    }
    
    /**
     * Enables monitoring for the instance.
     *
     * @param monitoring Enables monitoring for the instance.
     */
    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Enables monitoring for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring Enables monitoring for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * Enables monitoring for the instance.
     *
     * @return Enables monitoring for the instance.
     */
    public Boolean getMonitoring() {
        return monitoring;
    }

    /**
     * Specifies the subnet ID within which to launch the instance(s) for
     * Amazon Virtual Private Cloud.
     *
     * @return Specifies the subnet ID within which to launch the instance(s) for
     *         Amazon Virtual Private Cloud.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Specifies the subnet ID within which to launch the instance(s) for
     * Amazon Virtual Private Cloud.
     *
     * @param subnetId Specifies the subnet ID within which to launch the instance(s) for
     *         Amazon Virtual Private Cloud.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Specifies the subnet ID within which to launch the instance(s) for
     * Amazon Virtual Private Cloud.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId Specifies the subnet ID within which to launch the instance(s) for
     *         Amazon Virtual Private Cloud.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Specifies whether the instance can be terminated using the APIs. You
     * must modify this attribute before you can terminate any "locked"
     * instances from the APIs.
     *
     * @return Specifies whether the instance can be terminated using the APIs. You
     *         must modify this attribute before you can terminate any "locked"
     *         instances from the APIs.
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Specifies whether the instance can be terminated using the APIs. You
     * must modify this attribute before you can terminate any "locked"
     * instances from the APIs.
     *
     * @param disableApiTermination Specifies whether the instance can be terminated using the APIs. You
     *         must modify this attribute before you can terminate any "locked"
     *         instances from the APIs.
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * Specifies whether the instance can be terminated using the APIs. You
     * must modify this attribute before you can terminate any "locked"
     * instances from the APIs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination Specifies whether the instance can be terminated using the APIs. You
     *         must modify this attribute before you can terminate any "locked"
     *         instances from the APIs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * Specifies whether the instance can be terminated using the APIs. You
     * must modify this attribute before you can terminate any "locked"
     * instances from the APIs.
     *
     * @return Specifies whether the instance can be terminated using the APIs. You
     *         must modify this attribute before you can terminate any "locked"
     *         instances from the APIs.
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * Specifies whether the instance's Amazon EBS volumes are stopped or
     * terminated when the instance is shut down.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @return Specifies whether the instance's Amazon EBS volumes are stopped or
     *         terminated when the instance is shut down.
     *
     * @see ShutdownBehavior
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Specifies whether the instance's Amazon EBS volumes are stopped or
     * terminated when the instance is shut down.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Specifies whether the instance's Amazon EBS volumes are stopped or
     *         terminated when the instance is shut down.
     *
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Specifies whether the instance's Amazon EBS volumes are stopped or
     * terminated when the instance is shut down.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Specifies whether the instance's Amazon EBS volumes are stopped or
     *         terminated when the instance is shut down.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ShutdownBehavior
     */
    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * Specifies whether the instance's Amazon EBS volumes are stopped or
     * terminated when the instance is shut down.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Specifies whether the instance's Amazon EBS volumes are stopped or
     *         terminated when the instance is shut down.
     *
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
    }
    
    /**
     * Specifies whether the instance's Amazon EBS volumes are stopped or
     * terminated when the instance is shut down.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Specifies whether the instance's Amazon EBS volumes are stopped or
     *         terminated when the instance is shut down.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ShutdownBehavior
     */
    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     *
     * @return Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     */
    public InstanceLicenseSpecification getLicense() {
        return license;
    }
    
    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     *
     * @param license Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     */
    public void setLicense(InstanceLicenseSpecification license) {
        this.license = license;
    }
    
    /**
     * Specifies active licenses in use and attached to an Amazon EC2
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param license Specifies active licenses in use and attached to an Amazon EC2
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withLicense(InstanceLicenseSpecification license) {
        this.license = license;
        return this;
    }

    /**
     * If you're using Amazon Virtual Private Cloud, you can optionally use
     * this parameter to assign the instance a specific available IP address
     * from the subnet.
     *
     * @return If you're using Amazon Virtual Private Cloud, you can optionally use
     *         this parameter to assign the instance a specific available IP address
     *         from the subnet.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * If you're using Amazon Virtual Private Cloud, you can optionally use
     * this parameter to assign the instance a specific available IP address
     * from the subnet.
     *
     * @param privateIpAddress If you're using Amazon Virtual Private Cloud, you can optionally use
     *         this parameter to assign the instance a specific available IP address
     *         from the subnet.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * If you're using Amazon Virtual Private Cloud, you can optionally use
     * this parameter to assign the instance a specific available IP address
     * from the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress If you're using Amazon Virtual Private Cloud, you can optionally use
     *         this parameter to assign the instance a specific available IP address
     *         from the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, go to How to Ensure Idempotency in
     * the Amazon Elastic Compute Cloud User Guide.
     *
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, go to How to Ensure Idempotency in
     *         the Amazon Elastic Compute Cloud User Guide.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, go to How to Ensure Idempotency in
     * the Amazon Elastic Compute Cloud User Guide.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, go to How to Ensure Idempotency in
     *         the Amazon Elastic Compute Cloud User Guide.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of
     * the request. For more information, go to How to Ensure Idempotency in
     * the Amazon Elastic Compute Cloud User Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure idempotency of
     *         the request. For more information, go to How to Ensure Idempotency in
     *         the Amazon Elastic Compute Cloud User Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Do not use. Reserved for internal use.
     *
     * @return Do not use. Reserved for internal use.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * Do not use. Reserved for internal use.
     *
     * @param additionalInfo Do not use. Reserved for internal use.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * Do not use. Reserved for internal use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalInfo Do not use. Reserved for internal use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * List of network interfaces associated with the instance.
     *
     * @return List of network interfaces associated with the instance.
     */
    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
              networkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>();
              networkInterfaces.setAutoConstruct(true);
        }
        return networkInterfaces;
    }
    
    /**
     * List of network interfaces associated with the instance.
     *
     * @param networkInterfaces List of network interfaces associated with the instance.
     */
    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * List of network interfaces associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces List of network interfaces associated with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (getNetworkInterfaces() == null) setNetworkInterfaces(new java.util.ArrayList<InstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        for (InstanceNetworkInterfaceSpecification value : networkInterfaces) {
            getNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * List of network interfaces associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces List of network interfaces associated with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the IamInstanceProfile property for this object.
     *
     * @return The value of the IamInstanceProfile property for this object.
     */
    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * Sets the value of the IamInstanceProfile property for this object.
     *
     * @param iamInstanceProfile The new value for the IamInstanceProfile property for this object.
     */
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * Sets the value of the IamInstanceProfile property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile The new value for the IamInstanceProfile property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Returns the value of the EbsOptimized property for this object.
     *
     * @return The value of the EbsOptimized property for this object.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Sets the value of the EbsOptimized property for this object.
     *
     * @param ebsOptimized The new value for the EbsOptimized property for this object.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Sets the value of the EbsOptimized property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized The new value for the EbsOptimized property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Returns the value of the EbsOptimized property for this object.
     *
     * @return The value of the EbsOptimized property for this object.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RunInstancesRequest> getDryRunRequest() {
        Request<RunInstancesRequest> request = new RunInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getMinCount() != null) sb.append("MinCount: " + getMinCount() + ",");
        if (getMaxCount() != null) sb.append("MaxCount: " + getMaxCount() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (isMonitoring() != null) sb.append("Monitoring: " + isMonitoring() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (isDisableApiTermination() != null) sb.append("DisableApiTermination: " + isDisableApiTermination() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null) sb.append("InstanceInitiatedShutdownBehavior: " + getInstanceInitiatedShutdownBehavior() + ",");
        if (getLicense() != null) sb.append("License: " + getLicense() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getNetworkInterfaces() != null) sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getMinCount() == null) ? 0 : getMinCount().hashCode()); 
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode()); 
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((isMonitoring() == null) ? 0 : isMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((isDisableApiTermination() == null) ? 0 : isDisableApiTermination().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode()); 
        hashCode = prime * hashCode + ((getLicense() == null) ? 0 : getLicense().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RunInstancesRequest == false) return false;
        RunInstancesRequest other = (RunInstancesRequest)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getMinCount() == null ^ this.getMinCount() == null) return false;
        if (other.getMinCount() != null && other.getMinCount().equals(this.getMinCount()) == false) return false; 
        if (other.getMaxCount() == null ^ this.getMaxCount() == null) return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.isMonitoring() == null ^ this.isMonitoring() == null) return false;
        if (other.isMonitoring() != null && other.isMonitoring().equals(this.isMonitoring()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.isDisableApiTermination() == null ^ this.isDisableApiTermination() == null) return false;
        if (other.isDisableApiTermination() != null && other.isDisableApiTermination().equals(this.isDisableApiTermination()) == false) return false; 
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null) return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false) return false; 
        if (other.getLicense() == null ^ this.getLicense() == null) return false;
        if (other.getLicense() != null && other.getLicense().equals(this.getLicense()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null) return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        return true;
    }
    
}
    