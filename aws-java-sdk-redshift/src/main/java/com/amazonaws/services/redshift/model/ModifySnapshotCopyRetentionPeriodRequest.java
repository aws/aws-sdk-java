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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotCopyRetentionPeriod"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotCopyRetentionPeriodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for either automated or
     * manual snapshots that are copied to a destination AWS Region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the
     * source AWS Region.
     * </p>
     * <p>
     * By default, this only changes the retention period of copied automated snapshots.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon
     * Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     * </p>
     * <p>
     * If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new retention
     * period.
     * </p>
     * <p>
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     * </p>
     * <p>
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated
     * snapshots.
     * </p>
     */
    private Boolean manual;

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for either automated or
     * manual snapshots that are copied to a destination AWS Region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which you want to change the retention period for either
     *        automated or manual snapshots that are copied to a destination AWS Region.</p>
     *        <p>
     *        Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for either automated or
     * manual snapshots that are copied to a destination AWS Region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     * 
     * @return The unique identifier of the cluster for which you want to change the retention period for either
     *         automated or manual snapshots that are copied to a destination AWS Region.</p>
     *         <p>
     *         Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster for which you want to change the retention period for either automated or
     * manual snapshots that are copied to a destination AWS Region.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster for which you want to change the retention period for either
     *        automated or manual snapshots that are copied to a destination AWS Region.</p>
     *        <p>
     *        Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotCopyRetentionPeriodRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the
     * source AWS Region.
     * </p>
     * <p>
     * By default, this only changes the retention period of copied automated snapshots.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon
     * Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     * </p>
     * <p>
     * If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new retention
     * period.
     * </p>
     * <p>
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     * </p>
     * <p>
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days to retain automated snapshots in the destination AWS Region after they are copied from
     *        the source AWS Region.</p>
     *        <p>
     *        By default, this only changes the retention period of copied automated snapshots.
     *        </p>
     *        <p>
     *        If you decrease the retention period for automated snapshots that are copied to a destination AWS Region,
     *        Amazon Redshift deletes any existing automated snapshots that were copied to the destination AWS Region
     *        and that fall outside of the new retention period.
     *        </p>
     *        <p>
     *        Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *        </p>
     *        <p>
     *        If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new
     *        retention period.
     *        </p>
     *        <p>
     *        If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *        </p>
     *        <p>
     *        Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the
     * source AWS Region.
     * </p>
     * <p>
     * By default, this only changes the retention period of copied automated snapshots.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon
     * Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     * </p>
     * <p>
     * If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new retention
     * period.
     * </p>
     * <p>
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     * </p>
     * <p>
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     * </p>
     * 
     * @return The number of days to retain automated snapshots in the destination AWS Region after they are copied from
     *         the source AWS Region.</p>
     *         <p>
     *         By default, this only changes the retention period of copied automated snapshots.
     *         </p>
     *         <p>
     *         If you decrease the retention period for automated snapshots that are copied to a destination AWS Region,
     *         Amazon Redshift deletes any existing automated snapshots that were copied to the destination AWS Region
     *         and that fall outside of the new retention period.
     *         </p>
     *         <p>
     *         Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *         </p>
     *         <p>
     *         If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new
     *         retention period.
     *         </p>
     *         <p>
     *         If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *         </p>
     *         <p>
     *         Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the
     * source AWS Region.
     * </p>
     * <p>
     * By default, this only changes the retention period of copied automated snapshots.
     * </p>
     * <p>
     * If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon
     * Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall
     * outside of the new retention period.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     * </p>
     * <p>
     * If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new retention
     * period.
     * </p>
     * <p>
     * If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     * </p>
     * <p>
     * Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days to retain automated snapshots in the destination AWS Region after they are copied from
     *        the source AWS Region.</p>
     *        <p>
     *        By default, this only changes the retention period of copied automated snapshots.
     *        </p>
     *        <p>
     *        If you decrease the retention period for automated snapshots that are copied to a destination AWS Region,
     *        Amazon Redshift deletes any existing automated snapshots that were copied to the destination AWS Region
     *        and that fall outside of the new retention period.
     *        </p>
     *        <p>
     *        Constraints: Must be at least 1 and no more than 35 for automated snapshots.
     *        </p>
     *        <p>
     *        If you specify the <code>manual</code> option, only newly copied manual snapshots will have the new
     *        retention period.
     *        </p>
     *        <p>
     *        If you specify the value of -1 newly copied manual snapshots are retained indefinitely.
     *        </p>
     *        <p>
     *        Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotCopyRetentionPeriodRequest withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated
     * snapshots.
     * </p>
     * 
     * @param manual
     *        Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of
     *        automated snapshots.
     */

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    /**
     * <p>
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated
     * snapshots.
     * </p>
     * 
     * @return Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of
     *         automated snapshots.
     */

    public Boolean getManual() {
        return this.manual;
    }

    /**
     * <p>
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated
     * snapshots.
     * </p>
     * 
     * @param manual
     *        Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of
     *        automated snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotCopyRetentionPeriodRequest withManual(Boolean manual) {
        setManual(manual);
        return this;
    }

    /**
     * <p>
     * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated
     * snapshots.
     * </p>
     * 
     * @return Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of
     *         automated snapshots.
     */

    public Boolean isManual() {
        return this.manual;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getManual() != null)
            sb.append("Manual: ").append(getManual());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotCopyRetentionPeriodRequest == false)
            return false;
        ModifySnapshotCopyRetentionPeriodRequest other = (ModifySnapshotCopyRetentionPeriodRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getManual() == null ^ this.getManual() == null)
            return false;
        if (other.getManual() != null && other.getManual().equals(this.getManual()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getManual() == null) ? 0 : getManual().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotCopyRetentionPeriodRequest clone() {
        return (ModifySnapshotCopyRetentionPeriodRequest) super.clone();
    }

}
