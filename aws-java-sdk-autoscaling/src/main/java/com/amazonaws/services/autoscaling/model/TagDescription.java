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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a tag for an Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TagDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of resource. The only supported value is <code>auto-scaling-group</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tag key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The tag value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Determines whether the tag is added to new instances as they are launched in the group.
     * </p>
     */
    private Boolean propagateAtLaunch;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param resourceId
     *        The name of the group.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param resourceId
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagDescription withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource. The only supported value is <code>auto-scaling-group</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. The only supported value is <code>auto-scaling-group</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource. The only supported value is <code>auto-scaling-group</code>.
     * </p>
     * 
     * @return The type of resource. The only supported value is <code>auto-scaling-group</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource. The only supported value is <code>auto-scaling-group</code>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource. The only supported value is <code>auto-scaling-group</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagDescription withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * 
     * @param key
     *        The tag key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * 
     * @return The tag key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * 
     * @param key
     *        The tag key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagDescription withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * 
     * @param value
     *        The tag value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * 
     * @return The tag value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * 
     * @param value
     *        The tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagDescription withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Determines whether the tag is added to new instances as they are launched in the group.
     * </p>
     * 
     * @param propagateAtLaunch
     *        Determines whether the tag is added to new instances as they are launched in the group.
     */

    public void setPropagateAtLaunch(Boolean propagateAtLaunch) {
        this.propagateAtLaunch = propagateAtLaunch;
    }

    /**
     * <p>
     * Determines whether the tag is added to new instances as they are launched in the group.
     * </p>
     * 
     * @return Determines whether the tag is added to new instances as they are launched in the group.
     */

    public Boolean getPropagateAtLaunch() {
        return this.propagateAtLaunch;
    }

    /**
     * <p>
     * Determines whether the tag is added to new instances as they are launched in the group.
     * </p>
     * 
     * @param propagateAtLaunch
     *        Determines whether the tag is added to new instances as they are launched in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagDescription withPropagateAtLaunch(Boolean propagateAtLaunch) {
        setPropagateAtLaunch(propagateAtLaunch);
        return this;
    }

    /**
     * <p>
     * Determines whether the tag is added to new instances as they are launched in the group.
     * </p>
     * 
     * @return Determines whether the tag is added to new instances as they are launched in the group.
     */

    public Boolean isPropagateAtLaunch() {
        return this.propagateAtLaunch;
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getPropagateAtLaunch() != null)
            sb.append("PropagateAtLaunch: ").append(getPropagateAtLaunch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagDescription == false)
            return false;
        TagDescription other = (TagDescription) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPropagateAtLaunch() == null ^ this.getPropagateAtLaunch() == null)
            return false;
        if (other.getPropagateAtLaunch() != null && other.getPropagateAtLaunch().equals(this.getPropagateAtLaunch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getPropagateAtLaunch() == null) ? 0 : getPropagateAtLaunch().hashCode());
        return hashCode;
    }

    @Override
    public TagDescription clone() {
        try {
            return (TagDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
