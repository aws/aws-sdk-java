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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/GetServiceNetworkVpcAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceNetworkVpcAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     */
    private String serviceNetworkVpcAssociationIdentifier;

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param serviceNetworkVpcAssociationIdentifier
     *        The ID or Amazon Resource Name (ARN) of the association.
     */

    public void setServiceNetworkVpcAssociationIdentifier(String serviceNetworkVpcAssociationIdentifier) {
        this.serviceNetworkVpcAssociationIdentifier = serviceNetworkVpcAssociationIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the association.
     */

    public String getServiceNetworkVpcAssociationIdentifier() {
        return this.serviceNetworkVpcAssociationIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the association.
     * </p>
     * 
     * @param serviceNetworkVpcAssociationIdentifier
     *        The ID or Amazon Resource Name (ARN) of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceNetworkVpcAssociationRequest withServiceNetworkVpcAssociationIdentifier(String serviceNetworkVpcAssociationIdentifier) {
        setServiceNetworkVpcAssociationIdentifier(serviceNetworkVpcAssociationIdentifier);
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
        if (getServiceNetworkVpcAssociationIdentifier() != null)
            sb.append("ServiceNetworkVpcAssociationIdentifier: ").append(getServiceNetworkVpcAssociationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceNetworkVpcAssociationRequest == false)
            return false;
        GetServiceNetworkVpcAssociationRequest other = (GetServiceNetworkVpcAssociationRequest) obj;
        if (other.getServiceNetworkVpcAssociationIdentifier() == null ^ this.getServiceNetworkVpcAssociationIdentifier() == null)
            return false;
        if (other.getServiceNetworkVpcAssociationIdentifier() != null
                && other.getServiceNetworkVpcAssociationIdentifier().equals(this.getServiceNetworkVpcAssociationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNetworkVpcAssociationIdentifier() == null) ? 0 : getServiceNetworkVpcAssociationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceNetworkVpcAssociationRequest clone() {
        return (GetServiceNetworkVpcAssociationRequest) super.clone();
    }

}
