/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference executions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides an array of information about the individual inference events returned from the
     * <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     * diagnostics, and so on.
     * </p>
     */
    private java.util.List<InferenceEventSummary> inferenceEventSummaries;

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

    public ListInferenceEventsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides an array of information about the individual inference events returned from the
     * <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     * diagnostics, and so on.
     * </p>
     * 
     * @return Provides an array of information about the individual inference events returned from the
     *         <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     *         diagnostics, and so on.
     */

    public java.util.List<InferenceEventSummary> getInferenceEventSummaries() {
        return inferenceEventSummaries;
    }

    /**
     * <p>
     * Provides an array of information about the individual inference events returned from the
     * <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     * diagnostics, and so on.
     * </p>
     * 
     * @param inferenceEventSummaries
     *        Provides an array of information about the individual inference events returned from the
     *        <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     *        diagnostics, and so on.
     */

    public void setInferenceEventSummaries(java.util.Collection<InferenceEventSummary> inferenceEventSummaries) {
        if (inferenceEventSummaries == null) {
            this.inferenceEventSummaries = null;
            return;
        }

        this.inferenceEventSummaries = new java.util.ArrayList<InferenceEventSummary>(inferenceEventSummaries);
    }

    /**
     * <p>
     * Provides an array of information about the individual inference events returned from the
     * <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     * diagnostics, and so on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceEventSummaries(java.util.Collection)} or
     * {@link #withInferenceEventSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceEventSummaries
     *        Provides an array of information about the individual inference events returned from the
     *        <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     *        diagnostics, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsResult withInferenceEventSummaries(InferenceEventSummary... inferenceEventSummaries) {
        if (this.inferenceEventSummaries == null) {
            setInferenceEventSummaries(new java.util.ArrayList<InferenceEventSummary>(inferenceEventSummaries.length));
        }
        for (InferenceEventSummary ele : inferenceEventSummaries) {
            this.inferenceEventSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides an array of information about the individual inference events returned from the
     * <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     * diagnostics, and so on.
     * </p>
     * 
     * @param inferenceEventSummaries
     *        Provides an array of information about the individual inference events returned from the
     *        <code>ListInferenceEvents</code> operation, including scheduler used, event start time, event end time,
     *        diagnostics, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceEventsResult withInferenceEventSummaries(java.util.Collection<InferenceEventSummary> inferenceEventSummaries) {
        setInferenceEventSummaries(inferenceEventSummaries);
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
        if (getInferenceEventSummaries() != null)
            sb.append("InferenceEventSummaries: ").append(getInferenceEventSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceEventsResult == false)
            return false;
        ListInferenceEventsResult other = (ListInferenceEventsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInferenceEventSummaries() == null ^ this.getInferenceEventSummaries() == null)
            return false;
        if (other.getInferenceEventSummaries() != null && other.getInferenceEventSummaries().equals(this.getInferenceEventSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInferenceEventSummaries() == null) ? 0 : getInferenceEventSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceEventsResult clone() {
        try {
            return (ListInferenceEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
