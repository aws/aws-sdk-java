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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetWorkflowRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the workflow whose metadata of runs should be returned.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     */
    private Boolean includeGraph;
    /**
     * <p>
     * The maximum size of the response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of workflow runs to be included in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Name of the workflow whose metadata of runs should be returned.
     * </p>
     * 
     * @param name
     *        Name of the workflow whose metadata of runs should be returned.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the workflow whose metadata of runs should be returned.
     * </p>
     * 
     * @return Name of the workflow whose metadata of runs should be returned.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the workflow whose metadata of runs should be returned.
     * </p>
     * 
     * @param name
     *        Name of the workflow whose metadata of runs should be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include the workflow graph in response or not.
     */

    public void setIncludeGraph(Boolean includeGraph) {
        this.includeGraph = includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @return Specifies whether to include the workflow graph in response or not.
     */

    public Boolean getIncludeGraph() {
        return this.includeGraph;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @param includeGraph
     *        Specifies whether to include the workflow graph in response or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsRequest withIncludeGraph(Boolean includeGraph) {
        setIncludeGraph(includeGraph);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include the workflow graph in response or not.
     * </p>
     * 
     * @return Specifies whether to include the workflow graph in response or not.
     */

    public Boolean isIncludeGraph() {
        return this.includeGraph;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @param nextToken
     *        The maximum size of the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @return The maximum size of the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @param nextToken
     *        The maximum size of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of workflow runs to be included in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workflow runs to be included in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of workflow runs to be included in the response.
     * </p>
     * 
     * @return The maximum number of workflow runs to be included in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of workflow runs to be included in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of workflow runs to be included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIncludeGraph() != null)
            sb.append("IncludeGraph: ").append(getIncludeGraph()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowRunsRequest == false)
            return false;
        GetWorkflowRunsRequest other = (GetWorkflowRunsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIncludeGraph() == null ^ this.getIncludeGraph() == null)
            return false;
        if (other.getIncludeGraph() != null && other.getIncludeGraph().equals(this.getIncludeGraph()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIncludeGraph() == null) ? 0 : getIncludeGraph().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowRunsRequest clone() {
        return (GetWorkflowRunsRequest) super.clone();
    }

}
