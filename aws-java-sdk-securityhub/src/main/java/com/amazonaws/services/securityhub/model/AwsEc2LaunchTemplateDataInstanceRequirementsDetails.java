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
 * The attributes for the Amazon EC2 instance types.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataInstanceRequirementsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataInstanceRequirementsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails acceleratorCount;
    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     */
    private java.util.List<String> acceleratorManufacturers;
    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     */
    private java.util.List<String> acceleratorNames;
    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetails acceleratorTotalMemoryMiB;
    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;
    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     */
    private String bareMetal;
    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails baselineEbsBandwidthMbps;
    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String burstablePerformance;
    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     */
    private java.util.List<String> cpuManufacturers;
    /**
     * <p>
     * The instance types to exclude.
     * </p>
     */
    private java.util.List<String> excludedInstanceTypes;
    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     */
    private java.util.List<String> instanceGenerations;
    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     */
    private String localStorage;
    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     */
    private java.util.List<String> localStorageTypes;
    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetails memoryGiBPerVCpu;
    /**
     * <p>
     * The minimum and maximum amount of memory, in MiB.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetails memoryMiB;
    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails networkInterfaceCount;
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
     * A high value, such as <code>999999</code>, turns off price protection.
     * </p>
     */
    private Integer onDemandMaxPricePercentageOverLowestPrice;
    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     */
    private Boolean requireHibernateSupport;
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
     * A high value, such as <code>999999</code>, turns off price protection.
     * </p>
     */
    private Integer spotMaxPricePercentageOverLowestPrice;
    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails totalLocalStorageGB;
    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     */
    private AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetails vCpuCount;

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * 
     * @param acceleratorCount
     *        The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     *        an instance.
     */

    public void setAcceleratorCount(AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails acceleratorCount) {
        this.acceleratorCount = acceleratorCount;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * 
     * @return The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     *         an instance.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on an
     * instance.
     * </p>
     * 
     * @param acceleratorCount
     *        The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) on
     *        an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorCount(
            AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails acceleratorCount) {
        setAcceleratorCount(acceleratorCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * 
     * @return Indicates whether instance types must have accelerators by specific manufacturers.
     */

    public java.util.List<String> getAcceleratorManufacturers() {
        return acceleratorManufacturers;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.
     */

    public void setAcceleratorManufacturers(java.util.Collection<String> acceleratorManufacturers) {
        if (acceleratorManufacturers == null) {
            this.acceleratorManufacturers = null;
            return;
        }

        this.acceleratorManufacturers = new java.util.ArrayList<String>(acceleratorManufacturers);
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorManufacturers(java.util.Collection)} or
     * {@link #withAcceleratorManufacturers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorManufacturers(String... acceleratorManufacturers) {
        if (this.acceleratorManufacturers == null) {
            setAcceleratorManufacturers(new java.util.ArrayList<String>(acceleratorManufacturers.length));
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
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorManufacturers(java.util.Collection<String> acceleratorManufacturers) {
        setAcceleratorManufacturers(acceleratorManufacturers);
        return this;
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * 
     * @return The accelerators that must be on the instance type.
     */

    public java.util.List<String> getAcceleratorNames() {
        return acceleratorNames;
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.
     */

    public void setAcceleratorNames(java.util.Collection<String> acceleratorNames) {
        if (acceleratorNames == null) {
            this.acceleratorNames = null;
            return;
        }

        this.acceleratorNames = new java.util.ArrayList<String>(acceleratorNames);
    }

    /**
     * <p>
     * The accelerators that must be on the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorNames(java.util.Collection)} or {@link #withAcceleratorNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorNames(String... acceleratorNames) {
        if (this.acceleratorNames == null) {
            setAcceleratorNames(new java.util.ArrayList<String>(acceleratorNames.length));
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
     * 
     * @param acceleratorNames
     *        The accelerators that must be on the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorNames(java.util.Collection<String> acceleratorNames) {
        setAcceleratorNames(acceleratorNames);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The minimum and maximum amount of total accelerator memory, in MiB.
     */

    public void setAcceleratorTotalMemoryMiB(AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetails acceleratorTotalMemoryMiB) {
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * 
     * @return The minimum and maximum amount of total accelerator memory, in MiB.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetails getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total accelerator memory, in MiB.
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The minimum and maximum amount of total accelerator memory, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorTotalMemoryMiB(
            AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorTotalMemoryMiBDetails acceleratorTotalMemoryMiB) {
        setAcceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB);
        return this;
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * 
     * @return The accelerator types that must be on the instance type.
     */

    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.
     */

    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * The accelerator types that must be on the instance type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorTypes(String... acceleratorTypes) {
        if (this.acceleratorTypes == null) {
            setAcceleratorTypes(new java.util.ArrayList<String>(acceleratorTypes.length));
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
     * 
     * @param acceleratorTypes
     *        The accelerator types that must be on the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types must be included, excluded, or required.
     */

    public void setBareMetal(String bareMetal) {
        this.bareMetal = bareMetal;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * 
     * @return Indicates whether bare metal instance types must be included, excluded, or required.
     */

    public String getBareMetal() {
        return this.bareMetal;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types must be included, excluded, or required.
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types must be included, excluded, or required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withBareMetal(String bareMetal) {
        setBareMetal(bareMetal);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param baselineEbsBandwidthMbps
     *        The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized
     *        instances</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setBaselineEbsBandwidthMbps(AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails baselineEbsBandwidthMbps) {
        this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized
     *         instances</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized instances</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param baselineEbsBandwidthMbps
     *        The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS optimized
     *        instances</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withBaselineEbsBandwidthMbps(
            AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails baselineEbsBandwidthMbps) {
        setBaselineEbsBandwidthMbps(baselineEbsBandwidthMbps);
        return this;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *        information, <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setBurstablePerformance(String burstablePerformance) {
        this.burstablePerformance = burstablePerformance;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *         information, <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *         performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public String getBurstablePerformance() {
        return this.burstablePerformance;
    }

    /**
     * <p>
     * Indicates whether burstable performance T instance types are included, excluded, or required. For more
     * information, <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance T instance types are included, excluded, or required. For more
     *        information, <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withBurstablePerformance(String burstablePerformance) {
        setBurstablePerformance(burstablePerformance);
        return this;
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * 
     * @return The CPU manufacturers to include.
     */

    public java.util.List<String> getCpuManufacturers() {
        return cpuManufacturers;
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.
     */

    public void setCpuManufacturers(java.util.Collection<String> cpuManufacturers) {
        if (cpuManufacturers == null) {
            this.cpuManufacturers = null;
            return;
        }

        this.cpuManufacturers = new java.util.ArrayList<String>(cpuManufacturers);
    }

    /**
     * <p>
     * The CPU manufacturers to include.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpuManufacturers(java.util.Collection)} or {@link #withCpuManufacturers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withCpuManufacturers(String... cpuManufacturers) {
        if (this.cpuManufacturers == null) {
            setCpuManufacturers(new java.util.ArrayList<String>(cpuManufacturers.length));
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
     * 
     * @param cpuManufacturers
     *        The CPU manufacturers to include.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withCpuManufacturers(java.util.Collection<String> cpuManufacturers) {
        setCpuManufacturers(cpuManufacturers);
        return this;
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * 
     * @return The instance types to exclude.
     */

    public java.util.List<String> getExcludedInstanceTypes() {
        return excludedInstanceTypes;
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude.
     */

    public void setExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        if (excludedInstanceTypes == null) {
            this.excludedInstanceTypes = null;
            return;
        }

        this.excludedInstanceTypes = new java.util.ArrayList<String>(excludedInstanceTypes);
    }

    /**
     * <p>
     * The instance types to exclude.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedInstanceTypes(java.util.Collection)} or
     * {@link #withExcludedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withExcludedInstanceTypes(String... excludedInstanceTypes) {
        if (this.excludedInstanceTypes == null) {
            setExcludedInstanceTypes(new java.util.ArrayList<String>(excludedInstanceTypes.length));
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
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        setExcludedInstanceTypes(excludedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * 
     * @return Indicates whether current or previous generation instance types are included.
     */

    public java.util.List<String> getInstanceGenerations() {
        return instanceGenerations;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.
     */

    public void setInstanceGenerations(java.util.Collection<String> instanceGenerations) {
        if (instanceGenerations == null) {
            this.instanceGenerations = null;
            return;
        }

        this.instanceGenerations = new java.util.ArrayList<String>(instanceGenerations);
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGenerations(java.util.Collection)} or {@link #withInstanceGenerations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withInstanceGenerations(String... instanceGenerations) {
        if (this.instanceGenerations == null) {
            setInstanceGenerations(new java.util.ArrayList<String>(instanceGenerations.length));
        }
        for (String ele : instanceGenerations) {
            this.instanceGenerations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withInstanceGenerations(java.util.Collection<String> instanceGenerations) {
        setInstanceGenerations(instanceGenerations);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     *        EC2 instance store</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public void setLocalStorage(String localStorage) {
        this.localStorage = localStorage;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @return Indicates whether instance types with instance store volumes are included, excluded, or required. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *         store</a> in the <i>Amazon EC2 User Guide</i>.
     */

    public String getLocalStorage() {
        return this.localStorage;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     *        EC2 instance store</a> in the <i>Amazon EC2 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withLocalStorage(String localStorage) {
        setLocalStorage(localStorage);
        return this;
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * 
     * @return The type of local storage that is required.
     */

    public java.util.List<String> getLocalStorageTypes() {
        return localStorageTypes;
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.
     */

    public void setLocalStorageTypes(java.util.Collection<String> localStorageTypes) {
        if (localStorageTypes == null) {
            this.localStorageTypes = null;
            return;
        }

        this.localStorageTypes = new java.util.ArrayList<String>(localStorageTypes);
    }

    /**
     * <p>
     * The type of local storage that is required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalStorageTypes(java.util.Collection)} or {@link #withLocalStorageTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withLocalStorageTypes(String... localStorageTypes) {
        if (this.localStorageTypes == null) {
            setLocalStorageTypes(new java.util.ArrayList<String>(localStorageTypes.length));
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
     * 
     * @param localStorageTypes
     *        The type of local storage that is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withLocalStorageTypes(java.util.Collection<String> localStorageTypes) {
        setLocalStorageTypes(localStorageTypes);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * 
     * @param memoryGiBPerVCpu
     *        The minimum and maximum amount of memory per vCPU, in GiB.
     */

    public void setMemoryGiBPerVCpu(AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetails memoryGiBPerVCpu) {
        this.memoryGiBPerVCpu = memoryGiBPerVCpu;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * 
     * @return The minimum and maximum amount of memory per vCPU, in GiB.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetails getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU, in GiB.
     * </p>
     * 
     * @param memoryGiBPerVCpu
     *        The minimum and maximum amount of memory per vCPU, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withMemoryGiBPerVCpu(
            AwsEc2LaunchTemplateDataInstanceRequirementsMemoryGiBPerVCpuDetails memoryGiBPerVCpu) {
        setMemoryGiBPerVCpu(memoryGiBPerVCpu);
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

    public void setMemoryMiB(AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetails memoryMiB) {
        this.memoryMiB = memoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory, in MiB.
     * </p>
     * 
     * @return The minimum and maximum amount of memory, in MiB.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetails getMemoryMiB() {
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

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withMemoryMiB(AwsEc2LaunchTemplateDataInstanceRequirementsMemoryMiBDetails memoryMiB) {
        setMemoryMiB(memoryMiB);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * 
     * @param networkInterfaceCount
     *        The minimum and maximum number of network interfaces.
     */

    public void setNetworkInterfaceCount(AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails networkInterfaceCount) {
        this.networkInterfaceCount = networkInterfaceCount;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * 
     * @return The minimum and maximum number of network interfaces.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails getNetworkInterfaceCount() {
        return this.networkInterfaceCount;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces.
     * </p>
     * 
     * @param networkInterfaceCount
     *        The minimum and maximum number of network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withNetworkInterfaceCount(
            AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails networkInterfaceCount) {
        setNetworkInterfaceCount(networkInterfaceCount);
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
     * A high value, such as <code>999999</code>, turns off price protection.
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
     *        A high value, such as <code>999999</code>, turns off price protection.
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
     * A high value, such as <code>999999</code>, turns off price protection.
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
     *         A high value, such as <code>999999</code>, turns off price protection.
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
     * A high value, such as <code>999999</code>, turns off price protection.
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
     *        A high value, such as <code>999999</code>, turns off price protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withOnDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
        setOnDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * 
     * @param requireHibernateSupport
     *        Indicates whether instance types must support hibernation for On-Demand Instances.
     */

    public void setRequireHibernateSupport(Boolean requireHibernateSupport) {
        this.requireHibernateSupport = requireHibernateSupport;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * 
     * @return Indicates whether instance types must support hibernation for On-Demand Instances.
     */

    public Boolean getRequireHibernateSupport() {
        return this.requireHibernateSupport;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * 
     * @param requireHibernateSupport
     *        Indicates whether instance types must support hibernation for On-Demand Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withRequireHibernateSupport(Boolean requireHibernateSupport) {
        setRequireHibernateSupport(requireHibernateSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must support hibernation for On-Demand Instances.
     * </p>
     * 
     * @return Indicates whether instance types must support hibernation for On-Demand Instances.
     */

    public Boolean isRequireHibernateSupport() {
        return this.requireHibernateSupport;
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
     * A high value, such as <code>999999</code>, turns off price protection.
     * </p>
     * 
     * @param spotMaxPricePercentageOverLowestPrice
     *        The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *        expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     *        specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     *        types priced above your threshold. </p>
     *        <p>
     *        The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *        </p>
     *        <p>
     *        A high value, such as <code>999999</code>, turns off price protection.
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
     * A high value, such as <code>999999</code>, turns off price protection.
     * </p>
     * 
     * @return The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *         expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     *         specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     *         types priced above your threshold. </p>
     *         <p>
     *         The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *         </p>
     *         <p>
     *         A high value, such as <code>999999</code>, turns off price protection.
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
     * A high value, such as <code>999999</code>, turns off price protection.
     * </p>
     * 
     * @param spotMaxPricePercentageOverLowestPrice
     *        The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *        expressed as a percentage above the least expensive current generation M, C, or R instance type with your
     *        specified attributes. When Amazon EC2 selects instance types with your attributes, it excludes instance
     *        types priced above your threshold. </p>
     *        <p>
     *        The parameter accepts an integer, which Amazon EC2 interprets as a percentage.
     *        </p>
     *        <p>
     *        A high value, such as <code>999999</code>, turns off price protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withSpotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
        setSpotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * 
     * @param totalLocalStorageGB
     *        The minimum and maximum amount of total local storage, in GB.
     */

    public void setTotalLocalStorageGB(AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails totalLocalStorageGB) {
        this.totalLocalStorageGB = totalLocalStorageGB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * 
     * @return The minimum and maximum amount of total local storage, in GB.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails getTotalLocalStorageGB() {
        return this.totalLocalStorageGB;
    }

    /**
     * <p>
     * The minimum and maximum amount of total local storage, in GB.
     * </p>
     * 
     * @param totalLocalStorageGB
     *        The minimum and maximum amount of total local storage, in GB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withTotalLocalStorageGB(
            AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails totalLocalStorageGB) {
        setTotalLocalStorageGB(totalLocalStorageGB);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     * 
     * @param vCpuCount
     *        The minimum and maximum number of vCPUs.
     */

    public void setVCpuCount(AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetails vCpuCount) {
        this.vCpuCount = vCpuCount;
    }

    /**
     * <p>
     * The minimum and maximum number of vCPUs.
     * </p>
     * 
     * @return The minimum and maximum number of vCPUs.
     */

    public AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetails getVCpuCount() {
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

    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails withVCpuCount(AwsEc2LaunchTemplateDataInstanceRequirementsVCpuCountDetails vCpuCount) {
        setVCpuCount(vCpuCount);
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
        if (getAcceleratorCount() != null)
            sb.append("AcceleratorCount: ").append(getAcceleratorCount()).append(",");
        if (getAcceleratorManufacturers() != null)
            sb.append("AcceleratorManufacturers: ").append(getAcceleratorManufacturers()).append(",");
        if (getAcceleratorNames() != null)
            sb.append("AcceleratorNames: ").append(getAcceleratorNames()).append(",");
        if (getAcceleratorTotalMemoryMiB() != null)
            sb.append("AcceleratorTotalMemoryMiB: ").append(getAcceleratorTotalMemoryMiB()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getBareMetal() != null)
            sb.append("BareMetal: ").append(getBareMetal()).append(",");
        if (getBaselineEbsBandwidthMbps() != null)
            sb.append("BaselineEbsBandwidthMbps: ").append(getBaselineEbsBandwidthMbps()).append(",");
        if (getBurstablePerformance() != null)
            sb.append("BurstablePerformance: ").append(getBurstablePerformance()).append(",");
        if (getCpuManufacturers() != null)
            sb.append("CpuManufacturers: ").append(getCpuManufacturers()).append(",");
        if (getExcludedInstanceTypes() != null)
            sb.append("ExcludedInstanceTypes: ").append(getExcludedInstanceTypes()).append(",");
        if (getInstanceGenerations() != null)
            sb.append("InstanceGenerations: ").append(getInstanceGenerations()).append(",");
        if (getLocalStorage() != null)
            sb.append("LocalStorage: ").append(getLocalStorage()).append(",");
        if (getLocalStorageTypes() != null)
            sb.append("LocalStorageTypes: ").append(getLocalStorageTypes()).append(",");
        if (getMemoryGiBPerVCpu() != null)
            sb.append("MemoryGiBPerVCpu: ").append(getMemoryGiBPerVCpu()).append(",");
        if (getMemoryMiB() != null)
            sb.append("MemoryMiB: ").append(getMemoryMiB()).append(",");
        if (getNetworkInterfaceCount() != null)
            sb.append("NetworkInterfaceCount: ").append(getNetworkInterfaceCount()).append(",");
        if (getOnDemandMaxPricePercentageOverLowestPrice() != null)
            sb.append("OnDemandMaxPricePercentageOverLowestPrice: ").append(getOnDemandMaxPricePercentageOverLowestPrice()).append(",");
        if (getRequireHibernateSupport() != null)
            sb.append("RequireHibernateSupport: ").append(getRequireHibernateSupport()).append(",");
        if (getSpotMaxPricePercentageOverLowestPrice() != null)
            sb.append("SpotMaxPricePercentageOverLowestPrice: ").append(getSpotMaxPricePercentageOverLowestPrice()).append(",");
        if (getTotalLocalStorageGB() != null)
            sb.append("TotalLocalStorageGB: ").append(getTotalLocalStorageGB()).append(",");
        if (getVCpuCount() != null)
            sb.append("VCpuCount: ").append(getVCpuCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataInstanceRequirementsDetails == false)
            return false;
        AwsEc2LaunchTemplateDataInstanceRequirementsDetails other = (AwsEc2LaunchTemplateDataInstanceRequirementsDetails) obj;
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
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getBareMetal() == null ^ this.getBareMetal() == null)
            return false;
        if (other.getBareMetal() != null && other.getBareMetal().equals(this.getBareMetal()) == false)
            return false;
        if (other.getBaselineEbsBandwidthMbps() == null ^ this.getBaselineEbsBandwidthMbps() == null)
            return false;
        if (other.getBaselineEbsBandwidthMbps() != null && other.getBaselineEbsBandwidthMbps().equals(this.getBaselineEbsBandwidthMbps()) == false)
            return false;
        if (other.getBurstablePerformance() == null ^ this.getBurstablePerformance() == null)
            return false;
        if (other.getBurstablePerformance() != null && other.getBurstablePerformance().equals(this.getBurstablePerformance()) == false)
            return false;
        if (other.getCpuManufacturers() == null ^ this.getCpuManufacturers() == null)
            return false;
        if (other.getCpuManufacturers() != null && other.getCpuManufacturers().equals(this.getCpuManufacturers()) == false)
            return false;
        if (other.getExcludedInstanceTypes() == null ^ this.getExcludedInstanceTypes() == null)
            return false;
        if (other.getExcludedInstanceTypes() != null && other.getExcludedInstanceTypes().equals(this.getExcludedInstanceTypes()) == false)
            return false;
        if (other.getInstanceGenerations() == null ^ this.getInstanceGenerations() == null)
            return false;
        if (other.getInstanceGenerations() != null && other.getInstanceGenerations().equals(this.getInstanceGenerations()) == false)
            return false;
        if (other.getLocalStorage() == null ^ this.getLocalStorage() == null)
            return false;
        if (other.getLocalStorage() != null && other.getLocalStorage().equals(this.getLocalStorage()) == false)
            return false;
        if (other.getLocalStorageTypes() == null ^ this.getLocalStorageTypes() == null)
            return false;
        if (other.getLocalStorageTypes() != null && other.getLocalStorageTypes().equals(this.getLocalStorageTypes()) == false)
            return false;
        if (other.getMemoryGiBPerVCpu() == null ^ this.getMemoryGiBPerVCpu() == null)
            return false;
        if (other.getMemoryGiBPerVCpu() != null && other.getMemoryGiBPerVCpu().equals(this.getMemoryGiBPerVCpu()) == false)
            return false;
        if (other.getMemoryMiB() == null ^ this.getMemoryMiB() == null)
            return false;
        if (other.getMemoryMiB() != null && other.getMemoryMiB().equals(this.getMemoryMiB()) == false)
            return false;
        if (other.getNetworkInterfaceCount() == null ^ this.getNetworkInterfaceCount() == null)
            return false;
        if (other.getNetworkInterfaceCount() != null && other.getNetworkInterfaceCount().equals(this.getNetworkInterfaceCount()) == false)
            return false;
        if (other.getOnDemandMaxPricePercentageOverLowestPrice() == null ^ this.getOnDemandMaxPricePercentageOverLowestPrice() == null)
            return false;
        if (other.getOnDemandMaxPricePercentageOverLowestPrice() != null
                && other.getOnDemandMaxPricePercentageOverLowestPrice().equals(this.getOnDemandMaxPricePercentageOverLowestPrice()) == false)
            return false;
        if (other.getRequireHibernateSupport() == null ^ this.getRequireHibernateSupport() == null)
            return false;
        if (other.getRequireHibernateSupport() != null && other.getRequireHibernateSupport().equals(this.getRequireHibernateSupport()) == false)
            return false;
        if (other.getSpotMaxPricePercentageOverLowestPrice() == null ^ this.getSpotMaxPricePercentageOverLowestPrice() == null)
            return false;
        if (other.getSpotMaxPricePercentageOverLowestPrice() != null
                && other.getSpotMaxPricePercentageOverLowestPrice().equals(this.getSpotMaxPricePercentageOverLowestPrice()) == false)
            return false;
        if (other.getTotalLocalStorageGB() == null ^ this.getTotalLocalStorageGB() == null)
            return false;
        if (other.getTotalLocalStorageGB() != null && other.getTotalLocalStorageGB().equals(this.getTotalLocalStorageGB()) == false)
            return false;
        if (other.getVCpuCount() == null ^ this.getVCpuCount() == null)
            return false;
        if (other.getVCpuCount() != null && other.getVCpuCount().equals(this.getVCpuCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorCount() == null) ? 0 : getAcceleratorCount().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorManufacturers() == null) ? 0 : getAcceleratorManufacturers().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorNames() == null) ? 0 : getAcceleratorNames().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTotalMemoryMiB() == null) ? 0 : getAcceleratorTotalMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getBareMetal() == null) ? 0 : getBareMetal().hashCode());
        hashCode = prime * hashCode + ((getBaselineEbsBandwidthMbps() == null) ? 0 : getBaselineEbsBandwidthMbps().hashCode());
        hashCode = prime * hashCode + ((getBurstablePerformance() == null) ? 0 : getBurstablePerformance().hashCode());
        hashCode = prime * hashCode + ((getCpuManufacturers() == null) ? 0 : getCpuManufacturers().hashCode());
        hashCode = prime * hashCode + ((getExcludedInstanceTypes() == null) ? 0 : getExcludedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceGenerations() == null) ? 0 : getInstanceGenerations().hashCode());
        hashCode = prime * hashCode + ((getLocalStorage() == null) ? 0 : getLocalStorage().hashCode());
        hashCode = prime * hashCode + ((getLocalStorageTypes() == null) ? 0 : getLocalStorageTypes().hashCode());
        hashCode = prime * hashCode + ((getMemoryGiBPerVCpu() == null) ? 0 : getMemoryGiBPerVCpu().hashCode());
        hashCode = prime * hashCode + ((getMemoryMiB() == null) ? 0 : getMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceCount() == null) ? 0 : getNetworkInterfaceCount().hashCode());
        hashCode = prime * hashCode
                + ((getOnDemandMaxPricePercentageOverLowestPrice() == null) ? 0 : getOnDemandMaxPricePercentageOverLowestPrice().hashCode());
        hashCode = prime * hashCode + ((getRequireHibernateSupport() == null) ? 0 : getRequireHibernateSupport().hashCode());
        hashCode = prime * hashCode + ((getSpotMaxPricePercentageOverLowestPrice() == null) ? 0 : getSpotMaxPricePercentageOverLowestPrice().hashCode());
        hashCode = prime * hashCode + ((getTotalLocalStorageGB() == null) ? 0 : getTotalLocalStorageGB().hashCode());
        hashCode = prime * hashCode + ((getVCpuCount() == null) ? 0 : getVCpuCount().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataInstanceRequirementsDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataInstanceRequirementsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataInstanceRequirementsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
