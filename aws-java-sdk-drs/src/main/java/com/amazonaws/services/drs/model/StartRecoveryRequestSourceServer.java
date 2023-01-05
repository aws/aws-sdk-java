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
 * An object representing the Source Server to recover.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartRecoveryRequestSourceServer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRecoveryRequestSourceServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by taking
     * an on-demand snapshot.
     * </p>
     */
    private String recoverySnapshotID;
    /**
     * <p>
     * The ID of the Source Server you want to recover.
     * </p>
     */
    private String sourceServerID;

    /**
     * <p>
     * The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by taking
     * an on-demand snapshot.
     * </p>
     * 
     * @param recoverySnapshotID
     *        The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by
     *        taking an on-demand snapshot.
     */

    public void setRecoverySnapshotID(String recoverySnapshotID) {
        this.recoverySnapshotID = recoverySnapshotID;
    }

    /**
     * <p>
     * The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by taking
     * an on-demand snapshot.
     * </p>
     * 
     * @return The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by
     *         taking an on-demand snapshot.
     */

    public String getRecoverySnapshotID() {
        return this.recoverySnapshotID;
    }

    /**
     * <p>
     * The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by taking
     * an on-demand snapshot.
     * </p>
     * 
     * @param recoverySnapshotID
     *        The ID of a Recovery Snapshot we want to recover from. Omit this field to launch from the latest data by
     *        taking an on-demand snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequestSourceServer withRecoverySnapshotID(String recoverySnapshotID) {
        setRecoverySnapshotID(recoverySnapshotID);
        return this;
    }

    /**
     * <p>
     * The ID of the Source Server you want to recover.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server you want to recover.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server you want to recover.
     * </p>
     * 
     * @return The ID of the Source Server you want to recover.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server you want to recover.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server you want to recover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequestSourceServer withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
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
        if (getRecoverySnapshotID() != null)
            sb.append("RecoverySnapshotID: ").append(getRecoverySnapshotID()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartRecoveryRequestSourceServer == false)
            return false;
        StartRecoveryRequestSourceServer other = (StartRecoveryRequestSourceServer) obj;
        if (other.getRecoverySnapshotID() == null ^ this.getRecoverySnapshotID() == null)
            return false;
        if (other.getRecoverySnapshotID() != null && other.getRecoverySnapshotID().equals(this.getRecoverySnapshotID()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoverySnapshotID() == null) ? 0 : getRecoverySnapshotID().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        return hashCode;
    }

    @Override
    public StartRecoveryRequestSourceServer clone() {
        try {
            return (StartRecoveryRequestSourceServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.StartRecoveryRequestSourceServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
