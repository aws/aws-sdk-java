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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A snapshot of a Source Server used during recovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoverySnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoverySnapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of EBS snapshots.
     * </p>
     */
    private java.util.List<String> ebsSnapshots;
    /**
     * <p>
     * The timestamp of when we expect the snapshot to be taken.
     * </p>
     */
    private String expectedTimestamp;
    /**
     * <p>
     * The ID of the Recovery Snapshot.
     * </p>
     */
    private String snapshotID;
    /**
     * <p>
     * The ID of the Source Server that the snapshot was taken for.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * The actual timestamp that the snapshot was taken.
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * A list of EBS snapshots.
     * </p>
     * 
     * @return A list of EBS snapshots.
     */

    public java.util.List<String> getEbsSnapshots() {
        return ebsSnapshots;
    }

    /**
     * <p>
     * A list of EBS snapshots.
     * </p>
     * 
     * @param ebsSnapshots
     *        A list of EBS snapshots.
     */

    public void setEbsSnapshots(java.util.Collection<String> ebsSnapshots) {
        if (ebsSnapshots == null) {
            this.ebsSnapshots = null;
            return;
        }

        this.ebsSnapshots = new java.util.ArrayList<String>(ebsSnapshots);
    }

    /**
     * <p>
     * A list of EBS snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEbsSnapshots(java.util.Collection)} or {@link #withEbsSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ebsSnapshots
     *        A list of EBS snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoverySnapshot withEbsSnapshots(String... ebsSnapshots) {
        if (this.ebsSnapshots == null) {
            setEbsSnapshots(new java.util.ArrayList<String>(ebsSnapshots.length));
        }
        for (String ele : ebsSnapshots) {
            this.ebsSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EBS snapshots.
     * </p>
     * 
     * @param ebsSnapshots
     *        A list of EBS snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoverySnapshot withEbsSnapshots(java.util.Collection<String> ebsSnapshots) {
        setEbsSnapshots(ebsSnapshots);
        return this;
    }

    /**
     * <p>
     * The timestamp of when we expect the snapshot to be taken.
     * </p>
     * 
     * @param expectedTimestamp
     *        The timestamp of when we expect the snapshot to be taken.
     */

    public void setExpectedTimestamp(String expectedTimestamp) {
        this.expectedTimestamp = expectedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when we expect the snapshot to be taken.
     * </p>
     * 
     * @return The timestamp of when we expect the snapshot to be taken.
     */

    public String getExpectedTimestamp() {
        return this.expectedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when we expect the snapshot to be taken.
     * </p>
     * 
     * @param expectedTimestamp
     *        The timestamp of when we expect the snapshot to be taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoverySnapshot withExpectedTimestamp(String expectedTimestamp) {
        setExpectedTimestamp(expectedTimestamp);
        return this;
    }

    /**
     * <p>
     * The ID of the Recovery Snapshot.
     * </p>
     * 
     * @param snapshotID
     *        The ID of the Recovery Snapshot.
     */

    public void setSnapshotID(String snapshotID) {
        this.snapshotID = snapshotID;
    }

    /**
     * <p>
     * The ID of the Recovery Snapshot.
     * </p>
     * 
     * @return The ID of the Recovery Snapshot.
     */

    public String getSnapshotID() {
        return this.snapshotID;
    }

    /**
     * <p>
     * The ID of the Recovery Snapshot.
     * </p>
     * 
     * @param snapshotID
     *        The ID of the Recovery Snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoverySnapshot withSnapshotID(String snapshotID) {
        setSnapshotID(snapshotID);
        return this;
    }

    /**
     * <p>
     * The ID of the Source Server that the snapshot was taken for.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server that the snapshot was taken for.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server that the snapshot was taken for.
     * </p>
     * 
     * @return The ID of the Source Server that the snapshot was taken for.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server that the snapshot was taken for.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server that the snapshot was taken for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoverySnapshot withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * The actual timestamp that the snapshot was taken.
     * </p>
     * 
     * @param timestamp
     *        The actual timestamp that the snapshot was taken.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The actual timestamp that the snapshot was taken.
     * </p>
     * 
     * @return The actual timestamp that the snapshot was taken.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The actual timestamp that the snapshot was taken.
     * </p>
     * 
     * @param timestamp
     *        The actual timestamp that the snapshot was taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoverySnapshot withTimestamp(String timestamp) {
        setTimestamp(timestamp);
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
        if (getEbsSnapshots() != null)
            sb.append("EbsSnapshots: ").append(getEbsSnapshots()).append(",");
        if (getExpectedTimestamp() != null)
            sb.append("ExpectedTimestamp: ").append(getExpectedTimestamp()).append(",");
        if (getSnapshotID() != null)
            sb.append("SnapshotID: ").append(getSnapshotID()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoverySnapshot == false)
            return false;
        RecoverySnapshot other = (RecoverySnapshot) obj;
        if (other.getEbsSnapshots() == null ^ this.getEbsSnapshots() == null)
            return false;
        if (other.getEbsSnapshots() != null && other.getEbsSnapshots().equals(this.getEbsSnapshots()) == false)
            return false;
        if (other.getExpectedTimestamp() == null ^ this.getExpectedTimestamp() == null)
            return false;
        if (other.getExpectedTimestamp() != null && other.getExpectedTimestamp().equals(this.getExpectedTimestamp()) == false)
            return false;
        if (other.getSnapshotID() == null ^ this.getSnapshotID() == null)
            return false;
        if (other.getSnapshotID() != null && other.getSnapshotID().equals(this.getSnapshotID()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsSnapshots() == null) ? 0 : getEbsSnapshots().hashCode());
        hashCode = prime * hashCode + ((getExpectedTimestamp() == null) ? 0 : getExpectedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSnapshotID() == null) ? 0 : getSnapshotID().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public RecoverySnapshot clone() {
        try {
            return (RecoverySnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoverySnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
