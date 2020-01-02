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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListQueues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the queues.
     * </p>
     */
    private java.util.List<QueueSummary> queueSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the queues.
     * </p>
     * 
     * @return Information about the queues.
     */

    public java.util.List<QueueSummary> getQueueSummaryList() {
        return queueSummaryList;
    }

    /**
     * <p>
     * Information about the queues.
     * </p>
     * 
     * @param queueSummaryList
     *        Information about the queues.
     */

    public void setQueueSummaryList(java.util.Collection<QueueSummary> queueSummaryList) {
        if (queueSummaryList == null) {
            this.queueSummaryList = null;
            return;
        }

        this.queueSummaryList = new java.util.ArrayList<QueueSummary>(queueSummaryList);
    }

    /**
     * <p>
     * Information about the queues.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueSummaryList(java.util.Collection)} or {@link #withQueueSummaryList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param queueSummaryList
     *        Information about the queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withQueueSummaryList(QueueSummary... queueSummaryList) {
        if (this.queueSummaryList == null) {
            setQueueSummaryList(new java.util.ArrayList<QueueSummary>(queueSummaryList.length));
        }
        for (QueueSummary ele : queueSummaryList) {
            this.queueSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the queues.
     * </p>
     * 
     * @param queueSummaryList
     *        Information about the queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withQueueSummaryList(java.util.Collection<QueueSummary> queueSummaryList) {
        setQueueSummaryList(queueSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueuesResult withNextToken(String nextToken) {
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
        if (getQueueSummaryList() != null)
            sb.append("QueueSummaryList: ").append(getQueueSummaryList()).append(",");
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

        if (obj instanceof ListQueuesResult == false)
            return false;
        ListQueuesResult other = (ListQueuesResult) obj;
        if (other.getQueueSummaryList() == null ^ this.getQueueSummaryList() == null)
            return false;
        if (other.getQueueSummaryList() != null && other.getQueueSummaryList().equals(this.getQueueSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getQueueSummaryList() == null) ? 0 : getQueueSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListQueuesResult clone() {
        try {
            return (ListQueuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
