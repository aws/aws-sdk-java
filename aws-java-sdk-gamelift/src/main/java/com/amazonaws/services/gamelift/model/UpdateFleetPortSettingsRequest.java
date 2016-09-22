/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class UpdateFleetPortSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the fleet you want to update port settings for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Collection of port settings to be added to the fleet record.
     * </p>
     */
    private java.util.List<IpPermission> inboundPermissionAuthorizations;
    /**
     * <p>
     * Collection of port settings to be removed from the fleet record.
     * </p>
     */
    private java.util.List<IpPermission> inboundPermissionRevocations;

    /**
     * <p>
     * Unique identifier for the fleet you want to update port settings for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the fleet you want to update port settings for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for the fleet you want to update port settings for.
     * </p>
     * 
     * @return Unique identifier for the fleet you want to update port settings for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for the fleet you want to update port settings for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the fleet you want to update port settings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Collection of port settings to be added to the fleet record.
     * </p>
     * 
     * @return Collection of port settings to be added to the fleet record.
     */

    public java.util.List<IpPermission> getInboundPermissionAuthorizations() {
        return inboundPermissionAuthorizations;
    }

    /**
     * <p>
     * Collection of port settings to be added to the fleet record.
     * </p>
     * 
     * @param inboundPermissionAuthorizations
     *        Collection of port settings to be added to the fleet record.
     */

    public void setInboundPermissionAuthorizations(java.util.Collection<IpPermission> inboundPermissionAuthorizations) {
        if (inboundPermissionAuthorizations == null) {
            this.inboundPermissionAuthorizations = null;
            return;
        }

        this.inboundPermissionAuthorizations = new java.util.ArrayList<IpPermission>(inboundPermissionAuthorizations);
    }

    /**
     * <p>
     * Collection of port settings to be added to the fleet record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInboundPermissionAuthorizations(java.util.Collection)} or
     * {@link #withInboundPermissionAuthorizations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inboundPermissionAuthorizations
     *        Collection of port settings to be added to the fleet record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionAuthorizations(IpPermission... inboundPermissionAuthorizations) {
        if (this.inboundPermissionAuthorizations == null) {
            setInboundPermissionAuthorizations(new java.util.ArrayList<IpPermission>(inboundPermissionAuthorizations.length));
        }
        for (IpPermission ele : inboundPermissionAuthorizations) {
            this.inboundPermissionAuthorizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of port settings to be added to the fleet record.
     * </p>
     * 
     * @param inboundPermissionAuthorizations
     *        Collection of port settings to be added to the fleet record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionAuthorizations(java.util.Collection<IpPermission> inboundPermissionAuthorizations) {
        setInboundPermissionAuthorizations(inboundPermissionAuthorizations);
        return this;
    }

    /**
     * <p>
     * Collection of port settings to be removed from the fleet record.
     * </p>
     * 
     * @return Collection of port settings to be removed from the fleet record.
     */

    public java.util.List<IpPermission> getInboundPermissionRevocations() {
        return inboundPermissionRevocations;
    }

    /**
     * <p>
     * Collection of port settings to be removed from the fleet record.
     * </p>
     * 
     * @param inboundPermissionRevocations
     *        Collection of port settings to be removed from the fleet record.
     */

    public void setInboundPermissionRevocations(java.util.Collection<IpPermission> inboundPermissionRevocations) {
        if (inboundPermissionRevocations == null) {
            this.inboundPermissionRevocations = null;
            return;
        }

        this.inboundPermissionRevocations = new java.util.ArrayList<IpPermission>(inboundPermissionRevocations);
    }

    /**
     * <p>
     * Collection of port settings to be removed from the fleet record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInboundPermissionRevocations(java.util.Collection)} or
     * {@link #withInboundPermissionRevocations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inboundPermissionRevocations
     *        Collection of port settings to be removed from the fleet record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionRevocations(IpPermission... inboundPermissionRevocations) {
        if (this.inboundPermissionRevocations == null) {
            setInboundPermissionRevocations(new java.util.ArrayList<IpPermission>(inboundPermissionRevocations.length));
        }
        for (IpPermission ele : inboundPermissionRevocations) {
            this.inboundPermissionRevocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of port settings to be removed from the fleet record.
     * </p>
     * 
     * @param inboundPermissionRevocations
     *        Collection of port settings to be removed from the fleet record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetPortSettingsRequest withInboundPermissionRevocations(java.util.Collection<IpPermission> inboundPermissionRevocations) {
        setInboundPermissionRevocations(inboundPermissionRevocations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getInboundPermissionAuthorizations() != null)
            sb.append("InboundPermissionAuthorizations: " + getInboundPermissionAuthorizations() + ",");
        if (getInboundPermissionRevocations() != null)
            sb.append("InboundPermissionRevocations: " + getInboundPermissionRevocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetPortSettingsRequest == false)
            return false;
        UpdateFleetPortSettingsRequest other = (UpdateFleetPortSettingsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getInboundPermissionAuthorizations() == null ^ this.getInboundPermissionAuthorizations() == null)
            return false;
        if (other.getInboundPermissionAuthorizations() != null
                && other.getInboundPermissionAuthorizations().equals(this.getInboundPermissionAuthorizations()) == false)
            return false;
        if (other.getInboundPermissionRevocations() == null ^ this.getInboundPermissionRevocations() == null)
            return false;
        if (other.getInboundPermissionRevocations() != null && other.getInboundPermissionRevocations().equals(this.getInboundPermissionRevocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInboundPermissionAuthorizations() == null) ? 0 : getInboundPermissionAuthorizations().hashCode());
        hashCode = prime * hashCode + ((getInboundPermissionRevocations() == null) ? 0 : getInboundPermissionRevocations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetPortSettingsRequest clone() {
        return (UpdateFleetPortSettingsRequest) super.clone();
    }
}
