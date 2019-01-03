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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * An array that contains the instance's layer IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> layerIds;
    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack in the
     * console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the currently
     * supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * The parameter values that you use to specify the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * </p>
     */
    private String autoScalingType;
    /**
     * <p>
     * The instance host name.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The instance's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     * <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want to use. Block
     * device mappings are not supported if the value is <code>Custom</code>. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>For
     * more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     */
    private String os;
    /**
     * <p>
     * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating
     * systems. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     * </p>
     * </note>
     */
    private String amiId;
    /**
     * <p>
     * The instance's Amazon EC2 key-pair name.
     * </p>
     */
    private String sshKeyName;
    /**
     * <p>
     * The instance Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     */
    private String virtualizationType;
    /**
     * <p>
     * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the
     * stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     */
    private String rootDeviceType;
    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code> to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     */
    private Boolean installUpdatesOnBoot;
    /**
     * <p>
     * Whether to create an Amazon EBS-optimized instance.
     * </p>
     */
    private Boolean ebsOptimized;
    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INHERIT</code> - Use the stack's default agent version setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>version_number</i> - Use the specified agent version. This value overrides the stack's default setting. To
     * update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then
     * automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit
     * tenancy settings from the VPC. The following are valid values for this parameter: <code>dedicated</code>,
     * <code>default</code>, or <code>host</code>. Because there are costs associated with changes in tenancy options,
     * we recommend that you research tenancy options before choosing them for your instances. For more information
     * about dedicated hosts, see <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and
     * <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information about
     * dedicated instances, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> and
     * <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2 Dedicated Instances</a>.
     * </p>
     */
    private String tenancy;

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

    public CreateInstanceRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * An array that contains the instance's layer IDs.
     * </p>
     * 
     * @return An array that contains the instance's layer IDs.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * An array that contains the instance's layer IDs.
     * </p>
     * 
     * @param layerIds
     *        An array that contains the instance's layer IDs.
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
     * An array that contains the instance's layer IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerIds(java.util.Collection)} or {@link #withLayerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerIds
     *        An array that contains the instance's layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withLayerIds(String... layerIds) {
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
     * An array that contains the instance's layer IDs.
     * </p>
     * 
     * @param layerIds
     *        An array that contains the instance's layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
        setLayerIds(layerIds);
        return this;
    }

    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack in the
     * console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the currently
     * supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * The parameter values that you use to specify the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack
     *        in the console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the
     *        currently supported types. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *        Types</a>. The parameter values that you use to specify the various types are in the <b>API Name</b>
     *        column of the <b>Available Instance Types</b> table.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack in the
     * console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the currently
     * supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * The parameter values that you use to specify the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     * </p>
     * 
     * @return The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack
     *         in the console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the
     *         currently supported types. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *         Types</a>. The parameter values that you use to specify the various types are in the <b>API Name</b>
     *         column of the <b>Available Instance Types</b> table.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack in the
     * console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the currently
     * supported types. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * The parameter values that you use to specify the various types are in the <b>API Name</b> column of the
     * <b>Available Instance Types</b> table.
     * </p>
     * 
     * @param instanceType
     *        The instance type, such as <code>t2.micro</code>. For a list of supported instance types, open the stack
     *        in the console, choose <b>Instances</b>, and choose <b>+ Instance</b>. The <b>Size</b> list contains the
     *        currently supported types. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *        Types</a>. The parameter values that you use to specify the various types are in the <b>API Name</b>
     *        column of the <b>Available Instance Types</b> table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * @see AutoScalingType
     */

    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * </p>
     * 
     * @return For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * @see AutoScalingType
     */

    public String getAutoScalingType() {
        return this.autoScalingType;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingType
     */

    public CreateInstanceRequest withAutoScalingType(String autoScalingType) {
        setAutoScalingType(autoScalingType);
        return this;
    }

    /**
     * <p>
     * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * @see AutoScalingType
     */

    public void setAutoScalingType(AutoScalingType autoScalingType) {
        withAutoScalingType(autoScalingType);
    }

    /**
     * <p>
     * For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * </p>
     * 
     * @param autoScalingType
     *        For load-based or time-based instances, the type. Windows stacks can use only time-based instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingType
     */

    public CreateInstanceRequest withAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
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

    public CreateInstanceRequest withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The instance's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     * <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want to use. Block
     * device mappings are not supported if the value is <code>Custom</code>. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>For
     * more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * 
     * @param os
     *        The instance's operating system, which must be set to one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     *        <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     *        <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>,
     *        or <code>Ubuntu 12.04 LTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CentOS Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Red Hat Enterprise Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom AMI: <code>Custom</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about the supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *        Operating Systems</a>.
     *        </p>
     *        <p>
     *        The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>,
     *        you must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want to
     *        use. Block device mappings are not supported if the value is <code>Custom</code>. For more information
     *        about supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *        Systems</a>For more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     */

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * <p>
     * The instance's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     * <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want to use. Block
     * device mappings are not supported if the value is <code>Custom</code>. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>For
     * more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * 
     * @return The instance's operating system, which must be set to one of the following.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     *         <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     *         <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>
     *         , or <code>Ubuntu 12.04 LTS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CentOS Linux 7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Red Hat Enterprise Linux 7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *         <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A custom AMI: <code>Custom</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about the supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *         Operating Systems</a>.
     *         </p>
     *         <p>
     *         The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>,
     *         you must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want
     *         to use. Block device mappings are not supported if the value is <code>Custom</code>. For more information
     *         about supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>For more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *         AMIs</a>.
     */

    public String getOs() {
        return this.os;
    }

    /**
     * <p>
     * The instance's operating system, which must be set to one of the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     * <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     * <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>, or
     * <code>Ubuntu 12.04 LTS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CentOS Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Red Hat Enterprise Linux 7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     * <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A custom AMI: <code>Custom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about the supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want to use. Block
     * device mappings are not supported if the value is <code>Custom</code>. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>For
     * more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * 
     * @param os
     *        The instance's operating system, which must be set to one of the following.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        A supported Linux operating system: An Amazon Linux version, such as <code>Amazon Linux 2017.09</code>,
     *        <code>Amazon Linux 2017.03</code>, <code>Amazon Linux 2016.09</code>, <code>Amazon Linux 2016.03</code>,
     *        <code>Amazon Linux 2015.09</code>, or <code>Amazon Linux 2015.03</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Ubuntu operating system, such as <code>Ubuntu 16.04 LTS</code>, <code>Ubuntu 14.04 LTS</code>,
     *        or <code>Ubuntu 12.04 LTS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CentOS Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Red Hat Enterprise Linux 7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A supported Windows operating system, such as <code>Microsoft Windows Server 2012 R2 Base</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Express</code>,
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Standard</code>, or
     *        <code>Microsoft Windows Server 2012 R2 with SQL Server Web</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A custom AMI: <code>Custom</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about the supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *        Operating Systems</a>.
     *        </p>
     *        <p>
     *        The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>,
     *        you must use the <a>CreateInstance</a> action's AmiId parameter to specify the custom AMI that you want to
     *        use. Block device mappings are not supported if the value is <code>Custom</code>. For more information
     *        about supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *        Systems</a>For more information about how to use custom AMIs with AWS OpsWorks Stacks, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withOs(String os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating
     * systems. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     * </p>
     * </note>
     * 
     * @param amiId
     *        A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported
     *        operating systems. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.</p> <note>
     *        <p>
     *        If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     *        </p>
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating
     * systems. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     * </p>
     * </note>
     * 
     * @return A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported
     *         operating systems. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *         AMIs</a>.</p> <note>
     *         <p>
     *         If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     *         </p>
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported operating
     * systems. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     * </p>
     * </note>
     * 
     * @param amiId
     *        A custom AMI ID to be used to create the instance. The AMI should be based on one of the supported
     *        operating systems. For more information, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.</p> <note>
     *        <p>
     *        If you specify a custom AMI, you must set <code>Os</code> to <code>Custom</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withAmiId(String amiId) {
        setAmiId(amiId);
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

    public CreateInstanceRequest withSshKeyName(String sshKeyName) {
        setSshKeyName(sshKeyName);
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

    public CreateInstanceRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @param virtualizationType
     *        The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @return The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     * </p>
     * 
     * @param virtualizationType
     *        The instance's virtualization type, <code>paravirtual</code> or <code>hvm</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the
     * stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override
     *        the stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different
     *        subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the
     * stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     * </p>
     * 
     * @return The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override
     *         the stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different
     *         subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the
     * stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override
     *        the stack's default subnet ID value and direct AWS OpsWorks Stacks to launch the instance in a different
     *        subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily
     *        support both architectures. For a list of the architectures that are supported by the different instance
     *        types, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *        Families and Types</a>.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @return The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily
     *         support both architectures. For a list of the architectures that are supported by the different instance
     *         types, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Families and Types</a>.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily
     *        support both architectures. For a list of the architectures that are supported by the different instance
     *        types, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *        Families and Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public CreateInstanceRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily
     *        support both architectures. For a list of the architectures that are supported by the different instance
     *        types, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *        Families and Types</a>.
     * @see Architecture
     */

    public void setArchitecture(Architecture architecture) {
        withArchitecture(architecture);
    }

    /**
     * <p>
     * The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily support
     * both architectures. For a list of the architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. The default option is <code>x86_64</code>. Instance types do not necessarily
     *        support both architectures. For a list of the architectures that are supported by the different instance
     *        types, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *        Families and Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public CreateInstanceRequest withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * <p>
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @return The instance root device type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *         >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public String getRootDeviceType() {
        return this.rootDeviceType;
    }

    /**
     * <p>
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public CreateInstanceRequest withRootDeviceType(String rootDeviceType) {
        setRootDeviceType(rootDeviceType);
        return this;
    }

    /**
     * <p>
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @see RootDeviceType
     */

    public void setRootDeviceType(RootDeviceType rootDeviceType) {
        withRootDeviceType(rootDeviceType);
    }

    /**
     * <p>
     * The instance root device type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * </p>
     * 
     * @param rootDeviceType
     *        The instance root device type. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device"
     *        >Storage for the Root Device</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RootDeviceType
     */

    public CreateInstanceRequest withRootDeviceType(RootDeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * </p>
     * 
     * @return An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *         Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * </p>
     * 
     * @param blockDeviceMappings
     *        An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a>. Note that block device mappings are not supported for custom AMIs.
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
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     * Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * </p>
     * 
     * @param blockDeviceMappings
     *        An array of <code>BlockDeviceMapping</code> objects that specify the instance's block devices. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html">Block Device
     *        Mapping</a>. Note that block device mappings are not supported for custom AMIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code> to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @param installUpdatesOnBoot
     *        Whether to install operating system and package updates when the instance boots. The default value is
     *        <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *        then update your instances manually by using <a>CreateDeployment</a> to run the
     *        <code>update_dependencies</code> stack command or by manually running <code>yum</code> (Amazon Linux) or
     *        <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code> to ensure that your instances have the
     *        latest security updates.
     *        </p>
     */

    public void setInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        this.installUpdatesOnBoot = installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code> to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @return Whether to install operating system and package updates when the instance boots. The default value is
     *         <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *         then update your instances manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or by manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *         <p>
     *         We strongly recommend using the default value of <code>true</code> to ensure that your instances have the
     *         latest security updates.
     *         </p>
     */

    public Boolean getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code> to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @param installUpdatesOnBoot
     *        Whether to install operating system and package updates when the instance boots. The default value is
     *        <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *        then update your instances manually by using <a>CreateDeployment</a> to run the
     *        <code>update_dependencies</code> stack command or by manually running <code>yum</code> (Amazon Linux) or
     *        <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code> to ensure that your instances have the
     *        latest security updates.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
        setInstallUpdatesOnBoot(installUpdatesOnBoot);
        return this;
    }

    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code> to ensure that your instances have the latest
     * security updates.
     * </p>
     * </note>
     * 
     * @return Whether to install operating system and package updates when the instance boots. The default value is
     *         <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *         then update your instances manually by using <a>CreateDeployment</a> to run the
     *         <code>update_dependencies</code> stack command or by manually running <code>yum</code> (Amazon Linux) or
     *         <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *         <p>
     *         We strongly recommend using the default value of <code>true</code> to ensure that your instances have the
     *         latest security updates.
     *         </p>
     */

    public Boolean isInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * Whether to create an Amazon EBS-optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Whether to create an Amazon EBS-optimized instance.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Whether to create an Amazon EBS-optimized instance.
     * </p>
     * 
     * @return Whether to create an Amazon EBS-optimized instance.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Whether to create an Amazon EBS-optimized instance.
     * </p>
     * 
     * @param ebsOptimized
     *        Whether to create an Amazon EBS-optimized instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Whether to create an Amazon EBS-optimized instance.
     * </p>
     * 
     * @return Whether to create an Amazon EBS-optimized instance.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INHERIT</code> - Use the stack's default agent version setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>version_number</i> - Use the specified agent version. This value overrides the stack's default setting. To
     * update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then
     * automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * 
     * @param agentVersion
     *        The default AWS OpsWorks Stacks agent version. You have the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INHERIT</code> - Use the stack's default agent version setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>version_number</i> - Use the specified agent version. This value overrides the stack's default setting.
     *        To update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks
     *        Stacks then automatically installs that version on the instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete
     *        version number, not the abbreviated number shown on the console. For a list of available agent version
     *        numbers, call <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INHERIT</code> - Use the stack's default agent version setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>version_number</i> - Use the specified agent version. This value overrides the stack's default setting. To
     * update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then
     * automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * 
     * @return The default AWS OpsWorks Stacks agent version. You have the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INHERIT</code> - Use the stack's default agent version setting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>version_number</i> - Use the specified agent version. This value overrides the stack's default
     *         setting. To update the agent version, edit the instance configuration and specify a new version. AWS
     *         OpsWorks Stacks then automatically installs that version on the instance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete
     *         version number, not the abbreviated number shown on the console. For a list of available agent version
     *         numbers, call <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * The default AWS OpsWorks Stacks agent version. You have the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INHERIT</code> - Use the stack's default agent version setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>version_number</i> - Use the specified agent version. This value overrides the stack's default setting. To
     * update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks Stacks then
     * automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * </p>
     * 
     * @param agentVersion
     *        The default AWS OpsWorks Stacks agent version. You have the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INHERIT</code> - Use the stack's default agent version setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>version_number</i> - Use the specified agent version. This value overrides the stack's default setting.
     *        To update the agent version, edit the instance configuration and specify a new version. AWS OpsWorks
     *        Stacks then automatically installs that version on the instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete
     *        version number, not the abbreviated number shown on the console. For a list of available agent version
     *        numbers, call <a>DescribeAgentVersions</a>. AgentVersion cannot be set to Chef 12.2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit
     * tenancy settings from the VPC. The following are valid values for this parameter: <code>dedicated</code>,
     * <code>default</code>, or <code>host</code>. Because there are costs associated with changes in tenancy options,
     * we recommend that you research tenancy options before choosing them for your instances. For more information
     * about dedicated hosts, see <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and
     * <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information about
     * dedicated instances, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> and
     * <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2 Dedicated Instances</a>.
     * </p>
     * 
     * @param tenancy
     *        The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC,
     *        inherit tenancy settings from the VPC. The following are valid values for this parameter:
     *        <code>dedicated</code>, <code>default</code>, or <code>host</code>. Because there are costs associated
     *        with changes in tenancy options, we recommend that you research tenancy options before choosing them for
     *        your instances. For more information about dedicated hosts, see <a
     *        href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and <a
     *        href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information
     *        about dedicated instances, see <a
     *        href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated
     *        Instances</a> and <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2
     *        Dedicated Instances</a>.
     */

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * <p>
     * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit
     * tenancy settings from the VPC. The following are valid values for this parameter: <code>dedicated</code>,
     * <code>default</code>, or <code>host</code>. Because there are costs associated with changes in tenancy options,
     * we recommend that you research tenancy options before choosing them for your instances. For more information
     * about dedicated hosts, see <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and
     * <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information about
     * dedicated instances, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> and
     * <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2 Dedicated Instances</a>.
     * </p>
     * 
     * @return The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC,
     *         inherit tenancy settings from the VPC. The following are valid values for this parameter:
     *         <code>dedicated</code>, <code>default</code>, or <code>host</code>. Because there are costs associated
     *         with changes in tenancy options, we recommend that you research tenancy options before choosing them for
     *         your instances. For more information about dedicated hosts, see <a
     *         href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and <a
     *         href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information
     *         about dedicated instances, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated
     *         Instances</a> and <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2
     *         Dedicated Instances</a>.
     */

    public String getTenancy() {
        return this.tenancy;
    }

    /**
     * <p>
     * The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC, inherit
     * tenancy settings from the VPC. The following are valid values for this parameter: <code>dedicated</code>,
     * <code>default</code>, or <code>host</code>. Because there are costs associated with changes in tenancy options,
     * we recommend that you research tenancy options before choosing them for your instances. For more information
     * about dedicated hosts, see <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and
     * <a href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information about
     * dedicated instances, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated Instances</a> and
     * <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2 Dedicated Instances</a>.
     * </p>
     * 
     * @param tenancy
     *        The instance's tenancy option. The default option is no tenancy, or if the instance is running in a VPC,
     *        inherit tenancy settings from the VPC. The following are valid values for this parameter:
     *        <code>dedicated</code>, <code>default</code>, or <code>host</code>. Because there are costs associated
     *        with changes in tenancy options, we recommend that you research tenancy options before choosing them for
     *        your instances. For more information about dedicated hosts, see <a
     *        href="http://aws.amazon.com/ec2/dedicated-hosts/">Dedicated Hosts Overview</a> and <a
     *        href="http://aws.amazon.com/ec2/dedicated-hosts/">Amazon EC2 Dedicated Hosts</a>. For more information
     *        about dedicated instances, see <a
     *        href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/dedicated-instance.html">Dedicated
     *        Instances</a> and <a href="http://aws.amazon.com/ec2/purchasing-options/dedicated-instances/">Amazon EC2
     *        Dedicated Instances</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceRequest withTenancy(String tenancy) {
        setTenancy(tenancy);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getLayerIds() != null)
            sb.append("LayerIds: ").append(getLayerIds()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getAutoScalingType() != null)
            sb.append("AutoScalingType: ").append(getAutoScalingType()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getOs() != null)
            sb.append("Os: ").append(getOs()).append(",");
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getSshKeyName() != null)
            sb.append("SshKeyName: ").append(getSshKeyName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: ").append(getVirtualizationType()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getRootDeviceType() != null)
            sb.append("RootDeviceType: ").append(getRootDeviceType()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getInstallUpdatesOnBoot() != null)
            sb.append("InstallUpdatesOnBoot: ").append(getInstallUpdatesOnBoot()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getTenancy() != null)
            sb.append("Tenancy: ").append(getTenancy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceRequest == false)
            return false;
        CreateInstanceRequest other = (CreateInstanceRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLayerIds() == null ^ this.getLayerIds() == null)
            return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null)
            return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getOs() == null ^ this.getOs() == null)
            return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false)
            return false;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null)
            return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null)
            return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getInstallUpdatesOnBoot() == null ^ this.getInstallUpdatesOnBoot() == null)
            return false;
        if (other.getInstallUpdatesOnBoot() != null && other.getInstallUpdatesOnBoot().equals(this.getInstallUpdatesOnBoot()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getTenancy() == null ^ this.getTenancy() == null)
            return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getInstallUpdatesOnBoot() == null) ? 0 : getInstallUpdatesOnBoot().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceRequest clone() {
        return (CreateInstanceRequest) super.clone();
    }

}
