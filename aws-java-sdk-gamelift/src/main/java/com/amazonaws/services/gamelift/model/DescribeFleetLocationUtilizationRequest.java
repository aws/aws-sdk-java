/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationUtilization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetLocationUtilizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or ARN
     * value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The fleet location to retrieve utilization information for. Specify a location in the form of an AWS Region code,
     * such as <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or ARN
     * value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or
     *        ARN value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or ARN
     * value.
     * </p>
     * 
     * @return A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or
     *         ARN value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or ARN
     * value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or
     *        ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetLocationUtilizationRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The fleet location to retrieve utilization information for. Specify a location in the form of an AWS Region code,
     * such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location to retrieve utilization information for. Specify a location in the form of an AWS
     *        Region code, such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location to retrieve utilization information for. Specify a location in the form of an AWS Region code,
     * such as <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location to retrieve utilization information for. Specify a location in the form of an AWS
     *         Region code, such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location to retrieve utilization information for. Specify a location in the form of an AWS Region code,
     * such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location to retrieve utilization information for. Specify a location in the form of an AWS
     *        Region code, such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetLocationUtilizationRequest withLocation(String location) {
        setLocation(location);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetLocationUtilizationRequest == false)
            return false;
        DescribeFleetLocationUtilizationRequest other = (DescribeFleetLocationUtilizationRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetLocationUtilizationRequest clone() {
        return (DescribeFleetLocationUtilizationRequest) super.clone();
    }

}
