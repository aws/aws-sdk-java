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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of all existing Data Prepper pipelines.
     * </p>
     */
    private java.util.List<PipelineSummary> pipelines;

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return When <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is
     * a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        When <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of all existing Data Prepper pipelines.
     * </p>
     * 
     * @return A list of all existing Data Prepper pipelines.
     */

    public java.util.List<PipelineSummary> getPipelines() {
        return pipelines;
    }

    /**
     * <p>
     * A list of all existing Data Prepper pipelines.
     * </p>
     * 
     * @param pipelines
     *        A list of all existing Data Prepper pipelines.
     */

    public void setPipelines(java.util.Collection<PipelineSummary> pipelines) {
        if (pipelines == null) {
            this.pipelines = null;
            return;
        }

        this.pipelines = new java.util.ArrayList<PipelineSummary>(pipelines);
    }

    /**
     * <p>
     * A list of all existing Data Prepper pipelines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelines(java.util.Collection)} or {@link #withPipelines(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelines
     *        A list of all existing Data Prepper pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelines(PipelineSummary... pipelines) {
        if (this.pipelines == null) {
            setPipelines(new java.util.ArrayList<PipelineSummary>(pipelines.length));
        }
        for (PipelineSummary ele : pipelines) {
            this.pipelines.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all existing Data Prepper pipelines.
     * </p>
     * 
     * @param pipelines
     *        A list of all existing Data Prepper pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelines(java.util.Collection<PipelineSummary> pipelines) {
        setPipelines(pipelines);
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
        if (getPipelines() != null)
            sb.append("Pipelines: ").append(getPipelines());
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
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPipelines() == null ^ this.getPipelines() == null)
            return false;
        if (other.getPipelines() != null && other.getPipelines().equals(this.getPipelines()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode());
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
