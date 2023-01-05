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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information to include in an Amazon Elastic Compute Cloud (Amazon EC2) launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about a block device mapping for an Amazon EC2 launch template.
     * </p>
     */
    private java.util.List<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails> blockDeviceMappingSet;
    /**
     * <p>
     * Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     * </p>
     */
    private AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails capacityReservationSpecification;
    /**
     * <p>
     * Specifies the CPU options for an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU options</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private AwsEc2LaunchTemplateDataCpuOptionsDetails cpuOptions;
    /**
     * <p>
     * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     * </p>
     */
    private AwsEc2LaunchTemplateDataCreditSpecificationDetails creditSpecification;
    /**
     * <p>
     * Indicates whether to enable the instance for stop protection. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable stop
     * protection</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private Boolean disableApiStop;
    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API. If set to <code>true</code>, you can.
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Indicates whether the instance is optimized for Amazon EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * Provides details about Elastic Graphics accelerators to associate with the instance.
     * </p>
     */
    private java.util.List<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails> elasticGpuSpecificationSet;
    /**
     * <p>
     * The Amazon Elastic Inference accelerator for the instance.
     * </p>
     */
    private java.util.List<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails> elasticInferenceAcceleratorSet;
    /**
     * <p>
     * Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     * </p>
     */
    private AwsEc2LaunchTemplateDataEnclaveOptionsDetails enclaveOptions;
    /**
     * <p>
     * Specifies whether your Amazon EC2 instance is configured for hibernation.
     * </p>
     */
    private AwsEc2LaunchTemplateDataHibernationOptionsDetails hibernationOptions;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of an IAM instance profile.
     * </p>
     */
    private AwsEc2LaunchTemplateDataIamInstanceProfileDetails iamInstanceProfile;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * Provides the options for specifying the instance initiated shutdown behavior.
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * Specifies the market (purchasing) option for an instance.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails instanceMarketOptions;
    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     * <code>InstanceType</code>.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsDetails instanceRequirements;
    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     * <code>InstanceRequirements</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the kernel.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The name of the key pair that allows users to connect to the instance.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * Specifies a license configuration for an instance.
     * </p>
     */
    private java.util.List<AwsEc2LaunchTemplateDataLicenseSetDetails> licenseSet;
    /**
     * <p>
     * The maintenance options of your instance.
     * </p>
     */
    private AwsEc2LaunchTemplateDataMaintenanceOptionsDetails maintenanceOptions;
    /**
     * <p>
     * The metadata options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata and user
     * data</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private AwsEc2LaunchTemplateDataMetadataOptionsDetails metadataOptions;
    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private AwsEc2LaunchTemplateDataMonitoringDetails monitoring;
    /**
     * <p>
     * Specifies the parameters for a network interface that is attached to the instance.
     * </p>
     */
    private java.util.List<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails> networkInterfaceSet;
    /**
     * <p>
     * Specifies the placement of an instance.
     * </p>
     */
    private AwsEc2LaunchTemplateDataPlacementDetails placement;
    /**
     * <p>
     * The options for the instance hostname.
     * </p>
     */
    private AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails privateDnsNameOptions;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     */
    private String ramDiskId;
    /**
     * <p>
     * One or more security group IDs.
     * </p>
     */
    private java.util.List<String> securityGroupIdSet;
    /**
     * <p>
     * One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     */
    private java.util.List<String> securityGroupSet;
    /**
     * <p>
     * The user data to make available to the instance.
     * </p>
     */
    private String userData;

    /**
     * <p>
     * Information about a block device mapping for an Amazon EC2 launch template.
     * </p>
     * 
     * @return Information about a block device mapping for an Amazon EC2 launch template.
     */

    public java.util.List<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails> getBlockDeviceMappingSet() {
        return blockDeviceMappingSet;
    }

    /**
     * <p>
     * Information about a block device mapping for an Amazon EC2 launch template.
     * </p>
     * 
     * @param blockDeviceMappingSet
     *        Information about a block device mapping for an Amazon EC2 launch template.
     */

    public void setBlockDeviceMappingSet(java.util.Collection<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails> blockDeviceMappingSet) {
        if (blockDeviceMappingSet == null) {
            this.blockDeviceMappingSet = null;
            return;
        }

        this.blockDeviceMappingSet = new java.util.ArrayList<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails>(blockDeviceMappingSet);
    }

    /**
     * <p>
     * Information about a block device mapping for an Amazon EC2 launch template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappingSet(java.util.Collection)} or
     * {@link #withBlockDeviceMappingSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappingSet
     *        Information about a block device mapping for an Amazon EC2 launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withBlockDeviceMappingSet(AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails... blockDeviceMappingSet) {
        if (this.blockDeviceMappingSet == null) {
            setBlockDeviceMappingSet(new java.util.ArrayList<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails>(blockDeviceMappingSet.length));
        }
        for (AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails ele : blockDeviceMappingSet) {
            this.blockDeviceMappingSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about a block device mapping for an Amazon EC2 launch template.
     * </p>
     * 
     * @param blockDeviceMappingSet
     *        Information about a block device mapping for an Amazon EC2 launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withBlockDeviceMappingSet(
            java.util.Collection<AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails> blockDeviceMappingSet) {
        setBlockDeviceMappingSet(blockDeviceMappingSet);
        return this;
    }

    /**
     * <p>
     * Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     */

    public void setCapacityReservationSpecification(AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    /**
     * <p>
     * Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     * </p>
     * 
     * @return Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     */

    public AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails getCapacityReservationSpecification() {
        return this.capacityReservationSpecification;
    }

    /**
     * <p>
     * Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     * </p>
     * 
     * @param capacityReservationSpecification
     *        Specifies an instance's Capacity Reservation targeting option. You can specify only one option at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withCapacityReservationSpecification(
            AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails capacityReservationSpecification) {
        setCapacityReservationSpecification(capacityReservationSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies the CPU options for an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU options</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cpuOptions
     *        Specifies the CPU options for an instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU
     *        options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setCpuOptions(AwsEc2LaunchTemplateDataCpuOptionsDetails cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * Specifies the CPU options for an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU options</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies the CPU options for an instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU
     *         options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public AwsEc2LaunchTemplateDataCpuOptionsDetails getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * <p>
     * Specifies the CPU options for an instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU options</a> in
     * the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param cpuOptions
     *        Specifies the CPU options for an instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-optimize-cpu.html">Optimize CPU
     *        options</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withCpuOptions(AwsEc2LaunchTemplateDataCpuOptionsDetails cpuOptions) {
        setCpuOptions(cpuOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     * </p>
     * 
     * @param creditSpecification
     *        Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     */

    public void setCreditSpecification(AwsEc2LaunchTemplateDataCreditSpecificationDetails creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    /**
     * <p>
     * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     * </p>
     * 
     * @return Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     */

    public AwsEc2LaunchTemplateDataCreditSpecificationDetails getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * <p>
     * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     * </p>
     * 
     * @param creditSpecification
     *        Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withCreditSpecification(AwsEc2LaunchTemplateDataCreditSpecificationDetails creditSpecification) {
        setCreditSpecification(creditSpecification);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable the instance for stop protection. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable stop
     * protection</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param disableApiStop
     *        Indicates whether to enable the instance for stop protection. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable
     *        stop protection</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setDisableApiStop(Boolean disableApiStop) {
        this.disableApiStop = disableApiStop;
    }

    /**
     * <p>
     * Indicates whether to enable the instance for stop protection. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable stop
     * protection</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether to enable the instance for stop protection. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable
     *         stop protection</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public Boolean getDisableApiStop() {
        return this.disableApiStop;
    }

    /**
     * <p>
     * Indicates whether to enable the instance for stop protection. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable stop
     * protection</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param disableApiStop
     *        Indicates whether to enable the instance for stop protection. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable
     *        stop protection</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withDisableApiStop(Boolean disableApiStop) {
        setDisableApiStop(disableApiStop);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable the instance for stop protection. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable stop
     * protection</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether to enable the instance for stop protection. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html#Using_StopProtection">Enable
     *         stop protection</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public Boolean isDisableApiStop() {
        return this.disableApiStop;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API. If set to <code>true</code>, you can.
     * </p>
     * 
     * @param disableApiTermination
     *        If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *        console, CLI, or API. If set to <code>true</code>, you can.
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API. If set to <code>true</code>, you can.
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *         console, CLI, or API. If set to <code>true</code>, you can.
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API. If set to <code>true</code>, you can.
     * </p>
     * 
     * @param disableApiTermination
     *        If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *        console, CLI, or API. If set to <code>true</code>, you can.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withDisableApiTermination(Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API. If set to <code>true</code>, you can.
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *         console, CLI, or API. If set to <code>true</code>, you can.
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
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

    public AwsEc2LaunchTemplateDataDetails withEbsOptimized(Boolean ebsOptimized) {
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
     * Provides details about Elastic Graphics accelerators to associate with the instance.
     * </p>
     * 
     * @return Provides details about Elastic Graphics accelerators to associate with the instance.
     */

    public java.util.List<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails> getElasticGpuSpecificationSet() {
        return elasticGpuSpecificationSet;
    }

    /**
     * <p>
     * Provides details about Elastic Graphics accelerators to associate with the instance.
     * </p>
     * 
     * @param elasticGpuSpecificationSet
     *        Provides details about Elastic Graphics accelerators to associate with the instance.
     */

    public void setElasticGpuSpecificationSet(java.util.Collection<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails> elasticGpuSpecificationSet) {
        if (elasticGpuSpecificationSet == null) {
            this.elasticGpuSpecificationSet = null;
            return;
        }

        this.elasticGpuSpecificationSet = new java.util.ArrayList<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails>(elasticGpuSpecificationSet);
    }

    /**
     * <p>
     * Provides details about Elastic Graphics accelerators to associate with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticGpuSpecificationSet(java.util.Collection)} or
     * {@link #withElasticGpuSpecificationSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticGpuSpecificationSet
     *        Provides details about Elastic Graphics accelerators to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withElasticGpuSpecificationSet(
            AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails... elasticGpuSpecificationSet) {
        if (this.elasticGpuSpecificationSet == null) {
            setElasticGpuSpecificationSet(new java.util.ArrayList<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails>(elasticGpuSpecificationSet.length));
        }
        for (AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails ele : elasticGpuSpecificationSet) {
            this.elasticGpuSpecificationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about Elastic Graphics accelerators to associate with the instance.
     * </p>
     * 
     * @param elasticGpuSpecificationSet
     *        Provides details about Elastic Graphics accelerators to associate with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withElasticGpuSpecificationSet(
            java.util.Collection<AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails> elasticGpuSpecificationSet) {
        setElasticGpuSpecificationSet(elasticGpuSpecificationSet);
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic Inference accelerator for the instance.
     * </p>
     * 
     * @return The Amazon Elastic Inference accelerator for the instance.
     */

    public java.util.List<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails> getElasticInferenceAcceleratorSet() {
        return elasticInferenceAcceleratorSet;
    }

    /**
     * <p>
     * The Amazon Elastic Inference accelerator for the instance.
     * </p>
     * 
     * @param elasticInferenceAcceleratorSet
     *        The Amazon Elastic Inference accelerator for the instance.
     */

    public void setElasticInferenceAcceleratorSet(
            java.util.Collection<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails> elasticInferenceAcceleratorSet) {
        if (elasticInferenceAcceleratorSet == null) {
            this.elasticInferenceAcceleratorSet = null;
            return;
        }

        this.elasticInferenceAcceleratorSet = new java.util.ArrayList<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails>(
                elasticInferenceAcceleratorSet);
    }

    /**
     * <p>
     * The Amazon Elastic Inference accelerator for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElasticInferenceAcceleratorSet(java.util.Collection)} or
     * {@link #withElasticInferenceAcceleratorSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param elasticInferenceAcceleratorSet
     *        The Amazon Elastic Inference accelerator for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withElasticInferenceAcceleratorSet(
            AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails... elasticInferenceAcceleratorSet) {
        if (this.elasticInferenceAcceleratorSet == null) {
            setElasticInferenceAcceleratorSet(new java.util.ArrayList<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails>(
                    elasticInferenceAcceleratorSet.length));
        }
        for (AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails ele : elasticInferenceAcceleratorSet) {
            this.elasticInferenceAcceleratorSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Elastic Inference accelerator for the instance.
     * </p>
     * 
     * @param elasticInferenceAcceleratorSet
     *        The Amazon Elastic Inference accelerator for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withElasticInferenceAcceleratorSet(
            java.util.Collection<AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails> elasticInferenceAcceleratorSet) {
        setElasticInferenceAcceleratorSet(elasticInferenceAcceleratorSet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     * </p>
     * 
     * @param enclaveOptions
     *        Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     */

    public void setEnclaveOptions(AwsEc2LaunchTemplateDataEnclaveOptionsDetails enclaveOptions) {
        this.enclaveOptions = enclaveOptions;
    }

    /**
     * <p>
     * Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     * </p>
     * 
     * @return Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     */

    public AwsEc2LaunchTemplateDataEnclaveOptionsDetails getEnclaveOptions() {
        return this.enclaveOptions;
    }

    /**
     * <p>
     * Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     * </p>
     * 
     * @param enclaveOptions
     *        Indicates whether the Amazon EC2 instance is enabled for Amazon Web Services Nitro Enclaves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withEnclaveOptions(AwsEc2LaunchTemplateDataEnclaveOptionsDetails enclaveOptions) {
        setEnclaveOptions(enclaveOptions);
        return this;
    }

    /**
     * <p>
     * Specifies whether your Amazon EC2 instance is configured for hibernation.
     * </p>
     * 
     * @param hibernationOptions
     *        Specifies whether your Amazon EC2 instance is configured for hibernation.
     */

    public void setHibernationOptions(AwsEc2LaunchTemplateDataHibernationOptionsDetails hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    /**
     * <p>
     * Specifies whether your Amazon EC2 instance is configured for hibernation.
     * </p>
     * 
     * @return Specifies whether your Amazon EC2 instance is configured for hibernation.
     */

    public AwsEc2LaunchTemplateDataHibernationOptionsDetails getHibernationOptions() {
        return this.hibernationOptions;
    }

    /**
     * <p>
     * Specifies whether your Amazon EC2 instance is configured for hibernation.
     * </p>
     * 
     * @param hibernationOptions
     *        Specifies whether your Amazon EC2 instance is configured for hibernation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withHibernationOptions(AwsEc2LaunchTemplateDataHibernationOptionsDetails hibernationOptions) {
        setHibernationOptions(hibernationOptions);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of an IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or Amazon Resource Name (ARN) of an IAM instance profile.
     */

    public void setIamInstanceProfile(AwsEc2LaunchTemplateDataIamInstanceProfileDetails iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of an IAM instance profile.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of an IAM instance profile.
     */

    public AwsEc2LaunchTemplateDataIamInstanceProfileDetails getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of an IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The name or Amazon Resource Name (ARN) of an IAM instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withIamInstanceProfile(AwsEc2LaunchTemplateDataIamInstanceProfileDetails iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI).
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI).
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI).
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * Provides the options for specifying the instance initiated shutdown behavior.
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Provides the options for specifying the instance initiated shutdown behavior.
     */

    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Provides the options for specifying the instance initiated shutdown behavior.
     * </p>
     * 
     * @return Provides the options for specifying the instance initiated shutdown behavior.
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Provides the options for specifying the instance initiated shutdown behavior.
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Provides the options for specifying the instance initiated shutdown behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies the market (purchasing) option for an instance.
     * </p>
     * 
     * @param instanceMarketOptions
     *        Specifies the market (purchasing) option for an instance.
     */

    public void setInstanceMarketOptions(AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    /**
     * <p>
     * Specifies the market (purchasing) option for an instance.
     * </p>
     * 
     * @return Specifies the market (purchasing) option for an instance.
     */

    public AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails getInstanceMarketOptions() {
        return this.instanceMarketOptions;
    }

    /**
     * <p>
     * Specifies the market (purchasing) option for an instance.
     * </p>
     * 
     * @param instanceMarketOptions
     *        Specifies the market (purchasing) option for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withInstanceMarketOptions(AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails instanceMarketOptions) {
        setInstanceMarketOptions(instanceMarketOptions);
        return this;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceRequirements
     *        The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *        instance types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     *        <code>InstanceType</code>.
     */

    public void setInstanceRequirements(AwsEc2LaunchTemplateDataInstanceRequirementsDetails instanceRequirements) {
        this.instanceRequirements = instanceRequirements;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     * <code>InstanceType</code>.
     * </p>
     * 
     * @return The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *         instance types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     *         <code>InstanceType</code>.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails getInstanceRequirements() {
        return this.instanceRequirements;
    }

    /**
     * <p>
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance
     * types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceRequirements
     *        The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify
     *        instance types with these attributes. If you specify <code>InstanceRequirements</code>, you can't specify
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withInstanceRequirements(AwsEc2LaunchTemplateDataInstanceRequirementsDetails instanceRequirements) {
        setInstanceRequirements(instanceRequirements);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     * <code>InstanceRequirements</code>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     *        <code>InstanceRequirements</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     * <code>InstanceRequirements</code>.
     * </p>
     * 
     * @return The instance type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *         <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     *         <code>InstanceRequirements</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     * <code>InstanceRequirements</code>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide</i>. If you specify <code>InstanceType</code>, you can't specify
     *        <code>InstanceRequirements</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @return The ID of the kernel.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * 
     * @param kernelId
     *        The ID of the kernel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The name of the key pair that allows users to connect to the instance.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair that allows users to connect to the instance.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair that allows users to connect to the instance.
     * </p>
     * 
     * @return The name of the key pair that allows users to connect to the instance.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair that allows users to connect to the instance.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair that allows users to connect to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * Specifies a license configuration for an instance.
     * </p>
     * 
     * @return Specifies a license configuration for an instance.
     */

    public java.util.List<AwsEc2LaunchTemplateDataLicenseSetDetails> getLicenseSet() {
        return licenseSet;
    }

    /**
     * <p>
     * Specifies a license configuration for an instance.
     * </p>
     * 
     * @param licenseSet
     *        Specifies a license configuration for an instance.
     */

    public void setLicenseSet(java.util.Collection<AwsEc2LaunchTemplateDataLicenseSetDetails> licenseSet) {
        if (licenseSet == null) {
            this.licenseSet = null;
            return;
        }

        this.licenseSet = new java.util.ArrayList<AwsEc2LaunchTemplateDataLicenseSetDetails>(licenseSet);
    }

    /**
     * <p>
     * Specifies a license configuration for an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseSet(java.util.Collection)} or {@link #withLicenseSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseSet
     *        Specifies a license configuration for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withLicenseSet(AwsEc2LaunchTemplateDataLicenseSetDetails... licenseSet) {
        if (this.licenseSet == null) {
            setLicenseSet(new java.util.ArrayList<AwsEc2LaunchTemplateDataLicenseSetDetails>(licenseSet.length));
        }
        for (AwsEc2LaunchTemplateDataLicenseSetDetails ele : licenseSet) {
            this.licenseSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a license configuration for an instance.
     * </p>
     * 
     * @param licenseSet
     *        Specifies a license configuration for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withLicenseSet(java.util.Collection<AwsEc2LaunchTemplateDataLicenseSetDetails> licenseSet) {
        setLicenseSet(licenseSet);
        return this;
    }

    /**
     * <p>
     * The maintenance options of your instance.
     * </p>
     * 
     * @param maintenanceOptions
     *        The maintenance options of your instance.
     */

    public void setMaintenanceOptions(AwsEc2LaunchTemplateDataMaintenanceOptionsDetails maintenanceOptions) {
        this.maintenanceOptions = maintenanceOptions;
    }

    /**
     * <p>
     * The maintenance options of your instance.
     * </p>
     * 
     * @return The maintenance options of your instance.
     */

    public AwsEc2LaunchTemplateDataMaintenanceOptionsDetails getMaintenanceOptions() {
        return this.maintenanceOptions;
    }

    /**
     * <p>
     * The maintenance options of your instance.
     * </p>
     * 
     * @param maintenanceOptions
     *        The maintenance options of your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withMaintenanceOptions(AwsEc2LaunchTemplateDataMaintenanceOptionsDetails maintenanceOptions) {
        setMaintenanceOptions(maintenanceOptions);
        return this;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata and user
     * data</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param metadataOptions
     *        The metadata options for the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata
     *        and user data</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setMetadataOptions(AwsEc2LaunchTemplateDataMetadataOptionsDetails metadataOptions) {
        this.metadataOptions = metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata and user
     * data</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return The metadata options for the instance. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata
     *         and user data</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public AwsEc2LaunchTemplateDataMetadataOptionsDetails getMetadataOptions() {
        return this.metadataOptions;
    }

    /**
     * <p>
     * The metadata options for the instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata and user
     * data</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param metadataOptions
     *        The metadata options for the instance. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">Instance metadata
     *        and user data</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withMetadataOptions(AwsEc2LaunchTemplateDataMetadataOptionsDetails metadataOptions) {
        setMetadataOptions(metadataOptions);
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

    public void setMonitoring(AwsEc2LaunchTemplateDataMonitoringDetails monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public AwsEc2LaunchTemplateDataMonitoringDetails getMonitoring() {
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

    public AwsEc2LaunchTemplateDataDetails withMonitoring(AwsEc2LaunchTemplateDataMonitoringDetails monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * Specifies the parameters for a network interface that is attached to the instance.
     * </p>
     * 
     * @return Specifies the parameters for a network interface that is attached to the instance.
     */

    public java.util.List<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails> getNetworkInterfaceSet() {
        return networkInterfaceSet;
    }

    /**
     * <p>
     * Specifies the parameters for a network interface that is attached to the instance.
     * </p>
     * 
     * @param networkInterfaceSet
     *        Specifies the parameters for a network interface that is attached to the instance.
     */

    public void setNetworkInterfaceSet(java.util.Collection<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails> networkInterfaceSet) {
        if (networkInterfaceSet == null) {
            this.networkInterfaceSet = null;
            return;
        }

        this.networkInterfaceSet = new java.util.ArrayList<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails>(networkInterfaceSet);
    }

    /**
     * <p>
     * Specifies the parameters for a network interface that is attached to the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceSet(java.util.Collection)} or {@link #withNetworkInterfaceSet(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceSet
     *        Specifies the parameters for a network interface that is attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withNetworkInterfaceSet(AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails... networkInterfaceSet) {
        if (this.networkInterfaceSet == null) {
            setNetworkInterfaceSet(new java.util.ArrayList<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails>(networkInterfaceSet.length));
        }
        for (AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails ele : networkInterfaceSet) {
            this.networkInterfaceSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parameters for a network interface that is attached to the instance.
     * </p>
     * 
     * @param networkInterfaceSet
     *        Specifies the parameters for a network interface that is attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withNetworkInterfaceSet(java.util.Collection<AwsEc2LaunchTemplateDataNetworkInterfaceSetDetails> networkInterfaceSet) {
        setNetworkInterfaceSet(networkInterfaceSet);
        return this;
    }

    /**
     * <p>
     * Specifies the placement of an instance.
     * </p>
     * 
     * @param placement
     *        Specifies the placement of an instance.
     */

    public void setPlacement(AwsEc2LaunchTemplateDataPlacementDetails placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * Specifies the placement of an instance.
     * </p>
     * 
     * @return Specifies the placement of an instance.
     */

    public AwsEc2LaunchTemplateDataPlacementDetails getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * Specifies the placement of an instance.
     * </p>
     * 
     * @param placement
     *        Specifies the placement of an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withPlacement(AwsEc2LaunchTemplateDataPlacementDetails placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The options for the instance hostname.
     * </p>
     * 
     * @param privateDnsNameOptions
     *        The options for the instance hostname.
     */

    public void setPrivateDnsNameOptions(AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails privateDnsNameOptions) {
        this.privateDnsNameOptions = privateDnsNameOptions;
    }

    /**
     * <p>
     * The options for the instance hostname.
     * </p>
     * 
     * @return The options for the instance hostname.
     */

    public AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails getPrivateDnsNameOptions() {
        return this.privateDnsNameOptions;
    }

    /**
     * <p>
     * The options for the instance hostname.
     * </p>
     * 
     * @param privateDnsNameOptions
     *        The options for the instance hostname.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withPrivateDnsNameOptions(AwsEc2LaunchTemplateDataPrivateDnsNameOptionsDetails privateDnsNameOptions) {
        setPrivateDnsNameOptions(privateDnsNameOptions);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @param ramDiskId
     *        The ID of the RAM disk.
     */

    public void setRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @return The ID of the RAM disk.
     */

    public String getRamDiskId() {
        return this.ramDiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * 
     * @param ramDiskId
     *        The ID of the RAM disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withRamDiskId(String ramDiskId) {
        setRamDiskId(ramDiskId);
        return this;
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * 
     * @return One or more security group IDs.
     */

    public java.util.List<String> getSecurityGroupIdSet() {
        return securityGroupIdSet;
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * 
     * @param securityGroupIdSet
     *        One or more security group IDs.
     */

    public void setSecurityGroupIdSet(java.util.Collection<String> securityGroupIdSet) {
        if (securityGroupIdSet == null) {
            this.securityGroupIdSet = null;
            return;
        }

        this.securityGroupIdSet = new java.util.ArrayList<String>(securityGroupIdSet);
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIdSet(java.util.Collection)} or {@link #withSecurityGroupIdSet(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupIdSet
     *        One or more security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withSecurityGroupIdSet(String... securityGroupIdSet) {
        if (this.securityGroupIdSet == null) {
            setSecurityGroupIdSet(new java.util.ArrayList<String>(securityGroupIdSet.length));
        }
        for (String ele : securityGroupIdSet) {
            this.securityGroupIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * 
     * @param securityGroupIdSet
     *        One or more security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withSecurityGroupIdSet(java.util.Collection<String> securityGroupIdSet) {
        setSecurityGroupIdSet(securityGroupIdSet);
        return this;
    }

    /**
     * <p>
     * One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @return One or more security group names. For a nondefault VPC, you must use security group IDs instead. You
     *         cannot specify both a security group ID and security name in the same request.
     */

    public java.util.List<String> getSecurityGroupSet() {
        return securityGroupSet;
    }

    /**
     * <p>
     * One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @param securityGroupSet
     *        One or more security group names. For a nondefault VPC, you must use security group IDs instead. You
     *        cannot specify both a security group ID and security name in the same request.
     */

    public void setSecurityGroupSet(java.util.Collection<String> securityGroupSet) {
        if (securityGroupSet == null) {
            this.securityGroupSet = null;
            return;
        }

        this.securityGroupSet = new java.util.ArrayList<String>(securityGroupSet);
    }

    /**
     * <p>
     * One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupSet(java.util.Collection)} or {@link #withSecurityGroupSet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupSet
     *        One or more security group names. For a nondefault VPC, you must use security group IDs instead. You
     *        cannot specify both a security group ID and security name in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withSecurityGroupSet(String... securityGroupSet) {
        if (this.securityGroupSet == null) {
            setSecurityGroupSet(new java.util.ArrayList<String>(securityGroupSet.length));
        }
        for (String ele : securityGroupSet) {
            this.securityGroupSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group names. For a nondefault VPC, you must use security group IDs instead. You cannot
     * specify both a security group ID and security name in the same request.
     * </p>
     * 
     * @param securityGroupSet
     *        One or more security group names. For a nondefault VPC, you must use security group IDs instead. You
     *        cannot specify both a security group ID and security name in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withSecurityGroupSet(java.util.Collection<String> securityGroupSet) {
        setSecurityGroupSet(securityGroupSet);
        return this;
    }

    /**
     * <p>
     * The user data to make available to the instance.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instance.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the instance.
     * </p>
     * 
     * @return The user data to make available to the instance.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data to make available to the instance.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataDetails withUserData(String userData) {
        setUserData(userData);
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
        if (getBlockDeviceMappingSet() != null)
            sb.append("BlockDeviceMappingSet: ").append(getBlockDeviceMappingSet()).append(",");
        if (getCapacityReservationSpecification() != null)
            sb.append("CapacityReservationSpecification: ").append(getCapacityReservationSpecification()).append(",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: ").append(getCpuOptions()).append(",");
        if (getCreditSpecification() != null)
            sb.append("CreditSpecification: ").append(getCreditSpecification()).append(",");
        if (getDisableApiStop() != null)
            sb.append("DisableApiStop: ").append(getDisableApiStop()).append(",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: ").append(getDisableApiTermination()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getElasticGpuSpecificationSet() != null)
            sb.append("ElasticGpuSpecificationSet: ").append(getElasticGpuSpecificationSet()).append(",");
        if (getElasticInferenceAcceleratorSet() != null)
            sb.append("ElasticInferenceAcceleratorSet: ").append(getElasticInferenceAcceleratorSet()).append(",");
        if (getEnclaveOptions() != null)
            sb.append("EnclaveOptions: ").append(getEnclaveOptions()).append(",");
        if (getHibernationOptions() != null)
            sb.append("HibernationOptions: ").append(getHibernationOptions()).append(",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: ").append(getIamInstanceProfile()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: ").append(getInstanceInitiatedShutdownBehavior()).append(",");
        if (getInstanceMarketOptions() != null)
            sb.append("InstanceMarketOptions: ").append(getInstanceMarketOptions()).append(",");
        if (getInstanceRequirements() != null)
            sb.append("InstanceRequirements: ").append(getInstanceRequirements()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getLicenseSet() != null)
            sb.append("LicenseSet: ").append(getLicenseSet()).append(",");
        if (getMaintenanceOptions() != null)
            sb.append("MaintenanceOptions: ").append(getMaintenanceOptions()).append(",");
        if (getMetadataOptions() != null)
            sb.append("MetadataOptions: ").append(getMetadataOptions()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring()).append(",");
        if (getNetworkInterfaceSet() != null)
            sb.append("NetworkInterfaceSet: ").append(getNetworkInterfaceSet()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getPrivateDnsNameOptions() != null)
            sb.append("PrivateDnsNameOptions: ").append(getPrivateDnsNameOptions()).append(",");
        if (getRamDiskId() != null)
            sb.append("RamDiskId: ").append(getRamDiskId()).append(",");
        if (getSecurityGroupIdSet() != null)
            sb.append("SecurityGroupIdSet: ").append(getSecurityGroupIdSet()).append(",");
        if (getSecurityGroupSet() != null)
            sb.append("SecurityGroupSet: ").append(getSecurityGroupSet()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataDetails == false)
            return false;
        AwsEc2LaunchTemplateDataDetails other = (AwsEc2LaunchTemplateDataDetails) obj;
        if (other.getBlockDeviceMappingSet() == null ^ this.getBlockDeviceMappingSet() == null)
            return false;
        if (other.getBlockDeviceMappingSet() != null && other.getBlockDeviceMappingSet().equals(this.getBlockDeviceMappingSet()) == false)
            return false;
        if (other.getCapacityReservationSpecification() == null ^ this.getCapacityReservationSpecification() == null)
            return false;
        if (other.getCapacityReservationSpecification() != null
                && other.getCapacityReservationSpecification().equals(this.getCapacityReservationSpecification()) == false)
            return false;
        if (other.getCpuOptions() == null ^ this.getCpuOptions() == null)
            return false;
        if (other.getCpuOptions() != null && other.getCpuOptions().equals(this.getCpuOptions()) == false)
            return false;
        if (other.getCreditSpecification() == null ^ this.getCreditSpecification() == null)
            return false;
        if (other.getCreditSpecification() != null && other.getCreditSpecification().equals(this.getCreditSpecification()) == false)
            return false;
        if (other.getDisableApiStop() == null ^ this.getDisableApiStop() == null)
            return false;
        if (other.getDisableApiStop() != null && other.getDisableApiStop().equals(this.getDisableApiStop()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getElasticGpuSpecificationSet() == null ^ this.getElasticGpuSpecificationSet() == null)
            return false;
        if (other.getElasticGpuSpecificationSet() != null && other.getElasticGpuSpecificationSet().equals(this.getElasticGpuSpecificationSet()) == false)
            return false;
        if (other.getElasticInferenceAcceleratorSet() == null ^ this.getElasticInferenceAcceleratorSet() == null)
            return false;
        if (other.getElasticInferenceAcceleratorSet() != null
                && other.getElasticInferenceAcceleratorSet().equals(this.getElasticInferenceAcceleratorSet()) == false)
            return false;
        if (other.getEnclaveOptions() == null ^ this.getEnclaveOptions() == null)
            return false;
        if (other.getEnclaveOptions() != null && other.getEnclaveOptions().equals(this.getEnclaveOptions()) == false)
            return false;
        if (other.getHibernationOptions() == null ^ this.getHibernationOptions() == null)
            return false;
        if (other.getHibernationOptions() != null && other.getHibernationOptions().equals(this.getHibernationOptions()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getInstanceMarketOptions() == null ^ this.getInstanceMarketOptions() == null)
            return false;
        if (other.getInstanceMarketOptions() != null && other.getInstanceMarketOptions().equals(this.getInstanceMarketOptions()) == false)
            return false;
        if (other.getInstanceRequirements() == null ^ this.getInstanceRequirements() == null)
            return false;
        if (other.getInstanceRequirements() != null && other.getInstanceRequirements().equals(this.getInstanceRequirements()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getLicenseSet() == null ^ this.getLicenseSet() == null)
            return false;
        if (other.getLicenseSet() != null && other.getLicenseSet().equals(this.getLicenseSet()) == false)
            return false;
        if (other.getMaintenanceOptions() == null ^ this.getMaintenanceOptions() == null)
            return false;
        if (other.getMaintenanceOptions() != null && other.getMaintenanceOptions().equals(this.getMaintenanceOptions()) == false)
            return false;
        if (other.getMetadataOptions() == null ^ this.getMetadataOptions() == null)
            return false;
        if (other.getMetadataOptions() != null && other.getMetadataOptions().equals(this.getMetadataOptions()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getNetworkInterfaceSet() == null ^ this.getNetworkInterfaceSet() == null)
            return false;
        if (other.getNetworkInterfaceSet() != null && other.getNetworkInterfaceSet().equals(this.getNetworkInterfaceSet()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getPrivateDnsNameOptions() == null ^ this.getPrivateDnsNameOptions() == null)
            return false;
        if (other.getPrivateDnsNameOptions() != null && other.getPrivateDnsNameOptions().equals(this.getPrivateDnsNameOptions()) == false)
            return false;
        if (other.getRamDiskId() == null ^ this.getRamDiskId() == null)
            return false;
        if (other.getRamDiskId() != null && other.getRamDiskId().equals(this.getRamDiskId()) == false)
            return false;
        if (other.getSecurityGroupIdSet() == null ^ this.getSecurityGroupIdSet() == null)
            return false;
        if (other.getSecurityGroupIdSet() != null && other.getSecurityGroupIdSet().equals(this.getSecurityGroupIdSet()) == false)
            return false;
        if (other.getSecurityGroupSet() == null ^ this.getSecurityGroupSet() == null)
            return false;
        if (other.getSecurityGroupSet() != null && other.getSecurityGroupSet().equals(this.getSecurityGroupSet()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockDeviceMappingSet() == null) ? 0 : getBlockDeviceMappingSet().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationSpecification() == null) ? 0 : getCapacityReservationSpecification().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime * hashCode + ((getCreditSpecification() == null) ? 0 : getCreditSpecification().hashCode());
        hashCode = prime * hashCode + ((getDisableApiStop() == null) ? 0 : getDisableApiStop().hashCode());
        hashCode = prime * hashCode + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getElasticGpuSpecificationSet() == null) ? 0 : getElasticGpuSpecificationSet().hashCode());
        hashCode = prime * hashCode + ((getElasticInferenceAcceleratorSet() == null) ? 0 : getElasticInferenceAcceleratorSet().hashCode());
        hashCode = prime * hashCode + ((getEnclaveOptions() == null) ? 0 : getEnclaveOptions().hashCode());
        hashCode = prime * hashCode + ((getHibernationOptions() == null) ? 0 : getHibernationOptions().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getInstanceMarketOptions() == null) ? 0 : getInstanceMarketOptions().hashCode());
        hashCode = prime * hashCode + ((getInstanceRequirements() == null) ? 0 : getInstanceRequirements().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getLicenseSet() == null) ? 0 : getLicenseSet().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceOptions() == null) ? 0 : getMaintenanceOptions().hashCode());
        hashCode = prime * hashCode + ((getMetadataOptions() == null) ? 0 : getMetadataOptions().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceSet() == null) ? 0 : getNetworkInterfaceSet().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsNameOptions() == null) ? 0 : getPrivateDnsNameOptions().hashCode());
        hashCode = prime * hashCode + ((getRamDiskId() == null) ? 0 : getRamDiskId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIdSet() == null) ? 0 : getSecurityGroupIdSet().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupSet() == null) ? 0 : getSecurityGroupSet().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
