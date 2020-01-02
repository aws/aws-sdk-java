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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/ListNodegroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNodegroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all of the node groups associated with the specified cluster.
     * </p>
     */
    private java.util.List<String> nodegroups;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the results of
     * a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all of the node groups associated with the specified cluster.
     * </p>
     * 
     * @return A list of all of the node groups associated with the specified cluster.
     */

    public java.util.List<String> getNodegroups() {
        return nodegroups;
    }

    /**
     * <p>
     * A list of all of the node groups associated with the specified cluster.
     * </p>
     * 
     * @param nodegroups
     *        A list of all of the node groups associated with the specified cluster.
     */

    public void setNodegroups(java.util.Collection<String> nodegroups) {
        if (nodegroups == null) {
            this.nodegroups = null;
            return;
        }

        this.nodegroups = new java.util.ArrayList<String>(nodegroups);
    }

    /**
     * <p>
     * A list of all of the node groups associated with the specified cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodegroups(java.util.Collection)} or {@link #withNodegroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodegroups
     *        A list of all of the node groups associated with the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodegroupsResult withNodegroups(String... nodegroups) {
        if (this.nodegroups == null) {
            setNodegroups(new java.util.ArrayList<String>(nodegroups.length));
        }
        for (String ele : nodegroups) {
            this.nodegroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all of the node groups associated with the specified cluster.
     * </p>
     * 
     * @param nodegroups
     *        A list of all of the node groups associated with the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodegroupsResult withNodegroups(java.util.Collection<String> nodegroups) {
        setNodegroups(nodegroups);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the results of
     * a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the
     *        results of a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the results of
     * a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the
     *         results of a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value
     *         to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the results of
     * a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListNodegroups</code> request. When the
     *        results of a <code>ListNodegroups</code> request exceed <code>maxResults</code>, you can use this value to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNodegroupsResult withNextToken(String nextToken) {
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
        if (getNodegroups() != null)
            sb.append("Nodegroups: ").append(getNodegroups()).append(",");
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

        if (obj instanceof ListNodegroupsResult == false)
            return false;
        ListNodegroupsResult other = (ListNodegroupsResult) obj;
        if (other.getNodegroups() == null ^ this.getNodegroups() == null)
            return false;
        if (other.getNodegroups() != null && other.getNodegroups().equals(this.getNodegroups()) == false)
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

        hashCode = prime * hashCode + ((getNodegroups() == null) ? 0 : getNodegroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNodegroupsResult clone() {
        try {
            return (ListNodegroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
