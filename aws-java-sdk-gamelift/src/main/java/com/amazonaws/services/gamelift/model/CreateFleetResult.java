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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Properties for the newly created fleet.
     * </p>
     */
    private FleetAttributes fleetAttributes;

    /**
     * <p>
     * Properties for the newly created fleet.
     * </p>
     * 
     * @param fleetAttributes
     *        Properties for the newly created fleet.
     */

    public void setFleetAttributes(FleetAttributes fleetAttributes) {
        this.fleetAttributes = fleetAttributes;
    }

    /**
     * <p>
     * Properties for the newly created fleet.
     * </p>
     * 
     * @return Properties for the newly created fleet.
     */

    public FleetAttributes getFleetAttributes() {
        return this.fleetAttributes;
    }

    /**
     * <p>
     * Properties for the newly created fleet.
     * </p>
     * 
     * @param fleetAttributes
     *        Properties for the newly created fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withFleetAttributes(FleetAttributes fleetAttributes) {
        setFleetAttributes(fleetAttributes);
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
        if (getFleetAttributes() != null)
            sb.append("FleetAttributes: ").append(getFleetAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetResult == false)
            return false;
        CreateFleetResult other = (CreateFleetResult) obj;
        if (other.getFleetAttributes() == null ^ this.getFleetAttributes() == null)
            return false;
        if (other.getFleetAttributes() != null && other.getFleetAttributes().equals(this.getFleetAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetAttributes() == null) ? 0 : getFleetAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetResult clone() {
        try {
            return (CreateFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
