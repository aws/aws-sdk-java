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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines filters that the lifecycle policy uses to determine impacted resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyDetailFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyDetailFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter resources based on either <code>age</code> or <code>count</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The number of units for the time period or for the count. For example, a value of <code>6</code> might refer to
     * six months or six AMIs.
     * </p>
     * <note>
     * <p>
     * For count-based filters, this value represents the minimum number of resources to keep on hand. If you have fewer
     * resources than this number, the resource is excluded from lifecycle actions.
     * </p>
     * </note>
     */
    private Integer value;
    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required for
     * age-based rules.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * For age-based filters, this is the number of resources to keep on hand after the lifecycle <code>DELETE</code>
     * action is applied. Impacted resources are only deleted if you have more than this number of resources. If you
     * have fewer resources than this number, the impacted resource is not deleted.
     * </p>
     */
    private Integer retainAtLeast;

    /**
     * <p>
     * Filter resources based on either <code>age</code> or <code>count</code>.
     * </p>
     * 
     * @param type
     *        Filter resources based on either <code>age</code> or <code>count</code>.
     * @see LifecyclePolicyDetailFilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Filter resources based on either <code>age</code> or <code>count</code>.
     * </p>
     * 
     * @return Filter resources based on either <code>age</code> or <code>count</code>.
     * @see LifecyclePolicyDetailFilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Filter resources based on either <code>age</code> or <code>count</code>.
     * </p>
     * 
     * @param type
     *        Filter resources based on either <code>age</code> or <code>count</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyDetailFilterType
     */

    public LifecyclePolicyDetailFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Filter resources based on either <code>age</code> or <code>count</code>.
     * </p>
     * 
     * @param type
     *        Filter resources based on either <code>age</code> or <code>count</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyDetailFilterType
     */

    public LifecyclePolicyDetailFilter withType(LifecyclePolicyDetailFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The number of units for the time period or for the count. For example, a value of <code>6</code> might refer to
     * six months or six AMIs.
     * </p>
     * <note>
     * <p>
     * For count-based filters, this value represents the minimum number of resources to keep on hand. If you have fewer
     * resources than this number, the resource is excluded from lifecycle actions.
     * </p>
     * </note>
     * 
     * @param value
     *        The number of units for the time period or for the count. For example, a value of <code>6</code> might
     *        refer to six months or six AMIs.</p> <note>
     *        <p>
     *        For count-based filters, this value represents the minimum number of resources to keep on hand. If you
     *        have fewer resources than this number, the resource is excluded from lifecycle actions.
     *        </p>
     */

    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The number of units for the time period or for the count. For example, a value of <code>6</code> might refer to
     * six months or six AMIs.
     * </p>
     * <note>
     * <p>
     * For count-based filters, this value represents the minimum number of resources to keep on hand. If you have fewer
     * resources than this number, the resource is excluded from lifecycle actions.
     * </p>
     * </note>
     * 
     * @return The number of units for the time period or for the count. For example, a value of <code>6</code> might
     *         refer to six months or six AMIs.</p> <note>
     *         <p>
     *         For count-based filters, this value represents the minimum number of resources to keep on hand. If you
     *         have fewer resources than this number, the resource is excluded from lifecycle actions.
     *         </p>
     */

    public Integer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The number of units for the time period or for the count. For example, a value of <code>6</code> might refer to
     * six months or six AMIs.
     * </p>
     * <note>
     * <p>
     * For count-based filters, this value represents the minimum number of resources to keep on hand. If you have fewer
     * resources than this number, the resource is excluded from lifecycle actions.
     * </p>
     * </note>
     * 
     * @param value
     *        The number of units for the time period or for the count. For example, a value of <code>6</code> might
     *        refer to six months or six AMIs.</p> <note>
     *        <p>
     *        For count-based filters, this value represents the minimum number of resources to keep on hand. If you
     *        have fewer resources than this number, the resource is excluded from lifecycle actions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailFilter withValue(Integer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required for
     * age-based rules.
     * </p>
     * 
     * @param unit
     *        Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required
     *        for age-based rules.
     * @see LifecyclePolicyTimeUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required for
     * age-based rules.
     * </p>
     * 
     * @return Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required
     *         for age-based rules.
     * @see LifecyclePolicyTimeUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required for
     * age-based rules.
     * </p>
     * 
     * @param unit
     *        Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required
     *        for age-based rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyTimeUnit
     */

    public LifecyclePolicyDetailFilter withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required for
     * age-based rules.
     * </p>
     * 
     * @param unit
     *        Defines the unit of time that the lifecycle policy uses to determine impacted resources. This is required
     *        for age-based rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyTimeUnit
     */

    public LifecyclePolicyDetailFilter withUnit(LifecyclePolicyTimeUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * For age-based filters, this is the number of resources to keep on hand after the lifecycle <code>DELETE</code>
     * action is applied. Impacted resources are only deleted if you have more than this number of resources. If you
     * have fewer resources than this number, the impacted resource is not deleted.
     * </p>
     * 
     * @param retainAtLeast
     *        For age-based filters, this is the number of resources to keep on hand after the lifecycle
     *        <code>DELETE</code> action is applied. Impacted resources are only deleted if you have more than this
     *        number of resources. If you have fewer resources than this number, the impacted resource is not deleted.
     */

    public void setRetainAtLeast(Integer retainAtLeast) {
        this.retainAtLeast = retainAtLeast;
    }

    /**
     * <p>
     * For age-based filters, this is the number of resources to keep on hand after the lifecycle <code>DELETE</code>
     * action is applied. Impacted resources are only deleted if you have more than this number of resources. If you
     * have fewer resources than this number, the impacted resource is not deleted.
     * </p>
     * 
     * @return For age-based filters, this is the number of resources to keep on hand after the lifecycle
     *         <code>DELETE</code> action is applied. Impacted resources are only deleted if you have more than this
     *         number of resources. If you have fewer resources than this number, the impacted resource is not deleted.
     */

    public Integer getRetainAtLeast() {
        return this.retainAtLeast;
    }

    /**
     * <p>
     * For age-based filters, this is the number of resources to keep on hand after the lifecycle <code>DELETE</code>
     * action is applied. Impacted resources are only deleted if you have more than this number of resources. If you
     * have fewer resources than this number, the impacted resource is not deleted.
     * </p>
     * 
     * @param retainAtLeast
     *        For age-based filters, this is the number of resources to keep on hand after the lifecycle
     *        <code>DELETE</code> action is applied. Impacted resources are only deleted if you have more than this
     *        number of resources. If you have fewer resources than this number, the impacted resource is not deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailFilter withRetainAtLeast(Integer retainAtLeast) {
        setRetainAtLeast(retainAtLeast);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getRetainAtLeast() != null)
            sb.append("RetainAtLeast: ").append(getRetainAtLeast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyDetailFilter == false)
            return false;
        LifecyclePolicyDetailFilter other = (LifecyclePolicyDetailFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getRetainAtLeast() == null ^ this.getRetainAtLeast() == null)
            return false;
        if (other.getRetainAtLeast() != null && other.getRetainAtLeast().equals(this.getRetainAtLeast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getRetainAtLeast() == null) ? 0 : getRetainAtLeast().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyDetailFilter clone() {
        try {
            return (LifecyclePolicyDetailFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyDetailFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
