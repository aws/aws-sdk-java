/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * The output of the DescribeAdjustmentTypes action.
 * </p>
 */
public class DescribeAdjustmentTypesResult implements Serializable {

    /**
     * A list of specific policy adjustment types.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AdjustmentType> adjustmentTypes;

    /**
     * A list of specific policy adjustment types.
     *
     * @return A list of specific policy adjustment types.
     */
    public java.util.List<AdjustmentType> getAdjustmentTypes() {
        if (adjustmentTypes == null) {
              adjustmentTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<AdjustmentType>();
              adjustmentTypes.setAutoConstruct(true);
        }
        return adjustmentTypes;
    }
    
    /**
     * A list of specific policy adjustment types.
     *
     * @param adjustmentTypes A list of specific policy adjustment types.
     */
    public void setAdjustmentTypes(java.util.Collection<AdjustmentType> adjustmentTypes) {
        if (adjustmentTypes == null) {
            this.adjustmentTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AdjustmentType> adjustmentTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AdjustmentType>(adjustmentTypes.size());
        adjustmentTypesCopy.addAll(adjustmentTypes);
        this.adjustmentTypes = adjustmentTypesCopy;
    }
    
    /**
     * A list of specific policy adjustment types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param adjustmentTypes A list of specific policy adjustment types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAdjustmentTypesResult withAdjustmentTypes(AdjustmentType... adjustmentTypes) {
        if (getAdjustmentTypes() == null) setAdjustmentTypes(new java.util.ArrayList<AdjustmentType>(adjustmentTypes.length));
        for (AdjustmentType value : adjustmentTypes) {
            getAdjustmentTypes().add(value);
        }
        return this;
    }
    
    /**
     * A list of specific policy adjustment types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param adjustmentTypes A list of specific policy adjustment types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAdjustmentTypesResult withAdjustmentTypes(java.util.Collection<AdjustmentType> adjustmentTypes) {
        if (adjustmentTypes == null) {
            this.adjustmentTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AdjustmentType> adjustmentTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AdjustmentType>(adjustmentTypes.size());
            adjustmentTypesCopy.addAll(adjustmentTypes);
            this.adjustmentTypes = adjustmentTypesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAdjustmentTypes() != null) sb.append("AdjustmentTypes: " + getAdjustmentTypes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAdjustmentTypes() == null) ? 0 : getAdjustmentTypes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAdjustmentTypesResult == false) return false;
        DescribeAdjustmentTypesResult other = (DescribeAdjustmentTypesResult)obj;
        
        if (other.getAdjustmentTypes() == null ^ this.getAdjustmentTypes() == null) return false;
        if (other.getAdjustmentTypes() != null && other.getAdjustmentTypes().equals(this.getAdjustmentTypes()) == false) return false; 
        return true;
    }
    
}
    