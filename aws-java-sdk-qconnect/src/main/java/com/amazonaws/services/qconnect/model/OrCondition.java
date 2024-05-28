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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of conditions which would be applied together with an <code>OR</code> condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/OrCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     */
    private java.util.List<TagCondition> andConditions;
    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     */
    private TagCondition tagCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public java.util.List<TagCondition> getAndConditions() {
        return andConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     */

    public void setAndConditions(java.util.Collection<TagCondition> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<TagCondition>(andConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndConditions(java.util.Collection)} or {@link #withAndConditions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrCondition withAndConditions(TagCondition... andConditions) {
        if (this.andConditions == null) {
            setAndConditions(new java.util.ArrayList<TagCondition>(andConditions.length));
        }
        for (TagCondition ele : andConditions) {
            this.andConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an <code>AND</code> condition.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an <code>AND</code> condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrCondition withAndConditions(java.util.Collection<TagCondition> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * 
     * @param tagCondition
     *        A leaf node condition which can be used to specify a tag condition.
     */

    public void setTagCondition(TagCondition tagCondition) {
        this.tagCondition = tagCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * 
     * @return A leaf node condition which can be used to specify a tag condition.
     */

    public TagCondition getTagCondition() {
        return this.tagCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a tag condition.
     * </p>
     * 
     * @param tagCondition
     *        A leaf node condition which can be used to specify a tag condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrCondition withTagCondition(TagCondition tagCondition) {
        setTagCondition(tagCondition);
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
        if (getAndConditions() != null)
            sb.append("AndConditions: ").append(getAndConditions()).append(",");
        if (getTagCondition() != null)
            sb.append("TagCondition: ").append(getTagCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrCondition == false)
            return false;
        OrCondition other = (OrCondition) obj;
        if (other.getAndConditions() == null ^ this.getAndConditions() == null)
            return false;
        if (other.getAndConditions() != null && other.getAndConditions().equals(this.getAndConditions()) == false)
            return false;
        if (other.getTagCondition() == null ^ this.getTagCondition() == null)
            return false;
        if (other.getTagCondition() != null && other.getTagCondition().equals(this.getTagCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAndConditions() == null) ? 0 : getAndConditions().hashCode());
        hashCode = prime * hashCode + ((getTagCondition() == null) ? 0 : getTagCondition().hashCode());
        return hashCode;
    }

    @Override
    public OrCondition clone() {
        try {
            return (OrCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.OrConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
