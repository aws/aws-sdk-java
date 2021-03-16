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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetPortSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet that was requested.
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
     * The port settings for the requested fleet ID.
     * </p>
     */
    private java.util.List<IpPermission> inboundPermissions;
    /**
     * <p>
     * The current status of updates to the fleet's port settings in the requested fleet location. A status of
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet that was requested.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that was requested.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that was requested.
     * </p>
     * 
     * @return A unique identifier for the fleet that was requested.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that was requested.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetPortSettingsResult withFleetId(String fleetId) {
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

    public DescribeFleetPortSettingsResult withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The port settings for the requested fleet ID.
     * </p>
     * 
     * @return The port settings for the requested fleet ID.
     */

    public java.util.List<IpPermission> getInboundPermissions() {
        return inboundPermissions;
    }

    /**
     * <p>
     * The port settings for the requested fleet ID.
     * </p>
     * 
     * @param inboundPermissions
     *        The port settings for the requested fleet ID.
     */

    public void setInboundPermissions(java.util.Collection<IpPermission> inboundPermissions) {
        if (inboundPermissions == null) {
            this.inboundPermissions = null;
            return;
        }

        this.inboundPermissions = new java.util.ArrayList<IpPermission>(inboundPermissions);
    }

    /**
     * <p>
     * The port settings for the requested fleet ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInboundPermissions(java.util.Collection)} or {@link #withInboundPermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inboundPermissions
     *        The port settings for the requested fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetPortSettingsResult withInboundPermissions(IpPermission... inboundPermissions) {
        if (this.inboundPermissions == null) {
            setInboundPermissions(new java.util.ArrayList<IpPermission>(inboundPermissions.length));
        }
        for (IpPermission ele : inboundPermissions) {
            this.inboundPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The port settings for the requested fleet ID.
     * </p>
     * 
     * @param inboundPermissions
     *        The port settings for the requested fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetPortSettingsResult withInboundPermissions(java.util.Collection<IpPermission> inboundPermissions) {
        setInboundPermissions(inboundPermissions);
        return this;
    }

    /**
     * <p>
     * The current status of updates to the fleet's port settings in the requested fleet location. A status of
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of updates to the fleet's port settings in the requested fleet location. A status of
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @see LocationUpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The current status of updates to the fleet's port settings in the requested fleet location. A status of
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @return The current status of updates to the fleet's port settings in the requested fleet location. A status of
     *         <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *         completed for the location.
     * @see LocationUpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The current status of updates to the fleet's port settings in the requested fleet location. A status of
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of updates to the fleet's port settings in the requested fleet location. A status of
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationUpdateStatus
     */

    public DescribeFleetPortSettingsResult withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The current status of updates to the fleet's port settings in the requested fleet location. A status of
     * <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The current status of updates to the fleet's port settings in the requested fleet location. A status of
     *        <code>PENDING_UPDATE</code> indicates that an update was requested for the fleet but has not yet been
     *        completed for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationUpdateStatus
     */

    public DescribeFleetPortSettingsResult withUpdateStatus(LocationUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @return The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The requested fleet location, expressed as an AWS Region code, such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetPortSettingsResult withLocation(String location) {
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getInboundPermissions() != null)
            sb.append("InboundPermissions: ").append(getInboundPermissions()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
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

        if (obj instanceof DescribeFleetPortSettingsResult == false)
            return false;
        DescribeFleetPortSettingsResult other = (DescribeFleetPortSettingsResult) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getInboundPermissions() == null ^ this.getInboundPermissions() == null)
            return false;
        if (other.getInboundPermissions() != null && other.getInboundPermissions().equals(this.getInboundPermissions()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
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
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getInboundPermissions() == null) ? 0 : getInboundPermissions().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetPortSettingsResult clone() {
        try {
            return (DescribeFleetPortSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
