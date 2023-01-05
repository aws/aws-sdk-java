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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelCards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelCardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summaries of the listed model cards.
     * </p>
     */
    private java.util.List<ModelCardSummary> modelCardSummaries;
    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use it in
     * the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summaries of the listed model cards.
     * </p>
     * 
     * @return The summaries of the listed model cards.
     */

    public java.util.List<ModelCardSummary> getModelCardSummaries() {
        return modelCardSummaries;
    }

    /**
     * <p>
     * The summaries of the listed model cards.
     * </p>
     * 
     * @param modelCardSummaries
     *        The summaries of the listed model cards.
     */

    public void setModelCardSummaries(java.util.Collection<ModelCardSummary> modelCardSummaries) {
        if (modelCardSummaries == null) {
            this.modelCardSummaries = null;
            return;
        }

        this.modelCardSummaries = new java.util.ArrayList<ModelCardSummary>(modelCardSummaries);
    }

    /**
     * <p>
     * The summaries of the listed model cards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelCardSummaries(java.util.Collection)} or {@link #withModelCardSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param modelCardSummaries
     *        The summaries of the listed model cards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsResult withModelCardSummaries(ModelCardSummary... modelCardSummaries) {
        if (this.modelCardSummaries == null) {
            setModelCardSummaries(new java.util.ArrayList<ModelCardSummary>(modelCardSummaries.length));
        }
        for (ModelCardSummary ele : modelCardSummaries) {
            this.modelCardSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summaries of the listed model cards.
     * </p>
     * 
     * @param modelCardSummaries
     *        The summaries of the listed model cards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsResult withModelCardSummaries(java.util.Collection<ModelCardSummary> modelCardSummaries) {
        setModelCardSummaries(modelCardSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use
     *        it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use it in
     * the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use
     *         it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use
     *        it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardsResult withNextToken(String nextToken) {
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
        if (getModelCardSummaries() != null)
            sb.append("ModelCardSummaries: ").append(getModelCardSummaries()).append(",");
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

        if (obj instanceof ListModelCardsResult == false)
            return false;
        ListModelCardsResult other = (ListModelCardsResult) obj;
        if (other.getModelCardSummaries() == null ^ this.getModelCardSummaries() == null)
            return false;
        if (other.getModelCardSummaries() != null && other.getModelCardSummaries().equals(this.getModelCardSummaries()) == false)
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

        hashCode = prime * hashCode + ((getModelCardSummaries() == null) ? 0 : getModelCardSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListModelCardsResult clone() {
        try {
            return (ListModelCardsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
