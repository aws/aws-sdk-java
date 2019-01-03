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
     * The Amazon Resource Name (ARN) of the source location for the task.
     * </p>
     */
    private String sourceLocationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     * </p>
     */
    private String destinationLocationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the
     * task. For more information on these groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i>
     * </p>
     * <p>
     * For more information about how to useCloudWatchLogs with DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your Task</a>.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The name of a task. This value is a text reference that is used to identify the task in the console.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The set of configuration options that control the behavior of a single execution of the task that occurs when you
     * call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such as user ID (UID)
     * and group ID (GID), file permissions, data integrity verification, and so on.
     * </p>
     * <p>
     * For each individual task execution, you can override these options by specifying the <code>OverrideOptions</code>
     * before starting a the task execution. For more information, see the operation.
     * </p>
     */
    private Options options;
    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     * string.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source location for the task.
     * </p>
     * 
     * @param sourceLocationArn
     *        The Amazon Resource Name (ARN) of the source location for the task.
     */

    public void setSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source location for the task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source location for the task.
     */

    public String getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source location for the task.
     * </p>
     * 
     * @param sourceLocationArn
     *        The Amazon Resource Name (ARN) of the source location for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withSourceLocationArn(String sourceLocationArn) {
        setSourceLocationArn(sourceLocationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     * </p>
     * 
     * @param destinationLocationArn
     *        The Amazon Resource Name (ARN) of an AWS storage resource's location.
     */

    public void setDestinationLocationArn(String destinationLocationArn) {
        this.destinationLocationArn = destinationLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS storage resource's location.
     */

    public String getDestinationLocationArn() {
        return this.destinationLocationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS storage resource's location.
     * </p>
     * 
     * @param destinationLocationArn
     *        The Amazon Resource Name (ARN) of an AWS storage resource's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withDestinationLocationArn(String destinationLocationArn) {
        setDestinationLocationArn(destinationLocationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the
     * task. For more information on these groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i>
     * </p>
     * <p>
     * For more information about how to useCloudWatchLogs with DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your Task</a>.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events
     *        in the task. For more information on these groups, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *        >Working with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i> </p>
     *        <p>
     *        For more information about how to useCloudWatchLogs with DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your
     *        Task</a>.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the
     * task. For more information on these groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i>
     * </p>
     * <p>
     * For more information about how to useCloudWatchLogs with DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your Task</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events
     *         in the task. For more information on these groups, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *         >Working with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i> </p>
     *         <p>
     *         For more information about how to useCloudWatchLogs with DataSync, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your
     *         Task</a>.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events in the
     * task. For more information on these groups, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html">Working
     * with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i>
     * </p>
     * <p>
     * For more information about how to useCloudWatchLogs with DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your Task</a>.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor and log events
     *        in the task. For more information on these groups, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html"
     *        >Working with Log Groups and Log Streams</a> in the <i>Amazon CloudWatch User Guide. </i> </p>
     *        <p>
     *        For more information about how to useCloudWatchLogs with DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/monitor-datasync.html">Monitoring Your
     *        Task</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The name of a task. This value is a text reference that is used to identify the task in the console.
     * </p>
     * 
     * @param name
     *        The name of a task. This value is a text reference that is used to identify the task in the console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a task. This value is a text reference that is used to identify the task in the console.
     * </p>
     * 
     * @return The name of a task. This value is a text reference that is used to identify the task in the console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a task. This value is a text reference that is used to identify the task in the console.
     * </p>
     * 
     * @param name
     *        The name of a task. This value is a text reference that is used to identify the task in the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The set of configuration options that control the behavior of a single execution of the task that occurs when you
     * call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such as user ID (UID)
     * and group ID (GID), file permissions, data integrity verification, and so on.
     * </p>
     * <p>
     * For each individual task execution, you can override these options by specifying the <code>OverrideOptions</code>
     * before starting a the task execution. For more information, see the operation.
     * </p>
     * 
     * @param options
     *        The set of configuration options that control the behavior of a single execution of the task that occurs
     *        when you call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such
     *        as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on.</p>
     *        <p>
     *        For each individual task execution, you can override these options by specifying the
     *        <code>OverrideOptions</code> before starting a the task execution. For more information, see the
     *        operation.
     */

    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * <p>
     * The set of configuration options that control the behavior of a single execution of the task that occurs when you
     * call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such as user ID (UID)
     * and group ID (GID), file permissions, data integrity verification, and so on.
     * </p>
     * <p>
     * For each individual task execution, you can override these options by specifying the <code>OverrideOptions</code>
     * before starting a the task execution. For more information, see the operation.
     * </p>
     * 
     * @return The set of configuration options that control the behavior of a single execution of the task that occurs
     *         when you call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such
     *         as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on.</p>
     *         <p>
     *         For each individual task execution, you can override these options by specifying the
     *         <code>OverrideOptions</code> before starting a the task execution. For more information, see the
     *         operation.
     */

    public Options getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The set of configuration options that control the behavior of a single execution of the task that occurs when you
     * call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such as user ID (UID)
     * and group ID (GID), file permissions, data integrity verification, and so on.
     * </p>
     * <p>
     * For each individual task execution, you can override these options by specifying the <code>OverrideOptions</code>
     * before starting a the task execution. For more information, see the operation.
     * </p>
     * 
     * @param options
     *        The set of configuration options that control the behavior of a single execution of the task that occurs
     *        when you call <code>StartTaskExecution</code>. You can configure these options to preserve metadata such
     *        as user ID (UID) and group ID (GID), file permissions, data integrity verification, and so on.</p>
     *        <p>
     *        For each individual task execution, you can override these options by specifying the
     *        <code>OverrideOptions</code> before starting a the task execution. For more information, see the
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withOptions(Options options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     * string.
     * </p>
     * 
     * @return The key-value pair that represents the tag that you want to add to the resource. The value can be an
     *         empty string.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     * string.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     *        string.
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
     * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     * string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     *        string.
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
     * The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     * string.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the resource. The value can be an empty
     *        string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTaskRequest clone() {
        return (CreateTaskRequest) super.clone();
    }

}
