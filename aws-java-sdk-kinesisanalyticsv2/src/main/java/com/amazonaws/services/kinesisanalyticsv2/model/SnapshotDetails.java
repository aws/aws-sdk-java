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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a snapshot of application state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/SnapshotDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the application snapshot.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The status of the application snapshot.
     * </p>
     */
    private String snapshotStatus;
    /**
     * <p>
     * The current application version ID when the snapshot was created.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * The timestamp of the application snapshot.
     * </p>
     */
    private java.util.Date snapshotCreationTimestamp;

    /**
     * <p>
     * The identifier for the application snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The identifier for the application snapshot.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The identifier for the application snapshot.
     * </p>
     * 
     * @return The identifier for the application snapshot.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The identifier for the application snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The identifier for the application snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotDetails withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The status of the application snapshot.
     * </p>
     * 
     * @param snapshotStatus
     *        The status of the application snapshot.
     * @see SnapshotStatus
     */

    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }

    /**
     * <p>
     * The status of the application snapshot.
     * </p>
     * 
     * @return The status of the application snapshot.
     * @see SnapshotStatus
     */

    public String getSnapshotStatus() {
        return this.snapshotStatus;
    }

    /**
     * <p>
     * The status of the application snapshot.
     * </p>
     * 
     * @param snapshotStatus
     *        The status of the application snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotStatus
     */

    public SnapshotDetails withSnapshotStatus(String snapshotStatus) {
        setSnapshotStatus(snapshotStatus);
        return this;
    }

    /**
     * <p>
     * The status of the application snapshot.
     * </p>
     * 
     * @param snapshotStatus
     *        The status of the application snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotStatus
     */

    public SnapshotDetails withSnapshotStatus(SnapshotStatus snapshotStatus) {
        this.snapshotStatus = snapshotStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current application version ID when the snapshot was created.
     * </p>
     * 
     * @param applicationVersionId
     *        The current application version ID when the snapshot was created.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * The current application version ID when the snapshot was created.
     * </p>
     * 
     * @return The current application version ID when the snapshot was created.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * The current application version ID when the snapshot was created.
     * </p>
     * 
     * @param applicationVersionId
     *        The current application version ID when the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotDetails withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * The timestamp of the application snapshot.
     * </p>
     * 
     * @param snapshotCreationTimestamp
     *        The timestamp of the application snapshot.
     */

    public void setSnapshotCreationTimestamp(java.util.Date snapshotCreationTimestamp) {
        this.snapshotCreationTimestamp = snapshotCreationTimestamp;
    }

    /**
     * <p>
     * The timestamp of the application snapshot.
     * </p>
     * 
     * @return The timestamp of the application snapshot.
     */

    public java.util.Date getSnapshotCreationTimestamp() {
        return this.snapshotCreationTimestamp;
    }

    /**
     * <p>
     * The timestamp of the application snapshot.
     * </p>
     * 
     * @param snapshotCreationTimestamp
     *        The timestamp of the application snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotDetails withSnapshotCreationTimestamp(java.util.Date snapshotCreationTimestamp) {
        setSnapshotCreationTimestamp(snapshotCreationTimestamp);
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
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSnapshotStatus() != null)
            sb.append("SnapshotStatus: ").append(getSnapshotStatus()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getSnapshotCreationTimestamp() != null)
            sb.append("SnapshotCreationTimestamp: ").append(getSnapshotCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotDetails == false)
            return false;
        SnapshotDetails other = (SnapshotDetails) obj;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotStatus() == null ^ this.getSnapshotStatus() == null)
            return false;
        if (other.getSnapshotStatus() != null && other.getSnapshotStatus().equals(this.getSnapshotStatus()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getSnapshotCreationTimestamp() == null ^ this.getSnapshotCreationTimestamp() == null)
            return false;
        if (other.getSnapshotCreationTimestamp() != null && other.getSnapshotCreationTimestamp().equals(this.getSnapshotCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotStatus() == null) ? 0 : getSnapshotStatus().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreationTimestamp() == null) ? 0 : getSnapshotCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotDetails clone() {
        try {
            return (SnapshotDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.SnapshotDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
