/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueryStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An <code>ExecutionStatistics</code> structure containing execution statistics.
     * </p>
     */
    private ExecutionStatistics executionStatistics;
    /**
     * <p>
     * A <code>PlanningStatistics</code> structure containing query planning statistics.
     * </p>
     */
    private PlanningStatistics planningStatistics;
    /**
     * <p>
     * The time that the query was submitted.
     * </p>
     */
    private java.util.Date querySubmissionTime;

    /**
     * <p>
     * An <code>ExecutionStatistics</code> structure containing execution statistics.
     * </p>
     * 
     * @param executionStatistics
     *        An <code>ExecutionStatistics</code> structure containing execution statistics.
     */

    public void setExecutionStatistics(ExecutionStatistics executionStatistics) {
        this.executionStatistics = executionStatistics;
    }

    /**
     * <p>
     * An <code>ExecutionStatistics</code> structure containing execution statistics.
     * </p>
     * 
     * @return An <code>ExecutionStatistics</code> structure containing execution statistics.
     */

    public ExecutionStatistics getExecutionStatistics() {
        return this.executionStatistics;
    }

    /**
     * <p>
     * An <code>ExecutionStatistics</code> structure containing execution statistics.
     * </p>
     * 
     * @param executionStatistics
     *        An <code>ExecutionStatistics</code> structure containing execution statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryStatisticsResult withExecutionStatistics(ExecutionStatistics executionStatistics) {
        setExecutionStatistics(executionStatistics);
        return this;
    }

    /**
     * <p>
     * A <code>PlanningStatistics</code> structure containing query planning statistics.
     * </p>
     * 
     * @param planningStatistics
     *        A <code>PlanningStatistics</code> structure containing query planning statistics.
     */

    public void setPlanningStatistics(PlanningStatistics planningStatistics) {
        this.planningStatistics = planningStatistics;
    }

    /**
     * <p>
     * A <code>PlanningStatistics</code> structure containing query planning statistics.
     * </p>
     * 
     * @return A <code>PlanningStatistics</code> structure containing query planning statistics.
     */

    public PlanningStatistics getPlanningStatistics() {
        return this.planningStatistics;
    }

    /**
     * <p>
     * A <code>PlanningStatistics</code> structure containing query planning statistics.
     * </p>
     * 
     * @param planningStatistics
     *        A <code>PlanningStatistics</code> structure containing query planning statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryStatisticsResult withPlanningStatistics(PlanningStatistics planningStatistics) {
        setPlanningStatistics(planningStatistics);
        return this;
    }

    /**
     * <p>
     * The time that the query was submitted.
     * </p>
     * 
     * @param querySubmissionTime
     *        The time that the query was submitted.
     */

    public void setQuerySubmissionTime(java.util.Date querySubmissionTime) {
        this.querySubmissionTime = querySubmissionTime;
    }

    /**
     * <p>
     * The time that the query was submitted.
     * </p>
     * 
     * @return The time that the query was submitted.
     */

    public java.util.Date getQuerySubmissionTime() {
        return this.querySubmissionTime;
    }

    /**
     * <p>
     * The time that the query was submitted.
     * </p>
     * 
     * @param querySubmissionTime
     *        The time that the query was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueryStatisticsResult withQuerySubmissionTime(java.util.Date querySubmissionTime) {
        setQuerySubmissionTime(querySubmissionTime);
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
        if (getExecutionStatistics() != null)
            sb.append("ExecutionStatistics: ").append(getExecutionStatistics()).append(",");
        if (getPlanningStatistics() != null)
            sb.append("PlanningStatistics: ").append(getPlanningStatistics()).append(",");
        if (getQuerySubmissionTime() != null)
            sb.append("QuerySubmissionTime: ").append(getQuerySubmissionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueryStatisticsResult == false)
            return false;
        GetQueryStatisticsResult other = (GetQueryStatisticsResult) obj;
        if (other.getExecutionStatistics() == null ^ this.getExecutionStatistics() == null)
            return false;
        if (other.getExecutionStatistics() != null && other.getExecutionStatistics().equals(this.getExecutionStatistics()) == false)
            return false;
        if (other.getPlanningStatistics() == null ^ this.getPlanningStatistics() == null)
            return false;
        if (other.getPlanningStatistics() != null && other.getPlanningStatistics().equals(this.getPlanningStatistics()) == false)
            return false;
        if (other.getQuerySubmissionTime() == null ^ this.getQuerySubmissionTime() == null)
            return false;
        if (other.getQuerySubmissionTime() != null && other.getQuerySubmissionTime().equals(this.getQuerySubmissionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionStatistics() == null) ? 0 : getExecutionStatistics().hashCode());
        hashCode = prime * hashCode + ((getPlanningStatistics() == null) ? 0 : getPlanningStatistics().hashCode());
        hashCode = prime * hashCode + ((getQuerySubmissionTime() == null) ? 0 : getQuerySubmissionTime().hashCode());
        return hashCode;
    }

    @Override
    public GetQueryStatisticsResult clone() {
        try {
            return (GetQueryStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
