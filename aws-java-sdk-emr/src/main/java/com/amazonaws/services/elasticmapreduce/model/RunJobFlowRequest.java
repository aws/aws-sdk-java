/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <a>RunJobFlow</a> operation.
 * </p>
 */
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
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     * </p>
     * </note>
     * <p>
     * The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow. The
     * following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number of the AMI to use, for example, "2.0."
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20) you can
     * use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version of Hadoop from
     * the defaults shown above.
     * </p>
     * <p>
     * For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     * >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI version rather
     * than specify a numerical value. Some regions no longer support this deprecated option as they only have a newer
     * release label version of EMR, which requires you to specify an EMR release label release (EMR 4.x or later).
     * </p>
     * </note>
     */
    private String amiVersion;
    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     * </p>
     */
    private JobFlowInstancesConfig instances;
    /**
     * <p>
     * A list of steps to be executed by the job flow.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepConfig> steps;
    /**
     * <p>
     * A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BootstrapActionConfig> bootstrapActions;
    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use Third
     * Party Applications with Amazon EMR</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow on the
     * MapR Distribution for Hadoop</a>. Currently supported values are:
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
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark." They
     * are case insensitive.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Application> applications;
    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this value
     * is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that created the job
     * flow can view and manage it.
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
     *        A specification of the number and type of Amazon EC2 instances on which to run the job flow.
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
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     * </p>
     * </note>
     * <p>
     * The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow. The
     * following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number of the AMI to use, for example, "2.0."
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20) you can
     * use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version of Hadoop from
     * the defaults shown above.
     * </p>
     * <p>
     * For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     * >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI version rather
     * than specify a numerical value. Some regions no longer support this deprecated option as they only have a newer
     * release label version of EMR, which requires you to specify an EMR release label release (EMR 4.x or later).
     * </p>
     * </note>
     * 
     * @param amiVersion
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     *        </p>
     *        </note>
     *        <p>
     *        The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow.
     *        The following values are valid:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The version number of the AMI to use, for example, "2.0."
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20)
     *        you can use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version
     *        of Hadoop from the defaults shown above.
     *        </p>
     *        <p>
     *        For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     *        "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     *        >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     *        </p>
     *        <note>
     *        <p>
     *        Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI version
     *        rather than specify a numerical value. Some regions no longer support this deprecated option as they only
     *        have a newer release label version of EMR, which requires you to specify an EMR release label release (EMR
     *        4.x or later).
     *        </p>
     */

    public void setAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     * </p>
     * </note>
     * <p>
     * The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow. The
     * following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number of the AMI to use, for example, "2.0."
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20) you can
     * use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version of Hadoop from
     * the defaults shown above.
     * </p>
     * <p>
     * For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     * >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI version rather
     * than specify a numerical value. Some regions no longer support this deprecated option as they only have a newer
     * release label version of EMR, which requires you to specify an EMR release label release (EMR 4.x or later).
     * </p>
     * </note>
     * 
     * @return <p>
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     *         </p>
     *         </note>
     *         <p>
     *         The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow.
     *         The following values are valid:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The version number of the AMI to use, for example, "2.0."
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20)
     *         you can use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version
     *         of Hadoop from the defaults shown above.
     *         </p>
     *         <p>
     *         For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     *         "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     *         >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     *         </p>
     *         <note>
     *         <p>
     *         Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI
     *         version rather than specify a numerical value. Some regions no longer support this deprecated option as
     *         they only have a newer release label version of EMR, which requires you to specify an EMR release label
     *         release (EMR 4.x or later).
     *         </p>
     */

    public String getAmiVersion() {
        return this.amiVersion;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     * </p>
     * </note>
     * <p>
     * The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow. The
     * following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The version number of the AMI to use, for example, "2.0."
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20) you can
     * use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version of Hadoop from
     * the defaults shown above.
     * </p>
     * <p>
     * For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     * "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     * >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     * </p>
     * <note>
     * <p>
     * Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI version rather
     * than specify a numerical value. Some regions no longer support this deprecated option as they only have a newer
     * release label version of EMR, which requires you to specify an EMR release label release (EMR 4.x or later).
     * </p>
     * </note>
     * 
     * @param amiVersion
     *        <p>
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use ReleaseLabel.
     *        </p>
     *        </note>
     *        <p>
     *        The version of the Amazon Machine Image (AMI) to use when launching Amazon EC2 instances in the job flow.
     *        The following values are valid:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The version number of the AMI to use, for example, "2.0."
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the AMI supports multiple versions of Hadoop (for example, AMI 1.0 supports both Hadoop 0.18 and 0.20)
     *        you can use the <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to modify the version
     *        of Hadoop from the defaults shown above.
     *        </p>
     *        <p>
     *        For details about the AMI versions currently supported by Amazon Elastic MapReduce, see <a href=
     *        "http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported"
     *        >AMI Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic MapReduce Developer Guide.</i>
     *        </p>
     *        <note>
     *        <p>
     *        Previously, the EMR AMI version API parameter options allowed you to use latest for the latest AMI version
     *        rather than specify a numerical value. Some regions no longer support this deprecated option as they only
     *        have a newer release label version of EMR, which requires you to specify an EMR release label release (EMR
     *        4.x or later).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withAmiVersion(String amiVersion) {
        setAmiVersion(amiVersion);
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     * 
     * @param releaseLabel
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead
     *        instead of ReleaseLabel.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     * 
     * @return <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead
     *         instead of ReleaseLabel.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead instead of
     * ReleaseLabel.
     * </p>
     * 
     * @param releaseLabel
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The release label for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use amiVersion instead
     *        instead of ReleaseLabel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     * </p>
     * 
     * @param instances
     *        A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     */

    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     * </p>
     * 
     * @return A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     */

    public JobFlowInstancesConfig getInstances() {
        return this.instances;
    }

    /**
     * <p>
     * A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     * </p>
     * 
     * @param instances
     *        A specification of the number and type of Amazon EC2 instances on which to run the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * A list of steps to be executed by the job flow.
     * </p>
     * 
     * @return A list of steps to be executed by the job flow.
     */

    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new com.amazonaws.internal.SdkInternalList<StepConfig>();
        }
        return steps;
    }

    /**
     * <p>
     * A list of steps to be executed by the job flow.
     * </p>
     * 
     * @param steps
     *        A list of steps to be executed by the job flow.
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
     * A list of steps to be executed by the job flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        A list of steps to be executed by the job flow.
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
     * A list of steps to be executed by the job flow.
     * </p>
     * 
     * @param steps
     *        A list of steps to be executed by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withSteps(java.util.Collection<StepConfig> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     * </p>
     * 
     * @return A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     */

    public java.util.List<BootstrapActionConfig> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new com.amazonaws.internal.SdkInternalList<BootstrapActionConfig>();
        }
        return bootstrapActions;
    }

    /**
     * <p>
     * A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
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
     * A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBootstrapActions(java.util.Collection)} or {@link #withBootstrapActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
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
     * A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of bootstrap actions that will be run before Hadoop is started on the cluster nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
        return this;
    }

    /**
     * <note>
     * <p>
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use Third
     * Party Applications with Amazon EMR</a>. Currently supported values are:
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
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *         </p>
     *         </note>
     *         <p>
     *         A list of strings that indicates third-party software to use with the job flow. For more information, see
     *         <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">
     *         Use Third Party Applications with Amazon EMR</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use Third
     * Party Applications with Amazon EMR</a>. Currently supported values are:
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
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow. For more information, see
     *        <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *        Third Party Applications with Amazon EMR</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use Third
     * Party Applications with Amazon EMR</a>. Currently supported values are:
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
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow. For more information, see
     *        <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *        Third Party Applications with Amazon EMR</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use Third
     * Party Applications with Amazon EMR</a>. Currently supported values are:
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
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow. For more information, see
     *        <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *        Third Party Applications with Amazon EMR</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow on the
     * MapR Distribution for Hadoop</a>. Currently supported values are:
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
     *         For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *         </p>
     *         </note>
     *         <p>
     *         A list of strings that indicates third-party software to use with the job flow that accepts a user
     *         argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *         bootstrap action arguments. For more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow
     *         on the MapR Distribution for Hadoop</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow on the
     * MapR Distribution for Hadoop</a>. Currently supported values are:
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
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow that accepts a user
     *        argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *        bootstrap action arguments. For more information, see <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow
     *        on the MapR Distribution for Hadoop</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow on the
     * MapR Distribution for Hadoop</a>. Currently supported values are:
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
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow that accepts a user
     *        argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *        bootstrap action arguments. For more information, see <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow
     *        on the MapR Distribution for Hadoop</a>. Currently supported values are:
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
     * For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     * </p>
     * </note>
     * <p>
     * A list of strings that indicates third-party software to use with the job flow that accepts a user argument list.
     * EMR accepts and forwards the argument list to the corresponding installation script as bootstrap action
     * arguments. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow on the
     * MapR Distribution for Hadoop</a>. Currently supported values are:
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
     *        For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases 4.x and greater, use Applications.
     *        </p>
     *        </note>
     *        <p>
     *        A list of strings that indicates third-party software to use with the job flow that accepts a user
     *        argument list. EMR accepts and forwards the argument list to the corresponding installation script as
     *        bootstrap action arguments. For more information, see <a
     *        href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch a Job Flow
     *        on the MapR Distribution for Hadoop</a>. Currently supported values are:
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
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark." They
     * are case insensitive.
     * </p>
     * 
     * @return <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark."
     *         They are case insensitive.
     */

    public java.util.List<Application> getApplications() {
        if (applications == null) {
            applications = new com.amazonaws.internal.SdkInternalList<Application>();
        }
        return applications;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark." They
     * are case insensitive.
     * </p>
     * 
     * @param applications
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark."
     *        They are case insensitive.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new com.amazonaws.internal.SdkInternalList<Application>(applications);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark." They
     * are case insensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark."
     *        They are case insensitive.
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
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark." They
     * are case insensitive.
     * </p>
     * 
     * @param applications
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        A list of applications for the cluster. Valid values are: "Hadoop", "Hive", "Mahout", "Pig", and "Spark."
     *        They are case insensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * 
     * @return <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         The list of configurations supplied for the EMR cluster you are creating.
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for the EMR cluster you are creating.
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for the EMR cluster you are creating.
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
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for the EMR cluster you are creating.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for the EMR cluster you are creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this value
     * is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that created the job
     * flow can view and manage it.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this
     *        value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper
     *        policy permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that
     *        created the job flow can view and manage it.
     */

    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this value
     * is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that created the job
     * flow can view and manage it.
     * </p>
     * 
     * @return Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this
     *         value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the
     *         proper policy permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user
     *         that created the job flow can view and manage it.
     */

    public Boolean getVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this value
     * is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that created the job
     * flow can view and manage it.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this
     *        value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper
     *        policy permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that
     *        created the job flow can view and manage it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunJobFlowRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        setVisibleToAllUsers(visibleToAllUsers);
        return this;
    }

    /**
     * <p>
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this value
     * is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user that created the job
     * flow can view and manage it.
     * </p>
     * 
     * @return Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. If this
     *         value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the
     *         proper policy permissions set) manage the job flow. If it is set to <code>false</code>, only the IAM user
     *         that created the job flow can view and manage it.
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
        this.scaleDownBehavior = scaleDownBehavior.toString();
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
        setScaleDownBehavior(scaleDownBehavior);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getLogUri() != null)
            sb.append("LogUri: " + getLogUri() + ",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getAmiVersion() != null)
            sb.append("AmiVersion: " + getAmiVersion() + ",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: " + getReleaseLabel() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances() + ",");
        if (getSteps() != null)
            sb.append("Steps: " + getSteps() + ",");
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: " + getBootstrapActions() + ",");
        if (getSupportedProducts() != null)
            sb.append("SupportedProducts: " + getSupportedProducts() + ",");
        if (getNewSupportedProducts() != null)
            sb.append("NewSupportedProducts: " + getNewSupportedProducts() + ",");
        if (getApplications() != null)
            sb.append("Applications: " + getApplications() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: " + getVisibleToAllUsers() + ",");
        if (getJobFlowRole() != null)
            sb.append("JobFlowRole: " + getJobFlowRole() + ",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: " + getSecurityConfiguration() + ",");
        if (getAutoScalingRole() != null)
            sb.append("AutoScalingRole: " + getAutoScalingRole() + ",");
        if (getScaleDownBehavior() != null)
            sb.append("ScaleDownBehavior: " + getScaleDownBehavior());
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
        return hashCode;
    }

    @Override
    public RunJobFlowRequest clone() {
        return (RunJobFlowRequest) super.clone();
    }
}
