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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * This output contains the list of steps.
 * </p>
 */
public class ListStepsResult implements Serializable {

    /**
     * The filtered list of steps for the cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StepSummary> steps;

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String marker;

    /**
     * The filtered list of steps for the cluster.
     *
     * @return The filtered list of steps for the cluster.
     */
    public java.util.List<StepSummary> getSteps() {
        if (steps == null) {
              steps = new com.amazonaws.internal.ListWithAutoConstructFlag<StepSummary>();
              steps.setAutoConstruct(true);
        }
        return steps;
    }
    
    /**
     * The filtered list of steps for the cluster.
     *
     * @param steps The filtered list of steps for the cluster.
     */
    public void setSteps(java.util.Collection<StepSummary> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StepSummary> stepsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StepSummary>(steps.size());
        stepsCopy.addAll(steps);
        this.steps = stepsCopy;
    }
    
    /**
     * The filtered list of steps for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps The filtered list of steps for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsResult withSteps(StepSummary... steps) {
        if (getSteps() == null) setSteps(new java.util.ArrayList<StepSummary>(steps.length));
        for (StepSummary value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * The filtered list of steps for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps The filtered list of steps for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsResult withSteps(java.util.Collection<StepSummary> steps) {
        if (steps == null) {
            this.steps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StepSummary> stepsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StepSummary>(steps.size());
            stepsCopy.addAll(steps);
            this.steps = stepsCopy;
        }

        return this;
    }

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getSteps() != null) sb.append("Steps: " + getSteps() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStepsResult == false) return false;
        ListStepsResult other = (ListStepsResult)obj;
        
        if (other.getSteps() == null ^ this.getSteps() == null) return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    