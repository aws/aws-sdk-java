/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a list pipelines action.
 * </p>
 */
public class ListPipelinesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of pipelines.
     * </p>
     */
    private java.util.List<PipelineSummary> pipelines;
    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned which can be used in
     * a subsequent list pipelines call to return the next set of pipelines in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of pipelines.
     * </p>
     * 
     * @return The list of pipelines.
     */

    public java.util.List<PipelineSummary> getPipelines() {
        return pipelines;
    }

    /**
     * <p>
     * The list of pipelines.
     * </p>
     * 
     * @param pipelines
     *        The list of pipelines.
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
     * The list of pipelines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelines(java.util.Collection)} or {@link #withPipelines(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelines
     *        The list of pipelines.
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
     * The list of pipelines.
     * </p>
     * 
     * @param pipelines
     *        The list of pipelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withPipelines(java.util.Collection<PipelineSummary> pipelines) {
        setPipelines(pipelines);
        return this;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned which can be used in
     * a subsequent list pipelines call to return the next set of pipelines in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of returned information is significantly large, an identifier is also returned which can be
     *        used in a subsequent list pipelines call to return the next set of pipelines in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned which can be used in
     * a subsequent list pipelines call to return the next set of pipelines in the list.
     * </p>
     * 
     * @return If the amount of returned information is significantly large, an identifier is also returned which can be
     *         used in a subsequent list pipelines call to return the next set of pipelines in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned which can be used in
     * a subsequent list pipelines call to return the next set of pipelines in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of returned information is significantly large, an identifier is also returned which can be
     *        used in a subsequent list pipelines call to return the next set of pipelines in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelines() != null)
            sb.append("Pipelines: " + getPipelines() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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
        if (other.getPipelines() == null ^ this.getPipelines() == null)
            return false;
        if (other.getPipelines() != null && other.getPipelines().equals(this.getPipelines()) == false)
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

        hashCode = prime * hashCode + ((getPipelines() == null) ? 0 : getPipelines().hashCode());
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
