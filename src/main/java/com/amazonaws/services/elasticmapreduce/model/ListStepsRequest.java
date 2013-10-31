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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listSteps(ListStepsRequest) ListSteps operation}.
 * <p>
 * Provides a list of steps for the cluster.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#listSteps(ListStepsRequest)
 */
public class ListStepsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster for which to list the steps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clusterId;

    /**
     * The filter to limit the step list based on certain states.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> stepStates;

    /**
     * The pagination token that indicates the next set of results to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String marker;

    /**
     * The identifier of the cluster for which to list the steps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The identifier of the cluster for which to list the steps.
     */
    public String getClusterId() {
        return clusterId;
    }
    
    /**
     * The identifier of the cluster for which to list the steps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clusterId The identifier of the cluster for which to list the steps.
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }
    
    /**
     * The identifier of the cluster for which to list the steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clusterId The identifier of the cluster for which to list the steps.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * The filter to limit the step list based on certain states.
     *
     * @return The filter to limit the step list based on certain states.
     */
    public java.util.List<String> getStepStates() {
        if (stepStates == null) {
              stepStates = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              stepStates.setAutoConstruct(true);
        }
        return stepStates;
    }
    
    /**
     * The filter to limit the step list based on certain states.
     *
     * @param stepStates The filter to limit the step list based on certain states.
     */
    public void setStepStates(java.util.Collection<String> stepStates) {
        if (stepStates == null) {
            this.stepStates = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> stepStatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stepStates.size());
        stepStatesCopy.addAll(stepStates);
        this.stepStates = stepStatesCopy;
    }
    
    /**
     * The filter to limit the step list based on certain states.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepStates The filter to limit the step list based on certain states.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsRequest withStepStates(String... stepStates) {
        if (getStepStates() == null) setStepStates(new java.util.ArrayList<String>(stepStates.length));
        for (String value : stepStates) {
            getStepStates().add(value);
        }
        return this;
    }
    
    /**
     * The filter to limit the step list based on certain states.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepStates The filter to limit the step list based on certain states.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsRequest withStepStates(java.util.Collection<String> stepStates) {
        if (stepStates == null) {
            this.stepStates = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> stepStatesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stepStates.size());
            stepStatesCopy.addAll(stepStates);
            this.stepStates = stepStatesCopy;
        }

        return this;
    }

    /**
     * The filter to limit the step list based on certain states.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepStates The filter to limit the step list based on certain states.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStepsRequest withStepStates(StepState... stepStates) {
        java.util.ArrayList<String> stepStatesCopy = new java.util.ArrayList<String>(stepStates.length);
        for (StepState member : stepStates) {
            stepStatesCopy.add(member.toString());
        }
        if (getStepStates() == null) {
            setStepStates(stepStatesCopy);
        } else {
            getStepStates().addAll(stepStatesCopy);
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
    public ListStepsRequest withMarker(String marker) {
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
        if (getClusterId() != null) sb.append("ClusterId: " + getClusterId() + ",");
        if (getStepStates() != null) sb.append("StepStates: " + getStepStates() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getStepStates() == null) ? 0 : getStepStates().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStepsRequest == false) return false;
        ListStepsRequest other = (ListStepsRequest)obj;
        
        if (other.getClusterId() == null ^ this.getClusterId() == null) return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false) return false; 
        if (other.getStepStates() == null ^ this.getStepStates() == null) return false;
        if (other.getStepStates() != null && other.getStepStates().equals(this.getStepStates()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    