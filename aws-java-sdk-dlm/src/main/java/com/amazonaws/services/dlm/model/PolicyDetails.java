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
 * Specifies the configuration of a lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/PolicyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     */
    private java.util.List<Tag> targetTags;
    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     */
    private java.util.List<Schedule> schedules;

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see ResourceTypeValues
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @see ResourceTypeValues
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeValues
     */

    public PolicyDetails withResourceTypes(ResourceTypeValues... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceTypeValues value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @return The single tag that identifies targeted resources for this policy.
     */

    public java.util.List<Tag> getTargetTags() {
        return targetTags;
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @param targetTags
     *        The single tag that identifies targeted resources for this policy.
     */

    public void setTargetTags(java.util.Collection<Tag> targetTags) {
        if (targetTags == null) {
            this.targetTags = null;
            return;
        }

        this.targetTags = new java.util.ArrayList<Tag>(targetTags);
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetTags(java.util.Collection)} or {@link #withTargetTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetTags
     *        The single tag that identifies targeted resources for this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withTargetTags(Tag... targetTags) {
        if (this.targetTags == null) {
            setTargetTags(new java.util.ArrayList<Tag>(targetTags.length));
        }
        for (Tag ele : targetTags) {
            this.targetTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The single tag that identifies targeted resources for this policy.
     * </p>
     * 
     * @param targetTags
     *        The single tag that identifies targeted resources for this policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withTargetTags(java.util.Collection<Tag> targetTags) {
        setTargetTags(targetTags);
        return this;
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     * 
     * @return The schedule of policy-defined actions.
     */

    public java.util.List<Schedule> getSchedules() {
        return schedules;
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     * 
     * @param schedules
     *        The schedule of policy-defined actions.
     */

    public void setSchedules(java.util.Collection<Schedule> schedules) {
        if (schedules == null) {
            this.schedules = null;
            return;
        }

        this.schedules = new java.util.ArrayList<Schedule>(schedules);
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchedules(java.util.Collection)} or {@link #withSchedules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schedules
     *        The schedule of policy-defined actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withSchedules(Schedule... schedules) {
        if (this.schedules == null) {
            setSchedules(new java.util.ArrayList<Schedule>(schedules.length));
        }
        for (Schedule ele : schedules) {
            this.schedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schedule of policy-defined actions.
     * </p>
     * 
     * @param schedules
     *        The schedule of policy-defined actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyDetails withSchedules(java.util.Collection<Schedule> schedules) {
        setSchedules(schedules);
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
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getTargetTags() != null)
            sb.append("TargetTags: ").append(getTargetTags()).append(",");
        if (getSchedules() != null)
            sb.append("Schedules: ").append(getSchedules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyDetails == false)
            return false;
        PolicyDetails other = (PolicyDetails) obj;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getTargetTags() == null ^ this.getTargetTags() == null)
            return false;
        if (other.getTargetTags() != null && other.getTargetTags().equals(this.getTargetTags()) == false)
            return false;
        if (other.getSchedules() == null ^ this.getSchedules() == null)
            return false;
        if (other.getSchedules() != null && other.getSchedules().equals(this.getSchedules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getTargetTags() == null) ? 0 : getTargetTags().hashCode());
        hashCode = prime * hashCode + ((getSchedules() == null) ? 0 : getSchedules().hashCode());
        return hashCode;
    }

    @Override
    public PolicyDetails clone() {
        try {
            return (PolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.PolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
