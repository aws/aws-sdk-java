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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcPeeringConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can
     * find your Account ID in the AWS Management Console under account settings.
     * </p>
     */
    private String peerVpcAwsAccountId;
    /**
     * <p>
     * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same region where your fleet is deployed. Look up a VPC ID using the <a
     * href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more about VPC
     * peering in <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     * Amazon GameLift Fleets</a>.
     * </p>
     */
    private String peerVpcId;

    /**
     * <p>
     * Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     * </p>
     * 
     * @return Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can
     * find your Account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @param peerVpcAwsAccountId
     *        Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with.
     *        You can find your Account ID in the AWS Management Console under account settings.
     */

    public void setPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
    }

    /**
     * <p>
     * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can
     * find your Account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @return Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with.
     *         You can find your Account ID in the AWS Management Console under account settings.
     */

    public String getPeerVpcAwsAccountId() {
        return this.peerVpcAwsAccountId;
    }

    /**
     * <p>
     * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can
     * find your Account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @param peerVpcAwsAccountId
     *        Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with.
     *        You can find your Account ID in the AWS Management Console under account settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        setPeerVpcAwsAccountId(peerVpcAwsAccountId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same region where your fleet is deployed. Look up a VPC ID using the <a
     * href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more about VPC
     * peering in <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     * Amazon GameLift Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *        in the same region where your fleet is deployed. Look up a VPC ID using the <a
     *        href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *        about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     *        GameLift Fleets</a>.
     */

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same region where your fleet is deployed. Look up a VPC ID using the <a
     * href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more about VPC
     * peering in <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     * Amazon GameLift Fleets</a>.
     * </p>
     * 
     * @return Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *         in the same region where your fleet is deployed. Look up a VPC ID using the <a
     *         href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *         about VPC peering in <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     *         Amazon GameLift Fleets</a>.
     */

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * <p>
     * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same region where your fleet is deployed. Look up a VPC ID using the <a
     * href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more about VPC
     * peering in <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     * Amazon GameLift Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *        in the same region where your fleet is deployed. Look up a VPC ID using the <a
     *        href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the AWS Management Console. Learn more
     *        about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     *        GameLift Fleets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringConnectionRequest withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
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
        if (getPeerVpcAwsAccountId() != null)
            sb.append("PeerVpcAwsAccountId: ").append(getPeerVpcAwsAccountId()).append(",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: ").append(getPeerVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcPeeringConnectionRequest == false)
            return false;
        CreateVpcPeeringConnectionRequest other = (CreateVpcPeeringConnectionRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getPeerVpcAwsAccountId() == null ^ this.getPeerVpcAwsAccountId() == null)
            return false;
        if (other.getPeerVpcAwsAccountId() != null && other.getPeerVpcAwsAccountId().equals(this.getPeerVpcAwsAccountId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcAwsAccountId() == null) ? 0 : getPeerVpcAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcPeeringConnectionRequest clone() {
        return (CreateVpcPeeringConnectionRequest) super.clone();
    }

}
