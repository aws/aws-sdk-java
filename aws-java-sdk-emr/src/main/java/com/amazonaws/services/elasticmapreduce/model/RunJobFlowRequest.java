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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <a>RunJobFlow</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RunJobFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunJobFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not
     * created.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     */
    private String additionalInfo;
    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     * <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     * </p>
     */
    private String amiVersion;
    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source application packages installed on the
     * cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version, for
     * example, <code>emr-5.14.0</code>. For more information about Amazon EMR release versions and included application
     * versions and features, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws.amazon.
     * com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR releases versions 4.x and later.
     * Earlier versions use <code>AmiVersion</code>.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     */
    private JobFlowInstancesConfig instances;
    /**
     * <p>
     * A list of steps to run.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepConfig> steps;
    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BootstrapActionConfig> bootstrapActions;
    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Currently
     * supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedProducts;
    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Supported
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or
     * M5 Edition respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<SupportedProductConfig> newSupportedProducts;
    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install
     * and configure when launching the cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release Guide</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Application> applications;
    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is
     * set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it.
     * </p>
     */
    private Boolean visibleToAllUsers;
    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster
     * assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the default role, you
     * must have already created it using the CLI or console.
     * </p>
     */
    private String jobFlowRole;
    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
     * </p>
     */
    private String securityConfiguration;
    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     */
    private String autoScalingRole;
    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     * instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at
     * the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     */
    private String scaleDownBehavior;
    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     * specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom
     * AMIs in Amazon EMR, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a> in the
     * <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon EBS-Backed
     * Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Linux AMI</a>.
     * </p>
     */
    private String customAmiId;
    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in
     * Amazon EMR version 4.x and later.
     * </p>
     */
    private Integer ebsRootVolumeSize;
    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI package
     * repositories to apply automatically when the instance boots using the AMI. If omitted, the default is
     * <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is specified,
     * no updates are applied, and all updates must be applied manually.
     * </p>
     */
    private String repoUpgradeOnBoot;
    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For
     * more information see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use
     * Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     */
    private KerberosAttributes kerberosAttributes;

    /**
     * Default constructor for RunJobFlowRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RunJobFlowRequest() {
    }

    /**
     * Constructs a new RunJobFlowRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the job flow.
     * @param instances
     *        A specification of the number and type of Amazon EC2 instances.
     */
    public RunJobFlowRequest(String name, JobFlowInstancesConfig instances) {
        setName(name);
        setInstances(instances);
    }

    /**
     * <p>
     * The name of the job flow.
     * </p>
     * 
     * @param name
     *        The name of the job flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job flow.
     * </p>
     * 
     * @return The name of the job flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job flow.
     * </p>
     * 
     * @param name
     *        The name of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not
     * created.
     * </p>
     * 
     * @param logUri
     *        The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not
     *        created.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not
     * created.
     * </p>
     * 
     * @return The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are
     *         not created.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not
     * created.
     * </p>
     * 
     * @param logUri
     *        The location in Amazon S3 to write the log files of the job flow. If a value is not provided, logs are not
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     * 
     * @param additionalInfo
     *        A JSON string for selecting additional features.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     * 
     * @return A JSON string for selecting additional features.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * A JSON string for selecting additional features.
     * </p>
     * 
     * @param additionalInfo
     *        A JSON string for selecting additional features.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     * <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     * </p>
     * 
     * @param amiVersion
     *        Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     *        <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     */

    public void setAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
    }

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     * <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     * </p>
     * 
     * @return Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     *         <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     */

    public String getAmiVersion() {
        return this.amiVersion;
    }

    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     * <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     * </p>
     * 
     * @param amiVersion
     *        Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     *        <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withAmiVersion(String amiVersion) {
        setAmiVersion(amiVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source application packages installed on the
     * cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version, for
     * example, <code>emr-5.14.0</code>. For more information about Amazon EMR release versions and included application
     * versions and features, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws.amazon.
     * com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR releases versions 4.x and later.
     * Earlier versions use <code>AmiVersion</code>.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release label, which determines the version of open-source application packages installed
     *        on the cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR
     *        release version, for example, <code>emr-5.14.0</code>. For more information about Amazon EMR release
     *        versions and included application versions and features, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *        >https://docs.aws.amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR
     *        releases versions 4.x and later. Earlier versions use <code>AmiVersion</code>.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source application packages installed on the
     * cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version, for
     * example, <code>emr-5.14.0</code>. For more information about Amazon EMR release versions and included application
     * versions and features, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws.amazon.
     * com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR releases versions 4.x and later.
     * Earlier versions use <code>AmiVersion</code>.
     * </p>
     * 
     * @return The Amazon EMR release label, which determines the version of open-source application packages installed
     *         on the cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR
     *         release version, for example, <code>emr-5.14.0</code>. For more information about Amazon EMR release
     *         versions and included application versions and features, see <a
     *         href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *         >https://docs.aws.amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR
     *         releases versions 4.x and later. Earlier versions use <code>AmiVersion</code>.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label, which determines the version of open-source application packages installed on the
     * cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release version, for
     * example, <code>emr-5.14.0</code>. For more information about Amazon EMR release versions and included application
     * versions and features, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">https://docs.aws.amazon.
     * com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR releases versions 4.x and later.
     * Earlier versions use <code>AmiVersion</code>.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release label, which determines the version of open-source application packages installed
     *        on the cluster. Release labels are in the form <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR
     *        release version, for example, <code>emr-5.14.0</code>. For more information about Amazon EMR release
     *        versions and included application versions and features, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/"
     *        >https://docs.aws.amazon.com/emr/latest/ReleaseGuide/</a>. The release label applies only to Amazon EMR
     *        releases versions 4.x and later. Earlier versions use <code>AmiVersion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     * 
     * @param instances
     *        A specification of the number and type of Amazon EC2 instances.
     */

    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     * 
     * @return A specification of the number and type of Amazon EC2 instances.
     */

    public JobFlowInstancesConfig getInstances() {
        return this.instances;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances.
     * </p>
     * 
     * @param instances
     *        A specification of the number and type of Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     * 
     * @return A list of steps to run.
     */

    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new com.amazonaws.internal.SdkInternalList<StepConfig>();
        }
        return steps;
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     * 
     * @param steps
     *        A list of steps to run.
     */

    public void setSteps(java.util.Collection<StepConfig> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new com.amazonaws.internal.SdkInternalList<StepConfig>(steps);
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        A list of steps to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withSteps(StepConfig... steps) {
        if (this.steps == null) {
            setSteps(new com.amazonaws.internal.SdkInternalList<StepConfig>(steps.length));
        }
        for (StepConfig ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of steps to run.
     * </p>
     * 
     * @param steps
     *        A list of steps to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withSteps(java.util.Collection<StepConfig> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * </p>
     * 
     * @return A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     */

    public java.util.List<BootstrapActionConfig> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new com.amazonaws.internal.SdkInternalList<BootstrapActionConfig>();
        }
        return bootstrapActions;
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     */

    public void setBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        this.bootstrapActions = new com.amazonaws.internal.SdkInternalList<BootstrapActionConfig>(bootstrapActions);
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBootstrapActions(java.util.Collection)} or {@link #withBootstrapActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withBootstrapActions(BootstrapActionConfig... bootstrapActions) {
        if (this.bootstrapActions == null) {
            setBootstrapActions(new com.amazonaws.internal.SdkInternalList<BootstrapActionConfig>(bootstrapActions.length));
        }
        for (BootstrapActionConfig ele : bootstrapActions) {
            this.bootstrapActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of bootstrap actions to run before Hadoop starts on the cluster nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Currently
     * supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *         </p>
     *         </note>
     *         <p>
     *         A list of strings that indicates third-party software to use. For more information, see the <a
     *         href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *         Currently supported values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "mapr-m3" - launch the job flow using MapR M3 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr-m5" - launch the job flow using MapR M5 Edition.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getSupportedProducts() {
        if (supportedProducts == null) {
            supportedProducts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedProducts;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Currently
     * supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param supportedProducts
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use. For more information, see the <a
     *        href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *        Currently supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "mapr-m3" - launch the job flow using MapR M3 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m5" - launch the job flow using MapR M5 Edition.
     *        </p>
     *        </li>
     */

    public void setSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
            return;
        }

        this.supportedProducts = new com.amazonaws.internal.SdkInternalList<String>(supportedProducts);
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Currently
     * supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedProducts(java.util.Collection)} or {@link #withSupportedProducts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedProducts
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use. For more information, see the <a
     *        href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *        Currently supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "mapr-m3" - launch the job flow using MapR M3 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m5" - launch the job flow using MapR M5 Edition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withSupportedProducts(String... supportedProducts) {
        if (this.supportedProducts == null) {
            setSupportedProducts(new com.amazonaws.internal.SdkInternalList<String>(supportedProducts.length));
        }
        for (String ele : supportedProducts) {
            this.supportedProducts.add(ele);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use. For more information, see the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Currently
     * supported values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the job flow using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the job flow using MapR M5 Edition.
     * </p>
     * </li>
     * </ul>
     * 
     * @param supportedProducts
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use. For more information, see the <a
     *        href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *        Currently supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "mapr-m3" - launch the job flow using MapR M3 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m5" - launch the job flow using MapR M5 Edition.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withSupportedProducts(java.util.Collection<String> supportedProducts) {
        setSupportedProducts(supportedProducts);
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Supported
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or
     * M5 Edition respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <p>
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *         </p>
     *         </note>
     *         <p>
     *         A list of strings that indicates third-party software to use with the job flow that accepts a user
     *         argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *         bootstrap action arguments. For more information, see
     *         "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     *         href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *         Supported values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "mapr-m3" - launch the cluster using MapR M3 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr-m5" - launch the cluster using MapR M5 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using
     *         MapR M3 or M5 Edition respectively.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mapr-m7" - launch the cluster using MapR M7 Edition.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "hue"- launch the cluster with Hue installed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "spark" - launch the cluster with Apache Spark installed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     *         </p>
     *         </li>
     */

    public java.util.List<SupportedProductConfig> getNewSupportedProducts() {
        if (newSupportedProducts == null) {
            newSupportedProducts = new com.amazonaws.internal.SdkInternalList<SupportedProductConfig>();
        }
        return newSupportedProducts;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Supported
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or
     * M5 Edition respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newSupportedProducts
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow that accepts a user
     *        argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *        bootstrap action arguments. For more information, see
     *        "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     *        href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *        Supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "mapr-m3" - launch the cluster using MapR M3 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m5" - launch the cluster using MapR M5 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using
     *        MapR M3 or M5 Edition respectively.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m7" - launch the cluster using MapR M7 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "hue"- launch the cluster with Hue installed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "spark" - launch the cluster with Apache Spark installed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     *        </p>
     *        </li>
     */

    public void setNewSupportedProducts(java.util.Collection<SupportedProductConfig> newSupportedProducts) {
        if (newSupportedProducts == null) {
            this.newSupportedProducts = null;
            return;
        }

        this.newSupportedProducts = new com.amazonaws.internal.SdkInternalList<SupportedProductConfig>(newSupportedProducts);
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Supported
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or
     * M5 Edition respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNewSupportedProducts(java.util.Collection)} or {@link #withNewSupportedProducts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param newSupportedProducts
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow that accepts a user
     *        argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *        bootstrap action arguments. For more information, see
     *        "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     *        href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *        Supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "mapr-m3" - launch the cluster using MapR M3 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m5" - launch the cluster using MapR M5 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using
     *        MapR M3 or M5 Edition respectively.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m7" - launch the cluster using MapR M7 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "hue"- launch the cluster with Hue installed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "spark" - launch the cluster with Apache Spark installed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withNewSupportedProducts(SupportedProductConfig... newSupportedProducts) {
        if (this.newSupportedProducts == null) {
            setNewSupportedProducts(new com.amazonaws.internal.SdkInternalList<SupportedProductConfig>(newSupportedProducts.length));
        }
        for (SupportedProductConfig ele : newSupportedProducts) {
            this.newSupportedProducts.add(ele);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     * href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>. Supported
     * values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "mapr-m3" - launch the cluster using MapR M3 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m5" - launch the cluster using MapR M5 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3 or
     * M5 Edition respectively.
     * </p>
     * </li>
     * <li>
     * <p>
     * "mapr-m7" - launch the cluster using MapR M7 Edition.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     * </p>
     * </li>
     * <li>
     * <p>
     * "hue"- launch the cluster with Hue installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "spark" - launch the cluster with Apache Spark installed.
     * </p>
     * </li>
     * <li>
     * <p>
     * "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newSupportedProducts
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and later, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow that accepts a user
     *        argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *        bootstrap action arguments. For more information, see
     *        "Launch a Job Flow on the MapR Distribution for Hadoop" in the <a
     *        href="https://docs.aws.amazon.com/emr/latest/DeveloperGuide/emr-dg.pdf">Amazon EMR Developer Guide</a>.
     *        Supported values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "mapr-m3" - launch the cluster using MapR M3 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m5" - launch the cluster using MapR M5 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr" with the user arguments specifying "--edition,m3" or "--edition,m5" - launch the job flow using
     *        MapR M3 or M5 Edition respectively.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mapr-m7" - launch the cluster using MapR M7 Edition.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "hunk" - launch the cluster with the Hunk Big Data Analtics Platform.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "hue"- launch the cluster with Hue installed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "spark" - launch the cluster with Apache Spark installed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "ganglia" - launch the cluster with the Ganglia Monitoring System installed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withNewSupportedProducts(java.util.Collection<SupportedProductConfig> newSupportedProducts) {
        setNewSupportedProducts(newSupportedProducts);
        return this;
    }

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install
     * and configure when launching the cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release Guide</a>.
     * </p>
     * 
     * @return Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to
     *         install and configure when launching the cluster. For a list of applications available for each Amazon
     *         EMR release version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR
     *         Release Guide</a>.
     */

    public java.util.List<Application> getApplications() {
        if (applications == null) {
            applications = new com.amazonaws.internal.SdkInternalList<Application>();
        }
        return applications;
    }

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install
     * and configure when launching the cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release Guide</a>.
     * </p>
     * 
     * @param applications
     *        Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to
     *        install and configure when launching the cluster. For a list of applications available for each Amazon EMR
     *        release version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release
     *        Guide</a>.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new com.amazonaws.internal.SdkInternalList<Application>(applications);
    }

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install
     * and configure when launching the cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to
     *        install and configure when launching the cluster. For a list of applications available for each Amazon EMR
     *        release version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withApplications(Application... applications) {
        if (this.applications == null) {
            setApplications(new com.amazonaws.internal.SdkInternalList<Application>(applications.length));
        }
        for (Application ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to install
     * and configure when launching the cluster. For a list of applications available for each Amazon EMR release
     * version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release Guide</a>.
     * </p>
     * 
     * @param applications
     *        Applies to Amazon EMR releases 4.0 and later. A case-insensitive list of applications for Amazon EMR to
     *        install and configure when launching the cluster. For a list of applications available for each Amazon EMR
     *        release version, see the <a href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/">Amazon EMR Release
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * 
     * @return For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are
     *         creating.
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * 
     * @param configurations
     *        For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are
     *        creating.
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are
     *        creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * 
     * @param configurations
     *        For Amazon EMR releases 4.0 and later. The list of configurations supplied for the EMR cluster you are
     *        creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is
     * set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     *        value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper
     *        policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that
     *        created the cluster can view and manage it.
     */

    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is
     * set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it.
     * </p>
     * 
     * @return Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     *         value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the
     *         proper policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user
     *         that created the cluster can view and manage it.
     */

    public Boolean getVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is
     * set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     *        value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper
     *        policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that
     *        created the cluster can view and manage it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        setVisibleToAllUsers(visibleToAllUsers);
        return this;
    }

    /**
     * <p>
     * Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this value is
     * set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it.
     * </p>
     * 
     * @return Whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     *         value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the
     *         proper policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user
     *         that created the cluster can view and manage it.
     */

    public Boolean isVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster
     * assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the default role, you
     * must have already created it using the CLI or console.
     * </p>
     * 
     * @param jobFlowRole
     *        Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the
     *        cluster assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the
     *        default role, you must have already created it using the CLI or console.
     */

    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster
     * assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the default role, you
     * must have already created it using the CLI or console.
     * </p>
     * 
     * @return Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the
     *         cluster assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the
     *         default role, you must have already created it using the CLI or console.
     */

    public String getJobFlowRole() {
        return this.jobFlowRole;
    }

    /**
     * <p>
     * Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the cluster
     * assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the default role, you
     * must have already created it using the CLI or console.
     * </p>
     * 
     * @param jobFlowRole
     *        Also called instance profile and EC2 role. An IAM role for an EMR cluster. The EC2 instances of the
     *        cluster assume this role. The default role is <code>EMR_EC2_DefaultRole</code>. In order to use the
     *        default role, you must have already created it using the CLI or console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withJobFlowRole(String jobFlowRole) {
        setJobFlowRole(jobFlowRole);
        return this;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     * 
     * @param serviceRole
     *        The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     * 
     * @return The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * </p>
     * 
     * @param serviceRole
     *        The IAM role that will be assumed by the Amazon EMR service to access AWS resources on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * </p>
     * 
     * @return A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with a cluster and propagate to Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of a security configuration to apply to the cluster.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
     * </p>
     * 
     * @return The name of a security configuration to apply to the cluster.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The name of a security configuration to apply to the cluster.
     * </p>
     * 
     * @param securityConfiguration
     *        The name of a security configuration to apply to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
        return this;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     * 
     * @param autoScalingRole
     *        An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *        The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2
     *        instances in an instance group.
     */

    public void setAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     * 
     * @return An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *         The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2
     *         instances in an instance group.
     */

    public String getAutoScalingRole() {
        return this.autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an
     * instance group.
     * </p>
     * 
     * @param autoScalingRole
     *        An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *        The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2
     *        instances in an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withAutoScalingRole(String autoScalingRole) {
        setAutoScalingRole(autoScalingRole);
        return this;
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     * instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at
     * the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     *        occurs or an instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     *        terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance
     *        was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for
     *        clusters created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
     *        blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     *        instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks
     *        instance termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code>
     *        available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR
     *        earlier than 5.1.0.
     * @see ScaleDownBehavior
     */

    public void setScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     * instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at
     * the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @return Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     *         occurs or an instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     *         terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance
     *         was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for
     *         clusters created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
     *         blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     *         instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks
     *         instance termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code>
     *         available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR
     *         earlier than 5.1.0.
     * @see ScaleDownBehavior
     */

    public String getScaleDownBehavior() {
        return this.scaleDownBehavior;
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     * instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at
     * the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     *        occurs or an instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     *        terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance
     *        was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for
     *        clusters created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
     *        blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     *        instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks
     *        instance termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code>
     *        available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR
     *        earlier than 5.1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleDownBehavior
     */

    public RunJobFlowRequest withScaleDownBehavior(String scaleDownBehavior) {
        setScaleDownBehavior(scaleDownBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     * instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at
     * the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     *        occurs or an instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     *        terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance
     *        was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for
     *        clusters created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
     *        blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     *        instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks
     *        instance termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code>
     *        available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR
     *        earlier than 5.1.0.
     * @see ScaleDownBehavior
     */

    public void setScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        withScaleDownBehavior(scaleDownBehavior);
    }

    /**
     * <p>
     * Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     * instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at
     * the instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option
     * is only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        Specifies the way that individual Amazon EC2 instances terminate when an automatic scale-in activity
     *        occurs or an instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR
     *        terminates nodes at the instance-hour boundary, regardless of when the request to terminate the instance
     *        was submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for
     *        clusters created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
     *        blacklists and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the
     *        instance-hour boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks
     *        instance termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code>
     *        available only in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR
     *        earlier than 5.1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleDownBehavior
     */

    public RunJobFlowRequest withScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     * specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom
     * AMIs in Amazon EMR, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a> in the
     * <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon EBS-Backed
     * Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Linux AMI</a>.
     * </p>
     * 
     * @param customAmiId
     *        Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     *        specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about
     *        custom AMIs in Amazon EMR, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a>
     *        in the <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     *        <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code>
     *        instead.</p>
     *        <p>
     *        For information about creating a custom AMI, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon
     *        EBS-Backed Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For
     *        information about finding an AMI ID, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding a Linux AMI</a>.
     */

    public void setCustomAmiId(String customAmiId) {
        this.customAmiId = customAmiId;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     * specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom
     * AMIs in Amazon EMR, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a> in the
     * <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon EBS-Backed
     * Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Linux AMI</a>.
     * </p>
     * 
     * @return Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     *         specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about
     *         custom AMIs in Amazon EMR, see <a
     *         href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a>
     *         in the <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     *         <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code>
     *         instead.</p>
     *         <p>
     *         For information about creating a custom AMI, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon
     *         EBS-Backed Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For
     *         information about finding an AMI ID, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding a Linux AMI</a>.
     */

    public String getCustomAmiId() {
        return this.customAmiId;
    }

    /**
     * <p>
     * Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     * specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about custom
     * AMIs in Amazon EMR, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a> in the
     * <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     * <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code> instead.
     * </p>
     * <p>
     * For information about creating a custom AMI, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon EBS-Backed
     * Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For information about
     * finding an AMI ID, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Linux AMI</a>.
     * </p>
     * 
     * @param customAmiId
     *        Available only in Amazon EMR version 5.7.0 and later. The ID of a custom Amazon EBS-backed Linux AMI. If
     *        specified, Amazon EMR uses this AMI when it launches cluster EC2 instances. For more information about
     *        custom AMIs in Amazon EMR, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-custom-ami.html">Using a Custom AMI</a>
     *        in the <i>Amazon EMR Management Guide</i>. If omitted, the cluster uses the base Linux AMI for the
     *        <code>ReleaseLabel</code> specified. For Amazon EMR versions 2.x and 3.x, use <code>AmiVersion</code>
     *        instead.</p>
     *        <p>
     *        For information about creating a custom AMI, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html">Creating an Amazon
     *        EBS-Backed Linux AMI</a> in the <i>Amazon Elastic Compute Cloud User Guide for Linux Instances</i>. For
     *        information about finding an AMI ID, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding a Linux AMI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withCustomAmiId(String customAmiId) {
        setCustomAmiId(customAmiId);
        return this;
    }

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in
     * Amazon EMR version 4.x and later.
     * </p>
     * 
     * @param ebsRootVolumeSize
     *        The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
     *        Available in Amazon EMR version 4.x and later.
     */

    public void setEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        this.ebsRootVolumeSize = ebsRootVolumeSize;
    }

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in
     * Amazon EMR version 4.x and later.
     * </p>
     * 
     * @return The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
     *         Available in Amazon EMR version 4.x and later.
     */

    public Integer getEbsRootVolumeSize() {
        return this.ebsRootVolumeSize;
    }

    /**
     * <p>
     * The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in
     * Amazon EMR version 4.x and later.
     * </p>
     * 
     * @param ebsRootVolumeSize
     *        The size, in GiB, of the EBS root device volume of the Linux AMI that is used for each EC2 instance.
     *        Available in Amazon EMR version 4.x and later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withEbsRootVolumeSize(Integer ebsRootVolumeSize) {
        setEbsRootVolumeSize(ebsRootVolumeSize);
        return this;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI package
     * repositories to apply automatically when the instance boots using the AMI. If omitted, the default is
     * <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is specified,
     * no updates are applied, and all updates must be applied manually.
     * </p>
     * 
     * @param repoUpgradeOnBoot
     *        Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI
     *        package repositories to apply automatically when the instance boots using the AMI. If omitted, the default
     *        is <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is
     *        specified, no updates are applied, and all updates must be applied manually.
     * @see RepoUpgradeOnBoot
     */

    public void setRepoUpgradeOnBoot(String repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI package
     * repositories to apply automatically when the instance boots using the AMI. If omitted, the default is
     * <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is specified,
     * no updates are applied, and all updates must be applied manually.
     * </p>
     * 
     * @return Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI
     *         package repositories to apply automatically when the instance boots using the AMI. If omitted, the
     *         default is <code>SECURITY</code>, which indicates that only security updates are applied. If
     *         <code>NONE</code> is specified, no updates are applied, and all updates must be applied manually.
     * @see RepoUpgradeOnBoot
     */

    public String getRepoUpgradeOnBoot() {
        return this.repoUpgradeOnBoot;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI package
     * repositories to apply automatically when the instance boots using the AMI. If omitted, the default is
     * <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is specified,
     * no updates are applied, and all updates must be applied manually.
     * </p>
     * 
     * @param repoUpgradeOnBoot
     *        Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI
     *        package repositories to apply automatically when the instance boots using the AMI. If omitted, the default
     *        is <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is
     *        specified, no updates are applied, and all updates must be applied manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepoUpgradeOnBoot
     */

    public RunJobFlowRequest withRepoUpgradeOnBoot(String repoUpgradeOnBoot) {
        setRepoUpgradeOnBoot(repoUpgradeOnBoot);
        return this;
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI package
     * repositories to apply automatically when the instance boots using the AMI. If omitted, the default is
     * <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is specified,
     * no updates are applied, and all updates must be applied manually.
     * </p>
     * 
     * @param repoUpgradeOnBoot
     *        Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI
     *        package repositories to apply automatically when the instance boots using the AMI. If omitted, the default
     *        is <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is
     *        specified, no updates are applied, and all updates must be applied manually.
     * @see RepoUpgradeOnBoot
     */

    public void setRepoUpgradeOnBoot(RepoUpgradeOnBoot repoUpgradeOnBoot) {
        withRepoUpgradeOnBoot(repoUpgradeOnBoot);
    }

    /**
     * <p>
     * Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI package
     * repositories to apply automatically when the instance boots using the AMI. If omitted, the default is
     * <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is specified,
     * no updates are applied, and all updates must be applied manually.
     * </p>
     * 
     * @param repoUpgradeOnBoot
     *        Applies only when <code>CustomAmiID</code> is used. Specifies which updates from the Amazon Linux AMI
     *        package repositories to apply automatically when the instance boots using the AMI. If omitted, the default
     *        is <code>SECURITY</code>, which indicates that only security updates are applied. If <code>NONE</code> is
     *        specified, no updates are applied, and all updates must be applied manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepoUpgradeOnBoot
     */

    public RunJobFlowRequest withRepoUpgradeOnBoot(RepoUpgradeOnBoot repoUpgradeOnBoot) {
        this.repoUpgradeOnBoot = repoUpgradeOnBoot.toString();
        return this;
    }

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For
     * more information see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use
     * Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @param kerberosAttributes
     *        Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
     *        configuration. For more information see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use Kerberos
     *        Authentication</a> in the <i>EMR Management Guide</i>.
     */

    public void setKerberosAttributes(KerberosAttributes kerberosAttributes) {
        this.kerberosAttributes = kerberosAttributes;
    }

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For
     * more information see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use
     * Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @return Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
     *         configuration. For more information see <a
     *         href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use Kerberos
     *         Authentication</a> in the <i>EMR Management Guide</i>.
     */

    public KerberosAttributes getKerberosAttributes() {
        return this.kerberosAttributes;
    }

    /**
     * <p>
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For
     * more information see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use
     * Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @param kerberosAttributes
     *        Attributes for Kerberos configuration when Kerberos authentication is enabled using a security
     *        configuration. For more information see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use Kerberos
     *        Authentication</a> in the <i>EMR Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withKerberosAttributes(KerberosAttributes kerberosAttributes) {
        setKerberosAttributes(kerberosAttributes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getAmiVersion() != null)
            sb.append("AmiVersion: ").append(getAmiVersion()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: ").append(getBootstrapActions()).append(",");
        if (getSupportedProducts() != null)
            sb.append("SupportedProducts: ").append(getSupportedProducts()).append(",");
        if (getNewSupportedProducts() != null)
            sb.append("NewSupportedProducts: ").append(getNewSupportedProducts()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: ").append(getVisibleToAllUsers()).append(",");
        if (getJobFlowRole() != null)
            sb.append("JobFlowRole: ").append(getJobFlowRole()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration()).append(",");
        if (getAutoScalingRole() != null)
            sb.append("AutoScalingRole: ").append(getAutoScalingRole()).append(",");
        if (getScaleDownBehavior() != null)
            sb.append("ScaleDownBehavior: ").append(getScaleDownBehavior()).append(",");
        if (getCustomAmiId() != null)
            sb.append("CustomAmiId: ").append(getCustomAmiId()).append(",");
        if (getEbsRootVolumeSize() != null)
            sb.append("EbsRootVolumeSize: ").append(getEbsRootVolumeSize()).append(",");
        if (getRepoUpgradeOnBoot() != null)
            sb.append("RepoUpgradeOnBoot: ").append(getRepoUpgradeOnBoot()).append(",");
        if (getKerberosAttributes() != null)
            sb.append("KerberosAttributes: ").append(getKerberosAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunJobFlowRequest == false)
            return false;
        RunJobFlowRequest other = (RunJobFlowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getAmiVersion() == null ^ this.getAmiVersion() == null)
            return false;
        if (other.getAmiVersion() != null && other.getAmiVersion().equals(this.getAmiVersion()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null)
            return false;
        if (other.getBootstrapActions() != null && other.getBootstrapActions().equals(this.getBootstrapActions()) == false)
            return false;
        if (other.getSupportedProducts() == null ^ this.getSupportedProducts() == null)
            return false;
        if (other.getSupportedProducts() != null && other.getSupportedProducts().equals(this.getSupportedProducts()) == false)
            return false;
        if (other.getNewSupportedProducts() == null ^ this.getNewSupportedProducts() == null)
            return false;
        if (other.getNewSupportedProducts() != null && other.getNewSupportedProducts().equals(this.getNewSupportedProducts()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getVisibleToAllUsers() == null ^ this.getVisibleToAllUsers() == null)
            return false;
        if (other.getVisibleToAllUsers() != null && other.getVisibleToAllUsers().equals(this.getVisibleToAllUsers()) == false)
            return false;
        if (other.getJobFlowRole() == null ^ this.getJobFlowRole() == null)
            return false;
        if (other.getJobFlowRole() != null && other.getJobFlowRole().equals(this.getJobFlowRole()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        if (other.getAutoScalingRole() == null ^ this.getAutoScalingRole() == null)
            return false;
        if (other.getAutoScalingRole() != null && other.getAutoScalingRole().equals(this.getAutoScalingRole()) == false)
            return false;
        if (other.getScaleDownBehavior() == null ^ this.getScaleDownBehavior() == null)
            return false;
        if (other.getScaleDownBehavior() != null && other.getScaleDownBehavior().equals(this.getScaleDownBehavior()) == false)
            return false;
        if (other.getCustomAmiId() == null ^ this.getCustomAmiId() == null)
            return false;
        if (other.getCustomAmiId() != null && other.getCustomAmiId().equals(this.getCustomAmiId()) == false)
            return false;
        if (other.getEbsRootVolumeSize() == null ^ this.getEbsRootVolumeSize() == null)
            return false;
        if (other.getEbsRootVolumeSize() != null && other.getEbsRootVolumeSize().equals(this.getEbsRootVolumeSize()) == false)
            return false;
        if (other.getRepoUpgradeOnBoot() == null ^ this.getRepoUpgradeOnBoot() == null)
            return false;
        if (other.getRepoUpgradeOnBoot() != null && other.getRepoUpgradeOnBoot().equals(this.getRepoUpgradeOnBoot()) == false)
            return false;
        if (other.getKerberosAttributes() == null ^ this.getKerberosAttributes() == null)
            return false;
        if (other.getKerberosAttributes() != null && other.getKerberosAttributes().equals(this.getKerberosAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getAmiVersion() == null) ? 0 : getAmiVersion().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode());
        hashCode = prime * hashCode + ((getSupportedProducts() == null) ? 0 : getSupportedProducts().hashCode());
        hashCode = prime * hashCode + ((getNewSupportedProducts() == null) ? 0 : getNewSupportedProducts().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        hashCode = prime * hashCode + ((getJobFlowRole() == null) ? 0 : getJobFlowRole().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingRole() == null) ? 0 : getAutoScalingRole().hashCode());
        hashCode = prime * hashCode + ((getScaleDownBehavior() == null) ? 0 : getScaleDownBehavior().hashCode());
        hashCode = prime * hashCode + ((getCustomAmiId() == null) ? 0 : getCustomAmiId().hashCode());
        hashCode = prime * hashCode + ((getEbsRootVolumeSize() == null) ? 0 : getEbsRootVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getRepoUpgradeOnBoot() == null) ? 0 : getRepoUpgradeOnBoot().hashCode());
        hashCode = prime * hashCode + ((getKerberosAttributes() == null) ? 0 : getKerberosAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RunJobFlowRequest clone() {
        return (RunJobFlowRequest) super.clone();
    }

}
