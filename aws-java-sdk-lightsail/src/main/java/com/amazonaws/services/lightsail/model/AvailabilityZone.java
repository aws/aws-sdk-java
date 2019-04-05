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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Availability Zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AvailabilityZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZone implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     * </p>
     */
    private String zoneName;
    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     * </p>
     * 
     * @param zoneName
     *        The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     */

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     * </p>
     * 
     * @return The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     */

    public String getZoneName() {
        return this.zoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     * </p>
     * 
     * @param zoneName
     *        The name of the Availability Zone. The format is <code>us-east-2a</code> (case-sensitive).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZone withZoneName(String zoneName) {
        setZoneName(zoneName);
        return this;
    }

    /**
     * <p>
     * The state of the Availability Zone.
     * </p>
     * 
     * @param state
     *        The state of the Availability Zone.
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
     */

    public AvailabilityZone withState(String state) {
        setState(state);
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
        if (getZoneName() != null)
            sb.append("ZoneName: ").append(getZoneName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
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
        if (other.getZoneName() == null ^ this.getZoneName() == null)
            return false;
        if (other.getZoneName() != null && other.getZoneName().equals(this.getZoneName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getZoneName() == null) ? 0 : getZoneName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AvailabilityZoneMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
