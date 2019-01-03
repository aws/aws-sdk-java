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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique identifier for a fleet to be deleted.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteScalingPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet to be deleted.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to be deleted.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to be deleted.
     * </p>
     * 
     * @return Unique identifier for a fleet to be deleted.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to be deleted.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteScalingPolicyRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteScalingPolicyRequest == false)
            return false;
        DeleteScalingPolicyRequest other = (DeleteScalingPolicyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteScalingPolicyRequest clone() {
        return (DeleteScalingPolicyRequest) super.clone();
    }

}
