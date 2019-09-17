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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Archive Group Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ArchiveGroupSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchiveGroupSettings implements Serializable, Cloneable, StructuredPojo {

    /** A directory and base filename where archive files should be written. */
    private OutputLocationRef destination;
    /** Number of seconds to write to archive file before closing and starting a new one. */
    private Integer rolloverInterval;

    /**
     * A directory and base filename where archive files should be written.
     * 
     * @param destination
     *        A directory and base filename where archive files should be written.
     */

    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * A directory and base filename where archive files should be written.
     * 
     * @return A directory and base filename where archive files should be written.
     */

    public OutputLocationRef getDestination() {
        return this.destination;
    }

    /**
     * A directory and base filename where archive files should be written.
     * 
     * @param destination
     *        A directory and base filename where archive files should be written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveGroupSettings withDestination(OutputLocationRef destination) {
        setDestination(destination);
        return this;
    }

    /**
     * Number of seconds to write to archive file before closing and starting a new one.
     * 
     * @param rolloverInterval
     *        Number of seconds to write to archive file before closing and starting a new one.
     */

    public void setRolloverInterval(Integer rolloverInterval) {
        this.rolloverInterval = rolloverInterval;
    }

    /**
     * Number of seconds to write to archive file before closing and starting a new one.
     * 
     * @return Number of seconds to write to archive file before closing and starting a new one.
     */

    public Integer getRolloverInterval() {
        return this.rolloverInterval;
    }

    /**
     * Number of seconds to write to archive file before closing and starting a new one.
     * 
     * @param rolloverInterval
     *        Number of seconds to write to archive file before closing and starting a new one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchiveGroupSettings withRolloverInterval(Integer rolloverInterval) {
        setRolloverInterval(rolloverInterval);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getRolloverInterval() != null)
            sb.append("RolloverInterval: ").append(getRolloverInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchiveGroupSettings == false)
            return false;
        ArchiveGroupSettings other = (ArchiveGroupSettings) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getRolloverInterval() == null ^ this.getRolloverInterval() == null)
            return false;
        if (other.getRolloverInterval() != null && other.getRolloverInterval().equals(this.getRolloverInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getRolloverInterval() == null) ? 0 : getRolloverInterval().hashCode());
        return hashCode;
    }

    @Override
    public ArchiveGroupSettings clone() {
        try {
            return (ArchiveGroupSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ArchiveGroupSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
