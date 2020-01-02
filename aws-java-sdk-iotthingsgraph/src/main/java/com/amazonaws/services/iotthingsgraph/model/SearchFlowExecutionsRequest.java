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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchFlowExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     */
    private String systemInstanceId;
    /**
     * <p>
     * The ID of a flow execution.
     * </p>
     */
    private String flowExecutionId;
    /**
     * <p>
     * The date and time of the earliest flow execution to return.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time of the latest flow execution to return.
     * </p>
     */
    private java.util.Date endTime;
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
     * The ID of the system instance that contains the flow.
     * </p>
     * 
     * @param systemInstanceId
     *        The ID of the system instance that contains the flow.
     */

    public void setSystemInstanceId(String systemInstanceId) {
        this.systemInstanceId = systemInstanceId;
    }

    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     * 
     * @return The ID of the system instance that contains the flow.
     */

    public String getSystemInstanceId() {
        return this.systemInstanceId;
    }

    /**
     * <p>
     * The ID of the system instance that contains the flow.
     * </p>
     * 
     * @param systemInstanceId
     *        The ID of the system instance that contains the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFlowExecutionsRequest withSystemInstanceId(String systemInstanceId) {
        setSystemInstanceId(systemInstanceId);
        return this;
    }

    /**
     * <p>
     * The ID of a flow execution.
     * </p>
     * 
     * @param flowExecutionId
     *        The ID of a flow execution.
     */

    public void setFlowExecutionId(String flowExecutionId) {
        this.flowExecutionId = flowExecutionId;
    }

    /**
     * <p>
     * The ID of a flow execution.
     * </p>
     * 
     * @return The ID of a flow execution.
     */

    public String getFlowExecutionId() {
        return this.flowExecutionId;
    }

    /**
     * <p>
     * The ID of a flow execution.
     * </p>
     * 
     * @param flowExecutionId
     *        The ID of a flow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFlowExecutionsRequest withFlowExecutionId(String flowExecutionId) {
        setFlowExecutionId(flowExecutionId);
        return this;
    }

    /**
     * <p>
     * The date and time of the earliest flow execution to return.
     * </p>
     * 
     * @param startTime
     *        The date and time of the earliest flow execution to return.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time of the earliest flow execution to return.
     * </p>
     * 
     * @return The date and time of the earliest flow execution to return.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time of the earliest flow execution to return.
     * </p>
     * 
     * @param startTime
     *        The date and time of the earliest flow execution to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFlowExecutionsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the latest flow execution to return.
     * </p>
     * 
     * @param endTime
     *        The date and time of the latest flow execution to return.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time of the latest flow execution to return.
     * </p>
     * 
     * @return The date and time of the latest flow execution to return.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time of the latest flow execution to return.
     * </p>
     * 
     * @param endTime
     *        The date and time of the latest flow execution to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFlowExecutionsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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

    public SearchFlowExecutionsRequest withNextToken(String nextToken) {
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

    public SearchFlowExecutionsRequest withMaxResults(Integer maxResults) {
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
        if (getSystemInstanceId() != null)
            sb.append("SystemInstanceId: ").append(getSystemInstanceId()).append(",");
        if (getFlowExecutionId() != null)
            sb.append("FlowExecutionId: ").append(getFlowExecutionId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof SearchFlowExecutionsRequest == false)
            return false;
        SearchFlowExecutionsRequest other = (SearchFlowExecutionsRequest) obj;
        if (other.getSystemInstanceId() == null ^ this.getSystemInstanceId() == null)
            return false;
        if (other.getSystemInstanceId() != null && other.getSystemInstanceId().equals(this.getSystemInstanceId()) == false)
            return false;
        if (other.getFlowExecutionId() == null ^ this.getFlowExecutionId() == null)
            return false;
        if (other.getFlowExecutionId() != null && other.getFlowExecutionId().equals(this.getFlowExecutionId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getSystemInstanceId() == null) ? 0 : getSystemInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFlowExecutionId() == null) ? 0 : getFlowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchFlowExecutionsRequest clone() {
        return (SearchFlowExecutionsRequest) super.clone();
    }

}
