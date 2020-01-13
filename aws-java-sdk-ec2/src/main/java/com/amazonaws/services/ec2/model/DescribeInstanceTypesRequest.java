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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInstanceTypesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTypesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstanceTypesRequest> {

    /**
     * <p>
     * The instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceTypes;
    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance type. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is the latest generation instance type of
     * an instance family. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage disks. (
     * <code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     * instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or required.
     * (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (<code>true</code>
     * | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The instance types. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public java.util.List<String> getInstanceTypes() {
        if (instanceTypes == null) {
            instanceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @see InstanceType
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new com.amazonaws.internal.SdkInternalList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeInstanceTypesRequest withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new com.amazonaws.internal.SdkInternalList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeInstanceTypesRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The instance types. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public DescribeInstanceTypesRequest withInstanceTypes(InstanceType... instanceTypes) {
        com.amazonaws.internal.SdkInternalList<String> instanceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(instanceTypes.length);
        for (InstanceType value : instanceTypes) {
            instanceTypesCopy.add(value.toString());
        }
        if (getInstanceTypes() == null) {
            setInstanceTypes(instanceTypesCopy);
        } else {
            getInstanceTypes().addAll(instanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance type. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is the latest generation instance type of
     * an instance family. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage disks. (
     * <code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     * instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or required.
     * (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (<code>true</code>
     * | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. Filter names and values are case-sensitive.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     *         <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance
     *         type. (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>current-generation</code> - Indicates whether this instance type is the latest generation instance
     *         type of an instance family. (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     *         <code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (
     *         <code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free
     *         tier. (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (
     *         <code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.disk.count</code> - The number of local disks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in
     *         GB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage
     *         disks. (<code>hdd</code> | <code>ssd</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all
     *         local instance storage, in GB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage.
     *         (<code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>memory-info.size-in-mib</code> - The memory size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or
     *         required. (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (
     *         <code>true</code> | <code>false</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-info.network-performance</code> - Describes the network performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance
     *         type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance type. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is the latest generation instance type of
     * an instance family. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage disks. (
     * <code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     * instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or required.
     * (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (<code>true</code>
     * | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     *        <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     *        <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance
     *        type. (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>current-generation</code> - Indicates whether this instance type is the latest generation instance
     *        type of an instance family. (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier.
     *        (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.count</code> - The number of local disks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in
     *        GB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage
     *        disks. (<code>hdd</code> | <code>ssd</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     *        instance storage, in GB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage.
     *        (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>memory-info.size-in-mib</code> - The memory size.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or
     *        required. (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.network-performance</code> - Describes the network performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance
     *        type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance type. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is the latest generation instance type of
     * an instance family. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage disks. (
     * <code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     * instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or required.
     * (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (<code>true</code>
     * | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     *        <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     *        <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance
     *        type. (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>current-generation</code> - Indicates whether this instance type is the latest generation instance
     *        type of an instance family. (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier.
     *        (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.count</code> - The number of local disks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in
     *        GB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage
     *        disks. (<code>hdd</code> | <code>ssd</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     *        instance storage, in GB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage.
     *        (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>memory-info.size-in-mib</code> - The memory size.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or
     *        required. (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.network-performance</code> - Describes the network performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance
     *        type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance type. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>current-generation</code> - Indicates whether this instance type is the latest generation instance type of
     * an instance family. (<code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (<code>true</code> |
     * <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.count</code> - The number of local disks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage disks. (
     * <code>hdd</code> | <code>ssd</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     * instance storage, in GB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage. (
     * <code>true</code> | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>memory-info.size-in-mib</code> - The memory size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or required.
     * (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (<code>true</code>
     * | <code>false</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-info.network-performance</code> - Describes the network performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-recovery-supported</code> - Indicates whether auto recovery is supported. (<code>true</code> |
     *        <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bare-metal</code> - Indicates whether it is a bare metal instance type. (<code>true</code> |
     *        <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>burstable-performance-supported</code> - Indicates whether it is a burstable performance instance
     *        type. (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>current-generation</code> - Indicates whether this instance type is the latest generation instance
     *        type of an instance family. (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-info.ebs-optimized-support</code> - Indicates whether the instance type is EBS-optimized. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ebs-info.encryption-support</code> - Indicates whether EBS encryption is supported. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>free-tier-eligible</code> - Indicates whether the instance type is eligible to use in the free tier.
     *        (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hibernation-supported</code> - Indicates whether On-Demand hibernation is supported. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>hypervisor</code> - The hypervisor used. (<code>nitro</code> | <code>xen</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.count</code> - The number of local disks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.size-in-gb</code> - The storage size of each instance storage disk, in
     *        GB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.disk.type</code> - The storage technology for the local instance storage
     *        disks. (<code>hdd</code> | <code>ssd</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-info.total-size-in-gb</code> - The total amount of storage available from all local
     *        instance storage, in GB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-storage-supported</code> - Indicates whether the instance type has local instance storage.
     *        (<code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>memory-info.size-in-mib</code> - The memory size.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ena-support</code> - Indicates whether Elastic Network Adapter (ENA) is supported or
     *        required. (<code>required</code> | <code>supported</code> | <code>unsupported</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv4-addresses-per-interface</code> - The maximum number of private IPv4 addresses per
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv6-addresses-per-interface</code> - The maximum number of private IPv6 addresses per
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.ipv6-supported</code> - Indicates whether the instance type supports IPv6. (
     *        <code>true</code> | <code>false</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.maximum-network-interfaces</code> - The maximum number of network interfaces per
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-info.network-performance</code> - Describes the network performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>processor-info.sustained-clock-speed-in-ghz</code> - The CPU clock speed, in GHz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-cores</code> - The default number of cores for the instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-threads-per-core</code> - The default number of threads per core for the instance
     *        type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vcpu-info.default-vcpus</code> - The default number of vCPUs for the instance type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the next token value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the next token value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the next token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceTypesRequest> getDryRunRequest() {
        Request<DescribeInstanceTypesRequest> request = new DescribeInstanceTypesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceTypesRequest == false)
            return false;
        DescribeInstanceTypesRequest other = (DescribeInstanceTypesRequest) obj;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTypesRequest clone() {
        return (DescribeInstanceTypesRequest) super.clone();
    }
}
