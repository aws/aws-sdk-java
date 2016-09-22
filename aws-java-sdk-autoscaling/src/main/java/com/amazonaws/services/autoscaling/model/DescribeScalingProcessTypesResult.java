/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the output of DescribeScalingProcessTypes.
 * </p>
 */
public class DescribeScalingProcessTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the process types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessType> processes;

    /**
     * <p>
     * The names of the process types.
     * </p>
     * 
     * @return The names of the process types.
     */

    public java.util.List<ProcessType> getProcesses() {
        if (processes == null) {
            processes = new com.amazonaws.internal.SdkInternalList<ProcessType>();
        }
        return processes;
    }

    /**
     * <p>
     * The names of the process types.
     * </p>
     * 
     * @param processes
     *        The names of the process types.
     */

    public void setProcesses(java.util.Collection<ProcessType> processes) {
        if (processes == null) {
            this.processes = null;
            return;
        }

        this.processes = new com.amazonaws.internal.SdkInternalList<ProcessType>(processes);
    }

    /**
     * <p>
     * The names of the process types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcesses(java.util.Collection)} or {@link #withProcesses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param processes
     *        The names of the process types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingProcessTypesResult withProcesses(ProcessType... processes) {
        if (this.processes == null) {
            setProcesses(new com.amazonaws.internal.SdkInternalList<ProcessType>(processes.length));
        }
        for (ProcessType ele : processes) {
            this.processes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the process types.
     * </p>
     * 
     * @param processes
     *        The names of the process types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingProcessTypesResult withProcesses(java.util.Collection<ProcessType> processes) {
        setProcesses(processes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProcesses() != null)
            sb.append("Processes: " + getProcesses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalingProcessTypesResult == false)
            return false;
        DescribeScalingProcessTypesResult other = (DescribeScalingProcessTypesResult) obj;
        if (other.getProcesses() == null ^ this.getProcesses() == null)
            return false;
        if (other.getProcesses() != null && other.getProcesses().equals(this.getProcesses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcesses() == null) ? 0 : getProcesses().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingProcessTypesResult clone() {
        try {
            return (DescribeScalingProcessTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
