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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListRetrainingSchedulers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRetrainingSchedulersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides information on the specified retraining scheduler, including the model name, model ARN, status, and
     * start date.
     * </p>
     */
    private java.util.List<RetrainingSchedulerSummary> retrainingSchedulerSummaries;
    /**
     * <p>
     * If the number of results exceeds the maximum, this pagination token is returned. Use this token in the request to
     * show the next page of retraining schedulers.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides information on the specified retraining scheduler, including the model name, model ARN, status, and
     * start date.
     * </p>
     * 
     * @return Provides information on the specified retraining scheduler, including the model name, model ARN, status,
     *         and start date.
     */

    public java.util.List<RetrainingSchedulerSummary> getRetrainingSchedulerSummaries() {
        return retrainingSchedulerSummaries;
    }

    /**
     * <p>
     * Provides information on the specified retraining scheduler, including the model name, model ARN, status, and
     * start date.
     * </p>
     * 
     * @param retrainingSchedulerSummaries
     *        Provides information on the specified retraining scheduler, including the model name, model ARN, status,
     *        and start date.
     */

    public void setRetrainingSchedulerSummaries(java.util.Collection<RetrainingSchedulerSummary> retrainingSchedulerSummaries) {
        if (retrainingSchedulerSummaries == null) {
            this.retrainingSchedulerSummaries = null;
            return;
        }

        this.retrainingSchedulerSummaries = new java.util.ArrayList<RetrainingSchedulerSummary>(retrainingSchedulerSummaries);
    }

    /**
     * <p>
     * Provides information on the specified retraining scheduler, including the model name, model ARN, status, and
     * start date.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetrainingSchedulerSummaries(java.util.Collection)} or
     * {@link #withRetrainingSchedulerSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param retrainingSchedulerSummaries
     *        Provides information on the specified retraining scheduler, including the model name, model ARN, status,
     *        and start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrainingSchedulersResult withRetrainingSchedulerSummaries(RetrainingSchedulerSummary... retrainingSchedulerSummaries) {
        if (this.retrainingSchedulerSummaries == null) {
            setRetrainingSchedulerSummaries(new java.util.ArrayList<RetrainingSchedulerSummary>(retrainingSchedulerSummaries.length));
        }
        for (RetrainingSchedulerSummary ele : retrainingSchedulerSummaries) {
            this.retrainingSchedulerSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information on the specified retraining scheduler, including the model name, model ARN, status, and
     * start date.
     * </p>
     * 
     * @param retrainingSchedulerSummaries
     *        Provides information on the specified retraining scheduler, including the model name, model ARN, status,
     *        and start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrainingSchedulersResult withRetrainingSchedulerSummaries(java.util.Collection<RetrainingSchedulerSummary> retrainingSchedulerSummaries) {
        setRetrainingSchedulerSummaries(retrainingSchedulerSummaries);
        return this;
    }

    /**
     * <p>
     * If the number of results exceeds the maximum, this pagination token is returned. Use this token in the request to
     * show the next page of retraining schedulers.
     * </p>
     * 
     * @param nextToken
     *        If the number of results exceeds the maximum, this pagination token is returned. Use this token in the
     *        request to show the next page of retraining schedulers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of results exceeds the maximum, this pagination token is returned. Use this token in the request to
     * show the next page of retraining schedulers.
     * </p>
     * 
     * @return If the number of results exceeds the maximum, this pagination token is returned. Use this token in the
     *         request to show the next page of retraining schedulers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of results exceeds the maximum, this pagination token is returned. Use this token in the request to
     * show the next page of retraining schedulers.
     * </p>
     * 
     * @param nextToken
     *        If the number of results exceeds the maximum, this pagination token is returned. Use this token in the
     *        request to show the next page of retraining schedulers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetrainingSchedulersResult withNextToken(String nextToken) {
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
        if (getRetrainingSchedulerSummaries() != null)
            sb.append("RetrainingSchedulerSummaries: ").append(getRetrainingSchedulerSummaries()).append(",");
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

        if (obj instanceof ListRetrainingSchedulersResult == false)
            return false;
        ListRetrainingSchedulersResult other = (ListRetrainingSchedulersResult) obj;
        if (other.getRetrainingSchedulerSummaries() == null ^ this.getRetrainingSchedulerSummaries() == null)
            return false;
        if (other.getRetrainingSchedulerSummaries() != null && other.getRetrainingSchedulerSummaries().equals(this.getRetrainingSchedulerSummaries()) == false)
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

        hashCode = prime * hashCode + ((getRetrainingSchedulerSummaries() == null) ? 0 : getRetrainingSchedulerSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRetrainingSchedulersResult clone() {
        try {
            return (ListRetrainingSchedulersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
