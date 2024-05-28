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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a resource participating in an asynchronous Job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/ParticipatingResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParticipatingResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The launch status of a participating resource.
     * </p>
     */
    private String launchStatus;
    /**
     * <p>
     * The ID of a participating resource.
     * </p>
     */
    private ParticipatingResourceID participatingResourceID;

    /**
     * <p>
     * The launch status of a participating resource.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of a participating resource.
     * @see LaunchStatus
     */

    public void setLaunchStatus(String launchStatus) {
        this.launchStatus = launchStatus;
    }

    /**
     * <p>
     * The launch status of a participating resource.
     * </p>
     * 
     * @return The launch status of a participating resource.
     * @see LaunchStatus
     */

    public String getLaunchStatus() {
        return this.launchStatus;
    }

    /**
     * <p>
     * The launch status of a participating resource.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of a participating resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public ParticipatingResource withLaunchStatus(String launchStatus) {
        setLaunchStatus(launchStatus);
        return this;
    }

    /**
     * <p>
     * The launch status of a participating resource.
     * </p>
     * 
     * @param launchStatus
     *        The launch status of a participating resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchStatus
     */

    public ParticipatingResource withLaunchStatus(LaunchStatus launchStatus) {
        this.launchStatus = launchStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID of a participating resource.
     * </p>
     * 
     * @param participatingResourceID
     *        The ID of a participating resource.
     */

    public void setParticipatingResourceID(ParticipatingResourceID participatingResourceID) {
        this.participatingResourceID = participatingResourceID;
    }

    /**
     * <p>
     * The ID of a participating resource.
     * </p>
     * 
     * @return The ID of a participating resource.
     */

    public ParticipatingResourceID getParticipatingResourceID() {
        return this.participatingResourceID;
    }

    /**
     * <p>
     * The ID of a participating resource.
     * </p>
     * 
     * @param participatingResourceID
     *        The ID of a participating resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParticipatingResource withParticipatingResourceID(ParticipatingResourceID participatingResourceID) {
        setParticipatingResourceID(participatingResourceID);
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
        if (getParticipatingResourceID() != null)
            sb.append("ParticipatingResourceID: ").append(getParticipatingResourceID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParticipatingResource == false)
            return false;
        ParticipatingResource other = (ParticipatingResource) obj;
        if (other.getLaunchStatus() == null ^ this.getLaunchStatus() == null)
            return false;
        if (other.getLaunchStatus() != null && other.getLaunchStatus().equals(this.getLaunchStatus()) == false)
            return false;
        if (other.getParticipatingResourceID() == null ^ this.getParticipatingResourceID() == null)
            return false;
        if (other.getParticipatingResourceID() != null && other.getParticipatingResourceID().equals(this.getParticipatingResourceID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchStatus() == null) ? 0 : getLaunchStatus().hashCode());
        hashCode = prime * hashCode + ((getParticipatingResourceID() == null) ? 0 : getParticipatingResourceID().hashCode());
        return hashCode;
    }

    @Override
    public ParticipatingResource clone() {
        try {
            return (ParticipatingResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.ParticipatingResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
