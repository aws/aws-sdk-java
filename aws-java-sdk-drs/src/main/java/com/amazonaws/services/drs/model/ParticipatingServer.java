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
 * Represents a server participating in an asynchronous Job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ParticipatingServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipatingServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The launch status of a participating server.
     * </p>
     */
    private String launchStatus;
    /**
     * <p>
     * The Recovery Instance ID of a participating server.
     * </p>
     */
    private String recoveryInstanceID;
    /**
     * <p>
     * The Source Server ID of a participating server.
     * </p>
     */
    private String sourceServerID;

    /**
     * <p>
     * The launch status of a participating server.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of a participating server.
     * @see LaunchStatus
     */

    public void setLaunchStatus(String launchStatus) {
        this.launchStatus = launchStatus;
    }

    /**
     * <p>
     * The launch status of a participating server.
     * </p>
     * 
     * @return The launch status of a participating server.
     * @see LaunchStatus
     */

    public String getLaunchStatus() {
        return this.launchStatus;
    }

    /**
     * <p>
     * The launch status of a participating server.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of a participating server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public ParticipatingServer withLaunchStatus(String launchStatus) {
        setLaunchStatus(launchStatus);
        return this;
    }

    /**
     * <p>
     * The launch status of a participating server.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of a participating server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public ParticipatingServer withLaunchStatus(LaunchStatus launchStatus) {
        this.launchStatus = launchStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Recovery Instance ID of a participating server.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The Recovery Instance ID of a participating server.
     */

    public void setRecoveryInstanceID(String recoveryInstanceID) {
        this.recoveryInstanceID = recoveryInstanceID;
    }

    /**
     * <p>
     * The Recovery Instance ID of a participating server.
     * </p>
     * 
     * @return The Recovery Instance ID of a participating server.
     */

    public String getRecoveryInstanceID() {
        return this.recoveryInstanceID;
    }

    /**
     * <p>
     * The Recovery Instance ID of a participating server.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The Recovery Instance ID of a participating server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipatingServer withRecoveryInstanceID(String recoveryInstanceID) {
        setRecoveryInstanceID(recoveryInstanceID);
        return this;
    }

    /**
     * <p>
     * The Source Server ID of a participating server.
     * </p>
     * 
     * @param sourceServerID
     *        The Source Server ID of a participating server.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The Source Server ID of a participating server.
     * </p>
     * 
     * @return The Source Server ID of a participating server.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The Source Server ID of a participating server.
     * </p>
     * 
     * @param sourceServerID
     *        The Source Server ID of a participating server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipatingServer withSourceServerID(String sourceServerID) {
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
        if (getLaunchStatus() != null)
            sb.append("LaunchStatus: ").append(getLaunchStatus()).append(",");
        if (getRecoveryInstanceID() != null)
            sb.append("RecoveryInstanceID: ").append(getRecoveryInstanceID()).append(",");
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

        if (obj instanceof ParticipatingServer == false)
            return false;
        ParticipatingServer other = (ParticipatingServer) obj;
        if (other.getLaunchStatus() == null ^ this.getLaunchStatus() == null)
            return false;
        if (other.getLaunchStatus() != null && other.getLaunchStatus().equals(this.getLaunchStatus()) == false)
            return false;
        if (other.getRecoveryInstanceID() == null ^ this.getRecoveryInstanceID() == null)
            return false;
        if (other.getRecoveryInstanceID() != null && other.getRecoveryInstanceID().equals(this.getRecoveryInstanceID()) == false)
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

        hashCode = prime * hashCode + ((getLaunchStatus() == null) ? 0 : getLaunchStatus().hashCode());
        hashCode = prime * hashCode + ((getRecoveryInstanceID() == null) ? 0 : getRecoveryInstanceID().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        return hashCode;
    }

    @Override
    public ParticipatingServer clone() {
        try {
            return (ParticipatingServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.ParticipatingServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
