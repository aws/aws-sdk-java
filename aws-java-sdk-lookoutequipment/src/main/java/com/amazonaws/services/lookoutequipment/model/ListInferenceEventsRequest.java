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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference events.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of inference events to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the inference scheduler for the inference events listed.
     * </p>
     */
    private String inferenceSchedulerName;
    /**
     * <p>
     * Lookout for Equipment will return all the inference events with an end time equal to or greater than the start
     * time given.
     * </p>
     */
    private java.util.Date intervalStartTime;
    /**
     * <p>
     * Returns all the inference events with an end start time equal to or greater than less than the end time given
     * </p>
     */
    private java.util.Date intervalEndTime;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference events.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference events.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference events.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of inference events.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference events.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of inference events to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of inference events to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of inference events to list.
     * </p>
     * 
     * @return Specifies the maximum number of inference events to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of inference events to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of inference events to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the inference scheduler for the inference events listed.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler for the inference events listed.
     */

    public void setInferenceSchedulerName(String inferenceSchedulerName) {
        this.inferenceSchedulerName = inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler for the inference events listed.
     * </p>
     * 
     * @return The name of the inference scheduler for the inference events listed.
     */

    public String getInferenceSchedulerName() {
        return this.inferenceSchedulerName;
    }

    /**
     * <p>
     * The name of the inference scheduler for the inference events listed.
     * </p>
     * 
     * @param inferenceSchedulerName
     *        The name of the inference scheduler for the inference events listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsRequest withInferenceSchedulerName(String inferenceSchedulerName) {
        setInferenceSchedulerName(inferenceSchedulerName);
        return this;
    }

    /**
     * <p>
     * Lookout for Equipment will return all the inference events with an end time equal to or greater than the start
     * time given.
     * </p>
     * 
     * @param intervalStartTime
     *        Lookout for Equipment will return all the inference events with an end time equal to or greater than the
     *        start time given.
     */

    public void setIntervalStartTime(java.util.Date intervalStartTime) {
        this.intervalStartTime = intervalStartTime;
    }

    /**
     * <p>
     * Lookout for Equipment will return all the inference events with an end time equal to or greater than the start
     * time given.
     * </p>
     * 
     * @return Lookout for Equipment will return all the inference events with an end time equal to or greater than the
     *         start time given.
     */

    public java.util.Date getIntervalStartTime() {
        return this.intervalStartTime;
    }

    /**
     * <p>
     * Lookout for Equipment will return all the inference events with an end time equal to or greater than the start
     * time given.
     * </p>
     * 
     * @param intervalStartTime
     *        Lookout for Equipment will return all the inference events with an end time equal to or greater than the
     *        start time given.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsRequest withIntervalStartTime(java.util.Date intervalStartTime) {
        setIntervalStartTime(intervalStartTime);
        return this;
    }

    /**
     * <p>
     * Returns all the inference events with an end start time equal to or greater than less than the end time given
     * </p>
     * 
     * @param intervalEndTime
     *        Returns all the inference events with an end start time equal to or greater than less than the end time
     *        given
     */

    public void setIntervalEndTime(java.util.Date intervalEndTime) {
        this.intervalEndTime = intervalEndTime;
    }

    /**
     * <p>
     * Returns all the inference events with an end start time equal to or greater than less than the end time given
     * </p>
     * 
     * @return Returns all the inference events with an end start time equal to or greater than less than the end time
     *         given
     */

    public java.util.Date getIntervalEndTime() {
        return this.intervalEndTime;
    }

    /**
     * <p>
     * Returns all the inference events with an end start time equal to or greater than less than the end time given
     * </p>
     * 
     * @param intervalEndTime
     *        Returns all the inference events with an end start time equal to or greater than less than the end time
     *        given
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsRequest withIntervalEndTime(java.util.Date intervalEndTime) {
        setIntervalEndTime(intervalEndTime);
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
        if (getIntervalStartTime() != null)
            sb.append("IntervalStartTime: ").append(getIntervalStartTime()).append(",");
        if (getIntervalEndTime() != null)
            sb.append("IntervalEndTime: ").append(getIntervalEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceEventsRequest == false)
            return false;
        ListInferenceEventsRequest other = (ListInferenceEventsRequest) obj;
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
        if (other.getIntervalStartTime() == null ^ this.getIntervalStartTime() == null)
            return false;
        if (other.getIntervalStartTime() != null && other.getIntervalStartTime().equals(this.getIntervalStartTime()) == false)
            return false;
        if (other.getIntervalEndTime() == null ^ this.getIntervalEndTime() == null)
            return false;
        if (other.getIntervalEndTime() != null && other.getIntervalEndTime().equals(this.getIntervalEndTime()) == false)
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
        hashCode = prime * hashCode + ((getIntervalStartTime() == null) ? 0 : getIntervalStartTime().hashCode());
        hashCode = prime * hashCode + ((getIntervalEndTime() == null) ? 0 : getIntervalEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceEventsRequest clone() {
        return (ListInferenceEventsRequest) super.clone();
    }

}
