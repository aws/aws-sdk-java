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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createInstance(CreateInstanceRequest) CreateInstance operation}.
 * <p>
 * Creates an instance in a specified stack. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a>
 * .
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack, or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createInstance(CreateInstanceRequest)
 */
public class CreateInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * An array that contains the instance layer IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIds;

    /**
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     */
    private String instanceType;

    /**
     * For load-based or time-based instances, the type. Windows stacks can
     * use only time-based instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     */
    private String autoScalingType;

    /**
     * The instance host name.
     */
    private String hostname;

    /**
     * The instance's operating system, which must be set to one of the
     * following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     * <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     * Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     * AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     * current Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     * AmiId parameter to specify the custom AMI that you want to use. For
     * more information on the standard operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>.
     */
    private String os;

    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     * 12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     */
    private String amiId;

    /**
     * The instance's Amazon EC2 key pair name.
     */
    private String sshKeyName;

    /**
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String availabilityZone;

    /**
     * The instance's virtualization type, <code>paravirtual</code> or
     * <code>hvm</code>.
     */
    private String virtualizationType;

    /**
     * The ID of the instance's subnet. If the stack is running in a VPC, you
     * can use this parameter to override the stack's default subnet ID value
     * and direct AWS OpsWorks to launch the instance in a different subnet.
     */
    private String subnetId;

    /**
     * The instance architecture. The default option is <code>x86_64</code>.
     * Instance types do not necessarily support both architectures. For a
     * list of the architectures that are supported by the different instance
     * types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
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
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block devices. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code> to ensure that
     * your instances have the latest security updates. </note>
     */
    private Boolean installUpdatesOnBoot;

    /**
     * Whether to create an Amazon EBS-optimized instance.
     */
    private Boolean ebsOptimized;

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
    public CreateInstanceRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * An array that contains the instance layer IDs.
     *
     * @return An array that contains the instance layer IDs.
     */
    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
              layerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              layerIds.setAutoConstruct(true);
        }
        return layerIds;
    }
    
    /**
     * An array that contains the instance layer IDs.
     *
     * @param layerIds An array that contains the instance layer IDs.
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
     * An array that contains the instance layer IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLayerIds(java.util.Collection)} or {@link
     * #withLayerIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array that contains the instance layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * An array that contains the instance layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds An array that contains the instance layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
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
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     *
     * @return The instance type. AWS OpsWorks supports all instance types except
     *         Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the API Name column of the Available Instance
     *         Types table.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     *
     * @param instanceType The instance type. AWS OpsWorks supports all instance types except
     *         Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the API Name column of the Available Instance
     *         Types table.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. AWS OpsWorks supports all instance types except
     * Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the API Name column of the Available Instance
     * Types table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type. AWS OpsWorks supports all instance types except
     *         Cluster Compute, Cluster GPU, and High Memory Cluster. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the API Name column of the Available Instance
     *         Types table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * For load-based or time-based instances, the type. Windows stacks can
     * use only time-based instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @return For load-based or time-based instances, the type. Windows stacks can
     *         use only time-based instances.
     *
     * @see AutoScalingType
     */
    public String getAutoScalingType() {
        return autoScalingType;
    }
    
    /**
     * For load-based or time-based instances, the type. Windows stacks can
     * use only time-based instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type. Windows stacks can
     *         use only time-based instances.
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }
    
    /**
     * For load-based or time-based instances, the type. Windows stacks can
     * use only time-based instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type. Windows stacks can
     *         use only time-based instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoScalingType
     */
    public CreateInstanceRequest withAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
        return this;
    }

    /**
     * For load-based or time-based instances, the type. Windows stacks can
     * use only time-based instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type. Windows stacks can
     *         use only time-based instances.
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
    }
    
    /**
     * For load-based or time-based instances, the type. Windows stacks can
     * use only time-based instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>load, timer
     *
     * @param autoScalingType For load-based or time-based instances, the type. Windows stacks can
     *         use only time-based instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AutoScalingType
     */
    public CreateInstanceRequest withAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
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
    public CreateInstanceRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * The instance's operating system, which must be set to one of the
     * following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     * <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     * Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     * AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     * current Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     * AmiId parameter to specify the custom AMI that you want to use. For
     * more information on the standard operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>.
     *
     * @return The instance's operating system, which must be set to one of the
     *         following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     *         <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     *         Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     *         12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     *         AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     *         current Amazon Linux version. If you set this parameter to
     *         <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     *         AmiId parameter to specify the custom AMI that you want to use. For
     *         more information on the standard operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>For more information on how to use custom AMIs with
     *         OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>.
     */
    public String getOs() {
        return os;
    }
    
    /**
     * The instance's operating system, which must be set to one of the
     * following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     * <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     * Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     * AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     * current Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     * AmiId parameter to specify the custom AMI that you want to use. For
     * more information on the standard operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>.
     *
     * @param os The instance's operating system, which must be set to one of the
     *         following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     *         <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     *         Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     *         12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     *         AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     *         current Amazon Linux version. If you set this parameter to
     *         <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     *         AmiId parameter to specify the custom AMI that you want to use. For
     *         more information on the standard operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>For more information on how to use custom AMIs with
     *         OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>.
     */
    public void setOs(String os) {
        this.os = os;
    }
    
    /**
     * The instance's operating system, which must be set to one of the
     * following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     * <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     * Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     * AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     * current Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     * AmiId parameter to specify the custom AMI that you want to use. For
     * more information on the standard operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param os The instance's operating system, which must be set to one of the
     *         following. <p>For Windows stacks: Microsoft Windows Server 2012 R2.
     *         <p>For Linux stacks: <ul> <li>Standard operating systems: an Amazon
     *         Linux version such as <code>Amazon Linux 2014.09</code>, <code>Ubuntu
     *         12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li> <li>Custom
     *         AMIs: <code>Custom</code></li> </ul> <p>The default option is the
     *         current Amazon Linux version. If you set this parameter to
     *         <code>Custom</code>, you must use the <a>CreateInstance</a> action's
     *         AmiId parameter to specify the custom AMI that you want to use. For
     *         more information on the standard operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>For more information on how to use custom AMIs with
     *         OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     * 12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     *
     * @return A custom AMI ID to be used to create the instance. The AMI should be
     *         based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     *         12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     *         <note>If you specify a custom AMI, you must set <code>Os</code> to
     *         <code>Custom</code>.</note>
     */
    public String getAmiId() {
        return amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     * 12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     *
     * @param amiId A custom AMI ID to be used to create the instance. The AMI should be
     *         based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     *         12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     *         <note>If you specify a custom AMI, you must set <code>Os</code> to
     *         <code>Custom</code>.</note>
     */
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. The AMI should be
     * based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     * 12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amiId A custom AMI ID to be used to create the instance. The AMI should be
     *         based on one of the standard AWS OpsWorks AMIs: Amazon Linux, Ubuntu
     *         12.04 LTS, or Ubuntu 14.04 LTS. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances.html">Instances</a>.
     *         <note>If you specify a custom AMI, you must set <code>Os</code> to
     *         <code>Custom</code>.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withAmiId(String amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * The instance's Amazon EC2 key pair name.
     *
     * @return The instance's Amazon EC2 key pair name.
     */
    public String getSshKeyName() {
        return sshKeyName;
    }
    
    /**
     * The instance's Amazon EC2 key pair name.
     *
     * @param sshKeyName The instance's Amazon EC2 key pair name.
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }
    
    /**
     * The instance's Amazon EC2 key pair name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKeyName The instance's Amazon EC2 key pair name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
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
    public CreateInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The instance's virtualization type, <code>paravirtual</code> or
     * <code>hvm</code>.
     *
     * @return The instance's virtualization type, <code>paravirtual</code> or
     *         <code>hvm</code>.
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * The instance's virtualization type, <code>paravirtual</code> or
     * <code>hvm</code>.
     *
     * @param virtualizationType The instance's virtualization type, <code>paravirtual</code> or
     *         <code>hvm</code>.
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * The instance's virtualization type, <code>paravirtual</code> or
     * <code>hvm</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualizationType The instance's virtualization type, <code>paravirtual</code> or
     *         <code>hvm</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * The ID of the instance's subnet. If the stack is running in a VPC, you
     * can use this parameter to override the stack's default subnet ID value
     * and direct AWS OpsWorks to launch the instance in a different subnet.
     *
     * @return The ID of the instance's subnet. If the stack is running in a VPC, you
     *         can use this parameter to override the stack's default subnet ID value
     *         and direct AWS OpsWorks to launch the instance in a different subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the instance's subnet. If the stack is running in a VPC, you
     * can use this parameter to override the stack's default subnet ID value
     * and direct AWS OpsWorks to launch the instance in a different subnet.
     *
     * @param subnetId The ID of the instance's subnet. If the stack is running in a VPC, you
     *         can use this parameter to override the stack's default subnet ID value
     *         and direct AWS OpsWorks to launch the instance in a different subnet.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the instance's subnet. If the stack is running in a VPC, you
     * can use this parameter to override the stack's default subnet ID value
     * and direct AWS OpsWorks to launch the instance in a different subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the instance's subnet. If the stack is running in a VPC, you
     *         can use this parameter to override the stack's default subnet ID value
     *         and direct AWS OpsWorks to launch the instance in a different subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The instance architecture. The default option is <code>x86_64</code>.
     * Instance types do not necessarily support both architectures. For a
     * list of the architectures that are supported by the different instance
     * types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @return The instance architecture. The default option is <code>x86_64</code>.
     *         Instance types do not necessarily support both architectures. For a
     *         list of the architectures that are supported by the different instance
     *         types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The instance architecture. The default option is <code>x86_64</code>.
     * Instance types do not necessarily support both architectures. For a
     * list of the architectures that are supported by the different instance
     * types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. The default option is <code>x86_64</code>.
     *         Instance types do not necessarily support both architectures. For a
     *         list of the architectures that are supported by the different instance
     *         types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The instance architecture. The default option is <code>x86_64</code>.
     * Instance types do not necessarily support both architectures. For a
     * list of the architectures that are supported by the different instance
     * types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. The default option is <code>x86_64</code>.
     *         Instance types do not necessarily support both architectures. For a
     *         list of the architectures that are supported by the different instance
     *         types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Architecture
     */
    public CreateInstanceRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The instance architecture. The default option is <code>x86_64</code>.
     * Instance types do not necessarily support both architectures. For a
     * list of the architectures that are supported by the different instance
     * types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. The default option is <code>x86_64</code>.
     *         Instance types do not necessarily support both architectures. For a
     *         list of the architectures that are supported by the different instance
     *         types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The instance architecture. The default option is <code>x86_64</code>.
     * Instance types do not necessarily support both architectures. For a
     * list of the architectures that are supported by the different instance
     * types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. The default option is <code>x86_64</code>.
     *         Instance types do not necessarily support both architectures. For a
     *         list of the architectures that are supported by the different instance
     *         types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Architecture
     */
    public CreateInstanceRequest withArchitecture(Architecture architecture) {
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
    public CreateInstanceRequest withRootDeviceType(String rootDeviceType) {
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
    public CreateInstanceRequest withRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block devices. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a>.
     *
     * @return An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block devices. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a>.
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
     * instance's block devices. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a>.
     *
     * @param blockDeviceMappings An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block devices. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a>.
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
     * instance's block devices. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block devices. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>BlockDeviceMapping</code> objects that specify the
     * instance's block devices. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     * Device Mapping</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings An array of <code>BlockDeviceMapping</code> objects that specify the
     *         instance's block devices. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block
     *         Device Mapping</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code> to ensure that
     * your instances have the latest security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code> to ensure that
     *         your instances have the latest security updates. </note>
     */
    public Boolean isInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code> to ensure that
     * your instances have the latest security updates. </note>
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code> to ensure that
     *         your instances have the latest security updates. </note>
     */
    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }
    
    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code> to ensure that
     * your instances have the latest security updates. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code> to ensure that
     *         your instances have the latest security updates. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or manually running <code>yum</code> (Amazon Linux) or
     * <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     * recommend using the default value of <code>true</code> to ensure that
     * your instances have the latest security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We strongly
     *         recommend using the default value of <code>true</code> to ensure that
     *         your instances have the latest security updates. </note>
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * Whether to create an Amazon EBS-optimized instance.
     *
     * @return Whether to create an Amazon EBS-optimized instance.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Whether to create an Amazon EBS-optimized instance.
     *
     * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Whether to create an Amazon EBS-optimized instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Whether to create an Amazon EBS-optimized instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateInstanceRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Whether to create an Amazon EBS-optimized instance.
     *
     * @return Whether to create an Amazon EBS-optimized instance.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAutoScalingType() != null) sb.append("AutoScalingType: " + getAutoScalingType() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getOs() != null) sb.append("Os: " + getOs() + ",");
        if (getAmiId() != null) sb.append("AmiId: " + getAmiId() + ",");
        if (getSshKeyName() != null) sb.append("SshKeyName: " + getSshKeyName() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVirtualizationType() != null) sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getRootDeviceType() != null) sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (isInstallUpdatesOnBoot() != null) sb.append("InstallUpdatesOnBoot: " + isInstallUpdatesOnBoot() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode()); 
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode()); 
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((isInstallUpdatesOnBoot() == null) ? 0 : isInstallUpdatesOnBoot().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInstanceRequest == false) return false;
        CreateInstanceRequest other = (CreateInstanceRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null) return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getOs() == null ^ this.getOs() == null) return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false) return false; 
        if (other.getAmiId() == null ^ this.getAmiId() == null) return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false) return false; 
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null) return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null) return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null) return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.isInstallUpdatesOnBoot() == null ^ this.isInstallUpdatesOnBoot() == null) return false;
        if (other.isInstallUpdatesOnBoot() != null && other.isInstallUpdatesOnBoot().equals(this.isInstallUpdatesOnBoot()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateInstanceRequest clone() {
        
            return (CreateInstanceRequest) super.clone();
    }

}
    