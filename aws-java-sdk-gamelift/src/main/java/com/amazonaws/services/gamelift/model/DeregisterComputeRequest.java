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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterCompute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterComputeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * &gt;A unique identifier for the fleet the compute resource is registered to.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The name of the compute resource you want to delete.
     * </p>
     */
    private String computeName;

    /**
     * <p>
     * &gt;A unique identifier for the fleet the compute resource is registered to.
     * </p>
     * 
     * @param fleetId
     *        &gt;A unique identifier for the fleet the compute resource is registered to.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * &gt;A unique identifier for the fleet the compute resource is registered to.
     * </p>
     * 
     * @return &gt;A unique identifier for the fleet the compute resource is registered to.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * &gt;A unique identifier for the fleet the compute resource is registered to.
     * </p>
     * 
     * @param fleetId
     *        &gt;A unique identifier for the fleet the compute resource is registered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterComputeRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The name of the compute resource you want to delete.
     * </p>
     * 
     * @param computeName
     *        The name of the compute resource you want to delete.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * The name of the compute resource you want to delete.
     * </p>
     * 
     * @return The name of the compute resource you want to delete.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * The name of the compute resource you want to delete.
     * </p>
     * 
     * @param computeName
     *        The name of the compute resource you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterComputeRequest withComputeName(String computeName) {
        setComputeName(computeName);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getComputeName() != null)
            sb.append("ComputeName: ").append(getComputeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterComputeRequest == false)
            return false;
        DeregisterComputeRequest other = (DeregisterComputeRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getComputeName() == null ^ this.getComputeName() == null)
            return false;
        if (other.getComputeName() != null && other.getComputeName().equals(this.getComputeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getComputeName() == null) ? 0 : getComputeName().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterComputeRequest clone() {
        return (DeregisterComputeRequest) super.clone();
    }

}
