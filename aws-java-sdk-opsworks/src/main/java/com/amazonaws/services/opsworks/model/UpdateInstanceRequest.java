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
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#updateInstance(UpdateInstanceRequest) UpdateInstance operation}.
 * <p>
 * Updates a specified instance.
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
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#updateInstance(UpdateInstanceRequest)
 */
public class UpdateInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The instance's layer IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> layerIds;

    /**
     * The instance type, such as <code>t2.micro</code>. For a list of
     * supported instance types, open the stack in the console, choose
     * <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     * contains the currently supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
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
     * following. <ul> <li>A supported Linux operating system: An Amazon
     * Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     * <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     * custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     * the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Operating Systems</a>. <p>The default option is the current
     * Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the AmiId parameter to specify the
     * custom AMI that you want to use. For more information on the supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>. For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>. <note>You can specify a different Linux operating
     * system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.</note>
     */
    private String os;

    /**
     * A custom AMI ID to be used to create the instance. The AMI must be
     * based on one of the supported operating systems. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     */
    private String amiId;

    /**
     * The instance's Amazon EC2 key name.
     */
    private String sshKeyName;

    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     */
    private String architecture;

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or by manually running <code>yum</code> (Amazon Linux)
     * or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     * strongly recommend using the default value of <code>true</code>, to
     * ensure that your instances have the latest security updates. </note>
     */
    private Boolean installUpdatesOnBoot;

    /**
     * This property cannot be updated.
     */
    private Boolean ebsOptimized;

    /**
     * The default AWS OpsWorks agent version. You have the following
     * options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     * version setting.</li> <li><i>version_number</i> - Use the specified
     * agent version. This value overrides the stack's default setting. To
     * update the agent version, you must edit the instance configuration and
     * specify a new version. AWS OpsWorks then automatically installs that
     * version on the instance.</li> </ul> <p>The default setting is
     * <code>INHERIT</code>. To specify an agent version, you must use the
     * complete version number, not the abbreviated number shown on the
     * console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     */
    private String agentVersion;

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
    public UpdateInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance's layer IDs.
     *
     * @return The instance's layer IDs.
     */
    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
              layerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              layerIds.setAutoConstruct(true);
        }
        return layerIds;
    }
    
    /**
     * The instance's layer IDs.
     *
     * @param layerIds The instance's layer IDs.
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
     * The instance's layer IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLayerIds(java.util.Collection)} or {@link
     * #withLayerIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds The instance's layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * The instance's layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds The instance's layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
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
     * The instance type, such as <code>t2.micro</code>. For a list of
     * supported instance types, open the stack in the console, choose
     * <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     * contains the currently supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     *
     * @return The instance type, such as <code>t2.micro</code>. For a list of
     *         supported instance types, open the stack in the console, choose
     *         <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     *         contains the currently supported types. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the <b>API Name</b> column of the
     *         <b>Available Instance Types</b> table.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type, such as <code>t2.micro</code>. For a list of
     * supported instance types, open the stack in the console, choose
     * <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     * contains the currently supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     *
     * @param instanceType The instance type, such as <code>t2.micro</code>. For a list of
     *         supported instance types, open the stack in the console, choose
     *         <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     *         contains the currently supported types. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the <b>API Name</b> column of the
     *         <b>Available Instance Types</b> table.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type, such as <code>t2.micro</code>. For a list of
     * supported instance types, open the stack in the console, choose
     * <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     * contains the currently supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>. The parameter values that you use to specify
     * the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type, such as <code>t2.micro</code>. For a list of
     *         supported instance types, open the stack in the console, choose
     *         <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list
     *         contains the currently supported types. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>. The parameter values that you use to specify
     *         the various types are in the <b>API Name</b> column of the
     *         <b>Available Instance Types</b> table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withInstanceType(String instanceType) {
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
    public UpdateInstanceRequest withAutoScalingType(String autoScalingType) {
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
    public UpdateInstanceRequest withAutoScalingType(AutoScalingType autoScalingType) {
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
    public UpdateInstanceRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * The instance's operating system, which must be set to one of the
     * following. <ul> <li>A supported Linux operating system: An Amazon
     * Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     * <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     * custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     * the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Operating Systems</a>. <p>The default option is the current
     * Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the AmiId parameter to specify the
     * custom AMI that you want to use. For more information on the supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>. For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>. <note>You can specify a different Linux operating
     * system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.</note>
     *
     * @return The instance's operating system, which must be set to one of the
     *         following. <ul> <li>A supported Linux operating system: An Amazon
     *         Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     *         12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     *         <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     *         custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     *         the supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *         OpsWorks Operating Systems</a>. <p>The default option is the current
     *         Amazon Linux version. If you set this parameter to
     *         <code>Custom</code>, you must use the AmiId parameter to specify the
     *         custom AMI that you want to use. For more information on the supported
     *         operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>. For more information on how to use custom AMIs with
     *         OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>. <note>You can specify a different Linux operating
     *         system for the updated stack, but you cannot change from Linux to
     *         Windows or Windows to Linux.</note>
     */
    public String getOs() {
        return os;
    }
    
    /**
     * The instance's operating system, which must be set to one of the
     * following. <ul> <li>A supported Linux operating system: An Amazon
     * Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     * <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     * custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     * the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Operating Systems</a>. <p>The default option is the current
     * Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the AmiId parameter to specify the
     * custom AMI that you want to use. For more information on the supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>. For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>. <note>You can specify a different Linux operating
     * system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.</note>
     *
     * @param os The instance's operating system, which must be set to one of the
     *         following. <ul> <li>A supported Linux operating system: An Amazon
     *         Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     *         12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     *         <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     *         custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     *         the supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *         OpsWorks Operating Systems</a>. <p>The default option is the current
     *         Amazon Linux version. If you set this parameter to
     *         <code>Custom</code>, you must use the AmiId parameter to specify the
     *         custom AMI that you want to use. For more information on the supported
     *         operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>. For more information on how to use custom AMIs with
     *         OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>. <note>You can specify a different Linux operating
     *         system for the updated stack, but you cannot change from Linux to
     *         Windows or Windows to Linux.</note>
     */
    public void setOs(String os) {
        this.os = os;
    }
    
    /**
     * The instance's operating system, which must be set to one of the
     * following. <ul> <li>A supported Linux operating system: An Amazon
     * Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     * 12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     * <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     * custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     * the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     * OpsWorks Operating Systems</a>. <p>The default option is the current
     * Amazon Linux version. If you set this parameter to
     * <code>Custom</code>, you must use the AmiId parameter to specify the
     * custom AMI that you want to use. For more information on the supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     * Systems</a>. For more information on how to use custom AMIs with
     * OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     * Custom AMIs</a>. <note>You can specify a different Linux operating
     * system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param os The instance's operating system, which must be set to one of the
     *         following. <ul> <li>A supported Linux operating system: An Amazon
     *         Linux version, such as <code>Amazon Linux 2015.03</code>, <code>Ubuntu
     *         12.04 LTS</code>, or <code>Ubuntu 14.04 LTS</code>.</li>
     *         <li><code>Microsoft Windows Server 2012 R2 Base</code>.</li> <li>A
     *         custom AMI: <code>Custom</code>.</li> </ul> <p>For more information on
     *         the supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS
     *         OpsWorks Operating Systems</a>. <p>The default option is the current
     *         Amazon Linux version. If you set this parameter to
     *         <code>Custom</code>, you must use the AmiId parameter to specify the
     *         custom AMI that you want to use. For more information on the supported
     *         operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>. For more information on how to use custom AMIs with
     *         OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using
     *         Custom AMIs</a>. <note>You can specify a different Linux operating
     *         system for the updated stack, but you cannot change from Linux to
     *         Windows or Windows to Linux.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * A custom AMI ID to be used to create the instance. The AMI must be
     * based on one of the supported operating systems. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     *
     * @return A custom AMI ID to be used to create the instance. The AMI must be
     *         based on one of the supported operating systems. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     *         <note>If you specify a custom AMI, you must set <code>Os</code> to
     *         <code>Custom</code>.</note>
     */
    public String getAmiId() {
        return amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. The AMI must be
     * based on one of the supported operating systems. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     *
     * @param amiId A custom AMI ID to be used to create the instance. The AMI must be
     *         based on one of the supported operating systems. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     *         <note>If you specify a custom AMI, you must set <code>Os</code> to
     *         <code>Custom</code>.</note>
     */
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }
    
    /**
     * A custom AMI ID to be used to create the instance. The AMI must be
     * based on one of the supported operating systems. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     * <note>If you specify a custom AMI, you must set <code>Os</code> to
     * <code>Custom</code>.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amiId A custom AMI ID to be used to create the instance. The AMI must be
     *         based on one of the supported operating systems. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Instances</a>
     *         <note>If you specify a custom AMI, you must set <code>Os</code> to
     *         <code>Custom</code>.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withAmiId(String amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * The instance's Amazon EC2 key name.
     *
     * @return The instance's Amazon EC2 key name.
     */
    public String getSshKeyName() {
        return sshKeyName;
    }
    
    /**
     * The instance's Amazon EC2 key name.
     *
     * @param sshKeyName The instance's Amazon EC2 key name.
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }
    
    /**
     * The instance's Amazon EC2 key name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKeyName The instance's Amazon EC2 key name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
        return this;
    }

    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @return The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Architecture
     */
    public UpdateInstanceRequest withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @see Architecture
     */
    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The instance architecture. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported
     * by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Families and Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>x86_64, i386
     *
     * @param architecture The instance architecture. Instance types do not necessarily support
     *         both architectures. For a list of the architectures that are supported
     *         by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Architecture
     */
    public UpdateInstanceRequest withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or by manually running <code>yum</code> (Amazon Linux)
     * or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     * strongly recommend using the default value of <code>true</code>, to
     * ensure that your instances have the latest security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or by manually running <code>yum</code> (Amazon Linux)
     *         or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     *         strongly recommend using the default value of <code>true</code>, to
     *         ensure that your instances have the latest security updates. </note>
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
     * stack command or by manually running <code>yum</code> (Amazon Linux)
     * or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     * strongly recommend using the default value of <code>true</code>, to
     * ensure that your instances have the latest security updates. </note>
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or by manually running <code>yum</code> (Amazon Linux)
     *         or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     *         strongly recommend using the default value of <code>true</code>, to
     *         ensure that your instances have the latest security updates. </note>
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
     * stack command or by manually running <code>yum</code> (Amazon Linux)
     * or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     * strongly recommend using the default value of <code>true</code>, to
     * ensure that your instances have the latest security updates. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param installUpdatesOnBoot Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or by manually running <code>yum</code> (Amazon Linux)
     *         or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     *         strongly recommend using the default value of <code>true</code>, to
     *         ensure that your instances have the latest security updates. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        return this;
    }

    /**
     * Whether to install operating system and package updates when the
     * instance boots. The default value is <code>true</code>. To control
     * when updates are installed, set this value to <code>false</code>. You
     * must then update your instances manually by using
     * <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     * stack command or by manually running <code>yum</code> (Amazon Linux)
     * or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     * strongly recommend using the default value of <code>true</code>, to
     * ensure that your instances have the latest security updates. </note>
     *
     * @return Whether to install operating system and package updates when the
     *         instance boots. The default value is <code>true</code>. To control
     *         when updates are installed, set this value to <code>false</code>. You
     *         must then update your instances manually by using
     *         <a>CreateDeployment</a> to run the <code>update_dependencies</code>
     *         stack command or by manually running <code>yum</code> (Amazon Linux)
     *         or <code>apt-get</code> (Ubuntu) on the instances. <note> <p>We
     *         strongly recommend using the default value of <code>true</code>, to
     *         ensure that your instances have the latest security updates. </note>
     */
    public Boolean getInstallUpdatesOnBoot() {
        return installUpdatesOnBoot;
    }

    /**
     * This property cannot be updated.
     *
     * @return This property cannot be updated.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * This property cannot be updated.
     *
     * @param ebsOptimized This property cannot be updated.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * This property cannot be updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized This property cannot be updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * This property cannot be updated.
     *
     * @return This property cannot be updated.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * The default AWS OpsWorks agent version. You have the following
     * options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     * version setting.</li> <li><i>version_number</i> - Use the specified
     * agent version. This value overrides the stack's default setting. To
     * update the agent version, you must edit the instance configuration and
     * specify a new version. AWS OpsWorks then automatically installs that
     * version on the instance.</li> </ul> <p>The default setting is
     * <code>INHERIT</code>. To specify an agent version, you must use the
     * complete version number, not the abbreviated number shown on the
     * console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     *
     * @return The default AWS OpsWorks agent version. You have the following
     *         options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     *         version setting.</li> <li><i>version_number</i> - Use the specified
     *         agent version. This value overrides the stack's default setting. To
     *         update the agent version, you must edit the instance configuration and
     *         specify a new version. AWS OpsWorks then automatically installs that
     *         version on the instance.</li> </ul> <p>The default setting is
     *         <code>INHERIT</code>. To specify an agent version, you must use the
     *         complete version number, not the abbreviated number shown on the
     *         console. For a list of available agent version numbers, call
     *         <a>DescribeAgentVersions</a>.
     */
    public String getAgentVersion() {
        return agentVersion;
    }
    
    /**
     * The default AWS OpsWorks agent version. You have the following
     * options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     * version setting.</li> <li><i>version_number</i> - Use the specified
     * agent version. This value overrides the stack's default setting. To
     * update the agent version, you must edit the instance configuration and
     * specify a new version. AWS OpsWorks then automatically installs that
     * version on the instance.</li> </ul> <p>The default setting is
     * <code>INHERIT</code>. To specify an agent version, you must use the
     * complete version number, not the abbreviated number shown on the
     * console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     *
     * @param agentVersion The default AWS OpsWorks agent version. You have the following
     *         options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     *         version setting.</li> <li><i>version_number</i> - Use the specified
     *         agent version. This value overrides the stack's default setting. To
     *         update the agent version, you must edit the instance configuration and
     *         specify a new version. AWS OpsWorks then automatically installs that
     *         version on the instance.</li> </ul> <p>The default setting is
     *         <code>INHERIT</code>. To specify an agent version, you must use the
     *         complete version number, not the abbreviated number shown on the
     *         console. For a list of available agent version numbers, call
     *         <a>DescribeAgentVersions</a>.
     */
    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }
    
    /**
     * The default AWS OpsWorks agent version. You have the following
     * options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     * version setting.</li> <li><i>version_number</i> - Use the specified
     * agent version. This value overrides the stack's default setting. To
     * update the agent version, you must edit the instance configuration and
     * specify a new version. AWS OpsWorks then automatically installs that
     * version on the instance.</li> </ul> <p>The default setting is
     * <code>INHERIT</code>. To specify an agent version, you must use the
     * complete version number, not the abbreviated number shown on the
     * console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param agentVersion The default AWS OpsWorks agent version. You have the following
     *         options: <ul> <li><code>INHERIT</code> - Use the stack's default agent
     *         version setting.</li> <li><i>version_number</i> - Use the specified
     *         agent version. This value overrides the stack's default setting. To
     *         update the agent version, you must edit the instance configuration and
     *         specify a new version. AWS OpsWorks then automatically installs that
     *         version on the instance.</li> </ul> <p>The default setting is
     *         <code>INHERIT</code>. To specify an agent version, you must use the
     *         complete version number, not the abbreviated number shown on the
     *         console. For a list of available agent version numbers, call
     *         <a>DescribeAgentVersions</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateInstanceRequest withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAutoScalingType() != null) sb.append("AutoScalingType: " + getAutoScalingType() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ",");
        if (getOs() != null) sb.append("Os: " + getOs() + ",");
        if (getAmiId() != null) sb.append("AmiId: " + getAmiId() + ",");
        if (getSshKeyName() != null) sb.append("SshKeyName: " + getSshKeyName() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (isInstallUpdatesOnBoot() != null) sb.append("InstallUpdatesOnBoot: " + isInstallUpdatesOnBoot() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (getAgentVersion() != null) sb.append("AgentVersion: " + getAgentVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode()); 
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode()); 
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((isInstallUpdatesOnBoot() == null) ? 0 : isInstallUpdatesOnBoot().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateInstanceRequest == false) return false;
        UpdateInstanceRequest other = (UpdateInstanceRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
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
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.isInstallUpdatesOnBoot() == null ^ this.isInstallUpdatesOnBoot() == null) return false;
        if (other.isInstallUpdatesOnBoot() != null && other.isInstallUpdatesOnBoot().equals(this.isInstallUpdatesOnBoot()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null) return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateInstanceRequest clone() {
        
            return (UpdateInstanceRequest) super.clone();
    }

}
    