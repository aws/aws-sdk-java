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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTransformJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTransformJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     */
    private java.util.List<TransformJobSummary> transformJobSummaries;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs,
     * use it in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>TransformJobSummary</code> objects.
     */

    public java.util.List<TransformJobSummary> getTransformJobSummaries() {
        return transformJobSummaries;
    }

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     * 
     * @param transformJobSummaries
     *        An array of <code>TransformJobSummary</code> objects.
     */

    public void setTransformJobSummaries(java.util.Collection<TransformJobSummary> transformJobSummaries) {
        if (transformJobSummaries == null) {
            this.transformJobSummaries = null;
            return;
        }

        this.transformJobSummaries = new java.util.ArrayList<TransformJobSummary>(transformJobSummaries);
    }

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransformJobSummaries(java.util.Collection)} or
     * {@link #withTransformJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transformJobSummaries
     *        An array of <code>TransformJobSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransformJobsResult withTransformJobSummaries(TransformJobSummary... transformJobSummaries) {
        if (this.transformJobSummaries == null) {
            setTransformJobSummaries(new java.util.ArrayList<TransformJobSummary>(transformJobSummaries.length));
        }
        for (TransformJobSummary ele : transformJobSummaries) {
            this.transformJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     * 
     * @param transformJobSummaries
     *        An array of <code>TransformJobSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransformJobsResult withTransformJobSummaries(java.util.Collection<TransformJobSummary> transformJobSummaries) {
        setTransformJobSummaries(transformJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs,
     * use it in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform
     *        jobs, use it in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs,
     * use it in the next request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform
     *         jobs, use it in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs,
     * use it in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform
     *        jobs, use it in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTransformJobsResult withNextToken(String nextToken) {
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
        if (getTransformJobSummaries() != null)
            sb.append("TransformJobSummaries: ").append(getTransformJobSummaries()).append(",");
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

        if (obj instanceof ListTransformJobsResult == false)
            return false;
        ListTransformJobsResult other = (ListTransformJobsResult) obj;
        if (other.getTransformJobSummaries() == null ^ this.getTransformJobSummaries() == null)
            return false;
        if (other.getTransformJobSummaries() != null && other.getTransformJobSummaries().equals(this.getTransformJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTransformJobSummaries() == null) ? 0 : getTransformJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTransformJobsResult clone() {
        try {
            return (ListTransformJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
