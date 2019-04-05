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
 * The information for a launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ResponseLaunchTemplateData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseLaunchTemplateData implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the kernel, if applicable.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private LaunchTemplateIamInstanceProfileSpecification iamInstanceProfile;
    /**
     * <p>
     * The block device mappings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecification> networkInterfaces;
    /**
     * <p>
     * The ID of the AMI that was used to launch the instance.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private LaunchTemplatesMonitoring monitoring;
    /**
     * <p>
     * The placement of the instance.
     * </p>
     */
    private LaunchTemplatePlacement placement;
    /**
     * <p>
     * The ID of the RAM disk, if applicable.
     * </p>
     */
    private String ramDiskId;
    /**
     * <p>
     * If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2 console,
     * command line tool, or API.
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * The user data for the instance.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecification> tagSpecifications;
    /**
     * <p>
     * The elastic GPU specification.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ElasticGpuSpecificationResponse> elasticGpuSpecifications;
    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAcceleratorResponse> elasticInferenceAccelerators;
    /**
     * <p>
     * The security group IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The security group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     */
    private LaunchTemplateInstanceMarketOptions instanceMarketOptions;
    /**
     * <p>
     * The credit option for CPU usage of the instance.
     * </p>
     */
    private CreditSpecification creditSpecification;
    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private LaunchTemplateCpuOptions cpuOptions;
    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     */
    private LaunchTemplateCapacityReservationSpecificationResponse capacityReservationSpecification;
    /**
     * <p>
     * Indicates whether an instance is configured for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private LaunchTemplateHibernationOptions hibernationOptions;
    /**
     * <p>
     * The license configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfiguration> licenseSpecifications;

    /**
     * <p>
     * The ID of the kernel, if applicable.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel, if applicable.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel, if applicable.
     * </p>
     * 
     * @return The ID of the kernel, if applicable.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel, if applicable.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for Amazon EBS I/O.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     * 
     * @return Indicates whether the instance is optimized for Amazon EBS I/O.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile.
     */

    public void setIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @return The IAM instance profile.
     */

    public LaunchTemplateIamInstanceProfileSpecification getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withIamInstanceProfile(LaunchTemplateIamInstanceProfileSpecification iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The block device mappings.
     * </p>
     * 
     * @return The block device mappings.
     */

    public java.util.List<LaunchTemplateBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mappings.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings.
     */

    public void setBlockDeviceMappings(java.util.Collection<LaunchTemplateBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withBlockDeviceMappings(LaunchTemplateBlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (LaunchTemplateBlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The block device mappings.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withBlockDeviceMappings(java.util.Collection<LaunchTemplateBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * 
     * @return The network interfaces.
     */

    public java.util.List<LaunchTemplateInstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecification>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces.
     */

    public void setNetworkInterfaces(java.util.Collection<LaunchTemplateInstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecification>(networkInterfaces);
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withNetworkInterfaces(LaunchTemplateInstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        }
        for (LaunchTemplateInstanceNetworkInterfaceSpecification ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        The network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withNetworkInterfaces(java.util.Collection<LaunchTemplateInstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI that was used to launch the instance.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI that was used to launch the instance.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI that was used to launch the instance.
     * </p>
     * 
     * @return The ID of the AMI that was used to launch the instance.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI that was used to launch the instance.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI that was used to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ResponseLaunchTemplateData withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ResponseLaunchTemplateData withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @return The name of the key pair.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring for the instance.
     */

    public void setMonitoring(LaunchTemplatesMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public LaunchTemplatesMonitoring getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withMonitoring(LaunchTemplatesMonitoring monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * The placement of the instance.
     * </p>
     * 
     * @param placement
     *        The placement of the instance.
     */

    public void setPlacement(LaunchTemplatePlacement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement of the instance.
     * </p>
     * 
     * @return The placement of the instance.
     */

    public LaunchTemplatePlacement getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement of the instance.
     * </p>
     * 
     * @param placement
     *        The placement of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withPlacement(LaunchTemplatePlacement placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk, if applicable.
     * </p>
     * 
     * @param ramDiskId
     *        The ID of the RAM disk, if applicable.
     */

    public void setRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk, if applicable.
     * </p>
     * 
     * @return The ID of the RAM disk, if applicable.
     */

    public String getRamDiskId() {
        return this.ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk, if applicable.
     * </p>
     * 
     * @param ramDiskId
     *        The ID of the RAM disk, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withRamDiskId(String ramDiskId) {
        setRamDiskId(ramDiskId);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2 console,
     * command line tool, or API.
     * </p>
     * 
     * @param disableApiTermination
     *        If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2
     *        console, command line tool, or API.
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2 console,
     * command line tool, or API.
     * </p>
     * 
     * @return If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2
     *         console, command line tool, or API.
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2 console,
     * command line tool, or API.
     * </p>
     * 
     * @param disableApiTermination
     *        If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2
     *        console, command line tool, or API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withDisableApiTermination(Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2 console,
     * command line tool, or API.
     * </p>
     * 
     * @return If set to <code>true</code>, indicates that the instance cannot be terminated using the Amazon EC2
     *         console, command line tool, or API.
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @return Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *         operating system command for system shutdown).
     * @see ShutdownBehavior
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public ResponseLaunchTemplateData withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public ResponseLaunchTemplateData withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The user data for the instance.
     * </p>
     * 
     * @param userData
     *        The user data for the instance.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data for the instance.
     * </p>
     * 
     * @return The user data for the instance.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data for the instance.
     * </p>
     * 
     * @param userData
     *        The user data for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<LaunchTemplateTagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags.
     */

    public void setTagSpecifications(java.util.Collection<LaunchTemplateTagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withTagSpecifications(LaunchTemplateTagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecification>(tagSpecifications.length));
        }
        for (LaunchTemplateTagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withTagSpecifications(java.util.Collection<LaunchTemplateTagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * <p>
     * The elastic GPU specification.
     * </p>
     * 
     * @return The elastic GPU specification.
     */

    public java.util.List<ElasticGpuSpecificationResponse> getElasticGpuSpecifications() {
        if (elasticGpuSpecifications == null) {
            elasticGpuSpecifications = new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecificationResponse>();
        }
        return elasticGpuSpecifications;
    }

    /**
     * <p>
     * The elastic GPU specification.
     * </p>
     * 
     * @param elasticGpuSpecifications
     *        The elastic GPU specification.
     */

    public void setElasticGpuSpecifications(java.util.Collection<ElasticGpuSpecificationResponse> elasticGpuSpecifications) {
        if (elasticGpuSpecifications == null) {
            this.elasticGpuSpecifications = null;
            return;
        }

        this.elasticGpuSpecifications = new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecificationResponse>(elasticGpuSpecifications);
    }

    /**
     * <p>
     * The elastic GPU specification.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticGpuSpecifications(java.util.Collection)} or
     * {@link #withElasticGpuSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticGpuSpecifications
     *        The elastic GPU specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withElasticGpuSpecifications(ElasticGpuSpecificationResponse... elasticGpuSpecifications) {
        if (this.elasticGpuSpecifications == null) {
            setElasticGpuSpecifications(new com.amazonaws.internal.SdkInternalList<ElasticGpuSpecificationResponse>(elasticGpuSpecifications.length));
        }
        for (ElasticGpuSpecificationResponse ele : elasticGpuSpecifications) {
            this.elasticGpuSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The elastic GPU specification.
     * </p>
     * 
     * @param elasticGpuSpecifications
     *        The elastic GPU specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withElasticGpuSpecifications(java.util.Collection<ElasticGpuSpecificationResponse> elasticGpuSpecifications) {
        setElasticGpuSpecifications(elasticGpuSpecifications);
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * 
     * @return The elastic inference accelerator for the instance.
     */

    public java.util.List<LaunchTemplateElasticInferenceAcceleratorResponse> getElasticInferenceAccelerators() {
        if (elasticInferenceAccelerators == null) {
            elasticInferenceAccelerators = new com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAcceleratorResponse>();
        }
        return elasticInferenceAccelerators;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        The elastic inference accelerator for the instance.
     */

    public void setElasticInferenceAccelerators(java.util.Collection<LaunchTemplateElasticInferenceAcceleratorResponse> elasticInferenceAccelerators) {
        if (elasticInferenceAccelerators == null) {
            this.elasticInferenceAccelerators = null;
            return;
        }

        this.elasticInferenceAccelerators = new com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAcceleratorResponse>(
                elasticInferenceAccelerators);
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticInferenceAccelerators(java.util.Collection)} or
     * {@link #withElasticInferenceAccelerators(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        The elastic inference accelerator for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withElasticInferenceAccelerators(LaunchTemplateElasticInferenceAcceleratorResponse... elasticInferenceAccelerators) {
        if (this.elasticInferenceAccelerators == null) {
            setElasticInferenceAccelerators(new com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAcceleratorResponse>(
                    elasticInferenceAccelerators.length));
        }
        for (LaunchTemplateElasticInferenceAcceleratorResponse ele : elasticInferenceAccelerators) {
            this.elasticInferenceAccelerators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The elastic inference accelerator for the instance.
     * </p>
     * 
     * @param elasticInferenceAccelerators
     *        The elastic inference accelerator for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withElasticInferenceAccelerators(
            java.util.Collection<LaunchTemplateElasticInferenceAcceleratorResponse> elasticInferenceAccelerators) {
        setElasticInferenceAccelerators(elasticInferenceAccelerators);
        return this;
    }

    /**
     * <p>
     * The security group IDs.
     * </p>
     * 
     * @return The security group IDs.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The security group names.
     * </p>
     * 
     * @return The security group names.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The security group names.
     * </p>
     * 
     * @param securityGroups
     *        The security group names.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * The security group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group names.
     * </p>
     * 
     * @param securityGroups
     *        The security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The market (purchasing) option for the instances.
     */

    public void setInstanceMarketOptions(LaunchTemplateInstanceMarketOptions instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * 
     * @return The market (purchasing) option for the instances.
     */

    public LaunchTemplateInstanceMarketOptions getInstanceMarketOptions() {
        return this.instanceMarketOptions;
    }

    /**
     * <p>
     * The market (purchasing) option for the instances.
     * </p>
     * 
     * @param instanceMarketOptions
     *        The market (purchasing) option for the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withInstanceMarketOptions(LaunchTemplateInstanceMarketOptions instanceMarketOptions) {
        setInstanceMarketOptions(instanceMarketOptions);
        return this;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance.
     * </p>
     * 
     * @param creditSpecification
     *        The credit option for CPU usage of the instance.
     */

    public void setCreditSpecification(CreditSpecification creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance.
     * </p>
     * 
     * @return The credit option for CPU usage of the instance.
     */

    public CreditSpecification getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * <p>
     * The credit option for CPU usage of the instance.
     * </p>
     * 
     * @param creditSpecification
     *        The credit option for CPU usage of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withCreditSpecification(CreditSpecification creditSpecification) {
        setCreditSpecification(creditSpecification);
        return this;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cpuOptions
     *        The CPU options for the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU
     *        Options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setCpuOptions(LaunchTemplateCpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The CPU options for the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU
     *         Options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public LaunchTemplateCpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU Options</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cpuOptions
     *        The CPU options for the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimizing CPU
     *        Options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withCpuOptions(LaunchTemplateCpuOptions cpuOptions) {
        setCpuOptions(cpuOptions);
        return this;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Information about the Capacity Reservation targeting option.
     */

    public void setCapacityReservationSpecification(LaunchTemplateCapacityReservationSpecificationResponse capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * 
     * @return Information about the Capacity Reservation targeting option.
     */

    public LaunchTemplateCapacityReservationSpecificationResponse getCapacityReservationSpecification() {
        return this.capacityReservationSpecification;
    }

    /**
     * <p>
     * Information about the Capacity Reservation targeting option.
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Information about the Capacity Reservation targeting option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withCapacityReservationSpecification(
            LaunchTemplateCapacityReservationSpecificationResponse capacityReservationSpecification) {
        setCapacityReservationSpecification(capacityReservationSpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance is configured for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hibernationOptions
     *        Indicates whether an instance is configured for hibernation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setHibernationOptions(LaunchTemplateHibernationOptions hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is configured for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Indicates whether an instance is configured for hibernation. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in
     *         the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public LaunchTemplateHibernationOptions getHibernationOptions() {
        return this.hibernationOptions;
    }

    /**
     * <p>
     * Indicates whether an instance is configured for hibernation. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param hibernationOptions
     *        Indicates whether an instance is configured for hibernation. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html">Hibernate Your Instance</a> in
     *        the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withHibernationOptions(LaunchTemplateHibernationOptions hibernationOptions) {
        setHibernationOptions(hibernationOptions);
        return this;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * 
     * @return The license configurations.
     */

    public java.util.List<LaunchTemplateLicenseConfiguration> getLicenseSpecifications() {
        if (licenseSpecifications == null) {
            licenseSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfiguration>();
        }
        return licenseSpecifications;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * 
     * @param licenseSpecifications
     *        The license configurations.
     */

    public void setLicenseSpecifications(java.util.Collection<LaunchTemplateLicenseConfiguration> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfiguration>(licenseSpecifications);
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseSpecifications(java.util.Collection)} or
     * {@link #withLicenseSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseSpecifications
     *        The license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withLicenseSpecifications(LaunchTemplateLicenseConfiguration... licenseSpecifications) {
        if (this.licenseSpecifications == null) {
            setLicenseSpecifications(new com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfiguration>(licenseSpecifications.length));
        }
        for (LaunchTemplateLicenseConfiguration ele : licenseSpecifications) {
            this.licenseSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The license configurations.
     * </p>
     * 
     * @param licenseSpecifications
     *        The license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseLaunchTemplateData withLicenseSpecifications(java.util.Collection<LaunchTemplateLicenseConfiguration> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
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
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getRamDiskId() != null)
            sb.append("RamDiskId: ").append(getRamDiskId()).append(",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: ").append(getDisableApiTermination()).append(",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: ").append(getInstanceInitiatedShutdownBehavior()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications()).append(",");
        if (getElasticGpuSpecifications() != null)
            sb.append("ElasticGpuSpecifications: ").append(getElasticGpuSpecifications()).append(",");
        if (getElasticInferenceAccelerators() != null)
            sb.append("ElasticInferenceAccelerators: ").append(getElasticInferenceAccelerators()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getInstanceMarketOptions() != null)
            sb.append("InstanceMarketOptions: ").append(getInstanceMarketOptions()).append(",");
        if (getCreditSpecification() != null)
            sb.append("CreditSpecification: ").append(getCreditSpecification()).append(",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: ").append(getCpuOptions()).append(",");
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: ").append(getCapacityReservationSpecification()).append(",");
        if (getHibernationOptions() != null)
            sb.append("HibernationOptions: ").append(getHibernationOptions()).append(",");
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: ").append(getLicenseSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseLaunchTemplateData == false)
            return false;
        ResponseLaunchTemplateData other = (ResponseLaunchTemplateData) obj;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getRamDiskId() == null ^ this.getRamDiskId() == null)
            return false;
        if (other.getRamDiskId() != null && other.getRamDiskId().equals(this.getRamDiskId()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        if (other.getElasticGpuSpecifications() == null ^ this.getElasticGpuSpecifications() == null)
            return false;
        if (other.getElasticGpuSpecifications() != null && other.getElasticGpuSpecifications().equals(this.getElasticGpuSpecifications()) == false)
            return false;
        if (other.getElasticInferenceAccelerators() == null ^ this.getElasticInferenceAccelerators() == null)
            return false;
        if (other.getElasticInferenceAccelerators() != null && other.getElasticInferenceAccelerators().equals(this.getElasticInferenceAccelerators()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getInstanceMarketOptions() == null ^ this.getInstanceMarketOptions() == null)
            return false;
        if (other.getInstanceMarketOptions() != null && other.getInstanceMarketOptions().equals(this.getInstanceMarketOptions()) == false)
            return false;
        if (other.getCreditSpecification() == null ^ this.getCreditSpecification() == null)
            return false;
        if (other.getCreditSpecification() != null && other.getCreditSpecification().equals(this.getCreditSpecification()) == false)
            return false;
        if (other.getCpuOptions() == null ^ this.getCpuOptions() == null)
            return false;
        if (other.getCpuOptions() != null && other.getCpuOptions().equals(this.getCpuOptions()) == false)
            return false;
        if (other.getCapacityReservationSpecification() == null ^ this.getCapacityReservationSpecification() == null)
            return false;
        if (other.getCapacityReservationSpecification() != null
                && other.getCapacityReservationSpecification().equals(this.getCapacityReservationSpecification()) == false)
            return false;
        if (other.getHibernationOptions() == null ^ this.getHibernationOptions() == null)
            return false;
        if (other.getHibernationOptions() != null && other.getHibernationOptions().equals(this.getHibernationOptions()) == false)
            return false;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getRamDiskId() == null) ? 0 : getRamDiskId().hashCode());
        hashCode = prime * hashCode + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuSpecifications() == null) ? 0 : getElasticGpuSpecifications().hashCode());
        hashCode = prime * hashCode + ((getElasticInferenceAccelerators() == null) ? 0 : getElasticInferenceAccelerators().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getInstanceMarketOptions() == null) ? 0 : getInstanceMarketOptions().hashCode());
        hashCode = prime * hashCode + ((getCreditSpecification() == null) ? 0 : getCreditSpecification().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationSpecification() == null) ? 0 : getCapacityReservationSpecification().hashCode());
        hashCode = prime * hashCode + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime * hashCode + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public ResponseLaunchTemplateData clone() {
        try {
            return (ResponseLaunchTemplateData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
