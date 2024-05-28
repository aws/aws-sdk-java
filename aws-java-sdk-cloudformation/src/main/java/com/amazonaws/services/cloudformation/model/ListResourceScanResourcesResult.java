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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListResourceScanResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScanResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the specified
     * filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScannedResource> resources;
    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the specified
     * filters.
     * </p>
     * 
     * @return List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the
     *         specified filters.
     */

    public java.util.List<ScannedResource> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<ScannedResource>();
        }
        return resources;
    }

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the specified
     * filters.
     * </p>
     * 
     * @param resources
     *        List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the
     *        specified filters.
     */

    public void setResources(java.util.Collection<ScannedResource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<ScannedResource>(resources);
    }

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the specified
     * filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the
     *        specified filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesResult withResources(ScannedResource... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<ScannedResource>(resources.length));
        }
        for (ScannedResource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the specified
     * filters.
     * </p>
     * 
     * @param resources
     *        List of up to <code>MaxResults</code> resources in the specified resource scan that match all of the
     *        specified filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesResult withResources(java.util.Collection<ScannedResource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResourceScanResources</code> again and use that value for
     *        the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        an empty string.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @return If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *         retrieve the next set of results, call <code>ListResourceScanResources</code> again and use that value
     *         for the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is
     *         set to an empty string.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To retrieve
     * the next set of results, call <code>ListResourceScanResources</code> again and use that value for the
     * <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to an empty
     * string.
     * </p>
     * 
     * @param nextToken
     *        If the request doesn't return all the remaining results, <code>NextToken</code> is set to a token. To
     *        retrieve the next set of results, call <code>ListResourceScanResources</code> again and use that value for
     *        the <code>NextToken</code> parameter. If the request returns all results, <code>NextToken</code> is set to
     *        an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesResult withNextToken(String nextToken) {
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
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

        if (obj instanceof ListResourceScanResourcesResult == false)
            return false;
        ListResourceScanResourcesResult other = (ListResourceScanResourcesResult) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceScanResourcesResult clone() {
        try {
            return (ListResourceScanResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
