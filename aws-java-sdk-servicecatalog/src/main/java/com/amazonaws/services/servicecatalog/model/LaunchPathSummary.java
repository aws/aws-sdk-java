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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a product path for a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/LaunchPathSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchPathSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     */
    private java.util.List<ConstraintSummary> constraintSummaries;
    /**
     * <p>
     * The tags associated with this product path.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * 
     * @param id
     *        The identifier of the product path.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * 
     * @return The identifier of the product path.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * 
     * @param id
     *        The identifier of the product path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPathSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     * 
     * @return The constraints on the portfolio-product relationship.
     */

    public java.util.List<ConstraintSummary> getConstraintSummaries() {
        return constraintSummaries;
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     * 
     * @param constraintSummaries
     *        The constraints on the portfolio-product relationship.
     */

    public void setConstraintSummaries(java.util.Collection<ConstraintSummary> constraintSummaries) {
        if (constraintSummaries == null) {
            this.constraintSummaries = null;
            return;
        }

        this.constraintSummaries = new java.util.ArrayList<ConstraintSummary>(constraintSummaries);
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConstraintSummaries(java.util.Collection)} or {@link #withConstraintSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param constraintSummaries
     *        The constraints on the portfolio-product relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPathSummary withConstraintSummaries(ConstraintSummary... constraintSummaries) {
        if (this.constraintSummaries == null) {
            setConstraintSummaries(new java.util.ArrayList<ConstraintSummary>(constraintSummaries.length));
        }
        for (ConstraintSummary ele : constraintSummaries) {
            this.constraintSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     * 
     * @param constraintSummaries
     *        The constraints on the portfolio-product relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPathSummary withConstraintSummaries(java.util.Collection<ConstraintSummary> constraintSummaries) {
        setConstraintSummaries(constraintSummaries);
        return this;
    }

    /**
     * <p>
     * The tags associated with this product path.
     * </p>
     * 
     * @return The tags associated with this product path.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with this product path.
     * </p>
     * 
     * @param tags
     *        The tags associated with this product path.
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
     * The tags associated with this product path.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with this product path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPathSummary withTags(Tag... tags) {
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
     * The tags associated with this product path.
     * </p>
     * 
     * @param tags
     *        The tags associated with this product path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPathSummary withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     * 
     * @param name
     *        The name of the portfolio to which the user was assigned.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     * 
     * @return The name of the portfolio to which the user was assigned.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     * 
     * @param name
     *        The name of the portfolio to which the user was assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPathSummary withName(String name) {
        setName(name);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getConstraintSummaries() != null)
            sb.append("ConstraintSummaries: ").append(getConstraintSummaries()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPathSummary == false)
            return false;
        LaunchPathSummary other = (LaunchPathSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConstraintSummaries() == null ^ this.getConstraintSummaries() == null)
            return false;
        if (other.getConstraintSummaries() != null && other.getConstraintSummaries().equals(this.getConstraintSummaries()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getConstraintSummaries() == null) ? 0 : getConstraintSummaries().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public LaunchPathSummary clone() {
        try {
            return (LaunchPathSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.LaunchPathSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
