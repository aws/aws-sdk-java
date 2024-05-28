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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListQueueFleetAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQueueFleetAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The queue-fleet associations on the list.
     * </p>
     */
    private java.util.List<QueueFleetAssociationSummary> queueFleetAssociations;

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @return If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueueFleetAssociationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The queue-fleet associations on the list.
     * </p>
     * 
     * @return The queue-fleet associations on the list.
     */

    public java.util.List<QueueFleetAssociationSummary> getQueueFleetAssociations() {
        return queueFleetAssociations;
    }

    /**
     * <p>
     * The queue-fleet associations on the list.
     * </p>
     * 
     * @param queueFleetAssociations
     *        The queue-fleet associations on the list.
     */

    public void setQueueFleetAssociations(java.util.Collection<QueueFleetAssociationSummary> queueFleetAssociations) {
        if (queueFleetAssociations == null) {
            this.queueFleetAssociations = null;
            return;
        }

        this.queueFleetAssociations = new java.util.ArrayList<QueueFleetAssociationSummary>(queueFleetAssociations);
    }

    /**
     * <p>
     * The queue-fleet associations on the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueFleetAssociations(java.util.Collection)} or
     * {@link #withQueueFleetAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param queueFleetAssociations
     *        The queue-fleet associations on the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueueFleetAssociationsResult withQueueFleetAssociations(QueueFleetAssociationSummary... queueFleetAssociations) {
        if (this.queueFleetAssociations == null) {
            setQueueFleetAssociations(new java.util.ArrayList<QueueFleetAssociationSummary>(queueFleetAssociations.length));
        }
        for (QueueFleetAssociationSummary ele : queueFleetAssociations) {
            this.queueFleetAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The queue-fleet associations on the list.
     * </p>
     * 
     * @param queueFleetAssociations
     *        The queue-fleet associations on the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListQueueFleetAssociationsResult withQueueFleetAssociations(java.util.Collection<QueueFleetAssociationSummary> queueFleetAssociations) {
        setQueueFleetAssociations(queueFleetAssociations);
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
        if (getQueueFleetAssociations() != null)
            sb.append("QueueFleetAssociations: ").append(getQueueFleetAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueueFleetAssociationsResult == false)
            return false;
        ListQueueFleetAssociationsResult other = (ListQueueFleetAssociationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQueueFleetAssociations() == null ^ this.getQueueFleetAssociations() == null)
            return false;
        if (other.getQueueFleetAssociations() != null && other.getQueueFleetAssociations().equals(this.getQueueFleetAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQueueFleetAssociations() == null) ? 0 : getQueueFleetAssociations().hashCode());
        return hashCode;
    }

    @Override
    public ListQueueFleetAssociationsResult clone() {
        try {
            return (ListQueueFleetAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
