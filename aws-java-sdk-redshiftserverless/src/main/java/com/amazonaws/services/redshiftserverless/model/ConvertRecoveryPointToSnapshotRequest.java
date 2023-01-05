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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ConvertRecoveryPointToSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConvertRecoveryPointToSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     */
    private String recoveryPointId;
    /**
     * <p>
     * How long to retain the snapshot.
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
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the created snapshot.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point.
     */

    public void setRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     * 
     * @return The unique identifier of the recovery point.
     */

    public String getRecoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * <p>
     * The unique identifier of the recovery point.
     * </p>
     * 
     * @param recoveryPointId
     *        The unique identifier of the recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConvertRecoveryPointToSnapshotRequest withRecoveryPointId(String recoveryPointId) {
        setRecoveryPointId(recoveryPointId);
        return this;
    }

    /**
     * <p>
     * How long to retain the snapshot.
     * </p>
     * 
     * @param retentionPeriod
     *        How long to retain the snapshot.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long to retain the snapshot.
     * </p>
     * 
     * @return How long to retain the snapshot.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long to retain the snapshot.
     * </p>
     * 
     * @param retentionPeriod
     *        How long to retain the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConvertRecoveryPointToSnapshotRequest withRetentionPeriod(Integer retentionPeriod) {
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

    public ConvertRecoveryPointToSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the created snapshot.
     * </p>
     * 
     * @return An array of <a
     *         href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag objects</a>
     *         to associate with the created snapshot.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the created snapshot.
     * </p>
     * 
     * @param tags
     *        An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     *        objects</a> to associate with the created snapshot.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the created snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     *        objects</a> to associate with the created snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConvertRecoveryPointToSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     * objects</a> to associate with the created snapshot.
     * </p>
     * 
     * @param tags
     *        An array of <a href="https://docs.aws.amazon.com/redshift-serverless/latest/APIReference/API_Tag.html">Tag
     *        objects</a> to associate with the created snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConvertRecoveryPointToSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRecoveryPointId() != null)
            sb.append("RecoveryPointId: ").append(getRecoveryPointId()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConvertRecoveryPointToSnapshotRequest == false)
            return false;
        ConvertRecoveryPointToSnapshotRequest other = (ConvertRecoveryPointToSnapshotRequest) obj;
        if (other.getRecoveryPointId() == null ^ this.getRecoveryPointId() == null)
            return false;
        if (other.getRecoveryPointId() != null && other.getRecoveryPointId().equals(this.getRecoveryPointId()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointId() == null) ? 0 : getRecoveryPointId().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ConvertRecoveryPointToSnapshotRequest clone() {
        return (ConvertRecoveryPointToSnapshotRequest) super.clone();
    }

}
