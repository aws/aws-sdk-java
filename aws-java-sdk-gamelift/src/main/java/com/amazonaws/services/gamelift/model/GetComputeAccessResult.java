/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComputeAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the fleet that holds the compute resource to be accessed.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * .
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The identifier of the compute resource to be accessed. This value might be either a compute name or an instance
     * ID.
     * </p>
     */
    private String computeName;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String computeArn;
    /**
     * <p>
     * A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with Amazon
     * EC2 Systems Manager (SSM).
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * (For container fleets only) The instance ID where the compute resource is running.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The ID of the fleet that holds the compute resource to be accessed.
     * </p>
     * 
     * @param fleetId
     *        The ID of the fleet that holds the compute resource to be accessed.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the fleet that holds the compute resource to be accessed.
     * </p>
     * 
     * @return The ID of the fleet that holds the compute resource to be accessed.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the fleet that holds the compute resource to be accessed.
     * </p>
     * 
     * @param fleetId
     *        The ID of the fleet that holds the compute resource to be accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAccessResult withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * .
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * .
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        Amazon GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAccessResult withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the compute resource to be accessed. This value might be either a compute name or an instance
     * ID.
     * </p>
     * 
     * @param computeName
     *        The identifier of the compute resource to be accessed. This value might be either a compute name or an
     *        instance ID.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * The identifier of the compute resource to be accessed. This value might be either a compute name or an instance
     * ID.
     * </p>
     * 
     * @return The identifier of the compute resource to be accessed. This value might be either a compute name or an
     *         instance ID.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * The identifier of the compute resource to be accessed. This value might be either a compute name or an instance
     * ID.
     * </p>
     * 
     * @param computeName
     *        The identifier of the compute resource to be accessed. This value might be either a compute name or an
     *        instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAccessResult withComputeName(String computeName) {
        setComputeName(computeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param computeArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to an
     *        Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setComputeArn(String computeArn) {
        this.computeArn = computeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to an
     *         Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format
     *         is <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getComputeArn() {
        return this.computeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to an Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is
     * <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param computeArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to an
     *        Amazon GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAccessResult withComputeArn(String computeArn) {
        setComputeArn(computeArn);
        return this;
    }

    /**
     * <p>
     * A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with Amazon
     * EC2 Systems Manager (SSM).
     * </p>
     * 
     * @param credentials
     *        A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with
     *        Amazon EC2 Systems Manager (SSM).
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with Amazon
     * EC2 Systems Manager (SSM).
     * </p>
     * 
     * @return A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with
     *         Amazon EC2 Systems Manager (SSM).
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with Amazon
     * EC2 Systems Manager (SSM).
     * </p>
     * 
     * @param credentials
     *        A set of temporary Amazon Web Services credentials for use when connecting to the compute resource with
     *        Amazon EC2 Systems Manager (SSM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAccessResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * (For container fleets only) The instance ID where the compute resource is running.
     * </p>
     * 
     * @param target
     *        (For container fleets only) The instance ID where the compute resource is running.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * (For container fleets only) The instance ID where the compute resource is running.
     * </p>
     * 
     * @return (For container fleets only) The instance ID where the compute resource is running.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * (For container fleets only) The instance ID where the compute resource is running.
     * </p>
     * 
     * @param target
     *        (For container fleets only) The instance ID where the compute resource is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAccessResult withTarget(String target) {
        setTarget(target);
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
        if (getComputeName() != null)
            sb.append("ComputeName: ").append(getComputeName()).append(",");
        if (getComputeArn() != null)
            sb.append("ComputeArn: ").append(getComputeArn()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append("***Sensitive Data Redacted***").append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComputeAccessResult == false)
            return false;
        GetComputeAccessResult other = (GetComputeAccessResult) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getComputeName() == null ^ this.getComputeName() == null)
            return false;
        if (other.getComputeName() != null && other.getComputeName().equals(this.getComputeName()) == false)
            return false;
        if (other.getComputeArn() == null ^ this.getComputeArn() == null)
            return false;
        if (other.getComputeArn() != null && other.getComputeArn().equals(this.getComputeArn()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getComputeName() == null) ? 0 : getComputeName().hashCode());
        hashCode = prime * hashCode + ((getComputeArn() == null) ? 0 : getComputeArn().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public GetComputeAccessResult clone() {
        try {
            return (GetComputeAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
