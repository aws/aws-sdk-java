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
 * Describes a policy adjustment type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/AdjustmentType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdjustmentType implements Serializable, Cloneable {

    /**
     * <p>
     * The policy adjustment type. The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     */
    private String adjustmentType;

    /**
     * <p>
     * The policy adjustment type. The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param adjustmentType
     *        The policy adjustment type. The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>
     *        , and <code>PercentChangeInCapacity</code>.
     */

    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * The policy adjustment type. The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @return The policy adjustment type. The valid values are <code>ChangeInCapacity</code>,
     *         <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     */

    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    /**
     * <p>
     * The policy adjustment type. The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * 
     * @param adjustmentType
     *        The policy adjustment type. The valid values are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>
     *        , and <code>PercentChangeInCapacity</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdjustmentType withAdjustmentType(String adjustmentType) {
        setAdjustmentType(adjustmentType);
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
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: ").append(getAdjustmentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdjustmentType == false)
            return false;
        AdjustmentType other = (AdjustmentType) obj;
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        return hashCode;
    }

    @Override
    public AdjustmentType clone() {
        try {
            return (AdjustmentType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
