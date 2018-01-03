/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/GetExecutionHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExecutionHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Lists events in descending order of their <code>timeStamp</code>.
     * </p>
     */
    private Boolean reverseOrder;
    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the execution.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionHistoryRequest withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain
     *        further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses
     *        the default.</p>
     *        <p>
     *        This is only an upper limit. The actual number of results returned per call might be fewer than the
     *        specified maximum.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     * 
     * @return The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain
     *         further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses
     *         the default.</p>
     *         <p>
     *         This is only an upper limit. The actual number of results returned per call might be fewer than the
     *         specified maximum.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain further
     * pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses the default.
     * </p>
     * <p>
     * This is only an upper limit. The actual number of results returned per call might be fewer than the specified
     * maximum.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that are returned per call. You can use <code>nextToken</code> to obtain
     *        further pages of results. The default is 100 and the maximum allowed page size is 100. A value of 0 uses
     *        the default.</p>
     *        <p>
     *        This is only an upper limit. The actual number of results returned per call might be fewer than the
     *        specified maximum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Lists events in descending order of their <code>timeStamp</code>.
     * </p>
     * 
     * @param reverseOrder
     *        Lists events in descending order of their <code>timeStamp</code>.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * Lists events in descending order of their <code>timeStamp</code>.
     * </p>
     * 
     * @return Lists events in descending order of their <code>timeStamp</code>.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * Lists events in descending order of their <code>timeStamp</code>.
     * </p>
     * 
     * @param reverseOrder
     *        Lists events in descending order of their <code>timeStamp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionHistoryRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * Lists events in descending order of their <code>timeStamp</code>.
     * </p>
     * 
     * @return Lists events in descending order of their <code>timeStamp</code>.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextToken
     *        If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all
     *        other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maxResults</code> determines how many results can be returned in a single call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @return If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve
     *         the next page of results, make the call again using the returned token in <code>nextToken</code>. Keep
     *         all other arguments unchanged.</p>
     *         <p>
     *         The configured <code>maxResults</code> determines how many results can be returned in a single call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * </p>
     * 
     * @param nextToken
     *        If a <code>nextToken</code> is returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>nextToken</code>. Keep all
     *        other arguments unchanged.</p>
     *        <p>
     *        The configured <code>maxResults</code> determines how many results can be returned in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExecutionHistoryRequest withNextToken(String nextToken) {
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: ").append(getReverseOrder()).append(",");
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

        if (obj instanceof GetExecutionHistoryRequest == false)
            return false;
        GetExecutionHistoryRequest other = (GetExecutionHistoryRequest) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null && other.getReverseOrder().equals(this.getReverseOrder()) == false)
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

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetExecutionHistoryRequest clone() {
        return (GetExecutionHistoryRequest) super.clone();
    }

}
