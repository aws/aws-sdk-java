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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Schedule" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the schedule.
     * </p>
     */
    private String name;

    private Boolean copyTags;
    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle
     * tags.
     * </p>
     */
    private java.util.List<Tag> tagsToAdd;
    /**
     * <p>
     * The create rule.
     * </p>
     */
    private CreateRule createRule;
    /**
     * <p>
     * The retain rule.
     * </p>
     */
    private RetainRule retainRule;

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @return The name of the schedule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param copyTags
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * @return
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * @param copyTags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle
     * tags.
     * </p>
     * 
     * @return The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added
     *         lifecycle tags.
     */

    public java.util.List<Tag> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle
     * tags.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added
     *        lifecycle tags.
     */

    public void setTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new java.util.ArrayList<Tag>(tagsToAdd);
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle
     * tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToAdd(java.util.Collection)} or {@link #withTagsToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added
     *        lifecycle tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withTagsToAdd(Tag... tagsToAdd) {
        if (this.tagsToAdd == null) {
            setTagsToAdd(new java.util.ArrayList<Tag>(tagsToAdd.length));
        }
        for (Tag ele : tagsToAdd) {
            this.tagsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle
     * tags.
     * </p>
     * 
     * @param tagsToAdd
     *        The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added
     *        lifecycle tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
        return this;
    }

    /**
     * <p>
     * The create rule.
     * </p>
     * 
     * @param createRule
     *        The create rule.
     */

    public void setCreateRule(CreateRule createRule) {
        this.createRule = createRule;
    }

    /**
     * <p>
     * The create rule.
     * </p>
     * 
     * @return The create rule.
     */

    public CreateRule getCreateRule() {
        return this.createRule;
    }

    /**
     * <p>
     * The create rule.
     * </p>
     * 
     * @param createRule
     *        The create rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withCreateRule(CreateRule createRule) {
        setCreateRule(createRule);
        return this;
    }

    /**
     * <p>
     * The retain rule.
     * </p>
     * 
     * @param retainRule
     *        The retain rule.
     */

    public void setRetainRule(RetainRule retainRule) {
        this.retainRule = retainRule;
    }

    /**
     * <p>
     * The retain rule.
     * </p>
     * 
     * @return The retain rule.
     */

    public RetainRule getRetainRule() {
        return this.retainRule;
    }

    /**
     * <p>
     * The retain rule.
     * </p>
     * 
     * @param retainRule
     *        The retain rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withRetainRule(RetainRule retainRule) {
        setRetainRule(retainRule);
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
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: ").append(getTagsToAdd()).append(",");
        if (getCreateRule() != null)
            sb.append("CreateRule: ").append(getCreateRule()).append(",");
        if (getRetainRule() != null)
            sb.append("RetainRule: ").append(getRetainRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        if (other.getCreateRule() == null ^ this.getCreateRule() == null)
            return false;
        if (other.getCreateRule() != null && other.getCreateRule().equals(this.getCreateRule()) == false)
            return false;
        if (other.getRetainRule() == null ^ this.getRetainRule() == null)
            return false;
        if (other.getRetainRule() != null && other.getRetainRule().equals(this.getRetainRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        hashCode = prime * hashCode + ((getCreateRule() == null) ? 0 : getCreateRule().hashCode());
        hashCode = prime * hashCode + ((getRetainRule() == null) ? 0 : getRetainRule().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
