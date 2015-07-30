/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a <code>DescribeEcsClusters</code> request.
 * </p>
 */
public class DescribeEcsClustersResult implements Serializable, Cloneable {

    /**
     * A list of <code>EcsCluster</code> objects containing the cluster
     * descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EcsCluster> ecsClusters;

    /**
     * If a paginated request does not return all of the remaining results,
     * this parameter is set to a token that you can assign to the request
     * object's <code>NextToken</code> parameter to retrieve the next set of
     * results. If the previous paginated request returned all of the
     * remaining results, this parameter is set to <code>null</code>.
     */
    private String nextToken;

    /**
     * A list of <code>EcsCluster</code> objects containing the cluster
     * descriptions.
     *
     * @return A list of <code>EcsCluster</code> objects containing the cluster
     *         descriptions.
     */
    public java.util.List<EcsCluster> getEcsClusters() {
        if (ecsClusters == null) {
              ecsClusters = new com.amazonaws.internal.ListWithAutoConstructFlag<EcsCluster>();
              ecsClusters.setAutoConstruct(true);
        }
        return ecsClusters;
    }
    
    /**
     * A list of <code>EcsCluster</code> objects containing the cluster
     * descriptions.
     *
     * @param ecsClusters A list of <code>EcsCluster</code> objects containing the cluster
     *         descriptions.
     */
    public void setEcsClusters(java.util.Collection<EcsCluster> ecsClusters) {
        if (ecsClusters == null) {
            this.ecsClusters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EcsCluster> ecsClustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EcsCluster>(ecsClusters.size());
        ecsClustersCopy.addAll(ecsClusters);
        this.ecsClusters = ecsClustersCopy;
    }
    
    /**
     * A list of <code>EcsCluster</code> objects containing the cluster
     * descriptions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEcsClusters(java.util.Collection)} or {@link
     * #withEcsClusters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusters A list of <code>EcsCluster</code> objects containing the cluster
     *         descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersResult withEcsClusters(EcsCluster... ecsClusters) {
        if (getEcsClusters() == null) setEcsClusters(new java.util.ArrayList<EcsCluster>(ecsClusters.length));
        for (EcsCluster value : ecsClusters) {
            getEcsClusters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>EcsCluster</code> objects containing the cluster
     * descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ecsClusters A list of <code>EcsCluster</code> objects containing the cluster
     *         descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersResult withEcsClusters(java.util.Collection<EcsCluster> ecsClusters) {
        if (ecsClusters == null) {
            this.ecsClusters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EcsCluster> ecsClustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EcsCluster>(ecsClusters.size());
            ecsClustersCopy.addAll(ecsClusters);
            this.ecsClusters = ecsClustersCopy;
        }

        return this;
    }

    /**
     * If a paginated request does not return all of the remaining results,
     * this parameter is set to a token that you can assign to the request
     * object's <code>NextToken</code> parameter to retrieve the next set of
     * results. If the previous paginated request returned all of the
     * remaining results, this parameter is set to <code>null</code>.
     *
     * @return If a paginated request does not return all of the remaining results,
     *         this parameter is set to a token that you can assign to the request
     *         object's <code>NextToken</code> parameter to retrieve the next set of
     *         results. If the previous paginated request returned all of the
     *         remaining results, this parameter is set to <code>null</code>.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If a paginated request does not return all of the remaining results,
     * this parameter is set to a token that you can assign to the request
     * object's <code>NextToken</code> parameter to retrieve the next set of
     * results. If the previous paginated request returned all of the
     * remaining results, this parameter is set to <code>null</code>.
     *
     * @param nextToken If a paginated request does not return all of the remaining results,
     *         this parameter is set to a token that you can assign to the request
     *         object's <code>NextToken</code> parameter to retrieve the next set of
     *         results. If the previous paginated request returned all of the
     *         remaining results, this parameter is set to <code>null</code>.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If a paginated request does not return all of the remaining results,
     * this parameter is set to a token that you can assign to the request
     * object's <code>NextToken</code> parameter to retrieve the next set of
     * results. If the previous paginated request returned all of the
     * remaining results, this parameter is set to <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If a paginated request does not return all of the remaining results,
     *         this parameter is set to a token that you can assign to the request
     *         object's <code>NextToken</code> parameter to retrieve the next set of
     *         results. If the previous paginated request returned all of the
     *         remaining results, this parameter is set to <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEcsClustersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEcsClusters() != null) sb.append("EcsClusters: " + getEcsClusters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEcsClusters() == null) ? 0 : getEcsClusters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEcsClustersResult == false) return false;
        DescribeEcsClustersResult other = (DescribeEcsClustersResult)obj;
        
        if (other.getEcsClusters() == null ^ this.getEcsClusters() == null) return false;
        if (other.getEcsClusters() != null && other.getEcsClusters().equals(this.getEcsClusters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeEcsClustersResult clone() {
        try {
            return (DescribeEcsClustersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    