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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/FilterCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     * </p>
     */
    private String equalsValue;
    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     */
    private Long greaterThan;
    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     */
    private Long lessThan;

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @param equalsValue
     *        Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     */

    public void setEqualsValue(String equalsValue) {
        this.equalsValue = equalsValue;
    }

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @return Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     */

    public String getEqualsValue() {
        return this.equalsValue;
    }

    /**
     * <p>
     * Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @param equalsValue
     *        Represents an <i>equal</i> <b/> condition to be applied to a single field when querying for scan entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withEqualsValue(String equalsValue) {
        setEqualsValue(equalsValue);
        return this;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @param greaterThan
     *        Represents a <i>greater than</i> condition to be applied to a single field when querying for scan entries.
     */

    public void setGreaterThan(Long greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @return Represents a <i>greater than</i> condition to be applied to a single field when querying for scan
     *         entries.
     */

    public Long getGreaterThan() {
        return this.greaterThan;
    }

    /**
     * <p>
     * Represents a <i>greater than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @param greaterThan
     *        Represents a <i>greater than</i> condition to be applied to a single field when querying for scan entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withGreaterThan(Long greaterThan) {
        setGreaterThan(greaterThan);
        return this;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @param lessThan
     *        Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     */

    public void setLessThan(Long lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @return Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     */

    public Long getLessThan() {
        return this.lessThan;
    }

    /**
     * <p>
     * Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     * </p>
     * 
     * @param lessThan
     *        Represents a <i>less than</i> condition to be applied to a single field when querying for scan entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withLessThan(Long lessThan) {
        setLessThan(lessThan);
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
        if (getEqualsValue() != null)
            sb.append("EqualsValue: ").append(getEqualsValue()).append(",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: ").append(getGreaterThan()).append(",");
        if (getLessThan() != null)
            sb.append("LessThan: ").append(getLessThan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCondition == false)
            return false;
        FilterCondition other = (FilterCondition) obj;
        if (other.getEqualsValue() == null ^ this.getEqualsValue() == null)
            return false;
        if (other.getEqualsValue() != null && other.getEqualsValue().equals(this.getEqualsValue()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEqualsValue() == null) ? 0 : getEqualsValue().hashCode());
        hashCode = prime * hashCode + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        return hashCode;
    }

    @Override
    public FilterCondition clone() {
        try {
            return (FilterCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.FilterConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
