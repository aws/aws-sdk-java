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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListWorkloads" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkloadsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of workloads.
     * </p>
     */
    private java.util.List<Workload> workloadList;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of workloads.
     * </p>
     * 
     * @return The list of workloads.
     */

    public java.util.List<Workload> getWorkloadList() {
        return workloadList;
    }

    /**
     * <p>
     * The list of workloads.
     * </p>
     * 
     * @param workloadList
     *        The list of workloads.
     */

    public void setWorkloadList(java.util.Collection<Workload> workloadList) {
        if (workloadList == null) {
            this.workloadList = null;
            return;
        }

        this.workloadList = new java.util.ArrayList<Workload>(workloadList);
    }

    /**
     * <p>
     * The list of workloads.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkloadList(java.util.Collection)} or {@link #withWorkloadList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param workloadList
     *        The list of workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withWorkloadList(Workload... workloadList) {
        if (this.workloadList == null) {
            setWorkloadList(new java.util.ArrayList<Workload>(workloadList.length));
        }
        for (Workload ele : workloadList) {
            this.workloadList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of workloads.
     * </p>
     * 
     * @param workloadList
     *        The list of workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsResult withWorkloadList(java.util.Collection<Workload> workloadList) {
        setWorkloadList(workloadList);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
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
        if (getWorkloadList() != null)
            sb.append("WorkloadList: ").append(getWorkloadList()).append(",");
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
        if (other.getWorkloadList() == null ^ this.getWorkloadList() == null)
            return false;
        if (other.getWorkloadList() != null && other.getWorkloadList().equals(this.getWorkloadList()) == false)
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

        hashCode = prime * hashCode + ((getWorkloadList() == null) ? 0 : getWorkloadList().hashCode());
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
