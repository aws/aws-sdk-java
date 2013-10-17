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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the output from the ReportTaskRunnerHeartbeat action.
 * </p>
 */
public class ReportTaskRunnerHeartbeatResult implements Serializable {

    /**
     * Indicates whether the calling task runner should terminate. If
     * <code>True</code>, the task runner that called
     * <a>ReportTaskRunnerHeartbeat</a> should terminate.
     */
    private Boolean terminate;

    /**
     * Indicates whether the calling task runner should terminate. If
     * <code>True</code>, the task runner that called
     * <a>ReportTaskRunnerHeartbeat</a> should terminate.
     *
     * @return Indicates whether the calling task runner should terminate. If
     *         <code>True</code>, the task runner that called
     *         <a>ReportTaskRunnerHeartbeat</a> should terminate.
     */
    public Boolean isTerminate() {
        return terminate;
    }
    
    /**
     * Indicates whether the calling task runner should terminate. If
     * <code>True</code>, the task runner that called
     * <a>ReportTaskRunnerHeartbeat</a> should terminate.
     *
     * @param terminate Indicates whether the calling task runner should terminate. If
     *         <code>True</code>, the task runner that called
     *         <a>ReportTaskRunnerHeartbeat</a> should terminate.
     */
    public void setTerminate(Boolean terminate) {
        this.terminate = terminate;
    }
    
    /**
     * Indicates whether the calling task runner should terminate. If
     * <code>True</code>, the task runner that called
     * <a>ReportTaskRunnerHeartbeat</a> should terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminate Indicates whether the calling task runner should terminate. If
     *         <code>True</code>, the task runner that called
     *         <a>ReportTaskRunnerHeartbeat</a> should terminate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportTaskRunnerHeartbeatResult withTerminate(Boolean terminate) {
        this.terminate = terminate;
        return this;
    }

    /**
     * Indicates whether the calling task runner should terminate. If
     * <code>True</code>, the task runner that called
     * <a>ReportTaskRunnerHeartbeat</a> should terminate.
     *
     * @return Indicates whether the calling task runner should terminate. If
     *         <code>True</code>, the task runner that called
     *         <a>ReportTaskRunnerHeartbeat</a> should terminate.
     */
    public Boolean getTerminate() {
        return terminate;
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
        if (isTerminate() != null) sb.append("Terminate: " + isTerminate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isTerminate() == null) ? 0 : isTerminate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportTaskRunnerHeartbeatResult == false) return false;
        ReportTaskRunnerHeartbeatResult other = (ReportTaskRunnerHeartbeatResult)obj;
        
        if (other.isTerminate() == null ^ this.isTerminate() == null) return false;
        if (other.isTerminate() != null && other.isTerminate().equals(this.isTerminate()) == false) return false; 
        return true;
    }
    
}
    