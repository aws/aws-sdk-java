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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/BatchModifyClusterSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchModifyClusterSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotIdentifierList;
    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is
     * retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall
     * outside of the new retention period will return an error. If you want to suppress the errors and delete the
     * snapshots, use the force option.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * A boolean value indicating whether to override an exception if the retention period has passed.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     * 
     * @return A list of snapshot identifiers you want to modify.
     */

    public java.util.List<String> getSnapshotIdentifierList() {
        if (snapshotIdentifierList == null) {
            snapshotIdentifierList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotIdentifierList;
    }

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     * 
     * @param snapshotIdentifierList
     *        A list of snapshot identifiers you want to modify.
     */

    public void setSnapshotIdentifierList(java.util.Collection<String> snapshotIdentifierList) {
        if (snapshotIdentifierList == null) {
            this.snapshotIdentifierList = null;
            return;
        }

        this.snapshotIdentifierList = new com.amazonaws.internal.SdkInternalList<String>(snapshotIdentifierList);
    }

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotIdentifierList(java.util.Collection)} or
     * {@link #withSnapshotIdentifierList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param snapshotIdentifierList
     *        A list of snapshot identifiers you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchModifyClusterSnapshotsRequest withSnapshotIdentifierList(String... snapshotIdentifierList) {
        if (this.snapshotIdentifierList == null) {
            setSnapshotIdentifierList(new com.amazonaws.internal.SdkInternalList<String>(snapshotIdentifierList.length));
        }
        for (String ele : snapshotIdentifierList) {
            this.snapshotIdentifierList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of snapshot identifiers you want to modify.
     * </p>
     * 
     * @param snapshotIdentifierList
     *        A list of snapshot identifiers you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchModifyClusterSnapshotsRequest withSnapshotIdentifierList(java.util.Collection<String> snapshotIdentifierList) {
        setSnapshotIdentifierList(snapshotIdentifierList);
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is
     * retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall
     * outside of the new retention period will return an error. If you want to suppress the errors and delete the
     * snapshots, use the force option.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is
     *        retained indefinitely.</p>
     *        <p>
     *        The number must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        If you decrease the manual snapshot retention period from its current value, existing manual snapshots
     *        that fall outside of the new retention period will return an error. If you want to suppress the errors and
     *        delete the snapshots, use the force option.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is
     * retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall
     * outside of the new retention period will return an error. If you want to suppress the errors and delete the
     * snapshots, use the force option.
     * </p>
     * 
     * @return The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot
     *         is retained indefinitely.</p>
     *         <p>
     *         The number must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         If you decrease the manual snapshot retention period from its current value, existing manual snapshots
     *         that fall outside of the new retention period will return an error. If you want to suppress the errors
     *         and delete the snapshots, use the force option.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is
     * retained indefinitely.
     * </p>
     * <p>
     * The number must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * If you decrease the manual snapshot retention period from its current value, existing manual snapshots that fall
     * outside of the new retention period will return an error. If you want to suppress the errors and delete the
     * snapshots, use the force option.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If you specify the value -1, the manual snapshot is
     *        retained indefinitely.</p>
     *        <p>
     *        The number must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        If you decrease the manual snapshot retention period from its current value, existing manual snapshots
     *        that fall outside of the new retention period will return an error. If you want to suppress the errors and
     *        delete the snapshots, use the force option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchModifyClusterSnapshotsRequest withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the retention period has passed.
     * </p>
     * 
     * @param force
     *        A boolean value indicating whether to override an exception if the retention period has passed.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the retention period has passed.
     * </p>
     * 
     * @return A boolean value indicating whether to override an exception if the retention period has passed.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the retention period has passed.
     * </p>
     * 
     * @param force
     *        A boolean value indicating whether to override an exception if the retention period has passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchModifyClusterSnapshotsRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether to override an exception if the retention period has passed.
     * </p>
     * 
     * @return A boolean value indicating whether to override an exception if the retention period has passed.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getSnapshotIdentifierList() != null)
            sb.append("SnapshotIdentifierList: ").append(getSnapshotIdentifierList()).append(",");
        if (getManualSnapshotRetentionPeriod() != null)
            sb.append("ManualSnapshotRetentionPeriod: ").append(getManualSnapshotRetentionPeriod()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchModifyClusterSnapshotsRequest == false)
            return false;
        BatchModifyClusterSnapshotsRequest other = (BatchModifyClusterSnapshotsRequest) obj;
        if (other.getSnapshotIdentifierList() == null ^ this.getSnapshotIdentifierList() == null)
            return false;
        if (other.getSnapshotIdentifierList() != null && other.getSnapshotIdentifierList().equals(this.getSnapshotIdentifierList()) == false)
            return false;
        if (other.getManualSnapshotRetentionPeriod() == null ^ this.getManualSnapshotRetentionPeriod() == null)
            return false;
        if (other.getManualSnapshotRetentionPeriod() != null
                && other.getManualSnapshotRetentionPeriod().equals(this.getManualSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotIdentifierList() == null) ? 0 : getSnapshotIdentifierList().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public BatchModifyClusterSnapshotsRequest clone() {
        return (BatchModifyClusterSnapshotsRequest) super.clone();
    }

}
