/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResourceRequests" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requests that match the specified filter criteria.
     * </p>
     */
    private java.util.List<ProgressEvent> resourceRequestStatusSummaries;
    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The requests that match the specified filter criteria.
     * </p>
     * 
     * @return The requests that match the specified filter criteria.
     */

    public java.util.List<ProgressEvent> getResourceRequestStatusSummaries() {
        return resourceRequestStatusSummaries;
    }

    /**
     * <p>
     * The requests that match the specified filter criteria.
     * </p>
     * 
     * @param resourceRequestStatusSummaries
     *        The requests that match the specified filter criteria.
     */

    public void setResourceRequestStatusSummaries(java.util.Collection<ProgressEvent> resourceRequestStatusSummaries) {
        if (resourceRequestStatusSummaries == null) {
            this.resourceRequestStatusSummaries = null;
            return;
        }

        this.resourceRequestStatusSummaries = new java.util.ArrayList<ProgressEvent>(resourceRequestStatusSummaries);
    }

    /**
     * <p>
     * The requests that match the specified filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceRequestStatusSummaries(java.util.Collection)} or
     * {@link #withResourceRequestStatusSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceRequestStatusSummaries
     *        The requests that match the specified filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRequestsResult withResourceRequestStatusSummaries(ProgressEvent... resourceRequestStatusSummaries) {
        if (this.resourceRequestStatusSummaries == null) {
            setResourceRequestStatusSummaries(new java.util.ArrayList<ProgressEvent>(resourceRequestStatusSummaries.length));
        }
        for (ProgressEvent ele : resourceRequestStatusSummaries) {
            this.resourceRequestStatusSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requests that match the specified filter criteria.
     * </p>
     * 
     * @param resourceRequestStatusSummaries
     *        The requests that match the specified filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRequestsResult withResourceRequestStatusSummaries(java.util.Collection<ProgressEvent> resourceRequestStatusSummaries) {
        setResourceRequestStatusSummaries(resourceRequestStatusSummaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResources</code> again and assign that token to the
     *        request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     * 
     * @return If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>ListResources</code> again and assign that token to the
     *         request object's <code>NextToken</code> parameter. If the request returns all results,
     *         <code>NextToken</code> is set to null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResources</code> again and assign that token to the request object's
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to null.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all of the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResources</code> again and assign that token to the
     *        request object's <code>NextToken</code> parameter. If the request returns all results,
     *        <code>NextToken</code> is set to null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRequestsResult withNextToken(String nextToken) {
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
        if (getResourceRequestStatusSummaries() != null)
            sb.append("ResourceRequestStatusSummaries: ").append(getResourceRequestStatusSummaries()).append(",");
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

        if (obj instanceof ListResourceRequestsResult == false)
            return false;
        ListResourceRequestsResult other = (ListResourceRequestsResult) obj;
        if (other.getResourceRequestStatusSummaries() == null ^ this.getResourceRequestStatusSummaries() == null)
            return false;
        if (other.getResourceRequestStatusSummaries() != null
                && other.getResourceRequestStatusSummaries().equals(this.getResourceRequestStatusSummaries()) == false)
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

        hashCode = prime * hashCode + ((getResourceRequestStatusSummaries() == null) ? 0 : getResourceRequestStatusSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceRequestsResult clone() {
        try {
            return (ListResourceRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
