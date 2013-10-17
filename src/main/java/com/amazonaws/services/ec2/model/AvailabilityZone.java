/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * An EC2 availability zone, separate and fault tolerant from other availability zones.
 * </p>
 */
public class AvailabilityZone implements Serializable {

    /**
     * Name of the Availability Zone.
     */
    private String zoneName;

    /**
     * State of the Availability Zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available
     */
    private String state;

    /**
     * Name of the region in which this zone resides.
     */
    private String regionName;

    /**
     * A list of messages about the Availability Zone.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZoneMessage> messages;

    /**
     * Name of the Availability Zone.
     *
     * @return Name of the Availability Zone.
     */
    public String getZoneName() {
        return zoneName;
    }
    
    /**
     * Name of the Availability Zone.
     *
     * @param zoneName Name of the Availability Zone.
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    
    /**
     * Name of the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param zoneName Name of the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AvailabilityZone withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * State of the Availability Zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available
     *
     * @return State of the Availability Zone.
     *
     * @see AvailabilityZoneState
     */
    public String getState() {
        return state;
    }
    
    /**
     * State of the Availability Zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available
     *
     * @param state State of the Availability Zone.
     *
     * @see AvailabilityZoneState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * State of the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available
     *
     * @param state State of the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AvailabilityZoneState
     */
    public AvailabilityZone withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * State of the Availability Zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available
     *
     * @param state State of the Availability Zone.
     *
     * @see AvailabilityZoneState
     */
    public void setState(AvailabilityZoneState state) {
        this.state = state.toString();
    }
    
    /**
     * State of the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available
     *
     * @param state State of the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see AvailabilityZoneState
     */
    public AvailabilityZone withState(AvailabilityZoneState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Name of the region in which this zone resides.
     *
     * @return Name of the region in which this zone resides.
     */
    public String getRegionName() {
        return regionName;
    }
    
    /**
     * Name of the region in which this zone resides.
     *
     * @param regionName Name of the region in which this zone resides.
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    /**
     * Name of the region in which this zone resides.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regionName Name of the region in which this zone resides.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AvailabilityZone withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * A list of messages about the Availability Zone.
     *
     * @return A list of messages about the Availability Zone.
     */
    public java.util.List<AvailabilityZoneMessage> getMessages() {
        if (messages == null) {
              messages = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZoneMessage>();
              messages.setAutoConstruct(true);
        }
        return messages;
    }
    
    /**
     * A list of messages about the Availability Zone.
     *
     * @param messages A list of messages about the Availability Zone.
     */
    public void setMessages(java.util.Collection<AvailabilityZoneMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZoneMessage> messagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZoneMessage>(messages.size());
        messagesCopy.addAll(messages);
        this.messages = messagesCopy;
    }
    
    /**
     * A list of messages about the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages A list of messages about the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AvailabilityZone withMessages(AvailabilityZoneMessage... messages) {
        if (getMessages() == null) setMessages(new java.util.ArrayList<AvailabilityZoneMessage>(messages.length));
        for (AvailabilityZoneMessage value : messages) {
            getMessages().add(value);
        }
        return this;
    }
    
    /**
     * A list of messages about the Availability Zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messages A list of messages about the Availability Zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AvailabilityZone withMessages(java.util.Collection<AvailabilityZoneMessage> messages) {
        if (messages == null) {
            this.messages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZoneMessage> messagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZoneMessage>(messages.size());
            messagesCopy.addAll(messages);
            this.messages = messagesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getZoneName() != null) sb.append("ZoneName: " + getZoneName() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getRegionName() != null) sb.append("RegionName: " + getRegionName() + ",");
        if (getMessages() != null) sb.append("Messages: " + getMessages() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode()); 
        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AvailabilityZone == false) return false;
        AvailabilityZone other = (AvailabilityZone)obj;
        
        if (other.getZoneName() == null ^ this.getZoneName() == null) return false;
        if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getRegionName() == null ^ this.getRegionName() == null) return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false) return false; 
        if (other.getMessages() == null ^ this.getMessages() == null) return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false) return false; 
        return true;
    }
    
}
    