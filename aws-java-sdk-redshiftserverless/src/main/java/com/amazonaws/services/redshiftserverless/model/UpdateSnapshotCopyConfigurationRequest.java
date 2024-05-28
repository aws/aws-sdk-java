/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshotCopyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSnapshotCopyConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the snapshot copy configuration to update.
     * </p>
     */
    private String snapshotCopyConfigurationId;
    /**
     * <p>
     * The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     * </p>
     */
    private Integer snapshotRetentionPeriod;

    /**
     * <p>
     * The ID of the snapshot copy configuration to update.
     * </p>
     * 
     * @param snapshotCopyConfigurationId
     *        The ID of the snapshot copy configuration to update.
     */

    public void setSnapshotCopyConfigurationId(String snapshotCopyConfigurationId) {
        this.snapshotCopyConfigurationId = snapshotCopyConfigurationId;
    }

    /**
     * <p>
     * The ID of the snapshot copy configuration to update.
     * </p>
     * 
     * @return The ID of the snapshot copy configuration to update.
     */

    public String getSnapshotCopyConfigurationId() {
        return this.snapshotCopyConfigurationId;
    }

    /**
     * <p>
     * The ID of the snapshot copy configuration to update.
     * </p>
     * 
     * @param snapshotCopyConfigurationId
     *        The ID of the snapshot copy configuration to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotCopyConfigurationRequest withSnapshotCopyConfigurationId(String snapshotCopyConfigurationId) {
        setSnapshotCopyConfigurationId(snapshotCopyConfigurationId);
        return this;
    }

    /**
     * <p>
     * The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     */

    public void setSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        this.snapshotRetentionPeriod = snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     * </p>
     * 
     * @return The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     */

    public Integer getSnapshotRetentionPeriod() {
        return this.snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The new retention period of how long to keep a snapshot in the destination Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotCopyConfigurationRequest withSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        setSnapshotRetentionPeriod(snapshotRetentionPeriod);
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
        if (getSnapshotCopyConfigurationId() != null)
            sb.append("SnapshotCopyConfigurationId: ").append(getSnapshotCopyConfigurationId()).append(",");
        if (getSnapshotRetentionPeriod() != null)
            sb.append("SnapshotRetentionPeriod: ").append(getSnapshotRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSnapshotCopyConfigurationRequest == false)
            return false;
        UpdateSnapshotCopyConfigurationRequest other = (UpdateSnapshotCopyConfigurationRequest) obj;
        if (other.getSnapshotCopyConfigurationId() == null ^ this.getSnapshotCopyConfigurationId() == null)
            return false;
        if (other.getSnapshotCopyConfigurationId() != null && other.getSnapshotCopyConfigurationId().equals(this.getSnapshotCopyConfigurationId()) == false)
            return false;
        if (other.getSnapshotRetentionPeriod() == null ^ this.getSnapshotRetentionPeriod() == null)
            return false;
        if (other.getSnapshotRetentionPeriod() != null && other.getSnapshotRetentionPeriod().equals(this.getSnapshotRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotCopyConfigurationId() == null) ? 0 : getSnapshotCopyConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionPeriod() == null) ? 0 : getSnapshotRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSnapshotCopyConfigurationRequest clone() {
        return (UpdateSnapshotCopyConfigurationRequest) super.clone();
    }

}
