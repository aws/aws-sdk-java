/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobBatches" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSimulationJobBatchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of simulation job batch summaries.
     * </p>
     */
    private java.util.List<SimulationJobBatchSummary> simulationJobBatchSummaries;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request. When the
     * results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of simulation job batch summaries.
     * </p>
     * 
     * @return A list of simulation job batch summaries.
     */

    public java.util.List<SimulationJobBatchSummary> getSimulationJobBatchSummaries() {
        return simulationJobBatchSummaries;
    }

    /**
     * <p>
     * A list of simulation job batch summaries.
     * </p>
     * 
     * @param simulationJobBatchSummaries
     *        A list of simulation job batch summaries.
     */

    public void setSimulationJobBatchSummaries(java.util.Collection<SimulationJobBatchSummary> simulationJobBatchSummaries) {
        if (simulationJobBatchSummaries == null) {
            this.simulationJobBatchSummaries = null;
            return;
        }

        this.simulationJobBatchSummaries = new java.util.ArrayList<SimulationJobBatchSummary>(simulationJobBatchSummaries);
    }

    /**
     * <p>
     * A list of simulation job batch summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSimulationJobBatchSummaries(java.util.Collection)} or
     * {@link #withSimulationJobBatchSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param simulationJobBatchSummaries
     *        A list of simulation job batch summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationJobBatchesResult withSimulationJobBatchSummaries(SimulationJobBatchSummary... simulationJobBatchSummaries) {
        if (this.simulationJobBatchSummaries == null) {
            setSimulationJobBatchSummaries(new java.util.ArrayList<SimulationJobBatchSummary>(simulationJobBatchSummaries.length));
        }
        for (SimulationJobBatchSummary ele : simulationJobBatchSummaries) {
            this.simulationJobBatchSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of simulation job batch summaries.
     * </p>
     * 
     * @param simulationJobBatchSummaries
     *        A list of simulation job batch summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationJobBatchesResult withSimulationJobBatchSummaries(java.util.Collection<SimulationJobBatchSummary> simulationJobBatchSummaries) {
        setSimulationJobBatchSummaries(simulationJobBatchSummaries);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request. When the
     * results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request.
     *        When the results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request. When the
     * results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request.
     *         When the results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this
     *         value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request. When the
     * results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this value can be used
     * to retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListSimulationJobBatches</code> request.
     *        When the results of a <code>ListSimulationJobBatches</code> request exceed <code>maxResults</code>, this
     *        value can be used to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationJobBatchesResult withNextToken(String nextToken) {
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
        if (getSimulationJobBatchSummaries() != null)
            sb.append("SimulationJobBatchSummaries: ").append(getSimulationJobBatchSummaries()).append(",");
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

        if (obj instanceof ListSimulationJobBatchesResult == false)
            return false;
        ListSimulationJobBatchesResult other = (ListSimulationJobBatchesResult) obj;
        if (other.getSimulationJobBatchSummaries() == null ^ this.getSimulationJobBatchSummaries() == null)
            return false;
        if (other.getSimulationJobBatchSummaries() != null && other.getSimulationJobBatchSummaries().equals(this.getSimulationJobBatchSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSimulationJobBatchSummaries() == null) ? 0 : getSimulationJobBatchSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSimulationJobBatchesResult clone() {
        try {
            return (ListSimulationJobBatchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
