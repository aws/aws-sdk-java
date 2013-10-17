/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusters(DescribeClustersRequest) DescribeClusters operation}.
 * <p>
 * Returns properties of provisioned clusters including general cluster properties, cluster database properties, maintenance and backup properties, and
 * security and access properties. This operation supports pagination. For more information about managing clusters, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
 * Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusters(DescribeClustersRequest)
 */
public class DescribeClustersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter isn't case sensitive. <p>The default is
     * that all clusters defined for an account are returned.
     */
    private String clusterIdentifier;

    /**
     * The maximum number of records that the response can include. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * <code>marker</code> is included in the response that can be used in a
     * new <b>DescribeClusters</b> request to continue listing results.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned by a previous <b>DescribeClusters</b>
     * request to indicate the first cluster that the current
     * <b>DescribeClusters</b> request will return. <p>You can specify either
     * a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <b>DescribeClusters</b> request, but not both.
     */
    private String marker;

    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter isn't case sensitive. <p>The default is
     * that all clusters defined for an account are returned.
     *
     * @return The unique identifier of a cluster whose properties you are
     *         requesting. This parameter isn't case sensitive. <p>The default is
     *         that all clusters defined for an account are returned.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter isn't case sensitive. <p>The default is
     * that all clusters defined for an account are returned.
     *
     * @param clusterIdentifier The unique identifier of a cluster whose properties you are
     *         requesting. This parameter isn't case sensitive. <p>The default is
     *         that all clusters defined for an account are returned.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of a cluster whose properties you are
     * requesting. This parameter isn't case sensitive. <p>The default is
     * that all clusters defined for an account are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of a cluster whose properties you are
     *         requesting. This parameter isn't case sensitive. <p>The default is
     *         that all clusters defined for an account are returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClustersRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The maximum number of records that the response can include. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * <code>marker</code> is included in the response that can be used in a
     * new <b>DescribeClusters</b> request to continue listing results.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     *
     * @return The maximum number of records that the response can include. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         <code>marker</code> is included in the response that can be used in a
     *         new <b>DescribeClusters</b> request to continue listing results.
     *         <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     *         and no more than 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records that the response can include. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * <code>marker</code> is included in the response that can be used in a
     * new <b>DescribeClusters</b> request to continue listing results.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     *
     * @param maxRecords The maximum number of records that the response can include. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         <code>marker</code> is included in the response that can be used in a
     *         new <b>DescribeClusters</b> request to continue listing results.
     *         <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     *         and no more than 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records that the response can include. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * <code>marker</code> is included in the response that can be used in a
     * new <b>DescribeClusters</b> request to continue listing results.
     * <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     * and no more than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records that the response can include. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         <code>marker</code> is included in the response that can be used in a
     *         new <b>DescribeClusters</b> request to continue listing results.
     *         <p>Default: <code>100</code> <p>Constraints: Value must be at least 20
     *         and no more than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClustersRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned by a previous <b>DescribeClusters</b>
     * request to indicate the first cluster that the current
     * <b>DescribeClusters</b> request will return. <p>You can specify either
     * a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <b>DescribeClusters</b> request, but not both.
     *
     * @return An optional marker returned by a previous <b>DescribeClusters</b>
     *         request to indicate the first cluster that the current
     *         <b>DescribeClusters</b> request will return. <p>You can specify either
     *         a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     *         <b>DescribeClusters</b> request, but not both.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned by a previous <b>DescribeClusters</b>
     * request to indicate the first cluster that the current
     * <b>DescribeClusters</b> request will return. <p>You can specify either
     * a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <b>DescribeClusters</b> request, but not both.
     *
     * @param marker An optional marker returned by a previous <b>DescribeClusters</b>
     *         request to indicate the first cluster that the current
     *         <b>DescribeClusters</b> request will return. <p>You can specify either
     *         a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     *         <b>DescribeClusters</b> request, but not both.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned by a previous <b>DescribeClusters</b>
     * request to indicate the first cluster that the current
     * <b>DescribeClusters</b> request will return. <p>You can specify either
     * a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     * <b>DescribeClusters</b> request, but not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned by a previous <b>DescribeClusters</b>
     *         request to indicate the first cluster that the current
     *         <b>DescribeClusters</b> request will return. <p>You can specify either
     *         a <b>Marker</b> parameter or a <b>ClusterIdentifier</b> parameter in a
     *         <b>DescribeClusters</b> request, but not both.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClustersRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClustersRequest == false) return false;
        DescribeClustersRequest other = (DescribeClustersRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    