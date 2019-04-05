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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an Availability Zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AvailabilityZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZone implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Any messages about the Availability Zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AvailabilityZoneMessage> messages;
    /**
     * <p>
     * The name of the region.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     */
    private String zoneName;
    /**
     * <p>
     * The ID of the Availability Zone.
     * </p>
     */
    private String zoneId;

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     * 
     * @param state
     *        The state of the Availability Zone.
     * @see AvailabilityZoneState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     * 
     * @return The state of the Availability Zone.
     * @see AvailabilityZoneState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     * 
     * @param state
     *        The state of the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityZoneState
     */

    public AvailabilityZone withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     * 
     * @param state
     *        The state of the Availability Zone.
     * @see AvailabilityZoneState
     */

    public void setState(AvailabilityZoneState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     * 
     * @param state
     *        The state of the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AvailabilityZoneState
     */

    public AvailabilityZone withState(AvailabilityZoneState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Any messages about the Availability Zone.
     * </p>
     * 
     * @return Any messages about the Availability Zone.
     */

    public java.util.List<AvailabilityZoneMessage> getMessages() {
        if (messages == null) {
            messages = new com.amazonaws.internal.SdkInternalList<AvailabilityZoneMessage>();
        }
        return messages;
    }

    /**
     * <p>
     * Any messages about the Availability Zone.
     * </p>
     * 
     * @param messages
     *        Any messages about the Availability Zone.
     */

    public void setMessages(java.util.Collection<AvailabilityZoneMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new com.amazonaws.internal.SdkInternalList<AvailabilityZoneMessage>(messages);
    }

    /**
     * <p>
     * Any messages about the Availability Zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        Any messages about the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withMessages(AvailabilityZoneMessage... messages) {
        if (this.messages == null) {
            setMessages(new com.amazonaws.internal.SdkInternalList<AvailabilityZoneMessage>(messages.length));
        }
        for (AvailabilityZoneMessage ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any messages about the Availability Zone.
     * </p>
     * 
     * @param messages
     *        Any messages about the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withMessages(java.util.Collection<AvailabilityZoneMessage> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * The name of the region.
     * </p>
     * 
     * @param regionName
     *        The name of the region.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the region.
     * </p>
     * 
     * @return The name of the region.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the region.
     * </p>
     * 
     * @param regionName
     *        The name of the region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @param zoneName
     *        The name of the Availability Zone.
     */

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @return The name of the Availability Zone.
     */

    public String getZoneName() {
        return this.zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @param zoneName
     *        The name of the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withZoneName(String zoneName) {
        setZoneName(zoneName);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone.
     * </p>
     * 
     * @param zoneId
     *        The ID of the Availability Zone.
     */

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone.
     * </p>
     * 
     * @return The ID of the Availability Zone.
     */

    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone.
     * </p>
     * 
     * @param zoneId
     *        The ID of the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withZoneId(String zoneId) {
        setZoneId(zoneId);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getZoneName() != null)
            sb.append("ZoneName: ").append(getZoneName()).append(",");
        if (getZoneId() != null)
            sb.append("ZoneId: ").append(getZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZone == false)
            return false;
        AvailabilityZone other = (AvailabilityZone) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getZoneName() == null ^ this.getZoneName() == null)
            return false;
        if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false)
            return false;
        if (other.getZoneId() == null ^ this.getZoneId() == null)
            return false;
        if (other.getZoneId() != null && other.getZoneId().equals(this.getZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
        hashCode = prime * hashCode + ((getZoneId() == null) ? 0 : getZoneId().hashCode());
        return hashCode;
    }

    @Override
    public AvailabilityZone clone() {
        try {
            return (AvailabilityZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
