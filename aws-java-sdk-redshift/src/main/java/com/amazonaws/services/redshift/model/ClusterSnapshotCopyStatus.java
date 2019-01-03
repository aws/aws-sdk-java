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

/**
 * <p>
 * Returns the destination region and retention period that are configured for cross-region snapshot copy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterSnapshotCopyStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterSnapshotCopyStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region.
     * </p>
     */
    private Long retentionPeriod;
    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region. If the value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     */
    private String snapshotCopyGrantName;

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
     * </p>
     * 
     * @param destinationRegion
     *        The destination region that snapshots are automatically copied to when cross-region snapshot copy is
     *        enabled.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
     * </p>
     * 
     * @return The destination region that snapshots are automatically copied to when cross-region snapshot copy is
     *         enabled.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
     * </p>
     * 
     * @param destinationRegion
     *        The destination region that snapshots are automatically copied to when cross-region snapshot copy is
     *        enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshotCopyStatus withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days that automated snapshots are retained in the destination region after they are copied
     *        from a source region.
     */

    public void setRetentionPeriod(Long retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region.
     * </p>
     * 
     * @return The number of days that automated snapshots are retained in the destination region after they are copied
     *         from a source region.
     */

    public Long getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days that automated snapshots are retained in the destination region after they are copied
     *        from a source region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshotCopyStatus withRetentionPeriod(Long retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region. If the value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that automated snapshots are retained in the destination region after they are copied
     *        from a source region. If the value is -1, the manual snapshot is retained indefinitely. </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region. If the value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @return The number of days that automated snapshots are retained in the destination region after they are copied
     *         from a source region. If the value is -1, the manual snapshot is retained indefinitely. </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that automated snapshots are retained in the destination region after they are copied from a
     * source region. If the value is -1, the manual snapshot is retained indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that automated snapshots are retained in the destination region after they are copied
     *        from a source region. If the value is -1, the manual snapshot is retained indefinitely. </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshotCopyStatus withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant.
     */

    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * 
     * @return The name of the snapshot copy grant.
     */

    public String getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterSnapshotCopyStatus withSnapshotCopyGrantName(String snapshotCopyGrantName) {
        setSnapshotCopyGrantName(snapshotCopyGrantName);
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
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: ").append(getSnapshotCopyGrantName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterSnapshotCopyStatus == false)
            return false;
        ClusterSnapshotCopyStatus other = (ClusterSnapshotCopyStatus) obj;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotCopyGrantName() == null ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null && other.getSnapshotCopyGrantName().equals(this.getSnapshotCopyGrantName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCopyGrantName() == null) ? 0 : getSnapshotCopyGrantName().hashCode());
        return hashCode;
    }

    @Override
    public ClusterSnapshotCopyStatus clone() {
        try {
            return (ClusterSnapshotCopyStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
