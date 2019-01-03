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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the type of limit that you specified in the request and the current value for that
 * limit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ReusableDelegationSetLimit" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReusableDelegationSetLimit implements Serializable, Cloneable {

    /**
     * <p>
     * The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of hosted
     * zones that you can associate with the specified reusable delegation set.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     * </p>
     */
    private Long value;

    /**
     * <p>
     * The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of hosted
     * zones that you can associate with the specified reusable delegation set.
     * </p>
     * 
     * @param type
     *        The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of
     *        hosted zones that you can associate with the specified reusable delegation set.
     * @see ReusableDelegationSetLimitType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of hosted
     * zones that you can associate with the specified reusable delegation set.
     * </p>
     * 
     * @return The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of
     *         hosted zones that you can associate with the specified reusable delegation set.
     * @see ReusableDelegationSetLimitType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of hosted
     * zones that you can associate with the specified reusable delegation set.
     * </p>
     * 
     * @param type
     *        The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of
     *        hosted zones that you can associate with the specified reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReusableDelegationSetLimitType
     */

    public ReusableDelegationSetLimit withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of hosted
     * zones that you can associate with the specified reusable delegation set.
     * </p>
     * 
     * @param type
     *        The limit that you requested: <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code>, the maximum number of
     *        hosted zones that you can associate with the specified reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReusableDelegationSetLimitType
     */

    public ReusableDelegationSetLimit withType(ReusableDelegationSetLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     * </p>
     * 
     * @param value
     *        The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     * </p>
     * 
     * @return The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     * </p>
     * 
     * @param value
     *        The current value for the <code>MAX_ZONES_BY_REUSABLE_DELEGATION_SET</code> limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReusableDelegationSetLimit withValue(Long value) {
        setValue(value);
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
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReusableDelegationSetLimit == false)
            return false;
        ReusableDelegationSetLimit other = (ReusableDelegationSetLimit) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ReusableDelegationSetLimit clone() {
        try {
            return (ReusableDelegationSetLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
