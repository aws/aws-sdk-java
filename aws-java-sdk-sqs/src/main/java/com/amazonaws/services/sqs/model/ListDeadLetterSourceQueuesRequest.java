/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/ListDeadLetterSourceQueues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeadLetterSourceQueuesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL of a dead-letter queue.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     */
    private String queueUrl;
    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     * <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * Default constructor for ListDeadLetterSourceQueuesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ListDeadLetterSourceQueuesRequest() {
    }

    /**
     * Constructs a new ListDeadLetterSourceQueuesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param queueUrl
     *        The URL of a dead-letter queue.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */
    public ListDeadLetterSourceQueuesRequest(String queueUrl) {
        setQueueUrl(queueUrl);
    }

    /**
     * <p>
     * The URL of a dead-letter queue.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of a dead-letter queue.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL of a dead-letter queue.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @return The URL of a dead-letter queue.</p>
     *         <p>
     *         Queue URLs and names are case-sensitive.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL of a dead-letter queue.
     * </p>
     * <p>
     * Queue URLs and names are case-sensitive.
     * </p>
     * 
     * @param queueUrl
     *        The URL of a dead-letter queue.</p>
     *        <p>
     *        Queue URLs and names are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeadLetterSourceQueuesRequest withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
        return this;
    }

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     * 
     * @return Pagination token to request the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token to request the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Pagination token to request the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeadLetterSourceQueuesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     * <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     *        <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     * <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     * </p>
     * 
     * @return Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     *         <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     * <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to include in the response. Value range is 1 to 1000. You must set
     *        <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeadLetterSourceQueuesRequest withMaxResults(Integer maxResults) {
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: ").append(getQueueUrl()).append(",");
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

        if (obj instanceof ListDeadLetterSourceQueuesRequest == false)
            return false;
        ListDeadLetterSourceQueuesRequest other = (ListDeadLetterSourceQueuesRequest) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null && other.getQueueUrl().equals(this.getQueueUrl()) == false)
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

        hashCode = prime * hashCode + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDeadLetterSourceQueuesRequest clone() {
        return (ListDeadLetterSourceQueuesRequest) super.clone();
    }

}
