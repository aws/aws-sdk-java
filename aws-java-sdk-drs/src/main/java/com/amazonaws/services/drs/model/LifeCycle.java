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
 * An object representing the Source Server Lifecycle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LifeCycle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time of when the Source Server was added to the service.
     * </p>
     */
    private String addedToServiceDateTime;
    /**
     * <p>
     * The amount of time that the Source Server has been replicating for.
     * </p>
     */
    private String elapsedReplicationDuration;
    /**
     * <p>
     * The date and time of the first byte that was replicated from the Source Server.
     * </p>
     */
    private String firstByteDateTime;
    /**
     * <p>
     * An object containing information regarding the last launch of the Source Server.
     * </p>
     */
    private LifeCycleLastLaunch lastLaunch;
    /**
     * <p>
     * The date and time this Source Server was last seen by the service.
     * </p>
     */
    private String lastSeenByServiceDateTime;

    /**
     * <p>
     * The date and time of when the Source Server was added to the service.
     * </p>
     * 
     * @param addedToServiceDateTime
     *        The date and time of when the Source Server was added to the service.
     */

    public void setAddedToServiceDateTime(String addedToServiceDateTime) {
        this.addedToServiceDateTime = addedToServiceDateTime;
    }

    /**
     * <p>
     * The date and time of when the Source Server was added to the service.
     * </p>
     * 
     * @return The date and time of when the Source Server was added to the service.
     */

    public String getAddedToServiceDateTime() {
        return this.addedToServiceDateTime;
    }

    /**
     * <p>
     * The date and time of when the Source Server was added to the service.
     * </p>
     * 
     * @param addedToServiceDateTime
     *        The date and time of when the Source Server was added to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withAddedToServiceDateTime(String addedToServiceDateTime) {
        setAddedToServiceDateTime(addedToServiceDateTime);
        return this;
    }

    /**
     * <p>
     * The amount of time that the Source Server has been replicating for.
     * </p>
     * 
     * @param elapsedReplicationDuration
     *        The amount of time that the Source Server has been replicating for.
     */

    public void setElapsedReplicationDuration(String elapsedReplicationDuration) {
        this.elapsedReplicationDuration = elapsedReplicationDuration;
    }

    /**
     * <p>
     * The amount of time that the Source Server has been replicating for.
     * </p>
     * 
     * @return The amount of time that the Source Server has been replicating for.
     */

    public String getElapsedReplicationDuration() {
        return this.elapsedReplicationDuration;
    }

    /**
     * <p>
     * The amount of time that the Source Server has been replicating for.
     * </p>
     * 
     * @param elapsedReplicationDuration
     *        The amount of time that the Source Server has been replicating for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withElapsedReplicationDuration(String elapsedReplicationDuration) {
        setElapsedReplicationDuration(elapsedReplicationDuration);
        return this;
    }

    /**
     * <p>
     * The date and time of the first byte that was replicated from the Source Server.
     * </p>
     * 
     * @param firstByteDateTime
     *        The date and time of the first byte that was replicated from the Source Server.
     */

    public void setFirstByteDateTime(String firstByteDateTime) {
        this.firstByteDateTime = firstByteDateTime;
    }

    /**
     * <p>
     * The date and time of the first byte that was replicated from the Source Server.
     * </p>
     * 
     * @return The date and time of the first byte that was replicated from the Source Server.
     */

    public String getFirstByteDateTime() {
        return this.firstByteDateTime;
    }

    /**
     * <p>
     * The date and time of the first byte that was replicated from the Source Server.
     * </p>
     * 
     * @param firstByteDateTime
     *        The date and time of the first byte that was replicated from the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withFirstByteDateTime(String firstByteDateTime) {
        setFirstByteDateTime(firstByteDateTime);
        return this;
    }

    /**
     * <p>
     * An object containing information regarding the last launch of the Source Server.
     * </p>
     * 
     * @param lastLaunch
     *        An object containing information regarding the last launch of the Source Server.
     */

    public void setLastLaunch(LifeCycleLastLaunch lastLaunch) {
        this.lastLaunch = lastLaunch;
    }

    /**
     * <p>
     * An object containing information regarding the last launch of the Source Server.
     * </p>
     * 
     * @return An object containing information regarding the last launch of the Source Server.
     */

    public LifeCycleLastLaunch getLastLaunch() {
        return this.lastLaunch;
    }

    /**
     * <p>
     * An object containing information regarding the last launch of the Source Server.
     * </p>
     * 
     * @param lastLaunch
     *        An object containing information regarding the last launch of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withLastLaunch(LifeCycleLastLaunch lastLaunch) {
        setLastLaunch(lastLaunch);
        return this;
    }

    /**
     * <p>
     * The date and time this Source Server was last seen by the service.
     * </p>
     * 
     * @param lastSeenByServiceDateTime
     *        The date and time this Source Server was last seen by the service.
     */

    public void setLastSeenByServiceDateTime(String lastSeenByServiceDateTime) {
        this.lastSeenByServiceDateTime = lastSeenByServiceDateTime;
    }

    /**
     * <p>
     * The date and time this Source Server was last seen by the service.
     * </p>
     * 
     * @return The date and time this Source Server was last seen by the service.
     */

    public String getLastSeenByServiceDateTime() {
        return this.lastSeenByServiceDateTime;
    }

    /**
     * <p>
     * The date and time this Source Server was last seen by the service.
     * </p>
     * 
     * @param lastSeenByServiceDateTime
     *        The date and time this Source Server was last seen by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycle withLastSeenByServiceDateTime(String lastSeenByServiceDateTime) {
        setLastSeenByServiceDateTime(lastSeenByServiceDateTime);
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
        if (getAddedToServiceDateTime() != null)
            sb.append("AddedToServiceDateTime: ").append(getAddedToServiceDateTime()).append(",");
        if (getElapsedReplicationDuration() != null)
            sb.append("ElapsedReplicationDuration: ").append(getElapsedReplicationDuration()).append(",");
        if (getFirstByteDateTime() != null)
            sb.append("FirstByteDateTime: ").append(getFirstByteDateTime()).append(",");
        if (getLastLaunch() != null)
            sb.append("LastLaunch: ").append(getLastLaunch()).append(",");
        if (getLastSeenByServiceDateTime() != null)
            sb.append("LastSeenByServiceDateTime: ").append(getLastSeenByServiceDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifeCycle == false)
            return false;
        LifeCycle other = (LifeCycle) obj;
        if (other.getAddedToServiceDateTime() == null ^ this.getAddedToServiceDateTime() == null)
            return false;
        if (other.getAddedToServiceDateTime() != null && other.getAddedToServiceDateTime().equals(this.getAddedToServiceDateTime()) == false)
            return false;
        if (other.getElapsedReplicationDuration() == null ^ this.getElapsedReplicationDuration() == null)
            return false;
        if (other.getElapsedReplicationDuration() != null && other.getElapsedReplicationDuration().equals(this.getElapsedReplicationDuration()) == false)
            return false;
        if (other.getFirstByteDateTime() == null ^ this.getFirstByteDateTime() == null)
            return false;
        if (other.getFirstByteDateTime() != null && other.getFirstByteDateTime().equals(this.getFirstByteDateTime()) == false)
            return false;
        if (other.getLastLaunch() == null ^ this.getLastLaunch() == null)
            return false;
        if (other.getLastLaunch() != null && other.getLastLaunch().equals(this.getLastLaunch()) == false)
            return false;
        if (other.getLastSeenByServiceDateTime() == null ^ this.getLastSeenByServiceDateTime() == null)
            return false;
        if (other.getLastSeenByServiceDateTime() != null && other.getLastSeenByServiceDateTime().equals(this.getLastSeenByServiceDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddedToServiceDateTime() == null) ? 0 : getAddedToServiceDateTime().hashCode());
        hashCode = prime * hashCode + ((getElapsedReplicationDuration() == null) ? 0 : getElapsedReplicationDuration().hashCode());
        hashCode = prime * hashCode + ((getFirstByteDateTime() == null) ? 0 : getFirstByteDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastLaunch() == null) ? 0 : getLastLaunch().hashCode());
        hashCode = prime * hashCode + ((getLastSeenByServiceDateTime() == null) ? 0 : getLastSeenByServiceDateTime().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycle clone() {
        try {
            return (LifeCycle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LifeCycleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
