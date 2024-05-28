/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * UpdateTaskResponse
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the task that you want to update.
     * </p>
     */
    private String taskArn;

    private Options options;
    /**
     * <p>
     * Specifies exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     */
    private java.util.List<FilterRule> excludes;
    /**
     * <p>
     * Specifies a schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     */
    private TaskSchedule schedule;
    /**
     * <p>
     * Specifies the name of your task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * Specifies include filters define the files, objects, and folders in your source location that you want DataSync
     * to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     */
    private java.util.List<FilterRule> includes;
    /**
     * <p>
     * Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     * information and configuration examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a manifest configuration, specify this parameter as empty.
     * </p>
     */
    private ManifestConfig manifestConfig;
    /**
     * <p>
     * Specifies how you want to configure a task report, which provides detailed information about your DataSync
     * transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync transfers
     * with task reports</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a task report configuration, specify this parameter as empty.
     * </p>
     */
    private TaskReportConfig taskReportConfig;

    /**
     * <p>
     * Specifies the ARN of the task that you want to update.
     * </p>
     * 
     * @param taskArn
     *        Specifies the ARN of the task that you want to update.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * Specifies the ARN of the task that you want to update.
     * </p>
     * 
     * @return Specifies the ARN of the task that you want to update.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * Specifies the ARN of the task that you want to update.
     * </p>
     * 
     * @param taskArn
     *        Specifies the ARN of the task that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * @param options
     */

    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * @return
     */

    public Options getOptions() {
        return this.options;
    }

    /**
     * @param options
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withOptions(Options options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Specifies exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @return Specifies exclude filters that define the files, objects, and folders in your source location that you
     *         don't want DataSync to transfer. For more information and examples, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *         transfers by using filters</a>.
     */

    public java.util.List<FilterRule> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * Specifies exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param excludes
     *        Specifies exclude filters that define the files, objects, and folders in your source location that you
     *        don't want DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     */

    public void setExcludes(java.util.Collection<FilterRule> excludes) {
        if (excludes == null) {
            this.excludes = null;
            return;
        }

        this.excludes = new java.util.ArrayList<FilterRule>(excludes);
    }

    /**
     * <p>
     * Specifies exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        Specifies exclude filters that define the files, objects, and folders in your source location that you
     *        don't want DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withExcludes(FilterRule... excludes) {
        if (this.excludes == null) {
            setExcludes(new java.util.ArrayList<FilterRule>(excludes.length));
        }
        for (FilterRule ele : excludes) {
            this.excludes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies exclude filters that define the files, objects, and folders in your source location that you don't want
     * DataSync to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param excludes
     *        Specifies exclude filters that define the files, objects, and folders in your source location that you
     *        don't want DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withExcludes(java.util.Collection<FilterRule> excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * Specifies a schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     * 
     * @param schedule
     *        Specifies a schedule for when you want your task to run. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your
     *        task</a>.
     */

    public void setSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Specifies a schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     * 
     * @return Specifies a schedule for when you want your task to run. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your
     *         task</a>.
     */

    public TaskSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * Specifies a schedule for when you want your task to run. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your task</a>.
     * </p>
     * 
     * @param schedule
     *        Specifies a schedule for when you want your task to run. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-scheduling.html">Scheduling your
     *        task</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withSchedule(TaskSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * Specifies the name of your task.
     * </p>
     * 
     * @param name
     *        Specifies the name of your task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of your task.
     * </p>
     * 
     * @return Specifies the name of your task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of your task.
     * </p>
     * 
     * @param name
     *        Specifies the name of your task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Specifies include filters define the files, objects, and folders in your source location that you want DataSync
     * to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @return Specifies include filters define the files, objects, and folders in your source location that you want
     *         DataSync to transfer. For more information and examples, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *         transfers by using filters</a>.
     */

    public java.util.List<FilterRule> getIncludes() {
        return includes;
    }

    /**
     * <p>
     * Specifies include filters define the files, objects, and folders in your source location that you want DataSync
     * to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param includes
     *        Specifies include filters define the files, objects, and folders in your source location that you want
     *        DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     */

    public void setIncludes(java.util.Collection<FilterRule> includes) {
        if (includes == null) {
            this.includes = null;
            return;
        }

        this.includes = new java.util.ArrayList<FilterRule>(includes);
    }

    /**
     * <p>
     * Specifies include filters define the files, objects, and folders in your source location that you want DataSync
     * to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludes(java.util.Collection)} or {@link #withIncludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param includes
     *        Specifies include filters define the files, objects, and folders in your source location that you want
     *        DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withIncludes(FilterRule... includes) {
        if (this.includes == null) {
            setIncludes(new java.util.ArrayList<FilterRule>(includes.length));
        }
        for (FilterRule ele : includes) {
            this.includes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies include filters define the files, objects, and folders in your source location that you want DataSync
     * to transfer. For more information and examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync transfers by
     * using filters</a>.
     * </p>
     * 
     * @param includes
     *        Specifies include filters define the files, objects, and folders in your source location that you want
     *        DataSync to transfer. For more information and examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/filtering.html">Specifying what DataSync
     *        transfers by using filters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withIncludes(java.util.Collection<FilterRule> includes) {
        setIncludes(includes);
        return this;
    }

    /**
     * <p>
     * Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     * information and configuration examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a manifest configuration, specify this parameter as empty.
     * </p>
     * 
     * @param manifestConfig
     *        Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     *        information and configuration examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have
     *        the <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
     *        </p>
     *        <p>
     *        To remove a manifest configuration, specify this parameter as empty.
     */

    public void setManifestConfig(ManifestConfig manifestConfig) {
        this.manifestConfig = manifestConfig;
    }

    /**
     * <p>
     * Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     * information and configuration examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a manifest configuration, specify this parameter as empty.
     * </p>
     * 
     * @return Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     *         information and configuration examples, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *         what DataSync transfers by using a manifest</a>.</p>
     *         <p>
     *         When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have
     *         the <code>iam:PassRole</code> permission. The <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *         >AWSDataSyncFullAccess</a> policy includes this permission.
     *         </p>
     *         <p>
     *         To remove a manifest configuration, specify this parameter as empty.
     */

    public ManifestConfig getManifestConfig() {
        return this.manifestConfig;
    }

    /**
     * <p>
     * Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     * information and configuration examples, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying what
     * DataSync transfers by using a manifest</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a manifest configuration, specify this parameter as empty.
     * </p>
     * 
     * @param manifestConfig
     *        Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     *        information and configuration examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have
     *        the <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
     *        </p>
     *        <p>
     *        To remove a manifest configuration, specify this parameter as empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withManifestConfig(ManifestConfig manifestConfig) {
        setManifestConfig(manifestConfig);
        return this;
    }

    /**
     * <p>
     * Specifies how you want to configure a task report, which provides detailed information about your DataSync
     * transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync transfers
     * with task reports</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a task report configuration, specify this parameter as empty.
     * </p>
     * 
     * @param taskReportConfig
     *        Specifies how you want to configure a task report, which provides detailed information about your DataSync
     *        transfer. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *        transfers with task reports</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have
     *        the <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
     *        </p>
     *        <p>
     *        To remove a task report configuration, specify this parameter as empty.
     */

    public void setTaskReportConfig(TaskReportConfig taskReportConfig) {
        this.taskReportConfig = taskReportConfig;
    }

    /**
     * <p>
     * Specifies how you want to configure a task report, which provides detailed information about your DataSync
     * transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync transfers
     * with task reports</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a task report configuration, specify this parameter as empty.
     * </p>
     * 
     * @return Specifies how you want to configure a task report, which provides detailed information about your
     *         DataSync transfer. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *         transfers with task reports</a>.</p>
     *         <p>
     *         When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have
     *         the <code>iam:PassRole</code> permission. The <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *         >AWSDataSyncFullAccess</a> policy includes this permission.
     *         </p>
     *         <p>
     *         To remove a task report configuration, specify this parameter as empty.
     */

    public TaskReportConfig getTaskReportConfig() {
        return this.taskReportConfig;
    }

    /**
     * <p>
     * Specifies how you want to configure a task report, which provides detailed information about your DataSync
     * transfer. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync transfers
     * with task reports</a>.
     * </p>
     * <p>
     * When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * <p>
     * To remove a task report configuration, specify this parameter as empty.
     * </p>
     * 
     * @param taskReportConfig
     *        Specifies how you want to configure a task report, which provides detailed information about your DataSync
     *        transfer. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *        transfers with task reports</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the IAM role that you're using DataSync with) must have
     *        the <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
     *        </p>
     *        <p>
     *        To remove a task report configuration, specify this parameter as empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withTaskReportConfig(TaskReportConfig taskReportConfig) {
        setTaskReportConfig(taskReportConfig);
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes()).append(",");
        if (getManifestConfig() != null)
            sb.append("ManifestConfig: ").append(getManifestConfig()).append(",");
        if (getTaskReportConfig() != null)
            sb.append("TaskReportConfig: ").append(getTaskReportConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTaskRequest == false)
            return false;
        UpdateTaskRequest other = (UpdateTaskRequest) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        if (other.getManifestConfig() == null ^ this.getManifestConfig() == null)
            return false;
        if (other.getManifestConfig() != null && other.getManifestConfig().equals(this.getManifestConfig()) == false)
            return false;
        if (other.getTaskReportConfig() == null ^ this.getTaskReportConfig() == null)
            return false;
        if (other.getTaskReportConfig() != null && other.getTaskReportConfig().equals(this.getTaskReportConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        hashCode = prime * hashCode + ((getManifestConfig() == null) ? 0 : getManifestConfig().hashCode());
        hashCode = prime * hashCode + ((getTaskReportConfig() == null) ? 0 : getTaskReportConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTaskRequest clone() {
        return (UpdateTaskRequest) super.clone();
    }

}
