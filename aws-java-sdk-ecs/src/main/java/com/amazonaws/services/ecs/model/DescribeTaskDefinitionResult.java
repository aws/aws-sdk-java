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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DescribeTaskDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTaskDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The full task definition description.
     * </p>
     */
    private TaskDefinition taskDefinition;
    /**
     * <p>
     * The metadata that is applied to the task definition to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The full task definition description.
     * </p>
     * 
     * @param taskDefinition
     *        The full task definition description.
     */

    public void setTaskDefinition(TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The full task definition description.
     * </p>
     * 
     * @return The full task definition description.
     */

    public TaskDefinition getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The full task definition description.
     * </p>
     * 
     * @param taskDefinition
     *        The full task definition description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskDefinitionResult withTaskDefinition(TaskDefinition taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * The metadata that is applied to the task definition to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata that is applied to the task definition to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *         length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that is applied to the task definition to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that is applied to the task definition to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
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
     * The metadata that is applied to the task definition to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that is applied to the task definition to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskDefinitionResult withTags(Tag... tags) {
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
     * The metadata that is applied to the task definition to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that is applied to the task definition to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     *        length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTaskDefinitionResult withTags(java.util.Collection<Tag> tags) {
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
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
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

        if (obj instanceof DescribeTaskDefinitionResult == false)
            return false;
        DescribeTaskDefinitionResult other = (DescribeTaskDefinitionResult) obj;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
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

        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTaskDefinitionResult clone() {
        try {
            return (DescribeTaskDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
