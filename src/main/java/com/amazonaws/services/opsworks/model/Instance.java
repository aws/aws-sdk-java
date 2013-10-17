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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an instance.
 * </p>
 */
public class Instance implements Serializable {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The ID of the associated Amazon EC2 instance.
     */
    private String ec2InstanceId;

    /**
     * The instance host name.
     */
    private String hostname;

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * An array containing the instance layer IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIds;

    /**
     * An array containing the instance security group IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that specify the various
     * types are in the API Name column of the Available Instance Types
     * table.
     */
    private String instanceType;

    /**
     * The ARN of the instance's IAM profile. For more information about IAM
     * ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String instanceProfileArn;

    /**
     * The instance status: <ul> <li>requested</li> <li>booting</li>
     * <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     * <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     * <li>stopped</li> <li>connection_lost</li> </ul>
     */
    private String status;

    /**
     * The instance operating system.
     */
    private String os;

    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     * 12.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     */
    private String amiId;

    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String availabilityZone;

    /**
     * The instance's subnet ID, if the stack is running in a VPC.
     */
    private String subnetId;

    /**
     * The instance public DNS name.
     */
    private String publicDns;

    /**
     * The instance private DNS name.
     */
    private String privateDns;

    /**
     * The instance public IP address.
     */
    private String publicIp;

    /**
     * The instance private IP address.
     */
    private String privateIp;

    /**
     * The instance <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic
     * IP address </a>.
     */
    private String elasticIp;

    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     */
    private String autoScalingType;

    /**
     * The instance SSH key name.
     */
    private String sshKeyName;

    /**
     * The SSH key's RSA fingerprint.
     */
    private String sshHostRsaKeyFingerprint;

    /**
     * The SSH key's DSA fingerprint.
     */
    private String sshHostDsaKeyFingerprint;

    /**
     * The time that the instance was created.
     */
    private String createdAt;

    /**
     * The ID of the last service error. For more information, call
     * <a>DescribeServiceErrors</a>.
     */
    private String lastServiceErrorId;

    /**
     * The instance architecture, "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     */
    private String architecture;

    /**
     * The instance root device type. For more information, see <a
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
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     */
    private Boolean installUpdatesOnBoot;

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
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that specify the various
     * types are in the API Name column of the Available Instance Types
     * table.
     *
     * @return The instance type. AWS OpsWorks supports all instance types except
     *         Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that specify the various
     *         types are in the API Name column of the Available Instance Types
     *         table.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that specify the various
     * types are in the API Name column of the Available Instance Types
     * table.
     *
     * @param instanceType The instance type. AWS OpsWorks supports all instance types except
     *         Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that specify the various
     *         types are in the API Name column of the Available Instance Types
     *         table.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that specify the various
     * types are in the API Name column of the Available Instance Types
     * table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type. AWS OpsWorks supports all instance types except
     *         Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that specify the various
     *         types are in the API Name column of the Available Instance Types
     *         table.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
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
     * The instance status: <ul> <li>requested</li> <li>booting</li>
     * <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     * <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     * <li>stopped</li> <li>connection_lost</li> </ul>
     *
     * @return The instance status: <ul> <li>requested</li> <li>booting</li>
     *         <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     *         <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     *         <li>stopped</li> <li>connection_lost</li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The instance status: <ul> <li>requested</li> <li>booting</li>
     * <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     * <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     * <li>stopped</li> <li>connection_lost</li> </ul>
     *
     * @param status The instance status: <ul> <li>requested</li> <li>booting</li>
     *         <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     *         <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     *         <li>stopped</li> <li>connection_lost</li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The instance status: <ul> <li>requested</li> <li>booting</li>
     * <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     * <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     * <li>stopped</li> <li>connection_lost</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The instance status: <ul> <li>requested</li> <li>booting</li>
     *         <li>running_setup</li> <li>online</li> <li>setup_failed</li>
     *         <li>start_failed</li> <li>terminating</li> <li>terminated</li>
     *         <li>stopped</li> <li>connection_lost</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The instance operating system.
     *
     * @return The instance operating system.
     */
    public String getOs() {
        return os;
    }
    
    /**
     * The instance operating system.
     *
     * @param os The instance operating system.
     */
    public void setOs(String os) {
        this.os = os;
    }
    
    /**
     * The instance operating system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param os The instance operating system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     * 12.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     *
     * @return A custom AMI ID to be used to create the instance. The AMI should be
     *         based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     *         12.04 LTS. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     */
    public String getAmiId() {
        return amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     * 12.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     *
     * @param amiId A custom AMI ID to be used to create the instance. The AMI should be
     *         based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     *         12.04 LTS. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     */
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     * 12.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amiId A custom AMI ID to be used to create the instance. The AMI should be
     *         based on one of the standard AWS OpsWorks APIs: Amazon Linux or Ubuntu
     *         12.04 LTS. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withAmiId(String amiId) {
        this.amiId = amiId;
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
     * The instance's subnet ID, if the stack is running in a VPC.
     *
     * @return The instance's subnet ID, if the stack is running in a VPC.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The instance's subnet ID, if the stack is running in a VPC.
     *
     * @param subnetId The instance's subnet ID, if the stack is running in a VPC.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The instance's subnet ID, if the stack is running in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The instance's subnet ID, if the stack is running in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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
     * The instance private DNS name.
     *
     * @return The instance private DNS name.
     */
    public String getPrivateDns() {
        return privateDns;
    }
    
    /**
     * The instance private DNS name.
     *
     * @param privateDns The instance private DNS name.
     */
    public void setPrivateDns(String privateDns) {
        this.privateDns = privateDns;
    }
    
    /**
     * The instance private DNS name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateDns The instance private DNS name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withPrivateDns(String privateDns) {
        this.privateDns = privateDns;
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
     * The instance private IP address.
     *
     * @return The instance private IP address.
     */
    public String getPrivateIp() {
        return privateIp;
    }
    
    /**
     * The instance private IP address.
     *
     * @param privateIp The instance private IP address.
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }
    
    /**
     * The instance private IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIp The instance private IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
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
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @return The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @see AutoScalingType
     */
    public String getAutoScalingType() {
        return autoScalingType;
    }
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
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
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
    }
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24/7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
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
     * The instance SSH key name.
     *
     * @return The instance SSH key name.
     */
    public String getSshKeyName() {
        return sshKeyName;
    }
    
    /**
     * The instance SSH key name.
     *
     * @param sshKeyName The instance SSH key name.
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }
    
    /**
     * The instance SSH key name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKeyName The instance SSH key name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
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
     * The SSH key's DSA fingerprint.
     *
     * @return The SSH key's DSA fingerprint.
     */
    public String getSshHostDsaKeyFingerprint() {
        return sshHostDsaKeyFingerprint;
    }
    
    /**
     * The SSH key's DSA fingerprint.
     *
     * @param sshHostDsaKeyFingerprint The SSH key's DSA fingerprint.
     */
    public void setSshHostDsaKeyFingerprint(String sshHostDsaKeyFingerprint) {
        this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
    }
    
    /**
     * The SSH key's DSA fingerprint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshHostDsaKeyFingerprint The SSH key's DSA fingerprint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Instance withSshHostDsaKeyFingerprint(String sshHostDsaKeyFingerprint) {
        this.sshHostDsaKeyFingerprint = sshHostDsaKeyFingerprint;
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
     * The instance architecture, "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @return The instance architecture, "i386" or "x86_64".
     *
     * @see Architecture
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The instance architecture, "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture, "i386" or "x86_64".
     *
     * @see Architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The instance architecture, "i386" or "x86_64".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture, "i386" or "x86_64".
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
     * The instance architecture, "i386" or "x86_64".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture, "i386" or "x86_64".
     *
     * @see Architecture
     */
    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The instance architecture, "i386" or "x86_64".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture, "i386" or "x86_64".
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
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
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
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }
    
    /**
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The instance root device type. For more information, see <a
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
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     */
    public Boolean isInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     */
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. If this value
     * is set to <code>false</code>, you must then update your instances
     * manually by using <a>CreateDeployment</a> to run the
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
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
     * <code>update_dependencies</code> stack command or manually running
     * <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     * the instances. <note>We strongly recommend using the default value of
     * <code>true</code>, to ensure that your instances have the latest
     * security updates.</note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. If this value
     *         is set to <code>false</code>, you must then update your instances
     *         manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or manually running
     *         <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on
     *         the instances. <note>We strongly recommend using the default value of
     *         <code>true</code>, to ensure that your instances have the latest
     *         security updates.</note>
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getEc2InstanceId() != null) sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getInstanceProfileArn() != null) sb.append("InstanceProfileArn: " + getInstanceProfileArn() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getOs() != null) sb.append("Os: " + getOs() + ",");
        if (getAmiId() != null) sb.append("AmiId: " + getAmiId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getPublicDns() != null) sb.append("PublicDns: " + getPublicDns() + ",");
        if (getPrivateDns() != null) sb.append("PrivateDns: " + getPrivateDns() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getPrivateIp() != null) sb.append("PrivateIp: " + getPrivateIp() + ",");
        if (getElasticIp() != null) sb.append("ElasticIp: " + getElasticIp() + ",");
        if (getAutoScalingType() != null) sb.append("AutoScalingType: " + getAutoScalingType() + ",");
        if (getSshKeyName() != null) sb.append("SshKeyName: " + getSshKeyName() + ",");
        if (getSshHostRsaKeyFingerprint() != null) sb.append("SshHostRsaKeyFingerprint: " + getSshHostRsaKeyFingerprint() + ",");
        if (getSshHostDsaKeyFingerprint() != null) sb.append("SshHostDsaKeyFingerprint: " + getSshHostDsaKeyFingerprint() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getLastServiceErrorId() != null) sb.append("LastServiceErrorId: " + getLastServiceErrorId() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getRootDeviceType() != null) sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getRootDeviceVolumeId() != null) sb.append("RootDeviceVolumeId: " + getRootDeviceVolumeId() + ",");
        if (isInstallUpdatesOnBoot() != null) sb.append("InstallUpdatesOnBoot: " + isInstallUpdatesOnBoot() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode()); 
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getPublicDns() == null) ? 0 : getPublicDns().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateDns() == null) ? 0 : getPrivateDns().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIp() == null) ? 0 : getPrivateIp().hashCode()); 
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode()); 
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getSshHostRsaKeyFingerprint() == null) ? 0 : getSshHostRsaKeyFingerprint().hashCode()); 
        hashCode = prime * hashCode + ((getSshHostDsaKeyFingerprint() == null) ? 0 : getSshHostDsaKeyFingerprint().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getLastServiceErrorId() == null) ? 0 : getLastServiceErrorId().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceVolumeId() == null) ? 0 : getRootDeviceVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((isInstallUpdatesOnBoot() == null) ? 0 : isInstallUpdatesOnBoot().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Instance == false) return false;
        Instance other = (Instance)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null) return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null) return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getOs() == null ^ this.getOs() == null) return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false) return false; 
        if (other.getAmiId() == null ^ this.getAmiId() == null) return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getPublicDns() == null ^ this.getPublicDns() == null) return false;
        if (other.getPublicDns() != null && other.getPublicDns().equals(this.getPublicDns()) == false) return false; 
        if (other.getPrivateDns() == null ^ this.getPrivateDns() == null) return false;
        if (other.getPrivateDns() != null && other.getPrivateDns().equals(this.getPrivateDns()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getPrivateIp() == null ^ this.getPrivateIp() == null) return false;
        if (other.getPrivateIp() != null && other.getPrivateIp().equals(this.getPrivateIp()) == false) return false; 
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null) return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false) return false; 
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null) return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false) return false; 
        if (other.getSshHostRsaKeyFingerprint() == null ^ this.getSshHostRsaKeyFingerprint() == null) return false;
        if (other.getSshHostRsaKeyFingerprint() != null && other.getSshHostRsaKeyFingerprint().equals(this.getSshHostRsaKeyFingerprint()) == false) return false; 
        if (other.getSshHostDsaKeyFingerprint() == null ^ this.getSshHostDsaKeyFingerprint() == null) return false;
        if (other.getSshHostDsaKeyFingerprint() != null && other.getSshHostDsaKeyFingerprint().equals(this.getSshHostDsaKeyFingerprint()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getLastServiceErrorId() == null ^ this.getLastServiceErrorId() == null) return false;
        if (other.getLastServiceErrorId() != null && other.getLastServiceErrorId().equals(this.getLastServiceErrorId()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null) return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false) return false; 
        if (other.getRootDeviceVolumeId() == null ^ this.getRootDeviceVolumeId() == null) return false;
        if (other.getRootDeviceVolumeId() != null && other.getRootDeviceVolumeId().equals(this.getRootDeviceVolumeId()) == false) return false; 
        if (other.isInstallUpdatesOnBoot() == null ^ this.isInstallUpdatesOnBoot() == null) return false;
        if (other.isInstallUpdatesOnBoot() != null && other.isInstallUpdatesOnBoot().equals(this.isInstallUpdatesOnBoot()) == false) return false; 
        return true;
    }
    
}
    