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
 * Output of a list workloads call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloads" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkloadsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<WorkloadSummary> workloadSummaries;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<WorkloadSummary> getWorkloadSummaries() {
        return workloadSummaries;
    }

    /**
     * @param workloadSummaries
     */

    public void setWorkloadSummaries(java.util.Collection<WorkloadSummary> workloadSummaries) {
        if (workloadSummaries == null) {
            this.workloadSummaries = null;
            return;
        }

        this.workloadSummaries = new java.util.ArrayList<WorkloadSummary>(workloadSummaries);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkloadSummaries(java.util.Collection)} or {@link #withWorkloadSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param workloadSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withWorkloadSummaries(WorkloadSummary... workloadSummaries) {
        if (this.workloadSummaries == null) {
            setWorkloadSummaries(new java.util.ArrayList<WorkloadSummary>(workloadSummaries.length));
        }
        for (WorkloadSummary ele : workloadSummaries) {
            this.workloadSummaries.add(ele);
        }
        return this;
    }

    /**
     * @param workloadSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withWorkloadSummaries(java.util.Collection<WorkloadSummary> workloadSummaries) {
        setWorkloadSummaries(workloadSummaries);
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

    public ListWorkloadsResult withNextToken(String nextToken) {
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
        if (getWorkloadSummaries() != null)
            sb.append("WorkloadSummaries: ").append(getWorkloadSummaries()).append(",");
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

        if (obj instanceof ListWorkloadsResult == false)
            return false;
        ListWorkloadsResult other = (ListWorkloadsResult) obj;
        if (other.getWorkloadSummaries() == null ^ this.getWorkloadSummaries() == null)
            return false;
        if (other.getWorkloadSummaries() != null && other.getWorkloadSummaries().equals(this.getWorkloadSummaries()) == false)
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

        hashCode = prime * hashCode + ((getWorkloadSummaries() == null) ? 0 : getWorkloadSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkloadsResult clone() {
        try {
            return (ListWorkloadsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
