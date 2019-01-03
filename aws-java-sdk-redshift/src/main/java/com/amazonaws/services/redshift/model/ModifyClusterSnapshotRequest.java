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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately
     * delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     */
    private Integer manualSnapshotRetentionPeriod;
    /**
     * <p>
     * A Boolean option to override an exception if the retention period has already passed.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot whose setting you want to modify.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     * 
     * @return The identifier of the snapshot whose setting you want to modify.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the snapshot whose setting you want to modify.
     * </p>
     * 
     * @param snapshotIdentifier
     *        The identifier of the snapshot whose setting you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately
     * delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely.</p>
     *        <p>
     *        If the manual snapshot falls outside of the new retention period, you can specify the force option to
     *        immediately delete the snapshot.
     *        </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     */

    public void setManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        this.manualSnapshotRetentionPeriod = manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately
     * delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @return The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is
     *         retained indefinitely.</p>
     *         <p>
     *         If the manual snapshot falls outside of the new retention period, you can specify the force option to
     *         immediately delete the snapshot.
     *         </p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     */

    public Integer getManualSnapshotRetentionPeriod() {
        return this.manualSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * If the manual snapshot falls outside of the new retention period, you can specify the force option to immediately
     * delete the snapshot.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * 
     * @param manualSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely.</p>
     *        <p>
     *        If the manual snapshot falls outside of the new retention period, you can specify the force option to
     *        immediately delete the snapshot.
     *        </p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSnapshotRequest withManualSnapshotRetentionPeriod(Integer manualSnapshotRetentionPeriod) {
        setManualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has already passed.
     * </p>
     * 
     * @param force
     *        A Boolean option to override an exception if the retention period has already passed.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has already passed.
     * </p>
     * 
     * @return A Boolean option to override an exception if the retention period has already passed.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has already passed.
     * </p>
     * 
     * @param force
     *        A Boolean option to override an exception if the retention period has already passed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterSnapshotRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * A Boolean option to override an exception if the retention period has already passed.
     * </p>
     * 
     * @return A Boolean option to override an exception if the retention period has already passed.
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
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

        if (obj instanceof ModifyClusterSnapshotRequest == false)
            return false;
        ModifyClusterSnapshotRequest other = (ModifyClusterSnapshotRequest) obj;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManualSnapshotRetentionPeriod() == null) ? 0 : getManualSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterSnapshotRequest clone() {
        return (ModifyClusterSnapshotRequest) super.clone();
    }

}
