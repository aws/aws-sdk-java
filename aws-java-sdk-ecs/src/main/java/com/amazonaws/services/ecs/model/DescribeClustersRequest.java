/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do
     * not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> clusters;

    /**
     * <p>
     * A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do
     * not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If
     *         you do not specify a cluster, the default cluster is assumed.
     */

    public java.util.List<String> getClusters() {
        if (clusters == null) {
            clusters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return clusters;
    }

    /**
     * <p>
     * A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do
     * not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param clusters
     *        A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If
     *        you do not specify a cluster, the default cluster is assumed.
     */

    public void setClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new com.amazonaws.internal.SdkInternalList<String>(clusters);
    }

    /**
     * <p>
     * A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do
     * not specify a cluster, the default cluster is assumed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If
     *        you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusters(String... clusters) {
        if (this.clusters == null) {
            setClusters(new com.amazonaws.internal.SdkInternalList<String>(clusters.length));
        }
        for (String ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If you do
     * not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param clusters
     *        A space-separated list of up to 100 cluster names or full cluster Amazon Resource Name (ARN) entries. If
     *        you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusters(java.util.Collection<String> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusters() != null)
            sb.append("Clusters: " + getClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClustersRequest == false)
            return false;
        DescribeClustersRequest other = (DescribeClustersRequest) obj;
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClustersRequest clone() {
        return (DescribeClustersRequest) super.clone();
    }
}
