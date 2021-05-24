/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a recommendation option for an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/InstanceRecommendationOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRecommendationOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     */
    private java.util.List<UtilizationMetric> projectedUtilizationMetrics;
    /**
     * <p>
     * Describes the configuration differences between the current instance and the recommended instance type. You
     * should consider the configuration differences before migrating your workloads from the current instance to the
     * recommended instance type. The <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance type
     * guide for Linux</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance type
     * guide for Windows</a> provide general guidance for getting started with an instance migration.
     * </p>
     * <p>
     * Platform differences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that of the
     * current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance
     * uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the <a
     * href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section of the Amazon EC2 frequently
     * asked questions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type supports enhanced networking and the
     * current instance might not. To enable enhanced networking for the recommended instance type, you will need to
     * install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     * Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking on
     * Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the
     * current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or
     * upgrade the NVMe driver. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on Linux
     * instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     * Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance store
     * volumes and the current instance does. Before migrating, you might need to back up the data on your instance
     * store volumes if you want to preserve them. For more information, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up an
     * instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support Knowledge
     * Base</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance store</a> in
     * the <i>Amazon EC2 User Guide for Linux</i>, or see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance store</a>
     * in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine (HVM)
     * virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information
     * about the differences between these virtualization types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI virtualization
     * types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     * >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> platformDifferences;
    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs of your
     * workload. Compute Optimizer calculates an individual performance risk score for each specification of the
     * recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS, network
     * throughput, and network PPS. The performance risk of the recommended instance is calculated as the maximum
     * performance risk score across the analyzed resource specifications.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     */
    private Double performanceRisk;
    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     */
    private Integer rank;

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance recommendation.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     * 
     * @return The instance type of the instance recommendation.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the instance recommendation.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @return An array of objects that describe the projected utilization metrics of the instance recommendation
     *         option.</p> <note>
     *         <p>
     *         The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *         Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *         CloudWatch agent installed on them. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *         Utilization with the CloudWatch Agent</a>.
     *         </p>
     */

    public java.util.List<UtilizationMetric> getProjectedUtilizationMetrics() {
        return projectedUtilizationMetrics;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the instance recommendation
     *        option.</p> <note>
     *        <p>
     *        The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *        Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *        CloudWatch agent installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     */

    public void setProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        if (projectedUtilizationMetrics == null) {
            this.projectedUtilizationMetrics = null;
            return;
        }

        this.projectedUtilizationMetrics = new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics);
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProjectedUtilizationMetrics(java.util.Collection)} or
     * {@link #withProjectedUtilizationMetrics(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the instance recommendation
     *        option.</p> <note>
     *        <p>
     *        The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *        Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *        CloudWatch agent installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withProjectedUtilizationMetrics(UtilizationMetric... projectedUtilizationMetrics) {
        if (this.projectedUtilizationMetrics == null) {
            setProjectedUtilizationMetrics(new java.util.ArrayList<UtilizationMetric>(projectedUtilizationMetrics.length));
        }
        for (UtilizationMetric ele : projectedUtilizationMetrics) {
            this.projectedUtilizationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the projected utilization metrics of the instance recommendation option.
     * </p>
     * <note>
     * <p>
     * The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     * Additionally, the <code>Memory</code> metric is returned only for resources that have the unified CloudWatch
     * agent installed on them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note>
     * 
     * @param projectedUtilizationMetrics
     *        An array of objects that describe the projected utilization metrics of the instance recommendation
     *        option.</p> <note>
     *        <p>
     *        The <code>Cpu</code> and <code>Memory</code> metrics are the only projected utilization metrics returned.
     *        Additionally, the <code>Memory</code> metric is returned only for resources that have the unified
     *        CloudWatch agent installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withProjectedUtilizationMetrics(java.util.Collection<UtilizationMetric> projectedUtilizationMetrics) {
        setProjectedUtilizationMetrics(projectedUtilizationMetrics);
        return this;
    }

    /**
     * <p>
     * Describes the configuration differences between the current instance and the recommended instance type. You
     * should consider the configuration differences before migrating your workloads from the current instance to the
     * recommended instance type. The <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance type
     * guide for Linux</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance type
     * guide for Windows</a> provide general guidance for getting started with an instance migration.
     * </p>
     * <p>
     * Platform differences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that of the
     * current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance
     * uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the <a
     * href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section of the Amazon EC2 frequently
     * asked questions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type supports enhanced networking and the
     * current instance might not. To enable enhanced networking for the recommended instance type, you will need to
     * install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     * Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking on
     * Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the
     * current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or
     * upgrade the NVMe driver. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on Linux
     * instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     * Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance store
     * volumes and the current instance does. Before migrating, you might need to back up the data on your instance
     * store volumes if you want to preserve them. For more information, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up an
     * instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support Knowledge
     * Base</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance store</a> in
     * the <i>Amazon EC2 User Guide for Linux</i>, or see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance store</a>
     * in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine (HVM)
     * virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information
     * about the differences between these virtualization types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI virtualization
     * types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     * >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the configuration differences between the current instance and the recommended instance type.
     *         You should consider the configuration differences before migrating your workloads from the current
     *         instance to the recommended instance type. The <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance
     *         type guide for Linux</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the
     *         instance type guide for Windows</a> provide general guidance for getting started with an instance
     *         migration.</p>
     *         <p>
     *         Platform differences include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that
     *         of the current instance. For example, the recommended instance type uses a Nitro hypervisor and the
     *         current instance uses a Xen hypervisor. The differences that you should consider between these
     *         hypervisors are covered in the <a href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro
     *         Hypervisor</a> section of the Amazon EC2 frequently asked questions. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *         >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances"
     *         >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is
     *         different than that of the current instance. For example, the recommended instance type supports enhanced
     *         networking and the current instance might not. To enable enhanced networking for the recommended instance
     *         type, you will need to install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual
     *         Function driver. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *         >Networking and storage features</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking
     *         on Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *         >Networking and storage features</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced
     *         networking on Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is
     *         different than that of the current instance. For example, the recommended instance type uses an NVMe
     *         storage interface and the current instance does not. To access NVMe volumes for the recommended instance
     *         type, you will need to install or upgrade the NVMe driver. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *         >Networking and storage features</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *         Linux instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *         >Networking and storage features</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe
     *         on Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance
     *         store volumes and the current instance does. Before migrating, you might need to back up the data on your
     *         instance store volumes if you want to preserve them. For more information, see <a
     *         href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back
     *         up an instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support
     *         Knowledge Base</i>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *         >Networking and storage features</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *         store</a> in the <i>Amazon EC2 User Guide for Linux</i>, or see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *         >Networking and storage features</a> and <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance
     *         store</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual
     *         machine (HVM) virtualization type and the current instance uses the paravirtual (PV) virtualization type.
     *         For more information about the differences between these virtualization types, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI
     *         virtualization types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     *         >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *         </p>
     *         </li>
     * @see PlatformDifference
     */

    public java.util.List<String> getPlatformDifferences() {
        return platformDifferences;
    }

    /**
     * <p>
     * Describes the configuration differences between the current instance and the recommended instance type. You
     * should consider the configuration differences before migrating your workloads from the current instance to the
     * recommended instance type. The <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance type
     * guide for Linux</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance type
     * guide for Windows</a> provide general guidance for getting started with an instance migration.
     * </p>
     * <p>
     * Platform differences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that of the
     * current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance
     * uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the <a
     * href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section of the Amazon EC2 frequently
     * asked questions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type supports enhanced networking and the
     * current instance might not. To enable enhanced networking for the recommended instance type, you will need to
     * install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     * Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking on
     * Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the
     * current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or
     * upgrade the NVMe driver. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on Linux
     * instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     * Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance store
     * volumes and the current instance does. Before migrating, you might need to back up the data on your instance
     * store volumes if you want to preserve them. For more information, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up an
     * instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support Knowledge
     * Base</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance store</a> in
     * the <i>Amazon EC2 User Guide for Linux</i>, or see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance store</a>
     * in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine (HVM)
     * virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information
     * about the differences between these virtualization types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI virtualization
     * types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     * >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platformDifferences
     *        Describes the configuration differences between the current instance and the recommended instance type.
     *        You should consider the configuration differences before migrating your workloads from the current
     *        instance to the recommended instance type. The <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Linux</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Windows</a> provide general guidance for getting started with an instance migration.</p>
     *        <p>
     *        Platform differences include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that
     *        of the current instance. For example, the recommended instance type uses a Nitro hypervisor and the
     *        current instance uses a Xen hypervisor. The differences that you should consider between these hypervisors
     *        are covered in the <a href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section
     *        of the Amazon EC2 frequently asked questions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type supports enhanced
     *        networking and the current instance might not. To enable enhanced networking for the recommended instance
     *        type, you will need to install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual
     *        Function driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     *        Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking
     *        on Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type uses an NVMe
     *        storage interface and the current instance does not. To access NVMe volumes for the recommended instance
     *        type, you will need to install or upgrade the NVMe driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Linux instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance
     *        store volumes and the current instance does. Before migrating, you might need to back up the data on your
     *        instance store volumes if you want to preserve them. For more information, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up
     *        an instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support
     *        Knowledge Base</i>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Linux</i>, or see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine
     *        (HVM) virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more
     *        information about the differences between these virtualization types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI
     *        virtualization types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     *        >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     * @see PlatformDifference
     */

    public void setPlatformDifferences(java.util.Collection<String> platformDifferences) {
        if (platformDifferences == null) {
            this.platformDifferences = null;
            return;
        }

        this.platformDifferences = new java.util.ArrayList<String>(platformDifferences);
    }

    /**
     * <p>
     * Describes the configuration differences between the current instance and the recommended instance type. You
     * should consider the configuration differences before migrating your workloads from the current instance to the
     * recommended instance type. The <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance type
     * guide for Linux</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance type
     * guide for Windows</a> provide general guidance for getting started with an instance migration.
     * </p>
     * <p>
     * Platform differences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that of the
     * current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance
     * uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the <a
     * href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section of the Amazon EC2 frequently
     * asked questions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type supports enhanced networking and the
     * current instance might not. To enable enhanced networking for the recommended instance type, you will need to
     * install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     * Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking on
     * Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the
     * current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or
     * upgrade the NVMe driver. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on Linux
     * instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     * Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance store
     * volumes and the current instance does. Before migrating, you might need to back up the data on your instance
     * store volumes if you want to preserve them. For more information, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up an
     * instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support Knowledge
     * Base</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance store</a> in
     * the <i>Amazon EC2 User Guide for Linux</i>, or see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance store</a>
     * in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine (HVM)
     * virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information
     * about the differences between these virtualization types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI virtualization
     * types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     * >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformDifferences(java.util.Collection)} or {@link #withPlatformDifferences(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param platformDifferences
     *        Describes the configuration differences between the current instance and the recommended instance type.
     *        You should consider the configuration differences before migrating your workloads from the current
     *        instance to the recommended instance type. The <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Linux</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Windows</a> provide general guidance for getting started with an instance migration.</p>
     *        <p>
     *        Platform differences include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that
     *        of the current instance. For example, the recommended instance type uses a Nitro hypervisor and the
     *        current instance uses a Xen hypervisor. The differences that you should consider between these hypervisors
     *        are covered in the <a href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section
     *        of the Amazon EC2 frequently asked questions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type supports enhanced
     *        networking and the current instance might not. To enable enhanced networking for the recommended instance
     *        type, you will need to install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual
     *        Function driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     *        Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking
     *        on Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type uses an NVMe
     *        storage interface and the current instance does not. To access NVMe volumes for the recommended instance
     *        type, you will need to install or upgrade the NVMe driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Linux instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance
     *        store volumes and the current instance does. Before migrating, you might need to back up the data on your
     *        instance store volumes if you want to preserve them. For more information, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up
     *        an instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support
     *        Knowledge Base</i>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Linux</i>, or see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine
     *        (HVM) virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more
     *        information about the differences between these virtualization types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI
     *        virtualization types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     *        >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformDifference
     */

    public InstanceRecommendationOption withPlatformDifferences(String... platformDifferences) {
        if (this.platformDifferences == null) {
            setPlatformDifferences(new java.util.ArrayList<String>(platformDifferences.length));
        }
        for (String ele : platformDifferences) {
            this.platformDifferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the configuration differences between the current instance and the recommended instance type. You
     * should consider the configuration differences before migrating your workloads from the current instance to the
     * recommended instance type. The <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance type
     * guide for Linux</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance type
     * guide for Windows</a> provide general guidance for getting started with an instance migration.
     * </p>
     * <p>
     * Platform differences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that of the
     * current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance
     * uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the <a
     * href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section of the Amazon EC2 frequently
     * asked questions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type supports enhanced networking and the
     * current instance might not. To enable enhanced networking for the recommended instance type, you will need to
     * install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     * Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking on
     * Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the
     * current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or
     * upgrade the NVMe driver. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on Linux
     * instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     * Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance store
     * volumes and the current instance does. Before migrating, you might need to back up the data on your instance
     * store volumes if you want to preserve them. For more information, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up an
     * instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support Knowledge
     * Base</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance store</a> in
     * the <i>Amazon EC2 User Guide for Linux</i>, or see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance store</a>
     * in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine (HVM)
     * virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information
     * about the differences between these virtualization types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI virtualization
     * types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     * >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platformDifferences
     *        Describes the configuration differences between the current instance and the recommended instance type.
     *        You should consider the configuration differences before migrating your workloads from the current
     *        instance to the recommended instance type. The <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Linux</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Windows</a> provide general guidance for getting started with an instance migration.</p>
     *        <p>
     *        Platform differences include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that
     *        of the current instance. For example, the recommended instance type uses a Nitro hypervisor and the
     *        current instance uses a Xen hypervisor. The differences that you should consider between these hypervisors
     *        are covered in the <a href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section
     *        of the Amazon EC2 frequently asked questions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type supports enhanced
     *        networking and the current instance might not. To enable enhanced networking for the recommended instance
     *        type, you will need to install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual
     *        Function driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     *        Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking
     *        on Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type uses an NVMe
     *        storage interface and the current instance does not. To access NVMe volumes for the recommended instance
     *        type, you will need to install or upgrade the NVMe driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Linux instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance
     *        store volumes and the current instance does. Before migrating, you might need to back up the data on your
     *        instance store volumes if you want to preserve them. For more information, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up
     *        an instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support
     *        Knowledge Base</i>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Linux</i>, or see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine
     *        (HVM) virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more
     *        information about the differences between these virtualization types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI
     *        virtualization types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     *        >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformDifference
     */

    public InstanceRecommendationOption withPlatformDifferences(java.util.Collection<String> platformDifferences) {
        setPlatformDifferences(platformDifferences);
        return this;
    }

    /**
     * <p>
     * Describes the configuration differences between the current instance and the recommended instance type. You
     * should consider the configuration differences before migrating your workloads from the current instance to the
     * recommended instance type. The <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance type
     * guide for Linux</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance type
     * guide for Windows</a> provide general guidance for getting started with an instance migration.
     * </p>
     * <p>
     * Platform differences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that of the
     * current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance
     * uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the <a
     * href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section of the Amazon EC2 frequently
     * asked questions. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances">Instances
     * built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type supports enhanced networking and the
     * current instance might not. To enable enhanced networking for the recommended instance type, you will need to
     * install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     * Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking on
     * Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is different than
     * that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the
     * current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or
     * upgrade the NVMe driver. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on Linux
     * instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     * Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance store
     * volumes and the current instance does. Before migrating, you might need to back up the data on your instance
     * store volumes if you want to preserve them. For more information, see <a
     * href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up an
     * instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support Knowledge
     * Base</i>. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance store</a> in
     * the <i>Amazon EC2 User Guide for Linux</i>, or see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     * >Networking and storage features</a> and <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance store</a>
     * in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine (HVM)
     * virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information
     * about the differences between these virtualization types, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI virtualization
     * types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     * >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param platformDifferences
     *        Describes the configuration differences between the current instance and the recommended instance type.
     *        You should consider the configuration differences before migrating your workloads from the current
     *        instance to the recommended instance type. The <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Linux</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-resize.html">Change the instance
     *        type guide for Windows</a> provide general guidance for getting started with an instance migration.</p>
     *        <p>
     *        Platform differences include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Hypervisor</code> </b> — The hypervisor of the recommended instance type is different than that
     *        of the current instance. For example, the recommended instance type uses a Nitro hypervisor and the
     *        current instance uses a Xen hypervisor. The differences that you should consider between these hypervisors
     *        are covered in the <a href="http://aws.amazon.com/ec2/faqs/#Nitro_Hypervisor">Nitro Hypervisor</a> section
     *        of the Amazon EC2 frequently asked questions. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#ec2-nitro-instances"
     *        >Instances built on the Nitro System</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkInterface</code> </b> — The network interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type supports enhanced
     *        networking and the current instance might not. To enable enhanced networking for the recommended instance
     *        type, you will need to install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual
     *        Function driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html">Enhanced networking on
     *        Linux</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/enhanced-networking.html">Enhanced networking
     *        on Windows</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StorageInterface</code> </b> — The storage interface of the recommended instance type is
     *        different than that of the current instance. For example, the recommended instance type uses an NVMe
     *        storage interface and the current instance does not. To access NVMe volumes for the recommended instance
     *        type, you will need to install or upgrade the NVMe driver. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Linux instances</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/nvme-ebs-volumes.html">Amazon EBS and NVMe on
     *        Windows instances</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceStoreAvailability</code> </b> — The recommended instance type does not support instance
     *        store volumes and the current instance does. Before migrating, you might need to back up the data on your
     *        instance store volumes if you want to preserve them. For more information, see <a
     *        href="https://aws.amazon.com/premiumsupport/knowledge-center/back-up-instance-store-ebs/">How do I back up
     *        an instance store volume on my Amazon EC2 instance to Amazon EBS?</a> in the <i>AWS Premium Support
     *        Knowledge Base</i>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Linux</i>, or see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/instance-types.html#instance-networking-storage"
     *        >Networking and storage features</a> and <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/InstanceStorage.html">Amazon EC2 instance
     *        store</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>VirtualizationType</code> </b> — The recommended instance type uses the hardware virtual machine
     *        (HVM) virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more
     *        information about the differences between these virtualization types, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/virtualization_types.html">Linux AMI
     *        virtualization types</a> in the <i>Amazon EC2 User Guide for Linux</i>, or <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/windows-ami-version-history.html#virtualization-types"
     *        >Windows AMI virtualization types</a> in the <i>Amazon EC2 User Guide for Windows</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformDifference
     */

    public InstanceRecommendationOption withPlatformDifferences(PlatformDifference... platformDifferences) {
        java.util.ArrayList<String> platformDifferencesCopy = new java.util.ArrayList<String>(platformDifferences.length);
        for (PlatformDifference value : platformDifferences) {
            platformDifferencesCopy.add(value.toString());
        }
        if (getPlatformDifferences() == null) {
            setPlatformDifferences(platformDifferencesCopy);
        } else {
            getPlatformDifferences().addAll(platformDifferencesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs of your
     * workload. Compute Optimizer calculates an individual performance risk score for each specification of the
     * recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS, network
     * throughput, and network PPS. The performance risk of the recommended instance is calculated as the maximum
     * performance risk score across the analyzed resource specifications.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the instance recommendation option.</p>
     *        <p>
     *        Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs
     *        of your workload. Compute Optimizer calculates an individual performance risk score for each specification
     *        of the recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS,
     *        network throughput, and network PPS. The performance risk of the recommended instance is calculated as the
     *        maximum performance risk score across the analyzed resource specifications.
     *        </p>
     *        <p>
     *        The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended
     *        resource is predicted to always provide enough hardware capability. The higher the performance risk is,
     *        the more likely you should validate whether the recommendation will meet the performance requirements of
     *        your workload before migrating your resource.
     */

    public void setPerformanceRisk(Double performanceRisk) {
        this.performanceRisk = performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs of your
     * workload. Compute Optimizer calculates an individual performance risk score for each specification of the
     * recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS, network
     * throughput, and network PPS. The performance risk of the recommended instance is calculated as the maximum
     * performance risk score across the analyzed resource specifications.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     * 
     * @return The performance risk of the instance recommendation option.</p>
     *         <p>
     *         Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs
     *         of your workload. Compute Optimizer calculates an individual performance risk score for each
     *         specification of the recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk
     *         throughput, disk IOPS, network throughput, and network PPS. The performance risk of the recommended
     *         instance is calculated as the maximum performance risk score across the analyzed resource specifications.
     *         </p>
     *         <p>
     *         The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended
     *         resource is predicted to always provide enough hardware capability. The higher the performance risk is,
     *         the more likely you should validate whether the recommendation will meet the performance requirements of
     *         your workload before migrating your resource.
     */

    public Double getPerformanceRisk() {
        return this.performanceRisk;
    }

    /**
     * <p>
     * The performance risk of the instance recommendation option.
     * </p>
     * <p>
     * Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs of your
     * workload. Compute Optimizer calculates an individual performance risk score for each specification of the
     * recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS, network
     * throughput, and network PPS. The performance risk of the recommended instance is calculated as the maximum
     * performance risk score across the analyzed resource specifications.
     * </p>
     * <p>
     * The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended resource
     * is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely
     * you should validate whether the recommendation will meet the performance requirements of your workload before
     * migrating your resource.
     * </p>
     * 
     * @param performanceRisk
     *        The performance risk of the instance recommendation option.</p>
     *        <p>
     *        Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs
     *        of your workload. Compute Optimizer calculates an individual performance risk score for each specification
     *        of the recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS,
     *        network throughput, and network PPS. The performance risk of the recommended instance is calculated as the
     *        maximum performance risk score across the analyzed resource specifications.
     *        </p>
     *        <p>
     *        The value ranges from <code>0</code> to <code>5</code>, with <code>0</code> meaning that the recommended
     *        resource is predicted to always provide enough hardware capability. The higher the performance risk is,
     *        the more likely you should validate whether the recommendation will meet the performance requirements of
     *        your workload before migrating your resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withPerformanceRisk(Double performanceRisk) {
        setPerformanceRisk(performanceRisk);
        return this;
    }

    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the instance recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @return The rank of the instance recommendation option.</p>
     *         <p>
     *         The top recommendation option is ranked as <code>1</code>.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * The rank of the instance recommendation option.
     * </p>
     * <p>
     * The top recommendation option is ranked as <code>1</code>.
     * </p>
     * 
     * @param rank
     *        The rank of the instance recommendation option.</p>
     *        <p>
     *        The top recommendation option is ranked as <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRecommendationOption withRank(Integer rank) {
        setRank(rank);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getProjectedUtilizationMetrics() != null)
            sb.append("ProjectedUtilizationMetrics: ").append(getProjectedUtilizationMetrics()).append(",");
        if (getPlatformDifferences() != null)
            sb.append("PlatformDifferences: ").append(getPlatformDifferences()).append(",");
        if (getPerformanceRisk() != null)
            sb.append("PerformanceRisk: ").append(getPerformanceRisk()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRecommendationOption == false)
            return false;
        InstanceRecommendationOption other = (InstanceRecommendationOption) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getProjectedUtilizationMetrics() == null ^ this.getProjectedUtilizationMetrics() == null)
            return false;
        if (other.getProjectedUtilizationMetrics() != null && other.getProjectedUtilizationMetrics().equals(this.getProjectedUtilizationMetrics()) == false)
            return false;
        if (other.getPlatformDifferences() == null ^ this.getPlatformDifferences() == null)
            return false;
        if (other.getPlatformDifferences() != null && other.getPlatformDifferences().equals(this.getPlatformDifferences()) == false)
            return false;
        if (other.getPerformanceRisk() == null ^ this.getPerformanceRisk() == null)
            return false;
        if (other.getPerformanceRisk() != null && other.getPerformanceRisk().equals(this.getPerformanceRisk()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getProjectedUtilizationMetrics() == null) ? 0 : getProjectedUtilizationMetrics().hashCode());
        hashCode = prime * hashCode + ((getPlatformDifferences() == null) ? 0 : getPlatformDifferences().hashCode());
        hashCode = prime * hashCode + ((getPerformanceRisk() == null) ? 0 : getPerformanceRisk().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRecommendationOption clone() {
        try {
            return (InstanceRecommendationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.InstanceRecommendationOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
