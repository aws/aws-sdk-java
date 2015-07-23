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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#runJobFlow(RunJobFlowRequest) RunJobFlow operation}.
 * <p>
 * RunJobFlow creates and starts running a new job flow. The job flow
 * will run the steps specified. Once the job flow completes, the cluster
 * is stopped and the HDFS partition is lost. To prevent loss of data,
 * configure the last step of the job flow to store results in Amazon S3.
 * If the JobFlowInstancesConfig <code>KeepJobFlowAliveWhenNoSteps</code>
 * parameter is set to <code>TRUE</code> , the job flow will transition
 * to the WAITING state rather than shutting down once the steps have
 * completed.
 * </p>
 * <p>
 * For additional protection, you can set the JobFlowInstancesConfig
 * <code>TerminationProtected</code> parameter to <code>TRUE</code> to
 * lock the job flow and prevent it from being terminated by API call,
 * user intervention, or in the event of a job flow error.
 * </p>
 * <p>
 * A maximum of 256 steps are allowed in each job flow.
 * </p>
 * <p>
 * If your job flow is long-running (such as a Hive data warehouse) or
 * complex, you may require more than 256 steps to process your data. You
 * can bypass the 256-step limitation in various ways, including using
 * the SSH shell to connect to the master node and submitting queries
 * directly to the software running on the master node, such as Hive and
 * Hadoop. For more information on how to do this, go to
 * <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/AddMoreThan256Steps.html"> Add More than 256 Steps to a Job Flow </a>
 * in the <i>Amazon Elastic MapReduce Developer's Guide</i> .
 * </p>
 * <p>
 * For long running job flows, we recommend that you periodically store
 * your results.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#runJobFlow(RunJobFlowRequest)
 */
public class RunJobFlowRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String logUri;

    /**
     * A JSON string for selecting additional features.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String additionalInfo;

    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     * Machine Image (AMI) to use when launching Amazon EC2 instances in the
     * job flow. The following values are valid: <ul> <li>The version number
     * of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     * supports multiple versions of Hadoop (for example, AMI 1.0 supports
     * both Hadoop 0.18 and 0.20) you can use the
     * <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     * modify the version of Hadoop from the defaults shown above. <p>For
     * details about the AMI versions currently supported by Amazon Elastic
     * MapReduce, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String amiVersion;

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     * for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     * amiVersion instead instead of ReleaseLabel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String releaseLabel;

    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     */
    private JobFlowInstancesConfig instances;

    /**
     * A list of steps to be executed by the job flow.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig> steps;

    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the cluster nodes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig> bootstrapActions;

    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     * Third Party Applications with Amazon EMR</a>. Currently supported
     * values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     * Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     * Edition.</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> supportedProducts;

    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow that accepts a
     * user argument list. EMR accepts and forwards the argument list to the
     * corresponding installation script as bootstrap action arguments. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     * a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     * supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     * MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     * Edition.</li> <li>"mapr" with the user arguments specifying
     * "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     * or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     * using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     * Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     * with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     * Spark installed.</li> <li>"ganglia" - launch the cluster with the
     * Ganglia Monitoring System installed.</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig> newSupportedProducts;

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     * applications for the cluster. Valid values are: "Hadoop", "Hive",
     * "Mahout", "Pig", and "Spark." They are case insensitive.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Application> applications;

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * configurations supplied for the EMR cluster you are creating.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurations;

    /**
     * Whether the job flow is visible to all IAM users of the AWS account
     * associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and (if
     * they have the proper policy permissions set) manage the job flow. If
     * it is set to <code>false</code>, only the IAM user that created the
     * job flow can view and manage it.
     */
    private Boolean visibleToAllUsers;

    /**
     * An IAM role for the job flow. The EC2 instances of the job flow assume
     * this role. The default role is <code>EMRJobflowDefault</code>. In
     * order to use the default role, you must have already created it using
     * the CLI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String jobFlowRole;

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String serviceRole;

    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Default constructor for a new RunJobFlowRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RunJobFlowRequest() {}
    
    /**
     * Constructs a new RunJobFlowRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the job flow.
     * @param instances A specification of the number and type of Amazon EC2
     * instances on which to run the job flow.
     */
    public RunJobFlowRequest(String name, JobFlowInstancesConfig instances) {
        setName(name);
        setInstances(instances);
    }

    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the job flow.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the job flow.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The location in Amazon S3 to write the log files of the job flow. If a
     *         value is not provided, logs are not created.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param logUri The location in Amazon S3 to write the log files of the job flow. If a
     *         value is not provided, logs are not created.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * The location in Amazon S3 to write the log files of the job flow. If a
     * value is not provided, logs are not created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param logUri The location in Amazon S3 to write the log files of the job flow. If a
     *         value is not provided, logs are not created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * A JSON string for selecting additional features.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return A JSON string for selecting additional features.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * A JSON string for selecting additional features.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param additionalInfo A JSON string for selecting additional features.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * A JSON string for selecting additional features.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param additionalInfo A JSON string for selecting additional features.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     * Machine Image (AMI) to use when launching Amazon EC2 instances in the
     * job flow. The following values are valid: <ul> <li>The version number
     * of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     * supports multiple versions of Hadoop (for example, AMI 1.0 supports
     * both Hadoop 0.18 and 0.20) you can use the
     * <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     * modify the version of Hadoop from the defaults shown above. <p>For
     * details about the AMI versions currently supported by Amazon Elastic
     * MapReduce, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     *         Machine Image (AMI) to use when launching Amazon EC2 instances in the
     *         job flow. The following values are valid: <ul> <li>The version number
     *         of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     *         supports multiple versions of Hadoop (for example, AMI 1.0 supports
     *         both Hadoop 0.18 and 0.20) you can use the
     *         <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     *         modify the version of Hadoop from the defaults shown above. <p>For
     *         details about the AMI versions currently supported by Amazon Elastic
     *         MapReduce, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     *         Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     *         MapReduce Developer's Guide.</i>
     */
    public String getAmiVersion() {
        return amiVersion;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     * Machine Image (AMI) to use when launching Amazon EC2 instances in the
     * job flow. The following values are valid: <ul> <li>The version number
     * of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     * supports multiple versions of Hadoop (for example, AMI 1.0 supports
     * both Hadoop 0.18 and 0.20) you can use the
     * <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     * modify the version of Hadoop from the defaults shown above. <p>For
     * details about the AMI versions currently supported by Amazon Elastic
     * MapReduce, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param amiVersion <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     *         Machine Image (AMI) to use when launching Amazon EC2 instances in the
     *         job flow. The following values are valid: <ul> <li>The version number
     *         of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     *         supports multiple versions of Hadoop (for example, AMI 1.0 supports
     *         both Hadoop 0.18 and 0.20) you can use the
     *         <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     *         modify the version of Hadoop from the defaults shown above. <p>For
     *         details about the AMI versions currently supported by Amazon Elastic
     *         MapReduce, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     *         Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     *         MapReduce Developer's Guide.</i>
     */
    public void setAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     * Machine Image (AMI) to use when launching Amazon EC2 instances in the
     * job flow. The following values are valid: <ul> <li>The version number
     * of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     * supports multiple versions of Hadoop (for example, AMI 1.0 supports
     * both Hadoop 0.18 and 0.20) you can use the
     * <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     * modify the version of Hadoop from the defaults shown above. <p>For
     * details about the AMI versions currently supported by Amazon Elastic
     * MapReduce, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     * Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     * MapReduce Developer's Guide.</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param amiVersion <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use ReleaseLabel.</note> <p>The version of the Amazon
     *         Machine Image (AMI) to use when launching Amazon EC2 instances in the
     *         job flow. The following values are valid: <ul> <li>The version number
     *         of the AMI to use, for example, "2.0."</li> </ul> <p>If the AMI
     *         supports multiple versions of Hadoop (for example, AMI 1.0 supports
     *         both Hadoop 0.18 and 0.20) you can use the
     *         <a>JobFlowInstancesConfig</a> <code>HadoopVersion</code> parameter to
     *         modify the version of Hadoop from the defaults shown above. <p>For
     *         details about the AMI versions currently supported by Amazon Elastic
     *         MapReduce, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/EnvironmentConfig_AMIVersion.html#ami-versions-supported">AMI
     *         Versions Supported in Elastic MapReduce</a> in the <i>Amazon Elastic
     *         MapReduce Developer's Guide.</i>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withAmiVersion(String amiVersion) {
        this.amiVersion = amiVersion;
        return this;
    }

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     * for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     * amiVersion instead instead of ReleaseLabel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     *         for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     *         amiVersion instead instead of ReleaseLabel.
     */
    public String getReleaseLabel() {
        return releaseLabel;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     * for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     * amiVersion instead instead of ReleaseLabel.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param releaseLabel <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     *         for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     *         amiVersion instead instead of ReleaseLabel.
     */
    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     * for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     * amiVersion instead instead of ReleaseLabel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param releaseLabel <note><p>Amazon EMR releases 4.x or later.</note> <p>The release label
     *         for the Amazon EMR release. For Amazon EMR 3.x and 2.x AMIs, use
     *         amiVersion instead instead of ReleaseLabel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
        return this;
    }

    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     *
     * @return A specification of the number and type of Amazon EC2 instances on
     *         which to run the job flow.
     */
    public JobFlowInstancesConfig getInstances() {
        return instances;
    }
    
    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances on
     *         which to run the job flow.
     */
    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }
    
    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances on
     *         which to run the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
        return this;
    }

    /**
     * A list of steps to be executed by the job flow.
     *
     * @return A list of steps to be executed by the job flow.
     */
    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
              steps = new com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig>();
              steps.setAutoConstruct(true);
        }
        return steps;
    }
    
    /**
     * A list of steps to be executed by the job flow.
     *
     * @param steps A list of steps to be executed by the job flow.
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig> stepsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig>(steps.size());
        stepsCopy.addAll(steps);
        this.steps = stepsCopy;
    }
    
    /**
     * A list of steps to be executed by the job flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSteps(java.util.Collection)} or {@link
     * #withSteps(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of steps to be executed by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withSteps(StepConfig... steps) {
        if (getSteps() == null) setSteps(new java.util.ArrayList<StepConfig>(steps.length));
        for (StepConfig value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * A list of steps to be executed by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of steps to be executed by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withSteps(java.util.Collection<StepConfig> steps) {
        if (steps == null) {
            this.steps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig> stepsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig>(steps.size());
            stepsCopy.addAll(steps);
            this.steps = stepsCopy;
        }

        return this;
    }

    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the cluster nodes.
     *
     * @return A list of bootstrap actions that will be run before Hadoop is started
     *         on the cluster nodes.
     */
    public java.util.List<BootstrapActionConfig> getBootstrapActions() {
        if (bootstrapActions == null) {
              bootstrapActions = new com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig>();
              bootstrapActions.setAutoConstruct(true);
        }
        return bootstrapActions;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the cluster nodes.
     *
     * @param bootstrapActions A list of bootstrap actions that will be run before Hadoop is started
     *         on the cluster nodes.
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig> bootstrapActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig>(bootstrapActions.size());
        bootstrapActionsCopy.addAll(bootstrapActions);
        this.bootstrapActions = bootstrapActionsCopy;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the cluster nodes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBootstrapActions(java.util.Collection)} or {@link
     * #withBootstrapActions(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions A list of bootstrap actions that will be run before Hadoop is started
     *         on the cluster nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withBootstrapActions(BootstrapActionConfig... bootstrapActions) {
        if (getBootstrapActions() == null) setBootstrapActions(new java.util.ArrayList<BootstrapActionConfig>(bootstrapActions.length));
        for (BootstrapActionConfig value : bootstrapActions) {
            getBootstrapActions().add(value);
        }
        return this;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the cluster nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions A list of bootstrap actions that will be run before Hadoop is started
     *         on the cluster nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig> bootstrapActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig>(bootstrapActions.size());
            bootstrapActionsCopy.addAll(bootstrapActions);
            this.bootstrapActions = bootstrapActionsCopy;
        }

        return this;
    }

    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     * Third Party Applications with Amazon EMR</a>. Currently supported
     * values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     * Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     * Edition.</li> </ul>
     *
     * @return <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *         Third Party Applications with Amazon EMR</a>. Currently supported
     *         values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     *         Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     *         Edition.</li> </ul>
     */
    public java.util.List<String> getSupportedProducts() {
        if (supportedProducts == null) {
              supportedProducts = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              supportedProducts.setAutoConstruct(true);
        }
        return supportedProducts;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     * Third Party Applications with Amazon EMR</a>. Currently supported
     * values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     * Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     * Edition.</li> </ul>
     *
     * @param supportedProducts <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *         Third Party Applications with Amazon EMR</a>. Currently supported
     *         values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     *         Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     *         Edition.</li> </ul>
     */
    public void setSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> supportedProductsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(supportedProducts.size());
        supportedProductsCopy.addAll(supportedProducts);
        this.supportedProducts = supportedProductsCopy;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     * Third Party Applications with Amazon EMR</a>. Currently supported
     * values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     * Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     * Edition.</li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSupportedProducts(java.util.Collection)} or
     * {@link #withSupportedProducts(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param supportedProducts <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *         Third Party Applications with Amazon EMR</a>. Currently supported
     *         values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     *         Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     *         Edition.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withSupportedProducts(String... supportedProducts) {
        if (getSupportedProducts() == null) setSupportedProducts(new java.util.ArrayList<String>(supportedProducts.length));
        for (String value : supportedProducts) {
            getSupportedProducts().add(value);
        }
        return this;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow. For more
     * information, go to <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     * Third Party Applications with Amazon EMR</a>. Currently supported
     * values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     * Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     * Edition.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param supportedProducts <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow. For more
     *         information, go to <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-supported-products.html">Use
     *         Third Party Applications with Amazon EMR</a>. Currently supported
     *         values are: <ul> <li>"mapr-m3" - launch the job flow using MapR M3
     *         Edition.</li> <li>"mapr-m5" - launch the job flow using MapR M5
     *         Edition.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> supportedProductsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(supportedProducts.size());
            supportedProductsCopy.addAll(supportedProducts);
            this.supportedProducts = supportedProductsCopy;
        }

        return this;
    }

    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow that accepts a
     * user argument list. EMR accepts and forwards the argument list to the
     * corresponding installation script as bootstrap action arguments. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     * a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     * supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     * MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     * Edition.</li> <li>"mapr" with the user arguments specifying
     * "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     * or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     * using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     * Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     * with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     * Spark installed.</li> <li>"ganglia" - launch the cluster with the
     * Ganglia Monitoring System installed.</li> </ul>
     *
     * @return <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow that accepts a
     *         user argument list. EMR accepts and forwards the argument list to the
     *         corresponding installation script as bootstrap action arguments. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     *         a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     *         supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     *         MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     *         Edition.</li> <li>"mapr" with the user arguments specifying
     *         "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     *         or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     *         using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     *         Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     *         with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     *         Spark installed.</li> <li>"ganglia" - launch the cluster with the
     *         Ganglia Monitoring System installed.</li> </ul>
     */
    public java.util.List<SupportedProductConfig> getNewSupportedProducts() {
        if (newSupportedProducts == null) {
              newSupportedProducts = new com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig>();
              newSupportedProducts.setAutoConstruct(true);
        }
        return newSupportedProducts;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow that accepts a
     * user argument list. EMR accepts and forwards the argument list to the
     * corresponding installation script as bootstrap action arguments. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     * a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     * supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     * MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     * Edition.</li> <li>"mapr" with the user arguments specifying
     * "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     * or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     * using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     * Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     * with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     * Spark installed.</li> <li>"ganglia" - launch the cluster with the
     * Ganglia Monitoring System installed.</li> </ul>
     *
     * @param newSupportedProducts <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow that accepts a
     *         user argument list. EMR accepts and forwards the argument list to the
     *         corresponding installation script as bootstrap action arguments. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     *         a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     *         supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     *         MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     *         Edition.</li> <li>"mapr" with the user arguments specifying
     *         "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     *         or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     *         using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     *         Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     *         with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     *         Spark installed.</li> <li>"ganglia" - launch the cluster with the
     *         Ganglia Monitoring System installed.</li> </ul>
     */
    public void setNewSupportedProducts(java.util.Collection<SupportedProductConfig> newSupportedProducts) {
        if (newSupportedProducts == null) {
            this.newSupportedProducts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig> newSupportedProductsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig>(newSupportedProducts.size());
        newSupportedProductsCopy.addAll(newSupportedProducts);
        this.newSupportedProducts = newSupportedProductsCopy;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow that accepts a
     * user argument list. EMR accepts and forwards the argument list to the
     * corresponding installation script as bootstrap action arguments. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     * a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     * supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     * MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     * Edition.</li> <li>"mapr" with the user arguments specifying
     * "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     * or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     * using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     * Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     * with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     * Spark installed.</li> <li>"ganglia" - launch the cluster with the
     * Ganglia Monitoring System installed.</li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNewSupportedProducts(java.util.Collection)} or
     * {@link #withNewSupportedProducts(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newSupportedProducts <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow that accepts a
     *         user argument list. EMR accepts and forwards the argument list to the
     *         corresponding installation script as bootstrap action arguments. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     *         a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     *         supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     *         MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     *         Edition.</li> <li>"mapr" with the user arguments specifying
     *         "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     *         or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     *         using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     *         Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     *         with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     *         Spark installed.</li> <li>"ganglia" - launch the cluster with the
     *         Ganglia Monitoring System installed.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withNewSupportedProducts(SupportedProductConfig... newSupportedProducts) {
        if (getNewSupportedProducts() == null) setNewSupportedProducts(new java.util.ArrayList<SupportedProductConfig>(newSupportedProducts.length));
        for (SupportedProductConfig value : newSupportedProducts) {
            getNewSupportedProducts().add(value);
        }
        return this;
    }
    
    /**
     * <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     * 4.x and greater, use Applications.</note> <p>A list of strings that
     * indicates third-party software to use with the job flow that accepts a
     * user argument list. EMR accepts and forwards the argument list to the
     * corresponding installation script as bootstrap action arguments. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     * a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     * supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     * MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     * Edition.</li> <li>"mapr" with the user arguments specifying
     * "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     * or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     * using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     * Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     * with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     * Spark installed.</li> <li>"ganglia" - launch the cluster with the
     * Ganglia Monitoring System installed.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newSupportedProducts <note><p>For Amazon EMR releases 3.x and 2.x. For Amazon EMR releases
     *         4.x and greater, use Applications.</note> <p>A list of strings that
     *         indicates third-party software to use with the job flow that accepts a
     *         user argument list. EMR accepts and forwards the argument list to the
     *         corresponding installation script as bootstrap action arguments. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-mapr.html">Launch
     *         a Job Flow on the MapR Distribution for Hadoop</a>. Currently
     *         supported values are: <ul> <li>"mapr-m3" - launch the cluster using
     *         MapR M3 Edition.</li> <li>"mapr-m5" - launch the cluster using MapR M5
     *         Edition.</li> <li>"mapr" with the user arguments specifying
     *         "--edition,m3" or "--edition,m5" - launch the job flow using MapR M3
     *         or M5 Edition respectively.</li> <li>"mapr-m7" - launch the cluster
     *         using MapR M7 Edition.</li> <li>"hunk" - launch the cluster with the
     *         Hunk Big Data Analtics Platform.</li> <li>"hue"- launch the cluster
     *         with Hue installed.</li> <li>"spark" - launch the cluster with Apache
     *         Spark installed.</li> <li>"ganglia" - launch the cluster with the
     *         Ganglia Monitoring System installed.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withNewSupportedProducts(java.util.Collection<SupportedProductConfig> newSupportedProducts) {
        if (newSupportedProducts == null) {
            this.newSupportedProducts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig> newSupportedProductsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig>(newSupportedProducts.size());
            newSupportedProductsCopy.addAll(newSupportedProducts);
            this.newSupportedProducts = newSupportedProductsCopy;
        }

        return this;
    }

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     * applications for the cluster. Valid values are: "Hadoop", "Hive",
     * "Mahout", "Pig", and "Spark." They are case insensitive.
     *
     * @return <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     *         applications for the cluster. Valid values are: "Hadoop", "Hive",
     *         "Mahout", "Pig", and "Spark." They are case insensitive.
     */
    public java.util.List<Application> getApplications() {
        if (applications == null) {
              applications = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>();
              applications.setAutoConstruct(true);
        }
        return applications;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     * applications for the cluster. Valid values are: "Hadoop", "Hive",
     * "Mahout", "Pig", and "Spark." They are case insensitive.
     *
     * @param applications <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     *         applications for the cluster. Valid values are: "Hadoop", "Hive",
     *         "Mahout", "Pig", and "Spark." They are case insensitive.
     */
    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>(applications.size());
        applicationsCopy.addAll(applications);
        this.applications = applicationsCopy;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     * applications for the cluster. Valid values are: "Hadoop", "Hive",
     * "Mahout", "Pig", and "Spark." They are case insensitive.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setApplications(java.util.Collection)} or {@link
     * #withApplications(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     *         applications for the cluster. Valid values are: "Hadoop", "Hive",
     *         "Mahout", "Pig", and "Spark." They are case insensitive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withApplications(Application... applications) {
        if (getApplications() == null) setApplications(new java.util.ArrayList<Application>(applications.length));
        for (Application value : applications) {
            getApplications().add(value);
        }
        return this;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     * applications for the cluster. Valid values are: "Hadoop", "Hive",
     * "Mahout", "Pig", and "Spark." They are case insensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applications <note><p>Amazon EMR releases 4.x or later.</note> <p>A list of
     *         applications for the cluster. Valid values are: "Hadoop", "Hive",
     *         "Mahout", "Pig", and "Spark." They are case insensitive.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Application> applicationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Application>(applications.size());
            applicationsCopy.addAll(applications);
            this.applications = applicationsCopy;
        }

        return this;
    }

    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * configurations supplied for the EMR cluster you are creating.
     *
     * @return <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         configurations supplied for the EMR cluster you are creating.
     */
    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
              configurations = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>();
              configurations.setAutoConstruct(true);
        }
        return configurations;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * configurations supplied for the EMR cluster you are creating.
     *
     * @param configurations <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         configurations supplied for the EMR cluster you are creating.
     */
    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>(configurations.size());
        configurationsCopy.addAll(configurations);
        this.configurations = configurationsCopy;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * configurations supplied for the EMR cluster you are creating.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigurations(java.util.Collection)} or {@link
     * #withConfigurations(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurations <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         configurations supplied for the EMR cluster you are creating.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withConfigurations(Configuration... configurations) {
        if (getConfigurations() == null) setConfigurations(new java.util.ArrayList<Configuration>(configurations.length));
        for (Configuration value : configurations) {
            getConfigurations().add(value);
        }
        return this;
    }
    
    /**
     * <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     * configurations supplied for the EMR cluster you are creating.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurations <note><p>Amazon EMR releases 4.x or later.</note> <p>The list of
     *         configurations supplied for the EMR cluster you are creating.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Configuration> configurationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Configuration>(configurations.size());
            configurationsCopy.addAll(configurations);
            this.configurations = configurationsCopy;
        }

        return this;
    }

    /**
     * Whether the job flow is visible to all IAM users of the AWS account
     * associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and (if
     * they have the proper policy permissions set) manage the job flow. If
     * it is set to <code>false</code>, only the IAM user that created the
     * job flow can view and manage it.
     *
     * @return Whether the job flow is visible to all IAM users of the AWS account
     *         associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and (if
     *         they have the proper policy permissions set) manage the job flow. If
     *         it is set to <code>false</code>, only the IAM user that created the
     *         job flow can view and manage it.
     */
    public Boolean isVisibleToAllUsers() {
        return visibleToAllUsers;
    }
    
    /**
     * Whether the job flow is visible to all IAM users of the AWS account
     * associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and (if
     * they have the proper policy permissions set) manage the job flow. If
     * it is set to <code>false</code>, only the IAM user that created the
     * job flow can view and manage it.
     *
     * @param visibleToAllUsers Whether the job flow is visible to all IAM users of the AWS account
     *         associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and (if
     *         they have the proper policy permissions set) manage the job flow. If
     *         it is set to <code>false</code>, only the IAM user that created the
     *         job flow can view and manage it.
     */
    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }
    
    /**
     * Whether the job flow is visible to all IAM users of the AWS account
     * associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and (if
     * they have the proper policy permissions set) manage the job flow. If
     * it is set to <code>false</code>, only the IAM user that created the
     * job flow can view and manage it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param visibleToAllUsers Whether the job flow is visible to all IAM users of the AWS account
     *         associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and (if
     *         they have the proper policy permissions set) manage the job flow. If
     *         it is set to <code>false</code>, only the IAM user that created the
     *         job flow can view and manage it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
        return this;
    }

    /**
     * Whether the job flow is visible to all IAM users of the AWS account
     * associated with the job flow. If this value is set to
     * <code>true</code>, all IAM users of that AWS account can view and (if
     * they have the proper policy permissions set) manage the job flow. If
     * it is set to <code>false</code>, only the IAM user that created the
     * job flow can view and manage it.
     *
     * @return Whether the job flow is visible to all IAM users of the AWS account
     *         associated with the job flow. If this value is set to
     *         <code>true</code>, all IAM users of that AWS account can view and (if
     *         they have the proper policy permissions set) manage the job flow. If
     *         it is set to <code>false</code>, only the IAM user that created the
     *         job flow can view and manage it.
     */
    public Boolean getVisibleToAllUsers() {
        return visibleToAllUsers;
    }

    /**
     * An IAM role for the job flow. The EC2 instances of the job flow assume
     * this role. The default role is <code>EMRJobflowDefault</code>. In
     * order to use the default role, you must have already created it using
     * the CLI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return An IAM role for the job flow. The EC2 instances of the job flow assume
     *         this role. The default role is <code>EMRJobflowDefault</code>. In
     *         order to use the default role, you must have already created it using
     *         the CLI.
     */
    public String getJobFlowRole() {
        return jobFlowRole;
    }
    
    /**
     * An IAM role for the job flow. The EC2 instances of the job flow assume
     * this role. The default role is <code>EMRJobflowDefault</code>. In
     * order to use the default role, you must have already created it using
     * the CLI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowRole An IAM role for the job flow. The EC2 instances of the job flow assume
     *         this role. The default role is <code>EMRJobflowDefault</code>. In
     *         order to use the default role, you must have already created it using
     *         the CLI.
     */
    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }
    
    /**
     * An IAM role for the job flow. The EC2 instances of the job flow assume
     * this role. The default role is <code>EMRJobflowDefault</code>. In
     * order to use the default role, you must have already created it using
     * the CLI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param jobFlowRole An IAM role for the job flow. The EC2 instances of the job flow assume
     *         this role. The default role is <code>EMRJobflowDefault</code>. In
     *         order to use the default role, you must have already created it using
     *         the CLI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
        return this;
    }

    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The IAM role that will be assumed by the Amazon EMR service to access
     *         AWS resources on your behalf.
     */
    public String getServiceRole() {
        return serviceRole;
    }
    
    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access
     *         AWS resources on your behalf.
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }
    
    /**
     * The IAM role that will be assumed by the Amazon EMR service to access
     * AWS resources on your behalf.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param serviceRole The IAM role that will be assumed by the Amazon EMR service to access
     *         AWS resources on your behalf.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     *
     * @return A list of tags to associate with a cluster and propagate to Amazon EC2
     *         instances.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     *
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2
     *         instances.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags to associate with a cluster and propagate to Amazon EC2
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags to associate with a cluster and propagate to Amazon EC2
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunJobFlowRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getLogUri() != null) sb.append("LogUri: " + getLogUri() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getAmiVersion() != null) sb.append("AmiVersion: " + getAmiVersion() + ",");
        if (getReleaseLabel() != null) sb.append("ReleaseLabel: " + getReleaseLabel() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getSteps() != null) sb.append("Steps: " + getSteps() + ",");
        if (getBootstrapActions() != null) sb.append("BootstrapActions: " + getBootstrapActions() + ",");
        if (getSupportedProducts() != null) sb.append("SupportedProducts: " + getSupportedProducts() + ",");
        if (getNewSupportedProducts() != null) sb.append("NewSupportedProducts: " + getNewSupportedProducts() + ",");
        if (getApplications() != null) sb.append("Applications: " + getApplications() + ",");
        if (getConfigurations() != null) sb.append("Configurations: " + getConfigurations() + ",");
        if (isVisibleToAllUsers() != null) sb.append("VisibleToAllUsers: " + isVisibleToAllUsers() + ",");
        if (getJobFlowRole() != null) sb.append("JobFlowRole: " + getJobFlowRole() + ",");
        if (getServiceRole() != null) sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isVisibleToAllUsers() == null) ? 0 : isVisibleToAllUsers().hashCode()); 
        hashCode = prime * hashCode + ((getJobFlowRole() == null) ? 0 : getJobFlowRole().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RunJobFlowRequest == false) return false;
        RunJobFlowRequest other = (RunJobFlowRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getLogUri() == null ^ this.getLogUri() == null) return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        if (other.getAmiVersion() == null ^ this.getAmiVersion() == null) return false;
        if (other.getAmiVersion() != null && other.getAmiVersion().equals(this.getAmiVersion()) == false) return false; 
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null) return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getSteps() == null ^ this.getSteps() == null) return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false) return false; 
        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null) return false;
        if (other.getBootstrapActions() != null && other.getBootstrapActions().equals(this.getBootstrapActions()) == false) return false; 
        if (other.getSupportedProducts() == null ^ this.getSupportedProducts() == null) return false;
        if (other.getSupportedProducts() != null && other.getSupportedProducts().equals(this.getSupportedProducts()) == false) return false; 
        if (other.getNewSupportedProducts() == null ^ this.getNewSupportedProducts() == null) return false;
        if (other.getNewSupportedProducts() != null && other.getNewSupportedProducts().equals(this.getNewSupportedProducts()) == false) return false; 
        if (other.getApplications() == null ^ this.getApplications() == null) return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false) return false; 
        if (other.getConfigurations() == null ^ this.getConfigurations() == null) return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false) return false; 
        if (other.isVisibleToAllUsers() == null ^ this.isVisibleToAllUsers() == null) return false;
        if (other.isVisibleToAllUsers() != null && other.isVisibleToAllUsers().equals(this.isVisibleToAllUsers()) == false) return false; 
        if (other.getJobFlowRole() == null ^ this.getJobFlowRole() == null) return false;
        if (other.getJobFlowRole() != null && other.getJobFlowRole().equals(this.getJobFlowRole()) == false) return false; 
        if (other.getServiceRole() == null ^ this.getServiceRole() == null) return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public RunJobFlowRequest clone() {
        
            return (RunJobFlowRequest) super.clone();
    }

}
    