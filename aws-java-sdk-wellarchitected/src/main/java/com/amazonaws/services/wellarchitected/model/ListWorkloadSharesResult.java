/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Input for List Workload Share
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloadShares" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkloadSharesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String workloadId;

    private java.util.List<WorkloadShareSummary> workloadShareSummaries;

    private String nextToken;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadSharesResult withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<WorkloadShareSummary> getWorkloadShareSummaries() {
        return workloadShareSummaries;
    }

    /**
     * @param workloadShareSummaries
     */

    public void setWorkloadShareSummaries(java.util.Collection<WorkloadShareSummary> workloadShareSummaries) {
        if (workloadShareSummaries == null) {
            this.workloadShareSummaries = null;
            return;
        }

        this.workloadShareSummaries = new java.util.ArrayList<WorkloadShareSummary>(workloadShareSummaries);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkloadShareSummaries(java.util.Collection)} or
     * {@link #withWorkloadShareSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param workloadShareSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadSharesResult withWorkloadShareSummaries(WorkloadShareSummary... workloadShareSummaries) {
        if (this.workloadShareSummaries == null) {
            setWorkloadShareSummaries(new java.util.ArrayList<WorkloadShareSummary>(workloadShareSummaries.length));
        }
        for (WorkloadShareSummary ele : workloadShareSummaries) {
            this.workloadShareSummaries.add(ele);
        }
        return this;
    }

    /**
     * @param workloadShareSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadSharesResult withWorkloadShareSummaries(java.util.Collection<WorkloadShareSummary> workloadShareSummaries) {
        setWorkloadShareSummaries(workloadShareSummaries);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadSharesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadShareSummaries() != null)
            sb.append("WorkloadShareSummaries: ").append(getWorkloadShareSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkloadSharesResult == false)
            return false;
        ListWorkloadSharesResult other = (ListWorkloadSharesResult) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadShareSummaries() == null ^ this.getWorkloadShareSummaries() == null)
            return false;
        if (other.getWorkloadShareSummaries() != null && other.getWorkloadShareSummaries().equals(this.getWorkloadShareSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadShareSummaries() == null) ? 0 : getWorkloadShareSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkloadSharesResult clone() {
        try {
            return (ListWorkloadSharesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
