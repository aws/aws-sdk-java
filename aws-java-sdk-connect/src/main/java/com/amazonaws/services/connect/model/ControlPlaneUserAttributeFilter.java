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
 * An object that can be used to specify Tag conditions or Hierarchy Group conditions inside the
 * <code>SearchFilter</code>.
 * </p>
 * <p>
 * This accepts an <code>OR</code> of <code>AND</code> (List of List) input where:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The top level list specifies conditions that need to be applied with <code>OR</code> operator
 * </p>
 * </li>
 * <li>
 * <p>
 * The inner list specifies conditions that need to be applied with <code>AND</code> operator.
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * Only one field can be populated. Maximum number of allowed Tag conditions is 25. Maximum number of allowed Hierarchy
 * Group conditions is 20.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ControlPlaneUserAttributeFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlPlaneUserAttributeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     */
    private java.util.List<AttributeAndCondition> orConditions;
    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     */
    private AttributeAndCondition andCondition;

    private TagCondition tagCondition;

    private HierarchyGroupCondition hierarchyGroupCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>OR</code> condition.
     */

    public java.util.List<AttributeAndCondition> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     */

    public void setOrConditions(java.util.Collection<AttributeAndCondition> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<AttributeAndCondition>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrConditions(java.util.Collection)} or {@link #withOrConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneUserAttributeFilter withOrConditions(AttributeAndCondition... orConditions) {
        if (this.orConditions == null) {
            setOrConditions(new java.util.ArrayList<AttributeAndCondition>(orConditions.length));
        }
        for (AttributeAndCondition ele : orConditions) {
            this.orConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>OR</code> condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an <code>OR</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneUserAttributeFilter withOrConditions(java.util.Collection<AttributeAndCondition> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andCondition
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public void setAndCondition(AttributeAndCondition andCondition) {
        this.andCondition = andCondition;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public AttributeAndCondition getAndCondition() {
        return this.andCondition;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andCondition
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneUserAttributeFilter withAndCondition(AttributeAndCondition andCondition) {
        setAndCondition(andCondition);
        return this;
    }

    /**
     * @param tagCondition
     */

    public void setTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    /**
     * @return
     */

    public TagCondition getTagCondition() {
        return this.tagCondition;
    }

    /**
     * @param tagCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlPlaneUserAttributeFilter withTagCondition(TagCondition tagCondition) {
        setTagCondition(tagCondition);
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

    public ControlPlaneUserAttributeFilter withHierarchyGroupCondition(HierarchyGroupCondition hierarchyGroupCondition) {
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
        if (getOrConditions() != null)
            sb.append("OrConditions: ").append(getOrConditions()).append(",");
        if (getAndCondition() != null)
            sb.append("AndCondition: ").append(getAndCondition()).append(",");
        if (getTagCondition() != null)
            sb.append("TagCondition: ").append(getTagCondition()).append(",");
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

        if (obj instanceof ControlPlaneUserAttributeFilter == false)
            return false;
        ControlPlaneUserAttributeFilter other = (ControlPlaneUserAttributeFilter) obj;
        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndCondition() == null ^ this.getAndCondition() == null)
            return false;
        if (other.getAndCondition() != null && other.getAndCondition().equals(this.getAndCondition()) == false)
            return false;
        if (other.getTagCondition() == null ^ this.getTagCondition() == null)
            return false;
        if (other.getTagCondition() != null && other.getTagCondition().equals(this.getTagCondition()) == false)
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

        hashCode = prime * hashCode + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode + ((getAndCondition() == null) ? 0 : getAndCondition().hashCode());
        hashCode = prime * hashCode + ((getTagCondition() == null) ? 0 : getTagCondition().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupCondition() == null) ? 0 : getHierarchyGroupCondition().hashCode());
        return hashCode;
    }

    @Override
    public ControlPlaneUserAttributeFilter clone() {
        try {
            return (ControlPlaneUserAttributeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ControlPlaneUserAttributeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
