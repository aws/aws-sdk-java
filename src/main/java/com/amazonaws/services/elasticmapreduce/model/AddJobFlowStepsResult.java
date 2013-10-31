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
 * The output for the AddJobFlowSteps operation.
 * </p>
 */
public class AddJobFlowStepsResult implements Serializable {

    /**
     * The identifiers of the list of steps added to the job flow.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> stepIds;

    /**
     * The identifiers of the list of steps added to the job flow.
     *
     * @return The identifiers of the list of steps added to the job flow.
     */
    public java.util.List<String> getStepIds() {
        if (stepIds == null) {
              stepIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              stepIds.setAutoConstruct(true);
        }
        return stepIds;
    }
    
    /**
     * The identifiers of the list of steps added to the job flow.
     *
     * @param stepIds The identifiers of the list of steps added to the job flow.
     */
    public void setStepIds(java.util.Collection<String> stepIds) {
        if (stepIds == null) {
            this.stepIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> stepIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stepIds.size());
        stepIdsCopy.addAll(stepIds);
        this.stepIds = stepIdsCopy;
    }
    
    /**
     * The identifiers of the list of steps added to the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepIds The identifiers of the list of steps added to the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddJobFlowStepsResult withStepIds(String... stepIds) {
        if (getStepIds() == null) setStepIds(new java.util.ArrayList<String>(stepIds.length));
        for (String value : stepIds) {
            getStepIds().add(value);
        }
        return this;
    }
    
    /**
     * The identifiers of the list of steps added to the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepIds The identifiers of the list of steps added to the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddJobFlowStepsResult withStepIds(java.util.Collection<String> stepIds) {
        if (stepIds == null) {
            this.stepIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> stepIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stepIds.size());
            stepIdsCopy.addAll(stepIds);
            this.stepIds = stepIdsCopy;
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
        if (getStepIds() != null) sb.append("StepIds: " + getStepIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStepIds() == null) ? 0 : getStepIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddJobFlowStepsResult == false) return false;
        AddJobFlowStepsResult other = (AddJobFlowStepsResult)obj;
        
        if (other.getStepIds() == null ^ this.getStepIds() == null) return false;
        if (other.getStepIds() != null && other.getStepIds().equals(this.getStepIds()) == false) return false; 
        return true;
    }
    
}
    