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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcPeeringAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Details on the requested VPC peering authorization, including expiration.
     * </p>
     */
    private VpcPeeringAuthorization vpcPeeringAuthorization;

    /**
     * <p>
     * Details on the requested VPC peering authorization, including expiration.
     * </p>
     * 
     * @param vpcPeeringAuthorization
     *        Details on the requested VPC peering authorization, including expiration.
     */

    public void setVpcPeeringAuthorization(VpcPeeringAuthorization vpcPeeringAuthorization) {
        this.vpcPeeringAuthorization = vpcPeeringAuthorization;
    }

    /**
     * <p>
     * Details on the requested VPC peering authorization, including expiration.
     * </p>
     * 
     * @return Details on the requested VPC peering authorization, including expiration.
     */

    public VpcPeeringAuthorization getVpcPeeringAuthorization() {
        return this.vpcPeeringAuthorization;
    }

    /**
     * <p>
     * Details on the requested VPC peering authorization, including expiration.
     * </p>
     * 
     * @param vpcPeeringAuthorization
     *        Details on the requested VPC peering authorization, including expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcPeeringAuthorizationResult withVpcPeeringAuthorization(VpcPeeringAuthorization vpcPeeringAuthorization) {
        setVpcPeeringAuthorization(vpcPeeringAuthorization);
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
        if (getVpcPeeringAuthorization() != null)
            sb.append("VpcPeeringAuthorization: ").append(getVpcPeeringAuthorization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcPeeringAuthorizationResult == false)
            return false;
        CreateVpcPeeringAuthorizationResult other = (CreateVpcPeeringAuthorizationResult) obj;
        if (other.getVpcPeeringAuthorization() == null ^ this.getVpcPeeringAuthorization() == null)
            return false;
        if (other.getVpcPeeringAuthorization() != null && other.getVpcPeeringAuthorization().equals(this.getVpcPeeringAuthorization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcPeeringAuthorization() == null) ? 0 : getVpcPeeringAuthorization().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcPeeringAuthorizationResult clone() {
        try {
            return (CreateVpcPeeringAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
