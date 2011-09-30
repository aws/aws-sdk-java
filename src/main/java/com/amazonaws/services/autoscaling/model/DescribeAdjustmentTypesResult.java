/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The output of the DescribeAdjustmentTypes action.
 * </p>
 */
public class DescribeAdjustmentTypesResult {

    /**
     * A list of specific policy adjustment types.
     */
    private java.util.List<AdjustmentType> adjustmentTypes;

    /**
     * A list of specific policy adjustment types.
     *
     * @return A list of specific policy adjustment types.
     */
    public java.util.List<AdjustmentType> getAdjustmentTypes() {
        
        if (adjustmentTypes == null) {
            adjustmentTypes = new java.util.ArrayList<AdjustmentType>();
        }
        return adjustmentTypes;
    }
    
    /**
     * A list of specific policy adjustment types.
     *
     * @param adjustmentTypes A list of specific policy adjustment types.
     */
    public void setAdjustmentTypes(java.util.Collection<AdjustmentType> adjustmentTypes) {
        java.util.List<AdjustmentType> adjustmentTypesCopy = new java.util.ArrayList<AdjustmentType>();
        if (adjustmentTypes != null) {
            adjustmentTypesCopy.addAll(adjustmentTypes);
        }
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
        if (getAdjustmentTypes() == null) setAdjustmentTypes(new java.util.ArrayList<AdjustmentType>());
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
        java.util.List<AdjustmentType> adjustmentTypesCopy = new java.util.ArrayList<AdjustmentType>();
        if (adjustmentTypes != null) {
            adjustmentTypesCopy.addAll(adjustmentTypes);
        }
        this.adjustmentTypes = adjustmentTypesCopy;

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
        sb.append("AdjustmentTypes: " + adjustmentTypes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    