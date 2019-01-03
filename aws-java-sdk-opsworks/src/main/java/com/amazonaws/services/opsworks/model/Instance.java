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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/Instance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default stack
     * setting or to a a version number for a fixed agent version.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * A custom AMI ID to be used to create the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The instance architecture: "i386" or "x86_64".
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The instance's Amazon Resource Number (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * For load-based or time-based instances, the type.
     * </p>
     */
    private String autoScalingType;
    /**
     * <p>
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The time that the instance was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * Whether this is an Amazon EBS-optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The ID of the associated Amazon EC2 instance.
     * </p>
     */
    private String ec2InstanceId;
    /**
     * <p>
     * For container instances, the Amazon ECS cluster's ARN.
     * </p>
     */
    private String ecsClusterArn;
    /**
     * <p>
     * For container instances, the instance's ARN.
     * </p>
     */
    private String ecsContainerInstanceArn;
    /**
     * <p>
     * The instance <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     * </p>
     */
    private String elasticIp;
    /**
     * <p>
     * The instance host name.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     * </p>
     */
    private String infrastructureClass;
    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. If this value is set to <code>false</code>, you must then update your instances manually by
     * using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     */
    private Boolean installUpdatesOnBoot;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     */
    private String instanceProfileArn;
    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     * </p>
     */
    private String lastServiceErrorId;
    /**
     * <p>
     * An array containing the instance layer IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layerIds;
    /**
     * <p>
     * The instance's operating system.
     * </p>
     */
    private String os;
    /**
     * <p>
     * The instance's platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The instance's private DNS name.
     * </p>
     */
    private String privateDns;
    /**
     * <p>
     * The instance's private IP address.
     * </p>
     */
    private String privateIp;
    /**
     * <p>
     * The instance public DNS name.
     * </p>
     */
    private String publicDns;
    /**
     * <p>
     * The instance public IP address.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * For registered instances, who performed the registration.
     * </p>
     */
    private String registeredBy;
    /**
     * <p>
     * The instance's reported AWS OpsWorks Stacks agent version.
     * </p>
     */
    private String reportedAgentVersion;
    /**
     * <p>
     * For registered instances, the reported operating system.
     * </p>
     */
    private ReportedOs reportedOs;
    /**
     * <p>
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     */
    private String rootDeviceType;
    /**
     * <p>
     * The root device volume ID.
     * </p>
     */
    private String rootDeviceVolumeId;
    /**
     * <p>
     * An array containing the instance security group IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     * </p>
     */
    private String sshHostDsaKeyFingerprint;
    /**
     * <p>
     * The SSH key's RSA fingerprint.
     * </p>
     */
    private String sshHostRsaKeyFingerprint;
    /**
     * <p>
     * The instance's Amazon EC2 key-pair name.
     * </p>
     */
    private String sshKeyName;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The instance status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>booting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection_lost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>online</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>running_setup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>setup_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shutting_down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stop_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminating</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The instance's subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     * </p>
     */
    private String tenancy;
    /**
     * <p>
     * The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     */
    private String virtualizationType;

    /**
     * <p>
     * The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default stack
     * setting or to a a version number for a fixed agent version.
     * </p>
     * 
     * @param agentVersion
     *        The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default
     *        stack setting or to a a version number for a fixed agent version.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default stack
     * setting or to a a version number for a fixed agent version.
     * </p>
     * 
     * @return The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default
     *         stack setting or to a a version number for a fixed agent version.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default stack
     * setting or to a a version number for a fixed agent version.
     * </p>
     * 
     * @param agentVersion
     *        The agent version. This parameter is set to <code>INHERIT</code> if the instance inherits the default
     *        stack setting or to a a version number for a fixed agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * A custom AMI ID to be used to create the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * </p>
     * 
     * @param amiId
     *        A custom AMI ID to be used to create the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * A custom AMI ID to be used to create the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * </p>
     * 
     * @return A custom AMI ID to be used to create the instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html"
     *         >Instances</a>
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * A custom AMI ID to be used to create the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * </p>
     * 
     * @param amiId
     *        A custom AMI ID to be used to create the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The instance architecture: "i386" or "x86_64".
     * </p>
     * 
     * @param architecture
     *        The instance architecture: "i386" or "x86_64".
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The instance architecture: "i386" or "x86_64".
     * </p>
     * 
     * @return The instance architecture: "i386" or "x86_64".
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The instance architecture: "i386" or "x86_64".
     * </p>
     * 
     * @param architecture
     *        The instance architecture: "i386" or "x86_64".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Instance withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The instance architecture: "i386" or "x86_64".
     * </p>
     * 
     * @param architecture
     *        The instance architecture: "i386" or "x86_64".
     * @see Architecture
     */

    public void setArchitecture(Architecture architecture) {
        withArchitecture(architecture);
    }

    /**
     * <p>
     * The instance architecture: "i386" or "x86_64".
     * </p>
     * 
     * @param architecture
     *        The instance architecture: "i386" or "x86_64".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Instance withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The instance's Amazon Resource Number (ARN).
     * </p>
     * 
     * @param arn
     *        The instance's Amazon Resource Number (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The instance's Amazon Resource Number (ARN).
     * </p>
     * 
     * @return The instance's Amazon Resource Number (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The instance's Amazon Resource Number (ARN).
     * </p>
     * 
     * @param arn
     *        The instance's Amazon Resource Number (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type.
     * @see AutoScalingType
     */

    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type.
     * </p>
     * 
     * @return For load-based or time-based instances, the type.
     * @see AutoScalingType
     */

    public String getAutoScalingType() {
        return this.autoScalingType;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingType
     */

    public Instance withAutoScalingType(String autoScalingType) {
        setAutoScalingType(autoScalingType);
        return this;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type.
     * @see AutoScalingType
     */

    public void setAutoScalingType(AutoScalingType autoScalingType) {
        withAutoScalingType(autoScalingType);
    }

    /**
     * <p>
     * For load-based or time-based instances, the type.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingType
     */

    public Instance withAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
        return this;
    }

    /**
     * <p>
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The instance Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The instance Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * </p>
     * 
     * @return An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * </p>
     * 
     * @param blockDeviceMappings
     *        An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     */

    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (BlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * </p>
     * 
     * @param blockDeviceMappings
     *        An array of <code>BlockDeviceMapping</code> objects that specify the instance's block device mappings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The time that the instance was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the instance was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the instance was created.
     * </p>
     * 
     * @return The time that the instance was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the instance was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Whether this is an Amazon EBS-optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Whether this is an Amazon EBS-optimized instance.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Whether this is an Amazon EBS-optimized instance.
     * </p>
     * 
     * @return Whether this is an Amazon EBS-optimized instance.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Whether this is an Amazon EBS-optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Whether this is an Amazon EBS-optimized instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Whether this is an Amazon EBS-optimized instance.
     * </p>
     * 
     * @return Whether this is an Amazon EBS-optimized instance.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The ID of the associated Amazon EC2 instance.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the associated Amazon EC2 instance.
     */

    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the associated Amazon EC2 instance.
     * </p>
     * 
     * @return The ID of the associated Amazon EC2 instance.
     */

    public String getEc2InstanceId() {
        return this.ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the associated Amazon EC2 instance.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the associated Amazon EC2 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEc2InstanceId(String ec2InstanceId) {
        setEc2InstanceId(ec2InstanceId);
        return this;
    }

    /**
     * <p>
     * For container instances, the Amazon ECS cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        For container instances, the Amazon ECS cluster's ARN.
     */

    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    /**
     * <p>
     * For container instances, the Amazon ECS cluster's ARN.
     * </p>
     * 
     * @return For container instances, the Amazon ECS cluster's ARN.
     */

    public String getEcsClusterArn() {
        return this.ecsClusterArn;
    }

    /**
     * <p>
     * For container instances, the Amazon ECS cluster's ARN.
     * </p>
     * 
     * @param ecsClusterArn
     *        For container instances, the Amazon ECS cluster's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEcsClusterArn(String ecsClusterArn) {
        setEcsClusterArn(ecsClusterArn);
        return this;
    }

    /**
     * <p>
     * For container instances, the instance's ARN.
     * </p>
     * 
     * @param ecsContainerInstanceArn
     *        For container instances, the instance's ARN.
     */

    public void setEcsContainerInstanceArn(String ecsContainerInstanceArn) {
        this.ecsContainerInstanceArn = ecsContainerInstanceArn;
    }

    /**
     * <p>
     * For container instances, the instance's ARN.
     * </p>
     * 
     * @return For container instances, the instance's ARN.
     */

    public String getEcsContainerInstanceArn() {
        return this.ecsContainerInstanceArn;
    }

    /**
     * <p>
     * For container instances, the instance's ARN.
     * </p>
     * 
     * @param ecsContainerInstanceArn
     *        For container instances, the instance's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withEcsContainerInstanceArn(String ecsContainerInstanceArn) {
        setEcsContainerInstanceArn(ecsContainerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The instance <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     * </p>
     * 
     * @param elasticIp
     *        The instance <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address
     *        </a>.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The instance <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     * </p>
     * 
     * @return The instance <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *         address </a>.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The instance <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     * </p>
     * 
     * @param elasticIp
     *        The instance <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP address
     *        </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
        return this;
    }

    /**
     * <p>
     * The instance host name.
     * </p>
     * 
     * @param hostname
     *        The instance host name.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The instance host name.
     * </p>
     * 
     * @return The instance host name.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The instance host name.
     * </p>
     * 
     * @param hostname
     *        The instance host name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     * </p>
     * 
     * @param infrastructureClass
     *        For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     */

    public void setInfrastructureClass(String infrastructureClass) {
        this.infrastructureClass = infrastructureClass;
    }

    /**
     * <p>
     * For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     * </p>
     * 
     * @return For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     */

    public String getInfrastructureClass() {
        return this.infrastructureClass;
    }

    /**
     * <p>
     * For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     * </p>
     * 
     * @param infrastructureClass
     *        For registered instances, the infrastructure class: <code>ec2</code> or <code>on-premises</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInfrastructureClass(String infrastructureClass) {
        setInfrastructureClass(infrastructureClass);
        return this;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. If this value is set to <code>false</code>, you must then update your instances manually by
     * using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @param installUpdatesOnBoot
     *        Whether to install operating system and package updates when the instance boots. The default value is
     *        <code>true</code>. If this value is set to <code>false</code>, you must then update your instances
     *        manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by
     *        manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances. </p>
     *        <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the
     *        latest security updates.
     *        </p>
     */

    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. If this value is set to <code>false</code>, you must then update your instances manually by
     * using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @return Whether to install operating system and package updates when the instance boots. The default value is
     *         <code>true</code>. If this value is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by
     *         manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances. </p>
     *         <note>
     *         <p>
     *         We strongly recommend using the default value of <code>true</code>, to ensure that your instances have
     *         the latest security updates.
     *         </p>
     */

    public Boolean getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. If this value is set to <code>false</code>, you must then update your instances manually by
     * using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @param installUpdatesOnBoot
     *        Whether to install operating system and package updates when the instance boots. The default value is
     *        <code>true</code>. If this value is set to <code>false</code>, you must then update your instances
     *        manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by
     *        manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances. </p>
     *        <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the
     *        latest security updates.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        setInstallUpdatesOnBoot(installUpdatesOnBoot);
        return this;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. If this value is set to <code>false</code>, you must then update your instances manually by
     * using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @return Whether to install operating system and package updates when the instance boots. The default value is
     *         <code>true</code>. If this value is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack command or by
     *         manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances. </p>
     *         <note>
     *         <p>
     *         We strongly recommend using the default value of <code>true</code>, to ensure that your instances have
     *         the latest security updates.
     *         </p>
     */

    public Boolean isInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @param instanceProfileArn
     *        The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    /**
     * <p>
     * The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @return The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     */

    public String getInstanceProfileArn() {
        return this.instanceProfileArn;
    }

    /**
     * <p>
     * The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * </p>
     * 
     * @param instanceProfileArn
     *        The ARN of the instance's IAM profile. For more information about IAM ARNs, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using Identifiers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceProfileArn(String instanceProfileArn) {
        setInstanceProfileArn(instanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>t2.micro</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>.
     * </p>
     * 
     * @return The instance type, such as <code>t2.micro</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>t2.micro</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     * </p>
     * 
     * @param lastServiceErrorId
     *        The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     */

    public void setLastServiceErrorId(String lastServiceErrorId) {
        this.lastServiceErrorId = lastServiceErrorId;
    }

    /**
     * <p>
     * The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     * </p>
     * 
     * @return The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     */

    public String getLastServiceErrorId() {
        return this.lastServiceErrorId;
    }

    /**
     * <p>
     * The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     * </p>
     * 
     * @param lastServiceErrorId
     *        The ID of the last service error. For more information, call <a>DescribeServiceErrors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLastServiceErrorId(String lastServiceErrorId) {
        setLastServiceErrorId(lastServiceErrorId);
        return this;
    }

    /**
     * <p>
     * An array containing the instance layer IDs.
     * </p>
     * 
     * @return An array containing the instance layer IDs.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * An array containing the instance layer IDs.
     * </p>
     * 
     * @param layerIds
     *        An array containing the instance layer IDs.
     */

    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }

        this.layerIds = new com.amazonaws.internal.SdkInternalList<String>(layerIds);
    }

    /**
     * <p>
     * An array containing the instance layer IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerIds(java.util.Collection)} or {@link #withLayerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerIds
     *        An array containing the instance layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLayerIds(String... layerIds) {
        if (this.layerIds == null) {
            setLayerIds(new com.amazonaws.internal.SdkInternalList<String>(layerIds.length));
        }
        for (String ele : layerIds) {
            this.layerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the instance layer IDs.
     * </p>
     * 
     * @param layerIds
     *        An array containing the instance layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withLayerIds(java.util.Collection<String> layerIds) {
        setLayerIds(layerIds);
        return this;
    }

    /**
     * <p>
     * The instance's operating system.
     * </p>
     * 
     * @param os
     *        The instance's operating system.
     */

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * <p>
     * The instance's operating system.
     * </p>
     * 
     * @return The instance's operating system.
     */

    public String getOs() {
        return this.os;
    }

    /**
     * <p>
     * The instance's operating system.
     * </p>
     * 
     * @param os
     *        The instance's operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withOs(String os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * The instance's platform.
     * </p>
     * 
     * @param platform
     *        The instance's platform.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The instance's platform.
     * </p>
     * 
     * @return The instance's platform.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The instance's platform.
     * </p>
     * 
     * @param platform
     *        The instance's platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The instance's private DNS name.
     * </p>
     * 
     * @param privateDns
     *        The instance's private DNS name.
     */

    public void setPrivateDns(String privateDns) {
        this.privateDns = privateDns;
    }

    /**
     * <p>
     * The instance's private DNS name.
     * </p>
     * 
     * @return The instance's private DNS name.
     */

    public String getPrivateDns() {
        return this.privateDns;
    }

    /**
     * <p>
     * The instance's private DNS name.
     * </p>
     * 
     * @param privateDns
     *        The instance's private DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPrivateDns(String privateDns) {
        setPrivateDns(privateDns);
        return this;
    }

    /**
     * <p>
     * The instance's private IP address.
     * </p>
     * 
     * @param privateIp
     *        The instance's private IP address.
     */

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    /**
     * <p>
     * The instance's private IP address.
     * </p>
     * 
     * @return The instance's private IP address.
     */

    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * <p>
     * The instance's private IP address.
     * </p>
     * 
     * @param privateIp
     *        The instance's private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPrivateIp(String privateIp) {
        setPrivateIp(privateIp);
        return this;
    }

    /**
     * <p>
     * The instance public DNS name.
     * </p>
     * 
     * @param publicDns
     *        The instance public DNS name.
     */

    public void setPublicDns(String publicDns) {
        this.publicDns = publicDns;
    }

    /**
     * <p>
     * The instance public DNS name.
     * </p>
     * 
     * @return The instance public DNS name.
     */

    public String getPublicDns() {
        return this.publicDns;
    }

    /**
     * <p>
     * The instance public DNS name.
     * </p>
     * 
     * @param publicDns
     *        The instance public DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPublicDns(String publicDns) {
        setPublicDns(publicDns);
        return this;
    }

    /**
     * <p>
     * The instance public IP address.
     * </p>
     * 
     * @param publicIp
     *        The instance public IP address.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The instance public IP address.
     * </p>
     * 
     * @return The instance public IP address.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The instance public IP address.
     * </p>
     * 
     * @param publicIp
     *        The instance public IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * For registered instances, who performed the registration.
     * </p>
     * 
     * @param registeredBy
     *        For registered instances, who performed the registration.
     */

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    /**
     * <p>
     * For registered instances, who performed the registration.
     * </p>
     * 
     * @return For registered instances, who performed the registration.
     */

    public String getRegisteredBy() {
        return this.registeredBy;
    }

    /**
     * <p>
     * For registered instances, who performed the registration.
     * </p>
     * 
     * @param registeredBy
     *        For registered instances, who performed the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withRegisteredBy(String registeredBy) {
        setRegisteredBy(registeredBy);
        return this;
    }

    /**
     * <p>
     * The instance's reported AWS OpsWorks Stacks agent version.
     * </p>
     * 
     * @param reportedAgentVersion
     *        The instance's reported AWS OpsWorks Stacks agent version.
     */

    public void setReportedAgentVersion(String reportedAgentVersion) {
        this.reportedAgentVersion = reportedAgentVersion;
    }

    /**
     * <p>
     * The instance's reported AWS OpsWorks Stacks agent version.
     * </p>
     * 
     * @return The instance's reported AWS OpsWorks Stacks agent version.
     */

    public String getReportedAgentVersion() {
        return this.reportedAgentVersion;
    }

    /**
     * <p>
     * The instance's reported AWS OpsWorks Stacks agent version.
     * </p>
     * 
     * @param reportedAgentVersion
     *        The instance's reported AWS OpsWorks Stacks agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withReportedAgentVersion(String reportedAgentVersion) {
        setReportedAgentVersion(reportedAgentVersion);
        return this;
    }

    /**
     * <p>
     * For registered instances, the reported operating system.
     * </p>
     * 
     * @param reportedOs
     *        For registered instances, the reported operating system.
     */

    public void setReportedOs(ReportedOs reportedOs) {
        this.reportedOs = reportedOs;
    }

    /**
     * <p>
     * For registered instances, the reported operating system.
     * </p>
     * 
     * @return For registered instances, the reported operating system.
     */

    public ReportedOs getReportedOs() {
        return this.reportedOs;
    }

    /**
     * <p>
     * For registered instances, the reported operating system.
     * </p>
     * 
     * @param reportedOs
     *        For registered instances, the reported operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withReportedOs(ReportedOs reportedOs) {
        setReportedOs(reportedOs);
        return this;
    }

    /**
     * <p>
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance's root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * <p>
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @return The instance's root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *         >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public String getRootDeviceType() {
        return this.rootDeviceType;
    }

    /**
     * <p>
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance's root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public Instance withRootDeviceType(String rootDeviceType) {
        setRootDeviceType(rootDeviceType);
        return this;
    }

    /**
     * <p>
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance's root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setRootDeviceType(RootDeviceType rootDeviceType) {
        withRootDeviceType(rootDeviceType);
    }

    /**
     * <p>
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance's root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public Instance withRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * <p>
     * The root device volume ID.
     * </p>
     * 
     * @param rootDeviceVolumeId
     *        The root device volume ID.
     */

    public void setRootDeviceVolumeId(String rootDeviceVolumeId) {
        this.rootDeviceVolumeId = rootDeviceVolumeId;
    }

    /**
     * <p>
     * The root device volume ID.
     * </p>
     * 
     * @return The root device volume ID.
     */

    public String getRootDeviceVolumeId() {
        return this.rootDeviceVolumeId;
    }

    /**
     * <p>
     * The root device volume ID.
     * </p>
     * 
     * @param rootDeviceVolumeId
     *        The root device volume ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withRootDeviceVolumeId(String rootDeviceVolumeId) {
        setRootDeviceVolumeId(rootDeviceVolumeId);
        return this;
    }

    /**
     * <p>
     * An array containing the instance security group IDs.
     * </p>
     * 
     * @return An array containing the instance security group IDs.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * An array containing the instance security group IDs.
     * </p>
     * 
     * @param securityGroupIds
     *        An array containing the instance security group IDs.
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
     * An array containing the instance security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        An array containing the instance security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSecurityGroupIds(String... securityGroupIds) {
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
     * An array containing the instance security group IDs.
     * </p>
     * 
     * @param securityGroupIds
     *        An array containing the instance security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     * </p>
     * 
     * @param sshHostDsaKeyFingerprint
     *        The SSH key's Deep Security Agent (DSA) fingerprint.
     */

    public void setSshHostDsaKeyFingerprint(String sshHostDsaKeyFingerprint) {
        this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
    }

    /**
     * <p>
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     * </p>
     * 
     * @return The SSH key's Deep Security Agent (DSA) fingerprint.
     */

    public String getSshHostDsaKeyFingerprint() {
        return this.sshHostDsaKeyFingerprint;
    }

    /**
     * <p>
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     * </p>
     * 
     * @param sshHostDsaKeyFingerprint
     *        The SSH key's Deep Security Agent (DSA) fingerprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSshHostDsaKeyFingerprint(String sshHostDsaKeyFingerprint) {
        setSshHostDsaKeyFingerprint(sshHostDsaKeyFingerprint);
        return this;
    }

    /**
     * <p>
     * The SSH key's RSA fingerprint.
     * </p>
     * 
     * @param sshHostRsaKeyFingerprint
     *        The SSH key's RSA fingerprint.
     */

    public void setSshHostRsaKeyFingerprint(String sshHostRsaKeyFingerprint) {
        this.sshHostRsaKeyFingerprint = sshHostRsaKeyFingerprint;
    }

    /**
     * <p>
     * The SSH key's RSA fingerprint.
     * </p>
     * 
     * @return The SSH key's RSA fingerprint.
     */

    public String getSshHostRsaKeyFingerprint() {
        return this.sshHostRsaKeyFingerprint;
    }

    /**
     * <p>
     * The SSH key's RSA fingerprint.
     * </p>
     * 
     * @param sshHostRsaKeyFingerprint
     *        The SSH key's RSA fingerprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSshHostRsaKeyFingerprint(String sshHostRsaKeyFingerprint) {
        setSshHostRsaKeyFingerprint(sshHostRsaKeyFingerprint);
        return this;
    }

    /**
     * <p>
     * The instance's Amazon EC2 key-pair name.
     * </p>
     * 
     * @param sshKeyName
     *        The instance's Amazon EC2 key-pair name.
     */

    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }

    /**
     * <p>
     * The instance's Amazon EC2 key-pair name.
     * </p>
     * 
     * @return The instance's Amazon EC2 key-pair name.
     */

    public String getSshKeyName() {
        return this.sshKeyName;
    }

    /**
     * <p>
     * The instance's Amazon EC2 key-pair name.
     * </p>
     * 
     * @param sshKeyName
     *        The instance's Amazon EC2 key-pair name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSshKeyName(String sshKeyName) {
        setSshKeyName(sshKeyName);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The instance status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>booting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection_lost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>online</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>running_setup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>setup_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shutting_down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stop_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminating</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The instance status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>booting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>connection_lost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>online</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rebooting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>running_setup</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>setup_failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shutting_down</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start_failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stop_failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopped</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopping</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminating</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The instance status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>booting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection_lost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>online</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>running_setup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>setup_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shutting_down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stop_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminating</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The instance status:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>booting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>connection_lost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>online</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rebooting</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requested</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>running_setup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>setup_failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>shutting_down</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start_failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stop_failed</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stopped</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>stopping</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terminated</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terminating</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The instance status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>booting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>connection_lost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>online</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rebooting</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requested</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>running_setup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>setup_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>shutting_down</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stop_failed</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopped</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>stopping</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminated</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terminating</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The instance status:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>booting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>connection_lost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>online</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rebooting</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requested</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>running_setup</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>setup_failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>shutting_down</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start_failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stop_failed</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopped</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>stopping</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminated</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terminating</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The instance's subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @param subnetId
     *        The instance's subnet ID; applicable only if the stack is running in a VPC.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The instance's subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @return The instance's subnet ID; applicable only if the stack is running in a VPC.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The instance's subnet ID; applicable only if the stack is running in a VPC.
     * </p>
     * 
     * @param subnetId
     *        The instance's subnet ID; applicable only if the stack is running in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     * </p>
     * 
     * @param tenancy
     *        The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     * </p>
     * 
     * @return The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     * </p>
     * 
     * @param tenancy
     *        The instance's tenancy option, such as <code>dedicated</code> or <code>host</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withTenancy(String tenancy) {
        setTenancy(tenancy);
        return this;
    }

    /**
     * <p>
     * The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @param virtualizationType
     *        The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * @see VirtualizationType
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @return The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * @see VirtualizationType
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @param virtualizationType
     *        The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public Instance withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @param virtualizationType
     *        The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * @see VirtualizationType
     */

    public void setVirtualizationType(VirtualizationType virtualizationType) {
        withVirtualizationType(virtualizationType);
    }

    /**
     * <p>
     * The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @param virtualizationType
     *        The instance's virtualization type: <code>paravirtual</code> or <code>hvm</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public Instance withVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
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
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAutoScalingType() != null)
            sb.append("AutoScalingType: ").append(getAutoScalingType()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: ").append(getEc2InstanceId()).append(",");
        if (getEcsClusterArn() != null)
            sb.append("EcsClusterArn: ").append(getEcsClusterArn()).append(",");
        if (getEcsContainerInstanceArn() != null)
            sb.append("EcsContainerInstanceArn: ").append(getEcsContainerInstanceArn()).append(",");
        if (getElasticIp() != null)
            sb.append("ElasticIp: ").append(getElasticIp()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getInfrastructureClass() != null)
            sb.append("InfrastructureClass: ").append(getInfrastructureClass()).append(",");
        if (getInstallUpdatesOnBoot() != null)
            sb.append("InstallUpdatesOnBoot: ").append(getInstallUpdatesOnBoot()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceProfileArn() != null)
            sb.append("InstanceProfileArn: ").append(getInstanceProfileArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLastServiceErrorId() != null)
            sb.append("LastServiceErrorId: ").append(getLastServiceErrorId()).append(",");
        if (getLayerIds() != null)
            sb.append("LayerIds: ").append(getLayerIds()).append(",");
        if (getOs() != null)
            sb.append("Os: ").append(getOs()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPrivateDns() != null)
            sb.append("PrivateDns: ").append(getPrivateDns()).append(",");
        if (getPrivateIp() != null)
            sb.append("PrivateIp: ").append(getPrivateIp()).append(",");
        if (getPublicDns() != null)
            sb.append("PublicDns: ").append(getPublicDns()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getRegisteredBy() != null)
            sb.append("RegisteredBy: ").append(getRegisteredBy()).append(",");
        if (getReportedAgentVersion() != null)
            sb.append("ReportedAgentVersion: ").append(getReportedAgentVersion()).append(",");
        if (getReportedOs() != null)
            sb.append("ReportedOs: ").append(getReportedOs()).append(",");
        if (getRootDeviceType() != null)
            sb.append("RootDeviceType: ").append(getRootDeviceType()).append(",");
        if (getRootDeviceVolumeId() != null)
            sb.append("RootDeviceVolumeId: ").append(getRootDeviceVolumeId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSshHostDsaKeyFingerprint() != null)
            sb.append("SshHostDsaKeyFingerprint: ").append(getSshHostDsaKeyFingerprint()).append(",");
        if (getSshHostRsaKeyFingerprint() != null)
            sb.append("SshHostRsaKeyFingerprint: ").append(getSshHostRsaKeyFingerprint()).append(",");
        if (getSshKeyName() != null)
            sb.append("SshKeyName: ").append(getSshKeyName()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy()).append(",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: ").append(getVirtualizationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null)
            return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null)
            return false;
        if (other.getEcsClusterArn() != null && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false)
            return false;
        if (other.getEcsContainerInstanceArn() == null ^ this.getEcsContainerInstanceArn() == null)
            return false;
        if (other.getEcsContainerInstanceArn() != null && other.getEcsContainerInstanceArn().equals(this.getEcsContainerInstanceArn()) == false)
            return false;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getInfrastructureClass() == null ^ this.getInfrastructureClass() == null)
            return false;
        if (other.getInfrastructureClass() != null && other.getInfrastructureClass().equals(this.getInfrastructureClass()) == false)
            return false;
        if (other.getInstallUpdatesOnBoot() == null ^ this.getInstallUpdatesOnBoot() == null)
            return false;
        if (other.getInstallUpdatesOnBoot() != null && other.getInstallUpdatesOnBoot().equals(this.getInstallUpdatesOnBoot()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null)
            return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLastServiceErrorId() == null ^ this.getLastServiceErrorId() == null)
            return false;
        if (other.getLastServiceErrorId() != null && other.getLastServiceErrorId().equals(this.getLastServiceErrorId()) == false)
            return false;
        if (other.getLayerIds() == null ^ this.getLayerIds() == null)
            return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false)
            return false;
        if (other.getOs() == null ^ this.getOs() == null)
            return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPrivateDns() == null ^ this.getPrivateDns() == null)
            return false;
        if (other.getPrivateDns() != null && other.getPrivateDns().equals(this.getPrivateDns()) == false)
            return false;
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null)
            return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false)
            return false;
        if (other.getPublicDns() == null ^ this.getPublicDns() == null)
            return false;
        if (other.getPublicDns() != null && other.getPublicDns().equals(this.getPublicDns()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getRegisteredBy() == null ^ this.getRegisteredBy() == null)
            return false;
        if (other.getRegisteredBy() != null && other.getRegisteredBy().equals(this.getRegisteredBy()) == false)
            return false;
        if (other.getReportedAgentVersion() == null ^ this.getReportedAgentVersion() == null)
            return false;
        if (other.getReportedAgentVersion() != null && other.getReportedAgentVersion().equals(this.getReportedAgentVersion()) == false)
            return false;
        if (other.getReportedOs() == null ^ this.getReportedOs() == null)
            return false;
        if (other.getReportedOs() != null && other.getReportedOs().equals(this.getReportedOs()) == false)
            return false;
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null)
            return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false)
            return false;
        if (other.getRootDeviceVolumeId() == null ^ this.getRootDeviceVolumeId() == null)
            return false;
        if (other.getRootDeviceVolumeId() != null && other.getRootDeviceVolumeId().equals(this.getRootDeviceVolumeId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSshHostDsaKeyFingerprint() == null ^ this.getSshHostDsaKeyFingerprint() == null)
            return false;
        if (other.getSshHostDsaKeyFingerprint() != null && other.getSshHostDsaKeyFingerprint().equals(this.getSshHostDsaKeyFingerprint()) == false)
            return false;
        if (other.getSshHostRsaKeyFingerprint() == null ^ this.getSshHostRsaKeyFingerprint() == null)
            return false;
        if (other.getSshHostRsaKeyFingerprint() != null && other.getSshHostRsaKeyFingerprint().equals(this.getSshHostRsaKeyFingerprint()) == false)
            return false;
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null)
            return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn().hashCode());
        hashCode = prime * hashCode + ((getEcsContainerInstanceArn() == null) ? 0 : getEcsContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureClass() == null) ? 0 : getInfrastructureClass().hashCode());
        hashCode = prime * hashCode + ((getInstallUpdatesOnBoot() == null) ? 0 : getInstallUpdatesOnBoot().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLastServiceErrorId() == null) ? 0 : getLastServiceErrorId().hashCode());
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode());
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPrivateDns() == null) ? 0 : getPrivateDns().hashCode());
        hashCode = prime * hashCode + ((getPrivateIp() == null) ? 0 : getPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getPublicDns() == null) ? 0 : getPublicDns().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getRegisteredBy() == null) ? 0 : getRegisteredBy().hashCode());
        hashCode = prime * hashCode + ((getReportedAgentVersion() == null) ? 0 : getReportedAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getReportedOs() == null) ? 0 : getReportedOs().hashCode());
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode());
        hashCode = prime * hashCode + ((getRootDeviceVolumeId() == null) ? 0 : getRootDeviceVolumeId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSshHostDsaKeyFingerprint() == null) ? 0 : getSshHostDsaKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getSshHostRsaKeyFingerprint() == null) ? 0 : getSshHostRsaKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
