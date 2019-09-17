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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListProtectedResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtectedResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon
     * Resource Name (ARN) of the resource, and a resource type.
     * </p>
     */
    private java.util.List<ProtectedResource> results;
    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon
     * Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @return An array of resources successfully backed up by AWS Backup including the time the resource was saved, an
     *         Amazon Resource Name (ARN) of the resource, and a resource type.
     */

    public java.util.List<ProtectedResource> getResults() {
        return results;
    }

    /**
     * <p>
     * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon
     * Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @param results
     *        An array of resources successfully backed up by AWS Backup including the time the resource was saved, an
     *        Amazon Resource Name (ARN) of the resource, and a resource type.
     */

    public void setResults(java.util.Collection<ProtectedResource> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<ProtectedResource>(results);
    }

    /**
     * <p>
     * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon
     * Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        An array of resources successfully backed up by AWS Backup including the time the resource was saved, an
     *        Amazon Resource Name (ARN) of the resource, and a resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedResourcesResult withResults(ProtectedResource... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<ProtectedResource>(results.length));
        }
        for (ProtectedResource ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of resources successfully backed up by AWS Backup including the time the resource was saved, an Amazon
     * Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @param results
     *        An array of resources successfully backed up by AWS Backup including the time the resource was saved, an
     *        Amazon Resource Name (ARN) of the resource, and a resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedResourcesResult withResults(java.util.Collection<ProtectedResource> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @return The next item following a partial list of returned items. For example, if a request is made to return
     *         <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *         list starting at the location pointed to by the next token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next item following a partial list of returned items. For example, if a request is made to return
     * <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your list
     * starting at the location pointed to by the next token.
     * </p>
     * 
     * @param nextToken
     *        The next item following a partial list of returned items. For example, if a request is made to return
     *        <code>maxResults</code> number of items, <code>NextToken</code> allows you to return more items in your
     *        list starting at the location pointed to by the next token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtectedResourcesResult withNextToken(String nextToken) {
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
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

        if (obj instanceof ListProtectedResourcesResult == false)
            return false;
        ListProtectedResourcesResult other = (ListProtectedResourcesResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
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

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProtectedResourcesResult clone() {
        try {
            return (ListProtectedResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
