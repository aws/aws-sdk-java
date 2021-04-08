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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference executions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of inference executions to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the inference scheduler for the inference execution listed.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the inference
     * execution.
     * </p>
     */
    private java.util.Date dataStartTimeAfter;
    /**
     * <p>
     * The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the inference
     * execution.
     * </p>
     */
    private java.util.Date dataEndTimeBefore;
    /**
     * <p>
     * The status of the inference execution.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference executions.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference executions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference executions.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of inference executions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference executions.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference executions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of inference executions to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of inference executions to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of inference executions to list.
     * </p>
     * 
     * @return Specifies the maximum number of inference executions to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of inference executions to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of inference executions to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler for the inference execution listed.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler for the inference execution listed.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler for the inference execution listed.
     * </p>
     * 
     * @return The name of the inference scheduler for the inference execution listed.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler for the inference execution listed.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler for the inference execution listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsRequest withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the inference
     * execution.
     * </p>
     * 
     * @param dataStartTimeAfter
     *        The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the
     *        inference execution.
     */

    public void setDataStartTimeAfter(java.util.Date dataStartTimeAfter) {
        this.dataStartTimeAfter = dataStartTimeAfter;
    }

    /**
     * <p>
     * The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the inference
     * execution.
     * </p>
     * 
     * @return The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the
     *         inference execution.
     */

    public java.util.Date getDataStartTimeAfter() {
        return this.dataStartTimeAfter;
    }

    /**
     * <p>
     * The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the inference
     * execution.
     * </p>
     * 
     * @param dataStartTimeAfter
     *        The time reference in the inferenced dataset after which Amazon Lookout for Equipment started the
     *        inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsRequest withDataStartTimeAfter(java.util.Date dataStartTimeAfter) {
        setDataStartTimeAfter(dataStartTimeAfter);
        return this;
    }

    /**
     * <p>
     * The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the inference
     * execution.
     * </p>
     * 
     * @param dataEndTimeBefore
     *        The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the
     *        inference execution.
     */

    public void setDataEndTimeBefore(java.util.Date dataEndTimeBefore) {
        this.dataEndTimeBefore = dataEndTimeBefore;
    }

    /**
     * <p>
     * The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the inference
     * execution.
     * </p>
     * 
     * @return The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the
     *         inference execution.
     */

    public java.util.Date getDataEndTimeBefore() {
        return this.dataEndTimeBefore;
    }

    /**
     * <p>
     * The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the inference
     * execution.
     * </p>
     * 
     * @param dataEndTimeBefore
     *        The time reference in the inferenced dataset before which Amazon Lookout for Equipment stopped the
     *        inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsRequest withDataEndTimeBefore(java.util.Date dataEndTimeBefore) {
        setDataEndTimeBefore(dataEndTimeBefore);
        return this;
    }

    /**
     * <p>
     * The status of the inference execution.
     * </p>
     * 
     * @param status
     *        The status of the inference execution.
     * @see InferenceExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the inference execution.
     * </p>
     * 
     * @return The status of the inference execution.
     * @see InferenceExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the inference execution.
     * </p>
     * 
     * @param status
     *        The status of the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExecutionStatus
     */

    public ListInferenceExecutionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the inference execution.
     * </p>
     * 
     * @param status
     *        The status of the inference execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExecutionStatus
     */

    public ListInferenceExecutionsRequest withStatus(InferenceExecutionStatus status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getInferenceSchedulerName() != null)
            sb.append("InferenceSchedulerName: ").append(getInferenceSchedulerName()).append(",");
        if (getDataStartTimeAfter() != null)
            sb.append("DataStartTimeAfter: ").append(getDataStartTimeAfter()).append(",");
        if (getDataEndTimeBefore() != null)
            sb.append("DataEndTimeBefore: ").append(getDataEndTimeBefore()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceExecutionsRequest == false)
            return false;
        ListInferenceExecutionsRequest other = (ListInferenceExecutionsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getInferenceSchedulerName() == null ^ this.getInferenceSchedulerName() == null)
            return false;
        if (other.getInferenceSchedulerName() != null && other.getInferenceSchedulerName().equals(this.getInferenceSchedulerName()) == false)
            return false;
        if (other.getDataStartTimeAfter() == null ^ this.getDataStartTimeAfter() == null)
            return false;
        if (other.getDataStartTimeAfter() != null && other.getDataStartTimeAfter().equals(this.getDataStartTimeAfter()) == false)
            return false;
        if (other.getDataEndTimeBefore() == null ^ this.getDataEndTimeBefore() == null)
            return false;
        if (other.getDataEndTimeBefore() != null && other.getDataEndTimeBefore().equals(this.getDataEndTimeBefore()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerName() == null) ? 0 : getInferenceSchedulerName().hashCode());
        hashCode = prime * hashCode + ((getDataStartTimeAfter() == null) ? 0 : getDataStartTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getDataEndTimeBefore() == null) ? 0 : getDataEndTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceExecutionsRequest clone() {
        return (ListInferenceExecutionsRequest) super.clone();
    }

}
