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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The new retention period of the snapshot.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * The name of the snapshot.
     * </p>
     */
    private String snapshotName;

    /**
     * <p>
     * The new retention period of the snapshot.
     * </p>
     * 
     * @param retentionPeriod
     *        The new retention period of the snapshot.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The new retention period of the snapshot.
     * </p>
     * 
     * @return The new retention period of the snapshot.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The new retention period of the snapshot.
     * </p>
     * 
     * @param retentionPeriod
     *        The new retention period of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotRequest withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @return The name of the snapshot.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
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
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSnapshotRequest == false)
            return false;
        UpdateSnapshotRequest other = (UpdateSnapshotRequest) obj;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSnapshotRequest clone() {
        return (UpdateSnapshotRequest) super.clone();
    }

}
