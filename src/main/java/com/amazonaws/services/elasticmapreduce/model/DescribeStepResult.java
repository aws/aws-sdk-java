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
 * This output contains the description of the cluster step.
 * </p>
 */
public class DescribeStepResult implements Serializable {

    /**
     * The step details for the requested step identifier.
     */
    private Step step;

    /**
     * The step details for the requested step identifier.
     *
     * @return The step details for the requested step identifier.
     */
    public Step getStep() {
        return step;
    }
    
    /**
     * The step details for the requested step identifier.
     *
     * @param step The step details for the requested step identifier.
     */
    public void setStep(Step step) {
        this.step = step;
    }
    
    /**
     * The step details for the requested step identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param step The step details for the requested step identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStepResult withStep(Step step) {
        this.step = step;
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
        if (getStep() != null) sb.append("Step: " + getStep() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStep() == null) ? 0 : getStep().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStepResult == false) return false;
        DescribeStepResult other = (DescribeStepResult)obj;
        
        if (other.getStep() == null ^ this.getStep() == null) return false;
        if (other.getStep() != null && other.getStep().equals(this.getStep()) == false) return false; 
        return true;
    }
    
}
    