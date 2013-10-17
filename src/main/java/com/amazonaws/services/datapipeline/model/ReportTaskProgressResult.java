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
 * Contains the output from the ReportTaskProgress action.
 * </p>
 */
public class ReportTaskProgressResult implements Serializable {

    /**
     * If <code>True</code>, the calling task runner should cancel processing
     * of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     */
    private Boolean canceled;

    /**
     * If <code>True</code>, the calling task runner should cancel processing
     * of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     *
     * @return If <code>True</code>, the calling task runner should cancel processing
     *         of the task. The task runner does not need to call
     *         <a>SetTaskStatus</a> for canceled tasks.
     */
    public Boolean isCanceled() {
        return canceled;
    }
    
    /**
     * If <code>True</code>, the calling task runner should cancel processing
     * of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     *
     * @param canceled If <code>True</code>, the calling task runner should cancel processing
     *         of the task. The task runner does not need to call
     *         <a>SetTaskStatus</a> for canceled tasks.
     */
    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }
    
    /**
     * If <code>True</code>, the calling task runner should cancel processing
     * of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param canceled If <code>True</code>, the calling task runner should cancel processing
     *         of the task. The task runner does not need to call
     *         <a>SetTaskStatus</a> for canceled tasks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportTaskProgressResult withCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    /**
     * If <code>True</code>, the calling task runner should cancel processing
     * of the task. The task runner does not need to call
     * <a>SetTaskStatus</a> for canceled tasks.
     *
     * @return If <code>True</code>, the calling task runner should cancel processing
     *         of the task. The task runner does not need to call
     *         <a>SetTaskStatus</a> for canceled tasks.
     */
    public Boolean getCanceled() {
        return canceled;
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
        if (isCanceled() != null) sb.append("Canceled: " + isCanceled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isCanceled() == null) ? 0 : isCanceled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportTaskProgressResult == false) return false;
        ReportTaskProgressResult other = (ReportTaskProgressResult)obj;
        
        if (other.isCanceled() == null ^ this.isCanceled() == null) return false;
        if (other.isCanceled() != null && other.isCanceled().equals(this.isCanceled()) == false) return false; 
        return true;
    }
    
}
    