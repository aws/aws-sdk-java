/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StartTaskExecutionRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StartTaskExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTaskExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     * </p>
     */
    private String taskArn;

    private Options overrideOptions;
    /**
     * <p>
     * Specifies a list of filter rules that determines which files to include when running a task. The pattern should
     * contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that
     * is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * </p>
     */
    private java.util.List<FilterRule> includes;
    /**
     * <p>
     * Specifies a list of filter rules that determines which files to exclude from a task. The list contains a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example, <code>"/folder1|/folder2"</code>.
     * </p>
     */
    private java.util.List<FilterRule> excludes;
    /**
     * <p>
     * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task execution.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     * </p>
     * 
     * @param taskArn
     *        Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     * </p>
     * 
     * @param taskArn
     *        Specifies the Amazon Resource Name (ARN) of the task that you want to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * @param overrideOptions
     */

    public void setOverrideOptions(Options overrideOptions) {
        this.overrideOptions = overrideOptions;
    }

    /**
     * @return
     */

    public Options getOverrideOptions() {
        return this.overrideOptions;
    }

    /**
     * @param overrideOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withOverrideOptions(Options overrideOptions) {
        setOverrideOptions(overrideOptions);
        return this;
    }

    /**
     * <p>
     * Specifies a list of filter rules that determines which files to include when running a task. The pattern should
     * contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that
     * is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * </p>
     * 
     * @return Specifies a list of filter rules that determines which files to include when running a task. The pattern
     *         should contain a single filter string that consists of the patterns to include. The patterns are
     *         delimited by "|" (that is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     */

    public java.util.List<FilterRule> getIncludes() {
        return includes;
    }

    /**
     * <p>
     * Specifies a list of filter rules that determines which files to include when running a task. The pattern should
     * contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that
     * is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * </p>
     * 
     * @param includes
     *        Specifies a list of filter rules that determines which files to include when running a task. The pattern
     *        should contain a single filter string that consists of the patterns to include. The patterns are delimited
     *        by "|" (that is, a pipe), for example, <code>"/folder1|/folder2"</code>.
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
     * Specifies a list of filter rules that determines which files to include when running a task. The pattern should
     * contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that
     * is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludes(java.util.Collection)} or {@link #withIncludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param includes
     *        Specifies a list of filter rules that determines which files to include when running a task. The pattern
     *        should contain a single filter string that consists of the patterns to include. The patterns are delimited
     *        by "|" (that is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withIncludes(FilterRule... includes) {
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
     * Specifies a list of filter rules that determines which files to include when running a task. The pattern should
     * contain a single filter string that consists of the patterns to include. The patterns are delimited by "|" (that
     * is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * </p>
     * 
     * @param includes
     *        Specifies a list of filter rules that determines which files to include when running a task. The pattern
     *        should contain a single filter string that consists of the patterns to include. The patterns are delimited
     *        by "|" (that is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withIncludes(java.util.Collection<FilterRule> includes) {
        setIncludes(includes);
        return this;
    }

    /**
     * <p>
     * Specifies a list of filter rules that determines which files to exclude from a task. The list contains a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example, <code>"/folder1|/folder2"</code>.
     * </p>
     * 
     * @return Specifies a list of filter rules that determines which files to exclude from a task. The list contains a
     *         single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that
     *         is, a pipe), for example, <code>"/folder1|/folder2"</code>.
     */

    public java.util.List<FilterRule> getExcludes() {
        return excludes;
    }

    /**
     * <p>
     * Specifies a list of filter rules that determines which files to exclude from a task. The list contains a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example, <code>"/folder1|/folder2"</code>.
     * </p>
     * 
     * @param excludes
     *        Specifies a list of filter rules that determines which files to exclude from a task. The list contains a
     *        single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is,
     *        a pipe), for example, <code>"/folder1|/folder2"</code>.
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
     * Specifies a list of filter rules that determines which files to exclude from a task. The list contains a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example, <code>"/folder1|/folder2"</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludes(java.util.Collection)} or {@link #withExcludes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param excludes
     *        Specifies a list of filter rules that determines which files to exclude from a task. The list contains a
     *        single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is,
     *        a pipe), for example, <code>"/folder1|/folder2"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withExcludes(FilterRule... excludes) {
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
     * Specifies a list of filter rules that determines which files to exclude from a task. The list contains a single
     * filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is, a pipe), for
     * example, <code>"/folder1|/folder2"</code>.
     * </p>
     * 
     * @param excludes
     *        Specifies a list of filter rules that determines which files to exclude from a task. The list contains a
     *        single filter string that consists of the patterns to exclude. The patterns are delimited by "|" (that is,
     *        a pipe), for example, <code>"/folder1|/folder2"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withExcludes(java.util.Collection<FilterRule> excludes) {
        setExcludes(excludes);
        return this;
    }

    /**
     * <p>
     * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task execution.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * 
     * @return Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task
     *         execution.</p>
     *         <p>
     *         <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task execution.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * 
     * @param tags
     *        Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task
     *        execution.</p>
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
     * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task execution.
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
     *        Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task
     *        execution.</p>
     *        <p>
     *        <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withTags(TagListEntry... tags) {
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
     * Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task execution.
     * </p>
     * <p>
     * <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * </p>
     * 
     * @param tags
     *        Specifies the tags that you want to apply to the Amazon Resource Name (ARN) representing the task
     *        execution.</p>
     *        <p>
     *        <i>Tags</i> are key-value pairs that help you manage, filter, and search for your DataSync resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTaskExecutionRequest withTags(java.util.Collection<TagListEntry> tags) {
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
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getOverrideOptions() != null)
            sb.append("OverrideOptions: ").append(getOverrideOptions()).append(",");
        if (getIncludes() != null)
            sb.append("Includes: ").append(getIncludes()).append(",");
        if (getExcludes() != null)
            sb.append("Excludes: ").append(getExcludes()).append(",");
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

        if (obj instanceof StartTaskExecutionRequest == false)
            return false;
        StartTaskExecutionRequest other = (StartTaskExecutionRequest) obj;
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getOverrideOptions() == null ^ this.getOverrideOptions() == null)
            return false;
        if (other.getOverrideOptions() != null && other.getOverrideOptions().equals(this.getOverrideOptions()) == false)
            return false;
        if (other.getIncludes() == null ^ this.getIncludes() == null)
            return false;
        if (other.getIncludes() != null && other.getIncludes().equals(this.getIncludes()) == false)
            return false;
        if (other.getExcludes() == null ^ this.getExcludes() == null)
            return false;
        if (other.getExcludes() != null && other.getExcludes().equals(this.getExcludes()) == false)
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

        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getOverrideOptions() == null) ? 0 : getOverrideOptions().hashCode());
        hashCode = prime * hashCode + ((getIncludes() == null) ? 0 : getIncludes().hashCode());
        hashCode = prime * hashCode + ((getExcludes() == null) ? 0 : getExcludes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartTaskExecutionRequest clone() {
        return (StartTaskExecutionRequest) super.clone();
    }

}
