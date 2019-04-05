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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance's layer IDs.
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
     * The instance's operating system, which must be set to one of the following. You cannot update an instance that is
     * using a custom AMI.
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
     * </ul>
     * <p>
     * For more information about supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>. For
     * more information about how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     */
    private String os;
    /**
     * <p>
     * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that
     * the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance.
     * UpdateInstance does not work on instances that are using custom AMIs.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The instance's Amazon EC2 key name.
     * </p>
     */
    private String sshKeyName;
    /**
     * <p>
     * The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     * architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * Whether to install operating system and package updates when the instance boots. The default value is
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
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
     * This property cannot be updated.
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
     * update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks
     * then automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <p>
     * AgentVersion cannot be set to Chef 12.2.
     * </p>
     */
    private String agentVersion;

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

    public UpdateInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance's layer IDs.
     * </p>
     * 
     * @return The instance's layer IDs.
     */

    public java.util.List<String> getLayerIds() {
        if (layerIds == null) {
            layerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return layerIds;
    }

    /**
     * <p>
     * The instance's layer IDs.
     * </p>
     * 
     * @param layerIds
     *        The instance's layer IDs.
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
     * The instance's layer IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLayerIds(java.util.Collection)} or {@link #withLayerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param layerIds
     *        The instance's layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withLayerIds(String... layerIds) {
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
     * The instance's layer IDs.
     * </p>
     * 
     * @param layerIds
     *        The instance's layer IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
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

    public UpdateInstanceRequest withInstanceType(String instanceType) {
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

    public UpdateInstanceRequest withAutoScalingType(String autoScalingType) {
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

    public UpdateInstanceRequest withAutoScalingType(AutoScalingType autoScalingType) {
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

    public UpdateInstanceRequest withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The instance's operating system, which must be set to one of the following. You cannot update an instance that is
     * using a custom AMI.
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
     * </ul>
     * <p>
     * For more information about supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>. For
     * more information about how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     * 
     * @param os
     *        The instance's operating system, which must be set to one of the following. You cannot update an instance
     *        that is using a custom AMI.</p>
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
     *        </ul>
     *        <p>
     *        For more information about supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *        Operating Systems</a>.
     *        </p>
     *        <p>
     *        The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>,
     *        you must use the AmiId parameter to specify the custom AMI that you want to use. For more information
     *        about supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *        Systems</a>. For more information about how to use custom AMIs with OpsWorks, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can specify a different Linux operating system for the updated stack, but you cannot change from Linux
     *        to Windows or Windows to Linux.
     *        </p>
     */

    public void setOs(String os) {
        this.os = os;
    }

    /**
     * <p>
     * The instance's operating system, which must be set to one of the following. You cannot update an instance that is
     * using a custom AMI.
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
     * </ul>
     * <p>
     * For more information about supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>. For
     * more information about how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     * 
     * @return The instance's operating system, which must be set to one of the following. You cannot update an instance
     *         that is using a custom AMI.</p>
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
     *         </ul>
     *         <p>
     *         For more information about supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *         Operating Systems</a>.
     *         </p>
     *         <p>
     *         The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>,
     *         you must use the AmiId parameter to specify the custom AMI that you want to use. For more information
     *         about supported operating systems, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *         Systems</a>. For more information about how to use custom AMIs with OpsWorks, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *         AMIs</a>.
     *         </p>
     *         <note>
     *         <p>
     *         You can specify a different Linux operating system for the updated stack, but you cannot change from
     *         Linux to Windows or Windows to Linux.
     *         </p>
     */

    public String getOs() {
        return this.os;
    }

    /**
     * <p>
     * The instance's operating system, which must be set to one of the following. You cannot update an instance that is
     * using a custom AMI.
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
     * </ul>
     * <p>
     * For more information about supported operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     * Operating Systems</a>.
     * </p>
     * <p>
     * The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>, you
     * must use the AmiId parameter to specify the custom AMI that you want to use. For more information about supported
     * operating systems, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating Systems</a>. For
     * more information about how to use custom AMIs with OpsWorks, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     * AMIs</a>.
     * </p>
     * <note>
     * <p>
     * You can specify a different Linux operating system for the updated stack, but you cannot change from Linux to
     * Windows or Windows to Linux.
     * </p>
     * </note>
     * 
     * @param os
     *        The instance's operating system, which must be set to one of the following. You cannot update an instance
     *        that is using a custom AMI.</p>
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
     *        </ul>
     *        <p>
     *        For more information about supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">AWS OpsWorks Stacks
     *        Operating Systems</a>.
     *        </p>
     *        <p>
     *        The default option is the current Amazon Linux version. If you set this parameter to <code>Custom</code>,
     *        you must use the AmiId parameter to specify the custom AMI that you want to use. For more information
     *        about supported operating systems, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-os.html">Operating
     *        Systems</a>. For more information about how to use custom AMIs with OpsWorks, see <a
     *        href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-custom-ami.html">Using Custom
     *        AMIs</a>.
     *        </p>
     *        <note>
     *        <p>
     *        You can specify a different Linux operating system for the updated stack, but you cannot change from Linux
     *        to Windows or Windows to Linux.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withOs(String os) {
        setOs(os);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that
     * the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance.
     * UpdateInstance does not work on instances that are using custom AMIs.
     * </p>
     * 
     * @param amiId
     *        The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI
     *        ID that the instance is already using. You cannot apply a new AMI to an instance by running
     *        UpdateInstance. UpdateInstance does not work on instances that are using custom AMIs.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that
     * the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance.
     * UpdateInstance does not work on instances that are using custom AMIs.
     * </p>
     * 
     * @return The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI
     *         ID that the instance is already using. You cannot apply a new AMI to an instance by running
     *         UpdateInstance. UpdateInstance does not work on instances that are using custom AMIs.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI ID that
     * the instance is already using. You cannot apply a new AMI to an instance by running UpdateInstance.
     * UpdateInstance does not work on instances that are using custom AMIs.
     * </p>
     * 
     * @param amiId
     *        The ID of the AMI that was used to create the instance. The value of this parameter must be the same AMI
     *        ID that the instance is already using. You cannot apply a new AMI to an instance by running
     *        UpdateInstance. UpdateInstance does not work on instances that are using custom AMIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The instance's Amazon EC2 key name.
     * </p>
     * 
     * @param sshKeyName
     *        The instance's Amazon EC2 key name.
     */

    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }

    /**
     * <p>
     * The instance's Amazon EC2 key name.
     * </p>
     * 
     * @return The instance's Amazon EC2 key name.
     */

    public String getSshKeyName() {
        return this.sshKeyName;
    }

    /**
     * <p>
     * The instance's Amazon EC2 key name.
     * </p>
     * 
     * @param sshKeyName
     *        The instance's Amazon EC2 key name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withSshKeyName(String sshKeyName) {
        setSshKeyName(sshKeyName);
        return this;
    }

    /**
     * <p>
     * The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     * architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     *        architectures that are supported by the different instance types, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *        Types</a>.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     * architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @return The instance architecture. Instance types do not necessarily support both architectures. For a list of
     *         the architectures that are supported by the different instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *         Types</a>.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     * architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     *        architectures that are supported by the different instance types, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *        Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public UpdateInstanceRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     * architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     *        architectures that are supported by the different instance types, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *        Types</a>.
     * @see Architecture
     */

    public void setArchitecture(Architecture architecture) {
        withArchitecture(architecture);
    }

    /**
     * <p>
     * The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     * architectures that are supported by the different instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and Types</a>.
     * </p>
     * 
     * @param architecture
     *        The instance architecture. Instance types do not necessarily support both architectures. For a list of the
     *        architectures that are supported by the different instance types, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Families and
     *        Types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public UpdateInstanceRequest withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
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
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
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
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
     * </p>
     * <note>
     * <p>
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
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
     * <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must then
     * update your instances manually by using <a>CreateDeployment</a> to run the <code>update_dependencies</code> stack
     * command or by manually running <code>yum</code> (Amazon Linux) or <code>apt-get</code> (Ubuntu) on the instances.
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
     *        <code>true</code>. To control when updates are installed, set this value to <code>false</code>. You must
     *        then update your instances manually by using <a>CreateDeployment</a> to run the
     *        <code>update_dependencies</code> stack command or by manually running <code>yum</code> (Amazon Linux) or
     *        <code>apt-get</code> (Ubuntu) on the instances. </p> <note>
     *        <p>
     *        We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the
     *        latest security updates.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withInstallUpdatesOnBoot(Boolean installUpdatesOnBoot) {
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
     * We strongly recommend using the default value of <code>true</code>, to ensure that your instances have the latest
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
     *         We strongly recommend using the default value of <code>true</code>, to ensure that your instances have
     *         the latest security updates.
     *         </p>
     */

    public Boolean isInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot;
    }

    /**
     * <p>
     * This property cannot be updated.
     * </p>
     * 
     * @param ebsOptimized
     *        This property cannot be updated.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * This property cannot be updated.
     * </p>
     * 
     * @return This property cannot be updated.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * This property cannot be updated.
     * </p>
     * 
     * @param ebsOptimized
     *        This property cannot be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * This property cannot be updated.
     * </p>
     * 
     * @return This property cannot be updated.
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
     * update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks
     * then automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <p>
     * AgentVersion cannot be set to Chef 12.2.
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
     *        To update the agent version, you must edit the instance configuration and specify a new version. AWS
     *        OpsWorks Stacks then automatically installs that version on the instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete
     *        version number, not the abbreviated number shown on the console. For a list of available agent version
     *        numbers, call <a>DescribeAgentVersions</a>.
     *        </p>
     *        <p>
     *        AgentVersion cannot be set to Chef 12.2.
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
     * update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks
     * then automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <p>
     * AgentVersion cannot be set to Chef 12.2.
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
     *         setting. To update the agent version, you must edit the instance configuration and specify a new version.
     *         AWS OpsWorks Stacks then automatically installs that version on the instance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete
     *         version number, not the abbreviated number shown on the console. For a list of available agent version
     *         numbers, call <a>DescribeAgentVersions</a>.
     *         </p>
     *         <p>
     *         AgentVersion cannot be set to Chef 12.2.
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
     * update the agent version, you must edit the instance configuration and specify a new version. AWS OpsWorks Stacks
     * then automatically installs that version on the instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete version
     * number, not the abbreviated number shown on the console. For a list of available agent version numbers, call
     * <a>DescribeAgentVersions</a>.
     * </p>
     * <p>
     * AgentVersion cannot be set to Chef 12.2.
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
     *        To update the agent version, you must edit the instance configuration and specify a new version. AWS
     *        OpsWorks Stacks then automatically installs that version on the instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default setting is <code>INHERIT</code>. To specify an agent version, you must use the complete
     *        version number, not the abbreviated number shown on the console. For a list of available agent version
     *        numbers, call <a>DescribeAgentVersions</a>.
     *        </p>
     *        <p>
     *        AgentVersion cannot be set to Chef 12.2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getInstallUpdatesOnBoot() != null)
            sb.append("InstallUpdatesOnBoot: ").append(getInstallUpdatesOnBoot()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstanceRequest == false)
            return false;
        UpdateInstanceRequest other = (UpdateInstanceRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
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
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
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
        return true;
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
        hashCode = prime * hashCode + ((getInstallUpdatesOnBoot() == null) ? 0 : getInstallUpdatesOnBoot().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstanceRequest clone() {
        return (UpdateInstanceRequest) super.clone();
    }

}
