/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of conditions which would be applied together with an <code>AND</code> condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AttributeAndCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeAndCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     */
    private java.util.List<TagCondition> tagConditions;

    private HierarchyGroupCondition hierarchyGroupCondition;

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * 
     * @return A leaf node condition which can be used to specify a tag condition.
     */

    public java.util.List<TagCondition> getTagConditions() {
        return tagConditions;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * 
     * @param tagConditions
     *        A leaf node condition which can be used to specify a tag condition.
     */

    public void setTagConditions(java.util.Collection<TagCondition> tagConditions) {
        if (tagConditions == null) {
            this.tagConditions = null;
            return;
        }

        this.tagConditions = new java.util.ArrayList<TagCondition>(tagConditions);
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagConditions(java.util.Collection)} or {@link #withTagConditions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tagConditions
     *        A leaf node condition which can be used to specify a tag condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeAndCondition withTagConditions(TagCondition... tagConditions) {
        if (this.tagConditions == null) {
            setTagConditions(new java.util.ArrayList<TagCondition>(tagConditions.length));
        }
        for (TagCondition ele : tagConditions) {
            this.tagConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * 
     * @param tagConditions
     *        A leaf node condition which can be used to specify a tag condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeAndCondition withTagConditions(java.util.Collection<TagCondition> tagConditions) {
        setTagConditions(tagConditions);
        return this;
    }

    /**
     * @param hierarchyGroupCondition
     */

    public void setHierarchyGroupCondition(HierarchyGroupCondition hierarchyGroupCondition) {
        this.hierarchyGroupCondition = hierarchyGroupCondition;
    }

    /**
     * @return
     */

    public HierarchyGroupCondition getHierarchyGroupCondition() {
        return this.hierarchyGroupCondition;
    }

    /**
     * @param hierarchyGroupCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeAndCondition withHierarchyGroupCondition(HierarchyGroupCondition hierarchyGroupCondition) {
        setHierarchyGroupCondition(hierarchyGroupCondition);
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
        if (getTagConditions() != null)
            sb.append("TagConditions: ").append(getTagConditions()).append(",");
        if (getHierarchyGroupCondition() != null)
            sb.append("HierarchyGroupCondition: ").append(getHierarchyGroupCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeAndCondition == false)
            return false;
        AttributeAndCondition other = (AttributeAndCondition) obj;
        if (other.getTagConditions() == null ^ this.getTagConditions() == null)
            return false;
        if (other.getTagConditions() != null && other.getTagConditions().equals(this.getTagConditions()) == false)
            return false;
        if (other.getHierarchyGroupCondition() == null ^ this.getHierarchyGroupCondition() == null)
            return false;
        if (other.getHierarchyGroupCondition() != null && other.getHierarchyGroupCondition().equals(this.getHierarchyGroupCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagConditions() == null) ? 0 : getTagConditions().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupCondition() == null) ? 0 : getHierarchyGroupCondition().hashCode());
        return hashCode;
    }

    @Override
    public AttributeAndCondition clone() {
        try {
            return (AttributeAndCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AttributeAndConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
