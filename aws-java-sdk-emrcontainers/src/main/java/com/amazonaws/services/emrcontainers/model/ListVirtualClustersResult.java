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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListVirtualClusters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualClustersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output lists the specified virtual clusters.
     * </p>
     */
    private java.util.List<VirtualCluster> virtualClusters;
    /**
     * <p>
     * This output displays the token for the next set of virtual clusters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This output lists the specified virtual clusters.
     * </p>
     * 
     * @return This output lists the specified virtual clusters.
     */

    public java.util.List<VirtualCluster> getVirtualClusters() {
        return virtualClusters;
    }

    /**
     * <p>
     * This output lists the specified virtual clusters.
     * </p>
     * 
     * @param virtualClusters
     *        This output lists the specified virtual clusters.
     */

    public void setVirtualClusters(java.util.Collection<VirtualCluster> virtualClusters) {
        if (virtualClusters == null) {
            this.virtualClusters = null;
            return;
        }

        this.virtualClusters = new java.util.ArrayList<VirtualCluster>(virtualClusters);
    }

    /**
     * <p>
     * This output lists the specified virtual clusters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualClusters(java.util.Collection)} or {@link #withVirtualClusters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param virtualClusters
     *        This output lists the specified virtual clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersResult withVirtualClusters(VirtualCluster... virtualClusters) {
        if (this.virtualClusters == null) {
            setVirtualClusters(new java.util.ArrayList<VirtualCluster>(virtualClusters.length));
        }
        for (VirtualCluster ele : virtualClusters) {
            this.virtualClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This output lists the specified virtual clusters.
     * </p>
     * 
     * @param virtualClusters
     *        This output lists the specified virtual clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersResult withVirtualClusters(java.util.Collection<VirtualCluster> virtualClusters) {
        setVirtualClusters(virtualClusters);
        return this;
    }

    /**
     * <p>
     * This output displays the token for the next set of virtual clusters.
     * </p>
     * 
     * @param nextToken
     *        This output displays the token for the next set of virtual clusters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This output displays the token for the next set of virtual clusters.
     * </p>
     * 
     * @return This output displays the token for the next set of virtual clusters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This output displays the token for the next set of virtual clusters.
     * </p>
     * 
     * @param nextToken
     *        This output displays the token for the next set of virtual clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersResult withNextToken(String nextToken) {
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
        if (getVirtualClusters() != null)
            sb.append("VirtualClusters: ").append(getVirtualClusters()).append(",");
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

        if (obj instanceof ListVirtualClustersResult == false)
            return false;
        ListVirtualClustersResult other = (ListVirtualClustersResult) obj;
        if (other.getVirtualClusters() == null ^ this.getVirtualClusters() == null)
            return false;
        if (other.getVirtualClusters() != null && other.getVirtualClusters().equals(this.getVirtualClusters()) == false)
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

        hashCode = prime * hashCode + ((getVirtualClusters() == null) ? 0 : getVirtualClusters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualClustersResult clone() {
        try {
            return (ListVirtualClustersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
