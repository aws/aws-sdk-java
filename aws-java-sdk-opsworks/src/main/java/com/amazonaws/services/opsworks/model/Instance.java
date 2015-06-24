/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an instance.
 * </p>
 */
public class Instance implements Serializable, Cloneable {

    /**
     * The agent version. This parameter is set to <code>INHERIT</code> if
     * the instance inherits the default stack setting or to a a version
     * number for a fixed agent version.
     */
    private String agentVersion;

    /**
     * A custom AMI ID to be used to create the instance. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     */
    private String amiId;

    /**
     * The instance architecture: "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     */
    private String architecture;

    /**
     * For load-based or time-based instances, the type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     */
    private String autoScalingType;

    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String availabilityZone;

    /**
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block device mappings.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The time that the instance was created.
     */
    private String createdAt;

    /**
     * Whether this is an Amazon EBS-optimized instance.
     */
    private Boolean ebsOptimized;

    /**
     * The ID of the associated Amazon EC2 instance.
     */
    private String ec2InstanceId;

    /**
     * The instance <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     */
    private String elasticIp;

    /**
     * The instance host name.
     */
    private String hostname;

    /**
     * For registered instances, the infrastructure class: <code>ec2</code>
     * or <code>on-premises</code>.
     */
    private String infrastructureClass;

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note> <p>We strongly recommend using the default value
     * of <code>true</code>, to ensure that your instances have the latest
     * security updates. </note>
     */
    private Boolean installUpdatesOnBoot;

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The ARN of the instance's IAM profile. For more information about IAM
     * ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String instanceProfileArn;

    /**
     * The instance type, such as <code>t2.micro</code>.
     */
    private String instanceType;

    /**
     * The ID of the last service error. For more information, call
     * <a>DescribeServiceErrors</a>.
     */
    private String lastServiceErrorId;

    /**
     * An array containing the instance layer IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIds;

    /**
     * The instance's operating system.
     */
    private String os;

    /**
     * The instance's platform.
     */
    private String platform;

    /**
     * The The instance's private DNS name.
     */
    private String privateDns;

    /**
     * The instance's private IP address.
     */
    private String privateIp;

    /**
     * The instance public DNS name.
     */
    private String publicDns;

    /**
     * The instance public IP address.
     */
    private String publicIp;

    /**
     * For registered instances, who performed the registration.
     */
    private String registeredBy;

    /**
     * The instance's reported AWS OpsWorks agent version.
     */
    private String reportedAgentVersion;

    /**
     * For registered instances, the reported operating system.
     */
    private ReportedOs reportedOs;

    /**
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

    /**
     * The root device volume ID.
     */
    private String rootDeviceVolumeId;

    /**
     * An array containing the instance security group IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     */
    private String sshHostDsaKeyFingerprint;

    /**
     * The SSH key's RSA fingerprint.
     */
    private String sshHostRsaKeyFingerprint;

    /**
     * The instance's Amazon EC2 key-pair name.
     */
    private String sshKeyName;

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The instance status: <ul> <li> <code>booting</code> </li> <li>
     * <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     * <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     * <code>requested</code> </li> <li> <code>running_setup</code> </li>
     * <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     * </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     * </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     * </li> <li> <code>terminating</code> </li> </ul>
     */
    private String status;

    /**
     * The instance's subnet ID; applicable only if the stack is running in a
     * VPC.
     */
    private String subnetId;

    /**
     * The instance's virtualization type: <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>paravirtual, hvm
     */
    private String virtualizationType;

    /**
     * The agent version. This parameter is set to <code>INHERIT</code> if
     * the instance inherits the default stack setting or to a a version
     * number for a fixed agent version.
     *
     * @return The agent version. This parameter is set to <code>INHERIT</code> if
     *         the instance inherits the default stack setting or to a a version
     *         number for a fixed agent version.
     */
    public String getAgentVersion() {
        return agentVersion;
    }
    
    /**
     * The agent version. This parameter is set to <code>INHERIT</code> if
     * the instance inherits the default stack setting or to a a version
     * number for a fixed agent version.
     *
     * @param agentVersion The agent version. This parameter is set to <code>INHERIT</code> if
     *         the instance inherits the default stack setting or to a a version
     *         number for a fixed agent version.
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }
    
    /**
     * The agent version. This parameter is set to <code>INHERIT</code> if
     * the instance inherits the default stack setting or to a a version
     * number for a fixed agent version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentVersion The agent version. This parameter is set to <code>INHERIT</code> if
     *         the instance inherits the default stack setting or to a a version
     *         number for a fixed agent version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * A custom AMI ID to be used to create the instance. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     *
     * @return A custom AMI ID to be used to create the instance. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     */
    public String getAmiId() {
        return amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     *
     * @param amiId A custom AMI ID to be used to create the instance. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     */
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amiId A custom AMI ID to be used to create the instance. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withAmiId(String amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * The instance architecture: "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @return The instance architecture: "i386" or "x86_64".
     *
     * @see Architecture
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The instance architecture: "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture: "i386" or "x86_64".
     *
     * @see Architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The instance architecture: "i386" or "x86_64".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture: "i386" or "x86_64".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Architecture
     */
    public Instance withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The instance architecture: "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture: "i386" or "x86_64".
     *
     * @see Architecture
     */
    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The instance architecture: "i386" or "x86_64".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture: "i386" or "x86_64".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Architecture
     */
    public Instance withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * For load-based or time-based instances, the type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @return For load-based or time-based instances, the type.
     *
     * @see AutoScalingType
     */
    public String getAutoScalingType() {
        return autoScalingType;
    }
    
    /**
     * For load-based or time-based instances, the type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type.
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }
    
    /**
     * For load-based or time-based instances, the type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoScalingType
     */
    public Instance withAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
        return this;
    }

    /**
     * For load-based or time-based instances, the type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type.
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
    }
    
    /**
     * For load-based or time-based instances, the type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoScalingType
     */
    public Instance withAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
        return this;
    }

    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param availabilityZone The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The instance Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block device mappings.
     *
     * @return An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block device mappings.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block device mappings.
     *
     * @param blockDeviceMappings An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block device mappings.
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
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block device mappings.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block device mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block device mappings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block device mappings.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
     * The time that the instance was created.
     *
     * @return The time that the instance was created.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * The time that the instance was created.
     *
     * @param createdAt The time that the instance was created.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * The time that the instance was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt The time that the instance was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Whether this is an Amazon EBS-optimized instance.
     *
     * @return Whether this is an Amazon EBS-optimized instance.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Whether this is an Amazon EBS-optimized instance.
     *
     * @param ebsOptimized Whether this is an Amazon EBS-optimized instance.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Whether this is an Amazon EBS-optimized instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Whether this is an Amazon EBS-optimized instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Whether this is an Amazon EBS-optimized instance.
     *
     * @return Whether this is an Amazon EBS-optimized instance.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * The ID of the associated Amazon EC2 instance.
     *
     * @return The ID of the associated Amazon EC2 instance.
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }
    
    /**
     * The ID of the associated Amazon EC2 instance.
     *
     * @param ec2InstanceId The ID of the associated Amazon EC2 instance.
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }
    
    /**
     * The ID of the associated Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2InstanceId The ID of the associated Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * The instance <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     *
     * @return The instance <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address </a>.
     */
    public String getElasticIp() {
        return elasticIp;
    }
    
    /**
     * The instance <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     *
     * @param elasticIp The instance <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address </a>.
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }
    
    /**
     * The instance <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIp The instance <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     *         IP address </a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * The instance host name.
     *
     * @return The instance host name.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The instance host name.
     *
     * @param hostname The instance host name.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The instance host name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostname The instance host name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * For registered instances, the infrastructure class: <code>ec2</code>
     * or <code>on-premises</code>.
     *
     * @return For registered instances, the infrastructure class: <code>ec2</code>
     *         or <code>on-premises</code>.
     */
    public String getInfrastructureClass() {
        return infrastructureClass;
    }
    
    /**
     * For registered instances, the infrastructure class: <code>ec2</code>
     * or <code>on-premises</code>.
     *
     * @param infrastructureClass For registered instances, the infrastructure class: <code>ec2</code>
     *         or <code>on-premises</code>.
     */
    public void setInfrastructureClass(String infrastructureClass) {
        this.infrastructureClass = infrastructureClass;
    }
    
    /**
     * For registered instances, the infrastructure class: <code>ec2</code>
     * or <code>on-premises</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param infrastructureClass For registered instances, the infrastructure class: <code>ec2</code>
     *         or <code>on-premises</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInfrastructureClass(String infrastructureClass) {
        this.infrastructureClass = infrastructureClass;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note> <p>We strongly recommend using the default value
     * of <code>true</code>, to ensure that your instances have the latest
     * security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or by manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note> <p>We strongly recommend using the default value
     *         of <code>true</code>, to ensure that your instances have the latest
     *         security updates. </note>
     */
    public Boolean isInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note> <p>We strongly recommend using the default value
     * of <code>true</code>, to ensure that your instances have the latest
     * security updates. </note>
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or by manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note> <p>We strongly recommend using the default value
     *         of <code>true</code>, to ensure that your instances have the latest
     *         security updates. </note>
     */
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note> <p>We strongly recommend using the default value
     * of <code>true</code>, to ensure that your instances have the latest
     * security updates. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or by manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note> <p>We strongly recommend using the default value
     *         of <code>true</code>, to ensure that your instances have the latest
     *         security updates. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or by manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note> <p>We strongly recommend using the default value
     * of <code>true</code>, to ensure that your instances have the latest
     * security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or by manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note> <p>We strongly recommend using the default value
     *         of <code>true</code>, to ensure that your instances have the latest
     *         security updates. </note>
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The ARN of the instance's IAM profile. For more information about IAM
     * ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The ARN of the instance's IAM profile. For more information about IAM
     *         ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getInstanceProfileArn() {
        return instanceProfileArn;
    }
    
    /**
     * The ARN of the instance's IAM profile. For more information about IAM
     * ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param instanceProfileArn The ARN of the instance's IAM profile. For more information about IAM
     *         ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }
    
    /**
     * The ARN of the instance's IAM profile. For more information about IAM
     * ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProfileArn The ARN of the instance's IAM profile. For more information about IAM
     *         ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
        return this;
    }

    /**
     * The instance type, such as <code>t2.micro</code>.
     *
     * @return The instance type, such as <code>t2.micro</code>.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type, such as <code>t2.micro</code>.
     *
     * @param instanceType The instance type, such as <code>t2.micro</code>.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type, such as <code>t2.micro</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type, such as <code>t2.micro</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The ID of the last service error. For more information, call
     * <a>DescribeServiceErrors</a>.
     *
     * @return The ID of the last service error. For more information, call
     *         <a>DescribeServiceErrors</a>.
     */
    public String getLastServiceErrorId() {
        return lastServiceErrorId;
    }
    
    /**
     * The ID of the last service error. For more information, call
     * <a>DescribeServiceErrors</a>.
     *
     * @param lastServiceErrorId The ID of the last service error. For more information, call
     *         <a>DescribeServiceErrors</a>.
     */
    public void setLastServiceErrorId(String lastServiceErrorId) {
        this.lastServiceErrorId = lastServiceErrorId;
    }
    
    /**
     * The ID of the last service error. For more information, call
     * <a>DescribeServiceErrors</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastServiceErrorId The ID of the last service error. For more information, call
     *         <a>DescribeServiceErrors</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withLastServiceErrorId(String lastServiceErrorId) {
        this.lastServiceErrorId = lastServiceErrorId;
        return this;
    }

    /**
     * An array containing the instance layer IDs.
     *
     * @return An array containing the instance layer IDs.
     */
    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
              layerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              layerIds.setAutoConstruct(true);
        }
        return layerIds;
    }
    
    /**
     * An array containing the instance layer IDs.
     *
     * @param layerIds An array containing the instance layer IDs.
     */
    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(layerIds.size());
        layerIdsCopy.addAll(layerIds);
        this.layerIds = layerIdsCopy;
    }
    
    /**
     * An array containing the instance layer IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLayerIds(java.util.Collection)} or {@link
     * #withLayerIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array containing the instance layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the instance layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array containing the instance layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(layerIds.size());
            layerIdsCopy.addAll(layerIds);
            this.layerIds = layerIdsCopy;
        }

        return this;
    }

    /**
     * The instance's operating system.
     *
     * @return The instance's operating system.
     */
    public String getOs() {
        return os;
    }
    
    /**
     * The instance's operating system.
     *
     * @param os The instance's operating system.
     */
    public void setOs(String os) {
        this.os = os;
    }
    
    /**
     * The instance's operating system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param os The instance's operating system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * The instance's platform.
     *
     * @return The instance's platform.
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The instance's platform.
     *
     * @param platform The instance's platform.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The instance's platform.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The instance's platform.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The The instance's private DNS name.
     *
     * @return The The instance's private DNS name.
     */
    public String getPrivateDns() {
        return privateDns;
    }
    
    /**
     * The The instance's private DNS name.
     *
     * @param privateDns The The instance's private DNS name.
     */
    public void setPrivateDns(String privateDns) {
        this.privateDns = privateDns;
    }
    
    /**
     * The The instance's private DNS name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateDns The The instance's private DNS name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPrivateDns(String privateDns) {
        this.privateDns = privateDns;
        return this;
    }

    /**
     * The instance's private IP address.
     *
     * @return The instance's private IP address.
     */
    public String getPrivateIp() {
        return privateIp;
    }
    
    /**
     * The instance's private IP address.
     *
     * @param privateIp The instance's private IP address.
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }
    
    /**
     * The instance's private IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIp The instance's private IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * The instance public DNS name.
     *
     * @return The instance public DNS name.
     */
    public String getPublicDns() {
        return publicDns;
    }
    
    /**
     * The instance public DNS name.
     *
     * @param publicDns The instance public DNS name.
     */
    public void setPublicDns(String publicDns) {
        this.publicDns = publicDns;
    }
    
    /**
     * The instance public DNS name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicDns The instance public DNS name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPublicDns(String publicDns) {
        this.publicDns = publicDns;
        return this;
    }

    /**
     * The instance public IP address.
     *
     * @return The instance public IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The instance public IP address.
     *
     * @param publicIp The instance public IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The instance public IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The instance public IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * For registered instances, who performed the registration.
     *
     * @return For registered instances, who performed the registration.
     */
    public String getRegisteredBy() {
        return registeredBy;
    }
    
    /**
     * For registered instances, who performed the registration.
     *
     * @param registeredBy For registered instances, who performed the registration.
     */
    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }
    
    /**
     * For registered instances, who performed the registration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param registeredBy For registered instances, who performed the registration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
        return this;
    }

    /**
     * The instance's reported AWS OpsWorks agent version.
     *
     * @return The instance's reported AWS OpsWorks agent version.
     */
    public String getReportedAgentVersion() {
        return reportedAgentVersion;
    }
    
    /**
     * The instance's reported AWS OpsWorks agent version.
     *
     * @param reportedAgentVersion The instance's reported AWS OpsWorks agent version.
     */
    public void setReportedAgentVersion(String reportedAgentVersion) {
        this.reportedAgentVersion = reportedAgentVersion;
    }
    
    /**
     * The instance's reported AWS OpsWorks agent version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reportedAgentVersion The instance's reported AWS OpsWorks agent version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withReportedAgentVersion(String reportedAgentVersion) {
        this.reportedAgentVersion = reportedAgentVersion;
        return this;
    }

    /**
     * For registered instances, the reported operating system.
     *
     * @return For registered instances, the reported operating system.
     */
    public ReportedOs getReportedOs() {
        return reportedOs;
    }
    
    /**
     * For registered instances, the reported operating system.
     *
     * @param reportedOs For registered instances, the reported operating system.
     */
    public void setReportedOs(ReportedOs reportedOs) {
        this.reportedOs = reportedOs;
    }
    
    /**
     * For registered instances, the reported operating system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reportedOs For registered instances, the reported operating system.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withReportedOs(ReportedOs reportedOs) {
        this.reportedOs = reportedOs;
        return this;
    }

    /**
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The instance's root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance's root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance's root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RootDeviceType
     */
    public Instance withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance's root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }
    
    /**
     * The instance's root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance's root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RootDeviceType
     */
    public Instance withRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * The root device volume ID.
     *
     * @return The root device volume ID.
     */
    public String getRootDeviceVolumeId() {
        return rootDeviceVolumeId;
    }
    
    /**
     * The root device volume ID.
     *
     * @param rootDeviceVolumeId The root device volume ID.
     */
    public void setRootDeviceVolumeId(String rootDeviceVolumeId) {
        this.rootDeviceVolumeId = rootDeviceVolumeId;
    }
    
    /**
     * The root device volume ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceVolumeId The root device volume ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withRootDeviceVolumeId(String rootDeviceVolumeId) {
        this.rootDeviceVolumeId = rootDeviceVolumeId;
        return this;
    }

    /**
     * An array containing the instance security group IDs.
     *
     * @return An array containing the instance security group IDs.
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * An array containing the instance security group IDs.
     *
     * @param securityGroupIds An array containing the instance security group IDs.
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
     * An array containing the instance security group IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds An array containing the instance security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * An array containing the instance security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds An array containing the instance security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
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
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     *
     * @return The SSH key's Deep Security Agent (DSA) fingerprint.
     */
    public String getSshHostDsaKeyFingerprint() {
        return sshHostDsaKeyFingerprint;
    }
    
    /**
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     *
     * @param sshHostDsaKeyFingerprint The SSH key's Deep Security Agent (DSA) fingerprint.
     */
    public void setSshHostDsaKeyFingerprint(String sshHostDsaKeyFingerprint) {
        this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
    }
    
    /**
     * The SSH key's Deep Security Agent (DSA) fingerprint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshHostDsaKeyFingerprint The SSH key's Deep Security Agent (DSA) fingerprint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSshHostDsaKeyFingerprint(String sshHostDsaKeyFingerprint) {
        this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
        return this;
    }

    /**
     * The SSH key's RSA fingerprint.
     *
     * @return The SSH key's RSA fingerprint.
     */
    public String getSshHostRsaKeyFingerprint() {
        return sshHostRsaKeyFingerprint;
    }
    
    /**
     * The SSH key's RSA fingerprint.
     *
     * @param sshHostRsaKeyFingerprint The SSH key's RSA fingerprint.
     */
    public void setSshHostRsaKeyFingerprint(String sshHostRsaKeyFingerprint) {
        this.sshHostRsaKeyFingerprint = sshHostRsaKeyFingerprint;
    }
    
    /**
     * The SSH key's RSA fingerprint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshHostRsaKeyFingerprint The SSH key's RSA fingerprint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSshHostRsaKeyFingerprint(String sshHostRsaKeyFingerprint) {
        this.sshHostRsaKeyFingerprint = sshHostRsaKeyFingerprint;
        return this;
    }

    /**
     * The instance's Amazon EC2 key-pair name.
     *
     * @return The instance's Amazon EC2 key-pair name.
     */
    public String getSshKeyName() {
        return sshKeyName;
    }
    
    /**
     * The instance's Amazon EC2 key-pair name.
     *
     * @param sshKeyName The instance's Amazon EC2 key-pair name.
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }
    
    /**
     * The instance's Amazon EC2 key-pair name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKeyName The instance's Amazon EC2 key-pair name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
        return this;
    }

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The instance status: <ul> <li> <code>booting</code> </li> <li>
     * <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     * <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     * <code>requested</code> </li> <li> <code>running_setup</code> </li>
     * <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     * </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     * </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     * </li> <li> <code>terminating</code> </li> </ul>
     *
     * @return The instance status: <ul> <li> <code>booting</code> </li> <li>
     *         <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     *         <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     *         <code>requested</code> </li> <li> <code>running_setup</code> </li>
     *         <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     *         </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     *         </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     *         </li> <li> <code>terminating</code> </li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The instance status: <ul> <li> <code>booting</code> </li> <li>
     * <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     * <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     * <code>requested</code> </li> <li> <code>running_setup</code> </li>
     * <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     * </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     * </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     * </li> <li> <code>terminating</code> </li> </ul>
     *
     * @param status The instance status: <ul> <li> <code>booting</code> </li> <li>
     *         <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     *         <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     *         <code>requested</code> </li> <li> <code>running_setup</code> </li>
     *         <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     *         </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     *         </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     *         </li> <li> <code>terminating</code> </li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The instance status: <ul> <li> <code>booting</code> </li> <li>
     * <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     * <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     * <code>requested</code> </li> <li> <code>running_setup</code> </li>
     * <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     * </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     * </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     * </li> <li> <code>terminating</code> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The instance status: <ul> <li> <code>booting</code> </li> <li>
     *         <code>connection_lost</code> </li> <li> <code>online</code> </li> <li>
     *         <code>pending</code> </li> <li> <code>rebooting</code> </li> <li>
     *         <code>requested</code> </li> <li> <code>running_setup</code> </li>
     *         <li> <code>setup_failed</code> </li> <li> <code>shutting_down</code>
     *         </li> <li> <code>start_failed</code> </li> <li> <code>stopped</code>
     *         </li> <li> <code>stopping</code> </li> <li> <code>terminated</code>
     *         </li> <li> <code>terminating</code> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The instance's subnet ID; applicable only if the stack is running in a
     * VPC.
     *
     * @return The instance's subnet ID; applicable only if the stack is running in a
     *         VPC.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The instance's subnet ID; applicable only if the stack is running in a
     * VPC.
     *
     * @param subnetId The instance's subnet ID; applicable only if the stack is running in a
     *         VPC.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The instance's subnet ID; applicable only if the stack is running in a
     * VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The instance's subnet ID; applicable only if the stack is running in a
     *         VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The instance's virtualization type: <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>paravirtual, hvm
     *
     * @return The instance's virtualization type: <code>paravirtual</code> or
     *         <code>hvm</code>.
     *
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * The instance's virtualization type: <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>paravirtual, hvm
     *
     * @param virtualizationType The instance's virtualization type: <code>paravirtual</code> or
     *         <code>hvm</code>.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * The instance's virtualization type: <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>paravirtual, hvm
     *
     * @param virtualizationType The instance's virtualization type: <code>paravirtual</code> or
     *         <code>hvm</code>.
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
     * The instance's virtualization type: <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>paravirtual, hvm
     *
     * @param virtualizationType The instance's virtualization type: <code>paravirtual</code> or
     *         <code>hvm</code>.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }
    
    /**
     * The instance's virtualization type: <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>paravirtual, hvm
     *
     * @param virtualizationType The instance's virtualization type: <code>paravirtual</code> or
     *         <code>hvm</code>.
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
        if (getAgentVersion() != null) sb.append("AgentVersion: " + getAgentVersion() + ",");
        if (getAmiId() != null) sb.append("AmiId: " + getAmiId() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getAutoScalingType() != null) sb.append("AutoScalingType: " + getAutoScalingType() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (getEc2InstanceId() != null) sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getElasticIp() != null) sb.append("ElasticIp: " + getElasticIp() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getInfrastructureClass() != null) sb.append("InfrastructureClass: " + getInfrastructureClass() + ",");
        if (isInstallUpdatesOnBoot() != null) sb.append("InstallUpdatesOnBoot: " + isInstallUpdatesOnBoot() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceProfileArn() != null) sb.append("InstanceProfileArn: " + getInstanceProfileArn() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getLastServiceErrorId() != null) sb.append("LastServiceErrorId: " + getLastServiceErrorId() + ",");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() + ",");
        if (getOs() != null) sb.append("Os: " + getOs() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getPrivateDns() != null) sb.append("PrivateDns: " + getPrivateDns() + ",");
        if (getPrivateIp() != null) sb.append("PrivateIp: " + getPrivateIp() + ",");
        if (getPublicDns() != null) sb.append("PublicDns: " + getPublicDns() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getRegisteredBy() != null) sb.append("RegisteredBy: " + getRegisteredBy() + ",");
        if (getReportedAgentVersion() != null) sb.append("ReportedAgentVersion: " + getReportedAgentVersion() + ",");
        if (getReportedOs() != null) sb.append("ReportedOs: " + getReportedOs() + ",");
        if (getRootDeviceType() != null) sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getRootDeviceVolumeId() != null) sb.append("RootDeviceVolumeId: " + getRootDeviceVolumeId() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getSshHostDsaKeyFingerprint() != null) sb.append("SshHostDsaKeyFingerprint: " + getSshHostDsaKeyFingerprint() + ",");
        if (getSshHostRsaKeyFingerprint() != null) sb.append("SshHostRsaKeyFingerprint: " + getSshHostRsaKeyFingerprint() + ",");
        if (getSshKeyName() != null) sb.append("SshKeyName: " + getSshKeyName() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getVirtualizationType() != null) sb.append("VirtualizationType: " + getVirtualizationType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode()); 
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getInfrastructureClass() == null) ? 0 : getInfrastructureClass().hashCode()); 
        hashCode = prime * hashCode + ((isInstallUpdatesOnBoot() == null) ? 0 : isInstallUpdatesOnBoot().hashCode()); 
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
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Instance == false) return false;
        Instance other = (Instance)obj;
        
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null) return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false) return false; 
        if (other.getAmiId() == null ^ this.getAmiId() == null) return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null) return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null) return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false) return false; 
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getInfrastructureClass() == null ^ this.getInfrastructureClass() == null) return false;
        if (other.getInfrastructureClass() != null && other.getInfrastructureClass().equals(this.getInfrastructureClass()) == false) return false; 
        if (other.isInstallUpdatesOnBoot() == null ^ this.isInstallUpdatesOnBoot() == null) return false;
        if (other.isInstallUpdatesOnBoot() != null && other.isInstallUpdatesOnBoot().equals(this.isInstallUpdatesOnBoot()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null) return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getLastServiceErrorId() == null ^ this.getLastServiceErrorId() == null) return false;
        if (other.getLastServiceErrorId() != null && other.getLastServiceErrorId().equals(this.getLastServiceErrorId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        if (other.getOs() == null ^ this.getOs() == null) return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getPrivateDns() == null ^ this.getPrivateDns() == null) return false;
        if (other.getPrivateDns() != null && other.getPrivateDns().equals(this.getPrivateDns()) == false) return false; 
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null) return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false) return false; 
        if (other.getPublicDns() == null ^ this.getPublicDns() == null) return false;
        if (other.getPublicDns() != null && other.getPublicDns().equals(this.getPublicDns()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getRegisteredBy() == null ^ this.getRegisteredBy() == null) return false;
        if (other.getRegisteredBy() != null && other.getRegisteredBy().equals(this.getRegisteredBy()) == false) return false; 
        if (other.getReportedAgentVersion() == null ^ this.getReportedAgentVersion() == null) return false;
        if (other.getReportedAgentVersion() != null && other.getReportedAgentVersion().equals(this.getReportedAgentVersion()) == false) return false; 
        if (other.getReportedOs() == null ^ this.getReportedOs() == null) return false;
        if (other.getReportedOs() != null && other.getReportedOs().equals(this.getReportedOs()) == false) return false; 
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null) return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false) return false; 
        if (other.getRootDeviceVolumeId() == null ^ this.getRootDeviceVolumeId() == null) return false;
        if (other.getRootDeviceVolumeId() != null && other.getRootDeviceVolumeId().equals(this.getRootDeviceVolumeId()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getSshHostDsaKeyFingerprint() == null ^ this.getSshHostDsaKeyFingerprint() == null) return false;
        if (other.getSshHostDsaKeyFingerprint() != null && other.getSshHostDsaKeyFingerprint().equals(this.getSshHostDsaKeyFingerprint()) == false) return false; 
        if (other.getSshHostRsaKeyFingerprint() == null ^ this.getSshHostRsaKeyFingerprint() == null) return false;
        if (other.getSshHostRsaKeyFingerprint() != null && other.getSshHostRsaKeyFingerprint().equals(this.getSshHostRsaKeyFingerprint()) == false) return false; 
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null) return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null) return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false) return false; 
        return true;
    }
    
    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    