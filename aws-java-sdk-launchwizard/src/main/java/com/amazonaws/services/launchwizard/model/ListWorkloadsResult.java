/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/ListWorkloads" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkloadsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the workloads.
     * </p>
     */
    private java.util.List<WorkloadDataSummary> workloads;

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @return The token to include in another request to get the next page of items. This value is <code>null</code>
     *         when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to include in another request to get the next page of items. This value is <code>null</code> when there
     * are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        The token to include in another request to get the next page of items. This value is <code>null</code>
     *        when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the workloads.
     * </p>
     * 
     * @return Information about the workloads.
     */

    public java.util.List<WorkloadDataSummary> getWorkloads() {
        return workloads;
    }

    /**
     * <p>
     * Information about the workloads.
     * </p>
     * 
     * @param workloads
     *        Information about the workloads.
     */

    public void setWorkloads(java.util.Collection<WorkloadDataSummary> workloads) {
        if (workloads == null) {
            this.workloads = null;
            return;
        }

        this.workloads = new java.util.ArrayList<WorkloadDataSummary>(workloads);
    }

    /**
     * <p>
     * Information about the workloads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkloads(java.util.Collection)} or {@link #withWorkloads(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workloads
     *        Information about the workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withWorkloads(WorkloadDataSummary... workloads) {
        if (this.workloads == null) {
            setWorkloads(new java.util.ArrayList<WorkloadDataSummary>(workloads.length));
        }
        for (WorkloadDataSummary ele : workloads) {
            this.workloads.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the workloads.
     * </p>
     * 
     * @param workloads
     *        Information about the workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withWorkloads(java.util.Collection<WorkloadDataSummary> workloads) {
        setWorkloads(workloads);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWorkloads() != null)
            sb.append("Workloads: ").append(getWorkloads());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWorkloads() == null ^ this.getWorkloads() == null)
            return false;
        if (other.getWorkloads() != null && other.getWorkloads().equals(this.getWorkloads()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWorkloads() == null) ? 0 : getWorkloads().hashCode());
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
