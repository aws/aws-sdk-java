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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#enableSnapshotCopy(EnableSnapshotCopyRequest) EnableSnapshotCopy operation}.
 * <p>
 * Enables the automatic copy of snapshots from one region to another region for a specified cluster.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#enableSnapshotCopy(EnableSnapshotCopyRequest)
 */
public class EnableSnapshotCopyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of the source cluster to copy snapshots from.
     * <p> Constraints: Must be the valid name of an existing cluster that
     * does not already have cross-region snapshot copy enabled.
     */
    private String clusterIdentifier;

    /**
     * The destination region that you want to copy snapshots to. <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     */
    private String destinationRegion;

    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> Default: 7.
     * <p> Constraints: Must be at least 1 and no more than 35.
     */
    private Integer retentionPeriod;

    /**
     * The unique identifier of the source cluster to copy snapshots from.
     * <p> Constraints: Must be the valid name of an existing cluster that
     * does not already have cross-region snapshot copy enabled.
     *
     * @return The unique identifier of the source cluster to copy snapshots from.
     *         <p> Constraints: Must be the valid name of an existing cluster that
     *         does not already have cross-region snapshot copy enabled.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of the source cluster to copy snapshots from.
     * <p> Constraints: Must be the valid name of an existing cluster that
     * does not already have cross-region snapshot copy enabled.
     *
     * @param clusterIdentifier The unique identifier of the source cluster to copy snapshots from.
     *         <p> Constraints: Must be the valid name of an existing cluster that
     *         does not already have cross-region snapshot copy enabled.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of the source cluster to copy snapshots from.
     * <p> Constraints: Must be the valid name of an existing cluster that
     * does not already have cross-region snapshot copy enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of the source cluster to copy snapshots from.
     *         <p> Constraints: Must be the valid name of an existing cluster that
     *         does not already have cross-region snapshot copy enabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableSnapshotCopyRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The destination region that you want to copy snapshots to. <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     *
     * @return The destination region that you want to copy snapshots to. <p>
     *         Constraints: Must be the name of a valid region. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     *         and Endpoints</a> in the Amazon Web Services General Reference.
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }
    
    /**
     * The destination region that you want to copy snapshots to. <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     *
     * @param destinationRegion The destination region that you want to copy snapshots to. <p>
     *         Constraints: Must be the name of a valid region. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     *         and Endpoints</a> in the Amazon Web Services General Reference.
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }
    
    /**
     * The destination region that you want to copy snapshots to. <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     * and Endpoints</a> in the Amazon Web Services General Reference.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationRegion The destination region that you want to copy snapshots to. <p>
     *         Constraints: Must be the name of a valid region. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region">Regions
     *         and Endpoints</a> in the Amazon Web Services General Reference.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableSnapshotCopyRequest withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> Default: 7.
     * <p> Constraints: Must be at least 1 and no more than 35.
     *
     * @return The number of days to retain automated snapshots in the destination
     *         region after they are copied from the source region. <p> Default: 7.
     *         <p> Constraints: Must be at least 1 and no more than 35.
     */
    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }
    
    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> Default: 7.
     * <p> Constraints: Must be at least 1 and no more than 35.
     *
     * @param retentionPeriod The number of days to retain automated snapshots in the destination
     *         region after they are copied from the source region. <p> Default: 7.
     *         <p> Constraints: Must be at least 1 and no more than 35.
     */
    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }
    
    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> Default: 7.
     * <p> Constraints: Must be at least 1 and no more than 35.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retentionPeriod The number of days to retain automated snapshots in the destination
     *         region after they are copied from the source region. <p> Default: 7.
     *         <p> Constraints: Must be at least 1 and no more than 35.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EnableSnapshotCopyRequest withRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
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
        if (getDestinationRegion() != null) sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getRetentionPeriod() != null) sb.append("RetentionPeriod: " + getRetentionPeriod() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode()); 
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableSnapshotCopyRequest == false) return false;
        EnableSnapshotCopyRequest other = (EnableSnapshotCopyRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null) return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false) return false; 
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null) return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false) return false; 
        return true;
    }
    
}
    