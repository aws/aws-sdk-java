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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a parameter group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterParameterGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The name of the cluster parameter group family that this cluster parameter group is compatible with.
     * </p>
     */
    private String parameterGroupFamily;
    /**
     * <p>
     * The description of the parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the cluster parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @return The name of the cluster parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the cluster parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroup withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster parameter group is compatible with.
     * </p>
     * 
     * @param parameterGroupFamily
     *        The name of the cluster parameter group family that this cluster parameter group is compatible with.
     */

    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster parameter group is compatible with.
     * </p>
     * 
     * @return The name of the cluster parameter group family that this cluster parameter group is compatible with.
     */

    public String getParameterGroupFamily() {
        return this.parameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cluster parameter group family that this cluster parameter group is compatible with.
     * </p>
     * 
     * @param parameterGroupFamily
     *        The name of the cluster parameter group family that this cluster parameter group is compatible with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroup withParameterGroupFamily(String parameterGroupFamily) {
        setParameterGroupFamily(parameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     * 
     * @param description
     *        The description of the parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     * 
     * @return The description of the parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the parameter group.
     * </p>
     * 
     * @param description
     *        The description of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     * 
     * @return The list of tags for the cluster parameter group.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the cluster parameter group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster parameter group.
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
     * The list of tags for the cluster parameter group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroup withTags(Tag... tags) {
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
     * The list of tags for the cluster parameter group.
     * </p>
     * 
     * @param tags
     *        The list of tags for the cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterParameterGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getParameterGroupFamily() != null)
            sb.append("ParameterGroupFamily: ").append(getParameterGroupFamily()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof ClusterParameterGroup == false)
            return false;
        ClusterParameterGroup other = (ClusterParameterGroup) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null)
            return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ClusterParameterGroup clone() {
        try {
            return (ClusterParameterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
