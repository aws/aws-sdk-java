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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference executions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides an array of information about the individual inference executions returned from the
     * <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data configuration,
     * and so on.
     * </p>
     */
    private java.util.List<InferenceExecutionSummary> inferenceExecutionSummaries;

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

    public ListInferenceExecutionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides an array of information about the individual inference executions returned from the
     * <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data configuration,
     * and so on.
     * </p>
     * 
     * @return Provides an array of information about the individual inference executions returned from the
     *         <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data
     *         configuration, and so on.
     */

    public java.util.List<InferenceExecutionSummary> getInferenceExecutionSummaries() {
        return inferenceExecutionSummaries;
    }

    /**
     * <p>
     * Provides an array of information about the individual inference executions returned from the
     * <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data configuration,
     * and so on.
     * </p>
     * 
     * @param inferenceExecutionSummaries
     *        Provides an array of information about the individual inference executions returned from the
     *        <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data
     *        configuration, and so on.
     */

    public void setInferenceExecutionSummaries(java.util.Collection<InferenceExecutionSummary> inferenceExecutionSummaries) {
        if (inferenceExecutionSummaries == null) {
            this.inferenceExecutionSummaries = null;
            return;
        }

        this.inferenceExecutionSummaries = new java.util.ArrayList<InferenceExecutionSummary>(inferenceExecutionSummaries);
    }

    /**
     * <p>
     * Provides an array of information about the individual inference executions returned from the
     * <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data configuration,
     * and so on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceExecutionSummaries(java.util.Collection)} or
     * {@link #withInferenceExecutionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inferenceExecutionSummaries
     *        Provides an array of information about the individual inference executions returned from the
     *        <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data
     *        configuration, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsResult withInferenceExecutionSummaries(InferenceExecutionSummary... inferenceExecutionSummaries) {
        if (this.inferenceExecutionSummaries == null) {
            setInferenceExecutionSummaries(new java.util.ArrayList<InferenceExecutionSummary>(inferenceExecutionSummaries.length));
        }
        for (InferenceExecutionSummary ele : inferenceExecutionSummaries) {
            this.inferenceExecutionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides an array of information about the individual inference executions returned from the
     * <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data configuration,
     * and so on.
     * </p>
     * 
     * @param inferenceExecutionSummaries
     *        Provides an array of information about the individual inference executions returned from the
     *        <code>ListInferenceExecutions</code> operation, including model used, inference scheduler, data
     *        configuration, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExecutionsResult withInferenceExecutionSummaries(java.util.Collection<InferenceExecutionSummary> inferenceExecutionSummaries) {
        setInferenceExecutionSummaries(inferenceExecutionSummaries);
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
        if (getInferenceExecutionSummaries() != null)
            sb.append("InferenceExecutionSummaries: ").append(getInferenceExecutionSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceExecutionsResult == false)
            return false;
        ListInferenceExecutionsResult other = (ListInferenceExecutionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getInferenceExecutionSummaries() == null ^ this.getInferenceExecutionSummaries() == null)
            return false;
        if (other.getInferenceExecutionSummaries() != null && other.getInferenceExecutionSummaries().equals(this.getInferenceExecutionSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getInferenceExecutionSummaries() == null) ? 0 : getInferenceExecutionSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceExecutionsResult clone() {
        try {
            return (ListInferenceExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
