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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCompilationJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCompilationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * </p>
     */
    private java.util.List<CompilationJobSummary> compilationJobSummaries;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next set of
     * model compilation jobs, use this token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * </p>
     * 
     * @return An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     */

    public java.util.List<CompilationJobSummary> getCompilationJobSummaries() {
        return compilationJobSummaries;
    }

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * </p>
     * 
     * @param compilationJobSummaries
     *        An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     */

    public void setCompilationJobSummaries(java.util.Collection<CompilationJobSummary> compilationJobSummaries) {
        if (compilationJobSummaries == null) {
            this.compilationJobSummaries = null;
            return;
        }

        this.compilationJobSummaries = new java.util.ArrayList<CompilationJobSummary>(compilationJobSummaries);
    }

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompilationJobSummaries(java.util.Collection)} or
     * {@link #withCompilationJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param compilationJobSummaries
     *        An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompilationJobsResult withCompilationJobSummaries(CompilationJobSummary... compilationJobSummaries) {
        if (this.compilationJobSummaries == null) {
            setCompilationJobSummaries(new java.util.ArrayList<CompilationJobSummary>(compilationJobSummaries.length));
        }
        for (CompilationJobSummary ele : compilationJobSummaries) {
            this.compilationJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * </p>
     * 
     * @param compilationJobSummaries
     *        An array of <a>CompilationJobSummary</a> objects, each describing a model compilation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompilationJobsResult withCompilationJobSummaries(java.util.Collection<CompilationJobSummary> compilationJobSummaries) {
        setCompilationJobSummaries(compilationJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next set of
     * model compilation jobs, use this token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next
     *        set of model compilation jobs, use this token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next set of
     * model compilation jobs, use this token in the next request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next
     *         set of model compilation jobs, use this token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next set of
     * model compilation jobs, use this token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this <code>NextToken</code>. To retrieve the next
     *        set of model compilation jobs, use this token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompilationJobsResult withNextToken(String nextToken) {
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
        if (getCompilationJobSummaries() != null)
            sb.append("CompilationJobSummaries: ").append(getCompilationJobSummaries()).append(",");
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

        if (obj instanceof ListCompilationJobsResult == false)
            return false;
        ListCompilationJobsResult other = (ListCompilationJobsResult) obj;
        if (other.getCompilationJobSummaries() == null ^ this.getCompilationJobSummaries() == null)
            return false;
        if (other.getCompilationJobSummaries() != null && other.getCompilationJobSummaries().equals(this.getCompilationJobSummaries()) == false)
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

        hashCode = prime * hashCode + ((getCompilationJobSummaries() == null) ? 0 : getCompilationJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCompilationJobsResult clone() {
        try {
            return (ListCompilationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
