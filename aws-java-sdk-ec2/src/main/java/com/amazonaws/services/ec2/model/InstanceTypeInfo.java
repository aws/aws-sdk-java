/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceTypeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     */
    private Boolean currentGeneration;
    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     */
    private Boolean freeTierEligible;
    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedUsageClasses;
    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedRootDeviceTypes;
    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     */
    private Boolean bareMetal;
    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * Describes the processor.
     * </p>
     */
    private ProcessorInfo processorInfo;
    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     */
    private VCpuInfo vCpuInfo;
    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     */
    private MemoryInfo memoryInfo;
    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     */
    private Boolean instanceStorageSupported;
    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     */
    private InstanceStorageInfo instanceStorageInfo;
    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     */
    private EbsInfo ebsInfo;
    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     */
    private NetworkInfo networkInfo;
    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     */
    private GpuInfo gpuInfo;
    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     */
    private FpgaInfo fpgaInfo;
    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     */
    private PlacementGroupInfo placementGroupInfo;
    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     */
    private InferenceAcceleratorInfo inferenceAcceleratorInfo;
    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     */
    private Boolean hibernationSupported;
    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance type.
     * </p>
     */
    private Boolean burstablePerformanceSupported;
    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     */
    private Boolean dedicatedHostsSupported;
    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     */
    private Boolean autoRecoverySupported;

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance type. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceTypeInfo withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public InstanceTypeInfo withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     * 
     * @param currentGeneration
     *        Indicates whether the instance type is a current generation.
     */

    public void setCurrentGeneration(Boolean currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     * 
     * @return Indicates whether the instance type is a current generation.
     */

    public Boolean getCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     * 
     * @param currentGeneration
     *        Indicates whether the instance type is a current generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withCurrentGeneration(Boolean currentGeneration) {
        setCurrentGeneration(currentGeneration);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is a current generation.
     * </p>
     * 
     * @return Indicates whether the instance type is a current generation.
     */

    public Boolean isCurrentGeneration() {
        return this.currentGeneration;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     * 
     * @param freeTierEligible
     *        Indicates whether the instance type is eligible for the free tier.
     */

    public void setFreeTierEligible(Boolean freeTierEligible) {
        this.freeTierEligible = freeTierEligible;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     * 
     * @return Indicates whether the instance type is eligible for the free tier.
     */

    public Boolean getFreeTierEligible() {
        return this.freeTierEligible;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     * 
     * @param freeTierEligible
     *        Indicates whether the instance type is eligible for the free tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withFreeTierEligible(Boolean freeTierEligible) {
        setFreeTierEligible(freeTierEligible);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is eligible for the free tier.
     * </p>
     * 
     * @return Indicates whether the instance type is eligible for the free tier.
     */

    public Boolean isFreeTierEligible() {
        return this.freeTierEligible;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * 
     * @return Indicates whether the instance type is offered for spot or On-Demand.
     * @see UsageClassType
     */

    public java.util.List<String> getSupportedUsageClasses() {
        if (supportedUsageClasses == null) {
            supportedUsageClasses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedUsageClasses;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * 
     * @param supportedUsageClasses
     *        Indicates whether the instance type is offered for spot or On-Demand.
     * @see UsageClassType
     */

    public void setSupportedUsageClasses(java.util.Collection<String> supportedUsageClasses) {
        if (supportedUsageClasses == null) {
            this.supportedUsageClasses = null;
            return;
        }

        this.supportedUsageClasses = new com.amazonaws.internal.SdkInternalList<String>(supportedUsageClasses);
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedUsageClasses(java.util.Collection)} or
     * {@link #withSupportedUsageClasses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedUsageClasses
     *        Indicates whether the instance type is offered for spot or On-Demand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageClassType
     */

    public InstanceTypeInfo withSupportedUsageClasses(String... supportedUsageClasses) {
        if (this.supportedUsageClasses == null) {
            setSupportedUsageClasses(new com.amazonaws.internal.SdkInternalList<String>(supportedUsageClasses.length));
        }
        for (String ele : supportedUsageClasses) {
            this.supportedUsageClasses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * 
     * @param supportedUsageClasses
     *        Indicates whether the instance type is offered for spot or On-Demand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageClassType
     */

    public InstanceTypeInfo withSupportedUsageClasses(java.util.Collection<String> supportedUsageClasses) {
        setSupportedUsageClasses(supportedUsageClasses);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is offered for spot or On-Demand.
     * </p>
     * 
     * @param supportedUsageClasses
     *        Indicates whether the instance type is offered for spot or On-Demand.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageClassType
     */

    public InstanceTypeInfo withSupportedUsageClasses(UsageClassType... supportedUsageClasses) {
        com.amazonaws.internal.SdkInternalList<String> supportedUsageClassesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedUsageClasses.length);
        for (UsageClassType value : supportedUsageClasses) {
            supportedUsageClassesCopy.add(value.toString());
        }
        if (getSupportedUsageClasses() == null) {
            setSupportedUsageClasses(supportedUsageClassesCopy);
        } else {
            getSupportedUsageClasses().addAll(supportedUsageClassesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * 
     * @return Indicates the supported root device types.
     * @see RootDeviceType
     */

    public java.util.List<String> getSupportedRootDeviceTypes() {
        if (supportedRootDeviceTypes == null) {
            supportedRootDeviceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedRootDeviceTypes;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * 
     * @param supportedRootDeviceTypes
     *        Indicates the supported root device types.
     * @see RootDeviceType
     */

    public void setSupportedRootDeviceTypes(java.util.Collection<String> supportedRootDeviceTypes) {
        if (supportedRootDeviceTypes == null) {
            this.supportedRootDeviceTypes = null;
            return;
        }

        this.supportedRootDeviceTypes = new com.amazonaws.internal.SdkInternalList<String>(supportedRootDeviceTypes);
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedRootDeviceTypes(java.util.Collection)} or
     * {@link #withSupportedRootDeviceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedRootDeviceTypes
     *        Indicates the supported root device types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public InstanceTypeInfo withSupportedRootDeviceTypes(String... supportedRootDeviceTypes) {
        if (this.supportedRootDeviceTypes == null) {
            setSupportedRootDeviceTypes(new com.amazonaws.internal.SdkInternalList<String>(supportedRootDeviceTypes.length));
        }
        for (String ele : supportedRootDeviceTypes) {
            this.supportedRootDeviceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * 
     * @param supportedRootDeviceTypes
     *        Indicates the supported root device types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public InstanceTypeInfo withSupportedRootDeviceTypes(java.util.Collection<String> supportedRootDeviceTypes) {
        setSupportedRootDeviceTypes(supportedRootDeviceTypes);
        return this;
    }

    /**
     * <p>
     * Indicates the supported root device types.
     * </p>
     * 
     * @param supportedRootDeviceTypes
     *        Indicates the supported root device types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public InstanceTypeInfo withSupportedRootDeviceTypes(RootDeviceType... supportedRootDeviceTypes) {
        com.amazonaws.internal.SdkInternalList<String> supportedRootDeviceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                supportedRootDeviceTypes.length);
        for (RootDeviceType value : supportedRootDeviceTypes) {
            supportedRootDeviceTypesCopy.add(value.toString());
        }
        if (getSupportedRootDeviceTypes() == null) {
            setSupportedRootDeviceTypes(supportedRootDeviceTypesCopy);
        } else {
            getSupportedRootDeviceTypes().addAll(supportedRootDeviceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether the instance is bare metal.
     */

    public void setBareMetal(Boolean bareMetal) {
        this.bareMetal = bareMetal;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     * 
     * @return Indicates whether the instance is bare metal.
     */

    public Boolean getBareMetal() {
        return this.bareMetal;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether the instance is bare metal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withBareMetal(Boolean bareMetal) {
        setBareMetal(bareMetal);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is bare metal.
     * </p>
     * 
     * @return Indicates whether the instance is bare metal.
     */

    public Boolean isBareMetal() {
        return this.bareMetal;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * 
     * @param hypervisor
     *        Indicates the hypervisor used for the instance type.
     * @see InstanceTypeHypervisor
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * 
     * @return Indicates the hypervisor used for the instance type.
     * @see InstanceTypeHypervisor
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * 
     * @param hypervisor
     *        Indicates the hypervisor used for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceTypeHypervisor
     */

    public InstanceTypeInfo withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * Indicates the hypervisor used for the instance type.
     * </p>
     * 
     * @param hypervisor
     *        Indicates the hypervisor used for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceTypeHypervisor
     */

    public InstanceTypeInfo withHypervisor(InstanceTypeHypervisor hypervisor) {
        this.hypervisor = hypervisor.toString();
        return this;
    }

    /**
     * <p>
     * Describes the processor.
     * </p>
     * 
     * @param processorInfo
     *        Describes the processor.
     */

    public void setProcessorInfo(ProcessorInfo processorInfo) {
        this.processorInfo = processorInfo;
    }

    /**
     * <p>
     * Describes the processor.
     * </p>
     * 
     * @return Describes the processor.
     */

    public ProcessorInfo getProcessorInfo() {
        return this.processorInfo;
    }

    /**
     * <p>
     * Describes the processor.
     * </p>
     * 
     * @param processorInfo
     *        Describes the processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withProcessorInfo(ProcessorInfo processorInfo) {
        setProcessorInfo(processorInfo);
        return this;
    }

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     * 
     * @param vCpuInfo
     *        Describes the vCPU configurations for the instance type.
     */

    public void setVCpuInfo(VCpuInfo vCpuInfo) {
        this.vCpuInfo = vCpuInfo;
    }

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     * 
     * @return Describes the vCPU configurations for the instance type.
     */

    public VCpuInfo getVCpuInfo() {
        return this.vCpuInfo;
    }

    /**
     * <p>
     * Describes the vCPU configurations for the instance type.
     * </p>
     * 
     * @param vCpuInfo
     *        Describes the vCPU configurations for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withVCpuInfo(VCpuInfo vCpuInfo) {
        setVCpuInfo(vCpuInfo);
        return this;
    }

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     * 
     * @param memoryInfo
     *        Describes the memory for the instance type.
     */

    public void setMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     * 
     * @return Describes the memory for the instance type.
     */

    public MemoryInfo getMemoryInfo() {
        return this.memoryInfo;
    }

    /**
     * <p>
     * Describes the memory for the instance type.
     * </p>
     * 
     * @param memoryInfo
     *        Describes the memory for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withMemoryInfo(MemoryInfo memoryInfo) {
        setMemoryInfo(memoryInfo);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     * 
     * @param instanceStorageSupported
     *        Indicates whether instance storage is supported.
     */

    public void setInstanceStorageSupported(Boolean instanceStorageSupported) {
        this.instanceStorageSupported = instanceStorageSupported;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     * 
     * @return Indicates whether instance storage is supported.
     */

    public Boolean getInstanceStorageSupported() {
        return this.instanceStorageSupported;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     * 
     * @param instanceStorageSupported
     *        Indicates whether instance storage is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withInstanceStorageSupported(Boolean instanceStorageSupported) {
        setInstanceStorageSupported(instanceStorageSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance storage is supported.
     * </p>
     * 
     * @return Indicates whether instance storage is supported.
     */

    public Boolean isInstanceStorageSupported() {
        return this.instanceStorageSupported;
    }

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     * 
     * @param instanceStorageInfo
     *        Describes the disks for the instance type.
     */

    public void setInstanceStorageInfo(InstanceStorageInfo instanceStorageInfo) {
        this.instanceStorageInfo = instanceStorageInfo;
    }

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     * 
     * @return Describes the disks for the instance type.
     */

    public InstanceStorageInfo getInstanceStorageInfo() {
        return this.instanceStorageInfo;
    }

    /**
     * <p>
     * Describes the disks for the instance type.
     * </p>
     * 
     * @param instanceStorageInfo
     *        Describes the disks for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withInstanceStorageInfo(InstanceStorageInfo instanceStorageInfo) {
        setInstanceStorageInfo(instanceStorageInfo);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     * 
     * @param ebsInfo
     *        Describes the Amazon EBS settings for the instance type.
     */

    public void setEbsInfo(EbsInfo ebsInfo) {
        this.ebsInfo = ebsInfo;
    }

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     * 
     * @return Describes the Amazon EBS settings for the instance type.
     */

    public EbsInfo getEbsInfo() {
        return this.ebsInfo;
    }

    /**
     * <p>
     * Describes the Amazon EBS settings for the instance type.
     * </p>
     * 
     * @param ebsInfo
     *        Describes the Amazon EBS settings for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withEbsInfo(EbsInfo ebsInfo) {
        setEbsInfo(ebsInfo);
        return this;
    }

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     * 
     * @param networkInfo
     *        Describes the network settings for the instance type.
     */

    public void setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
    }

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     * 
     * @return Describes the network settings for the instance type.
     */

    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /**
     * <p>
     * Describes the network settings for the instance type.
     * </p>
     * 
     * @param networkInfo
     *        Describes the network settings for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withNetworkInfo(NetworkInfo networkInfo) {
        setNetworkInfo(networkInfo);
        return this;
    }

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     * 
     * @param gpuInfo
     *        Describes the GPU accelerator settings for the instance type.
     */

    public void setGpuInfo(GpuInfo gpuInfo) {
        this.gpuInfo = gpuInfo;
    }

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     * 
     * @return Describes the GPU accelerator settings for the instance type.
     */

    public GpuInfo getGpuInfo() {
        return this.gpuInfo;
    }

    /**
     * <p>
     * Describes the GPU accelerator settings for the instance type.
     * </p>
     * 
     * @param gpuInfo
     *        Describes the GPU accelerator settings for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withGpuInfo(GpuInfo gpuInfo) {
        setGpuInfo(gpuInfo);
        return this;
    }

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     * 
     * @param fpgaInfo
     *        Describes the FPGA accelerator settings for the instance type.
     */

    public void setFpgaInfo(FpgaInfo fpgaInfo) {
        this.fpgaInfo = fpgaInfo;
    }

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     * 
     * @return Describes the FPGA accelerator settings for the instance type.
     */

    public FpgaInfo getFpgaInfo() {
        return this.fpgaInfo;
    }

    /**
     * <p>
     * Describes the FPGA accelerator settings for the instance type.
     * </p>
     * 
     * @param fpgaInfo
     *        Describes the FPGA accelerator settings for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withFpgaInfo(FpgaInfo fpgaInfo) {
        setFpgaInfo(fpgaInfo);
        return this;
    }

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     * 
     * @param placementGroupInfo
     *        Describes the placement group settings for the instance type.
     */

    public void setPlacementGroupInfo(PlacementGroupInfo placementGroupInfo) {
        this.placementGroupInfo = placementGroupInfo;
    }

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     * 
     * @return Describes the placement group settings for the instance type.
     */

    public PlacementGroupInfo getPlacementGroupInfo() {
        return this.placementGroupInfo;
    }

    /**
     * <p>
     * Describes the placement group settings for the instance type.
     * </p>
     * 
     * @param placementGroupInfo
     *        Describes the placement group settings for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withPlacementGroupInfo(PlacementGroupInfo placementGroupInfo) {
        setPlacementGroupInfo(placementGroupInfo);
        return this;
    }

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     * 
     * @param inferenceAcceleratorInfo
     *        Describes the Inference accelerator settings for the instance type.
     */

    public void setInferenceAcceleratorInfo(InferenceAcceleratorInfo inferenceAcceleratorInfo) {
        this.inferenceAcceleratorInfo = inferenceAcceleratorInfo;
    }

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     * 
     * @return Describes the Inference accelerator settings for the instance type.
     */

    public InferenceAcceleratorInfo getInferenceAcceleratorInfo() {
        return this.inferenceAcceleratorInfo;
    }

    /**
     * <p>
     * Describes the Inference accelerator settings for the instance type.
     * </p>
     * 
     * @param inferenceAcceleratorInfo
     *        Describes the Inference accelerator settings for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withInferenceAcceleratorInfo(InferenceAcceleratorInfo inferenceAcceleratorInfo) {
        setInferenceAcceleratorInfo(inferenceAcceleratorInfo);
        return this;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     * 
     * @param hibernationSupported
     *        Indicates whether On-Demand hibernation is supported.
     */

    public void setHibernationSupported(Boolean hibernationSupported) {
        this.hibernationSupported = hibernationSupported;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     * 
     * @return Indicates whether On-Demand hibernation is supported.
     */

    public Boolean getHibernationSupported() {
        return this.hibernationSupported;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     * 
     * @param hibernationSupported
     *        Indicates whether On-Demand hibernation is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withHibernationSupported(Boolean hibernationSupported) {
        setHibernationSupported(hibernationSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether On-Demand hibernation is supported.
     * </p>
     * 
     * @return Indicates whether On-Demand hibernation is supported.
     */

    public Boolean isHibernationSupported() {
        return this.hibernationSupported;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance type.
     * </p>
     * 
     * @param burstablePerformanceSupported
     *        Indicates whether the instance type is a burstable performance instance type.
     */

    public void setBurstablePerformanceSupported(Boolean burstablePerformanceSupported) {
        this.burstablePerformanceSupported = burstablePerformanceSupported;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance type.
     * </p>
     * 
     * @return Indicates whether the instance type is a burstable performance instance type.
     */

    public Boolean getBurstablePerformanceSupported() {
        return this.burstablePerformanceSupported;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance type.
     * </p>
     * 
     * @param burstablePerformanceSupported
     *        Indicates whether the instance type is a burstable performance instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withBurstablePerformanceSupported(Boolean burstablePerformanceSupported) {
        setBurstablePerformanceSupported(burstablePerformanceSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance type is a burstable performance instance type.
     * </p>
     * 
     * @return Indicates whether the instance type is a burstable performance instance type.
     */

    public Boolean isBurstablePerformanceSupported() {
        return this.burstablePerformanceSupported;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     * 
     * @param dedicatedHostsSupported
     *        Indicates whether Dedicated Hosts are supported on the instance type.
     */

    public void setDedicatedHostsSupported(Boolean dedicatedHostsSupported) {
        this.dedicatedHostsSupported = dedicatedHostsSupported;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     * 
     * @return Indicates whether Dedicated Hosts are supported on the instance type.
     */

    public Boolean getDedicatedHostsSupported() {
        return this.dedicatedHostsSupported;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     * 
     * @param dedicatedHostsSupported
     *        Indicates whether Dedicated Hosts are supported on the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withDedicatedHostsSupported(Boolean dedicatedHostsSupported) {
        setDedicatedHostsSupported(dedicatedHostsSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether Dedicated Hosts are supported on the instance type.
     * </p>
     * 
     * @return Indicates whether Dedicated Hosts are supported on the instance type.
     */

    public Boolean isDedicatedHostsSupported() {
        return this.dedicatedHostsSupported;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     * 
     * @param autoRecoverySupported
     *        Indicates whether auto recovery is supported.
     */

    public void setAutoRecoverySupported(Boolean autoRecoverySupported) {
        this.autoRecoverySupported = autoRecoverySupported;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     * 
     * @return Indicates whether auto recovery is supported.
     */

    public Boolean getAutoRecoverySupported() {
        return this.autoRecoverySupported;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     * 
     * @param autoRecoverySupported
     *        Indicates whether auto recovery is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeInfo withAutoRecoverySupported(Boolean autoRecoverySupported) {
        setAutoRecoverySupported(autoRecoverySupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether auto recovery is supported.
     * </p>
     * 
     * @return Indicates whether auto recovery is supported.
     */

    public Boolean isAutoRecoverySupported() {
        return this.autoRecoverySupported;
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getCurrentGeneration() != null)
            sb.append("CurrentGeneration: ").append(getCurrentGeneration()).append(",");
        if (getFreeTierEligible() != null)
            sb.append("FreeTierEligible: ").append(getFreeTierEligible()).append(",");
        if (getSupportedUsageClasses() != null)
            sb.append("SupportedUsageClasses: ").append(getSupportedUsageClasses()).append(",");
        if (getSupportedRootDeviceTypes() != null)
            sb.append("SupportedRootDeviceTypes: ").append(getSupportedRootDeviceTypes()).append(",");
        if (getBareMetal() != null)
            sb.append("BareMetal: ").append(getBareMetal()).append(",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: ").append(getHypervisor()).append(",");
        if (getProcessorInfo() != null)
            sb.append("ProcessorInfo: ").append(getProcessorInfo()).append(",");
        if (getVCpuInfo() != null)
            sb.append("VCpuInfo: ").append(getVCpuInfo()).append(",");
        if (getMemoryInfo() != null)
            sb.append("MemoryInfo: ").append(getMemoryInfo()).append(",");
        if (getInstanceStorageSupported() != null)
            sb.append("InstanceStorageSupported: ").append(getInstanceStorageSupported()).append(",");
        if (getInstanceStorageInfo() != null)
            sb.append("InstanceStorageInfo: ").append(getInstanceStorageInfo()).append(",");
        if (getEbsInfo() != null)
            sb.append("EbsInfo: ").append(getEbsInfo()).append(",");
        if (getNetworkInfo() != null)
            sb.append("NetworkInfo: ").append(getNetworkInfo()).append(",");
        if (getGpuInfo() != null)
            sb.append("GpuInfo: ").append(getGpuInfo()).append(",");
        if (getFpgaInfo() != null)
            sb.append("FpgaInfo: ").append(getFpgaInfo()).append(",");
        if (getPlacementGroupInfo() != null)
            sb.append("PlacementGroupInfo: ").append(getPlacementGroupInfo()).append(",");
        if (getInferenceAcceleratorInfo() != null)
            sb.append("InferenceAcceleratorInfo: ").append(getInferenceAcceleratorInfo()).append(",");
        if (getHibernationSupported() != null)
            sb.append("HibernationSupported: ").append(getHibernationSupported()).append(",");
        if (getBurstablePerformanceSupported() != null)
            sb.append("BurstablePerformanceSupported: ").append(getBurstablePerformanceSupported()).append(",");
        if (getDedicatedHostsSupported() != null)
            sb.append("DedicatedHostsSupported: ").append(getDedicatedHostsSupported()).append(",");
        if (getAutoRecoverySupported() != null)
            sb.append("AutoRecoverySupported: ").append(getAutoRecoverySupported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeInfo == false)
            return false;
        InstanceTypeInfo other = (InstanceTypeInfo) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getCurrentGeneration() == null ^ this.getCurrentGeneration() == null)
            return false;
        if (other.getCurrentGeneration() != null && other.getCurrentGeneration().equals(this.getCurrentGeneration()) == false)
            return false;
        if (other.getFreeTierEligible() == null ^ this.getFreeTierEligible() == null)
            return false;
        if (other.getFreeTierEligible() != null && other.getFreeTierEligible().equals(this.getFreeTierEligible()) == false)
            return false;
        if (other.getSupportedUsageClasses() == null ^ this.getSupportedUsageClasses() == null)
            return false;
        if (other.getSupportedUsageClasses() != null && other.getSupportedUsageClasses().equals(this.getSupportedUsageClasses()) == false)
            return false;
        if (other.getSupportedRootDeviceTypes() == null ^ this.getSupportedRootDeviceTypes() == null)
            return false;
        if (other.getSupportedRootDeviceTypes() != null && other.getSupportedRootDeviceTypes().equals(this.getSupportedRootDeviceTypes()) == false)
            return false;
        if (other.getBareMetal() == null ^ this.getBareMetal() == null)
            return false;
        if (other.getBareMetal() != null && other.getBareMetal().equals(this.getBareMetal()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getProcessorInfo() == null ^ this.getProcessorInfo() == null)
            return false;
        if (other.getProcessorInfo() != null && other.getProcessorInfo().equals(this.getProcessorInfo()) == false)
            return false;
        if (other.getVCpuInfo() == null ^ this.getVCpuInfo() == null)
            return false;
        if (other.getVCpuInfo() != null && other.getVCpuInfo().equals(this.getVCpuInfo()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        if (other.getInstanceStorageSupported() == null ^ this.getInstanceStorageSupported() == null)
            return false;
        if (other.getInstanceStorageSupported() != null && other.getInstanceStorageSupported().equals(this.getInstanceStorageSupported()) == false)
            return false;
        if (other.getInstanceStorageInfo() == null ^ this.getInstanceStorageInfo() == null)
            return false;
        if (other.getInstanceStorageInfo() != null && other.getInstanceStorageInfo().equals(this.getInstanceStorageInfo()) == false)
            return false;
        if (other.getEbsInfo() == null ^ this.getEbsInfo() == null)
            return false;
        if (other.getEbsInfo() != null && other.getEbsInfo().equals(this.getEbsInfo()) == false)
            return false;
        if (other.getNetworkInfo() == null ^ this.getNetworkInfo() == null)
            return false;
        if (other.getNetworkInfo() != null && other.getNetworkInfo().equals(this.getNetworkInfo()) == false)
            return false;
        if (other.getGpuInfo() == null ^ this.getGpuInfo() == null)
            return false;
        if (other.getGpuInfo() != null && other.getGpuInfo().equals(this.getGpuInfo()) == false)
            return false;
        if (other.getFpgaInfo() == null ^ this.getFpgaInfo() == null)
            return false;
        if (other.getFpgaInfo() != null && other.getFpgaInfo().equals(this.getFpgaInfo()) == false)
            return false;
        if (other.getPlacementGroupInfo() == null ^ this.getPlacementGroupInfo() == null)
            return false;
        if (other.getPlacementGroupInfo() != null && other.getPlacementGroupInfo().equals(this.getPlacementGroupInfo()) == false)
            return false;
        if (other.getInferenceAcceleratorInfo() == null ^ this.getInferenceAcceleratorInfo() == null)
            return false;
        if (other.getInferenceAcceleratorInfo() != null && other.getInferenceAcceleratorInfo().equals(this.getInferenceAcceleratorInfo()) == false)
            return false;
        if (other.getHibernationSupported() == null ^ this.getHibernationSupported() == null)
            return false;
        if (other.getHibernationSupported() != null && other.getHibernationSupported().equals(this.getHibernationSupported()) == false)
            return false;
        if (other.getBurstablePerformanceSupported() == null ^ this.getBurstablePerformanceSupported() == null)
            return false;
        if (other.getBurstablePerformanceSupported() != null
                && other.getBurstablePerformanceSupported().equals(this.getBurstablePerformanceSupported()) == false)
            return false;
        if (other.getDedicatedHostsSupported() == null ^ this.getDedicatedHostsSupported() == null)
            return false;
        if (other.getDedicatedHostsSupported() != null && other.getDedicatedHostsSupported().equals(this.getDedicatedHostsSupported()) == false)
            return false;
        if (other.getAutoRecoverySupported() == null ^ this.getAutoRecoverySupported() == null)
            return false;
        if (other.getAutoRecoverySupported() != null && other.getAutoRecoverySupported().equals(this.getAutoRecoverySupported()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getCurrentGeneration() == null) ? 0 : getCurrentGeneration().hashCode());
        hashCode = prime * hashCode + ((getFreeTierEligible() == null) ? 0 : getFreeTierEligible().hashCode());
        hashCode = prime * hashCode + ((getSupportedUsageClasses() == null) ? 0 : getSupportedUsageClasses().hashCode());
        hashCode = prime * hashCode + ((getSupportedRootDeviceTypes() == null) ? 0 : getSupportedRootDeviceTypes().hashCode());
        hashCode = prime * hashCode + ((getBareMetal() == null) ? 0 : getBareMetal().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getProcessorInfo() == null) ? 0 : getProcessorInfo().hashCode());
        hashCode = prime * hashCode + ((getVCpuInfo() == null) ? 0 : getVCpuInfo().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        hashCode = prime * hashCode + ((getInstanceStorageSupported() == null) ? 0 : getInstanceStorageSupported().hashCode());
        hashCode = prime * hashCode + ((getInstanceStorageInfo() == null) ? 0 : getInstanceStorageInfo().hashCode());
        hashCode = prime * hashCode + ((getEbsInfo() == null) ? 0 : getEbsInfo().hashCode());
        hashCode = prime * hashCode + ((getNetworkInfo() == null) ? 0 : getNetworkInfo().hashCode());
        hashCode = prime * hashCode + ((getGpuInfo() == null) ? 0 : getGpuInfo().hashCode());
        hashCode = prime * hashCode + ((getFpgaInfo() == null) ? 0 : getFpgaInfo().hashCode());
        hashCode = prime * hashCode + ((getPlacementGroupInfo() == null) ? 0 : getPlacementGroupInfo().hashCode());
        hashCode = prime * hashCode + ((getInferenceAcceleratorInfo() == null) ? 0 : getInferenceAcceleratorInfo().hashCode());
        hashCode = prime * hashCode + ((getHibernationSupported() == null) ? 0 : getHibernationSupported().hashCode());
        hashCode = prime * hashCode + ((getBurstablePerformanceSupported() == null) ? 0 : getBurstablePerformanceSupported().hashCode());
        hashCode = prime * hashCode + ((getDedicatedHostsSupported() == null) ? 0 : getDedicatedHostsSupported().hashCode());
        hashCode = prime * hashCode + ((getAutoRecoverySupported() == null) ? 0 : getAutoRecoverySupported().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeInfo clone() {
        try {
            return (InstanceTypeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
