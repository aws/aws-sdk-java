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

/**
 * <p>
 * Represents the returned data in response to a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleetLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet that location attributes are being deleted for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * </p>
     */
    private java.util.List<LocationState> locationStates;

    /**
     * <p>
     * A unique identifier for the fleet that location attributes are being deleted for.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that location attributes are being deleted for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that location attributes are being deleted for.
     * </p>
     * 
     * @return A unique identifier for the fleet that location attributes are being deleted for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that location attributes are being deleted for.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that location attributes are being deleted for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsResult withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsResult withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * </p>
     * 
     * @return The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     */

    public java.util.List<LocationState> getLocationStates() {
        return locationStates;
    }

    /**
     * <p>
     * The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * </p>
     * 
     * @param locationStates
     *        The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     */

    public void setLocationStates(java.util.Collection<LocationState> locationStates) {
        if (locationStates == null) {
            this.locationStates = null;
            return;
        }

        this.locationStates = new java.util.ArrayList<LocationState>(locationStates);
    }

    /**
     * <p>
     * The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocationStates(java.util.Collection)} or {@link #withLocationStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param locationStates
     *        The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsResult withLocationStates(LocationState... locationStates) {
        if (this.locationStates == null) {
            setLocationStates(new java.util.ArrayList<LocationState>(locationStates.length));
        }
        for (LocationState ele : locationStates) {
            this.locationStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * </p>
     * 
     * @param locationStates
     *        The remote locations that are being deleted, with each location status set to <code>DELETING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetLocationsResult withLocationStates(java.util.Collection<LocationState> locationStates) {
        setLocationStates(locationStates);
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getLocationStates() != null)
            sb.append("LocationStates: ").append(getLocationStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetLocationsResult == false)
            return false;
        DeleteFleetLocationsResult other = (DeleteFleetLocationsResult) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getLocationStates() == null ^ this.getLocationStates() == null)
            return false;
        if (other.getLocationStates() != null && other.getLocationStates().equals(this.getLocationStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getLocationStates() == null) ? 0 : getLocationStates().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetLocationsResult clone() {
        try {
            return (DeleteFleetLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
