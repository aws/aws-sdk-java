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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#describeClusters(DescribeClustersRequest) DescribeClusters operation}.
 * <p>
 * Describes one or more of your clusters.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#describeClusters(DescribeClustersRequest)
 */
public class DescribeClustersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A space-separated list of cluster names or full cluster Amazon
     * Resource Name (ARN) entries. If you do not specify a cluster, the
     * default cluster is assumed.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> clusters;

    /**
     * A space-separated list of cluster names or full cluster Amazon
     * Resource Name (ARN) entries. If you do not specify a cluster, the
     * default cluster is assumed.
     *
     * @return A space-separated list of cluster names or full cluster Amazon
     *         Resource Name (ARN) entries. If you do not specify a cluster, the
     *         default cluster is assumed.
     */
    public java.util.List<String> getClusters() {
        if (clusters == null) {
              clusters = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              clusters.setAutoConstruct(true);
        }
        return clusters;
    }
    
    /**
     * A space-separated list of cluster names or full cluster Amazon
     * Resource Name (ARN) entries. If you do not specify a cluster, the
     * default cluster is assumed.
     *
     * @param clusters A space-separated list of cluster names or full cluster Amazon
     *         Resource Name (ARN) entries. If you do not specify a cluster, the
     *         default cluster is assumed.
     */
    public void setClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> clustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusters.size());
        clustersCopy.addAll(clusters);
        this.clusters = clustersCopy;
    }
    
    /**
     * A space-separated list of cluster names or full cluster Amazon
     * Resource Name (ARN) entries. If you do not specify a cluster, the
     * default cluster is assumed.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setClusters(java.util.Collection)} or {@link
     * #withClusters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusters A space-separated list of cluster names or full cluster Amazon
     *         Resource Name (ARN) entries. If you do not specify a cluster, the
     *         default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withClusters(String... clusters) {
        if (getClusters() == null) setClusters(new java.util.ArrayList<String>(clusters.length));
        for (String value : clusters) {
            getClusters().add(value);
        }
        return this;
    }
    
    /**
     * A space-separated list of cluster names or full cluster Amazon
     * Resource Name (ARN) entries. If you do not specify a cluster, the
     * default cluster is assumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusters A space-separated list of cluster names or full cluster Amazon
     *         Resource Name (ARN) entries. If you do not specify a cluster, the
     *         default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersRequest withClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> clustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(clusters.size());
            clustersCopy.addAll(clusters);
            this.clusters = clustersCopy;
        }

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
        if (getClusters() != null) sb.append("Clusters: " + getClusters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClustersRequest == false) return false;
        DescribeClustersRequest other = (DescribeClustersRequest)obj;
        
        if (other.getClusters() == null ^ this.getClusters() == null) return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeClustersRequest clone() {
        
            return (DescribeClustersRequest) super.clone();
    }

}
    