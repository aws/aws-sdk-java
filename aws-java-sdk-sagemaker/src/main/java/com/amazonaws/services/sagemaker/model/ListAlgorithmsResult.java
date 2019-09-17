/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlgorithmsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * </p>
     */
    private java.util.List<AlgorithmSummary> algorithmSummaryList;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it
     * in the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * </p>
     * 
     * @return &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     */

    public java.util.List<AlgorithmSummary> getAlgorithmSummaryList() {
        return algorithmSummaryList;
    }

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * </p>
     * 
     * @param algorithmSummaryList
     *        &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     */

    public void setAlgorithmSummaryList(java.util.Collection<AlgorithmSummary> algorithmSummaryList) {
        if (algorithmSummaryList == null) {
            this.algorithmSummaryList = null;
            return;
        }

        this.algorithmSummaryList = new java.util.ArrayList<AlgorithmSummary>(algorithmSummaryList);
    }

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlgorithmSummaryList(java.util.Collection)} or {@link #withAlgorithmSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param algorithmSummaryList
     *        &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsResult withAlgorithmSummaryList(AlgorithmSummary... algorithmSummaryList) {
        if (this.algorithmSummaryList == null) {
            setAlgorithmSummaryList(new java.util.ArrayList<AlgorithmSummary>(algorithmSummaryList.length));
        }
        for (AlgorithmSummary ele : algorithmSummaryList) {
            this.algorithmSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * </p>
     * 
     * @param algorithmSummaryList
     *        &gt;An array of <code>AlgorithmSummary</code> objects, each of which lists an algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsResult withAlgorithmSummaryList(java.util.Collection<AlgorithmSummary> algorithmSummaryList) {
        setAlgorithmSummaryList(algorithmSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it
     * in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms,
     *        use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it
     * in the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of
     *         algorithms, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it
     * in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms,
     *        use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsResult withNextToken(String nextToken) {
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
        if (getAlgorithmSummaryList() != null)
            sb.append("AlgorithmSummaryList: ").append(getAlgorithmSummaryList()).append(",");
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

        if (obj instanceof ListAlgorithmsResult == false)
            return false;
        ListAlgorithmsResult other = (ListAlgorithmsResult) obj;
        if (other.getAlgorithmSummaryList() == null ^ this.getAlgorithmSummaryList() == null)
            return false;
        if (other.getAlgorithmSummaryList() != null && other.getAlgorithmSummaryList().equals(this.getAlgorithmSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getAlgorithmSummaryList() == null) ? 0 : getAlgorithmSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAlgorithmsResult clone() {
        try {
            return (ListAlgorithmsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
