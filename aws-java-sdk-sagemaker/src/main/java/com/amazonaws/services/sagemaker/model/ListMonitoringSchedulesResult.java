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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListMonitoringSchedules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMonitoringSchedulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring schedule.
     * </p>
     */
    private java.util.List<MonitoringScheduleSummary> monitoringScheduleSummaries;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent reques
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring schedule.
     * </p>
     * 
     * @return A JSON array in which each element is a summary for a monitoring schedule.
     */

    public java.util.List<MonitoringScheduleSummary> getMonitoringScheduleSummaries() {
        return monitoringScheduleSummaries;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleSummaries
     *        A JSON array in which each element is a summary for a monitoring schedule.
     */

    public void setMonitoringScheduleSummaries(java.util.Collection<MonitoringScheduleSummary> monitoringScheduleSummaries) {
        if (monitoringScheduleSummaries == null) {
            this.monitoringScheduleSummaries = null;
            return;
        }

        this.monitoringScheduleSummaries = new java.util.ArrayList<MonitoringScheduleSummary>(monitoringScheduleSummaries);
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitoringScheduleSummaries(java.util.Collection)} or
     * {@link #withMonitoringScheduleSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param monitoringScheduleSummaries
     *        A JSON array in which each element is a summary for a monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringSchedulesResult withMonitoringScheduleSummaries(MonitoringScheduleSummary... monitoringScheduleSummaries) {
        if (this.monitoringScheduleSummaries == null) {
            setMonitoringScheduleSummaries(new java.util.ArrayList<MonitoringScheduleSummary>(monitoringScheduleSummaries.length));
        }
        for (MonitoringScheduleSummary ele : monitoringScheduleSummaries) {
            this.monitoringScheduleSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON array in which each element is a summary for a monitoring schedule.
     * </p>
     * 
     * @param monitoringScheduleSummaries
     *        A JSON array in which each element is a summary for a monitoring schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringSchedulesResult withMonitoringScheduleSummaries(java.util.Collection<MonitoringScheduleSummary> monitoringScheduleSummaries) {
        setMonitoringScheduleSummaries(monitoringScheduleSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent reques
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use
     *        it in the subsequent reques
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent reques
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use
     *         it in the subsequent reques
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use it in
     * the subsequent reques
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of jobs, use
     *        it in the subsequent reques
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMonitoringSchedulesResult withNextToken(String nextToken) {
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
        if (getMonitoringScheduleSummaries() != null)
            sb.append("MonitoringScheduleSummaries: ").append(getMonitoringScheduleSummaries()).append(",");
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

        if (obj instanceof ListMonitoringSchedulesResult == false)
            return false;
        ListMonitoringSchedulesResult other = (ListMonitoringSchedulesResult) obj;
        if (other.getMonitoringScheduleSummaries() == null ^ this.getMonitoringScheduleSummaries() == null)
            return false;
        if (other.getMonitoringScheduleSummaries() != null && other.getMonitoringScheduleSummaries().equals(this.getMonitoringScheduleSummaries()) == false)
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

        hashCode = prime * hashCode + ((getMonitoringScheduleSummaries() == null) ? 0 : getMonitoringScheduleSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMonitoringSchedulesResult clone() {
        try {
            return (ListMonitoringSchedulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
