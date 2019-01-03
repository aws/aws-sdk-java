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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAdjustmentTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAdjustmentTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The policy adjustment types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdjustmentType> adjustmentTypes;

    /**
     * <p>
     * The policy adjustment types.
     * </p>
     * 
     * @return The policy adjustment types.
     */

    public java.util.List<AdjustmentType> getAdjustmentTypes() {
        if (adjustmentTypes == null) {
            adjustmentTypes = new com.amazonaws.internal.SdkInternalList<AdjustmentType>();
        }
        return adjustmentTypes;
    }

    /**
     * <p>
     * The policy adjustment types.
     * </p>
     * 
     * @param adjustmentTypes
     *        The policy adjustment types.
     */

    public void setAdjustmentTypes(java.util.Collection<AdjustmentType> adjustmentTypes) {
        if (adjustmentTypes == null) {
            this.adjustmentTypes = null;
            return;
        }

        this.adjustmentTypes = new com.amazonaws.internal.SdkInternalList<AdjustmentType>(adjustmentTypes);
    }

    /**
     * <p>
     * The policy adjustment types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdjustmentTypes(java.util.Collection)} or {@link #withAdjustmentTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param adjustmentTypes
     *        The policy adjustment types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAdjustmentTypesResult withAdjustmentTypes(AdjustmentType... adjustmentTypes) {
        if (this.adjustmentTypes == null) {
            setAdjustmentTypes(new com.amazonaws.internal.SdkInternalList<AdjustmentType>(adjustmentTypes.length));
        }
        for (AdjustmentType ele : adjustmentTypes) {
            this.adjustmentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policy adjustment types.
     * </p>
     * 
     * @param adjustmentTypes
     *        The policy adjustment types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAdjustmentTypesResult withAdjustmentTypes(java.util.Collection<AdjustmentType> adjustmentTypes) {
        setAdjustmentTypes(adjustmentTypes);
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
        if (getAdjustmentTypes() != null)
            sb.append("AdjustmentTypes: ").append(getAdjustmentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAdjustmentTypesResult == false)
            return false;
        DescribeAdjustmentTypesResult other = (DescribeAdjustmentTypesResult) obj;
        if (other.getAdjustmentTypes() == null ^ this.getAdjustmentTypes() == null)
            return false;
        if (other.getAdjustmentTypes() != null && other.getAdjustmentTypes().equals(this.getAdjustmentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdjustmentTypes() == null) ? 0 : getAdjustmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAdjustmentTypesResult clone() {
        try {
            return (DescribeAdjustmentTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
