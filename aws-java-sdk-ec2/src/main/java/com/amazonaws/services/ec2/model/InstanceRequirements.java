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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will identify instance types
 * with these attributes.
 * </p>
 * <p>
 * When you specify multiple attributes, you get instance types that satisfy all of the specified attributes. If you
 * specify multiple values for an attribute, you get instance types that satisfy any of the specified values.
 * </p>
 * <p>
 * To limit the list of instance types from which Amazon EC2 can identify matching instance types, you can use one of
 * the following parameters, but not both in the same request:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>AllowedInstanceTypes</code> - The instance types to include in the list. All other instance types are ignored,
 * even if they match your specified attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ExcludedInstanceTypes</code> - The instance types to exclude from the list, even if they match your specified
 * attributes.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * You must specify <code>VCpuCount</code> and <code>MemoryMiB</code>. All other attributes are optional. Any
 * unspecified optional attribute is set to its default.
 * </p>
 * </note>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-attribute-based-instance-type-selection.html"
 * >Attribute-based instance type selection for EC2 Fleet</a>, <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-attribute-based-instance-type-selection.html"
 * >Attribute-based instance type selection for Spot Fleet</a>, and <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-placement-score.html">Spot placement score</a> in the
 * <i>Amazon EC2 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceRequirements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRequirements implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     */
    private VCpuCountRange vCpuCount;
    /**
     * <p>
     * The minimum and maximum amount of memory, in MiB.
     * </p>
     */
    private MemoryMiB memoryMiB;
    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU
     * architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cpuManufacturers;
    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private MemoryGiBPerVCpu memoryGiBPerVCpu;
    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all the M5a
     * instance types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: No excluded instance types
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludedInstanceTypes;
    /**
     * <p>
     * Indicates whether current or previous generation instance types are included. The current generation instance
     * types are recommended for use. Current generation instance types are typically the latest two to three
     * generations in each instance family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For current generation instance types, specify <code>current</code>.
     * </p>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * <p>
     * Default: Current and previous generation instance types
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceGenerations;
    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage above the least expensive current generation M, C, or R instance type with your specified
     * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above
     * your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>100</code>
     * </p>
     */
    private Integer spotMaxPricePercentageOverLowestPrice;
    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     * specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types
     * priced above your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>20</code>
     * </p>
     */
    private Integer onDemandMaxPricePercentageOverLowestPrice;
    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include bare metal instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only bare metal instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude bare metal instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     */
    private String bareMetal;
    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include burstable performance instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only burstable performance instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude burstable performance instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     */
    private String burstablePerformance;
    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean requireHibernateSupport;
    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private NetworkInterfaceCount networkInterfaceCount;
    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include instance types with instance store volumes, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only instance types with instance store volumes, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude instance types with instance store volumes, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>included</code>
     * </p>
     */
    private String localStorage;
    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>hdd</code> and <code>ssd</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> localStorageTypes;
    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private TotalLocalStorageGB totalLocalStorageGB;
    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private BaselineEbsBandwidthMbps baselineEbsBandwidthMbps;
    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> acceleratorTypes;
    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private AcceleratorCount acceleratorCount;
    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> acceleratorManufacturers;
    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> acceleratorNames;
    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private AcceleratorTotalMemoryMiB acceleratorTotalMemoryMiB;
    /**
     * <p>
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     */
    private NetworkBandwidthGbps networkBandwidthGbps;
    /**
     * <p>
     * The instance types to apply your specified attributes against. All other instance types are ignored, even if they
     * match your specified attributes.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which includes
     * all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the M5a instance
     * types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: All instance types
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allowedInstanceTypes;

    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     * 
     * @param vCpuCount
     *        The minimum and maximum number of vCPUs.
     */

    public void setVCpuCount(VCpuCountRange vCpuCount) {
        this.vCpuCount = vCpuCount;
    }

    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     * 
     * @return The minimum and maximum number of vCPUs.
     */

    public VCpuCountRange getVCpuCount() {
        return this.vCpuCount;
    }

    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     * 
     * @param vCpuCount
     *        The minimum and maximum number of vCPUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withVCpuCount(VCpuCountRange vCpuCount) {
        setVCpuCount(vCpuCount);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory, in MiB.
     * </p>
     * 
     * @param memoryMiB
     *        The minimum and maximum amount of memory, in MiB.
     */

    public void setMemoryMiB(MemoryMiB memoryMiB) {
        this.memoryMiB = memoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory, in MiB.
     * </p>
     * 
     * @return The minimum and maximum amount of memory, in MiB.
     */

    public MemoryMiB getMemoryMiB() {
        return this.memoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory, in MiB.
     * </p>
     * 
     * @param memoryMiB
     *        The minimum and maximum amount of memory, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withMemoryMiB(MemoryMiB memoryMiB) {
        setMemoryMiB(memoryMiB);
        return this;
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU
     * architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @return The CPU manufacturers to include.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with Intel CPUs, specify <code>intel</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with AMD CPUs, specify <code>amd</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a
     *         compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch
     *         template.
     *         </p>
     *         </note>
     *         <p>
     *         Default: Any manufacturer
     * @see CpuManufacturer
     */

    public java.util.List<String> getCpuManufacturers() {
        if (cpuManufacturers == null) {
            cpuManufacturers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cpuManufacturers;
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU
     * architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible
     *        CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @see CpuManufacturer
     */

    public void setCpuManufacturers(java.util.Collection<String> cpuManufacturers) {
        if (cpuManufacturers == null) {
            this.cpuManufacturers = null;
            return;
        }

        this.cpuManufacturers = new com.amazonaws.internal.SdkInternalList<String>(cpuManufacturers);
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU
     * architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpuManufacturers(java.util.Collection)} or {@link #withCpuManufacturers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible
     *        CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuManufacturer
     */

    public InstanceRequirements withCpuManufacturers(String... cpuManufacturers) {
        if (this.cpuManufacturers == null) {
            setCpuManufacturers(new com.amazonaws.internal.SdkInternalList<String>(cpuManufacturers.length));
        }
        for (String ele : cpuManufacturers) {
            this.cpuManufacturers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU
     * architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible
     *        CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuManufacturer
     */

    public InstanceRequirements withCpuManufacturers(java.util.Collection<String> cpuManufacturers) {
        setCpuManufacturers(cpuManufacturers);
        return this;
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible CPU
     * architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU manufacturer with the CPU architecture. Instances will be launched with a compatible
     *        CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuManufacturer
     */

    public InstanceRequirements withCpuManufacturers(CpuManufacturer... cpuManufacturers) {
        com.amazonaws.internal.SdkInternalList<String> cpuManufacturersCopy = new com.amazonaws.internal.SdkInternalList<String>(cpuManufacturers.length);
        for (CpuManufacturer value : cpuManufacturers) {
            cpuManufacturersCopy.add(value.toString());
        }
        if (getCpuManufacturers() == null) {
            setCpuManufacturers(cpuManufacturersCopy);
        } else {
            getCpuManufacturers().addAll(cpuManufacturersCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param memoryGiBPerVCpu
     *        The minimum and maximum amount of memory per vCPU, in GiB.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setMemoryGiBPerVCpu(MemoryGiBPerVCpu memoryGiBPerVCpu) {
        this.memoryGiBPerVCpu = memoryGiBPerVCpu;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum amount of memory per vCPU, in GiB.</p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public MemoryGiBPerVCpu getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param memoryGiBPerVCpu
     *        The minimum and maximum amount of memory per vCPU, in GiB.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withMemoryGiBPerVCpu(MemoryGiBPerVCpu memoryGiBPerVCpu) {
        setMemoryGiBPerVCpu(memoryGiBPerVCpu);
        return this;
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all the M5a
     * instance types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: No excluded instance types
     * </p>
     * 
     * @return The instance types to exclude.</p>
     *         <p>
     *         You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude
     *         an instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *         <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *         </p>
     *         <p>
     *         For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     *         includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all
     *         the M5a instance types, but not the M5n instance types.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: No excluded instance types
     */

    public java.util.List<String> getExcludedInstanceTypes() {
        if (excludedInstanceTypes == null) {
            excludedInstanceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedInstanceTypes;
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all the M5a
     * instance types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: No excluded instance types
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude.</p>
     *        <p>
     *        You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude
     *        an instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *        <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *        </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all
     *        the M5a instance types, but not the M5n instance types.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: No excluded instance types
     */

    public void setExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        if (excludedInstanceTypes == null) {
            this.excludedInstanceTypes = null;
            return;
        }

        this.excludedInstanceTypes = new com.amazonaws.internal.SdkInternalList<String>(excludedInstanceTypes);
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all the M5a
     * instance types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: No excluded instance types
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedInstanceTypes(java.util.Collection)} or
     * {@link #withExcludedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude.</p>
     *        <p>
     *        You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude
     *        an instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *        <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *        </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all
     *        the M5a instance types, but not the M5n instance types.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: No excluded instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withExcludedInstanceTypes(String... excludedInstanceTypes) {
        if (this.excludedInstanceTypes == null) {
            setExcludedInstanceTypes(new com.amazonaws.internal.SdkInternalList<String>(excludedInstanceTypes.length));
        }
        for (String ele : excludedInstanceTypes) {
            this.excludedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     * includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all the M5a
     * instance types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: No excluded instance types
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude.</p>
     *        <p>
     *        You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to exclude
     *        an instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *        <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *        </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>,Amazon EC2 will exclude the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will exclude all
     *        the M5a instance types, but not the M5n instance types.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>ExcludedInstanceTypes</code>, you can't specify <code>AllowedInstanceTypes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: No excluded instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        setExcludedInstanceTypes(excludedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included. The current generation instance
     * types are recommended for use. Current generation instance types are typically the latest two to three
     * generations in each instance family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For current generation instance types, specify <code>current</code>.
     * </p>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * <p>
     * Default: Current and previous generation instance types
     * </p>
     * 
     * @return Indicates whether current or previous generation instance types are included. The current generation
     *         instance types are recommended for use. Current generation instance types are typically the latest two to
     *         three generations in each instance family. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *         <i>Amazon EC2 User Guide</i>.</p>
     *         <p>
     *         For current generation instance types, specify <code>current</code>.
     *         </p>
     *         <p>
     *         For previous generation instance types, specify <code>previous</code>.
     *         </p>
     *         <p>
     *         Default: Current and previous generation instance types
     * @see InstanceGeneration
     */

    public java.util.List<String> getInstanceGenerations() {
        if (instanceGenerations == null) {
            instanceGenerations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceGenerations;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included. The current generation instance
     * types are recommended for use. Current generation instance types are typically the latest two to three
     * generations in each instance family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For current generation instance types, specify <code>current</code>.
     * </p>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * <p>
     * Default: Current and previous generation instance types
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included. The current generation
     *        instance types are recommended for use. Current generation instance types are typically the latest two to
     *        three generations in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        For current generation instance types, specify <code>current</code>.
     *        </p>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        <p>
     *        Default: Current and previous generation instance types
     * @see InstanceGeneration
     */

    public void setInstanceGenerations(java.util.Collection<String> instanceGenerations) {
        if (instanceGenerations == null) {
            this.instanceGenerations = null;
            return;
        }

        this.instanceGenerations = new com.amazonaws.internal.SdkInternalList<String>(instanceGenerations);
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included. The current generation instance
     * types are recommended for use. Current generation instance types are typically the latest two to three
     * generations in each instance family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For current generation instance types, specify <code>current</code>.
     * </p>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * <p>
     * Default: Current and previous generation instance types
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGenerations(java.util.Collection)} or {@link #withInstanceGenerations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included. The current generation
     *        instance types are recommended for use. Current generation instance types are typically the latest two to
     *        three generations in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        For current generation instance types, specify <code>current</code>.
     *        </p>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        <p>
     *        Default: Current and previous generation instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGeneration
     */

    public InstanceRequirements withInstanceGenerations(String... instanceGenerations) {
        if (this.instanceGenerations == null) {
            setInstanceGenerations(new com.amazonaws.internal.SdkInternalList<String>(instanceGenerations.length));
        }
        for (String ele : instanceGenerations) {
            this.instanceGenerations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included. The current generation instance
     * types are recommended for use. Current generation instance types are typically the latest two to three
     * generations in each instance family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For current generation instance types, specify <code>current</code>.
     * </p>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * <p>
     * Default: Current and previous generation instance types
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included. The current generation
     *        instance types are recommended for use. Current generation instance types are typically the latest two to
     *        three generations in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        For current generation instance types, specify <code>current</code>.
     *        </p>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        <p>
     *        Default: Current and previous generation instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGeneration
     */

    public InstanceRequirements withInstanceGenerations(java.util.Collection<String> instanceGenerations) {
        setInstanceGenerations(instanceGenerations);
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included. The current generation instance
     * types are recommended for use. Current generation instance types are typically the latest two to three
     * generations in each instance family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * For current generation instance types, specify <code>current</code>.
     * </p>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * <p>
     * Default: Current and previous generation instance types
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included. The current generation
     *        instance types are recommended for use. Current generation instance types are typically the latest two to
     *        three generations in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        For current generation instance types, specify <code>current</code>.
     *        </p>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        <p>
     *        Default: Current and previous generation instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGeneration
     */

    public InstanceRequirements withInstanceGenerations(InstanceGeneration... instanceGenerations) {
        com.amazonaws.internal.SdkInternalList<String> instanceGenerationsCopy = new com.amazonaws.internal.SdkInternalList<String>(instanceGenerations.length);
        for (InstanceGeneration value : instanceGenerations) {
            instanceGenerationsCopy.add(value.toString());
        }
        if (getInstanceGenerations() == null) {
            setInstanceGenerations(instanceGenerationsCopy);
        } else {
            getInstanceGenerations().addAll(instanceGenerationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage above the least expensive current generation M, C, or R instance type with your specified
     * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above
     * your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param spotMaxPricePercentageOverLowestPrice
     *        The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *        expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     *        specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     *        types priced above your threshold.</p>
     *        <p>
     *        The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *        </p>
     *        <p>
     *        To turn off price protection, specify a high value, such as <code>999999</code>.
     *        </p>
     *        <p>
     *        This parameter is not supported for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *        >GetSpotPlacementScores</a> and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     *        >GetInstanceTypesFromInstanceRequirements</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     *        protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     *        price.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>100</code>
     */

    public void setSpotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
        this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage above the least expensive current generation M, C, or R instance type with your specified
     * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above
     * your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @return The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *         expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     *         specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     *         types priced above your threshold.</p>
     *         <p>
     *         The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *         </p>
     *         <p>
     *         To turn off price protection, specify a high value, such as <code>999999</code>.
     *         </p>
     *         <p>
     *         This parameter is not supported for <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *         >GetSpotPlacementScores</a> and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     *         >GetInstanceTypesFromInstanceRequirements</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     *         protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     *         price.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>100</code>
     */

    public Integer getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage above the least expensive current generation M, C, or R instance type with your specified
     * attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types priced above
     * your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param spotMaxPricePercentageOverLowestPrice
     *        The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *        expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     *        specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     *        types priced above your threshold.</p>
     *        <p>
     *        The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *        </p>
     *        <p>
     *        To turn off price protection, specify a high value, such as <code>999999</code>.
     *        </p>
     *        <p>
     *        This parameter is not supported for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *        >GetSpotPlacementScores</a> and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     *        >GetInstanceTypesFromInstanceRequirements</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     *        protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     *        price.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withSpotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
        setSpotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice);
        return this;
    }

    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     * specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types
     * priced above your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @param onDemandMaxPricePercentageOverLowestPrice
     *        The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand
     *        Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type
     *        with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes
     *        instance types priced above your threshold.</p>
     *        <p>
     *        The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *        </p>
     *        <p>
     *        To turn off price protection, specify a high value, such as <code>999999</code>.
     *        </p>
     *        <p>
     *        This parameter is not supported for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *        >GetSpotPlacementScores</a> and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     *        >GetInstanceTypesFromInstanceRequirements</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     *        protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     *        price.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>20</code>
     */

    public void setOnDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
        this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     * specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types
     * priced above your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @return The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand
     *         Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type
     *         with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes
     *         instance types priced above your threshold.</p>
     *         <p>
     *         The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *         </p>
     *         <p>
     *         To turn off price protection, specify a high value, such as <code>999999</code>.
     *         </p>
     *         <p>
     *         This parameter is not supported for <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *         >GetSpotPlacementScores</a> and <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     *         >GetInstanceTypesFromInstanceRequirements</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     *         protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     *         price.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>20</code>
     */

    public Integer getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     * specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance types
     * priced above your threshold.
     * </p>
     * <p>
     * The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     * </p>
     * <p>
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     * >GetInstanceTypesFromInstanceRequirements</a>.
     * </p>
     * <note>
     * <p>
     * If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     * protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance price.
     * </p>
     * </note>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @param onDemandMaxPricePercentageOverLowestPrice
     *        The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand
     *        Instance, expressed as a percentage above the least expensive current generation M, C, or R instance type
     *        with your specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes
     *        instance types priced above your threshold.</p>
     *        <p>
     *        The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *        </p>
     *        <p>
     *        To turn off price protection, specify a high value, such as <code>999999</code>.
     *        </p>
     *        <p>
     *        This parameter is not supported for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *        >GetSpotPlacementScores</a> and <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetInstanceTypesFromInstanceRequirements.html"
     *        >GetInstanceTypesFromInstanceRequirements</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you set <code>TargetCapacityUnitType</code> to <code>vcpu</code> or <code>memory-mib</code>, the price
     *        protection threshold is applied based on the per-vCPU or per-memory price instead of the per-instance
     *        price.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>20</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withOnDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
        setOnDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice);
        return this;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include bare metal instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only bare metal instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude bare metal instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types must be included, excluded, or required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include bare metal instance types, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only bare metal instance types, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude bare metal instance types, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>excluded</code>
     * @see BareMetal
     */

    public void setBareMetal(String bareMetal) {
        this.bareMetal = bareMetal;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include bare metal instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only bare metal instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude bare metal instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @return Indicates whether bare metal instance types must be included, excluded, or required.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To include bare metal instance types, specify <code>included</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To require only bare metal instance types, specify <code>required</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To exclude bare metal instance types, specify <code>excluded</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>excluded</code>
     * @see BareMetal
     */

    public String getBareMetal() {
        return this.bareMetal;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include bare metal instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only bare metal instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude bare metal instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types must be included, excluded, or required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include bare metal instance types, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only bare metal instance types, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude bare metal instance types, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BareMetal
     */

    public InstanceRequirements withBareMetal(String bareMetal) {
        setBareMetal(bareMetal);
        return this;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include bare metal instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only bare metal instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude bare metal instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types must be included, excluded, or required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include bare metal instance types, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only bare metal instance types, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude bare metal instance types, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BareMetal
     */

    public InstanceRequirements withBareMetal(BareMetal bareMetal) {
        this.bareMetal = bareMetal.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include burstable performance instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only burstable performance instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude burstable performance instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include burstable performance instance types, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only burstable performance instance types, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude burstable performance instance types, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>excluded</code>
     * @see BurstablePerformance
     */

    public void setBurstablePerformance(String burstablePerformance) {
        this.burstablePerformance = burstablePerformance;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include burstable performance instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only burstable performance instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude burstable performance instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @return Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *         performance instances</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To include burstable performance instance types, specify <code>included</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To require only burstable performance instance types, specify <code>required</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To exclude burstable performance instance types, specify <code>excluded</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>excluded</code>
     * @see BurstablePerformance
     */

    public String getBurstablePerformance() {
        return this.burstablePerformance;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include burstable performance instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only burstable performance instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude burstable performance instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include burstable performance instance types, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only burstable performance instance types, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude burstable performance instance types, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurstablePerformance
     */

    public InstanceRequirements withBurstablePerformance(String burstablePerformance) {
        setBurstablePerformance(burstablePerformance);
        return this;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include burstable performance instance types, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only burstable performance instance types, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude burstable performance instance types, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include burstable performance instance types, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only burstable performance instance types, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude burstable performance instance types, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurstablePerformance
     */

    public InstanceRequirements withBurstablePerformance(BurstablePerformance burstablePerformance) {
        this.burstablePerformance = burstablePerformance.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param requireHibernateSupport
     *        Indicates whether instance types must support hibernation for On-Demand Instances.</p>
     *        <p>
     *        This parameter is not supported for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *        >GetSpotPlacementScores</a>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setRequireHibernateSupport(Boolean requireHibernateSupport) {
        this.requireHibernateSupport = requireHibernateSupport;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether instance types must support hibernation for On-Demand Instances.</p>
     *         <p>
     *         This parameter is not supported for <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *         >GetSpotPlacementScores</a>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getRequireHibernateSupport() {
        return this.requireHibernateSupport;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param requireHibernateSupport
     *        Indicates whether instance types must support hibernation for On-Demand Instances.</p>
     *        <p>
     *        This parameter is not supported for <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *        >GetSpotPlacementScores</a>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withRequireHibernateSupport(Boolean requireHibernateSupport) {
        setRequireHibernateSupport(requireHibernateSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * <p>
     * This parameter is not supported for <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     * >GetSpotPlacementScores</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether instance types must support hibernation for On-Demand Instances.</p>
     *         <p>
     *         This parameter is not supported for <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetSpotPlacementScores.html"
     *         >GetSpotPlacementScores</a>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isRequireHibernateSupport() {
        return this.requireHibernateSupport;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param networkInterfaceCount
     *        The minimum and maximum number of network interfaces.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setNetworkInterfaceCount(NetworkInterfaceCount networkInterfaceCount) {
        this.networkInterfaceCount = networkInterfaceCount;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum number of network interfaces.</p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public NetworkInterfaceCount getNetworkInterfaceCount() {
        return this.networkInterfaceCount;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param networkInterfaceCount
     *        The minimum and maximum number of network interfaces.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withNetworkInterfaceCount(NetworkInterfaceCount networkInterfaceCount) {
        setNetworkInterfaceCount(networkInterfaceCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include instance types with instance store volumes, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only instance types with instance store volumes, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude instance types with instance store volumes, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     *        instance store</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include instance types with instance store volumes, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only instance types with instance store volumes, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude instance types with instance store volumes, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>included</code>
     * @see LocalStorage
     */

    public void setLocalStorage(String localStorage) {
        this.localStorage = localStorage;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include instance types with instance store volumes, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only instance types with instance store volumes, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude instance types with instance store volumes, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @return Indicates whether instance types with instance store volumes are included, excluded, or required. For
     *         more information, <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *         store</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To include instance types with instance store volumes, specify <code>included</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To require only instance types with instance store volumes, specify <code>required</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To exclude instance types with instance store volumes, specify <code>excluded</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>included</code>
     * @see LocalStorage
     */

    public String getLocalStorage() {
        return this.localStorage;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include instance types with instance store volumes, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only instance types with instance store volumes, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude instance types with instance store volumes, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     *        instance store</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include instance types with instance store volumes, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only instance types with instance store volumes, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude instance types with instance store volumes, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>included</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorage
     */

    public InstanceRequirements withLocalStorage(String localStorage) {
        setLocalStorage(localStorage);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * To include instance types with instance store volumes, specify <code>included</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To require only instance types with instance store volumes, specify <code>required</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * To exclude instance types with instance store volumes, specify <code>excluded</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     *        instance store</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To include instance types with instance store volumes, specify <code>included</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To require only instance types with instance store volumes, specify <code>required</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To exclude instance types with instance store volumes, specify <code>excluded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>included</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorage
     */

    public InstanceRequirements withLocalStorage(LocalStorage localStorage) {
        this.localStorage = localStorage.toString();
        return this;
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>hdd</code> and <code>ssd</code>
     * </p>
     * 
     * @return The type of local storage that is required.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>hdd</code> and <code>ssd</code>
     * @see LocalStorageType
     */

    public java.util.List<String> getLocalStorageTypes() {
        if (localStorageTypes == null) {
            localStorageTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return localStorageTypes;
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>hdd</code> and <code>ssd</code>
     * </p>
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>hdd</code> and <code>ssd</code>
     * @see LocalStorageType
     */

    public void setLocalStorageTypes(java.util.Collection<String> localStorageTypes) {
        if (localStorageTypes == null) {
            this.localStorageTypes = null;
            return;
        }

        this.localStorageTypes = new com.amazonaws.internal.SdkInternalList<String>(localStorageTypes);
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>hdd</code> and <code>ssd</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalStorageTypes(java.util.Collection)} or {@link #withLocalStorageTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>hdd</code> and <code>ssd</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorageType
     */

    public InstanceRequirements withLocalStorageTypes(String... localStorageTypes) {
        if (this.localStorageTypes == null) {
            setLocalStorageTypes(new com.amazonaws.internal.SdkInternalList<String>(localStorageTypes.length));
        }
        for (String ele : localStorageTypes) {
            this.localStorageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>hdd</code> and <code>ssd</code>
     * </p>
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>hdd</code> and <code>ssd</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorageType
     */

    public InstanceRequirements withLocalStorageTypes(java.util.Collection<String> localStorageTypes) {
        setLocalStorageTypes(localStorageTypes);
        return this;
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>hdd</code> and <code>ssd</code>
     * </p>
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>ssd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>hdd</code> and <code>ssd</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorageType
     */

    public InstanceRequirements withLocalStorageTypes(LocalStorageType... localStorageTypes) {
        com.amazonaws.internal.SdkInternalList<String> localStorageTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(localStorageTypes.length);
        for (LocalStorageType value : localStorageTypes) {
            localStorageTypesCopy.add(value.toString());
        }
        if (getLocalStorageTypes() == null) {
            setLocalStorageTypes(localStorageTypesCopy);
        } else {
            getLocalStorageTypes().addAll(localStorageTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param totalLocalStorageGB
     *        The minimum and maximum amount of total local storage, in GB.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setTotalLocalStorageGB(TotalLocalStorageGB totalLocalStorageGB) {
        this.totalLocalStorageGB = totalLocalStorageGB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum amount of total local storage, in GB.</p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public TotalLocalStorageGB getTotalLocalStorageGB() {
        return this.totalLocalStorageGB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param totalLocalStorageGB
     *        The minimum and maximum amount of total local storage, in GB.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withTotalLocalStorageGB(TotalLocalStorageGB totalLocalStorageGB) {
        setTotalLocalStorageGB(totalLocalStorageGB);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param baselineEbsBandwidthMbps
     *        The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     *        instances</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbps baselineEbsBandwidthMbps) {
        this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     *         instances</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public BaselineEbsBandwidthMbps getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param baselineEbsBandwidthMbps
     *        The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     *        instances</a> in the <i>Amazon EC2 User Guide</i>.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbps baselineEbsBandwidthMbps) {
        setBaselineEbsBandwidthMbps(baselineEbsBandwidthMbps);
        return this;
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @return The accelerator types that must be on the instance type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with GPU accelerators, specify <code>gpu</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with FPGA accelerators, specify <code>fpga</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with inference accelerators, specify <code>inference</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any accelerator type
     * @see AcceleratorType
     */

    public java.util.List<String> getAcceleratorTypes() {
        if (acceleratorTypes == null) {
            acceleratorTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return acceleratorTypes;
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @see AcceleratorType
     */

    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new com.amazonaws.internal.SdkInternalList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public InstanceRequirements withAcceleratorTypes(String... acceleratorTypes) {
        if (this.acceleratorTypes == null) {
            setAcceleratorTypes(new com.amazonaws.internal.SdkInternalList<String>(acceleratorTypes.length));
        }
        for (String ele : acceleratorTypes) {
            this.acceleratorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public InstanceRequirements withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public InstanceRequirements withAcceleratorTypes(AcceleratorType... acceleratorTypes) {
        com.amazonaws.internal.SdkInternalList<String> acceleratorTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(acceleratorTypes.length);
        for (AcceleratorType value : acceleratorTypes) {
            acceleratorTypesCopy.add(value.toString());
        }
        if (getAcceleratorTypes() == null) {
            setAcceleratorTypes(acceleratorTypesCopy);
        } else {
            getAcceleratorTypes().addAll(acceleratorTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param acceleratorCount
     *        The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     *        an instance.</p>
     *        <p>
     *        To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     *        </p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setAcceleratorCount(AcceleratorCount acceleratorCount) {
        this.acceleratorCount = acceleratorCount;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     *         an instance.</p>
     *         <p>
     *         To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     *         </p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public AcceleratorCount getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param acceleratorCount
     *        The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     *        an instance.</p>
     *        <p>
     *        To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     *        </p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withAcceleratorCount(AcceleratorCount acceleratorCount) {
        setAcceleratorCount(acceleratorCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @return Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with AMD devices, specify <code>amd</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Xilinx devices, specify <code>xilinx</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any manufacturer
     * @see AcceleratorManufacturer
     */

    public java.util.List<String> getAcceleratorManufacturers() {
        if (acceleratorManufacturers == null) {
            acceleratorManufacturers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return acceleratorManufacturers;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @see AcceleratorManufacturer
     */

    public void setAcceleratorManufacturers(java.util.Collection<String> acceleratorManufacturers) {
        if (acceleratorManufacturers == null) {
            this.acceleratorManufacturers = null;
            return;
        }

        this.acceleratorManufacturers = new com.amazonaws.internal.SdkInternalList<String>(acceleratorManufacturers);
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorManufacturers(java.util.Collection)} or
     * {@link #withAcceleratorManufacturers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorManufacturer
     */

    public InstanceRequirements withAcceleratorManufacturers(String... acceleratorManufacturers) {
        if (this.acceleratorManufacturers == null) {
            setAcceleratorManufacturers(new com.amazonaws.internal.SdkInternalList<String>(acceleratorManufacturers.length));
        }
        for (String ele : acceleratorManufacturers) {
            this.acceleratorManufacturers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorManufacturer
     */

    public InstanceRequirements withAcceleratorManufacturers(java.util.Collection<String> acceleratorManufacturers) {
        setAcceleratorManufacturers(acceleratorManufacturers);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorManufacturer
     */

    public InstanceRequirements withAcceleratorManufacturers(AcceleratorManufacturer... acceleratorManufacturers) {
        com.amazonaws.internal.SdkInternalList<String> acceleratorManufacturersCopy = new com.amazonaws.internal.SdkInternalList<String>(
                acceleratorManufacturers.length);
        for (AcceleratorManufacturer value : acceleratorManufacturers) {
            acceleratorManufacturersCopy.add(value.toString());
        }
        if (getAcceleratorManufacturers() == null) {
            setAcceleratorManufacturers(acceleratorManufacturersCopy);
        } else {
            getAcceleratorManufacturers().addAll(acceleratorManufacturersCopy);
        }
        return this;
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @return The accelerators that must be on the instance type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any accelerator
     * @see AcceleratorName
     */

    public java.util.List<String> getAcceleratorNames() {
        if (acceleratorNames == null) {
            acceleratorNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return acceleratorNames;
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @see AcceleratorName
     */

    public void setAcceleratorNames(java.util.Collection<String> acceleratorNames) {
        if (acceleratorNames == null) {
            this.acceleratorNames = null;
            return;
        }

        this.acceleratorNames = new com.amazonaws.internal.SdkInternalList<String>(acceleratorNames);
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorNames(java.util.Collection)} or {@link #withAcceleratorNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorName
     */

    public InstanceRequirements withAcceleratorNames(String... acceleratorNames) {
        if (this.acceleratorNames == null) {
            setAcceleratorNames(new com.amazonaws.internal.SdkInternalList<String>(acceleratorNames.length));
        }
        for (String ele : acceleratorNames) {
            this.acceleratorNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorName
     */

    public InstanceRequirements withAcceleratorNames(java.util.Collection<String> acceleratorNames) {
        setAcceleratorNames(acceleratorNames);
        return this;
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services Inferentia chips, specify <code>inferentia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA GRID K520 GPUs, specify <code>k520</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorName
     */

    public InstanceRequirements withAcceleratorNames(AcceleratorName... acceleratorNames) {
        com.amazonaws.internal.SdkInternalList<String> acceleratorNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(acceleratorNames.length);
        for (AcceleratorName value : acceleratorNames) {
            acceleratorNamesCopy.add(value.toString());
        }
        if (getAcceleratorNames() == null) {
            setAcceleratorNames(acceleratorNamesCopy);
        } else {
            getAcceleratorNames().addAll(acceleratorNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The minimum and maximum amount of total accelerator memory, in MiB.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiB acceleratorTotalMemoryMiB) {
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum amount of total accelerator memory, in MiB.</p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public AcceleratorTotalMemoryMiB getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The minimum and maximum amount of total accelerator memory, in MiB.</p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiB acceleratorTotalMemoryMiB) {
        setAcceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param networkBandwidthGbps
     *        The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).</p>
     *        <p>
     *        Default: No minimum or maximum limits
     */

    public void setNetworkBandwidthGbps(NetworkBandwidthGbps networkBandwidthGbps) {
        this.networkBandwidthGbps = networkBandwidthGbps;
    }

    /**
     * <p>
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @return The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).</p>
     *         <p>
     *         Default: No minimum or maximum limits
     */

    public NetworkBandwidthGbps getNetworkBandwidthGbps() {
        return this.networkBandwidthGbps;
    }

    /**
     * <p>
     * The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).
     * </p>
     * <p>
     * Default: No minimum or maximum limits
     * </p>
     * 
     * @param networkBandwidthGbps
     *        The minimum and maximum amount of network bandwidth, in gigabits per second (Gbps).</p>
     *        <p>
     *        Default: No minimum or maximum limits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withNetworkBandwidthGbps(NetworkBandwidthGbps networkBandwidthGbps) {
        setNetworkBandwidthGbps(networkBandwidthGbps);
        return this;
    }

    /**
     * <p>
     * The instance types to apply your specified attributes against. All other instance types are ignored, even if they
     * match your specified attributes.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which includes
     * all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the M5a instance
     * types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: All instance types
     * </p>
     * 
     * @return The instance types to apply your specified attributes against. All other instance types are ignored, even
     *         if they match your specified attributes.</p>
     *         <p>
     *         You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     *         instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *         <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *         </p>
     *         <p>
     *         For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which
     *         includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the
     *         M5a instance types, but not the M5n instance types.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: All instance types
     */

    public java.util.List<String> getAllowedInstanceTypes() {
        if (allowedInstanceTypes == null) {
            allowedInstanceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allowedInstanceTypes;
    }

    /**
     * <p>
     * The instance types to apply your specified attributes against. All other instance types are ignored, even if they
     * match your specified attributes.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which includes
     * all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the M5a instance
     * types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: All instance types
     * </p>
     * 
     * @param allowedInstanceTypes
     *        The instance types to apply your specified attributes against. All other instance types are ignored, even
     *        if they match your specified attributes.</p>
     *        <p>
     *        You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     *        instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *        <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *        </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the
     *        M5a instance types, but not the M5n instance types.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: All instance types
     */

    public void setAllowedInstanceTypes(java.util.Collection<String> allowedInstanceTypes) {
        if (allowedInstanceTypes == null) {
            this.allowedInstanceTypes = null;
            return;
        }

        this.allowedInstanceTypes = new com.amazonaws.internal.SdkInternalList<String>(allowedInstanceTypes);
    }

    /**
     * <p>
     * The instance types to apply your specified attributes against. All other instance types are ignored, even if they
     * match your specified attributes.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which includes
     * all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the M5a instance
     * types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: All instance types
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedInstanceTypes(java.util.Collection)} or {@link #withAllowedInstanceTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedInstanceTypes
     *        The instance types to apply your specified attributes against. All other instance types are ignored, even
     *        if they match your specified attributes.</p>
     *        <p>
     *        You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     *        instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *        <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *        </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the
     *        M5a instance types, but not the M5n instance types.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: All instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withAllowedInstanceTypes(String... allowedInstanceTypes) {
        if (this.allowedInstanceTypes == null) {
            setAllowedInstanceTypes(new com.amazonaws.internal.SdkInternalList<String>(allowedInstanceTypes.length));
        }
        for (String ele : allowedInstanceTypes) {
            this.allowedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types to apply your specified attributes against. All other instance types are ignored, even if they
     * match your specified attributes.
     * </p>
     * <p>
     * You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     * instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>, <code>c5*.*</code>,
     * <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which includes
     * all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the M5a instance
     * types, but not the M5n instance types.
     * </p>
     * <note>
     * <p>
     * If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     * </p>
     * </note>
     * <p>
     * Default: All instance types
     * </p>
     * 
     * @param allowedInstanceTypes
     *        The instance types to apply your specified attributes against. All other instance types are ignored, even
     *        if they match your specified attributes.</p>
     *        <p>
     *        You can use strings with one or more wild cards, represented by an asterisk (<code>*</code>), to allow an
     *        instance type, size, or generation. The following are examples: <code>m5.8xlarge</code>,
     *        <code>c5*.*</code>, <code>m5a.*</code>, <code>r*</code>, <code>*3*</code>.
     *        </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>,Amazon EC2 will allow the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, Amazon EC2 will allow all the
     *        M5a instance types, but not the M5n instance types.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>AllowedInstanceTypes</code>, you can't specify <code>ExcludedInstanceTypes</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: All instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withAllowedInstanceTypes(java.util.Collection<String> allowedInstanceTypes) {
        setAllowedInstanceTypes(allowedInstanceTypes);
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
        if (getVCpuCount() != null)
            sb.append("VCpuCount: ").append(getVCpuCount()).append(",");
        if (getMemoryMiB() != null)
            sb.append("MemoryMiB: ").append(getMemoryMiB()).append(",");
        if (getCpuManufacturers() != null)
            sb.append("CpuManufacturers: ").append(getCpuManufacturers()).append(",");
        if (getMemoryGiBPerVCpu() != null)
            sb.append("MemoryGiBPerVCpu: ").append(getMemoryGiBPerVCpu()).append(",");
        if (getExcludedInstanceTypes() != null)
            sb.append("ExcludedInstanceTypes: ").append(getExcludedInstanceTypes()).append(",");
        if (getInstanceGenerations() != null)
            sb.append("InstanceGenerations: ").append(getInstanceGenerations()).append(",");
        if (getSpotMaxPricePercentageOverLowestPrice() != null)
            sb.append("SpotMaxPricePercentageOverLowestPrice: ").append(getSpotMaxPricePercentageOverLowestPrice()).append(",");
        if (getOnDemandMaxPricePercentageOverLowestPrice() != null)
            sb.append("OnDemandMaxPricePercentageOverLowestPrice: ").append(getOnDemandMaxPricePercentageOverLowestPrice()).append(",");
        if (getBareMetal() != null)
            sb.append("BareMetal: ").append(getBareMetal()).append(",");
        if (getBurstablePerformance() != null)
            sb.append("BurstablePerformance: ").append(getBurstablePerformance()).append(",");
        if (getRequireHibernateSupport() != null)
            sb.append("RequireHibernateSupport: ").append(getRequireHibernateSupport()).append(",");
        if (getNetworkInterfaceCount() != null)
            sb.append("NetworkInterfaceCount: ").append(getNetworkInterfaceCount()).append(",");
        if (getLocalStorage() != null)
            sb.append("LocalStorage: ").append(getLocalStorage()).append(",");
        if (getLocalStorageTypes() != null)
            sb.append("LocalStorageTypes: ").append(getLocalStorageTypes()).append(",");
        if (getTotalLocalStorageGB() != null)
            sb.append("TotalLocalStorageGB: ").append(getTotalLocalStorageGB()).append(",");
        if (getBaselineEbsBandwidthMbps() != null)
            sb.append("BaselineEbsBandwidthMbps: ").append(getBaselineEbsBandwidthMbps()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getAcceleratorCount() != null)
            sb.append("AcceleratorCount: ").append(getAcceleratorCount()).append(",");
        if (getAcceleratorManufacturers() != null)
            sb.append("AcceleratorManufacturers: ").append(getAcceleratorManufacturers()).append(",");
        if (getAcceleratorNames() != null)
            sb.append("AcceleratorNames: ").append(getAcceleratorNames()).append(",");
        if (getAcceleratorTotalMemoryMiB() != null)
            sb.append("AcceleratorTotalMemoryMiB: ").append(getAcceleratorTotalMemoryMiB()).append(",");
        if (getNetworkBandwidthGbps() != null)
            sb.append("NetworkBandwidthGbps: ").append(getNetworkBandwidthGbps()).append(",");
        if (getAllowedInstanceTypes() != null)
            sb.append("AllowedInstanceTypes: ").append(getAllowedInstanceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRequirements == false)
            return false;
        InstanceRequirements other = (InstanceRequirements) obj;
        if (other.getVCpuCount() == null ^ this.getVCpuCount() == null)
            return false;
        if (other.getVCpuCount() != null && other.getVCpuCount().equals(this.getVCpuCount()) == false)
            return false;
        if (other.getMemoryMiB() == null ^ this.getMemoryMiB() == null)
            return false;
        if (other.getMemoryMiB() != null && other.getMemoryMiB().equals(this.getMemoryMiB()) == false)
            return false;
        if (other.getCpuManufacturers() == null ^ this.getCpuManufacturers() == null)
            return false;
        if (other.getCpuManufacturers() != null && other.getCpuManufacturers().equals(this.getCpuManufacturers()) == false)
            return false;
        if (other.getMemoryGiBPerVCpu() == null ^ this.getMemoryGiBPerVCpu() == null)
            return false;
        if (other.getMemoryGiBPerVCpu() != null && other.getMemoryGiBPerVCpu().equals(this.getMemoryGiBPerVCpu()) == false)
            return false;
        if (other.getExcludedInstanceTypes() == null ^ this.getExcludedInstanceTypes() == null)
            return false;
        if (other.getExcludedInstanceTypes() != null && other.getExcludedInstanceTypes().equals(this.getExcludedInstanceTypes()) == false)
            return false;
        if (other.getInstanceGenerations() == null ^ this.getInstanceGenerations() == null)
            return false;
        if (other.getInstanceGenerations() != null && other.getInstanceGenerations().equals(this.getInstanceGenerations()) == false)
            return false;
        if (other.getSpotMaxPricePercentageOverLowestPrice() == null ^ this.getSpotMaxPricePercentageOverLowestPrice() == null)
            return false;
        if (other.getSpotMaxPricePercentageOverLowestPrice() != null
                && other.getSpotMaxPricePercentageOverLowestPrice().equals(this.getSpotMaxPricePercentageOverLowestPrice()) == false)
            return false;
        if (other.getOnDemandMaxPricePercentageOverLowestPrice() == null ^ this.getOnDemandMaxPricePercentageOverLowestPrice() == null)
            return false;
        if (other.getOnDemandMaxPricePercentageOverLowestPrice() != null
                && other.getOnDemandMaxPricePercentageOverLowestPrice().equals(this.getOnDemandMaxPricePercentageOverLowestPrice()) == false)
            return false;
        if (other.getBareMetal() == null ^ this.getBareMetal() == null)
            return false;
        if (other.getBareMetal() != null && other.getBareMetal().equals(this.getBareMetal()) == false)
            return false;
        if (other.getBurstablePerformance() == null ^ this.getBurstablePerformance() == null)
            return false;
        if (other.getBurstablePerformance() != null && other.getBurstablePerformance().equals(this.getBurstablePerformance()) == false)
            return false;
        if (other.getRequireHibernateSupport() == null ^ this.getRequireHibernateSupport() == null)
            return false;
        if (other.getRequireHibernateSupport() != null && other.getRequireHibernateSupport().equals(this.getRequireHibernateSupport()) == false)
            return false;
        if (other.getNetworkInterfaceCount() == null ^ this.getNetworkInterfaceCount() == null)
            return false;
        if (other.getNetworkInterfaceCount() != null && other.getNetworkInterfaceCount().equals(this.getNetworkInterfaceCount()) == false)
            return false;
        if (other.getLocalStorage() == null ^ this.getLocalStorage() == null)
            return false;
        if (other.getLocalStorage() != null && other.getLocalStorage().equals(this.getLocalStorage()) == false)
            return false;
        if (other.getLocalStorageTypes() == null ^ this.getLocalStorageTypes() == null)
            return false;
        if (other.getLocalStorageTypes() != null && other.getLocalStorageTypes().equals(this.getLocalStorageTypes()) == false)
            return false;
        if (other.getTotalLocalStorageGB() == null ^ this.getTotalLocalStorageGB() == null)
            return false;
        if (other.getTotalLocalStorageGB() != null && other.getTotalLocalStorageGB().equals(this.getTotalLocalStorageGB()) == false)
            return false;
        if (other.getBaselineEbsBandwidthMbps() == null ^ this.getBaselineEbsBandwidthMbps() == null)
            return false;
        if (other.getBaselineEbsBandwidthMbps() != null && other.getBaselineEbsBandwidthMbps().equals(this.getBaselineEbsBandwidthMbps()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getAcceleratorCount() == null ^ this.getAcceleratorCount() == null)
            return false;
        if (other.getAcceleratorCount() != null && other.getAcceleratorCount().equals(this.getAcceleratorCount()) == false)
            return false;
        if (other.getAcceleratorManufacturers() == null ^ this.getAcceleratorManufacturers() == null)
            return false;
        if (other.getAcceleratorManufacturers() != null && other.getAcceleratorManufacturers().equals(this.getAcceleratorManufacturers()) == false)
            return false;
        if (other.getAcceleratorNames() == null ^ this.getAcceleratorNames() == null)
            return false;
        if (other.getAcceleratorNames() != null && other.getAcceleratorNames().equals(this.getAcceleratorNames()) == false)
            return false;
        if (other.getAcceleratorTotalMemoryMiB() == null ^ this.getAcceleratorTotalMemoryMiB() == null)
            return false;
        if (other.getAcceleratorTotalMemoryMiB() != null && other.getAcceleratorTotalMemoryMiB().equals(this.getAcceleratorTotalMemoryMiB()) == false)
            return false;
        if (other.getNetworkBandwidthGbps() == null ^ this.getNetworkBandwidthGbps() == null)
            return false;
        if (other.getNetworkBandwidthGbps() != null && other.getNetworkBandwidthGbps().equals(this.getNetworkBandwidthGbps()) == false)
            return false;
        if (other.getAllowedInstanceTypes() == null ^ this.getAllowedInstanceTypes() == null)
            return false;
        if (other.getAllowedInstanceTypes() != null && other.getAllowedInstanceTypes().equals(this.getAllowedInstanceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVCpuCount() == null) ? 0 : getVCpuCount().hashCode());
        hashCode = prime * hashCode + ((getMemoryMiB() == null) ? 0 : getMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getCpuManufacturers() == null) ? 0 : getCpuManufacturers().hashCode());
        hashCode = prime * hashCode + ((getMemoryGiBPerVCpu() == null) ? 0 : getMemoryGiBPerVCpu().hashCode());
        hashCode = prime * hashCode + ((getExcludedInstanceTypes() == null) ? 0 : getExcludedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceGenerations() == null) ? 0 : getInstanceGenerations().hashCode());
        hashCode = prime * hashCode + ((getSpotMaxPricePercentageOverLowestPrice() == null) ? 0 : getSpotMaxPricePercentageOverLowestPrice().hashCode());
        hashCode = prime * hashCode
                + ((getOnDemandMaxPricePercentageOverLowestPrice() == null) ? 0 : getOnDemandMaxPricePercentageOverLowestPrice().hashCode());
        hashCode = prime * hashCode + ((getBareMetal() == null) ? 0 : getBareMetal().hashCode());
        hashCode = prime * hashCode + ((getBurstablePerformance() == null) ? 0 : getBurstablePerformance().hashCode());
        hashCode = prime * hashCode + ((getRequireHibernateSupport() == null) ? 0 : getRequireHibernateSupport().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceCount() == null) ? 0 : getNetworkInterfaceCount().hashCode());
        hashCode = prime * hashCode + ((getLocalStorage() == null) ? 0 : getLocalStorage().hashCode());
        hashCode = prime * hashCode + ((getLocalStorageTypes() == null) ? 0 : getLocalStorageTypes().hashCode());
        hashCode = prime * hashCode + ((getTotalLocalStorageGB() == null) ? 0 : getTotalLocalStorageGB().hashCode());
        hashCode = prime * hashCode + ((getBaselineEbsBandwidthMbps() == null) ? 0 : getBaselineEbsBandwidthMbps().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorCount() == null) ? 0 : getAcceleratorCount().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorManufacturers() == null) ? 0 : getAcceleratorManufacturers().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorNames() == null) ? 0 : getAcceleratorNames().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTotalMemoryMiB() == null) ? 0 : getAcceleratorTotalMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getNetworkBandwidthGbps() == null) ? 0 : getNetworkBandwidthGbps().hashCode());
        hashCode = prime * hashCode + ((getAllowedInstanceTypes() == null) ? 0 : getAllowedInstanceTypes().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRequirements clone() {
        try {
            return (InstanceRequirements) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
