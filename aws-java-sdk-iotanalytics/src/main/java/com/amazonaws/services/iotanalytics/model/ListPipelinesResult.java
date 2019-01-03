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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of "PipelineSummary" objects.
     * </p>
     */
    private java.util.List<PipelineSummary> pipelineSummaries;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of "PipelineSummary" objects.
     * </p>
     * 
     * @return A list of "PipelineSummary" objects.
     */

    public java.util.List<PipelineSummary> getPipelineSummaries() {
        return pipelineSummaries;
    }

    /**
     * <p>
     * A list of "PipelineSummary" objects.
     * </p>
     * 
     * @param pipelineSummaries
     *        A list of "PipelineSummary" objects.
     */

    public void setPipelineSummaries(java.util.Collection<PipelineSummary> pipelineSummaries) {
        if (pipelineSummaries == null) {
            this.pipelineSummaries = null;
            return;
        }

        this.pipelineSummaries = new java.util.ArrayList<PipelineSummary>(pipelineSummaries);
    }

    /**
     * <p>
     * A list of "PipelineSummary" objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineSummaries(java.util.Collection)} or {@link #withPipelineSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pipelineSummaries
     *        A list of "PipelineSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelineSummaries(PipelineSummary... pipelineSummaries) {
        if (this.pipelineSummaries == null) {
            setPipelineSummaries(new java.util.ArrayList<PipelineSummary>(pipelineSummaries.length));
        }
        for (PipelineSummary ele : pipelineSummaries) {
            this.pipelineSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of "PipelineSummary" objects.
     * </p>
     * 
     * @param pipelineSummaries
     *        A list of "PipelineSummary" objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelineSummaries(java.util.Collection<PipelineSummary> pipelineSummaries) {
        setPipelineSummaries(pipelineSummaries);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withNextToken(String nextToken) {
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
        if (getPipelineSummaries() != null)
            sb.append("PipelineSummaries: ").append(getPipelineSummaries()).append(",");
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

        if (obj instanceof ListPipelinesResult == false)
            return false;
        ListPipelinesResult other = (ListPipelinesResult) obj;
        if (other.getPipelineSummaries() == null ^ this.getPipelineSummaries() == null)
            return false;
        if (other.getPipelineSummaries() != null && other.getPipelineSummaries().equals(this.getPipelineSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPipelineSummaries() == null) ? 0 : getPipelineSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesResult clone() {
        try {
            return (ListPipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
