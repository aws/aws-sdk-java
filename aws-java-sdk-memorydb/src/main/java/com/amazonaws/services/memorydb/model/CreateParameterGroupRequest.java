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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/CreateParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The name of the parameter group family that the parameter group can be used with.
     * </p>
     */
    private String family;
    /**
     * <p>
     * An optional description of the parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @return The name of the parameter group.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of the parameter group.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParameterGroupRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the parameter group family that the parameter group can be used with.
     * </p>
     * 
     * @param family
     *        The name of the parameter group family that the parameter group can be used with.
     */

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * <p>
     * The name of the parameter group family that the parameter group can be used with.
     * </p>
     * 
     * @return The name of the parameter group family that the parameter group can be used with.
     */

    public String getFamily() {
        return this.family;
    }

    /**
     * <p>
     * The name of the parameter group family that the parameter group can be used with.
     * </p>
     * 
     * @param family
     *        The name of the parameter group family that the parameter group can be used with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParameterGroupRequest withFamily(String family) {
        setFamily(family);
        return this;
    }

    /**
     * <p>
     * An optional description of the parameter group.
     * </p>
     * 
     * @param description
     *        An optional description of the parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description of the parameter group.
     * </p>
     * 
     * @return An optional description of the parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description of the parameter group.
     * </p>
     * 
     * @param description
     *        An optional description of the parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParameterGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @return A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by
     *         a tag value, although null is accepted.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParameterGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getFamily() != null)
            sb.append("Family: ").append(getFamily()).append(",");
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

        if (obj instanceof CreateParameterGroupRequest == false)
            return false;
        CreateParameterGroupRequest other = (CreateParameterGroupRequest) obj;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getFamily() == null ^ this.getFamily() == null)
            return false;
        if (other.getFamily() != null && other.getFamily().equals(this.getFamily()) == false)
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
        hashCode = prime * hashCode + ((getFamily() == null) ? 0 : getFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateParameterGroupRequest clone() {
        return (CreateParameterGroupRequest) super.clone();
    }

}
