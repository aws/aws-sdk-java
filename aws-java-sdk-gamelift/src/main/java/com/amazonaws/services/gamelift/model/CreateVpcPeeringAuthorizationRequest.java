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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcPeeringAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your
     * Account ID in the AWS Management Console under account settings.
     * </p>
     */
    private String gameLiftAwsAccountId;
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
     * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your
     * Account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @param gameLiftAwsAccountId
     *        Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your
     *        Account ID in the AWS Management Console under account settings.
     */

    public void setGameLiftAwsAccountId(String gameLiftAwsAccountId) {
        this.gameLiftAwsAccountId = gameLiftAwsAccountId;
    }

    /**
     * <p>
     * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your
     * Account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @return Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find
     *         your Account ID in the AWS Management Console under account settings.
     */

    public String getGameLiftAwsAccountId() {
        return this.gameLiftAwsAccountId;
    }

    /**
     * <p>
     * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your
     * Account ID in the AWS Management Console under account settings.
     * </p>
     * 
     * @param gameLiftAwsAccountId
     *        Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your
     *        Account ID in the AWS Management Console under account settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringAuthorizationRequest withGameLiftAwsAccountId(String gameLiftAwsAccountId) {
        setGameLiftAwsAccountId(gameLiftAwsAccountId);
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

    public CreateVpcPeeringAuthorizationRequest withPeerVpcId(String peerVpcId) {
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
        if (getGameLiftAwsAccountId() != null)
            sb.append("GameLiftAwsAccountId: ").append(getGameLiftAwsAccountId()).append(",");
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

        if (obj instanceof CreateVpcPeeringAuthorizationRequest == false)
            return false;
        CreateVpcPeeringAuthorizationRequest other = (CreateVpcPeeringAuthorizationRequest) obj;
        if (other.getGameLiftAwsAccountId() == null ^ this.getGameLiftAwsAccountId() == null)
            return false;
        if (other.getGameLiftAwsAccountId() != null && other.getGameLiftAwsAccountId().equals(this.getGameLiftAwsAccountId()) == false)
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

        hashCode = prime * hashCode + ((getGameLiftAwsAccountId() == null) ? 0 : getGameLiftAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcPeeringAuthorizationRequest clone() {
        return (CreateVpcPeeringAuthorizationRequest) super.clone();
    }

}
