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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     */
    private java.util.List<ClusterInfo> clusterInfoList;
    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     * 
     * @return Information on each of the MSK clusters in the response.
     */

    public java.util.List<ClusterInfo> getClusterInfoList() {
        return clusterInfoList;
    }

    /**
     * <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     * 
     * @param clusterInfoList
     *        Information on each of the MSK clusters in the response.
     */

    public void setClusterInfoList(java.util.Collection<ClusterInfo> clusterInfoList) {
        if (clusterInfoList == null) {
            this.clusterInfoList = null;
            return;
        }

        this.clusterInfoList = new java.util.ArrayList<ClusterInfo>(clusterInfoList);
    }

    /**
     * <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterInfoList(java.util.Collection)} or {@link #withClusterInfoList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param clusterInfoList
     *        Information on each of the MSK clusters in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusterInfoList(ClusterInfo... clusterInfoList) {
        if (this.clusterInfoList == null) {
            setClusterInfoList(new java.util.ArrayList<ClusterInfo>(clusterInfoList.length));
        }
        for (ClusterInfo ele : clusterInfoList) {
            this.clusterInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     * 
     * @param clusterInfoList
     *        Information on each of the MSK clusters in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersResult withClusterInfoList(java.util.Collection<ClusterInfo> clusterInfoList) {
        setClusterInfoList(clusterInfoList);
        return this;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     *        NextToken in the response. To get another batch of clusters, provide this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @return The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     *         NextToken in the response. To get another batch of clusters, provide this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     *        NextToken in the response. To get another batch of clusters, provide this token in your next request.
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
        if (getClusterInfoList() != null)
            sb.append("ClusterInfoList: ").append(getClusterInfoList()).append(",");
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
        if (other.getClusterInfoList() == null ^ this.getClusterInfoList() == null)
            return false;
        if (other.getClusterInfoList() != null && other.getClusterInfoList().equals(this.getClusterInfoList()) == false)
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

        hashCode = prime * hashCode + ((getClusterInfoList() == null) ? 0 : getClusterInfoList().hashCode());
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
