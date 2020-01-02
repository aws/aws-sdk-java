/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListFlowExecutionMessages"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFlowExecutionMessagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     */
    private String flowExecutionId;
    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     * 
     * @param flowExecutionId
     *        The ID of the flow execution.
     */

    public void setFlowExecutionId(String flowExecutionId) {
        this.flowExecutionId = flowExecutionId;
    }

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     * 
     * @return The ID of the flow execution.
     */

    public String getFlowExecutionId() {
        return this.flowExecutionId;
    }

    /**
     * <p>
     * The ID of the flow execution.
     * </p>
     * 
     * @param flowExecutionId
     *        The ID of the flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowExecutionMessagesRequest withFlowExecutionId(String flowExecutionId) {
        setFlowExecutionId(flowExecutionId);
        return this;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @return The string that specifies the next page of results. Use this when you're paginating results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies the next page of results. Use this when you're paginating results.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies the next page of results. Use this when you're paginating results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowExecutionMessagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFlowExecutionMessagesRequest withMaxResults(Integer maxResults) {
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
        if (getFlowExecutionId() != null)
            sb.append("FlowExecutionId: ").append(getFlowExecutionId()).append(",");
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

        if (obj instanceof ListFlowExecutionMessagesRequest == false)
            return false;
        ListFlowExecutionMessagesRequest other = (ListFlowExecutionMessagesRequest) obj;
        if (other.getFlowExecutionId() == null ^ this.getFlowExecutionId() == null)
            return false;
        if (other.getFlowExecutionId() != null && other.getFlowExecutionId().equals(this.getFlowExecutionId()) == false)
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

        hashCode = prime * hashCode + ((getFlowExecutionId() == null) ? 0 : getFlowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListFlowExecutionMessagesRequest clone() {
        return (ListFlowExecutionMessagesRequest) super.clone();
    }

}
