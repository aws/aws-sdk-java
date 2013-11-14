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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest) ModifySnapshotCopyRetentionPeriod operation}.
 * <p>
 * Modifies the number of days to retain automated snapshots in the destination region after they are copied from the source region.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#modifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest)
 */
public class ModifySnapshotCopyRetentionPeriodRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of the cluster for which you want to change the
     * retention period for automated snapshots that are copied to a
     * destination region. <p> Constraints: Must be the valid name of an
     * existing cluster that has cross-region snapshot copy enabled.
     */
    private String clusterIdentifier;

    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> If you
     * decrease the retention period for automated snapshots that are copied
     * to a destination region, Amazon Redshift will delete any existing
     * automated snapshots that were copied to the destination region and
     * that fall outside of the new retention period. <p> Constraints: Must
     * be at least 1 and no more than 35.
     */
    private Integer retentionPeriod;

    /**
     * The unique identifier of the cluster for which you want to change the
     * retention period for automated snapshots that are copied to a
     * destination region. <p> Constraints: Must be the valid name of an
     * existing cluster that has cross-region snapshot copy enabled.
     *
     * @return The unique identifier of the cluster for which you want to change the
     *         retention period for automated snapshots that are copied to a
     *         destination region. <p> Constraints: Must be the valid name of an
     *         existing cluster that has cross-region snapshot copy enabled.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster for which you want to change the
     * retention period for automated snapshots that are copied to a
     * destination region. <p> Constraints: Must be the valid name of an
     * existing cluster that has cross-region snapshot copy enabled.
     *
     * @param clusterIdentifier The unique identifier of the cluster for which you want to change the
     *         retention period for automated snapshots that are copied to a
     *         destination region. <p> Constraints: Must be the valid name of an
     *         existing cluster that has cross-region snapshot copy enabled.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The unique identifier of the cluster for which you want to change the
     * retention period for automated snapshots that are copied to a
     * destination region. <p> Constraints: Must be the valid name of an
     * existing cluster that has cross-region snapshot copy enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The unique identifier of the cluster for which you want to change the
     *         retention period for automated snapshots that are copied to a
     *         destination region. <p> Constraints: Must be the valid name of an
     *         existing cluster that has cross-region snapshot copy enabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifySnapshotCopyRetentionPeriodRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> If you
     * decrease the retention period for automated snapshots that are copied
     * to a destination region, Amazon Redshift will delete any existing
     * automated snapshots that were copied to the destination region and
     * that fall outside of the new retention period. <p> Constraints: Must
     * be at least 1 and no more than 35.
     *
     * @return The number of days to retain automated snapshots in the destination
     *         region after they are copied from the source region. <p> If you
     *         decrease the retention period for automated snapshots that are copied
     *         to a destination region, Amazon Redshift will delete any existing
     *         automated snapshots that were copied to the destination region and
     *         that fall outside of the new retention period. <p> Constraints: Must
     *         be at least 1 and no more than 35.
     */
    public Integer getRetentionPeriod() {
        return retentionPeriod;
    }
    
    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> If you
     * decrease the retention period for automated snapshots that are copied
     * to a destination region, Amazon Redshift will delete any existing
     * automated snapshots that were copied to the destination region and
     * that fall outside of the new retention period. <p> Constraints: Must
     * be at least 1 and no more than 35.
     *
     * @param retentionPeriod The number of days to retain automated snapshots in the destination
     *         region after they are copied from the source region. <p> If you
     *         decrease the retention period for automated snapshots that are copied
     *         to a destination region, Amazon Redshift will delete any existing
     *         automated snapshots that were copied to the destination region and
     *         that fall outside of the new retention period. <p> Constraints: Must
     *         be at least 1 and no more than 35.
     */
    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }
    
    /**
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region. <p> If you
     * decrease the retention period for automated snapshots that are copied
     * to a destination region, Amazon Redshift will delete any existing
     * automated snapshots that were copied to the destination region and
     * that fall outside of the new retention period. <p> Constraints: Must
     * be at least 1 and no more than 35.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retentionPeriod The number of days to retain automated snapshots in the destination
     *         region after they are copied from the source region. <p> If you
     *         decrease the retention period for automated snapshots that are copied
     *         to a destination region, Amazon Redshift will delete any existing
     *         automated snapshots that were copied to the destination region and
     *         that fall outside of the new retention period. <p> Constraints: Must
     *         be at least 1 and no more than 35.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifySnapshotCopyRetentionPeriodRequest withRetentionPeriod(Integer retentionPeriod) {
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
        if (getRetentionPeriod() != null) sb.append("RetentionPeriod: " + getRetentionPeriod() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifySnapshotCopyRetentionPeriodRequest == false) return false;
        ModifySnapshotCopyRetentionPeriodRequest other = (ModifySnapshotCopyRetentionPeriodRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null) return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false) return false; 
        return true;
    }
    
}
    