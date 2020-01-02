/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The Amazon Resource Name (ARN) of the resource name of the task to update.
     * </p>
     */
    private String taskArn;

    private Options options;
    /**
     * <p>
     * A list of filter rules that determines which files to exclude from a task. The list should contain a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example: <code>"/folder1|/folder2"</code>
     * </p>
     * <p>
     * </p>
     */
    private java.util.List<FilterRule> excludes;
    /**
     * <p>
     * Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     * configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day
     * or hour you want the task to execute. The time you specify is UTC time. For more information, see
     * <a>task-scheduling</a>.
     * </p>
     */
    private TaskSchedule schedule;
    /**
     * <p>
     * The name of the task to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     * </p>
     */
    private String cloudWatchLogGroupArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the task to update.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the resource name of the task to update.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the task to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource name of the task to update.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the task to update.
     * </p>
     * 
     * @param taskArn
     *        The Amazon Resource Name (ARN) of the resource name of the task to update.
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
     * A list of filter rules that determines which files to exclude from a task. The list should contain a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example: <code>"/folder1|/folder2"</code>
     * </p>
     * <p>
     * </p>
     * 
     * @return A list of filter rules that determines which files to exclude from a task. The list should contain a
     *         single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that
     *         is, a pipe), for example: <code>"/folder1|/folder2"</code> </p>
     *         <p>
     */

    public java.util.List<FilterRule> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * A list of filter rules that determines which files to exclude from a task. The list should contain a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example: <code>"/folder1|/folder2"</code>
     * </p>
     * <p>
     * </p>
     * 
     * @param excludes
     *        A list of filter rules that determines which files to exclude from a task. The list should contain a
     *        single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is,
     *        a pipe), for example: <code>"/folder1|/folder2"</code> </p>
     *        <p>
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
     * A list of filter rules that determines which files to exclude from a task. The list should contain a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example: <code>"/folder1|/folder2"</code>
     * </p>
     * <p>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        A list of filter rules that determines which files to exclude from a task. The list should contain a
     *        single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is,
     *        a pipe), for example: <code>"/folder1|/folder2"</code> </p>
     *        <p>
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
     * A list of filter rules that determines which files to exclude from a task. The list should contain a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example: <code>"/folder1|/folder2"</code>
     * </p>
     * <p>
     * </p>
     * 
     * @param excludes
     *        A list of filter rules that determines which files to exclude from a task. The list should contain a
     *        single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is,
     *        a pipe), for example: <code>"/folder1|/folder2"</code> </p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withExcludes(java.util.Collection<FilterRule> excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     * configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day
     * or hour you want the task to execute. The time you specify is UTC time. For more information, see
     * <a>task-scheduling</a>.
     * </p>
     * 
     * @param schedule
     *        Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     *        configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in
     *        the day or hour you want the task to execute. The time you specify is UTC time. For more information, see
     *        <a>task-scheduling</a>.
     */

    public void setSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     * configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day
     * or hour you want the task to execute. The time you specify is UTC time. For more information, see
     * <a>task-scheduling</a>.
     * </p>
     * 
     * @return Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     *         configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in
     *         the day or hour you want the task to execute. The time you specify is UTC time. For more information, see
     *         <a>task-scheduling</a>.
     */

    public TaskSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     * configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in the day
     * or hour you want the task to execute. The time you specify is UTC time. For more information, see
     * <a>task-scheduling</a>.
     * </p>
     * 
     * @param schedule
     *        Specifies a schedule used to periodically transfer files from a source to a destination location. You can
     *        configure your task to execute hourly, daily, weekly or on specific days of the week. You control when in
     *        the day or hour you want the task to execute. The time you specify is UTC time. For more information, see
     *        <a>task-scheduling</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withSchedule(TaskSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The name of the task to update.
     * </p>
     * 
     * @param name
     *        The name of the task to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the task to update.
     * </p>
     * 
     * @return The name of the task to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the task to update.
     * </p>
     * 
     * @param name
     *        The name of the task to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the resource name of the CloudWatch LogGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
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
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn());
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
        return hashCode;
    }

    @Override
    public UpdateTaskRequest clone() {
        return (UpdateTaskRequest) super.clone();
    }

}
