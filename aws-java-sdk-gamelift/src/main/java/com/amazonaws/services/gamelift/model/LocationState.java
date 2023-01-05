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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A fleet location and its life-cycle state. A location state object might be used to describe a fleet's remote
 * location or home Region. Life-cycle state tracks the progress of launching the first instance in a new location and
 * preparing it for game hosting, and then removing all instances and deleting the location from the fleet.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>NEW</b> -- A new fleet location has been defined and desired instances is set to 1.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet location, creating new
 * instances with the game build or Realtime script and starting server processes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>ACTIVE</b> -- Hosts can now accept game sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet location.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>DELETING</b> -- Hosts are responding to a delete fleet location request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>TERMINATED</b> -- The fleet location no longer exists.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>NOT_FOUND</b> -- The fleet location was not found. This could be because the custom location was removed or not
 * created.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/LocationState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The life-cycle status of a fleet location.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location, expressed as an Amazon Web Services Region code such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationState withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The life-cycle status of a fleet location.
     * </p>
     * 
     * @param status
     *        The life-cycle status of a fleet location.
     * @see FleetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The life-cycle status of a fleet location.
     * </p>
     * 
     * @return The life-cycle status of a fleet location.
     * @see FleetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The life-cycle status of a fleet location.
     * </p>
     * 
     * @param status
     *        The life-cycle status of a fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public LocationState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The life-cycle status of a fleet location.
     * </p>
     * 
     * @param status
     *        The life-cycle status of a fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public LocationState withStatus(FleetStatus status) {
        this.status = status.toString();
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationState == false)
            return false;
        LocationState other = (LocationState) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LocationState clone() {
        try {
            return (LocationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.LocationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
