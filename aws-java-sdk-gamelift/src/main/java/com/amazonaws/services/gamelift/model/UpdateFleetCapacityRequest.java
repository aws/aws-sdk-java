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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetCapacityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The number of EC2 instances you want to maintain in the specified fleet location. This value must fall between
     * the minimum and maximum size limits.
     * </p>
     */
    private Integer desiredInstances;
    /**
     * <p>
     * The minimum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 0.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 1.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN
     *        value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN
     *         value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances you want to maintain in the specified fleet location. This value must fall between
     * the minimum and maximum size limits.
     * </p>
     * 
     * @param desiredInstances
     *        The number of EC2 instances you want to maintain in the specified fleet location. This value must fall
     *        between the minimum and maximum size limits.
     */

    public void setDesiredInstances(Integer desiredInstances) {
        this.desiredInstances = desiredInstances;
    }

    /**
     * <p>
     * The number of EC2 instances you want to maintain in the specified fleet location. This value must fall between
     * the minimum and maximum size limits.
     * </p>
     * 
     * @return The number of EC2 instances you want to maintain in the specified fleet location. This value must fall
     *         between the minimum and maximum size limits.
     */

    public Integer getDesiredInstances() {
        return this.desiredInstances;
    }

    /**
     * <p>
     * The number of EC2 instances you want to maintain in the specified fleet location. This value must fall between
     * the minimum and maximum size limits.
     * </p>
     * 
     * @param desiredInstances
     *        The number of EC2 instances you want to maintain in the specified fleet location. This value must fall
     *        between the minimum and maximum size limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withDesiredInstances(Integer desiredInstances) {
        setDesiredInstances(desiredInstances);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 0.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances that are allowed in the specified fleet location. If this parameter is not
     *        set, the default is 0.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 0.
     * </p>
     * 
     * @return The minimum number of instances that are allowed in the specified fleet location. If this parameter is
     *         not set, the default is 0.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 0.
     * </p>
     * 
     * @param minSize
     *        The minimum number of instances that are allowed in the specified fleet location. If this parameter is not
     *        set, the default is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 1.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances that are allowed in the specified fleet location. If this parameter is not
     *        set, the default is 1.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 1.
     * </p>
     * 
     * @return The maximum number of instances that are allowed in the specified fleet location. If this parameter is
     *         not set, the default is 1.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum number of instances that are allowed in the specified fleet location. If this parameter is not set,
     * the default is 1.
     * </p>
     * 
     * @param maxSize
     *        The maximum number of instances that are allowed in the specified fleet location. If this parameter is not
     *        set, the default is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code
     *        such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code
     *         such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The name of a remote location to update fleet capacity settings for, in the form of an AWS Region code
     *        such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetCapacityRequest withLocation(String location) {
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
        if (getDesiredInstances() != null)
            sb.append("DesiredInstances: ").append(getDesiredInstances()).append(",");
        if (getMinSize() != null)
            sb.append("MinSize: ").append(getMinSize()).append(",");
        if (getMaxSize() != null)
            sb.append("MaxSize: ").append(getMaxSize()).append(",");
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

        if (obj instanceof UpdateFleetCapacityRequest == false)
            return false;
        UpdateFleetCapacityRequest other = (UpdateFleetCapacityRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getDesiredInstances() == null ^ this.getDesiredInstances() == null)
            return false;
        if (other.getDesiredInstances() != null && other.getDesiredInstances().equals(this.getDesiredInstances()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null && other.getMaxSize().equals(this.getMaxSize()) == false)
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
        hashCode = prime * hashCode + ((getDesiredInstances() == null) ? 0 : getDesiredInstances().hashCode());
        hashCode = prime * hashCode + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetCapacityRequest clone() {
        return (UpdateFleetCapacityRequest) super.clone();
    }

}
