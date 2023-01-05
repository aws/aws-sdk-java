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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAuthToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComputeAuthTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
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
     * The name of the compute resource you are requesting the authorization token for.
     * </p>
     */
    private String computeName;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * </p>
     */
    private String computeArn;
    /**
     * <p>
     * The authorization token that your game server uses to authenticate with GameLift.
     * </p>
     */
    private String authToken;
    /**
     * <p>
     * The amount of time until the authorization token is no longer valid. To continue using the compute resource for
     * game server hosting, renew the authorization token by using this operation again.
     * </p>
     */
    private java.util.Date expirationTimestamp;

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute is registered to.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     * 
     * @return A unique identifier for the fleet that the compute is registered to.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute is registered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAuthTokenResult withFleetId(String fleetId) {
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

    public GetComputeAuthTokenResult withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The name of the compute resource you are requesting the authorization token for.
     * </p>
     * 
     * @param computeName
     *        The name of the compute resource you are requesting the authorization token for.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * The name of the compute resource you are requesting the authorization token for.
     * </p>
     * 
     * @return The name of the compute resource you are requesting the authorization token for.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * The name of the compute resource you are requesting the authorization token for.
     * </p>
     * 
     * @param computeName
     *        The name of the compute resource you are requesting the authorization token for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAuthTokenResult withComputeName(String computeName) {
        setComputeName(computeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * </p>
     * 
     * @param computeArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     */

    public void setComputeArn(String computeArn) {
        this.computeArn = computeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     */

    public String getComputeArn() {
        return this.computeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * </p>
     * 
     * @param computeArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift compute resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::compute/compute-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAuthTokenResult withComputeArn(String computeArn) {
        setComputeArn(computeArn);
        return this;
    }

    /**
     * <p>
     * The authorization token that your game server uses to authenticate with GameLift.
     * </p>
     * 
     * @param authToken
     *        The authorization token that your game server uses to authenticate with GameLift.
     */

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * <p>
     * The authorization token that your game server uses to authenticate with GameLift.
     * </p>
     * 
     * @return The authorization token that your game server uses to authenticate with GameLift.
     */

    public String getAuthToken() {
        return this.authToken;
    }

    /**
     * <p>
     * The authorization token that your game server uses to authenticate with GameLift.
     * </p>
     * 
     * @param authToken
     *        The authorization token that your game server uses to authenticate with GameLift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAuthTokenResult withAuthToken(String authToken) {
        setAuthToken(authToken);
        return this;
    }

    /**
     * <p>
     * The amount of time until the authorization token is no longer valid. To continue using the compute resource for
     * game server hosting, renew the authorization token by using this operation again.
     * </p>
     * 
     * @param expirationTimestamp
     *        The amount of time until the authorization token is no longer valid. To continue using the compute
     *        resource for game server hosting, renew the authorization token by using this operation again.
     */

    public void setExpirationTimestamp(java.util.Date expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
    }

    /**
     * <p>
     * The amount of time until the authorization token is no longer valid. To continue using the compute resource for
     * game server hosting, renew the authorization token by using this operation again.
     * </p>
     * 
     * @return The amount of time until the authorization token is no longer valid. To continue using the compute
     *         resource for game server hosting, renew the authorization token by using this operation again.
     */

    public java.util.Date getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    /**
     * <p>
     * The amount of time until the authorization token is no longer valid. To continue using the compute resource for
     * game server hosting, renew the authorization token by using this operation again.
     * </p>
     * 
     * @param expirationTimestamp
     *        The amount of time until the authorization token is no longer valid. To continue using the compute
     *        resource for game server hosting, renew the authorization token by using this operation again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComputeAuthTokenResult withExpirationTimestamp(java.util.Date expirationTimestamp) {
        setExpirationTimestamp(expirationTimestamp);
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
        if (getAuthToken() != null)
            sb.append("AuthToken: ").append(getAuthToken()).append(",");
        if (getExpirationTimestamp() != null)
            sb.append("ExpirationTimestamp: ").append(getExpirationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComputeAuthTokenResult == false)
            return false;
        GetComputeAuthTokenResult other = (GetComputeAuthTokenResult) obj;
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
        if (other.getAuthToken() == null ^ this.getAuthToken() == null)
            return false;
        if (other.getAuthToken() != null && other.getAuthToken().equals(this.getAuthToken()) == false)
            return false;
        if (other.getExpirationTimestamp() == null ^ this.getExpirationTimestamp() == null)
            return false;
        if (other.getExpirationTimestamp() != null && other.getExpirationTimestamp().equals(this.getExpirationTimestamp()) == false)
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
        hashCode = prime * hashCode + ((getAuthToken() == null) ? 0 : getAuthToken().hashCode());
        hashCode = prime * hashCode + ((getExpirationTimestamp() == null) ? 0 : getExpirationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetComputeAuthTokenResult clone() {
        try {
            return (GetComputeAuthTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
