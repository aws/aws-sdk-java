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
 * CreateTaskRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of your transfer's source location.
     * </p>
     */
    private String sourceLocationArn;
    /**
     * <p>
     * Specifies the ARN of your transfer's destination location.
     * </p>
     */
    private String destinationLocationArn;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an Amazon CloudWatch log group for monitoring your task.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * Specifies the name of your task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other options.
     * </p>
     */
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
     * Specifies the tags that you want to apply to your task.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     */
    private java.util.List<TagListEntry> tags;
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     */
    private TaskReportConfig taskReportConfig;

    /**
     * <p>
     * Specifies the ARN of your transfer's source location.
     * </p>
     * 
     * @param sourceLocationArn
     *        Specifies the ARN of your transfer's source location.
     */

    public void setSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
    }

    /**
     * <p>
     * Specifies the ARN of your transfer's source location.
     * </p>
     * 
     * @return Specifies the ARN of your transfer's source location.
     */

    public String getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * <p>
     * Specifies the ARN of your transfer's source location.
     * </p>
     * 
     * @param sourceLocationArn
     *        Specifies the ARN of your transfer's source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withSourceLocationArn(String sourceLocationArn) {
        setSourceLocationArn(sourceLocationArn);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of your transfer's destination location.
     * </p>
     * 
     * @param destinationLocationArn
     *        Specifies the ARN of your transfer's destination location.
     */

    public void setDestinationLocationArn(String destinationLocationArn) {
        this.destinationLocationArn = destinationLocationArn;
    }

    /**
     * <p>
     * Specifies the ARN of your transfer's destination location.
     * </p>
     * 
     * @return Specifies the ARN of your transfer's destination location.
     */

    public String getDestinationLocationArn() {
        return this.destinationLocationArn;
    }

    /**
     * <p>
     * Specifies the ARN of your transfer's destination location.
     * </p>
     * 
     * @param destinationLocationArn
     *        Specifies the ARN of your transfer's destination location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withDestinationLocationArn(String destinationLocationArn) {
        setDestinationLocationArn(destinationLocationArn);
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

    public CreateTaskRequest withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
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

    public CreateTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other options.
     * </p>
     * 
     * @param options
     *        Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other
     *        options.
     */

    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * <p>
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other options.
     * </p>
     * 
     * @return Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other
     *         options.
     */

    public Options getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other options.
     * </p>
     * 
     * @param options
     *        Specifies your task's settings, such as preserving file metadata, verifying data integrity, among other
     *        options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withOptions(Options options) {
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

    public CreateTaskRequest withExcludes(FilterRule... excludes) {
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

    public CreateTaskRequest withExcludes(java.util.Collection<FilterRule> excludes) {
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

    public CreateTaskRequest withSchedule(TaskSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * Specifies the tags that you want to apply to your task.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * 
     * @return Specifies the tags that you want to apply to your task.</p>
     *         <p>
     *         <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags that you want to apply to your task.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * 
     * @param tags
     *        Specifies the tags that you want to apply to your task.</p>
     *        <p>
     *        <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies the tags that you want to apply to your task.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags that you want to apply to your task.</p>
     *        <p>
     *        <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags that you want to apply to your task.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * 
     * @param tags
     *        Specifies the tags that you want to apply to your task.</p>
     *        <p>
     *        <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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

    public CreateTaskRequest withIncludes(FilterRule... includes) {
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

    public CreateTaskRequest withIncludes(java.util.Collection<FilterRule> includes) {
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * 
     * @param manifestConfig
     *        Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     *        information and configuration examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     *        <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * 
     * @return Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     *         information and configuration examples, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *         what DataSync transfers by using a manifest</a>.</p>
     *         <p>
     *         When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     *         <code>iam:PassRole</code> permission. The <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *         >AWSDataSyncFullAccess</a> policy includes this permission.
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * 
     * @param manifestConfig
     *        Configures a manifest, which is a list of files or objects that you want DataSync to transfer. For more
     *        information and configuration examples, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/transferring-with-manifest.html">Specifying
     *        what DataSync transfers by using a manifest</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     *        <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withManifestConfig(ManifestConfig manifestConfig) {
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * 
     * @param taskReportConfig
     *        Specifies how you want to configure a task report, which provides detailed information about your DataSync
     *        transfer. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *        transfers with task reports</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     *        <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * 
     * @return Specifies how you want to configure a task report, which provides detailed information about your
     *         DataSync transfer. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *         transfers with task reports</a>.</p>
     *         <p>
     *         When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     *         <code>iam:PassRole</code> permission. The <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *         >AWSDataSyncFullAccess</a> policy includes this permission.
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
     * When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     * <code>iam:PassRole</code> permission. The <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     * >AWSDataSyncFullAccess</a> policy includes this permission.
     * </p>
     * 
     * @param taskReportConfig
     *        Specifies how you want to configure a task report, which provides detailed information about your DataSync
     *        transfer. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">Monitoring your DataSync
     *        transfers with task reports</a>.</p>
     *        <p>
     *        When using this parameter, your caller identity (the role that you're using DataSync with) must have the
     *        <code>iam:PassRole</code> permission. The <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/security-iam-awsmanpol.html#security-iam-awsmanpol-awsdatasyncfullaccess"
     *        >AWSDataSyncFullAccess</a> policy includes this permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTaskReportConfig(TaskReportConfig taskReportConfig) {
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
        if (getSourceLocationArn() != null)
            sb.append("SourceLocationArn: ").append(getSourceLocationArn()).append(",");
        if (getDestinationLocationArn() != null)
            sb.append("DestinationLocationArn: ").append(getDestinationLocationArn()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateTaskRequest == false)
            return false;
        CreateTaskRequest other = (CreateTaskRequest) obj;
        if (other.getSourceLocationArn() == null ^ this.getSourceLocationArn() == null)
            return false;
        if (other.getSourceLocationArn() != null && other.getSourceLocationArn().equals(this.getSourceLocationArn()) == false)
            return false;
        if (other.getDestinationLocationArn() == null ^ this.getDestinationLocationArn() == null)
            return false;
        if (other.getDestinationLocationArn() != null && other.getDestinationLocationArn().equals(this.getDestinationLocationArn()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getSourceLocationArn() == null) ? 0 : getSourceLocationArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationLocationArn() == null) ? 0 : getDestinationLocationArn().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        hashCode = prime * hashCode + ((getManifestConfig() == null) ? 0 : getManifestConfig().hashCode());
        hashCode = prime * hashCode + ((getTaskReportConfig() == null) ? 0 : getTaskReportConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateTaskRequest clone() {
        return (CreateTaskRequest) super.clone();
    }

}
