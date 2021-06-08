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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceSchedulersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides information about the specified inference scheduler, including data upload frequency, model name and
     * ARN, and status.
     * </p>
     */
    private java.util.List<InferenceSchedulerSummary> inferenceSchedulerSummaries;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference schedulers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of inference schedulers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference schedulers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides information about the specified inference scheduler, including data upload frequency, model name and
     * ARN, and status.
     * </p>
     * 
     * @return Provides information about the specified inference scheduler, including data upload frequency, model name
     *         and ARN, and status.
     */

    public java.util.List<InferenceSchedulerSummary> getInferenceSchedulerSummaries() {
        return inferenceSchedulerSummaries;
    }

    /**
     * <p>
     * Provides information about the specified inference scheduler, including data upload frequency, model name and
     * ARN, and status.
     * </p>
     * 
     * @param inferenceSchedulerSummaries
     *        Provides information about the specified inference scheduler, including data upload frequency, model name
     *        and ARN, and status.
     */

    public void setInferenceSchedulerSummaries(java.util.Collection<InferenceSchedulerSummary> inferenceSchedulerSummaries) {
        if (inferenceSchedulerSummaries == null) {
            this.inferenceSchedulerSummaries = null;
            return;
        }

        this.inferenceSchedulerSummaries = new java.util.ArrayList<InferenceSchedulerSummary>(inferenceSchedulerSummaries);
    }

    /**
     * <p>
     * Provides information about the specified inference scheduler, including data upload frequency, model name and
     * ARN, and status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceSchedulerSummaries(java.util.Collection)} or
     * {@link #withInferenceSchedulerSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceSchedulerSummaries
     *        Provides information about the specified inference scheduler, including data upload frequency, model name
     *        and ARN, and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersResult withInferenceSchedulerSummaries(InferenceSchedulerSummary... inferenceSchedulerSummaries) {
        if (this.inferenceSchedulerSummaries == null) {
            setInferenceSchedulerSummaries(new java.util.ArrayList<InferenceSchedulerSummary>(inferenceSchedulerSummaries.length));
        }
        for (InferenceSchedulerSummary ele : inferenceSchedulerSummaries) {
            this.inferenceSchedulerSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information about the specified inference scheduler, including data upload frequency, model name and
     * ARN, and status.
     * </p>
     * 
     * @param inferenceSchedulerSummaries
     *        Provides information about the specified inference scheduler, including data upload frequency, model name
     *        and ARN, and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersResult withInferenceSchedulerSummaries(java.util.Collection<InferenceSchedulerSummary> inferenceSchedulerSummaries) {
        setInferenceSchedulerSummaries(inferenceSchedulerSummaries);
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
        if (getInferenceSchedulerSummaries() != null)
            sb.append("InferenceSchedulerSummaries: ").append(getInferenceSchedulerSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceSchedulersResult == false)
            return false;
        ListInferenceSchedulersResult other = (ListInferenceSchedulersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInferenceSchedulerSummaries() == null ^ this.getInferenceSchedulerSummaries() == null)
            return false;
        if (other.getInferenceSchedulerSummaries() != null && other.getInferenceSchedulerSummaries().equals(this.getInferenceSchedulerSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerSummaries() == null) ? 0 : getInferenceSchedulerSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceSchedulersResult clone() {
        try {
            return (ListInferenceSchedulersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
