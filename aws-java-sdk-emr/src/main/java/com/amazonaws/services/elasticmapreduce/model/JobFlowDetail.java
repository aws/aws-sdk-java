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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of a cluster (job flow).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/JobFlowDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFlowDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job flow identifier.
     * </p>
     */
    private String jobFlowId;
    /**
     * <p>
     * The name of the job flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * Applies only to Amazon EMR AMI versions 3.x and 2.x. For Amazon EMR releases 4.0 and later,
     * <code>ReleaseLabel</code> is used. To specify a custom AMI, use <code>CustomAmiID</code>.
     * </p>
     */
    private String amiVersion;
    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     */
    private JobFlowExecutionStatusDetail executionStatusDetail;
    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     */
    private JobFlowInstancesDetail instances;
    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepDetail> steps;
    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BootstrapActionDetail> bootstrapActions;
    /**
     * <p>
     * A list of strings set by third party software when the job flow is launched. If you are not using third party
     * software to manage the job flow this value is empty.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedProducts;
    /**
     * <p>
     * Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     * value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     */
    private Boolean visibleToAllUsers;
    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
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
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides a way for the automatic scaling feature to get the required permissions it needs to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     */
    private String autoScalingRole;
    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     */
    private String scaleDownBehavior;

    /**
     * Default constructor for JobFlowDetail object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public JobFlowDetail() {
    }

    /**
     * Constructs a new JobFlowDetail object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jobFlowId
     *        The job flow identifier.
     * @param name
     *        The name of the job flow.
     * @param executionStatusDetail
     *        Describes the execution status of the job flow.
     * @param instances
     *        Describes the Amazon EC2 instances of the job flow.
     */
    public JobFlowDetail(String jobFlowId, String name, JobFlowExecutionStatusDetail executionStatusDetail, JobFlowInstancesDetail instances) {
        setJobFlowId(jobFlowId);
        setName(name);
        setExecutionStatusDetail(executionStatusDetail);
        setInstances(instances);
    }

    /**
     * <p>
     * The job flow identifier.
     * </p>
     * 
     * @param jobFlowId
     *        The job flow identifier.
     */

    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * The job flow identifier.
     * </p>
     * 
     * @return The job flow identifier.
     */

    public String getJobFlowId() {
        return this.jobFlowId;
    }

    /**
     * <p>
     * The job flow identifier.
     * </p>
     * 
     * @param jobFlowId
     *        The job flow identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withJobFlowId(String jobFlowId) {
        setJobFlowId(jobFlowId);
        return this;
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

    public JobFlowDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
     * </p>
     * 
     * @param logUri
     *        The location in Amazon S3 where log files for the job are stored.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
     * </p>
     * 
     * @return The location in Amazon S3 where log files for the job are stored.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * The location in Amazon S3 where log files for the job are stored.
     * </p>
     * 
     * @param logUri
     *        The location in Amazon S3 where log files for the job are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withLogUri(String logUri) {
        setLogUri(logUri);
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

    public JobFlowDetail withAmiVersion(String amiVersion) {
        setAmiVersion(amiVersion);
        return this;
    }

    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     * 
     * @param executionStatusDetail
     *        Describes the execution status of the job flow.
     */

    public void setExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }

    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     * 
     * @return Describes the execution status of the job flow.
     */

    public JobFlowExecutionStatusDetail getExecutionStatusDetail() {
        return this.executionStatusDetail;
    }

    /**
     * <p>
     * Describes the execution status of the job flow.
     * </p>
     * 
     * @param executionStatusDetail
     *        Describes the execution status of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        setExecutionStatusDetail(executionStatusDetail);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     * 
     * @param instances
     *        Describes the Amazon EC2 instances of the job flow.
     */

    public void setInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
    }

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     * 
     * @return Describes the Amazon EC2 instances of the job flow.
     */

    public JobFlowInstancesDetail getInstances() {
        return this.instances;
    }

    /**
     * <p>
     * Describes the Amazon EC2 instances of the job flow.
     * </p>
     * 
     * @param instances
     *        Describes the Amazon EC2 instances of the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withInstances(JobFlowInstancesDetail instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     * 
     * @return A list of steps run by the job flow.
     */

    public java.util.List<StepDetail> getSteps() {
        if (steps == null) {
            steps = new com.amazonaws.internal.SdkInternalList<StepDetail>();
        }
        return steps;
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     * 
     * @param steps
     *        A list of steps run by the job flow.
     */

    public void setSteps(java.util.Collection<StepDetail> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new com.amazonaws.internal.SdkInternalList<StepDetail>(steps);
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        A list of steps run by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withSteps(StepDetail... steps) {
        if (this.steps == null) {
            setSteps(new com.amazonaws.internal.SdkInternalList<StepDetail>(steps.length));
        }
        for (StepDetail ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of steps run by the job flow.
     * </p>
     * 
     * @param steps
     *        A list of steps run by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withSteps(java.util.Collection<StepDetail> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     * 
     * @return A list of the bootstrap actions run by the job flow.
     */

    public java.util.List<BootstrapActionDetail> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new com.amazonaws.internal.SdkInternalList<BootstrapActionDetail>();
        }
        return bootstrapActions;
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of the bootstrap actions run by the job flow.
     */

    public void setBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        this.bootstrapActions = new com.amazonaws.internal.SdkInternalList<BootstrapActionDetail>(bootstrapActions);
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBootstrapActions(java.util.Collection)} or {@link #withBootstrapActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of the bootstrap actions run by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withBootstrapActions(BootstrapActionDetail... bootstrapActions) {
        if (this.bootstrapActions == null) {
            setBootstrapActions(new com.amazonaws.internal.SdkInternalList<BootstrapActionDetail>(bootstrapActions.length));
        }
        for (BootstrapActionDetail ele : bootstrapActions) {
            this.bootstrapActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the bootstrap actions run by the job flow.
     * </p>
     * 
     * @param bootstrapActions
     *        A list of the bootstrap actions run by the job flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
        return this;
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is launched. If you are not using third party
     * software to manage the job flow this value is empty.
     * </p>
     * 
     * @return A list of strings set by third party software when the job flow is launched. If you are not using third
     *         party software to manage the job flow this value is empty.
     */

    public java.util.List<String> getSupportedProducts() {
        if (supportedProducts == null) {
            supportedProducts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedProducts;
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is launched. If you are not using third party
     * software to manage the job flow this value is empty.
     * </p>
     * 
     * @param supportedProducts
     *        A list of strings set by third party software when the job flow is launched. If you are not using third
     *        party software to manage the job flow this value is empty.
     */

    public void setSupportedProducts(java.util.Collection<String> supportedProducts) {
        if (supportedProducts == null) {
            this.supportedProducts = null;
            return;
        }

        this.supportedProducts = new com.amazonaws.internal.SdkInternalList<String>(supportedProducts);
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is launched. If you are not using third party
     * software to manage the job flow this value is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedProducts(java.util.Collection)} or {@link #withSupportedProducts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedProducts
     *        A list of strings set by third party software when the job flow is launched. If you are not using third
     *        party software to manage the job flow this value is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withSupportedProducts(String... supportedProducts) {
        if (this.supportedProducts == null) {
            setSupportedProducts(new com.amazonaws.internal.SdkInternalList<String>(supportedProducts.length));
        }
        for (String ele : supportedProducts) {
            this.supportedProducts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings set by third party software when the job flow is launched. If you are not using third party
     * software to manage the job flow this value is empty.
     * </p>
     * 
     * @param supportedProducts
     *        A list of strings set by third party software when the job flow is launched. If you are not using third
     *        party software to manage the job flow this value is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withSupportedProducts(java.util.Collection<String> supportedProducts) {
        setSupportedProducts(supportedProducts);
        return this;
    }

    /**
     * <p>
     * Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     * value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster.
     *        If this value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have
     *        the proper policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM
     *        user that created the cluster can view and manage it. This value can be changed using the
     *        <a>SetVisibleToAllUsers</a> action.
     */

    public void setVisibleToAllUsers(Boolean visibleToAllUsers) {
        this.visibleToAllUsers = visibleToAllUsers;
    }

    /**
     * <p>
     * Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     * value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @return Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster.
     *         If this value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have
     *         the proper policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM
     *         user that created the cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */

    public Boolean getVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     * value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @param visibleToAllUsers
     *        Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster.
     *        If this value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have
     *        the proper policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM
     *        user that created the cluster can view and manage it. This value can be changed using the
     *        <a>SetVisibleToAllUsers</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withVisibleToAllUsers(Boolean visibleToAllUsers) {
        setVisibleToAllUsers(visibleToAllUsers);
        return this;
    }

    /**
     * <p>
     * Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster. If this
     * value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have the proper policy
     * permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM user that created the
     * cluster can view and manage it. This value can be changed using the <a>SetVisibleToAllUsers</a> action.
     * </p>
     * 
     * @return Specifies whether the cluster is visible to all IAM users of the AWS account associated with the cluster.
     *         If this value is set to <code>true</code>, all IAM users of that AWS account can view and (if they have
     *         the proper policy permissions set) manage the cluster. If it is set to <code>false</code>, only the IAM
     *         user that created the cluster can view and manage it. This value can be changed using the
     *         <a>SetVisibleToAllUsers</a> action.
     */

    public Boolean isVisibleToAllUsers() {
        return this.visibleToAllUsers;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     * 
     * @param jobFlowRole
     *        The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume
     *        this role.
     */

    public void setJobFlowRole(String jobFlowRole) {
        this.jobFlowRole = jobFlowRole;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     * 
     * @return The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume
     *         this role.
     */

    public String getJobFlowRole() {
        return this.jobFlowRole;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     * 
     * @param jobFlowRole
     *        The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume
     *        this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withJobFlowRole(String jobFlowRole) {
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

    public JobFlowDetail withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides a way for the automatic scaling feature to get the required permissions it needs to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * 
     * @param autoScalingRole
     *        An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *        The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to
     *        launch and terminate EC2 instances in an instance group.
     */

    public void setAutoScalingRole(String autoScalingRole) {
        this.autoScalingRole = autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides a way for the automatic scaling feature to get the required permissions it needs to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * 
     * @return An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *         The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to
     *         launch and terminate EC2 instances in an instance group.
     */

    public String getAutoScalingRole() {
        return this.autoScalingRole;
    }

    /**
     * <p>
     * An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>. The IAM
     * role provides a way for the automatic scaling feature to get the required permissions it needs to launch and
     * terminate EC2 instances in an instance group.
     * </p>
     * 
     * @param autoScalingRole
     *        An IAM role for automatic scaling policies. The default role is <code>EMR_AutoScaling_DefaultRole</code>.
     *        The IAM role provides a way for the automatic scaling feature to get the required permissions it needs to
     *        launch and terminate EC2 instances in an instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobFlowDetail withAutoScalingRole(String autoScalingRole) {
        setAutoScalingRole(autoScalingRole);
        return this;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only
     *        in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
     * @see ScaleDownBehavior
     */

    public void setScaleDownBehavior(String scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @return The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *         instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *         nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *         submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *         created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR
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
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only
     *        in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleDownBehavior
     */

    public JobFlowDetail withScaleDownBehavior(String scaleDownBehavior) {
        setScaleDownBehavior(scaleDownBehavior);
        return this;
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only
     *        in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
     * @see ScaleDownBehavior
     */

    public void setScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        withScaleDownBehavior(scaleDownBehavior);
    }

    /**
     * <p>
     * The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an instance
     * group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates nodes at the
     * instance-hour boundary, regardless of when the request to terminate the instance was submitted. This option is
     * only available with Amazon EMR 5.1.0 and later and is the default for clusters created using that version.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists and drains tasks from nodes before
     * terminating the Amazon EC2 instances, regardless of the instance-hour boundary. With either behavior, Amazon EMR
     * removes the least active nodes first and blocks instance termination if it could lead to HDFS corruption.
     * <code>TERMINATE_AT_TASK_COMPLETION</code> available only in Amazon EMR version 4.1.0 and later, and is the
     * default for versions of Amazon EMR earlier than 5.1.0.
     * </p>
     * 
     * @param scaleDownBehavior
     *        The way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an
     *        instance group is resized. <code>TERMINATE_AT_INSTANCE_HOUR</code> indicates that Amazon EMR terminates
     *        nodes at the instance-hour boundary, regardless of when the request to terminate the instance was
     *        submitted. This option is only available with Amazon EMR 5.1.0 and later and is the default for clusters
     *        created using that version. <code>TERMINATE_AT_TASK_COMPLETION</code> indicates that Amazon EMR blacklists
     *        and drains tasks from nodes before terminating the Amazon EC2 instances, regardless of the instance-hour
     *        boundary. With either behavior, Amazon EMR removes the least active nodes first and blocks instance
     *        termination if it could lead to HDFS corruption. <code>TERMINATE_AT_TASK_COMPLETION</code> available only
     *        in Amazon EMR version 4.1.0 and later, and is the default for versions of Amazon EMR earlier than 5.1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScaleDownBehavior
     */

    public JobFlowDetail withScaleDownBehavior(ScaleDownBehavior scaleDownBehavior) {
        this.scaleDownBehavior = scaleDownBehavior.toString();
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: ").append(getJobFlowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getAmiVersion() != null)
            sb.append("AmiVersion: ").append(getAmiVersion()).append(",");
        if (getExecutionStatusDetail() != null)
            sb.append("ExecutionStatusDetail: ").append(getExecutionStatusDetail()).append(",");
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: ").append(getBootstrapActions()).append(",");
        if (getSupportedProducts() != null)
            sb.append("SupportedProducts: ").append(getSupportedProducts()).append(",");
        if (getVisibleToAllUsers() != null)
            sb.append("VisibleToAllUsers: ").append(getVisibleToAllUsers()).append(",");
        if (getJobFlowRole() != null)
            sb.append("JobFlowRole: ").append(getJobFlowRole()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getAutoScalingRole() != null)
            sb.append("AutoScalingRole: ").append(getAutoScalingRole()).append(",");
        if (getScaleDownBehavior() != null)
            sb.append("ScaleDownBehavior: ").append(getScaleDownBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobFlowDetail == false)
            return false;
        JobFlowDetail other = (JobFlowDetail) obj;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getAmiVersion() == null ^ this.getAmiVersion() == null)
            return false;
        if (other.getAmiVersion() != null && other.getAmiVersion().equals(this.getAmiVersion()) == false)
            return false;
        if (other.getExecutionStatusDetail() == null ^ this.getExecutionStatusDetail() == null)
            return false;
        if (other.getExecutionStatusDetail() != null && other.getExecutionStatusDetail().equals(this.getExecutionStatusDetail()) == false)
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

        hashCode = prime * hashCode + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getAmiVersion() == null) ? 0 : getAmiVersion().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatusDetail() == null) ? 0 : getExecutionStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode());
        hashCode = prime * hashCode + ((getSupportedProducts() == null) ? 0 : getSupportedProducts().hashCode());
        hashCode = prime * hashCode + ((getVisibleToAllUsers() == null) ? 0 : getVisibleToAllUsers().hashCode());
        hashCode = prime * hashCode + ((getJobFlowRole() == null) ? 0 : getJobFlowRole().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingRole() == null) ? 0 : getAutoScalingRole().hashCode());
        hashCode = prime * hashCode + ((getScaleDownBehavior() == null) ? 0 : getScaleDownBehavior().hashCode());
        return hashCode;
    }

    @Override
    public JobFlowDetail clone() {
        try {
            return (JobFlowDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.JobFlowDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
