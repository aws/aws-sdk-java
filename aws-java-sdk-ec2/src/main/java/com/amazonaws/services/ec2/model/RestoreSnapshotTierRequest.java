/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RestoreSnapshotTierRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreSnapshotTierRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RestoreSnapshotTierRequest> {

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary
     * restores only. The snapshot will be automatically re-archived after this period.
     * </p>
     * <p>
     * To temporarily restore an archived snapshot, specify the number of days and omit the <b>PermanentRestore</b>
     * parameter or set it to <code>false</code>.
     * </p>
     */
    private Integer temporaryRestoreDays;
    /**
     * <p>
     * Indicates whether to permanently restore an archived snapshot. To permanently restore an archived snapshot,
     * specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b> parameter.
     * </p>
     */
    private Boolean permanentRestore;

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot to restore.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     * 
     * @return The ID of the snapshot to restore.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot to restore.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot to restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotTierRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary
     * restores only. The snapshot will be automatically re-archived after this period.
     * </p>
     * <p>
     * To temporarily restore an archived snapshot, specify the number of days and omit the <b>PermanentRestore</b>
     * parameter or set it to <code>false</code>.
     * </p>
     * 
     * @param temporaryRestoreDays
     *        Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary
     *        restores only. The snapshot will be automatically re-archived after this period.</p>
     *        <p>
     *        To temporarily restore an archived snapshot, specify the number of days and omit the
     *        <b>PermanentRestore</b> parameter or set it to <code>false</code>.
     */

    public void setTemporaryRestoreDays(Integer temporaryRestoreDays) {
        this.temporaryRestoreDays = temporaryRestoreDays;
    }

    /**
     * <p>
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary
     * restores only. The snapshot will be automatically re-archived after this period.
     * </p>
     * <p>
     * To temporarily restore an archived snapshot, specify the number of days and omit the <b>PermanentRestore</b>
     * parameter or set it to <code>false</code>.
     * </p>
     * 
     * @return Specifies the number of days for which to temporarily restore an archived snapshot. Required for
     *         temporary restores only. The snapshot will be automatically re-archived after this period.</p>
     *         <p>
     *         To temporarily restore an archived snapshot, specify the number of days and omit the
     *         <b>PermanentRestore</b> parameter or set it to <code>false</code>.
     */

    public Integer getTemporaryRestoreDays() {
        return this.temporaryRestoreDays;
    }

    /**
     * <p>
     * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary
     * restores only. The snapshot will be automatically re-archived after this period.
     * </p>
     * <p>
     * To temporarily restore an archived snapshot, specify the number of days and omit the <b>PermanentRestore</b>
     * parameter or set it to <code>false</code>.
     * </p>
     * 
     * @param temporaryRestoreDays
     *        Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary
     *        restores only. The snapshot will be automatically re-archived after this period.</p>
     *        <p>
     *        To temporarily restore an archived snapshot, specify the number of days and omit the
     *        <b>PermanentRestore</b> parameter or set it to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotTierRequest withTemporaryRestoreDays(Integer temporaryRestoreDays) {
        setTemporaryRestoreDays(temporaryRestoreDays);
        return this;
    }

    /**
     * <p>
     * Indicates whether to permanently restore an archived snapshot. To permanently restore an archived snapshot,
     * specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b> parameter.
     * </p>
     * 
     * @param permanentRestore
     *        Indicates whether to permanently restore an archived snapshot. To permanently restore an archived
     *        snapshot, specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b>
     *        parameter.
     */

    public void setPermanentRestore(Boolean permanentRestore) {
        this.permanentRestore = permanentRestore;
    }

    /**
     * <p>
     * Indicates whether to permanently restore an archived snapshot. To permanently restore an archived snapshot,
     * specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b> parameter.
     * </p>
     * 
     * @return Indicates whether to permanently restore an archived snapshot. To permanently restore an archived
     *         snapshot, specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b>
     *         parameter.
     */

    public Boolean getPermanentRestore() {
        return this.permanentRestore;
    }

    /**
     * <p>
     * Indicates whether to permanently restore an archived snapshot. To permanently restore an archived snapshot,
     * specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b> parameter.
     * </p>
     * 
     * @param permanentRestore
     *        Indicates whether to permanently restore an archived snapshot. To permanently restore an archived
     *        snapshot, specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b>
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreSnapshotTierRequest withPermanentRestore(Boolean permanentRestore) {
        setPermanentRestore(permanentRestore);
        return this;
    }

    /**
     * <p>
     * Indicates whether to permanently restore an archived snapshot. To permanently restore an archived snapshot,
     * specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b> parameter.
     * </p>
     * 
     * @return Indicates whether to permanently restore an archived snapshot. To permanently restore an archived
     *         snapshot, specify <code>true</code> and omit the <b>RestoreSnapshotTierRequest$TemporaryRestoreDays</b>
     *         parameter.
     */

    public Boolean isPermanentRestore() {
        return this.permanentRestore;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RestoreSnapshotTierRequest> getDryRunRequest() {
        Request<RestoreSnapshotTierRequest> request = new RestoreSnapshotTierRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getTemporaryRestoreDays() != null)
            sb.append("TemporaryRestoreDays: ").append(getTemporaryRestoreDays()).append(",");
        if (getPermanentRestore() != null)
            sb.append("PermanentRestore: ").append(getPermanentRestore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreSnapshotTierRequest == false)
            return false;
        RestoreSnapshotTierRequest other = (RestoreSnapshotTierRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getTemporaryRestoreDays() == null ^ this.getTemporaryRestoreDays() == null)
            return false;
        if (other.getTemporaryRestoreDays() != null && other.getTemporaryRestoreDays().equals(this.getTemporaryRestoreDays()) == false)
            return false;
        if (other.getPermanentRestore() == null ^ this.getPermanentRestore() == null)
            return false;
        if (other.getPermanentRestore() != null && other.getPermanentRestore().equals(this.getPermanentRestore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getTemporaryRestoreDays() == null) ? 0 : getTemporaryRestoreDays().hashCode());
        hashCode = prime * hashCode + ((getPermanentRestore() == null) ? 0 : getPermanentRestore().hashCode());
        return hashCode;
    }

    @Override
    public RestoreSnapshotTierRequest clone() {
        return (RestoreSnapshotTierRequest) super.clone();
    }
}
