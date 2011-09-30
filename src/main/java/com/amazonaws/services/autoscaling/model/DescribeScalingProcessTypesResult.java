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
 * The output of the DescribeScalingProcessTypes action.
 * </p>
 */
public class DescribeScalingProcessTypesResult {

    /**
     * A list of <a>ProcessType</a> names.
     */
    private java.util.List<ProcessType> processes;

    /**
     * A list of <a>ProcessType</a> names.
     *
     * @return A list of <a>ProcessType</a> names.
     */
    public java.util.List<ProcessType> getProcesses() {
        
        if (processes == null) {
            processes = new java.util.ArrayList<ProcessType>();
        }
        return processes;
    }
    
    /**
     * A list of <a>ProcessType</a> names.
     *
     * @param processes A list of <a>ProcessType</a> names.
     */
    public void setProcesses(java.util.Collection<ProcessType> processes) {
        java.util.List<ProcessType> processesCopy = new java.util.ArrayList<ProcessType>();
        if (processes != null) {
            processesCopy.addAll(processes);
        }
        this.processes = processesCopy;
    }
    
    /**
     * A list of <a>ProcessType</a> names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param processes A list of <a>ProcessType</a> names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingProcessTypesResult withProcesses(ProcessType... processes) {
        if (getProcesses() == null) setProcesses(new java.util.ArrayList<ProcessType>());
        for (ProcessType value : processes) {
            getProcesses().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ProcessType</a> names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param processes A list of <a>ProcessType</a> names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeScalingProcessTypesResult withProcesses(java.util.Collection<ProcessType> processes) {
        java.util.List<ProcessType> processesCopy = new java.util.ArrayList<ProcessType>();
        if (processes != null) {
            processesCopy.addAll(processes);
        }
        this.processes = processesCopy;

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
        sb.append("Processes: " + processes + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    