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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Contains a paginated list of information about workflow executions.
 * </p>
 */
public class WorkflowExecutionInfos implements Serializable {

    /**
     * The list of workflow information structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo> executionInfos;

    /**
     * The token of the next page in the result. If set, the results have
     * more than one page. The next page can be retrieved by repeating the
     * request with this token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The list of workflow information structures.
     *
     * @return The list of workflow information structures.
     */
    public java.util.List<WorkflowExecutionInfo> getExecutionInfos() {
        if (executionInfos == null) {
              executionInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo>();
              executionInfos.setAutoConstruct(true);
        }
        return executionInfos;
    }
    
    /**
     * The list of workflow information structures.
     *
     * @param executionInfos The list of workflow information structures.
     */
    public void setExecutionInfos(java.util.Collection<WorkflowExecutionInfo> executionInfos) {
        if (executionInfos == null) {
            this.executionInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo> executionInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo>(executionInfos.size());
        executionInfosCopy.addAll(executionInfos);
        this.executionInfos = executionInfosCopy;
    }
    
    /**
     * The list of workflow information structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionInfos The list of workflow information structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfos withExecutionInfos(WorkflowExecutionInfo... executionInfos) {
        if (getExecutionInfos() == null) setExecutionInfos(new java.util.ArrayList<WorkflowExecutionInfo>(executionInfos.length));
        for (WorkflowExecutionInfo value : executionInfos) {
            getExecutionInfos().add(value);
        }
        return this;
    }
    
    /**
     * The list of workflow information structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionInfos The list of workflow information structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfos withExecutionInfos(java.util.Collection<WorkflowExecutionInfo> executionInfos) {
        if (executionInfos == null) {
            this.executionInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo> executionInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo>(executionInfos.size());
            executionInfosCopy.addAll(executionInfos);
            this.executionInfos = executionInfosCopy;
        }

        return this;
    }

    /**
     * The token of the next page in the result. If set, the results have
     * more than one page. The next page can be retrieved by repeating the
     * request with this token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return The token of the next page in the result. If set, the results have
     *         more than one page. The next page can be retrieved by repeating the
     *         request with this token and all other arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * The token of the next page in the result. If set, the results have
     * more than one page. The next page can be retrieved by repeating the
     * request with this token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken The token of the next page in the result. If set, the results have
     *         more than one page. The next page can be retrieved by repeating the
     *         request with this token and all other arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * The token of the next page in the result. If set, the results have
     * more than one page. The next page can be retrieved by repeating the
     * request with this token and all other arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken The token of the next page in the result. If set, the results have
     *         more than one page. The next page can be retrieved by repeating the
     *         request with this token and all other arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowExecutionInfos withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getExecutionInfos() != null) sb.append("ExecutionInfos: " + getExecutionInfos() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExecutionInfos() == null) ? 0 : getExecutionInfos().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionInfos == false) return false;
        WorkflowExecutionInfos other = (WorkflowExecutionInfos)obj;
        
        if (other.getExecutionInfos() == null ^ this.getExecutionInfos() == null) return false;
        if (other.getExecutionInfos() != null && other.getExecutionInfos().equals(this.getExecutionInfos()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }
    
}
    