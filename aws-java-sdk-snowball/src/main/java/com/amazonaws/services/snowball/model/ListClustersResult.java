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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     */
    private java.util.List<ClusterListEntry> clusterListEntries;
    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the array.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @return Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important
     *         status information.
     */

    public java.util.List<ClusterListEntry> getClusterListEntries() {
        return clusterListEntries;
    }

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @param clusterListEntries
     *        Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important
     *        status information.
     */

    public void setClusterListEntries(java.util.Collection<ClusterListEntry> clusterListEntries) {
        if (clusterListEntries == null) {
            this.clusterListEntries = null;
            return;
        }

        this.clusterListEntries = new java.util.ArrayList<ClusterListEntry>(clusterListEntries);
    }

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterListEntries(java.util.Collection)} or {@link #withClusterListEntries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param clusterListEntries
     *        Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important
     *        status information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusterListEntries(ClusterListEntry... clusterListEntries) {
        if (this.clusterListEntries == null) {
            setClusterListEntries(new java.util.ArrayList<ClusterListEntry>(clusterListEntries.length));
        }
        for (ClusterListEntry ele : clusterListEntries) {
            this.clusterListEntries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important status
     * information.
     * </p>
     * 
     * @param clusterListEntries
     *        Each <code>ClusterListEntry</code> object contains a cluster's state, a cluster's ID, and other important
     *        status information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusterListEntries(java.util.Collection<ClusterListEntry> clusterListEntries) {
        setClusterListEntries(clusterListEntries);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the array.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your
     *        next <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the
     *        array.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the array.
     * </p>
     * 
     * @return HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your
     *         next <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the
     *         array.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your next
     * <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the array.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. If you use the automatically generated <code>NextToken</code> value in your
     *        next <code>ClusterListEntry</code> call, your list of returned clusters will start from this point in the
     *        array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withNextToken(String nextToken) {
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
        if (getClusterListEntries() != null)
            sb.append("ClusterListEntries: ").append(getClusterListEntries()).append(",");
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

        if (obj instanceof ListClustersResult == false)
            return false;
        ListClustersResult other = (ListClustersResult) obj;
        if (other.getClusterListEntries() == null ^ this.getClusterListEntries() == null)
            return false;
        if (other.getClusterListEntries() != null && other.getClusterListEntries().equals(this.getClusterListEntries()) == false)
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

        hashCode = prime * hashCode + ((getClusterListEntries() == null) ? 0 : getClusterListEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersResult clone() {
        try {
            return (ListClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
